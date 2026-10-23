package p263o8;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.bean.EpgDate;
import com.module.event.HideContentFragmentEvent;
import com.module.view.AutoFocusedTextView;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.swlauthnew.view.ScrollTextView;
import com.umeng.analytics.pro.C3384f;
import com.widget.custom.MemoryListView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p028b8.C1153d;
import p028b8.C1155e;
import p040c8.C1407f;
import p040c8.C1427v;
import p237m8.AbstractC5607a;
import p317rb.AbstractC6567a;
import p371vb.C7252a;
import ye.C7709c;

/* renamed from: o8.k */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC5933k extends LinearLayout implements View.OnKeyListener, InterfaceC5941s {

    /* renamed from: a */
    private String f23591a;

    /* renamed from: b */
    private final long f23592b;

    /* renamed from: c */
    private C1153d f23593c;

    /* renamed from: d */
    private C1155e f23594d;

    /* renamed from: e */
    private a f23595e;

    /* renamed from: f */
    private Boolean f23596f;

    /* renamed from: g */
    private int f23597g;

    /* renamed from: h */
    private String f23598h;

    /* renamed from: i */
    public Map f23599i;

    /* renamed from: o8.k$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: J0 */
        String mo21940J0();

        /* renamed from: P4 */
        void mo21943P4();

        /* renamed from: Y */
        void mo21945Y(ArrayList arrayList, int i10, boolean z10);

        /* renamed from: b4 */
        void mo21947b4(EpgDate epgDate);

        /* renamed from: d4 */
        boolean mo21948d4();

        /* renamed from: l0 */
        void mo21955l0(EpgProgram epgProgram);

        /* renamed from: o5 */
        void mo21959o5(EpgDate epgDate, EpgProgram epgProgram);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o8.k$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((MemoryListView) ViewOnKeyListenerC5933k.this.m24026e(R$id.mMlvEpg)).hasFocus());
        }
    }

    /* renamed from: o8.k$c */
    /* loaded from: classes2.dex */
    public static final class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            ViewOnKeyListenerC5933k.this.f23597g = 0;
            if ((!((MemoryListView) ViewOnKeyListenerC5933k.this.m24026e(R$id.mMlvEpg)).hasFocus() && !((TextView) ViewOnKeyListenerC5933k.this.m24026e(R$id.mTvLoading)).hasFocus()) || ViewOnKeyListenerC5933k.this.f23596f == null) {
                ViewOnKeyListenerC5933k.this.m24014p(i10);
                return;
            }
            ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = ViewOnKeyListenerC5933k.this;
            Boolean bool = viewOnKeyListenerC5933k.f23596f;
            AbstractC5868k.m23671c(bool);
            viewOnKeyListenerC5933k.m24021w(i10, bool.booleanValue());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: o8.k$d */
    /* loaded from: classes2.dex */
    public static final class d implements AdapterView.OnItemSelectedListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            C1427v.f5519a.m6647k0(false);
            C1155e c1155e = ViewOnKeyListenerC5933k.this.f23594d;
            if (c1155e != null) {
                c1155e.m5302h(i10);
            }
            ViewOnKeyListenerC5933k.this.m24000E();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnKeyListenerC5933k(Context context) {
        this(context, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m23999A(ViewOnKeyListenerC5933k viewOnKeyListenerC5933k) {
        AbstractC5868k.m23674f(viewOnKeyListenerC5933k, "this$0");
        C1155e c1155e = viewOnKeyListenerC5933k.f23594d;
        boolean z10 = false;
        if (c1155e != null && c1155e.getCount() == 0) {
            z10 = true;
        }
        if (!z10) {
            viewOnKeyListenerC5933k.m24015q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m24000E() {
        EpgProgram epgProgram;
        C1155e c1155e = this.f23594d;
        if (c1155e != null) {
            epgProgram = c1155e.getItem(((MemoryListView) m24026e(R$id.mMlvEpg)).getSelectedItemPosition());
        } else {
            epgProgram = null;
        }
        if (epgProgram != null && !TextUtils.isEmpty(epgProgram.getRemark()) && ((MemoryListView) m24026e(R$id.mMlvEpg)).hasFocus()) {
            ((LinearLayout) m24026e(R$id.llEpgDes)).setVisibility(0);
            ((TextView) m24026e(R$id.tvEpgTitle)).setText(epgProgram.getProgramName());
            ((TextView) m24026e(R$id.tvEpgDate)).setText(epgProgram.getStart() + '-' + epgProgram.getStop());
            ((ScrollTextView) m24026e(R$id.tvEpgDes)).setText(epgProgram.getRemark());
            return;
        }
        ((LinearLayout) m24026e(R$id.llEpgDes)).setVisibility(8);
    }

    /* renamed from: l */
    private final void m24010l(int i10) {
        EpgProgram epgProgram;
        boolean z10;
        C1155e c1155e = this.f23594d;
        if (c1155e != null) {
            epgProgram = c1155e.getItem(i10);
        } else {
            epgProgram = null;
        }
        if (epgProgram == null) {
            return;
        }
        C1155e c1155e2 = this.f23594d;
        if (c1155e2 != null) {
            z10 = c1155e2.m5299e(epgProgram, C1427v.f5519a.m6635V(epgProgram));
        } else {
            z10 = false;
        }
        if (z10) {
            C7709c.m29787d().m29801m(new HideContentFragmentEvent());
            return;
        }
        int m6635V = C1427v.f5519a.m6635V(epgProgram);
        if (m6635V != 0) {
            if (m6635V != 1) {
                m24013o(epgProgram);
                return;
            } else {
                m24011m(epgProgram);
                return;
            }
        }
        m24012n(epgProgram, i10);
    }

    /* renamed from: m */
    private final void m24011m(EpgProgram epgProgram) {
        a aVar = this.f23595e;
        if (aVar != null) {
            aVar.mo21955l0(epgProgram);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (((android.app.Activity) r0).isFinishing() == false) goto L18;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m24012n(com.request.bean.EpgProgram r4, int r5) {
        /*
            r3 = this;
            b8.d r0 = r3.f23593c
            r1 = 0
            if (r0 == 0) goto Lc
            int r2 = r3.f23597g
            com.live.bean.EpgDate r0 = r0.getItem(r2)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.getYearInfo()
            goto L15
        L14:
            r0 = r1
        L15:
            boolean r0 = p317rb.AbstractC6567a.m25634d(r0)
            if (r0 == 0) goto L1c
            return
        L1c:
            java.lang.String r4 = r4.getContentId()
            boolean r4 = p317rb.AbstractC6567a.m25634d(r4)
            if (r4 == 0) goto L58
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r0 = r3.getResources()
            int r2 = com.live.R$string.no_back_play_data
            java.lang.String r0 = r0.getString(r2)
            r2 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r2)
            p323s2.AbstractC6652a.m25971a(r4)
            android.content.Context r0 = r3.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L55
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
            ne.AbstractC5868k.m23672d(r0, r2)
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L58
        L55:
            r4.show()
        L58:
            c8.v r4 = p040c8.C1427v.f5519a
            int r0 = com.live.R$id.mMlvDate
            android.view.View r0 = r3.m24026e(r0)
            com.widget.custom.MemoryListView r0 = (com.widget.custom.MemoryListView) r0
            int r0 = r0.getSelectedItemPosition()
            r4.m6651o0(r0)
            com.request.result.Channel r0 = r4.m6622H()
            r4.m6654q0(r0)
            ye.c r0 = ye.C7709c.m29787d()
            com.module.event.HideContentFragmentEvent r2 = new com.module.event.HideContentFragmentEvent
            r2.<init>()
            r0.m29801m(r2)
            b8.e r0 = r3.f23594d
            if (r0 == 0) goto L84
            java.util.ArrayList r1 = r0.m5298d()
        L84:
            java.lang.String r0 = r3.f23598h
            r4.m6655r(r1, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p263o8.ViewOnKeyListenerC5933k.m24012n(com.request.bean.EpgProgram, int):void");
    }

    /* renamed from: o */
    private final void m24013o(EpgProgram epgProgram) {
        int i10 = 0;
        EpgDate epgDate;
        a aVar;
        int selectedItemPosition = ((MemoryListView) m24026e(R$id.mMlvDate)).getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            C1153d c1153d = this.f23593c;
            if (c1153d != null) {
                i10 = c1153d.getCount();
            } else {
                i10 = 0;
            }
            if (selectedItemPosition < i10) {
                C1153d c1153d2 = this.f23593c;
                String str = null;
                if (c1153d2 != null) {
                    epgDate = c1153d2.getItem(selectedItemPosition);
                } else {
                    epgDate = null;
                }
                if (epgDate != null) {
                    str = epgDate.getYearInfo();
                }
                if (!AbstractC6567a.m25634d(str) && (aVar = this.f23595e) != null) {
                    AbstractC5868k.m23671c(epgDate);
                    aVar.mo21959o5(epgDate, epgProgram);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m24014p(int i10) {
        boolean z10;
        String str;
        boolean z11 = false;
        if (i10 == 0) {
            ((ImageView) m24026e(R$id.mIvUp)).setVisibility(4);
        } else {
            ((ImageView) m24026e(R$id.mIvUp)).setVisibility(0);
        }
        AbstractC5868k.m23671c(this.f23593c);
        if (i10 == r2.getCount() - 1) {
            ((ImageView) m24026e(R$id.mIvDown)).setVisibility(4);
        } else {
            ((ImageView) m24026e(R$id.mIvDown)).setVisibility(0);
        }
        int i11 = R$id.mTvLoading;
        ((TextView) m24026e(i11)).setText(R$string.loading);
        ((TextView) m24026e(i11)).setVisibility(0);
        C1155e c1155e = this.f23594d;
        EpgDate epgDate = null;
        if (c1155e != null) {
            a aVar = this.f23595e;
            if (aVar != null) {
                z10 = aVar.mo21948d4();
            } else {
                z10 = false;
            }
            a aVar2 = this.f23595e;
            if (aVar2 == null || (str = aVar2.mo21940J0()) == null) {
                str = "";
            }
            C1407f c1407f = C1407f.f5458a;
            String m6623I = C1427v.f5519a.m6623I();
            a aVar3 = this.f23595e;
            if (aVar3 != null) {
                z11 = aVar3.mo21948d4();
            }
            c1155e.m5301g(z10, str, null, c1407f.m6485F(m6623I, z11));
        }
        a aVar4 = this.f23595e;
        if (aVar4 != null) {
            C1153d c1153d = this.f23593c;
            if (c1153d != null) {
                epgDate = c1153d.getItem(i10);
            }
            aVar4.mo21947b4(epgDate);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r1 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r3.m5282a(((com.widget.custom.MemoryListView) m24026e(com.live.R$id.mMlvDate)).getSelectedItemPosition()) == true) goto L13;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m24015q() {
        /*
            r5 = this;
            int r0 = com.live.R$id.mMlvEpg
            android.view.View r1 = r5.m24026e(r0)
            com.widget.custom.MemoryListView r1 = (com.widget.custom.MemoryListView) r1
            r1.requestFocus()
            o8.k$a r1 = r5.f23595e
            r2 = 0
            if (r1 == 0) goto L15
            boolean r1 = r1.mo21948d4()
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L42
            b8.d r3 = r5.f23593c
            if (r3 == 0) goto L30
            int r4 = com.live.R$id.mMlvDate
            android.view.View r4 = r5.m24026e(r4)
            com.widget.custom.MemoryListView r4 = (com.widget.custom.MemoryListView) r4
            int r4 = r4.getSelectedItemPosition()
            boolean r3 = r3.m5282a(r4)
            r4 = 1
            if (r3 != r4) goto L30
            goto L31
        L30:
            r4 = 0
        L31:
            if (r4 == 0) goto L42
            b8.e r1 = r5.f23594d
            r3 = -1
            if (r1 == 0) goto L3d
            int r1 = r1.m5295a()
            goto L3e
        L3d:
            r1 = -1
        L3e:
            if (r1 == r3) goto L4d
        L40:
            r2 = r1
            goto L4d
        L42:
            if (r1 == 0) goto L4d
            b8.e r1 = r5.f23594d
            if (r1 == 0) goto L4d
            int r1 = r1.m5296b()
            goto L40
        L4d:
            android.view.View r0 = r5.m24026e(r0)
            com.widget.custom.MemoryListView r0 = (com.widget.custom.MemoryListView) r0
            r0.setSelectionTriggerItemSelect(r2)
            b8.e r0 = r5.f23594d
            if (r0 == 0) goto L5d
            r0.m5302h(r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p263o8.ViewOnKeyListenerC5933k.m24015q():void");
    }

    /* renamed from: r */
    private final void m24016r(boolean z10, boolean z11) {
        int selectedItemPosition;
        boolean z12;
        String str;
        this.f23596f = Boolean.valueOf(z10);
        if (z11) {
            int i10 = R$id.mTvLoading;
            ((TextView) m24026e(i10)).setText(R$string.loading);
            boolean z13 = false;
            ((TextView) m24026e(i10)).setVisibility(0);
            ((TextView) m24026e(i10)).requestFocus();
            C1155e c1155e = this.f23594d;
            if (c1155e != null) {
                a aVar = this.f23595e;
                if (aVar != null) {
                    z12 = aVar.mo21948d4();
                } else {
                    z12 = false;
                }
                a aVar2 = this.f23595e;
                if (aVar2 == null || (str = aVar2.mo21940J0()) == null) {
                    str = "";
                }
                C1407f c1407f = C1407f.f5458a;
                String m6623I = C1427v.f5519a.m6623I();
                a aVar3 = this.f23595e;
                if (aVar3 != null) {
                    z13 = aVar3.mo21948d4();
                }
                c1155e.m5301g(z12, str, null, c1407f.m6485F(m6623I, z13));
            }
        }
        if (z10) {
            selectedItemPosition = ((MemoryListView) m24026e(R$id.mMlvDate)).getSelectedItemPosition() - 1;
        } else {
            selectedItemPosition = ((MemoryListView) m24026e(R$id.mMlvDate)).getSelectedItemPosition() + 1;
        }
        if (selectedItemPosition >= 0) {
            int i11 = R$id.mMlvDate;
            if (selectedItemPosition < ((MemoryListView) m24026e(i11)).getCount() - 1) {
                C1153d c1153d = this.f23593c;
                if (c1153d != null) {
                    c1153d.m5286e(-1);
                }
                ((MemoryListView) m24026e(i11)).setSelectionTriggerItemSelect(selectedItemPosition);
                C1153d c1153d2 = this.f23593c;
                if (c1153d2 != null) {
                    c1153d2.m5286e(selectedItemPosition);
                    return;
                }
                return;
            }
        }
        m24022B(z10);
    }

    /* renamed from: s */
    private final void m24017s() {
        String str;
        AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m24026e(R$id.mTvChannel);
        Channel m6622H = C1427v.f5519a.m6622H();
        if (m6622H == null || (str = AbstractC5607a.m22776a(m6622H)) == null) {
            str = "";
        }
        autoFocusedTextView.setText(str);
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        int i10 = R$id.mMlvDate;
        MemoryListView memoryListView = (MemoryListView) m24026e(i10);
        AbstractC5868k.m23673e(memoryListView, "mMlvDate");
        this.f23593c = new C1153d(context, memoryListView);
        ((MemoryListView) m24026e(i10)).setAdapter((ListAdapter) this.f23593c);
        Context context2 = getContext();
        AbstractC5868k.m23673e(context2, C3384f.f14563X);
        C1155e c1155e = new C1155e(context2);
        this.f23594d = c1155e;
        c1155e.m5300f(new b());
        ((MemoryListView) m24026e(R$id.mMlvEpg)).setAdapter((ListAdapter) this.f23594d);
    }

    /* renamed from: t */
    private final void m24018t() {
        int i10 = R$id.mMlvDate;
        ((MemoryListView) m24026e(i10)).setOnKeyListener(this);
        int i11 = R$id.mMlvEpg;
        ((MemoryListView) m24026e(i11)).setOnKeyListener(this);
        ((MemoryListView) m24026e(i10)).setOnItemSelectedListener(new c());
        ((MemoryListView) m24026e(i11)).setOnItemSelectedListener(new d());
        ((MemoryListView) m24026e(i11)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o8.h
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j10) {
                ViewOnKeyListenerC5933k.m24019u(ViewOnKeyListenerC5933k.this, adapterView, view, i12, j10);
            }
        });
        ((MemoryListView) m24026e(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o8.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnKeyListenerC5933k.m24020v(ViewOnKeyListenerC5933k.this, view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m24019u(ViewOnKeyListenerC5933k viewOnKeyListenerC5933k, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(viewOnKeyListenerC5933k, "this$0");
        viewOnKeyListenerC5933k.m24010l(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m24020v(ViewOnKeyListenerC5933k viewOnKeyListenerC5933k, View view, boolean z10) {
        AbstractC5868k.m23674f(viewOnKeyListenerC5933k, "this$0");
        viewOnKeyListenerC5933k.m24000E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m24021w(int i10, boolean z10) {
        a aVar = this.f23595e;
        if (aVar != null) {
            C1153d c1153d = this.f23593c;
            AbstractC5868k.m23671c(c1153d);
            aVar.mo21945Y(c1153d.m5283b(), i10, z10);
        }
    }

    /* renamed from: B */
    public void m24022B(boolean z10) {
        boolean z11;
        String str;
        this.f23596f = null;
        if (C7252a.f27087a.m28072g() <= this.f23592b) {
            ((TextView) m24026e(R$id.mTvLoading)).setText(R$string.no_data);
        } else {
            ((TextView) m24026e(R$id.mTvLoading)).setText(R$string.no_data_because_timezone);
        }
        boolean z12 = false;
        ((TextView) m24026e(R$id.mTvLoading)).setVisibility(0);
        C1155e c1155e = this.f23594d;
        if (c1155e != null) {
            a aVar = this.f23595e;
            if (aVar != null) {
                z11 = aVar.mo21948d4();
            } else {
                z11 = false;
            }
            a aVar2 = this.f23595e;
            if (aVar2 == null || (str = aVar2.mo21940J0()) == null) {
                str = "";
            }
            C1407f c1407f = C1407f.f5458a;
            String m6623I = C1427v.f5519a.m6623I();
            a aVar3 = this.f23595e;
            if (aVar3 != null) {
                z12 = aVar3.mo21948d4();
            }
            c1155e.m5301g(z11, str, null, c1407f.m6485F(m6623I, z12));
        }
        C1153d c1153d = this.f23593c;
        if (c1153d != null) {
            c1153d.m5286e(-1);
        }
        ((MemoryListView) m24026e(R$id.mMlvDate)).requestFocus();
    }

    /* renamed from: C */
    public void m24023C() {
        boolean z10;
        String str;
        if (C7252a.f27087a.m28072g() <= this.f23592b) {
            ((TextView) m24026e(R$id.mTvLoading)).setText(R$string.no_data);
        } else {
            ((TextView) m24026e(R$id.mTvLoading)).setText(R$string.no_data_because_timezone);
        }
        boolean z11 = false;
        ((TextView) m24026e(R$id.mTvLoading)).setVisibility(0);
        C1155e c1155e = this.f23594d;
        if (c1155e != null) {
            a aVar = this.f23595e;
            if (aVar != null) {
                z10 = aVar.mo21948d4();
            } else {
                z10 = false;
            }
            a aVar2 = this.f23595e;
            if (aVar2 == null || (str = aVar2.mo21940J0()) == null) {
                str = "";
            }
            C1407f c1407f = C1407f.f5458a;
            String m6623I = C1427v.f5519a.m6623I();
            a aVar3 = this.f23595e;
            if (aVar3 != null) {
                z11 = aVar3.mo21948d4();
            }
            c1155e.m5301g(z10, str, null, c1407f.m6485F(m6623I, z11));
        }
    }

    /* renamed from: D */
    public final void m24024D() {
        C1155e c1155e = this.f23594d;
        if (c1155e != null) {
            c1155e.notifyDataSetChanged();
        }
    }

    @Override // p263o8.InterfaceC5941s
    /* renamed from: a */
    public void mo24025a(ArrayList arrayList, int i10) {
        String str;
        AbstractC5868k.m23674f(arrayList, "dates");
        C1427v c1427v = C1427v.f5519a;
        if (c1427v.m6621G()) {
            String m6623I = c1427v.m6623I();
            Channel m6630P = c1427v.m6630P();
            if (m6630P != null) {
                str = m6630P.getChannelCode();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(m6623I, str) && c1427v.m6625K() != -1) {
                i10 = c1427v.m6625K();
            }
        }
        C1153d c1153d = this.f23593c;
        if (c1153d != null) {
            c1153d.m5285d(arrayList);
        }
        int i11 = R$id.mMlvDate;
        ((MemoryListView) m24026e(i11)).requestFocus();
        if (i10 >= 3) {
            ((MemoryListView) m24026e(i11)).setSelectionFromTop(i10, AutoSizeUtils.dp2px(getContext(), 260.0f));
        } else {
            ((MemoryListView) m24026e(i11)).setSelectionTriggerItemSelect(i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public View m24026e(int i10) {
        Map map = this.f23599i;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17 = false;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (view != null && view.getId() == R$id.mMlvDate) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            switch (i10) {
                case 19:
                    C1153d c1153d = this.f23593c;
                    if (c1153d != null && c1153d.getCount() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15 || ((MemoryListView) m24026e(R$id.mMlvDate)).getSelectedItemPosition() == 0) {
                        return true;
                    }
                    break;
                case 20:
                    C1153d c1153d2 = this.f23593c;
                    if (c1153d2 != null && c1153d2.getCount() == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z16) {
                        int selectedItemPosition = ((MemoryListView) m24026e(R$id.mMlvDate)).getSelectedItemPosition();
                        C1153d c1153d3 = this.f23593c;
                        AbstractC5868k.m23671c(c1153d3);
                        if (selectedItemPosition == c1153d3.getCount() - 1) {
                        }
                    }
                    return true;
                case 21:
                    a aVar = this.f23595e;
                    if (aVar != null) {
                        aVar.mo21943P4();
                    }
                    return true;
                case 22:
                    C1155e c1155e = this.f23594d;
                    if (c1155e != null && c1155e.getCount() == 0) {
                        z17 = true;
                    }
                    if (!z17) {
                        C1153d c1153d4 = this.f23593c;
                        if (c1153d4 != null) {
                            c1153d4.m5286e(((MemoryListView) m24026e(R$id.mMlvDate)).getSelectedItemPosition());
                        }
                        m24015q();
                    }
                    return true;
            }
        } else {
            if (view != null && view.getId() == R$id.mMlvEpg) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                switch (i10) {
                    case 19:
                        C1155e c1155e2 = this.f23594d;
                        if (c1155e2 != null && c1155e2.getCount() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13 && ((MemoryListView) m24026e(R$id.mMlvEpg)).getSelectedItemPosition() == 0) {
                            if (((MemoryListView) m24026e(R$id.mMlvDate)).getSelectedItemPosition() == 0) {
                                return true;
                            }
                            m24016r(true, true);
                            return true;
                        }
                        break;
                    case 20:
                        C1155e c1155e3 = this.f23594d;
                        if (c1155e3 != null && c1155e3.getCount() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            int selectedItemPosition2 = ((MemoryListView) m24026e(R$id.mMlvEpg)).getSelectedItemPosition();
                            C1155e c1155e4 = this.f23594d;
                            AbstractC5868k.m23671c(c1155e4);
                            if (selectedItemPosition2 == c1155e4.getCount() - 1) {
                                int i11 = R$id.mMlvDate;
                                if (((MemoryListView) m24026e(i11)).getSelectedItemPosition() == ((MemoryListView) m24026e(i11)).getCount() - 1) {
                                    return true;
                                }
                                m24016r(false, true);
                                return true;
                            }
                        }
                        break;
                    case 21:
                        C1153d c1153d5 = this.f23593c;
                        if (c1153d5 != null) {
                            c1153d5.m5286e(-1);
                        }
                        ((MemoryListView) m24026e(R$id.mMlvDate)).requestFocus();
                        C1155e c1155e5 = this.f23594d;
                        if (c1155e5 != null) {
                            c1155e5.m5302h(-1);
                        }
                        return true;
                    case 22:
                        return true;
                }
            }
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public final void setOnLiveEpgListener(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f23595e = aVar;
    }

    public final void setParentType(String str) {
        AbstractC5868k.m23674f(str, "parentType");
        this.f23598h = str;
    }

    /* renamed from: x */
    public void m24027x(boolean z10) {
        m24016r(z10, false);
    }

    /* renamed from: y */
    public void m24028y(ArrayList arrayList) {
        String str;
        boolean z10;
        String str2;
        boolean z11;
        AbstractC5868k.m23674f(arrayList, "epgPrograms");
        ((TextView) m24026e(R$id.mTvLoading)).setVisibility(8);
        C1155e c1155e = this.f23594d;
        boolean z12 = false;
        if (c1155e != null) {
            a aVar = this.f23595e;
            if (aVar != null) {
                z10 = aVar.mo21948d4();
            } else {
                z10 = false;
            }
            a aVar2 = this.f23595e;
            if (aVar2 == null || (str2 = aVar2.mo21940J0()) == null) {
                str2 = "";
            }
            C1407f c1407f = C1407f.f5458a;
            String m6623I = C1427v.f5519a.m6623I();
            a aVar3 = this.f23595e;
            if (aVar3 != null) {
                z11 = aVar3.mo21948d4();
            } else {
                z11 = false;
            }
            c1155e.m5301g(z10, str2, arrayList, c1407f.m6485F(m6623I, z11));
        }
        C1427v c1427v = C1427v.f5519a;
        if (c1427v.m6621G()) {
            String m6623I2 = c1427v.m6623I();
            Channel m6630P = c1427v.m6630P();
            if (m6630P != null) {
                str = m6630P.getChannelCode();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(m6623I2, str) && c1427v.m6625K() != -1) {
                C1155e c1155e2 = this.f23594d;
                if (c1155e2 != null && c1155e2.getCount() == 0) {
                    z12 = true;
                }
                if (!z12) {
                    ((MemoryListView) m24026e(R$id.mMlvDate)).setSelection(c1427v.m6625K());
                    C1153d c1153d = this.f23593c;
                    if (c1153d != null) {
                        c1153d.m5286e(c1427v.m6625K());
                    }
                    m24015q();
                }
            }
        }
    }

    /* renamed from: z */
    public void m24029z(ArrayList arrayList, int i10) {
        boolean z10;
        String str;
        AbstractC5868k.m23674f(arrayList, "epgPrograms");
        this.f23596f = null;
        ((TextView) m24026e(R$id.mTvLoading)).setVisibility(8);
        C1155e c1155e = this.f23594d;
        if (c1155e != null) {
            a aVar = this.f23595e;
            boolean z11 = false;
            if (aVar != null) {
                z10 = aVar.mo21948d4();
            } else {
                z10 = false;
            }
            a aVar2 = this.f23595e;
            if (aVar2 == null || (str = aVar2.mo21940J0()) == null) {
                str = "";
            }
            C1407f c1407f = C1407f.f5458a;
            String m6623I = C1427v.f5519a.m6623I();
            a aVar3 = this.f23595e;
            if (aVar3 != null) {
                z11 = aVar3.mo21948d4();
            }
            c1155e.m5301g(z10, str, arrayList, c1407f.m6485F(m6623I, z11));
        }
        ((MemoryListView) m24026e(R$id.mMlvEpg)).postDelayed(new Runnable() { // from class: o8.j
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnKeyListenerC5933k.m23999A(ViewOnKeyListenerC5933k.this);
            }
        }, 200L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnKeyListenerC5933k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnKeyListenerC5933k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f23599i = new LinkedHashMap();
        this.f23591a = ViewOnKeyListenerC5933k.class.getSimpleName();
        this.f23592b = 604800000L;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.layout_live_epg, (ViewGroup) this, true);
        m24018t();
        m24017s();
    }
}
