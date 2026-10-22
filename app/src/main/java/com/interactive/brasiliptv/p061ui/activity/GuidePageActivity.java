package com.interactive.brasiliptv.p061ui.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.AbstractC0871a;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.boost_multidex.BuildConfig;
import com.google.android.youtube.tv.R;
import com.interactive.brasiliptv.R$id;
import com.interactive.brasiliptv.p061ui.activity.GuidePageActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.umeng.analytics.pro.C3384f;
import ga.C4417e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p170i2.C4842a;
import p236m7.InterfaceC5604a;
import p249n7.C5751d;
import p302qc.C6448c;
import p348u2.AbstractC7026c;
import p400xa.C7577i1;

/* loaded from: classes2.dex */
public final class GuidePageActivity extends AbstractActivityC2972a implements InterfaceC5604a {

    /* renamed from: G */
    public static final C2832a f10603G = new C2832a(null);

    /* renamed from: E */
    private ArrayList f10604E;

    /* renamed from: F */
    public Map f10605F = new LinkedHashMap();

    /* renamed from: com.interactive.brasiliptv.ui.activity.GuidePageActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2832a {
        private C2832a() {
        }

        public /* synthetic */ C2832a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.interactive.brasiliptv.ui.activity.GuidePageActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2833b extends AbstractC0871a {

        /* renamed from: a */
        private final Context f10606a;

        /* renamed from: b */
        private final ArrayList f10607b;

        /* renamed from: c */
        private a f10608c;

        /* renamed from: com.interactive.brasiliptv.ui.activity.GuidePageActivity$b$a */
        /* loaded from: classes2.dex */
        public interface a {
            /* renamed from: a */
            void mo11364a(int i10);
        }

        public C2833b(Context context, ArrayList arrayList) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(arrayList, "list");
            this.f10606a = context;
            this.f10607b = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m11362b(C2833b c2833b, int i10, View view) {
            AbstractC5868k.m23674f(c2833b, "this$0");
            a aVar = c2833b.f10608c;
            if (aVar != null) {
                aVar.mo11364a(i10);
            }
        }

        /* renamed from: c */
        public final void m11363c(a aVar) {
            AbstractC5868k.m23674f(aVar, "listener");
            this.f10608c = aVar;
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            AbstractC5868k.m23674f(viewGroup, "container");
            AbstractC5868k.m23674f(obj, "object");
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public int getCount() {
            return this.f10607b.size();
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public Object instantiateItem(ViewGroup viewGroup, final int i10) {
            AbstractC5868k.m23674f(viewGroup, "container");
            View inflate = LayoutInflater.from(this.f10606a).inflate(R.layout.layout_item_guide_page, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.mIvGuide);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) findViewById;
            imageView.setImageDrawable((Drawable) this.f10607b.get(i10));
            viewGroup.addView(inflate);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: p7.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuidePageActivity.C2833b.m11362b(GuidePageActivity.C2833b.this, i10, view);
                }
            });
            AbstractC5868k.m23673e(inflate, "view");
            return inflate;
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public boolean isViewFromObject(View view, Object obj) {
            AbstractC5868k.m23674f(view, "view");
            AbstractC5868k.m23674f(obj, "object");
            return AbstractC5868k.m23669a(view, obj);
        }
    }

    /* renamed from: com.interactive.brasiliptv.ui.activity.GuidePageActivity$c */
    /* loaded from: classes2.dex */
    public static final class C2834c implements C2833b.a {
        C2834c() {
        }

        @Override // com.interactive.brasiliptv.p061ui.activity.GuidePageActivity.C2833b.a
        /* renamed from: a */
        public void mo11364a(int i10) {
            GuidePageActivity guidePageActivity = GuidePageActivity.this;
            int i11 = R$id.mGuideViewPager;
            ArrayList arrayList = null;
            if (((ViewPager) guidePageActivity.m11358e6(i11)).getCurrentItem() >= 0) {
                int currentItem = ((ViewPager) GuidePageActivity.this.m11358e6(i11)).getCurrentItem();
                ArrayList arrayList2 = GuidePageActivity.this.f10604E;
                if (arrayList2 == null) {
                    AbstractC5868k.m23686r("mPagerList");
                    arrayList2 = null;
                }
                if (currentItem < arrayList2.size() - 1) {
                    ((ViewPager) GuidePageActivity.this.m11358e6(i11)).setCurrentItem(((ViewPager) GuidePageActivity.this.m11358e6(i11)).getCurrentItem() + 1);
                    return;
                }
            }
            int currentItem2 = ((ViewPager) GuidePageActivity.this.m11358e6(i11)).getCurrentItem();
            ArrayList arrayList3 = GuidePageActivity.this.f10604E;
            if (arrayList3 == null) {
                AbstractC5868k.m23686r("mPagerList");
            } else {
                arrayList = arrayList3;
            }
            if (currentItem2 == arrayList.size() - 1) {
                ((C5751d) GuidePageActivity.this.m11977r5()).m23169k();
            }
        }
    }

    /* renamed from: com.interactive.brasiliptv.ui.activity.GuidePageActivity$d */
    /* loaded from: classes2.dex */
    public static final class C2835d implements ViewPager.InterfaceC0866j {
        C2835d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
        public void onPageSelected(int i10) {
            ArrayList arrayList = GuidePageActivity.this.f10604E;
            if (arrayList == null) {
                AbstractC5868k.m23686r("mPagerList");
                arrayList = null;
            }
            if (i10 == arrayList.size() - 1) {
                C7577i1.f27838b.m29084c().m29076h("guide_version", BuildConfig.VERSION_NAME);
            }
        }
    }

    /* renamed from: e6 */
    public View m11358e6(int i10) {
        Map map = this.f10605F;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ArrayList m6984c;
        Drawable m27111a = AbstractC7026c.m27111a(this, R.mipmap.guide_page_01);
        AbstractC5868k.m23673e(m27111a, "acquire(this, R.mipmap.guide_page_01)");
        Drawable m27111a2 = AbstractC7026c.m27111a(this, R.mipmap.guide_page_02);
        AbstractC5868k.m23673e(m27111a2, "acquire(this, R.mipmap.guide_page_02)");
        m6984c = AbstractC1500l.m6984c(m27111a, m27111a2);
        this.f10604E = m6984c;
        if (m6984c == null) {
            AbstractC5868k.m23686r("mPagerList");
            m6984c = null;
        }
        C2833b c2833b = new C2833b(this, m6984c);
        int i10 = R$id.mGuideViewPager;
        ((ViewPager) m11358e6(i10)).setAdapter(c2833b);
        c2833b.m11363c(new C2834c());
        ((ViewPager) m11358e6(i10)).setOnPageChangeListener(new C2835d());
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: h6, reason: merged with bridge method [inline-methods] */
    public C5751d mo7516s5() {
        return new C5751d(this, this);
    }

    @Override // p236m7.InterfaceC5604a
    /* renamed from: n2 */
    public void mo11360n2() {
        C7577i1.f27838b.m29084c().m29076h("guide_version", BuildConfig.VERSION_NAME);
        C6448c.m25240q(C5634i.m22843d("http://module_main/HomeActivity").m25255u("formPageKey", 1).m25254t(67108864), m30049S4(), null, 2, null);
        finish();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 != 4) {
                ArrayList arrayList = null;
                if (i10 != 66) {
                    switch (i10) {
                        case 21:
                            if (((ViewPager) m11358e6(R$id.mGuideViewPager)).getCurrentItem() == 0) {
                                return true;
                            }
                            break;
                        case 22:
                            int currentItem = ((ViewPager) m11358e6(R$id.mGuideViewPager)).getCurrentItem();
                            ArrayList arrayList2 = this.f10604E;
                            if (arrayList2 == null) {
                                AbstractC5868k.m23686r("mPagerList");
                            } else {
                                arrayList = arrayList2;
                            }
                            if (currentItem == arrayList.size() - 1) {
                                ((C5751d) m11977r5()).m23169k();
                                return true;
                            }
                            break;
                        case 23:
                            break;
                        default:
                            int i11 = R$id.mGuideViewPager;
                            if (((ViewPager) m11358e6(i11)).getCurrentItem() >= 0) {
                                int currentItem2 = ((ViewPager) m11358e6(i11)).getCurrentItem();
                                ArrayList arrayList3 = this.f10604E;
                                if (arrayList3 == null) {
                                    AbstractC5868k.m23686r("mPagerList");
                                    arrayList3 = null;
                                }
                                if (currentItem2 < arrayList3.size() - 1) {
                                    ((ViewPager) m11358e6(i11)).setCurrentItem(((ViewPager) m11358e6(i11)).getCurrentItem() + 1);
                                    return true;
                                }
                            }
                            int currentItem3 = ((ViewPager) m11358e6(i11)).getCurrentItem();
                            ArrayList arrayList4 = this.f10604E;
                            if (arrayList4 == null) {
                                AbstractC5868k.m23686r("mPagerList");
                            } else {
                                arrayList = arrayList4;
                            }
                            if (currentItem3 == arrayList.size() - 1) {
                                ((C5751d) m11977r5()).m23169k();
                                return true;
                            }
                            break;
                    }
                }
                int i12 = R$id.mGuideViewPager;
                if (((ViewPager) m11358e6(i12)).getCurrentItem() >= 0) {
                    int currentItem4 = ((ViewPager) m11358e6(i12)).getCurrentItem();
                    ArrayList arrayList5 = this.f10604E;
                    if (arrayList5 == null) {
                        AbstractC5868k.m23686r("mPagerList");
                        arrayList5 = null;
                    }
                    if (currentItem4 < arrayList5.size() - 1) {
                        ((ViewPager) m11358e6(i12)).setCurrentItem(((ViewPager) m11358e6(i12)).getCurrentItem() + 1);
                        return true;
                    }
                }
                int currentItem5 = ((ViewPager) m11358e6(i12)).getCurrentItem();
                ArrayList arrayList6 = this.f10604E;
                if (arrayList6 == null) {
                    AbstractC5868k.m23686r("mPagerList");
                } else {
                    arrayList = arrayList6;
                }
                if (currentItem5 == arrayList.size() - 1) {
                    ((C5751d) m11977r5()).m23169k();
                    return true;
                }
            } else {
                finish();
                C4417e.m18497f(C4417e.f19115a, m30049S4(), C4842a.f20329a.m19920a().mo19960i(this), false, false, 12, null);
                return true;
            }
        }
        return false;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R.layout.activity_guidepage;
    }
}
