package p101da;

import ac.C0201r2;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.request.result.UserInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p102db.C4053l;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p161ha.C4772h;
import p170i2.C4842a;
import p201k2.C5096m;
import p301qb.InterfaceC6421r1;
import p400xa.C7589m1;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: da.d */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4018d extends C7767e implements View.OnClickListener, TextWatcher, View.OnKeyListener, InterfaceC6421r1 {

    /* renamed from: H0 */
    private int f17802H0;

    /* renamed from: I0 */
    private a f17803I0;

    /* renamed from: J0 */
    private DialogInterface.OnDismissListener f17804J0;

    /* renamed from: K0 */
    private boolean f17805K0;

    /* renamed from: L0 */
    private final InterfaceC1312h f17806L0;

    /* renamed from: M0 */
    public Map f17807M0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f17800F0 = "InputPasswordDialog";

    /* renamed from: G0 */
    private String f17801G0 = "";

    /* renamed from: da.d$a */
    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: da.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C7836a {
            /* renamed from: a */
            public static void m16992a(a aVar) {
            }
        }

        void cancel();

        /* renamed from: q0 */
        void mo11609q0();

        /* renamed from: r0 */
        void mo11610r0();

        /* renamed from: x */
        void mo11611x();
    }

    /* renamed from: da.d$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0201r2 invoke() {
            return new C0201r2(ViewOnClickListenerC4018d.this);
        }
    }

    /* renamed from: da.d$c */
    /* loaded from: classes2.dex */
    public static final class c implements a {
        c() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
            a aVar = ViewOnClickListenerC4018d.this.f17803I0;
            if (aVar != null) {
                aVar.cancel();
            }
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            if (ViewOnClickListenerC4018d.this.f17805K0) {
                ViewOnClickListenerC4018d.this.m16975W9(true);
                ViewOnClickListenerC4018d.this.m16973R9().m721c("1");
                return;
            }
            ViewOnClickListenerC4018d.this.mo3279p9();
            a aVar = ViewOnClickListenerC4018d.this.f17803I0;
            if (aVar != null) {
                aVar.mo11610r0();
            }
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
            a aVar = ViewOnClickListenerC4018d.this.f17803I0;
            if (aVar != null) {
                aVar.mo11611x();
            }
        }
    }

    public ViewOnClickListenerC4018d() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f17806L0 = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R9 */
    public final C0201r2 m16973R9() {
        return (C0201r2) this.f17806L0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U9 */
    public static final boolean m16974U9(ViewOnClickListenerC4018d viewOnClickListenerC4018d, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        a aVar;
        AbstractC5868k.m23674f(viewOnClickListenerC4018d, "this$0");
        if (keyEvent.getAction() == 0 && (aVar = viewOnClickListenerC4018d.f17803I0) != null) {
            aVar.mo11611x();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public final void m16975W9(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m16981J9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
        ((EditText) m16981J9(R$id.mEditPasswordFirst)).setEnabled(!z10);
        ((EditText) m16981J9(R$id.mEditPasswordSecond)).setEnabled(!z10);
        ((EditText) m16981J9(R$id.mEditPasswordThird)).setEnabled(!z10);
        ((EditText) m16981J9(R$id.mEditPasswordFourth)).setEnabled(!z10);
        ((Button) m16981J9(R$id.mButtonConfirm)).setEnabled(!z10);
        ((Button) m16981J9(R$id.mButtonCancel)).setEnabled(!z10);
        ((TextView) m16981J9(R$id.tvForget)).setEnabled(!z10);
    }

    /* renamed from: aa */
    private final void m16976aa() {
        C4053l.a aVar = C4053l.f17879P0;
        if (!aVar.m17070a() && !aVar.m17071b(C4053l.c.InputPassword)) {
            aVar.m17072c(true);
            final C4053l c4053l = new C4053l();
            int i10 = R$id.tvForget;
            TextView textView = (TextView) m16981J9(i10);
            AbstractC5868k.m23673e(textView, "tvForget");
            c4053l.m17069ea(textView);
            c4053l.m17067ca(C4053l.b.TOP_LEFT);
            c4053l.m17065aa(R$layout.layout_guide_child_lock_input);
            c4053l.m17066ba(0, 40);
            ((TextView) m16981J9(i10)).postDelayed(new Runnable() { // from class: da.c
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC4018d.m16977ba(ViewOnClickListenerC4018d.this, c4053l);
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m16977ba(ViewOnClickListenerC4018d viewOnClickListenerC4018d, C4053l c4053l) {
        AbstractC5868k.m23674f(viewOnClickListenerC4018d, "this$0");
        AbstractC5868k.m23674f(c4053l, "$guideDialog");
        AbstractC0729o m3119R6 = viewOnClickListenerC4018d.m3119R6();
        if (m3119R6 != null) {
            c4053l.mo3277E9(m3119R6, "ChildLockGuide");
            C4053l.f17879P0.m17073d(C4053l.c.InputPassword, true);
        }
    }

    /* renamed from: ca */
    private final void m16978ca() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) ((EditText) m16981J9(R$id.mEditPasswordFirst)).getText());
        sb2.append((Object) ((EditText) m16981J9(R$id.mEditPasswordSecond)).getText());
        sb2.append((Object) ((EditText) m16981J9(R$id.mEditPasswordThird)).getText());
        sb2.append((Object) ((EditText) m16981J9(R$id.mEditPasswordFourth)).getText());
        this.f17801G0 = sb2.toString();
        if (m16985S9()) {
            this.f17802H0 = 0;
            m16982O9();
            String m3172j7 = m3172j7(R$string.input_more_error_tip);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.input_more_error_tip)");
            m16988X9(m3172j7, false);
            return;
        }
        if (!TextUtils.isEmpty(this.f17801G0)) {
            String str = this.f17801G0;
            AbstractC4161e.a aVar = AbstractC4161e.f18225a;
            if (AbstractC5868k.m23669a(str, aVar.m17399b())) {
                this.f17802H0 = 0;
                aVar.m17398a();
                aVar.m17404g(System.currentTimeMillis());
                m16983P9();
                a aVar2 = this.f17803I0;
                if (aVar2 != null) {
                    AbstractC5868k.m23671c(aVar2);
                    aVar2.mo11610r0();
                }
                aVar.m17403f(System.currentTimeMillis());
                m16984Q9();
                if (!this.f17805K0) {
                    mo3279p9();
                    return;
                } else {
                    m16975W9(true);
                    m16973R9().m721c("1");
                    return;
                }
            }
        }
        m16982O9();
        if (m16985S9()) {
            this.f17802H0 = 0;
            String m3172j72 = m3172j7(R$string.input_more_error_tip);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.input_more_error_tip)");
            m16988X9(m3172j72, false);
            return;
        }
        int i10 = this.f17802H0 + 1;
        this.f17802H0 = i10;
        if (i10 >= 10) {
            AbstractC4161e.f18225a.m17405h();
        }
        String m3172j73 = m3172j7(R$string.pwd_input_error);
        AbstractC5868k.m23673e(m3172j73, "getString(R.string.pwd_input_error)");
        m16988X9(m3172j73, false);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f17807M0.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3.equals("aaa100027") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r3.equals("aaa100028") == false) goto L15;
     */
    @Override // p301qb.InterfaceC6421r1
    /* renamed from: H3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo16980H3(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "errCode"
            ne.AbstractC5868k.m23674f(r3, r0)
            r0 = 0
            r2.m16975W9(r0)
            int r1 = r3.hashCode()
            switch(r1) {
                case -338366875: goto L31;
                case -338366874: goto L28;
                case 68379: goto L11;
                default: goto L10;
            }
        L10:
            goto L5e
        L11:
            java.lang.String r1 = "EA7"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L5e
            int r3 = com.module.R$string.network_timed_out
            java.lang.String r3 = r2.m3172j7(r3)
            java.lang.String r1 = "getString(R.string.network_timed_out)"
            ne.AbstractC5868k.m23673e(r3, r1)
            r2.m16988X9(r3, r0)
            goto L6c
        L28:
            java.lang.String r1 = "aaa100028"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3a
            goto L5e
        L31:
            java.lang.String r1 = "aaa100027"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3a
            goto L5e
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r1 = com.module.R$string.error_code_net_type
            java.lang.String r1 = r2.m3172j7(r1)
            r3.append(r1)
            r1 = 50
            r3.append(r1)
            int r1 = com.module.R$string.cdn_ee2
            java.lang.String r1 = r2.m3172j7(r1)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.m16988X9(r3, r0)
            goto L6c
        L5e:
            int r3 = com.module.R$string.cr_switch_open_failed
            java.lang.String r3 = r2.m3172j7(r3)
            java.lang.String r1 = "getString(R.string.cr_switch_open_failed)"
            ne.AbstractC5868k.m23673e(r3, r1)
            r2.m16988X9(r3, r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101da.ViewOnClickListenerC4018d.mo16980H3(java.lang.String):void");
    }

    /* renamed from: J9 */
    public View m16981J9(int i10) {
        View findViewById;
        Map map = this.f17807M0;
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
    public final void m16982O9() {
        int i10 = R$id.mEditPasswordFirst;
        ((EditText) m16981J9(i10)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordSecond)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordThird)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordFourth)).setText("");
        ((EditText) m16981J9(i10)).requestFocus();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_input_password, viewGroup, false);
    }

    /* renamed from: P9 */
    public final void m16983P9() {
        ((EditText) m16981J9(R$id.mEditPasswordFirst)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordSecond)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordThird)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordFourth)).setText("");
        ((DialogBottomBar) m16981J9(R$id.mBottomBar)).m12079e();
    }

    /* renamed from: Q9 */
    public final void m16984Q9() {
        ((EditText) m16981J9(R$id.mEditPasswordFirst)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordSecond)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordThird)).setText("");
        ((EditText) m16981J9(R$id.mEditPasswordFourth)).setText("");
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: S9 */
    public final boolean m16985S9() {
        return C4160d.f18217d.m17391c();
    }

    /* renamed from: T9 */
    public final void m16986T9() {
        this.f17805K0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V7 */
    public void mo3131V7(boolean z10) {
        if (z10) {
            m16983P9();
        }
        super.mo3131V7(z10);
    }

    /* renamed from: V9 */
    public final void m16987V9() {
        ((Button) m16981J9(R$id.mButtonConfirm)).setOnClickListener(this);
        ((Button) m16981J9(R$id.mButtonCancel)).setOnClickListener(this);
        int i10 = R$id.tvForget;
        ((TextView) m16981J9(i10)).setOnClickListener(this);
        int i11 = R$id.mEditPasswordFirst;
        ((EditText) m16981J9(i11)).addTextChangedListener(this);
        int i12 = R$id.mEditPasswordSecond;
        ((EditText) m16981J9(i12)).addTextChangedListener(this);
        int i13 = R$id.mEditPasswordThird;
        ((EditText) m16981J9(i13)).addTextChangedListener(this);
        int i14 = R$id.mEditPasswordFourth;
        ((EditText) m16981J9(i14)).addTextChangedListener(this);
        ((EditText) m16981J9(i11)).setOnKeyListener(this);
        ((EditText) m16981J9(i12)).setOnKeyListener(this);
        ((EditText) m16981J9(i13)).setOnKeyListener(this);
        ((EditText) m16981J9(i14)).setOnKeyListener(this);
        if (C4842a.f20329a.m19920a().m19931H()) {
            m16976aa();
        } else {
            ((TextView) m16981J9(i10)).setVisibility(8);
        }
    }

    /* renamed from: X9 */
    public final void m16988X9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        AbstractC5868k.m23674f(str, "msg");
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m16981J9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: Y9 */
    public final void m16989Y9(DialogInterface.OnDismissListener onDismissListener) {
        AbstractC5868k.m23674f(onDismissListener, "onDismissListener");
        this.f17804J0 = onDismissListener;
    }

    /* renamed from: Z9 */
    public final void m16990Z9(a aVar) {
        this.f17803I0 = aVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ((DialogBottomBar) m16981J9(R$id.mBottomBar)).m12079e();
        int i10 = R$id.mEditPasswordFirst;
        if (((EditText) m16981J9(i10)).hasFocus() && ((EditText) m16981J9(i10)).length() == 1) {
            ((EditText) m16981J9(R$id.mEditPasswordSecond)).requestFocus();
            return;
        }
        int i11 = R$id.mEditPasswordSecond;
        if (((EditText) m16981J9(i11)).hasFocus() && ((EditText) m16981J9(i11)).length() == 1) {
            ((EditText) m16981J9(R$id.mEditPasswordThird)).requestFocus();
            return;
        }
        int i12 = R$id.mEditPasswordThird;
        if (((EditText) m16981J9(i12)).hasFocus() && ((EditText) m16981J9(i12)).length() == 1) {
            ((EditText) m16981J9(R$id.mEditPasswordFourth)).requestFocus();
            return;
        }
        int i13 = R$id.mEditPasswordFourth;
        if (((EditText) m16981J9(i13)).hasFocus() && ((EditText) m16981J9(i13)).length() == 1) {
            ((Button) m16981J9(R$id.mButtonConfirm)).requestFocus();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        Window window;
        super.mo3170i8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            window = m3280r9.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = AbstractC7786b.m30166j(980);
            int m30163g = AbstractC7786b.m30163g(680);
            attributes.height = m30163g;
            window.setLayout(attributes.width, m30163g);
        }
        Dialog m3280r92 = m3280r9();
        if (m3280r92 != null) {
            m3280r92.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: da.b
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean m16974U9;
                    m16974U9 = ViewOnClickListenerC4018d.m16974U9(ViewOnClickListenerC4018d.this, dialogInterface, i10, keyEvent);
                    return m16974U9;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        if (this.f17805K0) {
            TextView textView = (TextView) m16981J9(R$id.mDialogTitle);
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            textView.setText(m3096J6.getResources().getString(R$string.adult_live_channels));
            ((TextView) m16981J9(R$id.mTvPwd)).setVisibility(8);
            int i10 = R$id.mTvOpenLiveAdult;
            ((TextView) m16981J9(i10)).setVisibility(0);
            TextView textView2 = (TextView) m16981J9(i10);
            Context m3096J62 = m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            textView2.setText(Html.fromHtml(m3096J62.getResources().getString(R$string.adult_need_pwd_to_show_live)));
        }
        m16987V9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        a aVar = this.f17803I0;
        if (aVar != null) {
            aVar.cancel();
        }
        m16983P9();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mButtonConfirm) {
            m16978ca();
            return;
        }
        if (id2 == R$id.mButtonCancel) {
            m16983P9();
            a aVar = this.f17803I0;
            if (aVar != null) {
                aVar.cancel();
            }
            mo3279p9();
            return;
        }
        if (id2 == R$id.tvForget) {
            C7589m1.f27886a.m29145n();
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str = m6887v.getHasPwd();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
                if (C5096m.f20979a.m20692c()) {
                    C4160d.b bVar = C4160d.f18217d;
                    Context m3096J6 = m3096J6();
                    AbstractC5868k.m23671c(m3096J6);
                    Context m3096J62 = m3096J6();
                    AbstractC5868k.m23671c(m3096J62);
                    String string = m3096J62.getString(R$string.adult_reset_child_pwd_without_pwd_tips_other);
                    AbstractC5868k.m23673e(string, "context!!.getString(R.st…d_without_pwd_tips_other)");
                    bVar.m17393e(m3096J6, string, true);
                    return;
                }
                C4160d.b bVar2 = C4160d.f18217d;
                Context m3096J63 = m3096J6();
                AbstractC5868k.m23671c(m3096J63);
                Context m3096J64 = m3096J6();
                AbstractC5868k.m23671c(m3096J64);
                String string2 = m3096J64.getString(R$string.adult_reset_child_pwd_without_pwd_tips_own);
                AbstractC5868k.m23673e(string2, "context!!.getString(R.st…pwd_without_pwd_tips_own)");
                bVar2.m17393e(m3096J63, string2, true);
                return;
            }
            C4772h c4772h = new C4772h();
            c4772h.m19723P9(this.f17803I0);
            c4772h.m19723P9(new c());
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            c4772h.mo3277E9(m3119R6, "CheckLoginPwdDialog");
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f17804J0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(keyEvent, "keyEvent");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int id2 = view.getId();
        int i11 = R$id.mEditPasswordFirst;
        if (id2 == i11) {
            if (i10 != 19 && i10 != 21) {
                if (i10 != 22) {
                    return false;
                }
                ((EditText) m16981J9(R$id.mEditPasswordSecond)).requestFocus();
            }
        } else {
            int i12 = R$id.mEditPasswordSecond;
            if (id2 == i12) {
                if (i10 != 19) {
                    if (i10 != 21) {
                        if (i10 != 22) {
                            return false;
                        }
                        ((EditText) m16981J9(R$id.mEditPasswordThird)).requestFocus();
                    } else {
                        ((EditText) m16981J9(i11)).requestFocus();
                    }
                }
            } else {
                int i13 = R$id.mEditPasswordThird;
                if (id2 == i13) {
                    if (i10 != 19) {
                        if (i10 != 21) {
                            if (i10 != 22) {
                                return false;
                            }
                            ((EditText) m16981J9(R$id.mEditPasswordFourth)).requestFocus();
                        } else {
                            ((EditText) m16981J9(i12)).requestFocus();
                        }
                    }
                } else {
                    if (id2 != R$id.mEditPasswordFourth) {
                        return false;
                    }
                    if (i10 != 19) {
                        if (i10 != 21) {
                            if (i10 != 22) {
                                return false;
                            }
                        } else {
                            ((EditText) m16981J9(i13)).requestFocus();
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // p301qb.InterfaceC6421r1
    /* renamed from: z1 */
    public void mo16991z1() {
        a aVar = this.f17803I0;
        if (aVar != null) {
            AbstractC5868k.m23671c(aVar);
            aVar.mo11609q0();
        }
        m16975W9(false);
        mo3279p9();
    }
}
