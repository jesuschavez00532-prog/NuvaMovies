package td;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;

/* renamed from: td.a */
/* loaded from: classes3.dex */
public final class C6933a extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: F0 */
    public static final a f26276F0 = new a(null);

    /* renamed from: C0 */
    private String f26277C0;

    /* renamed from: D0 */
    private String f26278D0;

    /* renamed from: E0 */
    public Map f26279E0 = new LinkedHashMap();

    /* renamed from: td.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: H9 */
    private final String m26927H9(String str) {
        if (AbstractC6567a.m25637g(str)) {
            AbstractC5868k.m23671c(str);
            return str;
        }
        String m3172j7 = m3172j7(R$string.unknown);
        AbstractC5868k.m23673e(m3172j7, "{\n            getString(…string.unknown)\n        }");
        return m3172j7;
    }

    /* renamed from: J9 */
    private final void m26928J9(String str) {
        ((TextView) m26930G9(R$id.mTextContent)).setText(m26927H9(str));
    }

    /* renamed from: F9 */
    public void m26929F9() {
        this.f26279E0.clear();
    }

    /* renamed from: G9 */
    public View m26930G9(int i10) {
        View findViewById;
        Map map = this.f26279E0;
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

    /* renamed from: I9 */
    public final void m26931I9(String str, String str2) {
        AbstractC5868k.m23674f(str, "detailType");
        this.f26278D0 = str;
        this.f26277C0 = str2;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_actor_detail_explain, viewGroup, false);
        inflate.setBackgroundDrawable(AbstractC7026c.m27111a(m3096J6(), R$color.color_0b0b0b));
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m26929F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        String str = this.f26278D0;
        if (str != null) {
            if (AbstractC5868k.m23669a(str, "awards")) {
                ((TextView) m26930G9(R$id.mTvDetailType)).setText(m3172j7(R$string.string_awards));
            } else if (AbstractC5868k.m23669a(str, "introduction")) {
                ((TextView) m26930G9(R$id.mTvDetailType)).setText(m3172j7(R$string.string_introduction));
            }
            m26928J9(this.f26277C0);
        }
        ((ScrollView) m26930G9(R$id.mScrollView)).scrollTo(0, 0);
    }
}
