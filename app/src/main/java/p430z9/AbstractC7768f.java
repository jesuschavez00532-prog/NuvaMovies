package p430z9;

import android.view.View;
import android.widget.FrameLayout;
import ba.AbstractC1196d;
import ca.InterfaceC1439a;
import com.module.R$drawable;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import p011aa.InterfaceC0124b;
import p400xa.C7554b;

/* renamed from: z9.f */
/* loaded from: classes2.dex */
public abstract class AbstractC7768f<P extends InterfaceC1439a> extends AbstractC1196d<P> implements InterfaceC0124b {

    /* renamed from: y0 */
    private InterfaceC5642a f28631y0;

    /* renamed from: z0 */
    public Map f28632z0 = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G9 */
    public final InterfaceC5642a m30066G9() {
        return this.f28631y0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H9 */
    public final void m30067H9(View view, boolean z10, View view2) {
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(view2, "focusBorderView");
        if (z10) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
            layoutParams.leftMargin = view.getLeft() - AutoSizeUtils.dp2px(m3096J6(), 60.0f);
            layoutParams.topMargin = view.getTop();
            view2.setBackgroundResource(R$drawable.poster_focus_nohalo);
            view2.setLayoutParams(layoutParams);
            view2.setVisibility(0);
            view2.bringToFront();
            C7554b.m28939e(m5477v9(), view2, 0.0f, 2, null);
            return;
        }
        C7554b.m28940h(m5477v9(), view2, 0.0f, 2, null);
        view2.setVisibility(8);
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p011aa.InterfaceC0124b
    /* renamed from: g5 */
    public boolean mo495g5() {
        return InterfaceC0124b.a.m496a(this);
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f28632z0.clear();
    }
}
