package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.AbstractC0738x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p214l.C5304b;
import p214l.C5308f;
import p373w.AbstractC7342g;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC0789h implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    FragmentEventDispatcher mFragmentEventDispatcher;
    final AbstractC0729o mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final C5308f mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final C5308f mItemIdToViewHolder;
    final AbstractC0749c mLifecycle;
    private final C5308f mSavedStates;

    /* loaded from: classes.dex */
    private static abstract class DataSetChangeObserver extends RecyclerView.AbstractC0791j {
        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }
    }

    /* loaded from: classes.dex */
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class FragmentEventDispatcher {
        private List<FragmentTransactionCallback> mCallbacks = new CopyOnWriteArrayList();

        FragmentEventDispatcher() {
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchMaxLifecyclePreUpdated(Fragment fragment, AbstractC0749c.c cVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentMaxLifecyclePreUpdated(fragment, cVar));
            }
            return arrayList;
        }

        public void dispatchPostEvents(List<FragmentTransactionCallback.OnPostEventListener> list) {
            Iterator<FragmentTransactionCallback.OnPostEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPost();
            }
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreAdded(fragment));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreRemoved(fragment));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreSavedInstanceState(fragment));
            }
            return arrayList;
        }

        public void registerCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            this.mCallbacks.add(fragmentTransactionCallback);
        }

        public void unregisterCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            this.mCallbacks.remove(fragmentTransactionCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {
        private RecyclerView.AbstractC0791j mDataObserver;
        private InterfaceC0750d mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private ViewPager2 mViewPager;

        FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 inferViewPager(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void register(RecyclerView recyclerView) {
            this.mViewPager = inferViewPager(recyclerView);
            ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i10) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i10) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mPageChangeCallback = onPageChangeCallback;
            this.mViewPager.registerOnPageChangeCallback(onPageChangeCallback);
            DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AbstractC0791j
                public void onChanged() {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                }
            };
            this.mDataObserver = dataSetChangeObserver;
            FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            InterfaceC0750d interfaceC0750d = new InterfaceC0750d() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.InterfaceC0750d
                public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mLifecycleObserver = interfaceC0750d;
            FragmentStateAdapter.this.mLifecycle.mo3703a(interfaceC0750d);
        }

        void unregister(RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            FragmentStateAdapter.this.mLifecycle.mo3705c(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        void updateFragmentMaxLifecycle(boolean z10) {
            int currentItem;
            Fragment fragment;
            boolean z11;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.mViewPager.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.m21397j() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.mViewPager.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.mPrimaryItemId || z10) && (fragment = (Fragment) FragmentStateAdapter.this.mFragments.m21394g(itemId)) != null && fragment.m3190s7()) {
                this.mPrimaryItemId = itemId;
                AbstractC0738x m3534m = FragmentStateAdapter.this.mFragmentManager.m3534m();
                ArrayList arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i10 = 0; i10 < FragmentStateAdapter.this.mFragments.m21402p(); i10++) {
                    long m21398k = FragmentStateAdapter.this.mFragments.m21398k(i10);
                    Fragment fragment3 = (Fragment) FragmentStateAdapter.this.mFragments.m21403r(i10);
                    if (fragment3.m3190s7()) {
                        if (m21398k != this.mPrimaryItemId) {
                            AbstractC0749c.c cVar = AbstractC0749c.c.STARTED;
                            m3534m.mo3236s(fragment3, cVar);
                            arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(fragment3, cVar));
                        } else {
                            fragment2 = fragment3;
                        }
                        if (m21398k == this.mPrimaryItemId) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fragment3.m3144Z8(z11);
                    }
                }
                if (fragment2 != null) {
                    AbstractC0749c.c cVar2 = AbstractC0749c.c.RESUMED;
                    m3534m.mo3236s(fragment2, cVar2);
                    arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(fragment2, cVar2));
                }
                if (!m3534m.mo3234o()) {
                    m3534m.mo3229i();
                    Collections.reverse(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchPostEvents((List) it.next());
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class FragmentTransactionCallback {
        private static final OnPostEventListener NO_OP = new OnPostEventListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void onPost() {
            }
        };

        /* loaded from: classes.dex */
        public interface OnPostEventListener {
            void onPost();
        }

        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(Fragment fragment, AbstractC0749c.c cVar) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreAdded(Fragment fragment) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreRemoved(Fragment fragment) {
            return NO_OP;
        }

        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener onFragmentPreSavedInstanceState(Fragment fragment) {
            return NO_OP;
        }
    }

    public FragmentStateAdapter(AbstractActivityC0712e abstractActivityC0712e) {
        this(abstractActivityC0712e.m3294d4(), abstractActivityC0712e.mo953f6());
    }

    private static String createKey(String str, long j10) {
        return str + j10;
    }

    private void ensureFragment(int i10) {
        long itemId = getItemId(i10);
        if (!this.mFragments.m21393e(itemId)) {
            Fragment createFragment = createFragment(i10);
            createFragment.m3141Y8((Fragment.C0703h) this.mSavedStates.m21394g(itemId));
            this.mFragments.m21399l(itemId, createFragment);
        }
    }

    private boolean isFragmentViewBound(long j10) {
        View m3182n7;
        if (this.mItemIdToViewHolder.m21393e(j10)) {
            return true;
        }
        Fragment fragment = (Fragment) this.mFragments.m21394g(j10);
        if (fragment != null && (m3182n7 = fragment.m3182n7()) != null && m3182n7.getParent() != null) {
            return true;
        }
        return false;
    }

    private static boolean isValidKey(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    private Long itemForViewHolder(int i10) {
        Long l10 = null;
        for (int i11 = 0; i11 < this.mItemIdToViewHolder.m21402p(); i11++) {
            if (((Integer) this.mItemIdToViewHolder.m21403r(i11)).intValue() == i10) {
                if (l10 == null) {
                    l10 = Long.valueOf(this.mItemIdToViewHolder.m21398k(i11));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l10;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j10) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.mFragments.m21394g(j10);
        if (fragment == null) {
            return;
        }
        if (fragment.m3182n7() != null && (parent = fragment.m3182n7().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j10)) {
            this.mSavedStates.m21400m(j10);
        }
        if (!fragment.m3190s7()) {
            this.mFragments.m21400m(j10);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragment.m3190s7() && containsItem(j10)) {
            List<FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState = this.mFragmentEventDispatcher.dispatchPreSavedInstanceState(fragment);
            Fragment.C0703h m3530k1 = this.mFragmentManager.m3530k1(fragment);
            this.mFragmentEventDispatcher.dispatchPostEvents(dispatchPreSavedInstanceState);
            this.mSavedStates.m21399l(j10, m3530k1);
        }
        List<FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved = this.mFragmentEventDispatcher.dispatchPreRemoved(fragment);
        try {
            this.mFragmentManager.m3534m().mo3235p(fragment).mo3229i();
            this.mFragments.m21400m(j10);
        } finally {
            this.mFragmentEventDispatcher.dispatchPostEvents(dispatchPreRemoved);
        }
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.mo3703a(new InterfaceC0750d() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.lifecycle.InterfaceC0750d
            public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                if (bVar == AbstractC0749c.b.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    interfaceC0752f.mo953f6().mo3705c(this);
                }
            }
        });
        handler.postDelayed(runnable, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(final Fragment fragment, final FrameLayout frameLayout) {
        this.mFragmentManager.m3513b1(new AbstractC0729o.l() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
            @Override // androidx.fragment.app.AbstractC0729o.l
            public void onFragmentViewCreated(AbstractC0729o abstractC0729o, Fragment fragment2, View view, Bundle bundle) {
                if (fragment2 == fragment) {
                    abstractC0729o.m3547t1(this);
                    FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }, false);
    }

    void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean containsItem(long j10) {
        if (j10 >= 0 && j10 < getItemCount()) {
            return true;
        }
        return false;
    }

    public abstract Fragment createFragment(int i10);

    void gcFragments() {
        if (this.mHasStaleFragments && !shouldDelayFragmentTransactions()) {
            C5304b c5304b = new C5304b();
            for (int i10 = 0; i10 < this.mFragments.m21402p(); i10++) {
                long m21398k = this.mFragments.m21398k(i10);
                if (!containsItem(m21398k)) {
                    c5304b.add(Long.valueOf(m21398k));
                    this.mItemIdToViewHolder.m21400m(m21398k);
                }
            }
            if (!this.mIsInGracePeriod) {
                this.mHasStaleFragments = false;
                for (int i11 = 0; i11 < this.mFragments.m21402p(); i11++) {
                    long m21398k2 = this.mFragments.m21398k(i11);
                    if (!isFragmentViewBound(m21398k2)) {
                        c5304b.add(Long.valueOf(m21398k2));
                    }
                }
            }
            Iterator it = c5304b.iterator();
            while (it.hasNext()) {
                removeFragment(((Long) it.next()).longValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z10;
        if (this.mFragmentMaxLifecycleEnforcer == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC7342g.m28321a(z10);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public final boolean onFailedToRecycleView(FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    void placeFragmentInViewHolder(final FragmentViewHolder fragmentViewHolder) {
        Fragment fragment = (Fragment) this.mFragments.m21394g(fragmentViewHolder.getItemId());
        if (fragment != null) {
            FrameLayout container = fragmentViewHolder.getContainer();
            View m3182n7 = fragment.m3182n7();
            if (!fragment.m3190s7() && m3182n7 != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (fragment.m3190s7() && m3182n7 == null) {
                scheduleViewAttach(fragment, container);
                return;
            }
            if (fragment.m3190s7() && m3182n7.getParent() != null) {
                if (m3182n7.getParent() != container) {
                    addViewToContainer(m3182n7, container);
                    return;
                }
                return;
            }
            if (fragment.m3190s7()) {
                addViewToContainer(m3182n7, container);
                return;
            }
            if (!shouldDelayFragmentTransactions()) {
                scheduleViewAttach(fragment, container);
                List<FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded = this.mFragmentEventDispatcher.dispatchPreAdded(fragment);
                try {
                    fragment.m3144Z8(false);
                    this.mFragmentManager.m3534m().m3640d(fragment, "f" + fragmentViewHolder.getItemId()).mo3236s(fragment, AbstractC0749c.c.STARTED).mo3229i();
                    this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
                    return;
                } finally {
                    this.mFragmentEventDispatcher.dispatchPostEvents(dispatchPreAdded);
                }
            }
            if (this.mFragmentManager.m3477E0()) {
                return;
            }
            this.mLifecycle.mo3703a(new InterfaceC0750d() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.lifecycle.InterfaceC0750d
                public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                    if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    interfaceC0752f.mo953f6().mo3705c(this);
                    if (fragmentViewHolder.getContainer().isAttachedToWindow()) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void registerFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.registerCallback(fragmentTransactionCallback);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(Parcelable parcelable) {
        if (this.mSavedStates.m21397j() && this.mFragments.m21397j()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                    this.mFragments.m21399l(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.m3539o0(bundle, str));
                } else if (isValidKey(str, KEY_PREFIX_STATE)) {
                    long parseIdFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                    Fragment.C0703h c0703h = (Fragment.C0703h) bundle.getParcelable(str);
                    if (containsItem(parseIdFromKey)) {
                        this.mSavedStates.m21399l(parseIdFromKey, c0703h);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.mFragments.m21397j()) {
                this.mHasStaleFragments = true;
                this.mIsInGracePeriod = true;
                gcFragments();
                scheduleGracePeriodEnd();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.m21402p() + this.mSavedStates.m21402p());
        for (int i10 = 0; i10 < this.mFragments.m21402p(); i10++) {
            long m21398k = this.mFragments.m21398k(i10);
            Fragment fragment = (Fragment) this.mFragments.m21394g(m21398k);
            if (fragment != null && fragment.m3190s7()) {
                this.mFragmentManager.m3511a1(bundle, createKey(KEY_PREFIX_FRAGMENT, m21398k), fragment);
            }
        }
        for (int i11 = 0; i11 < this.mSavedStates.m21402p(); i11++) {
            long m21398k2 = this.mSavedStates.m21398k(i11);
            if (containsItem(m21398k2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, m21398k2), (Parcelable) this.mSavedStates.m21394g(m21398k2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.m3487K0();
    }

    public void unregisterFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.unregisterCallback(fragmentTransactionCallback);
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.m3093I6(), fragment.mo953f6());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public final void onBindViewHolder(FragmentViewHolder fragmentViewHolder, int i10) {
        long itemId = fragmentViewHolder.getItemId();
        int id2 = fragmentViewHolder.getContainer().getId();
        Long itemForViewHolder = itemForViewHolder(id2);
        if (itemForViewHolder != null && itemForViewHolder.longValue() != itemId) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.m21400m(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.m21399l(itemId, Integer.valueOf(id2));
        ensureFragment(i10);
        if (fragmentViewHolder.getContainer().isAttachedToWindow()) {
            placeFragmentInViewHolder(fragmentViewHolder);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public final FragmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return FragmentViewHolder.create(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public final void onViewAttachedToWindow(FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public final void onViewRecycled(FragmentViewHolder fragmentViewHolder) {
        Long itemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.m21400m(itemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(AbstractC0729o abstractC0729o, AbstractC0749c abstractC0749c) {
        this.mFragments = new C5308f();
        this.mSavedStates = new C5308f();
        this.mItemIdToViewHolder = new C5308f();
        this.mFragmentEventDispatcher = new FragmentEventDispatcher();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = abstractC0729o;
        this.mLifecycle = abstractC0749c;
        super.setHasStableIds(true);
    }
}
