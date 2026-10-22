package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List<ExclusionStrategy> serializationStrategies = Collections.emptyList();
    private List<ExclusionStrategy> deserializationStrategies = Collections.emptyList();

    private boolean excludeClassChecks(Class<?> cls) {
        if (this.version != IGNORE_VERSIONS && !isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(cls)) || isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        return false;
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z10) {
        List<ExclusionStrategy> list;
        if (z10) {
            list = this.serializationStrategies;
        } else {
            list = this.deserializationStrategies;
        }
        Iterator<ExclusionStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls) && !isStatic(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    private boolean isInnerClass(Class<?> cls) {
        if (cls.isMemberClass() && !isStatic(cls)) {
            return true;
        }
        return false;
    }

    private boolean isStatic(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean isValidSince(Since since) {
        if (since != null && since.value() > this.version) {
            return false;
        }
        return true;
    }

    private boolean isValidUntil(Until until) {
        if (until != null && until.value() <= this.version) {
            return false;
        }
        return true;
    }

    private boolean isValidVersion(Since since, Until until) {
        if (isValidSince(since) && isValidUntil(until)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final boolean z10;
        final boolean z11;
        Class<? super T> rawType = typeToken.getRawType();
        boolean excludeClassChecks = excludeClassChecks(rawType);
        if (!excludeClassChecks && !excludeClassInStrategy(rawType, true)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!excludeClassChecks && !excludeClassInStrategy(rawType, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
            private TypeAdapter<T> delegate;

            private TypeAdapter<T> delegate() {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (typeAdapter == null) {
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.delegate = delegateAdapter;
                    return delegateAdapter;
                }
                return typeAdapter;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public T read2(JsonReader jsonReader) {
                if (z11) {
                    jsonReader.skipValue();
                    return null;
                }
                return delegate().read2(jsonReader);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t10) {
                if (z10) {
                    jsonWriter.nullValue();
                } else {
                    delegate().write(jsonWriter, t10);
                }
            }
        };
    }

    public Excluder disableInnerClassSerialization() {
        Excluder m30175clone = m30175clone();
        m30175clone.serializeInnerClasses = false;
        return m30175clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z10) {
        if (!excludeClassChecks(cls) && !excludeClassInStrategy(cls, z10)) {
            return false;
        }
        return true;
    }

    public boolean excludeField(Field field, boolean z10) {
        List<ExclusionStrategy> list;
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != IGNORE_VERSIONS && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z10 ? !expose.deserialize() : !expose.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrNonStaticLocal(field.getType())) {
            return true;
        }
        if (z10) {
            list = this.serializationStrategies;
        } else {
            list = this.deserializationStrategies;
        }
        if (!list.isEmpty()) {
            FieldAttributes fieldAttributes = new FieldAttributes(field);
            Iterator<ExclusionStrategy> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().shouldSkipField(fieldAttributes)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder m30175clone = m30175clone();
        m30175clone.requireExpose = true;
        return m30175clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z10, boolean z11) {
        Excluder m30175clone = m30175clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            m30175clone.serializationStrategies = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            m30175clone.deserializationStrategies = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return m30175clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder m30175clone = m30175clone();
        m30175clone.modifiers = 0;
        for (int i10 : iArr) {
            m30175clone.modifiers = i10 | m30175clone.modifiers;
        }
        return m30175clone;
    }

    public Excluder withVersion(double d10) {
        Excluder m30175clone = m30175clone();
        m30175clone.version = d10;
        return m30175clone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m30175clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
