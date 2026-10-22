package p151h0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.os.Build;
import android.util.Property;

/* renamed from: h0.g */
/* loaded from: classes.dex */
abstract class AbstractC4471g {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ObjectAnimator m18716a(Object obj, Property property, Path path) {
        ObjectAnimator ofObject;
        if (Build.VERSION.SDK_INT >= 21) {
            ofObject = ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
            return ofObject;
        }
        return ObjectAnimator.ofFloat(obj, new C4475i(property, path), 0.0f, 1.0f);
    }
}
