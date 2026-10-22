package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.module.R$color;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.s0 */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC4797s0 extends C7767e implements TextWatcher, View.OnKeyListener {

    /* renamed from: F0 */
    private View f20216F0;

    /* renamed from: G0 */
    private String f20217G0;

    /* renamed from: H0 */
    private String f20218H0;

    /* renamed from: I0 */
    private int f20219I0;

    /* renamed from: J0 */
    private final Context f20220J0;

    /* renamed from: K0 */
    public Map f20221K0;

    public ViewOnKeyListenerC4797s0(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f20221K0 = new LinkedHashMap();
        this.f20217G0 = "";
        this.f20218H0 = "";
        this.f20220J0 = context;
    }

    /* renamed from: K9 */
    private final void m19819K9() {
        ((EditText) m19827J9(R$id.mEditFirstOne)).setText("");
        ((EditText) m19827J9(R$id.mEditSecondOne)).setText("");
        ((EditText) m19827J9(R$id.mEditThirdOne)).setText("");
        ((EditText) m19827J9(R$id.mEditFourthOne)).setText("");
        ((EditText) m19827J9(R$id.mEditNewFirstOne)).setText("");
        ((EditText) m19827J9(R$id.mEditNewSecondOne)).setText("");
        ((EditText) m19827J9(R$id.mEditNewThirdOne)).setText("");
        ((EditText) m19827J9(R$id.mEditNewFourthOne)).setText("");
    }

    /* renamed from: L9 */
    private final boolean m19820L9() {
        return C4160d.f18217d.m17391c();
    }

    /* renamed from: M9 */
    private final void m19821M9() {
        if (!TextUtils.isEmpty(this.f20217G0) && this.f20217G0.length() >= 4) {
            String str = this.f20217G0;
            AbstractC4161e.a aVar = AbstractC4161e.f18225a;
            if (!AbstractC5868k.m23669a(str, aVar.m17399b())) {
                if (m19820L9()) {
                    this.f20219I0 = 0;
                    m19825Q9(R$string.input_more_error_tip, R$color.setting_error_color);
                    return;
                }
                int i10 = this.f20219I0 + 1;
                this.f20219I0 = i10;
                if (i10 >= 10) {
                    aVar.m17405h();
                }
                m19825Q9(R$string.old_pwd_error, R$color.setting_error_color);
                return;
            }
            if (!TextUtils.isEmpty(this.f20218H0) && this.f20218H0.length() >= 4) {
                if (AbstractC5868k.m23669a(this.f20218H0, this.f20217G0)) {
                    m19825Q9(R$string.pwd_consistent, R$color.setting_error_color);
                    return;
                }
                if (m19820L9()) {
                    this.f20219I0 = 0;
                    m19825Q9(R$string.input_more_error_tip, R$color.setting_error_color);
                    return;
                }
                aVar.m17398a();
                this.f20219I0 = 0;
                aVar.m17402e(this.f20218H0);
                m19819K9();
                C4160d.b bVar = C4160d.f18217d;
                Context m3096J6 = m3096J6();
                AbstractC5868k.m23671c(m3096J6);
                Context applicationContext = m3096J6.getApplicationContext();
                AbstractC5868k.m23673e(applicationContext, "context!!.applicationContext");
                String m3172j7 = m3172j7(R$string.pwd_modify_suc);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.pwd_modify_suc)");
                C4160d.b.m17389f(bVar, applicationContext, m3172j7, false, 4, null);
                mo3279p9();
                return;
            }
            m19825Q9(R$string.new_pwd_error, R$color.setting_error_color);
            return;
        }
        if (m19820L9()) {
            this.f20219I0 = 0;
            m19825Q9(R$string.input_more_error_tip, R$color.setting_error_color);
            return;
        }
        int i11 = this.f20219I0 + 1;
        this.f20219I0 = i11;
        if (i11 >= 10) {
            AbstractC4161e.f18225a.m17405h();
        }
        m19825Q9(R$string.old_pwd_error, R$color.setting_error_color);
    }

    /* renamed from: N9 */
    private final void m19822N9() {
        ((Button) m19827J9(R$id.mButtonConfirm)).setOnClickListener(new View.OnClickListener() { // from class: ha.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnKeyListenerC4797s0.m19823O9(ViewOnKeyListenerC4797s0.this, view);
            }
        });
        int i10 = R$id.mEditFirstOne;
        ((EditText) m19827J9(i10)).addTextChangedListener(this);
        int i11 = R$id.mEditSecondOne;
        ((EditText) m19827J9(i11)).addTextChangedListener(this);
        int i12 = R$id.mEditThirdOne;
        ((EditText) m19827J9(i12)).addTextChangedListener(this);
        int i13 = R$id.mEditFourthOne;
        ((EditText) m19827J9(i13)).addTextChangedListener(this);
        int i14 = R$id.mEditNewFirstOne;
        ((EditText) m19827J9(i14)).addTextChangedListener(this);
        int i15 = R$id.mEditNewSecondOne;
        ((EditText) m19827J9(i15)).addTextChangedListener(this);
        int i16 = R$id.mEditNewThirdOne;
        ((EditText) m19827J9(i16)).addTextChangedListener(this);
        int i17 = R$id.mEditNewFourthOne;
        ((EditText) m19827J9(i17)).addTextChangedListener(this);
        ((EditText) m19827J9(i10)).setOnKeyListener(this);
        ((EditText) m19827J9(i11)).setOnKeyListener(this);
        ((EditText) m19827J9(i12)).setOnKeyListener(this);
        ((EditText) m19827J9(i13)).setOnKeyListener(this);
        ((EditText) m19827J9(i14)).setOnKeyListener(this);
        ((EditText) m19827J9(i15)).setOnKeyListener(this);
        ((EditText) m19827J9(i16)).setOnKeyListener(this);
        ((EditText) m19827J9(i17)).setOnKeyListener(this);
        ((Button) m19827J9(R$id.mButtonCancel)).setOnClickListener(new View.OnClickListener() { // from class: ha.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnKeyListenerC4797s0.m19824P9(ViewOnKeyListenerC4797s0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O9 */
    public static final void m19823O9(ViewOnKeyListenerC4797s0 viewOnKeyListenerC4797s0, View view) {
        AbstractC5868k.m23674f(viewOnKeyListenerC4797s0, "this$0");
        viewOnKeyListenerC4797s0.m19826R9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P9 */
    public static final void m19824P9(ViewOnKeyListenerC4797s0 viewOnKeyListenerC4797s0, View view) {
        AbstractC5868k.m23674f(viewOnKeyListenerC4797s0, "this$0");
        viewOnKeyListenerC4797s0.mo3278o9();
    }

    /* renamed from: Q9 */
    private final void m19825Q9(int i10, int i11) {
        C4160d.b bVar = C4160d.f18217d;
        Context context = this.f20220J0;
        String string = m3154d7().getString(i10);
        AbstractC5868k.m23673e(string, "resources.getString(textId)");
        C4160d.b.m17389f(bVar, context, string, false, 4, null);
    }

    /* renamed from: R9 */
    private final void m19826R9() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) ((EditText) m19827J9(R$id.mEditFirstOne)).getText());
        sb2.append((Object) ((EditText) m19827J9(R$id.mEditSecondOne)).getText());
        sb2.append((Object) ((EditText) m19827J9(R$id.mEditThirdOne)).getText());
        sb2.append((Object) ((EditText) m19827J9(R$id.mEditFourthOne)).getText());
        this.f20217G0 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) ((EditText) m19827J9(R$id.mEditNewFirstOne)).getText());
        sb3.append((Object) ((EditText) m19827J9(R$id.mEditNewSecondOne)).getText());
        sb3.append((Object) ((EditText) m19827J9(R$id.mEditNewThirdOne)).getText());
        sb3.append((Object) ((EditText) m19827J9(R$id.mEditNewFourthOne)).getText());
        this.f20218H0 = sb3.toString();
        m19821M9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20221K0.clear();
    }

    /* renamed from: J9 */
    public View m19827J9(int i10) {
        View findViewById;
        Map map = this.f20221K0;
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

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_modify_parent_pwd, viewGroup, false);
        this.f20216F0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!TextUtils.isEmpty(String.valueOf(editable))) {
            int i10 = R$id.mEditFirstOne;
            if (((EditText) m19827J9(i10)).hasFocus() && ((EditText) m19827J9(i10)).length() == 1) {
                ((EditText) m19827J9(R$id.mEditSecondOne)).requestFocus();
                return;
            }
            int i11 = R$id.mEditSecondOne;
            if (((EditText) m19827J9(i11)).hasFocus() && ((EditText) m19827J9(i11)).length() == 1) {
                ((EditText) m19827J9(R$id.mEditThirdOne)).requestFocus();
                return;
            }
            int i12 = R$id.mEditThirdOne;
            if (((EditText) m19827J9(i12)).hasFocus() && ((EditText) m19827J9(i12)).length() == 1) {
                ((EditText) m19827J9(R$id.mEditFourthOne)).requestFocus();
                return;
            }
            int i13 = R$id.mEditFourthOne;
            if (((EditText) m19827J9(i13)).hasFocus() && ((EditText) m19827J9(i13)).length() == 1) {
                ((EditText) m19827J9(R$id.mEditNewFirstOne)).requestFocus();
                return;
            }
            int i14 = R$id.mEditNewFirstOne;
            if (((EditText) m19827J9(i14)).hasFocus() && ((EditText) m19827J9(i14)).length() == 1) {
                ((EditText) m19827J9(R$id.mEditNewSecondOne)).requestFocus();
                return;
            }
            int i15 = R$id.mEditNewSecondOne;
            if (((EditText) m19827J9(i15)).hasFocus() && ((EditText) m19827J9(i15)).length() == 1) {
                ((EditText) m19827J9(R$id.mEditNewThirdOne)).requestFocus();
                return;
            }
            int i16 = R$id.mEditNewThirdOne;
            if (((EditText) m19827J9(i16)).hasFocus() && ((EditText) m19827J9(i16)).length() == 1) {
                ((EditText) m19827J9(R$id.mEditNewFourthOne)).requestFocus();
                return;
            }
            int i17 = R$id.mEditNewFourthOne;
            if (((EditText) m19827J9(i17)).hasFocus() && ((EditText) m19827J9(i17)).length() == 1) {
                ((Button) m19827J9(R$id.mButtonConfirm)).requestFocus();
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(763));
        }
    }

    @Override // p430z9.C7767e, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        super.mo3173j8();
        m19819K9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        m19819K9();
        m19822N9();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int id2 = view.getId();
        int i11 = R$id.mEditFirstOne;
        if (id2 == i11) {
            if (i10 != 19) {
                if (i10 != 20) {
                    if (i10 != 22) {
                        return false;
                    }
                    ((EditText) m19827J9(R$id.mEditSecondOne)).requestFocus();
                } else if (((AutoLinearLayout) m19827J9(R$id.mLayoutSetNewPassword)).getVisibility() == 0) {
                    ((EditText) m19827J9(R$id.mEditNewFirstOne)).requestFocus();
                } else {
                    ((Button) m19827J9(R$id.mButtonConfirm)).requestFocus();
                }
            }
        } else {
            int i12 = R$id.mEditSecondOne;
            if (id2 == i12) {
                switch (i10) {
                    case 19:
                        break;
                    case 20:
                        if (((AutoLinearLayout) m19827J9(R$id.mLayoutSetNewPassword)).getVisibility() == 0) {
                            ((EditText) m19827J9(R$id.mEditNewSecondOne)).requestFocus();
                            break;
                        } else {
                            ((Button) m19827J9(R$id.mButtonConfirm)).requestFocus();
                            break;
                        }
                    case 21:
                        ((EditText) m19827J9(i11)).requestFocus();
                        break;
                    case 22:
                        ((EditText) m19827J9(R$id.mEditThirdOne)).requestFocus();
                        break;
                    default:
                        return false;
                }
            } else {
                int i13 = R$id.mEditThirdOne;
                if (id2 == i13) {
                    if (i10 != 19) {
                        if (i10 != 21) {
                            if (i10 != 22) {
                                return false;
                            }
                            ((EditText) m19827J9(R$id.mEditFourthOne)).requestFocus();
                        } else {
                            ((EditText) m19827J9(i12)).requestFocus();
                        }
                    }
                } else if (id2 == R$id.mEditFourthOne) {
                    if (i10 != 19) {
                        if (i10 != 21) {
                            if (i10 != 22) {
                                return false;
                            }
                        } else {
                            ((EditText) m19827J9(i13)).requestFocus();
                        }
                    }
                } else {
                    int i14 = R$id.mEditNewFirstOne;
                    if (id2 == i14) {
                        if (i10 != 22) {
                            return false;
                        }
                        ((EditText) m19827J9(R$id.mEditNewSecondOne)).requestFocus();
                    } else {
                        int i15 = R$id.mEditNewSecondOne;
                        if (id2 == i15) {
                            if (i10 != 19) {
                                if (i10 != 21) {
                                    if (i10 != 22) {
                                        return false;
                                    }
                                    ((EditText) m19827J9(R$id.mEditNewThirdOne)).requestFocus();
                                } else {
                                    ((EditText) m19827J9(i14)).requestFocus();
                                }
                            } else {
                                ((EditText) m19827J9(i12)).requestFocus();
                            }
                        } else {
                            int i16 = R$id.mEditNewThirdOne;
                            if (id2 == i16) {
                                if (i10 != 21) {
                                    if (i10 != 22) {
                                        return false;
                                    }
                                    ((EditText) m19827J9(R$id.mEditNewFourthOne)).requestFocus();
                                } else {
                                    ((EditText) m19827J9(i15)).requestFocus();
                                }
                            } else {
                                if (id2 != R$id.mEditNewFourthOne) {
                                    return false;
                                }
                                if (i10 != 21) {
                                    if (i10 != 22) {
                                        return false;
                                    }
                                } else {
                                    ((EditText) m19827J9(i16)).requestFocus();
                                }
                            }
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
}
