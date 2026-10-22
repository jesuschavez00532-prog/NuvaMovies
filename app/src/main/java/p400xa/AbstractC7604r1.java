package p400xa;

import android.text.TextUtils;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import ne.AbstractC5868k;
import ne.AbstractC5882y;

/* renamed from: xa.r1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7604r1 {
    /* renamed from: a */
    public static final void m29250a(ViewPager2 viewPager2) {
        AbstractC5868k.m23674f(viewPager2, "<this>");
        Field declaredField = viewPager2.getClass().getDeclaredField("mPageChangeEventDispatcher");
        AbstractC5868k.m23673e(declaredField, "this::class.java.getDecl…geChangeEventDispatcher\")");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(viewPager2);
        Field declaredField2 = obj.getClass().getDeclaredField("mCallbacks");
        AbstractC5868k.m23673e(declaredField2, "mPageChangeEventDispatch…claredField(\"mCallbacks\")");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(obj);
        if (!(obj2 instanceof ArrayList)) {
            return;
        }
        ArrayList arrayList = (ArrayList) obj2;
        if (arrayList.size() < 1) {
            return;
        }
        Object obj3 = arrayList.get(1);
        if (TextUtils.equals(obj3.getClass().getName(), "androidx.viewpager2.widget.ViewPager2$3")) {
            AbstractC5882y.m23701a((Collection) obj2).remove(obj3);
        }
    }
}
