package p102db;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.request.result.UserInfo;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.C5881x;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;

/* renamed from: db.j1 */
/* loaded from: classes2.dex */
public final class C4049j1 extends AutoFrameLayout {

    /* renamed from: c */
    public static final a f17870c = new a(null);

    /* renamed from: a */
    private b f17871a;

    /* renamed from: b */
    public Map f17872b;

    /* renamed from: db.j1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: db.j1$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: Q0 */
        void mo17041Q0(String str);

        void onDismiss();

        /* renamed from: s1 */
        void mo17042s1();

        /* renamed from: v4 */
        void mo17043v4(String str);
    }

    /* renamed from: db.j1$c */
    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b bVar = C4049j1.this.f17871a;
            if (bVar != null) {
                bVar.mo17043v4("");
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: db.j1$d */
    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b bVar = C4049j1.this.f17871a;
            if (bVar != null) {
                bVar.mo17043v4("");
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4049j1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17872b = new LinkedHashMap();
        LayoutInflater.from(context).inflate(R$layout.layout_set_password_panel, (ViewGroup) this, true);
        m17034j();
    }

    /* renamed from: j */
    private final void m17034j() {
        int i10 = R$id.mEtPwd;
        ((EditText) m17039h(i10)).requestFocus();
        setOnClickListener(null);
        ((Button) m17039h(R$id.mBtnCancel)).setOnClickListener(new View.OnClickListener() { // from class: db.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4049j1.m17035k(C4049j1.this, view);
            }
        });
        ((Button) m17039h(R$id.mBtnConfirm)).setOnClickListener(new View.OnClickListener() { // from class: db.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4049j1.m17036l(C4049j1.this, view);
            }
        });
        ((Button) m17039h(R$id.mBtnClose)).setOnClickListener(new View.OnClickListener() { // from class: db.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4049j1.m17037m(C4049j1.this, view);
            }
        });
        ((EditText) m17039h(i10)).addTextChangedListener(new c());
        ((EditText) m17039h(R$id.mEtConfirmPwd)).addTextChangedListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m17035k(C4049j1 c4049j1, View view) {
        AbstractC5868k.m23674f(c4049j1, "this$0");
        b bVar = c4049j1.f17871a;
        if (bVar != null) {
            bVar.mo17042s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m17036l(C4049j1 c4049j1, View view) {
        AbstractC5868k.m23674f(c4049j1, "this$0");
        c4049j1.m17038o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m17037m(C4049j1 c4049j1, View view) {
        AbstractC5868k.m23674f(c4049j1, "this$0");
        b bVar = c4049j1.f17871a;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    /* renamed from: o */
    private final void m17038o() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m17039h(R$id.mEtPwd)).getText().toString());
        String obj = m27758b0.toString();
        m27758b02 = AbstractC7167u.m27758b0(((EditText) m17039h(R$id.mEtConfirmPwd)).getText().toString());
        String obj2 = m27758b02.toString();
        if (!TextUtils.isEmpty(obj) && AbstractC7557c.m28975c(obj)) {
            if (!TextUtils.isEmpty(obj2) && AbstractC7557c.m28975c(obj2)) {
                if (!TextUtils.equals(obj, obj2)) {
                    b bVar = this.f17871a;
                    if (bVar != null) {
                        String string = getContext().getString(R$string.personal_password_inconsistent);
                        AbstractC5868k.m23673e(string, "context.getString(R.stri…al_password_inconsistent)");
                        bVar.mo17043v4(string);
                        return;
                    }
                    return;
                }
                b bVar2 = this.f17871a;
                if (bVar2 != null) {
                    bVar2.mo17041Q0(obj);
                    return;
                }
                return;
            }
            b bVar3 = this.f17871a;
            if (bVar3 != null) {
                String string2 = getContext().getString(R$string.confirm_password_wrong);
                AbstractC5868k.m23673e(string2, "context.getString(R.string.confirm_password_wrong)");
                bVar3.mo17043v4(string2);
                return;
            }
            return;
        }
        b bVar4 = this.f17871a;
        if (bVar4 != null) {
            String string3 = getContext().getString(R$string.password_format_wrong);
            AbstractC5868k.m23673e(string3, "context.getString(R.string.password_format_wrong)");
            bVar4.mo17043v4(string3);
        }
    }

    /* renamed from: h */
    public View m17039h(int i10) {
        Map map = this.f17872b;
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

    /* renamed from: n */
    public final void m17040n(String str, int i10) {
        String str2;
        AbstractC5868k.m23674f(str, "email");
        ((AutoRelativeLayout) m17039h(R$id.mLayoutPassword)).setVisibility(8);
        if (i10 != 0) {
            if (i10 == 1) {
                ((AutoRelativeLayout) m17039h(R$id.mLayoutSuccess)).setVisibility(0);
                ((TextView) m17039h(R$id.mTextSuccess)).setVisibility(8);
                ((TextView) m17039h(R$id.mTextAccount)).setVisibility(8);
                ((TextView) m17039h(R$id.mTvRemember)).setVisibility(8);
                ((TextView) m17039h(R$id.mTvRetrieveSuccess)).setVisibility(0);
            }
        } else {
            ((AutoRelativeLayout) m17039h(R$id.mLayoutSuccess)).setVisibility(0);
            int i11 = R$id.mTextSuccess;
            ((TextView) m17039h(i11)).setVisibility(0);
            int i12 = R$id.mTextAccount;
            ((TextView) m17039h(i12)).setVisibility(0);
            ((TextView) m17039h(R$id.mTvRemember)).setVisibility(0);
            ((TextView) m17039h(R$id.mTvRetrieveSuccess)).setVisibility(8);
            TextView textView = (TextView) m17039h(i11);
            C5881x c5881x = C5881x.f23415a;
            String string = getContext().getString(R$string.email_binding_success);
            AbstractC5868k.m23673e(string, "context.getString(R.string.email_binding_success)");
            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
            TextView textView2 = (TextView) m17039h(i12);
            String string2 = getContext().getString(R$string.email_binding_account);
            AbstractC5868k.m23673e(string2, "context.getString(R.string.email_binding_account)");
            Object[] objArr = new Object[1];
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str2 = m6887v.getUserId();
            } else {
                str2 = null;
            }
            objArr[0] = str2;
            String format2 = String.format(string2, Arrays.copyOf(objArr, 1));
            AbstractC5868k.m23673e(format2, "format(format, *args)");
            textView2.setText(Html.fromHtml(format2));
        }
        ((Button) m17039h(R$id.mBtnClose)).requestFocus();
    }

    public final void setSetPasswordCallback(b bVar) {
        AbstractC5868k.m23674f(bVar, "callback");
        this.f17871a = bVar;
    }

    public /* synthetic */ C4049j1(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
