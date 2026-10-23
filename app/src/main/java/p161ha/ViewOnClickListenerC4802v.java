package p161ha;

import ac.C0214v;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.DeviceData;
import com.request.result.LoginResult;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p043ce.AbstractC1501m;
import p043ce.AbstractC1508t;
import p161ha.ViewOnClickListenerC4799t0;
import p301qb.InterfaceC6422s;
import p399x9.C7530e;
import p400xa.AbstractC7555b0;
import p400xa.C7556b1;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: ha.v */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4802v extends C7767e implements View.OnClickListener, InterfaceC6422s {

    /* renamed from: P0 */
    public static final a f20235P0 = new a(null);

    /* renamed from: F0 */
    private final Context f20236F0;

    /* renamed from: G0 */
    private final List f20237G0;

    /* renamed from: H0 */
    private final String f20238H0;

    /* renamed from: I0 */
    private final boolean f20239I0;

    /* renamed from: J0 */
    private final InterfaceC1312h f20240J0;

    /* renamed from: K0 */
    private final InterfaceC1312h f20241K0;

    /* renamed from: L0 */
    private final String f20242L0;

    /* renamed from: M0 */
    private View f20243M0;

    /* renamed from: N0 */
    private b f20244N0;

    /* renamed from: O0 */
    public Map f20245O0;

    /* renamed from: ha.v$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ ViewOnClickListenerC4802v m19851b(a aVar, Context context, List list, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z10 = true;
            }
            return aVar.m19852a(context, list, str, z10);
        }

        /* renamed from: a */
        public final ViewOnClickListenerC4802v m19852a(Context context, List list, String str, boolean z10) {
            AbstractActivityC0302c abstractActivityC0302c;
            AbstractC0729o m3294d4;
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(list, "deviceList");
            AbstractC5868k.m23674f(str, "temToken");
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = new ViewOnClickListenerC4802v(context, list, str, z10);
            if (context instanceof AbstractActivityC0302c) {
                abstractActivityC0302c = (AbstractActivityC0302c) context;
            } else {
                abstractActivityC0302c = null;
            }
            if (abstractActivityC0302c != null && (m3294d4 = abstractActivityC0302c.m3294d4()) != null) {
                viewOnClickListenerC4802v.mo3277E9(m3294d4, "device_limit_dialog");
            }
            return viewOnClickListenerC4802v;
        }
    }

    /* renamed from: ha.v$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a0 */
        void mo11902a0();

        /* renamed from: b0 */
        void mo11903b0();

        /* renamed from: c0 */
        void mo11904c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.v$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f20246a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a */
        public final C7530e invoke() {
            return new C7530e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.v$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a */
        public final C0214v invoke() {
            return new C0214v(ViewOnClickListenerC4802v.this);
        }
    }

    /* renamed from: ha.v$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f20248a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m19855a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(false, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19855a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ha.v$f */
    /* loaded from: classes2.dex */
    public static final class f implements ViewOnClickListenerC4799t0.a {
        f() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            int m6992k;
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            ViewOnClickListenerC4802v.this.m19838M9().m28849g().size();
            List m28849g = ViewOnClickListenerC4802v.this.m19838M9().m28849g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m28849g) {
                if (((DeviceData) obj).isSelected()) {
                    arrayList.add(obj);
                }
            }
            arrayList.size();
            List m28849g2 = ViewOnClickListenerC4802v.this.m19838M9().m28849g();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m28849g2) {
                if (((DeviceData) obj2).isSelected()) {
                    arrayList2.add(obj2);
                }
            }
            m6992k = AbstractC1501m.m6992k(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(m6992k);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((DeviceData) it.next()).getSn());
            }
            if (arrayList3.isEmpty()) {
                return;
            }
            ((LoadingView) ViewOnClickListenerC4802v.this.m19843J9(R$id.loadingView)).setVisibility(0);
            ViewOnClickListenerC4802v.this.m19839N9().m745b(ViewOnClickListenerC4802v.this.m19845O9(), arrayList3);
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    /* renamed from: ha.v$g */
    /* loaded from: classes2.dex */
    public static final class g implements ViewOnClickListenerC4799t0.a {

        /* renamed from: ha.v$g$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f20251a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m19856a(LoginResult loginResult) {
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m19856a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        g() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3119R6 = ViewOnClickListenerC4802v.this.m3119R6();
                AbstractC5868k.m23671c(m3119R6);
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3119R6, ViewOnClickListenerC4802v.this.m19846P9(), null, a.f20251a, 4, null);
            }
            ViewOnClickListenerC4802v.this.mo3279p9();
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    /* renamed from: ha.v$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m19857a(boolean z10) {
            ((Button) ViewOnClickListenerC4802v.this.m19843J9(R$id.btnDelete)).setEnabled(z10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19857a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    public ViewOnClickListenerC4802v(Context context, List list, String str, boolean z10) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC5868k.m23674f(str, "temToken");
        this.f20245O0 = new LinkedHashMap();
        this.f20236F0 = context;
        this.f20237G0 = list;
        this.f20238H0 = str;
        this.f20239I0 = z10;
        m5965b = AbstractC1314j.m5965b(c.f20246a);
        this.f20240J0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new d());
        this.f20241K0 = m5965b2;
        this.f20242L0 = ViewOnClickListenerC4802v.class.getSimpleName();
    }

    /* renamed from: M9 */
    public final C7530e m19838M9() {
        return (C7530e) this.f20240J0.getValue();
    }

    /* renamed from: N9 */
    public final C0214v m19839N9() {
        return (C0214v) this.f20241K0.getValue();
    }

    /* renamed from: R9 */
    private final void m19840R9() {
        List m7001F;
        String str = null;
        if (this.f20237G0.isEmpty()) {
            ((TextView) m19843J9(R$id.tvTips)).setVisibility(8);
            ((TextView) m19843J9(R$id.tvContent)).setVisibility(8);
            ((TextView) m19843J9(R$id.mTvNoDevices)).setVisibility(0);
            Button button = (Button) m19843J9(R$id.btnDelete);
            Context m3096J6 = m3096J6();
            if (m3096J6 != null) {
                str = m3096J6.getString(R$string.commmon_confirm_text);
            }
            button.setText(str);
            return;
        }
        int i10 = R$id.tvTips;
        ((TextView) m19843J9(i10)).setVisibility(0);
        ((TextView) m19843J9(R$id.tvContent)).setVisibility(0);
        ((TextView) m19843J9(R$id.mTvNoDevices)).setVisibility(8);
        Button button2 = (Button) m19843J9(R$id.btnDelete);
        Context m3096J62 = m3096J6();
        if (m3096J62 != null) {
            str = m3096J62.getString(R$string.device_limit_reached_remove);
        }
        button2.setText(str);
        int i11 = R$id.mGridDevice;
        ((VerticalGridView) m19843J9(i11)).setAdapter(m19838M9());
        C7530e m19838M9 = m19838M9();
        m7001F = AbstractC1508t.m7001F(this.f20237G0);
        if ((!m7001F.isEmpty()) && m7001F.size() > 0) {
            ((DeviceData) m7001F.get(0)).setSelected(true);
        }
        m19838M9.m28856n(m7001F);
        TextView textView = (TextView) m19843J9(i10);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.device_limit_reached);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.device_limit_reached)");
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f20237G0.size())}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        ((VerticalGridView) m19843J9(i11)).post(new Runnable() { // from class: ha.t
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC4802v.m19841S9(ViewOnClickListenerC4802v.this);
            }
        });
        VerticalGridView verticalGridView = (VerticalGridView) m19843J9(i11);
        AbstractC5868k.m23673e(verticalGridView, "mGridDevice");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
    }

    /* renamed from: S9 */
    public static final void m19841S9(ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
        int i10 = 0;
        AbstractC5868k.m23674f(viewOnClickListenerC4802v, "this$0");
        int i11 = R$id.mGridDevice;
        ViewGroup.LayoutParams layoutParams = ((VerticalGridView) viewOnClickListenerC4802v.m19843J9(i11)).getLayoutParams();
        if (viewOnClickListenerC4802v.f20237G0.size() <= 2) {
            i10 = AbstractC7786b.m30163g(251);
        } else {
            i10 = -1;
        }
        layoutParams.height = i10;
        ((VerticalGridView) viewOnClickListenerC4802v.m19843J9(i11)).setLayoutParams(layoutParams);
    }

    /* renamed from: U9 */
    public static final boolean m19842U9(ViewOnClickListenerC4802v viewOnClickListenerC4802v, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        String str;
        String str2;
        String str3;
        String string;
        String string2;
        String string3;
        AbstractC5868k.m23674f(viewOnClickListenerC4802v, "this$0");
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = viewOnClickListenerC4802v.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = viewOnClickListenerC4802v.m3096J6();
            if (m3096J6 == null || (string3 = m3096J6.getString(R$string.relogin_tips)) == null) {
                str = "";
            } else {
                str = string3;
            }
            Context m3096J62 = viewOnClickListenerC4802v.m3096J6();
            if (m3096J62 == null || (string2 = m3096J62.getString(R$string.commmon_cancel_text)) == null) {
                str2 = "";
            } else {
                str2 = string2;
            }
            Context m3096J63 = viewOnClickListenerC4802v.m3096J6();
            if (m3096J63 == null || (string = m3096J63.getString(R$string.commmon_confirm_text)) == null) {
                str3 = "";
            } else {
                str3 = string;
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, str2, str3, false, new g(), false, null, false, 384, null);
            return true;
        }
        return false;
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20245O0.clear();
    }

    /* renamed from: J9 */
    public View m19843J9(int i10) {
        View findViewById;
        Map map = this.f20245O0;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r3.equals("800") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r3.equals("500") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r3.equals("1") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r3.equals("aaa100095") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r3.equals("portal100000") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r3.equals("1000") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0060, code lost:
    
        r3 = r2.f20244N0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0062, code lost:
    
        if (r3 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0064, code lost:
    
        r3.mo11904c0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // p301qb.InterfaceC6422s
    /* renamed from: K3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo19844K3(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "errCode"
            ne.AbstractC5868k.m23674f(r3, r0)
            int r0 = com.module.R$id.loadingView
            android.view.View r0 = r2.m19843J9(r0)
            com.module.view.LoadingView r0 = (com.module.view.LoadingView) r0
            r1 = 8
            r0.setVisibility(r1)
            int r0 = r3.hashCode()
            switch(r0) {
                case -396103157: goto L57;
                case -338366660: goto L4e;
                case -338366659: goto L3e;
                case 49: goto L35;
                case 52469: goto L2c;
                case 55352: goto L23;
                case 1507423: goto L1a;
                default: goto L19;
            }
        L19:
            goto L68
        L1a:
            java.lang.String r0 = "1000"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L68
        L23:
            java.lang.String r0 = "800"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L68
        L2c:
            java.lang.String r0 = "500"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L68
        L35:
            java.lang.String r0 = "1"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L68
        L3e:
            java.lang.String r0 = "aaa100096"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L68
            ha.v$b r3 = r2.f20244N0
            if (r3 == 0) goto L6f
            r3.mo11902a0()
            goto L6f
        L4e:
            java.lang.String r0 = "aaa100095"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L68
        L57:
            java.lang.String r0 = "portal100000"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L68
        L60:
            ha.v$b r3 = r2.f20244N0
            if (r3 == 0) goto L6f
            r3.mo11904c0()
            goto L6f
        L68:
            ha.v$b r3 = r2.f20244N0
            if (r3 == 0) goto L6f
            r3.mo11903b0()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p161ha.ViewOnClickListenerC4802v.mo19844K3(java.lang.String):void");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: O9 */
    public final String m19845O9() {
        return this.f20238H0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_device_limit, viewGroup, false);
        this.f20243M0 = inflate;
        return inflate;
    }

    /* renamed from: P9 */
    public final boolean m19846P9() {
        return this.f20239I0;
    }

    /* renamed from: Q9 */
    public final void m19847Q9(List list) {
        List m7001F;
        AbstractC5868k.m23674f(list, "deviceList");
        String str = null;
        if (list.isEmpty()) {
            ((TextView) m19843J9(R$id.tvTips)).setVisibility(8);
            ((TextView) m19843J9(R$id.tvContent)).setVisibility(8);
            ((TextView) m19843J9(R$id.mTvNoDevices)).setVisibility(0);
            Button button = (Button) m19843J9(R$id.btnDelete);
            Context m3096J6 = m3096J6();
            if (m3096J6 != null) {
                str = m3096J6.getString(R$string.commmon_confirm_text);
            }
            button.setText(str);
            return;
        }
        ((TextView) m19843J9(R$id.tvTips)).setVisibility(0);
        ((TextView) m19843J9(R$id.tvContent)).setVisibility(0);
        ((TextView) m19843J9(R$id.mTvNoDevices)).setVisibility(8);
        Button button2 = (Button) m19843J9(R$id.btnDelete);
        Context m3096J62 = m3096J6();
        if (m3096J62 != null) {
            str = m3096J62.getString(R$string.device_limit_reached_remove);
        }
        button2.setText(str);
        C7530e m19838M9 = m19838M9();
        m7001F = AbstractC1508t.m7001F(list);
        m19838M9.m28856n(m7001F);
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: T9 */
    public final void m19848T9() {
        Button button = (Button) m19843J9(R$id.btnDelete);
        AbstractC5868k.m23673e(button, "btnDelete");
        AbstractC7555b0.m28955i(button, this);
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: ha.u
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean m19842U9;
                    m19842U9 = ViewOnClickListenerC4802v.m19842U9(ViewOnClickListenerC4802v.this, dialogInterface, i10, keyEvent);
                    return m19842U9;
                }
            });
        }
        m19838M9().m28862t(new h());
    }

    /* renamed from: V9 */
    public final void m19849V9(b bVar) {
        AbstractC5868k.m23674f(bVar, "listener");
        this.f20244N0 = bVar;
    }

    @Override // p301qb.InterfaceC6422s
    /* renamed from: a0 */
    public void mo19850a0() {
        ((LoadingView) m19843J9(R$id.loadingView)).setVisibility(8);
        b bVar = this.f20244N0;
        if (bVar != null) {
            bVar.mo11902a0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(1640), AbstractC7786b.m30163g(948));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        m19840R9();
        m19848T9();
        m3287z9(false);
        super.mo3176k8(view, bundle);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        String string2;
        String string3;
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        int i10 = R$id.btnDelete;
        if (id2 == i10) {
            CharSequence text = ((Button) m19843J9(i10)).getText();
            Context m3096J6 = m3096J6();
            if (m3096J6 != null) {
                str = m3096J6.getString(R$string.commmon_confirm_text);
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(text, str)) {
                mo3279p9();
                InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
                if (interfaceC7251a != null) {
                    AbstractC0729o m3136X6 = m3136X6();
                    AbstractC5868k.m23673e(m3136X6, "parentFragmentManager");
                    InterfaceC7251a.a.m28064a(interfaceC7251a, m3136X6, false, null, e.f20248a, 4, null);
                    return;
                }
                return;
            }
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J62 = m3096J6();
            if (m3096J62 == null || (string3 = m3096J62.getString(R$string.remove_device_tips)) == null) {
                str2 = "";
            } else {
                str2 = string3;
            }
            Context m3096J63 = m3096J6();
            if (m3096J63 == null || (string2 = m3096J63.getString(R$string.commmon_cancel_text)) == null) {
                str3 = "";
            } else {
                str3 = string2;
            }
            Context m3096J64 = m3096J6();
            if (m3096J64 == null || (string = m3096J64.getString(R$string.commmon_confirm_text)) == null) {
                str4 = "";
            } else {
                str4 = string;
            }
            C7556b1.m28962j(c7556b1, m3110N8, str2, str3, str4, false, new f(), false, null, false, 384, null);
        }
    }
}
