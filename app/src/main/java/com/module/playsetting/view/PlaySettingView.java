package com.module.playsetting.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.R$array;
import com.module.R$string;
import com.module.R$styleable;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.VerticalGridView;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1500l;
import p102db.C4053l;
import p265oa.C5946d;
import p265oa.C5951i;
import p400xa.AbstractC7555b0;
import p433zd.AbstractC7786b;
import pa.C6244a;
import pa.C6247d;
import pa.C6248e;
import pa.C6249f;
import pa.InterfaceC6245b;
import qa.AbstractC6358b;
import qa.C6363g;
import qa.C6366j;
import qa.C6367k;

/* loaded from: classes2.dex */
public final class PlaySettingView extends AutoLinearLayout {

    /* renamed from: l */
    public static final C2974a f12059l = new C2974a(null);

    /* renamed from: a */
    private int f12060a;

    /* renamed from: b */
    private ArrayList f12061b;

    /* renamed from: c */
    private InterfaceC2975b f12062c;

    /* renamed from: d */
    private boolean f12063d;

    /* renamed from: e */
    private final InterfaceC1312h f12064e;

    /* renamed from: f */
    private final InterfaceC1312h f12065f;

    /* renamed from: g */
    private final C6249f f12066g;

    /* renamed from: h */
    private final C6247d f12067h;

    /* renamed from: i */
    private final C6244a f12068i;

    /* renamed from: j */
    private int f12069j;

    /* renamed from: k */
    public Map f12070k;

    /* renamed from: com.module.playsetting.view.PlaySettingView$a */
    /* loaded from: classes2.dex */
    public static final class C2974a {
        private C2974a() {
        }

        public /* synthetic */ C2974a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.module.playsetting.view.PlaySettingView$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2975b {
        /* renamed from: A3 */
        void mo7566A3(int i10);

        /* renamed from: Z */
        void mo7568Z(int i10);

        /* renamed from: k0 */
        void mo7569k0(int i10);

        /* renamed from: k6 */
        void mo7570k6(int i10);

        /* renamed from: w0 */
        void mo7572w0(int i10);

        /* renamed from: w5 */
        void mo7573w5(int i10);

        /* renamed from: x4 */
        void mo7574x4(int i10);
    }

