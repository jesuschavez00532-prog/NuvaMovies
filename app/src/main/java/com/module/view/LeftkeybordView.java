package com.module.view;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import antlr.Version;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.view.LeftkeybordView;
import com.titans.entity.CdnType;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p359ue.AbstractC7162p;

/* loaded from: classes2.dex */
public final class LeftkeybordView extends LinearLayout implements View.OnClickListener, View.OnKeyListener {

    /* renamed from: a */
    private final String f12188a;

    /* renamed from: b */
    private InterfaceC5660l f12189b;

    /* renamed from: c */
    private InterfaceC5642a f12190c;

    /* renamed from: d */
    private InterfaceC5642a f12191d;

    /* renamed from: e */
    private InterfaceC5642a f12192e;

    /* renamed from: f */
    private final InterfaceC1312h f12193f;

    /* renamed from: g */
    private boolean f12194g;

    /* renamed from: h */
    private CharSequence f12195h;

    /* renamed from: i */
    private boolean f12196i;

    /* renamed from: j */
    private boolean f12197j;

    /* renamed from: k */
    public Map f12198k;

    /* renamed from: com.module.view.LeftkeybordView$a */
    /* loaded from: classes2.dex */
    public static final class C3001a implements TextWatcher {
        C3001a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            AbstractC5868k.m23674f(charSequence, C3325bt.f14190aH);
            if (!AbstractC5868k.m23669a(LeftkeybordView.this.getStringBuilder().toString(), charSequence.toString())) {
                AbstractC7162p.m27715b(LeftkeybordView.this.getStringBuilder());
                LeftkeybordView.this.getStringBuilder().append(charSequence.toString());
            }
            LeftkeybordView.this.f12194g = true;
            LeftkeybordView.this.f12195h = charSequence;
        }
    }

    /* renamed from: com.module.view.LeftkeybordView$b */
    /* loaded from: classes2.dex */
    static final class C3002b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3002b f12200a = new C3002b();

        C3002b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StringBuilder invoke() {
            return new StringBuilder();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeftkeybordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f12198k = new LinkedHashMap();
        this.f12188a = LeftkeybordView.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(C3002b.f12200a);
        this.f12193f = m5965b;
        this.f12195h = "";
        setOrientation(1);
        LayoutInflater.from(context).inflate(R$layout.layout_search_keybord_full_uni, (ViewGroup) this, true);
        m12109j();
        this.f12197j = true;
    }

    /* renamed from: g */
    private final void m12108g() {
        Object systemService = getContext().getSystemService("input_method");
        AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((EditText) m12113c(R$id.etSearchInput)).getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringBuilder getStringBuilder() {
        return (StringBuilder) this.f12193f.getValue();
    }

    /* renamed from: j */
    private final void m12109j() {
        int i10 = R$id.etSearchInput;
        ((EditText) m12113c(i10)).setOnClickListener(new View.OnClickListener() { // from class: db.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeftkeybordView.m12110k(LeftkeybordView.this, view);
            }
        });
        ((EditText) m12113c(i10)).addTextChangedListener(new C3001a());
        ((ImageButton) m12113c(R$id.mIbSwitch)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11866a)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11891)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11867b)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11868c)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11869d)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11870e)).setOnClickListener(this);
        int i11 = R$id.f11892;
        ((Button) m12113c(i11)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11871f)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11872g)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11873h)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11874i)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11893)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11875j)).setOnClickListener(this);
        int i12 = R$id.f11876k;
        ((Button) m12113c(i12)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11877l)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11878m)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11879n)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11894)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11880o)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11895)).setOnClickListener(this);
        int i13 = R$id.f11882p;
        ((Button) m12113c(i13)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11883q)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11884r)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11885s)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11886t)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11887u)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11896)).setOnClickListener(this);
        int i14 = R$id.f11897;
        ((Button) m12113c(i14)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11889v)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11890w)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11863X)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11864Y)).setOnClickListener(this);
        ((Button) m12113c(R$id.f11865Z)).setOnClickListener(this);
        ((ImageButton) m12113c(R$id.ibKeyDelete)).setOnClickListener(this);
        int i15 = R$id.ibKeySpace;
        ((ImageButton) m12113c(i15)).setOnClickListener(this);
        ((ImageButton) m12113c(R$id.ibKeyClear)).setOnClickListener(this);
        int i16 = R$id.flKeyFeedback;
        ((TextView) m12113c(i16)).setOnClickListener(this);
        int i17 = R$id.mBtKeySearch;
        ((Button) m12113c(i17)).setOnClickListener(this);
        ((Button) m12113c(i11)).setOnKeyListener(this);
        ((Button) m12113c(i12)).setOnKeyListener(this);
        ((Button) m12113c(i13)).setOnKeyListener(this);
        ((Button) m12113c(i14)).setOnKeyListener(this);
        ((ImageButton) m12113c(i15)).setOnKeyListener(this);
        ((Button) m12113c(i17)).setOnKeyListener(this);
        ((TextView) m12113c(i16)).setOnKeyListener(this);
        ((EditText) m12113c(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: db.q
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i18, KeyEvent keyEvent) {
                boolean m12111l;
                m12111l = LeftkeybordView.m12111l(LeftkeybordView.this, view, i18, keyEvent);
                return m12111l;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m12110k(LeftkeybordView leftkeybordView, View view) {
        AbstractC5868k.m23674f(leftkeybordView, "this$0");
        leftkeybordView.m12108g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m12111l(LeftkeybordView leftkeybordView, View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        InterfaceC5642a interfaceC5642a;
        AbstractC5868k.m23674f(leftkeybordView, "this$0");
        if (i10 != 22) {
            return false;
        }
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        int i11 = R$id.etSearchInput;
        if (((EditText) leftkeybordView.m12113c(i11)).getSelectionEnd() < ((EditText) leftkeybordView.m12113c(i11)).getText().length() || (interfaceC5642a = leftkeybordView.f12191d) == null) {
            return false;
        }
        return ((Boolean) interfaceC5642a.invoke()).booleanValue();
    }

    /* renamed from: m */
    private final void m12112m() {
        if (!this.f12196i) {
            ((ViewStub) m12113c(R$id.mVbNumberKeyboard)).inflate();
            ((Button) m12113c(R$id.key_0)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_1)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_2)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_3)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_4)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_5)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_6)).setOnClickListener(this);
            int i10 = R$id.key_7;
            ((Button) m12113c(i10)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_8)).setOnClickListener(this);
            ((Button) m12113c(R$id.key_9)).setOnClickListener(this);
            int i11 = R$id.ibKeySpace1;
            ((ImageButton) m12113c(i11)).setOnClickListener(this);
            ((Button) m12113c(i10)).setOnKeyListener(this);
            ((ImageButton) m12113c(i11)).setOnKeyListener(this);
            this.f12196i = true;
        }
        boolean z10 = !this.f12197j;
        this.f12197j = z10;
        if (z10) {
            ((ImageButton) m12113c(R$id.mIbSwitch)).setImageResource(R$drawable.selector_vod_search_123);
            ((LinearLayout) m12113c(R$id.mKeyboardLine1)).setVisibility(0);
            ((LinearLayout) m12113c(R$id.mKeyboardLine2)).setVisibility(0);
            ((LinearLayout) m12113c(R$id.mKeyboardLine3)).setVisibility(0);
            ((LinearLayout) m12113c(R$id.mKeyboardLine4)).setVisibility(0);
            ((LinearLayout) m12113c(R$id.mKeyboardLine5)).setVisibility(0);
            ((LinearLayout) m12113c(R$id.mKeyboardLine6)).setVisibility(8);
            return;
        }
        ((ImageButton) m12113c(R$id.mIbSwitch)).setImageResource(R$drawable.selector_vod_search_abc);
        ((LinearLayout) m12113c(R$id.mKeyboardLine1)).setVisibility(8);
        ((LinearLayout) m12113c(R$id.mKeyboardLine2)).setVisibility(8);
        ((LinearLayout) m12113c(R$id.mKeyboardLine3)).setVisibility(8);
        ((LinearLayout) m12113c(R$id.mKeyboardLine4)).setVisibility(8);
        ((LinearLayout) m12113c(R$id.mKeyboardLine5)).setVisibility(8);
        ((LinearLayout) m12113c(R$id.mKeyboardLine6)).setVisibility(0);
    }

    /* renamed from: c */
    public View m12113c(int i10) {
        Map map = this.f12198k;
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
        boolean z10;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            if (this.f12195h.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = R$id.mBtKeySearch;
                if (!((Button) m12113c(i10)).hasFocus()) {
                    ((EditText) m12113c(R$id.etSearchInput)).clearFocus();
                    ((Button) m12113c(i10)).requestFocus();
                    return true;
                }
            }
        }
        if (keyEvent.getAction() == 0) {
            int i11 = R$id.etSearchInput;
            if (!((EditText) m12113c(i11)).hasFocus()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 67) {
                    switch (keyCode) {
                        case 7:
                            EditText editText = (EditText) m12113c(i11);
                            StringBuilder stringBuilder = getStringBuilder();
                            stringBuilder.append(MessageService.MSG_DB_READY_REPORT);
                            editText.setText(stringBuilder);
                            break;
                        case 8:
                            EditText editText2 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder2 = getStringBuilder();
                            stringBuilder2.append("1");
                            editText2.setText(stringBuilder2);
                            break;
                        case 9:
                            EditText editText3 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder3 = getStringBuilder();
                            stringBuilder3.append("2");
                            editText3.setText(stringBuilder3);
                            break;
                        case 10:
                            EditText editText4 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder4 = getStringBuilder();
                            stringBuilder4.append("3");
                            editText4.setText(stringBuilder4);
                            break;
                        case 11:
                            EditText editText5 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder5 = getStringBuilder();
                            stringBuilder5.append("4");
                            editText5.setText(stringBuilder5);
                            break;
                        case 12:
                            EditText editText6 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder6 = getStringBuilder();
                            stringBuilder6.append(CdnType.DIGITAL_TYPE_PCDN);
                            editText6.setText(stringBuilder6);
                            break;
                        case 13:
                            EditText editText7 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder7 = getStringBuilder();
                            stringBuilder7.append(CdnType.DIGITAL_TYPE_PEERSTAR);
                            editText7.setText(stringBuilder7);
                            break;
                        case 14:
                            EditText editText8 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder8 = getStringBuilder();
                            stringBuilder8.append(Version.subversion);
                            editText8.setText(stringBuilder8);
                            break;
                        case 15:
                            EditText editText9 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder9 = getStringBuilder();
                            stringBuilder9.append(MessageService.MSG_ACCS_NOTIFY_CLICK);
                            editText9.setText(stringBuilder9);
                            break;
                        case 16:
                            EditText editText10 = (EditText) m12113c(i11);
                            StringBuilder stringBuilder10 = getStringBuilder();
                            stringBuilder10.append(MessageService.MSG_ACCS_NOTIFY_DISMISS);
                            editText10.setText(stringBuilder10);
                            break;
                    }
                } else if (getStringBuilder().length() > 0) {
                    getStringBuilder().delete(getStringBuilder().length() - 1, getStringBuilder().length());
                    ((EditText) m12113c(i11)).setText(getStringBuilder());
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final InterfaceC5642a getFeedbackClickListener() {
        return this.f12190c;
    }

    public final View getFeedbackView() {
        TextView textView = (TextView) m12113c(R$id.flKeyFeedback);
        AbstractC5868k.m23673e(textView, "flKeyFeedback");
        return textView;
    }

    public final InterfaceC5642a getInputRightKeyListener() {
        return this.f12191d;
    }

    public final InterfaceC5642a getSearchRightKeyListener() {
        return this.f12192e;
    }

    public final InterfaceC5660l getTextChangeListener() {
        return this.f12189b;
    }

    /* renamed from: h */
    public final void m12114h() {
        ((Button) m12113c(R$id.f11866a)).requestFocus();
    }

    /* renamed from: i */
    public final void m12115i() {
        if (this.f12197j) {
            ((Button) m12113c(R$id.f11872g)).requestFocus();
        } else {
            ((Button) m12113c(R$id.key_7)).requestFocus();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10;
        boolean z10;
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        boolean z11 = true;
        if (id2 == R$id.mBtKeySearch) {
            if (this.f12194g) {
                this.f12194g = false;
                String obj = this.f12195h.toString();
                int length = obj.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length) {
                    if (!z12) {
                        i10 = i11;
                    } else {
                        i10 = length;
                    }
                    if (AbstractC5868k.m23676h(obj.charAt(i10), 32) <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z12) {
                        if (!z10) {
                            z12 = true;
                        } else {
                            i11++;
                        }
                    } else if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                }
                String obj2 = obj.subSequence(i11, length + 1).toString();
                InterfaceC5660l interfaceC5660l = this.f12189b;
                if (interfaceC5660l != null) {
                    interfaceC5660l.mo542f(obj2);
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == R$id.mIbSwitch) {
            m12112m();
            return;
        }
        if (id2 == R$id.ibKeyDelete) {
            if (getStringBuilder().length() > 0) {
                getStringBuilder().delete(getStringBuilder().length() - 1, getStringBuilder().length());
                ((EditText) m12113c(R$id.etSearchInput)).setText(getStringBuilder());
                return;
            }
            return;
        }
        if (id2 != R$id.ibKeySpace && id2 != R$id.ibKeySpace1) {
            z11 = false;
        }
        if (z11) {
            EditText editText = (EditText) m12113c(R$id.etSearchInput);
            StringBuilder stringBuilder = getStringBuilder();
            stringBuilder.append(" ");
            editText.setText(stringBuilder);
            return;
        }
        if (id2 == R$id.ibKeyClear) {
            getStringBuilder().delete(0, getStringBuilder().length());
            ((EditText) m12113c(R$id.etSearchInput)).setText("");
            return;
        }
        if (id2 == R$id.flKeyFeedback) {
            InterfaceC5642a interfaceC5642a = this.f12190c;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
                return;
            }
            return;
        }
        Object tag = view.getTag();
        AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type kotlin.String");
        EditText editText2 = (EditText) m12113c(R$id.etSearchInput);
        StringBuilder stringBuilder2 = getStringBuilder();
        stringBuilder2.append((String) tag);
        editText2.setText(stringBuilder2);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        InterfaceC5642a interfaceC5642a;
        if (i10 != 22) {
            return false;
        }
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (interfaceC5642a = this.f12192e) == null) {
            return false;
        }
        return ((Boolean) interfaceC5642a.invoke()).booleanValue();
    }

    public final void setFeedbackClickListener(InterfaceC5642a interfaceC5642a) {
        this.f12190c = interfaceC5642a;
    }

    public final void setHintSize(int i10) {
        String string = getContext().getString(i10);
        AbstractC5868k.m23673e(string, "context.getString(resId)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableString.length(), 33);
        ((EditText) m12113c(R$id.etSearchInput)).setHint(new SpannedString(spannableString));
    }

    public final void setInputRightKeyListener(InterfaceC5642a interfaceC5642a) {
        this.f12191d = interfaceC5642a;
    }

    public final void setSearchRightKeyListener(InterfaceC5642a interfaceC5642a) {
        this.f12192e = interfaceC5642a;
    }

    public final void setTextChangeListener(InterfaceC5660l interfaceC5660l) {
        this.f12189b = interfaceC5660l;
    }
}
