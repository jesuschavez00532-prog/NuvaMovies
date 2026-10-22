package com.live.view;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import cc.C1466m0;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.module.view.DialogBottomBar;
import com.request.result.UserInfo;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p101da.ViewOnClickListenerC4018d;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p161ha.C4772h;
import p201k2.C5096m;
import p223l8.C5442e1;
import p400xa.C7589m1;
import p430z9.AbstractC7765c;

/* renamed from: com.live.view.d */
/* loaded from: classes2.dex */
public final class ViewOnFocusChangeListenerC2876d extends RelativeLayout implements View.OnFocusChangeListener, TextWatcher, View.OnKeyListener {

    /* renamed from: h */
    public static final a f10929h = new a(null);

    /* renamed from: a */
    private final AbstractC7765c f10930a;

    /* renamed from: b */
    private final AbstractC0729o f10931b;

    /* renamed from: c */
    private final String f10932c;

    /* renamed from: d */
    private InterfaceC5642a f10933d;

    /* renamed from: e */
    private InterfaceC5642a f10934e;

    /* renamed from: f */
    private int f10935f;

    /* renamed from: g */
    public Map f10936g;

    /* renamed from: com.live.view.d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.live.view.d$b */
    /* loaded from: classes2.dex */
    public static final class b implements ViewOnClickListenerC4018d.a {
        b() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            InterfaceC5642a interfaceC5642a = ViewOnFocusChangeListenerC2876d.this.f10933d;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnFocusChangeListenerC2876d(Context context, AttributeSet attributeSet, int i10, AbstractC7765c abstractC7765c, AbstractC0729o abstractC0729o) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        this.f10936g = new LinkedHashMap();
        this.f10930a = abstractC7765c;
        this.f10931b = abstractC0729o;
        this.f10932c = "AdultControlPanel";
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        LayoutInflater.from(context).inflate(R$layout.layout_adult_control_panel_new, (ViewGroup) this, true);
        m11598i();
    }

    /* renamed from: g */
    private final void m11596g() {
        int i10 = R$id.mButtonConfirm;
        if (((Button) m11605d(i10)).getVisibility() == 0) {
            ((Button) m11605d(i10)).requestFocus();
        } else {
            ((Button) m11605d(R$id.mButtonSetConfirm)).requestFocus();
        }
    }

    /* renamed from: h */
    private final boolean m11597h() {
        return C4160d.f18217d.m17391c();
    }

