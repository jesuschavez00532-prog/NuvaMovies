package td;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.bean.AudioInfoBean;
import com.module.bean.DefinitionBean;
import com.module.bean.SourceBean;
import com.open.leanback.widget.HorizontalGridView;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.R$style;
import com.widget.recyclerView.LinearLayoutManagerTV;
import com.widget.utils.SimpleItemDecoration;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p212kd.C5172f1;
import p212kd.C5192k1;
import p212kd.C5200m1;
import p212kd.InterfaceC5160c1;
import p225ld.C5547a;
import p225ld.C5552f;
import p400xa.C7586l1;
import p433zd.AbstractC7786b;

/* renamed from: td.h */
/* loaded from: classes3.dex */
public final class C6940h extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: C0 */
    private DefinitionBean f26289C0;

    /* renamed from: D0 */
    private List f26290D0;

    /* renamed from: F0 */
    private int f26292F0;

    /* renamed from: I0 */
    private final InterfaceC1312h f26295I0;

    /* renamed from: J0 */
    private final InterfaceC1312h f26296J0;

    /* renamed from: K0 */
    private final InterfaceC1312h f26297K0;

    /* renamed from: L0 */
    private final InterfaceC1312h f26298L0;

    /* renamed from: M0 */
    private InterfaceC5160c1 f26299M0;

    /* renamed from: N0 */
    private String f26300N0;

    /* renamed from: O0 */
    private String f26301O0;

    /* renamed from: P0 */
    public Map f26302P0 = new LinkedHashMap();

    /* renamed from: E0 */
    private boolean f26291E0 = true;

    /* renamed from: G0 */
    private int f26293G0 = 1;

    /* renamed from: H0 */
    private int f26294H0 = 1;

    /* renamed from: td.h$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f26303a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5172f1 invoke() {
            return new C5172f1();
        }
    }

    /* renamed from: td.h$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f26304a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5200m1 invoke() {
            return new C5200m1();
        }
    }

    /* renamed from: td.h$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f26305a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5192k1 invoke() {
            return new C5192k1();
        }
    }

    /* renamed from: td.h$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f26306a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5192k1.a invoke() {
            return new C5192k1.a();
        }
    }

    /* renamed from: td.h$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC5869l implements InterfaceC5664p {
        e() {
            super(2);
        }

        /* renamed from: a */
        public final void m26972a(int i10, AudioInfoBean audioInfoBean) {
            C6940h.this.m26949N9().m20895s(i10);
            InterfaceC5160c1 m26961O9 = C6940h.this.m26961O9();
            if (m26961O9 != null) {
                m26961O9.mo20846c(i10, audioInfoBean);
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m26972a(((Number) obj).intValue(), (AudioInfoBean) obj2);
            return C1328x.f4998a;
        }
    }

    /* renamed from: td.h$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC5869l implements InterfaceC5664p {
        f() {
            super(2);
        }

        /* renamed from: a */
        public final void m26973a(int i10, String str) {
            AbstractC5868k.m23674f(str, "language");
            InterfaceC5160c1 m26961O9 = C6940h.this.m26961O9();
            if (m26961O9 != null) {
                m26961O9.mo20844a(i10, str);
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m26973a(((Number) obj).intValue(), (String) obj2);
            return C1328x.f4998a;
        }
    }

    /* renamed from: td.h$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m26974a(int i10) {
            InterfaceC5160c1 m26961O9 = C6940h.this.m26961O9();
            if (m26961O9 != null) {
                m26961O9.mo20848e(i10);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26974a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: td.h$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC5869l implements InterfaceC5660l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m26975a(int i10) {
            InterfaceC5160c1 m26961O9 = C6940h.this.m26961O9();
            if (m26961O9 != null) {
                m26961O9.mo20847d(i10);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26975a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    public C6940h() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        m5965b = AbstractC1314j.m5965b(a.f26303a);
        this.f26295I0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(b.f26304a);
        this.f26296J0 = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(d.f26306a);
        this.f26297K0 = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(c.f26305a);
        this.f26298L0 = m5965b4;
        this.f26300N0 = "";
        this.f26301O0 = "";
    }

    /* renamed from: L9 */
    private final void m26947L9(boolean z10) {
        if (z10) {
            ((TextView) m26960J9(R$id.mTvLanguageTitle)).setVisibility(0);
            ((HorizontalGridView) m26960J9(R$id.mRvLanguage)).setVisibility(0);
            ((TextView) m26960J9(R$id.mTvSizeTitle)).setVisibility(0);
            ((HorizontalGridView) m26960J9(R$id.mRvSize)).setVisibility(0);
            ((TextView) m26960J9(R$id.mTvStyleTitle)).setVisibility(0);
            ((RecyclerView) m26960J9(R$id.mRvColor)).setVisibility(0);
            return;
        }
        ((TextView) m26960J9(R$id.mTvLanguageTitle)).setVisibility(8);
        ((HorizontalGridView) m26960J9(R$id.mRvLanguage)).setVisibility(8);
        ((TextView) m26960J9(R$id.mTvSizeTitle)).setVisibility(8);
        ((HorizontalGridView) m26960J9(R$id.mRvSize)).setVisibility(8);
        ((TextView) m26960J9(R$id.mTvStyleTitle)).setVisibility(8);
        ((RecyclerView) m26960J9(R$id.mRvColor)).setVisibility(8);
    }

    /* renamed from: M9 */
    private final List m26948M9() {
        ArrayList arrayList = new ArrayList();
        DefinitionBean definitionBean = this.f26289C0;
        if (definitionBean != null) {
            boolean z10 = true;
            if (definitionBean.getSourceList().size() <= 1) {
                z10 = false;
            }
            int size = definitionBean.getSourceList().size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new C5547a(definitionBean.getSourceList().get(i10), i10, z10));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N9 */
    public final C5172f1 m26949N9() {
        return (C5172f1) this.f26295I0.getValue();
    }

    /* renamed from: P9 */
    private final C5200m1 m26950P9() {
        return (C5200m1) this.f26296J0.getValue();
    }

    /* renamed from: Q9 */
    private final C5192k1 m26951Q9() {
        return (C5192k1) this.f26298L0.getValue();
    }

    /* renamed from: R9 */
    private final C5192k1.a m26952R9() {
        return (C5192k1.a) this.f26297K0.getValue();
    }

    /* renamed from: S9 */
    private final List m26953S9() {
        ArrayList arrayList = new ArrayList();
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        int i10 = R$string.vod_subtitle_color_Aa;
        String string = m3096J6.getString(i10);
        AbstractC5868k.m23673e(string, "context!!.getString(R.st…ng.vod_subtitle_color_Aa)");
        arrayList.add(new C5552f(string, 2));
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        String string2 = m3096J62.getString(i10);
        AbstractC5868k.m23673e(string2, "context!!.getString(R.st…ng.vod_subtitle_color_Aa)");
        arrayList.add(new C5552f(string2, 1));
        Context m3096J63 = m3096J6();
        AbstractC5868k.m23671c(m3096J63);
        String string3 = m3096J63.getString(i10);
        AbstractC5868k.m23673e(string3, "context!!.getString(R.st…ng.vod_subtitle_color_Aa)");
        arrayList.add(new C5552f(string3, 3));
        return arrayList;
    }

    /* renamed from: T9 */
    private final List m26954T9() {
        ArrayList arrayList = new ArrayList();
        List list = this.f26290D0;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: U9 */
    private final List m26955U9() {
        ArrayList arrayList = new ArrayList();
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String string = m3096J6.getString(R$string.vod_subtitle_size_normal);
        AbstractC5868k.m23673e(string, "context!!.getString(R.st…vod_subtitle_size_normal)");
        arrayList.add(new C5552f(string, 1));
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        String string2 = m3096J62.getString(R$string.vod_subtitle_size_big);
        AbstractC5868k.m23673e(string2, "context!!.getString(R.st…ng.vod_subtitle_size_big)");
        arrayList.add(new C5552f(string2, 2));
        Context m3096J63 = m3096J6();
        AbstractC5868k.m23671c(m3096J63);
        String string3 = m3096J63.getString(R$string.vod_subtitle_size_small);
        AbstractC5868k.m23673e(string3, "context!!.getString(R.st….vod_subtitle_size_small)");
        arrayList.add(new C5552f(string3, 3));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V9 */
    public static final void m26956V9(C6940h c6940h) {
        View view;
        AbstractC5868k.m23674f(c6940h, "this$0");
        RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition = ((RecyclerView) c6940h.m26960J9(R$id.mRvAudio)).findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            view = findViewHolderForAdapterPosition.itemView;
        } else {
            view = null;
        }
        if (view != null) {
            view.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public static final void m26957W9(C6940h c6940h, View view) {
        AbstractC5868k.m23674f(c6940h, "this$0");
        List list = c6940h.f26290D0;
        if (list != null) {
            boolean z10 = false;
            if (list != null && list.size() == 0) {
                z10 = true;
            }
            if (!z10) {
                int i10 = R$id.mIvSwitch;
                boolean isSelected = true ^ ((ImageView) c6940h.m26960J9(i10)).isSelected();
                ((ImageView) c6940h.m26960J9(i10)).setSelected(isSelected);
                c6940h.m26947L9(isSelected);
                InterfaceC5160c1 interfaceC5160c1 = c6940h.f26299M0;
                if (interfaceC5160c1 != null) {
                    interfaceC5160c1.mo20845b(isSelected);
                    return;
                }
                return;
            }
        }
        C7586l1 c7586l1 = C7586l1.f27877a;
        Context m3096J6 = c6940h.m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m3172j7 = c6940h.m3172j7(com.module.R$string.dialog_no_subtitles);
        AbstractC5868k.m23673e(m3172j7, "getString(com.module.R.string.dialog_no_subtitles)");
        C7586l1.m29111d(c7586l1, m3096J6, m3172j7, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public static final void m26958X9(C6940h c6940h, View view) {
        AbstractC5868k.m23674f(c6940h, "this$0");
        c6940h.mo3278o9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: F7 */
    public void mo3085F7(Bundle bundle) {
        int i10 = 0;
        boolean z10;
        List<SourceBean> sourceList;
        super.mo3085F7(bundle);
        int i11 = R$id.mRvAudio;
        ((RecyclerView) m26960J9(i11)).post(new Runnable() { // from class: td.e
            @Override // java.lang.Runnable
            public final void run() {
                C6940h.m26956V9(C6940h.this);
            }
        });
        LinearLayoutManagerTV linearLayoutManagerTV = new LinearLayoutManagerTV(m3075C6());
        linearLayoutManagerTV.setOrientation(1);
        ((RecyclerView) m26960J9(i11)).addItemDecoration(new SimpleItemDecoration(AutoSizeUtils.dp2px(m3096J6(), 32.0f), false, false, 4, null));
        ((RecyclerView) m26960J9(i11)).setLayoutManager(linearLayoutManagerTV);
        m26949N9().setHasStableIds(true);
        ((RecyclerView) m26960J9(i11)).setAdapter(m26949N9());
        C5172f1 m26949N9 = m26949N9();
        DefinitionBean definitionBean = this.f26289C0;
        if (definitionBean != null) {
            i10 = definitionBean.getSelectSourceIndex();
        } else {
            i10 = 0;
        }
        m26949N9.m20895s(i10);
        m26949N9().m28854l(m26948M9());
        m26949N9().m20894r(new e());
        DefinitionBean definitionBean2 = this.f26289C0;
        if (definitionBean2 != null && (sourceList = definitionBean2.getSourceList()) != null) {
            int size = sourceList.size();
            int i12 = R$id.mLayoutAudio;
            ViewGroup.LayoutParams layoutParams = ((AutoFrameLayout) m26960J9(i12)).getLayoutParams();
            AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type com.zhy.autolayout.AutoLinearLayout.LayoutParams");
            AutoLinearLayout.C3911a c3911a = (AutoLinearLayout.C3911a) layoutParams;
            ViewGroup.LayoutParams layoutParams2 = ((RecyclerView) m26960J9(i11)).getLayoutParams();
            AbstractC5868k.m23672d(layoutParams2, "null cannot be cast to non-null type com.zhy.autolayout.AutoFrameLayout.LayoutParams");
            AutoFrameLayout.C3910a c3910a = (AutoFrameLayout.C3910a) layoutParams2;
            if (size > 1) {
                ((LinearLayout.LayoutParams) c3911a).topMargin = AbstractC7786b.m30163g(11);
                ((LinearLayout.LayoutParams) c3911a).leftMargin = AbstractC7786b.m30163g(74);
                ((FrameLayout.LayoutParams) c3910a).leftMargin = AbstractC7786b.m30163g(30);
                ((FrameLayout.LayoutParams) c3910a).topMargin = AbstractC7786b.m30163g(59);
            } else {
                ((LinearLayout.LayoutParams) c3911a).topMargin = AbstractC7786b.m30163g(72);
                ((LinearLayout.LayoutParams) c3911a).leftMargin = AbstractC7786b.m30163g(74);
                ((FrameLayout.LayoutParams) c3910a).leftMargin = AbstractC7786b.m30163g(176);
            }
            ((AutoFrameLayout) m26960J9(i12)).setLayoutParams(c3911a);
            ((RecyclerView) m26960J9(i11)).setLayoutParams(c3910a);
        }
        ((AutoLinearLayout) m26960J9(R$id.mLayoutSwitch)).setVisibility(0);
        ((AutoLinearLayout) m26960J9(R$id.mLayoutLanguage)).setVisibility(0);
        ((AutoLinearLayout) m26960J9(R$id.mLayoutSize)).setVisibility(0);
        ((AutoLinearLayout) m26960J9(R$id.mLayoutColor)).setVisibility(0);
        boolean z11 = this.f26291E0;
        int i13 = R$id.mIvSwitch;
        ((ImageView) m26960J9(i13)).setSelected(z11);
        if (z11) {
            z10 = true;
        } else {
            z10 = false;
        }
        m26947L9(z10);
        LinearLayoutManagerTV linearLayoutManagerTV2 = new LinearLayoutManagerTV(m3075C6());
        linearLayoutManagerTV2.setOrientation(0);
        int i14 = R$id.mRvLanguage;
        ((HorizontalGridView) m26960J9(i14)).setLayoutManager(linearLayoutManagerTV2);
        m26950P9().setHasStableIds(true);
        ((HorizontalGridView) m26960J9(i14)).setAdapter(m26950P9());
        m26950P9().m21009t(this.f26300N0);
        m26950P9().m21010u(this.f26301O0);
        m26950P9().m21012w(this.f26292F0);
        m26950P9().m28854l(m26954T9());
        m26950P9().m21011v(new f());
        LinearLayoutManagerTV linearLayoutManagerTV3 = new LinearLayoutManagerTV(m3075C6());
        linearLayoutManagerTV3.setOrientation(0);
        int i15 = R$id.mRvSize;
        ((HorizontalGridView) m26960J9(i15)).setLayoutManager(linearLayoutManagerTV3);
        m26952R9().setHasStableIds(true);
        ((HorizontalGridView) m26960J9(i15)).setAdapter(m26952R9());
        m26952R9().m20960s(this.f26300N0);
        m26952R9().m20961t(this.f26301O0);
        if (this.f26292F0 != -1) {
            m26952R9().m20963v(this.f26294H0);
        }
        m26952R9().m28854l(m26955U9());
        m26952R9().m20962u(new g());
        LinearLayoutManagerTV linearLayoutManagerTV4 = new LinearLayoutManagerTV(m3075C6());
        linearLayoutManagerTV4.setOrientation(0);
        int i16 = R$id.mRvColor;
        ((RecyclerView) m26960J9(i16)).setLayoutManager(linearLayoutManagerTV4);
        m26951Q9().setHasStableIds(true);
        ((RecyclerView) m26960J9(i16)).setAdapter(m26951Q9());
        m26951Q9().m20953s(this.f26300N0);
        m26951Q9().m20955u(this.f26301O0);
        if (this.f26292F0 != -1) {
            m26951Q9().m20954t(this.f26293G0);
        }
        m26951Q9().m28854l(m26953S9());
        m26951Q9().m20956v(new h());
        ((ImageView) m26960J9(i13)).setOnClickListener(new View.OnClickListener() { // from class: td.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6940h.m26957W9(C6940h.this, view);
            }
        });
        ((Button) m26960J9(R$id.mBtnExit)).setOnClickListener(new View.OnClickListener() { // from class: td.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6940h.m26958X9(C6940h.this, view);
            }
        });
    }

    /* renamed from: I9 */
    public void m26959I9() {
        this.f26302P0.clear();
    }

    /* renamed from: J9 */
    public View m26960J9(int i10) {
        View findViewById;
        Map map = this.f26302P0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: O9 */
    public final InterfaceC5160c1 m26961O9() {
        return this.f26299M0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_select_subtitle_audio, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m26959I9();
    }

    /* renamed from: Y9 */
    public final void m26962Y9(String str) {
        AbstractC5868k.m23674f(str, "contentId");
        this.f26300N0 = str;
    }

    /* renamed from: Z9 */
    public final void m26963Z9(DefinitionBean definitionBean) {
        this.f26289C0 = definitionBean;
    }

    /* renamed from: aa */
    public final void m26964aa(String str) {
        AbstractC5868k.m23674f(str, "detailContentId");
        this.f26301O0 = str;
    }

    /* renamed from: ba */
    public final void m26965ba(InterfaceC5160c1 interfaceC5160c1) {
        this.f26299M0 = interfaceC5160c1;
    }

    /* renamed from: ca */
    public final void m26966ca(List list) {
        this.f26290D0 = list;
    }

    /* renamed from: da */
    public final void m26967da(boolean z10, int i10, int i11, int i12) {
        this.f26291E0 = z10;
        this.f26292F0 = i10;
        this.f26293G0 = i12;
        this.f26294H0 = i11;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(1145), AbstractC7786b.m30163g(881));
        }
    }
}
