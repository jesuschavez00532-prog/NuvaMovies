package p151h0;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.os.Build;
import android.util.Property;

/* renamed from: h0.k */
/* loaded from: classes.dex */
abstract class AbstractC4479k {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static PropertyValuesHolder m18726a(Property property, Path path) {
        PropertyValuesHolder ofObject;
        if (Build.VERSION.SDK_INT >= 21) {
            ofObject = PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
            return ofObject;
        }
        return PropertyValuesHolder.ofFloat(new C4475i(property, path), 0.0f, 1.0f);
    }
}