    /* renamed from: i */
    private final void m11598i() {
        ((Button) m11605d(R$id.mButtonConfirm)).setOnClickListener(new View.OnClickListener() { // from class: com.live.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnFocusChangeListenerC2876d.m11599j(ViewOnFocusChangeListenerC2876d.this, view);
            }
        });
        ((Button) m11605d(R$id.mButtonSetConfirm)).setOnClickListener(new View.OnClickListener() { // from class: com.live.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnFocusChangeListenerC2876d.m11600k(ViewOnFocusChangeListenerC2876d.this, view);
            }
        });
        int i10 = R$id.mEditFirst;
        ((EditText) m11605d(i10)).addTextChangedListener(this);
        int i11 = R$id.mEditSecond;
        ((EditText) m11605d(i11)).addTextChangedListener(this);
        int i12 = R$id.mEditThird;
        ((EditText) m11605d(i12)).addTextChangedListener(this);
        int i13 = R$id.mEditFourth;
        ((EditText) m11605d(i13)).addTextChangedListener(this);
        ((EditText) m11605d(i10)).setOnFocusChangeListener(this);
        ((EditText) m11605d(i11)).setOnFocusChangeListener(this);
        ((EditText) m11605d(i12)).setOnFocusChangeListener(this);
        ((EditText) m11605d(i13)).setOnFocusChangeListener(this);
        ((EditText) m11605d(i10)).setOnKeyListener(this);
        ((EditText) m11605d(i11)).setOnKeyListener(this);
        ((EditText) m11605d(i12)).setOnKeyListener(this);
        ((EditText) m11605d(i13)).setOnKeyListener(this);
        int i14 = R$id.mTextForget;
        ((TextView) m11605d(i14)).setOnKeyListener(this);
        ((TextView) m11605d(i14)).setOnClickListener(new View.OnClickListener() { // from class: com.live.view.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnFocusChangeListenerC2876d.m11601l(ViewOnFocusChangeListenerC2876d.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m11599j(ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d, View view) {
        AbstractC5868k.m23674f(viewOnFocusChangeListenerC2876d, "this$0");
        viewOnFocusChangeListenerC2876d.m11603p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m11600k(ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d, View view) {
        AbstractC5868k.m23674f(viewOnFocusChangeListenerC2876d, "this$0");
        viewOnFocusChangeListenerC2876d.m11604q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m11601l(ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d, View view) {
        String str;
        AbstractC5868k.m23674f(viewOnFocusChangeListenerC2876d, "this$0");
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
                Context context = viewOnFocusChangeListenerC2876d.getContext();
                AbstractC5868k.m23671c(context);
                Context context2 = viewOnFocusChangeListenerC2876d.getContext();
                AbstractC5868k.m23671c(context2);
                String string = context2.getString(R$string.adult_reset_child_pwd_without_pwd_tips_other);
                AbstractC5868k.m23673e(string, "context!!.getString(R.st…d_without_pwd_tips_other)");
                bVar.m17393e(context, string, true);
                return;
            }
            C4160d.b bVar2 = C4160d.f18217d;
            Context context3 = viewOnFocusChangeListenerC2876d.getContext();
            AbstractC5868k.m23671c(context3);
            Context context4 = viewOnFocusChangeListenerC2876d.getContext();
            AbstractC5868k.m23671c(context4);
            String string2 = context4.getString(R$string.adult_reset_child_pwd_without_pwd_tips_own);
            AbstractC5868k.m23673e(string2, "context!!.getString(R.st…pwd_without_pwd_tips_own)");
            bVar2.m17393e(context3, string2, true);
            return;
        }
        C4772h c4772h = new C4772h();
        c4772h.m19723P9(new b());
        c4772h.mo3277E9(viewOnFocusChangeListenerC2876d.f10931b, "CheckLoginPwdDialog");
    }

    /* renamed from: o */
    private final void m11602o(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m11605d(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: p */
    private final void m11603p() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) ((EditText) m11605d(R$id.mEditFirst)).getText());
        sb2.append((Object) ((EditText) m11605d(R$id.mEditSecond)).getText());
        sb2.append((Object) ((EditText) m11605d(R$id.mEditThird)).getText());
        sb2.append((Object) ((EditText) m11605d(R$id.mEditFourth)).getText());
        String sb3 = sb2.toString();
        if (m11597h()) {
            this.f10935f = 0;
            m11606f();
            String string = getResources().getString(R$string.input_more_error_tip);
            AbstractC5868k.m23673e(string, "resources.getString(R.string.input_more_error_tip)");
            m11602o(string, false);
            return;
        }
        if (!TextUtils.isEmpty(sb3)) {
            AbstractC4161e.a aVar = AbstractC4161e.f18225a;
            if (AbstractC5868k.m23669a(sb3, aVar.m17399b())) {
                this.f10935f = 0;
                aVar.m17398a();
                aVar.m17404g(System.currentTimeMillis());
                m11606f();
                ((DialogBottomBar) m11605d(R$id.mBottomBar)).m12079e();
                aVar.m17403f(System.currentTimeMillis());
                InterfaceC5642a interfaceC5642a = this.f10933d;
                if (interfaceC5642a != null) {
                    interfaceC5642a.invoke();
                    return;
                }
                return;
            }
        }
        m11606f();
        if (m11597h()) {
            this.f10935f = 0;
            String string2 = getResources().getString(R$string.input_more_error_tip);
            AbstractC5868k.m23673e(string2, "resources.getString(R.string.input_more_error_tip)");
            m11602o(string2, false);
            return;
        }
        int i10 = this.f10935f + 1;
        this.f10935f = i10;
        if (i10 >= 10) {
            AbstractC4161e.f18225a.m17405h();
        }
        String string3 = getResources().getString(R$string.pwd_input_error);
        AbstractC5868k.m23673e(string3, "resources.getString(R.string.pwd_input_error)");
        m11602o(string3, false);
    }

    /* renamed from: q */
    private final void m11604q() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) ((EditText) m11605d(R$id.mEditFirst)).getText());
        sb2.append((Object) ((EditText) m11605d(R$id.mEditSecond)).getText());
        sb2.append((Object) ((EditText) m11605d(R$id.mEditThird)).getText());
        sb2.append((Object) ((EditText) m11605d(R$id.mEditFourth)).getText());
        setPassword(sb2.toString());
    }

    private final void setPassword(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 4) {
            AbstractC4161e.a aVar = AbstractC4161e.f18225a;
            aVar.m17398a();
            this.f10935f = 0;
            aVar.m17402e(str);
            m11606f();
            C4160d.b bVar = C4160d.f18217d;
            Context context = getContext();
            AbstractC5868k.m23671c(context);
            String string = getResources().getString(R$string.pwd_set_suc);
            AbstractC5868k.m23673e(string, "resources.getString(R.string.pwd_set_suc)");
            C4160d.b.m17389f(bVar, context, string, false, 4, null);
            aVar.m17403f(System.currentTimeMillis());
            InterfaceC5642a interfaceC5642a = this.f10933d;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
                return;
            }
            return;
        }
        String string2 = getResources().getString(R$string.pwd_input_format_error);
        AbstractC5868k.m23673e(string2, "resources.getString(R.st…g.pwd_input_format_error)");
        m11602o(string2, false);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ((DialogBottomBar) m11605d(R$id.mBottomBar)).m12079e();
        int i10 = R$id.mEditFirst;
        if (((EditText) m11605d(i10)).hasFocus() && ((EditText) m11605d(i10)).length() == 1) {
            ((EditText) m11605d(R$id.mEditSecond)).requestFocus();
            return;
        }
        int i11 = R$id.mEditSecond;
        if (((EditText) m11605d(i11)).hasFocus() && ((EditText) m11605d(i11)).length() == 1) {
            ((EditText) m11605d(R$id.mEditThird)).requestFocus();
            return;
        }
        int i12 = R$id.mEditThird;
        if (((EditText) m11605d(i12)).hasFocus() && ((EditText) m11605d(i12)).length() == 1) {
            ((EditText) m11605d(R$id.mEditFourth)).requestFocus();
            return;
        }
        int i13 = R$id.mEditFourth;
        if (((EditText) m11605d(i13)).hasFocus() && ((EditText) m11605d(i13)).length() == 1) {
            int i14 = R$id.mButtonConfirm;
            if (((Button) m11605d(i14)).getVisibility() == 0) {
                ((Button) m11605d(i14)).requestFocus();
            } else {
                ((Button) m11605d(R$id.mButtonSetConfirm)).requestFocus();
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: d */
    public View m11605d(int i10) {
        Map map = this.f10936g;
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        switch (keyEvent.getKeyCode()) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                if (((TextView) m11605d(R$id.mTextForget)).hasFocus()) {
                    return false;
                }
                if (((Button) m11605d(R$id.mButtonConfirm)).hasFocus() || ((Button) m11605d(R$id.mButtonSetConfirm)).hasFocus()) {
                    InterfaceC5642a interfaceC5642a = this.f10934e;
                    if (interfaceC5642a != null) {
                        interfaceC5642a.invoke();
                        return true;
                    }
                    return true;
                }
                break;
        }
        InterfaceC5642a interfaceC5642a2 = this.f10934e;
        if (interfaceC5642a2 != null) {
            interfaceC5642a2.invoke();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public final void m11606f() {
        ((EditText) m11605d(R$id.mEditFirst)).setText("");
        ((EditText) m11605d(R$id.mEditSecond)).setText("");
        ((EditText) m11605d(R$id.mEditThird)).setText("");
        ((EditText) m11605d(R$id.mEditFourth)).setText("");
    }

    public final AbstractC7765c getFragment() {
        return this.f10930a;
    }

    public final AbstractC0729o getFragmentManager() {
        return this.f10931b;
    }

    /* renamed from: m */
    public final void m11607m(String str) {
        AbstractC5868k.m23674f(str, "type");
        if (AbstractC5868k.m23669a(str, "type_check")) {
            ((TextView) m11605d(R$id.mTvCrTips)).setText(getResources().getString(R$string.child_lock));
            ((Button) m11605d(R$id.mButtonConfirm)).setVisibility(0);
            ((Button) m11605d(R$id.mButtonSetConfirm)).setVisibility(8);
            ((TextView) m11605d(R$id.mTextForget)).setVisibility(0);
            ((TextView) m11605d(R$id.mTvTips)).setVisibility(8);
            return;
        }
        if (AbstractC5868k.m23669a(str, "type_set")) {
            ((TextView) m11605d(R$id.mTvCrTips)).setText(getResources().getString(R$string.adult_set_child_pwd_tips_1) + '\n' + getResources().getString(R$string.adult_set_child_pwd_tips_2));
            ((Button) m11605d(R$id.mButtonConfirm)).setVisibility(8);
            ((Button) m11605d(R$id.mButtonSetConfirm)).setVisibility(0);
            ((TextView) m11605d(R$id.mTextForget)).setVisibility(8);
            int i10 = R$id.mTvTips;
            ((TextView) m11605d(i10)).setVisibility(0);
            ((TextView) m11605d(i10)).setText(Html.fromHtml(getResources().getString(R$string.adult_control_category_display_tips)));
        }
    }

    /* renamed from: n */
    public final void m11608n(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        this.f10934e = interfaceC5642a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        ((DialogBottomBar) m11605d(R$id.mBottomBar)).m12079e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean z10 = false;
        if (keyEvent.getAction() == 0) {
            int id2 = view.getId();
            int i11 = R$id.mEditFirst;
            if (id2 == i11) {
                switch (i10) {
                    case 20:
                        m11596g();
                        break;
                    case 21:
                        Fragment m3133W6 = this.f10930a.m3133W6();
                        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                        ((C5442e1) m3133W6).m21964ra();
                        break;
                    case 22:
                        ((EditText) m11605d(R$id.mEditSecond)).requestFocus();
                        break;
                }
                z10 = true;
            } else {
                int i12 = R$id.mEditSecond;
                if (id2 == i12) {
                    switch (i10) {
                        case 20:
                            m11596g();
                            break;
                        case 21:
                            ((EditText) m11605d(i11)).requestFocus();
                            break;
                        case 22:
                            ((EditText) m11605d(R$id.mEditThird)).requestFocus();
                            break;
                    }
                    z10 = true;
                } else {
                    int i13 = R$id.mEditThird;
                    if (id2 == i13) {
                        switch (i10) {
                            case 20:
                                m11596g();
                                break;
                            case 21:
                                ((EditText) m11605d(i12)).requestFocus();
                                break;
                            case 22:
                                ((EditText) m11605d(R$id.mEditFourth)).requestFocus();
                                break;
                        }
                        z10 = true;
                    } else if (id2 == R$id.mEditFourth) {
                        switch (i10) {
                            case 20:
                                m11596g();
                                z10 = true;
                                break;
                            case 21:
                                ((EditText) m11605d(i13)).requestFocus();
                                z10 = true;
                                break;
                            case 22:
                                z10 = true;
                                break;
                        }
                    } else if (id2 == R$id.mTextForget && i10 == 21) {
                        m11596g();
                        z10 = true;
                    }
                }
            }
        }
        if (keyEvent.getAction() == 1) {
            int id3 = view.getId();
            if (id3 == R$id.mEditFirst) {
                if (i10 == 66) {
                    ((EditText) m11605d(R$id.mEditSecond)).requestFocus();
                    return true;
                }
            } else if (id3 == R$id.mEditSecond) {
                if (i10 == 66) {
                    ((EditText) m11605d(R$id.mEditThird)).requestFocus();
                    return true;
                }
            } else if (id3 == R$id.mEditThird) {
                if (i10 == 66) {
                    ((EditText) m11605d(R$id.mEditFourth)).requestFocus();
                    return true;
                }
            } else if (id3 == R$id.mEditFourth && i10 == 66) {
                return true;
            }
        }
        return z10;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void setCallBack(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "callBack");
        this.f10933d = interfaceC5642a;
    }

    public /* synthetic */ ViewOnFocusChangeListenerC2876d(Context context, AttributeSet attributeSet, int i10, AbstractC7765c abstractC7765c, AbstractC0729o abstractC0729o, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, abstractC7765c, abstractC0729o);
    }
}
