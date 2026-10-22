package me.jessyan.autosize;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public class FragmentLifecycleCallbacksImplToAndroidx extends AbstractC0729o.l {
    private AutoAdaptStrategy mAutoAdaptStrategy;

    public FragmentLifecycleCallbacksImplToAndroidx(AutoAdaptStrategy autoAdaptStrategy) {
        this.mAutoAdaptStrategy = autoAdaptStrategy;
    }

    @Override // androidx.fragment.app.AbstractC0729o.l
    public void onFragmentCreated(AbstractC0729o abstractC0729o, Fragment fragment, Bundle bundle) {
        AutoAdaptStrategy autoAdaptStrategy = this.mAutoAdaptStrategy;
        if (autoAdaptStrategy != null) {
            autoAdaptStrategy.applyAdapt(fragment, fragment.m3075C6());
        }
    }

    public void setAutoAdaptStrategy(AutoAdaptStrategy autoAdaptStrategy) {
        this.mAutoAdaptStrategy = autoAdaptStrategy;
    }
}