    /* renamed from: com.module.playsetting.view.PlaySettingView$c */
    /* loaded from: classes2.dex */
    public static final class C2976c extends AbstractC3057h {
        C2976c() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            int i12;
            RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition;
            int i13;
            RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition2;
            if (abstractC0787f0 instanceof AbstractC6358b) {
                ((AbstractC6358b) abstractC0787f0).mo25163e(true);
                if (i10 > PlaySettingView.this.f12069j && i10 - 1 >= 0 && (findViewHolderForAdapterPosition2 = PlaySettingView.this.getMGridView().findViewHolderForAdapterPosition(i13)) != null && (findViewHolderForAdapterPosition2 instanceof AbstractC6358b)) {
                    ((AbstractC6358b) findViewHolderForAdapterPosition2).mo25163e(false);
                }
                if (i10 < PlaySettingView.this.f12069j && (i12 = i10 + 1) < PlaySettingView.this.getMAdapter().getItemCount() && (findViewHolderForAdapterPosition = PlaySettingView.this.getMGridView().findViewHolderForAdapterPosition(i12)) != null && (findViewHolderForAdapterPosition instanceof AbstractC6358b)) {
                    ((AbstractC6358b) findViewHolderForAdapterPosition).mo25160b(false);
                }
                PlaySettingView.this.f12069j = i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.playsetting.view.PlaySettingView$d */
    /* loaded from: classes2.dex */
    public static final class C2977d extends AbstractC5869l implements InterfaceC5664p {
        C2977d() {
            super(2);
        }

        /* renamed from: a */
        public final void m11996a(int i10, int i11) {
            switch (i11) {
                case 0:
                    InterfaceC2975b interfaceC2975b = PlaySettingView.this.f12062c;
                    if (interfaceC2975b != null) {
                        interfaceC2975b.mo7573w5(i10);
                        return;
                    }
                    return;
                case 1:
                    InterfaceC2975b interfaceC2975b2 = PlaySettingView.this.f12062c;
                    if (interfaceC2975b2 != null) {
                        interfaceC2975b2.mo7570k6(i10);
                        return;
                    }
                    return;
                case 2:
                    InterfaceC2975b interfaceC2975b3 = PlaySettingView.this.f12062c;
                    if (interfaceC2975b3 != null) {
                        interfaceC2975b3.mo7566A3(i10);
                        return;
                    }
                    return;
                case 3:
                    InterfaceC2975b interfaceC2975b4 = PlaySettingView.this.f12062c;
                    if (interfaceC2975b4 != null) {
                        interfaceC2975b4.mo7574x4(i10);
                        return;
                    }
                    return;
                case 4:
                    InterfaceC2975b interfaceC2975b5 = PlaySettingView.this.f12062c;
                    if (interfaceC2975b5 != null) {
                        interfaceC2975b5.mo7568Z(i10);
                        return;
                    }
                    return;
                case 5:
                    InterfaceC2975b interfaceC2975b6 = PlaySettingView.this.f12062c;
                    if (interfaceC2975b6 != null) {
                        interfaceC2975b6.mo7569k0(i10);
                        return;
                    }
                    return;
                case 6:
                    InterfaceC2975b interfaceC2975b7 = PlaySettingView.this.f12062c;
                    if (interfaceC2975b7 != null) {
                        interfaceC2975b7.mo7572w0(i10);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m11996a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f12070k = new LinkedHashMap();
        this.f12060a = 1;
        this.f12061b = new ArrayList();
        this.f12063d = true;
        m5965b = AbstractC1314j.m5965b(new C2979b(this));
        this.f12064e = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new C2978a(this));
        this.f12065f = m5965b2;
        this.f12066g = new C6249f();
        this.f12067h = new C6247d();
        this.f12068i = new C6244a();
        m11988i(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5946d getMAdapter() {
        return (C5946d) this.f12065f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerticalGridView getMGridView() {
        return (VerticalGridView) this.f12064e.getValue();
    }

    /* renamed from: i */
    private final void m11988i(Context context, AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f11935J0, i10, 0);
        AbstractC5868k.m23673e(obtainStyledAttributes, "context.obtainStyledAttr…SettingView, defStyle, 0)");
        this.f12063d = obtainStyledAttributes.getBoolean(R$styleable.PlaySettingView_isVod, true);
        obtainStyledAttributes.recycle();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        m11990k();
        m11989j();
    }

    /* renamed from: j */
    private final void m11989j() {
        ArrayList m6984c;
        String[] stringArray = getContext().getResources().getStringArray(R$array.play_setting_play_ratio);
        AbstractC5868k.m23673e(stringArray, "context.resources.getStr….play_setting_play_ratio)");
        ArrayList arrayList = new ArrayList();
        for (String str : stringArray) {
            arrayList.add(str);
        }
        this.f12066g.m24877b(arrayList);
        C6244a c6244a = this.f12068i;
        String string = getContext().getString(R$string.vod_menu_feedback);
        AbstractC5868k.m23673e(string, "context.getString(R.string.vod_menu_feedback)");
        m6984c = AbstractC1500l.m6984c(string);
        c6244a.m24869b(m6984c);
        this.f12061b.add(this.f12066g);
        this.f12061b.add(this.f12068i);
        getMAdapter().notifyDataSetChanged();
    }

    /* renamed from: k */
    private final void m11990k() {
        if (getMGridView().getParent() != null) {
            ViewParent parent = getMGridView().getParent();
            AbstractC5868k.m23672d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(getMGridView());
        }
        getMGridView().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        getMGridView().setClipChildren(false);
        getMGridView().setClipToPadding(false);
        getMGridView().setVerticalSpacing(AbstractC7786b.m30166j(25));
        getMGridView().setPadding(AbstractC7786b.m30166j(80), 0, 0, AbstractC7786b.m30166j(60));
        getMAdapter().setHasStableIds(true);
        getMGridView().setAdapter(getMAdapter());
        addView(getMGridView());
        AbstractC7555b0.m28958l(getMGridView(), true, false, null, 6, null);
        getMGridView().setOnChildViewHolderSelectedListener(new C2976c());
        getMAdapter().m24084d(new C2977d());
    }

    /* renamed from: g */
    public final void m11991g() {
        if (!C4053l.f17879P0.m17071b(C4053l.c.VodPlaySubtitle)) {
            int size = this.f12061b.size();
            int i10 = -1;
            for (int i11 = 0; i11 < size; i11++) {
                if (((InterfaceC6245b) this.f12061b.get(i11)).getType() == 2) {
                    i10 = i11;
                }
            }
            if (i10 != -1) {
                getMGridView().setSelectedPosition(i10);
            }
        }
    }

    /* renamed from: h */
    public final void m11992h() {
        RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition = getMGridView().findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition instanceof C6366j) {
            ((C6366j) findViewHolderForAdapterPosition).m25191i();
        }
    }

    /* renamed from: l */
    public final void m11993l(int i10) {
        int size = this.f12061b.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (i10 == ((InterfaceC6245b) this.f12061b.get(i11)).getType()) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 != -1) {
            this.f12061b.remove(i11);
            getMAdapter().notifyItemRemoved(i11);
        }
    }

    /* renamed from: m */
    public final void m11994m(InterfaceC6245b interfaceC6245b, int i10) {
        AbstractC5868k.m23674f(interfaceC6245b, "item");
        int size = this.f12061b.size();
        int size2 = this.f12061b.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            if (interfaceC6245b.getType() <= ((InterfaceC6245b) this.f12061b.get(i11)).getType()) {
                size = i11;
                break;
            }
            i11++;
        }
        if (((InterfaceC6245b) this.f12061b.get(size)).getType() != i10) {
            z10 = true;
        }
        if (z10) {
            this.f12061b.add(size, interfaceC6245b);
            getMAdapter().notifyItemInserted(size);
        } else {
            this.f12061b.remove(size);
            this.f12061b.add(size, interfaceC6245b);
            getMAdapter().notifyItemChanged(size);
        }
    }

    public final void setPageType(int i10) {
        this.f12060a = i10;
        getMAdapter().m24085e(i10);
    }

    public final void setPlaySelection(int i10) {
        RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition = getMGridView().findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition instanceof C6366j) {
            ((C6366j) findViewHolderForAdapterPosition).m25192j(i10);
        }
    }

    public final void setQualitySelection(int i10) {
        ArrayList arrayList = this.f12061b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                InterfaceC6245b interfaceC6245b = (InterfaceC6245b) arrayList.get(i11);
                RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition = getMGridView().findViewHolderForAdapterPosition(i11);
                if ((interfaceC6245b instanceof C6248e) && findViewHolderForAdapterPosition == null) {
                    C5951i.f23651f.m24101a(i10);
                } else if (findViewHolderForAdapterPosition instanceof C6363g) {
                    ((C6363g) findViewHolderForAdapterPosition).m25182i(i10);
                }
                if (i11 != size) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void setSettingFunctionListener(InterfaceC2975b interfaceC2975b) {
        AbstractC5868k.m23674f(interfaceC2975b, "listener");
        this.f12062c = interfaceC2975b;
    }

    public final void setSubtitleSelection(int i10) {
        ArrayList arrayList = this.f12061b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition = getMGridView().findViewHolderForAdapterPosition(i11);
                if (findViewHolderForAdapterPosition instanceof C6367k) {
                    ((C6367k) findViewHolderForAdapterPosition).m25197h(i10);
                }
                if (i11 != size) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }
}
