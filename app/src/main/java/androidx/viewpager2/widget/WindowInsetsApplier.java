package androidx.viewpager2.widget;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0609o1;
import androidx.core.view.InterfaceC0588j0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class WindowInsetsApplier implements InterfaceC0588j0 {
    private WindowInsetsApplier() {
    }

    private C0609o1 consumeAllInsets(C0609o1 c0609o1) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0609o1 c0609o12 = C0609o1.f2360b;
            if (c0609o12.m2529t() != null) {
                return c0609o12;
            }
            return c0609o1.m2513c().m2512b();
        }
        return c0609o1;
    }

    public static boolean install(ViewPager2 viewPager2) {
        ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 30 && applicationInfo.targetSdkVersion >= 30) {
            return false;
        }
        AbstractC0616q0.m2658y0(viewPager2, new WindowInsetsApplier());
        return true;
    }

    @Override // androidx.core.view.InterfaceC0588j0
    public C0609o1 onApplyWindowInsets(View view, C0609o1 c0609o1) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        C0609o1 m2608Z = AbstractC0616q0.m2608Z(viewPager2, c0609o1);
        if (m2608Z.m2523n()) {
            return m2608Z;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            AbstractC0616q0.m2623h(recyclerView.getChildAt(i10), new C0609o1(m2608Z));
        }
        return consumeAllInsets(m2608Z);
    }
}
