package td;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.module.childlock.view.MarqueTextView;
import com.request.result.AssetData;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.R$style;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import ne.C5881x;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p400xa.C7607s1;

/* renamed from: td.b */
/* loaded from: classes3.dex */
public final class C6934b extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: C0 */
    private AssetData f26280C0;

    /* renamed from: D0 */
    public Map f26281D0 = new LinkedHashMap();

    /* renamed from: H9 */
    private final String m26932H9(String str) {
        if (str == null) {
            String m3172j7 = m3172j7(R$string.unknown);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.unknown)");
            return m3172j7;
        }
        return str;
    }

    /* renamed from: J9 */
    private final void m26933J9(AssetData assetData) {
        this.f26280C0 = assetData;
        if (AbstractC6567a.m25637g(assetData.getName())) {
            C7607s1 c7607s1 = new C7607s1();
            String name = assetData.getName();
            AbstractC5868k.m23671c(name);
            ((TextView) m26937G9(R$id.mTvName)).setText(m26932H9(c7607s1.m29251a(name).getName()));
        } else {
            ((TextView) m26937G9(R$id.mTvName)).setText(m26932H9(assetData.getName()));
        }
        ((MarqueTextView) m26937G9(R$id.mTextTimeType)).setText(m26932H9(assetData.getReleaseTime() + ' ' + assetData.getTags()));
        ((MarqueTextView) m26937G9(R$id.mTextDirector)).setText(m26932H9(assetData.getDirector()));
        ((TextView) m26937G9(R$id.mTextActor)).setText(m26932H9(assetData.getActorDisplay()));
        m26934K9(assetData);
        m26935L9(assetData);
        ((TextView) m26937G9(R$id.mTextContent)).setText("\u3000\u3000\u3000\u3000\u3000" + assetData.getDescription());
    }

    /* renamed from: K9 */
    private final void m26934K9(AssetData assetData) {
        boolean z10 = true;
        if (assetData.getScore() > 0.0f && assetData.getScore() < 10.0f) {
            int i10 = R$id.mTextScore;
            ((TextView) m26937G9(i10)).setVisibility(0);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = m3172j7(R$string.program_score);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.program_score)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(((int) assetData.getScore()) % 10), Integer.valueOf(((int) (assetData.getScore() * 10)) % 10)}, 2));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            ((TextView) m26937G9(i10)).setText(Html.fromHtml(format));
            return;
        }
        if (assetData.getScore() != 10.0f) {
            z10 = false;
        }
        if (z10) {
            ((TextView) m26937G9(R$id.mTextScore)).setText(String.valueOf((int) assetData.getScore()));
        } else {
            ((TextView) m26937G9(R$id.mTextScore)).setVisibility(8);
        }
    }

    /* renamed from: L9 */
    private final void m26935L9(AssetData assetData) {
        int i10 = 0;
        ImageView imageView = (ImageView) m26937G9(R$id.mIvSupportSubtitle);
        int i11 = 0;
        if (assetData.getMoreSubtitle() == 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = (ImageView) m26937G9(R$id.mIvSupportAudio);
        if (assetData.getMoreAudio() != 1) {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
    }

    /* renamed from: F9 */
    public void m26936F9() {
        this.f26281D0.clear();
    }

    /* renamed from: G9 */
    public View m26937G9(int i10) {
        View findViewById;
        Map map = this.f26281D0;
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
    public final void m26938I9(AssetData assetData) {
        this.f26280C0 = assetData;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_program_introduction, viewGroup, false);
        inflate.setBackgroundDrawable(AbstractC7026c.m27111a(m3096J6(), R$color.color_0b0b0b));
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m26936F9();
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
        AssetData assetData = this.f26280C0;
        if (assetData != null) {
            m26933J9(assetData);
        }
    }
}
