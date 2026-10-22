package com.live.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.live.R$id;
import com.live.R$layout;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p359ue.AbstractC7167u;
import p400xa.C7590n;

/* renamed from: com.live.view.k */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC2883k extends LinearLayout implements View.OnKeyListener, View.OnClickListener {

    /* renamed from: a */
    private String f10970a;

    /* renamed from: b */
    private String f10971b;

    /* renamed from: c */
    private a f10972c;

    /* renamed from: d */
    public Map f10973d;

    /* renamed from: com.live.view.k$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: J3 */
        void mo11651J3();

        /* renamed from: Y4 */
        void mo11652Y4(ViewOnKeyListenerC2883k viewOnKeyListenerC2883k);

        /* renamed from: g6 */
        void mo11653g6(ViewOnKeyListenerC2883k viewOnKeyListenerC2883k, String str, String str2);

        /* renamed from: x */
        void mo11654x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.live.view.k$b */
    /* loaded from: classes2.dex */
    public final class b implements TextWatcher {

        /* renamed from: a */
        private TextView f10974a;

        /* renamed from: b */
        final /* synthetic */ ViewOnKeyListenerC2883k f10975b;

        public b(ViewOnKeyListenerC2883k viewOnKeyListenerC2883k, TextView textView) {
            AbstractC5868k.m23674f(textView, "view");
            this.f10975b = viewOnKeyListenerC2883k;
            this.f10974a = textView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z10;
            AbstractC5868k.m23674f(editable, C3325bt.f14190aH);
            if (editable.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int id2 = this.f10974a.getId();
                int i10 = R$id.et_lock_time_one;
                if (id2 == i10) {
                    this.f10975b.f10970a = editable.toString();
                    C7590n c7590n = C7590n.f27938a;
                    EditText editText = (EditText) this.f10975b.m11644a(i10);
                    AbstractC5868k.m23673e(editText, "et_lock_time_one");
                    if (c7590n.m29186b(editText) >= 5 && ((EditText) this.f10975b.m11644a(i10)).getText().toString().length() >= 5) {
                        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k = this.f10975b;
                        int i11 = R$id.et_lock_time_two;
                        ((EditText) viewOnKeyListenerC2883k.m11644a(i11)).requestFocus();
                        if (((EditText) this.f10975b.m11644a(i11)).getText().toString().length() > 1) {
                            ((EditText) this.f10975b.m11644a(i11)).setSelection(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int id3 = this.f10974a.getId();
                int i12 = R$id.et_lock_time_two;
                if (id3 == i12) {
                    this.f10975b.f10971b = editable.toString();
                    C7590n c7590n2 = C7590n.f27938a;
                    EditText editText2 = (EditText) this.f10975b.m11644a(i12);
                    AbstractC5868k.m23673e(editText2, "et_lock_time_two");
                    if (c7590n2.m29186b(editText2) >= 5 && ((EditText) this.f10975b.m11644a(i10)).getText().toString().length() >= 5 && ((EditText) this.f10975b.m11644a(i12)).getText().toString().length() >= 5) {
                        ((Button) this.f10975b.m11644a(R$id.btn_pwd_time_ok)).requestFocus();
                    }
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            AbstractC5868k.m23674f(charSequence, C3325bt.f14190aH);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            boolean m27763v;
            boolean m27763v2;
            AbstractC5868k.m23674f(charSequence, C3325bt.f14190aH);
            this.f10975b.m11647h();
            int id2 = this.f10974a.getId();
            int i13 = R$id.et_lock_time_one;
            boolean z10 = true;
            if (id2 == i13) {
                if (!TextUtils.isEmpty(this.f10975b.f10970a) && !TextUtils.isEmpty(charSequence.toString()) && charSequence.toString().length() > 1) {
                    String str = this.f10975b.f10970a;
                    if (str == null || charSequence.toString().length() != str.length()) {
                        z10 = false;
                    }
                    if (!z10) {
                        C7590n c7590n = C7590n.f27938a;
                        EditText editText = (EditText) this.f10975b.m11644a(i13);
                        AbstractC5868k.m23673e(editText, "et_lock_time_one");
                        EditText editText2 = (EditText) this.f10975b.m11644a(R$id.et_lock_time_two);
                        AbstractC5868k.m23673e(editText2, "et_lock_time_two");
                        c7590n.m29185a(editText, editText2, this.f10975b.f10971b);
                        this.f10975b.f10970a = charSequence.toString();
                    }
                }
                if (!TextUtils.isEmpty(charSequence.toString()) && charSequence.toString().length() >= 2) {
                    m27763v2 = AbstractC7167u.m27763v(charSequence.toString(), ":", false, 2, null);
                    if (!m27763v2) {
                        C7590n c7590n2 = C7590n.f27938a;
                        EditText editText3 = (EditText) this.f10975b.m11644a(i13);
                        AbstractC5868k.m23673e(editText3, "et_lock_time_one");
                        c7590n2.m29187c(editText3, ":");
                        return;
                    }
                    return;
                }
                return;
            }
            int id3 = this.f10974a.getId();
            int i14 = R$id.et_lock_time_two;
            if (id3 == i14) {
                if (!TextUtils.isEmpty(this.f10975b.f10971b) && !TextUtils.isEmpty(charSequence.toString()) && charSequence.toString().length() > 1) {
                    String str2 = this.f10975b.f10971b;
                    if (str2 == null || charSequence.toString().length() != str2.length()) {
                        z10 = false;
                    }
                    if (!z10) {
                        C7590n c7590n3 = C7590n.f27938a;
                        EditText editText4 = (EditText) this.f10975b.m11644a(i14);
                        AbstractC5868k.m23673e(editText4, "et_lock_time_two");
                        EditText editText5 = (EditText) this.f10975b.m11644a(i13);
                        AbstractC5868k.m23673e(editText5, "et_lock_time_one");
                        c7590n3.m29185a(editText4, editText5, this.f10975b.f10970a);
                        this.f10975b.f10971b = charSequence.toString();
                    }
                }
                if (!TextUtils.isEmpty(charSequence.toString()) && charSequence.toString().length() >= 2) {
                    m27763v = AbstractC7167u.m27763v(charSequence.toString(), ":", false, 2, null);
                    if (!m27763v) {
                        C7590n c7590n4 = C7590n.f27938a;
                        EditText editText6 = (EditText) this.f10975b.m11644a(i14);
                        AbstractC5868k.m23673e(editText6, "et_lock_time_two");
                        c7590n4.m29187c(editText6, ":");
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnKeyListenerC2883k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f10973d = new LinkedHashMap();
        LayoutInflater.from(context).inflate(R$layout.layout_locked_time, (ViewGroup) this, true);
        m11643i();
    }

    /* renamed from: i */
    private final void m11643i() {
        int i10 = R$id.et_lock_time_one;
        ((EditText) m11644a(i10)).requestFocus();
        setOnKeyListener(this);
        ((EditText) m11644a(i10)).setOnKeyListener(this);
        int i11 = R$id.et_lock_time_two;
        ((EditText) m11644a(i11)).setOnKeyListener(this);
        int i12 = R$id.btn_pwd_time_ok;
        ((Button) m11644a(i12)).setOnKeyListener(this);
        int i13 = R$id.btn_pwd_time_unlock;
        ((Button) m11644a(i13)).setOnKeyListener(this);
        EditText editText = (EditText) m11644a(i10);
        EditText editText2 = (EditText) m11644a(i10);
        AbstractC5868k.m23673e(editText2, "et_lock_time_one");
        editText.addTextChangedListener(new b(this, editText2));
        EditText editText3 = (EditText) m11644a(i11);
        EditText editText4 = (EditText) m11644a(i11);
        AbstractC5868k.m23673e(editText4, "et_lock_time_two");
        editText3.addTextChangedListener(new b(this, editText4));
        ((Button) m11644a(i12)).setOnClickListener(this);
        ((Button) m11644a(i13)).setOnClickListener(this);
    }

    /* renamed from: a */
    public View m11644a(int i10) {
        Map map = this.f10973d;
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

    /* renamed from: f */
    public final void m11645f() {
        ((Button) m11644a(R$id.btn_pwd_time_ok)).performClick();
    }

    /* renamed from: g */
    public final void m11646g() {
        ViewParent parent = getParent();
        AbstractC5868k.m23672d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(this);
    }

    /* renamed from: h */
    public final void m11647h() {
        int i10 = R$id.mTvLockTimeHint;
        if (((TextView) m11644a(i10)).getVisibility() == 0) {
            ((TextView) m11644a(i10)).setVisibility(4);
        }
    }

    /* renamed from: j */
    public final boolean m11648j() {
        if (getParent() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m11649k(int i10, int i11) {
        int i12 = R$id.mTvLockTimeHint;
        ((TextView) m11644a(i12)).setText(i10);
        ((TextView) m11644a(i12)).setTextColor(getResources().getColor(i11));
        ((TextView) m11644a(i12)).setVisibility(0);
    }

    /* renamed from: l */
    public final void m11650l(String str, String str2) {
        AbstractC5868k.m23674f(str, AnalyticsConfig.RTD_START_TIME);
        AbstractC5868k.m23674f(str2, "endTime");
        ((EditText) m11644a(R$id.et_lock_time_one)).setText(str);
        ((EditText) m11644a(R$id.et_lock_time_two)).setText(str2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        a aVar;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.btn_pwd_time_ok;
        if (num != null && num.intValue() == i10) {
            a aVar2 = this.f10972c;
            if (aVar2 != null) {
                aVar2.mo11653g6(this, this.f10970a, this.f10971b);
                return;
            }
            return;
        }
        int i11 = R$id.btn_pwd_time_unlock;
        if (num != null && num.intValue() == i11 && (aVar = this.f10972c) != null) {
            aVar.mo11652Y4(this);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (i10 == 4) {
            m11646g();
            a aVar = this.f10972c;
            if (aVar != null) {
                aVar.mo11651J3();
            }
            return true;
        }
        a aVar2 = this.f10972c;
        if (aVar2 != null) {
            aVar2.mo11654x();
        }
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (view != null && view.getId() == R$id.et_lock_time_one) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                switch (i10) {
                    case 19:
                        return true;
                    case 20:
                        ((Button) m11644a(R$id.btn_pwd_time_ok)).requestFocus();
                        return true;
                    case 21:
                        if (((EditText) m11644a(R$id.et_lock_time_one)).getSelectionStart() == 0) {
                            return true;
                        }
                    default:
                        return false;
                }
            } else {
                if (view != null && view.getId() == R$id.et_lock_time_two) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i10 == 19) {
                        return true;
                    }
                    if (i10 != 20) {
                        if (i10 == 22) {
                            int i11 = R$id.et_lock_time_two;
                            if (((EditText) m11644a(i11)).getSelectionStart() + 1 == ((EditText) m11644a(i11)).getText().length()) {
                                return true;
                            }
                        }
                    } else {
                        ((Button) m11644a(R$id.btn_pwd_time_ok)).requestFocus();
                        return true;
                    }
                } else {
                    if (view != null && view.getId() == R$id.btn_pwd_time_ok) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (i10 != 19) {
                            if (i10 == 21 || i10 == 22) {
                                return true;
                            }
                        } else {
                            ((EditText) m11644a(R$id.et_lock_time_one)).requestFocus();
                            return true;
                        }
                    } else {
                        if (view != null && view.getId() == R$id.btn_pwd_time_unlock) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            switch (i10) {
                                case 19:
                                    ((Button) m11644a(R$id.btn_pwd_time_ok)).requestFocus();
                                    return true;
                                case 20:
                                case 21:
                                case 22:
                                    return true;
                            }
                        }
                    }
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

    public final void setLockListener(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f10972c = aVar;
    }

    public /* synthetic */ ViewOnKeyListenerC2883k(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
