package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.lzy.okgo.model.Progress;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p254o.AbstractC5896k;
import p276p.AbstractC6135h;

/* renamed from: androidx.vectordrawable.graphics.drawable.j */
/* loaded from: classes.dex */
public abstract class AbstractC0848j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.j$a */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator {

        /* renamed from: a */
        private AbstractC6135h.b[] f3562a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6135h.b[] evaluate(float f10, AbstractC6135h.b[] bVarArr, AbstractC6135h.b[] bVarArr2) {
            if (AbstractC6135h.m24439b(bVarArr, bVarArr2)) {
                if (!AbstractC6135h.m24439b(this.f3562a, bVarArr)) {
                    this.f3562a = AbstractC6135h.m24443f(bVarArr);
                }
                for (int i10 = 0; i10 < bVarArr.length; i10++) {
                    this.f3562a[i10].m24452d(bVarArr[i10], bVarArr2[i10], f10);
                }
                return this.f3562a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m4328a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) {
        return m4329b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator m4329b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AbstractC0848j.m4329b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m4330c(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f10);
        }
        return Keyframe.ofObject(f10);
    }

    /* renamed from: d */
    private static void m4331d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m4332e(TypedArray typedArray, int i10, int i11, int i12, String str) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        C0849k c0849k;
        int i15;
        int i16;
        int i17;
        float f10;
        PropertyValuesHolder ofFloat;
        float f11;
        float f12;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if (i10 == 4) {
            if ((z10 && m4335h(i13)) || (z11 && m4335h(i14))) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            AbstractC6135h.b[] m24441d = AbstractC6135h.m24441d(string);
            AbstractC6135h.b[] m24441d2 = AbstractC6135h.m24441d(string2);
            if (m24441d == null && m24441d2 == null) {
                return null;
            }
            if (m24441d != null) {
                a aVar = new a();
                if (m24441d2 != null) {
                    if (AbstractC6135h.m24439b(m24441d, m24441d2)) {
                        ofObject = PropertyValuesHolder.ofObject(str, aVar, m24441d, m24441d2);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, m24441d);
                }
                return ofObject;
            }
            if (m24441d2 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new a(), m24441d2);
        }
        if (i10 == 3) {
            c0849k = C0849k.m4348a();
        } else {
            c0849k = null;
        }
        if (z12) {
            if (z10) {
                if (i13 == 5) {
                    f11 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i11, 0.0f);
                }
                if (z11) {
                    if (i14 == 5) {
                        f12 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i14 == 5) {
                    f10 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f10);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i13 == 5) {
                i16 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (m4335h(i13)) {
                i16 = typedArray.getColor(i11, 0);
            } else {
                i16 = typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    i17 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (m4335h(i14)) {
                    i17 = typedArray.getColor(i12, 0);
                } else {
                    i17 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16, i17);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16);
            }
        } else if (z11) {
            if (i14 == 5) {
                i15 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (m4335h(i14)) {
                i15 = typedArray.getColor(i12, 0);
            } else {
                i15 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
        }
        if (propertyValuesHolder != null && c0849k != null) {
            propertyValuesHolder.setEvaluator(c0849k);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    /* renamed from: f */
    private static int m4333f(TypedArray typedArray, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z11 = true;
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = peekValue.type;
        } else {
            i12 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 == null) {
            z11 = false;
        }
        if (z11) {
            i13 = peekValue2.type;
        } else {
            i13 = 0;
        }
        if ((!z10 || !m4335h(i12)) && (!z11 || !m4335h(i13))) {
            return 0;
        }
        return 3;
    }

    /* renamed from: g */
    private static int m4334g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        boolean z10;
        TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3546j);
        int i10 = 0;
        TypedValue m23824l = AbstractC5896k.m23824l(m23823k, xmlPullParser, "value", 0);
        if (m23824l != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && m4335h(m23824l.type)) {
            i10 = 3;
        }
        m23823k.recycle();
        return i10;
    }

    /* renamed from: h */
    private static boolean m4335h(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    /* renamed from: i */
    public static Animator m4336i(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i10);
        }
        return m4337j(context, context.getResources(), context.getTheme(), i10);
    }

    /* renamed from: j */
    public static Animator m4337j(Context context, Resources resources, Resources.Theme theme, int i10) {
        return m4338k(context, resources, theme, i10, 1.0f);
    }

    /* renamed from: k */
    public static Animator m4338k(Context context, Resources resources, Resources.Theme theme, int i10, float f10) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i10);
                    return m4328a(context, resources, theme, xmlResourceParser, f10);
                } catch (XmlPullParserException e10) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e10);
                    throw notFoundException;
                }
            } catch (IOException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m4339l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) {
        TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3543g);
        TypedArray m23823k2 = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3547k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m4344q(valueAnimator, m23823k, m23823k2, f10, xmlPullParser);
        int m23820h = AbstractC5896k.m23820h(m23823k, xmlPullParser, "interpolator", 0, 0);
        if (m23820h > 0) {
            valueAnimator.setInterpolator(AbstractC0847i.m4327b(context, m23820h));
        }
        m23823k.recycle();
        if (m23823k2 != null) {
            m23823k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m4340m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) {
        boolean z10;
        Keyframe ofInt;
        TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3546j);
        float m23818f = AbstractC5896k.m23818f(m23823k, xmlPullParser, Progress.FRACTION, 3, -1.0f);
        TypedValue m23824l = AbstractC5896k.m23824l(m23823k, xmlPullParser, "value", 0);
        if (m23824l != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 4) {
            if (z10 && m4335h(m23824l.type)) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (z10) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(m23818f, AbstractC5896k.m23819g(m23823k, xmlPullParser, "value", 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(m23818f, AbstractC5896k.m23818f(m23823k, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i10 == 0) {
            ofInt = Keyframe.ofFloat(m23818f);
        } else {
            ofInt = Keyframe.ofInt(m23818f);
        }
        int m23820h = AbstractC5896k.m23820h(m23823k, xmlPullParser, "interpolator", 1, 0);
        if (m23820h > 0) {
            ofInt.setInterpolator(AbstractC0847i.m4327b(context, m23820h));
        }
        m23823k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m4341n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m4339l(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m4342o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = m4334g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m4340m = m4340m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i10, xmlPullParser);
                if (m4340m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m4340m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m4330c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m4330c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i11 = 0; i11 < size; i11++) {
                Keyframe keyframe3 = keyframeArr[i11];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i11 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i12 = size - 1;
                        if (i11 == i12) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i13 = i11;
                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                i13 = i14;
                            }
                            m4331d(keyframeArr, keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction(), i11, i13);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i10 == 3) {
                propertyValuesHolder.setEvaluator(C0849k.m4348a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m4343p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i10;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3545i);
                    String m23821i = AbstractC5896k.m23821i(m23823k, xmlPullParser, "propertyName", 3);
                    int m23819g = AbstractC5896k.m23819g(m23823k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m4342o = m4342o(context, resources, theme, xmlPullParser, m23821i, m23819g);
                    if (m4342o == null) {
                        m4342o = m4332e(m23823k, m23819g, 0, 1, m23821i);
                    }
                    if (m4342o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m4342o);
                    }
                    m23823k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i10 = 0; i10 < size; i10++) {
                propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m4344q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long m23819g = AbstractC5896k.m23819g(typedArray, xmlPullParser, "duration", 1, 300);
        long m23819g2 = AbstractC5896k.m23819g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m23819g3 = AbstractC5896k.m23819g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (AbstractC5896k.m23822j(xmlPullParser, "valueFrom") && AbstractC5896k.m23822j(xmlPullParser, "valueTo")) {
            if (m23819g3 == 4) {
                m23819g3 = m4333f(typedArray, 5, 6);
            }
            PropertyValuesHolder m4332e = m4332e(typedArray, m23819g3, 5, 6, "");
            if (m4332e != null) {
                valueAnimator.setValues(m4332e);
            }
        }
        valueAnimator.setDuration(m23819g);
        valueAnimator.setStartDelay(m23819g2);
        valueAnimator.setRepeatCount(AbstractC5896k.m23819g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(AbstractC5896k.m23819g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m4345r(valueAnimator, typedArray2, m23819g3, f10, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m4345r(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m23821i = AbstractC5896k.m23821i(typedArray, xmlPullParser, "pathData", 1);
        if (m23821i != null) {
            String m23821i2 = AbstractC5896k.m23821i(typedArray, xmlPullParser, "propertyXName", 2);
            String m23821i3 = AbstractC5896k.m23821i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i10 != 2) {
            }
            if (m23821i2 == null && m23821i3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m4346s(AbstractC6135h.m24442e(m23821i), objectAnimator, f10 * 0.5f, m23821i2, m23821i3);
            return;
        }
        objectAnimator.setPropertyName(AbstractC5896k.m23821i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m4346s(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f12 = 0.0f;
        do {
            f12 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f12));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f12 / f10)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f13 = f12 / (min - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i10 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f13;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }
}
