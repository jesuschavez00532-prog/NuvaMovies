package p028b8;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.request.result.ShelveMatch;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7594o0;

/* renamed from: b8.j */
/* loaded from: classes2.dex */
public final class C1165j extends AbstractC7527b {

    /* renamed from: e */
    private boolean f4601e;

    /* renamed from: f */
    private InterfaceC5660l f4602f;

    /* renamed from: g */
    private InterfaceC5642a f4603g;

    public C1165j() {
        super(R$layout.item_match_category, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m5336s(C7531f c7531f, C1165j c1165j, ShelveMatch shelveMatch, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c1165j, "this$0");
        AbstractC5868k.m23674f(shelveMatch, "$bean");
        int i10 = R$id.tvName;
        ((TextView) c7531f.m28863b(i10)).setSelected(z10);
        if (z10) {
            if (c1165j.f4601e) {
                c7531f.itemView.setSelected(false);
                ((TextView) c7531f.m28863b(i10)).setSelected(true);
                ((TextView) c7531f.m28863b(i10)).setEnabled(true);
            } else {
                InterfaceC5660l interfaceC5660l = c1165j.f4602f;
                if (interfaceC5660l != null) {
                    interfaceC5660l.mo542f(shelveMatch);
                }
            }
            c1165j.f4601e = false;
            return;
        }
        if (c1165j.f4601e) {
            c7531f.itemView.setSelected(true);
            ((TextView) c7531f.m28863b(i10)).setSelected(false);
            ((TextView) c7531f.m28863b(i10)).setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final boolean m5337t(C1165j c1165j, View view, int i10, KeyEvent keyEvent) {
        InterfaceC5642a interfaceC5642a;
        AbstractC5868k.m23674f(c1165j, "this$0");
        if (keyEvent.getAction() != 0 || i10 != 22 || (interfaceC5642a = c1165j.f4603g) == null) {
            return false;
        }
        return ((Boolean) interfaceC5642a.invoke()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final ShelveMatch shelveMatch) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(shelveMatch, "bean");
        C7594o0 c7594o0 = C7594o0.f27942a;
        Context m28850h = m28850h();
        String logo = shelveMatch.getLogo();
        if (logo == null) {
            logo = "";
        }
        C7594o0.m29188C(c7594o0, m28850h, logo, (ImageView) c7531f.m28863b(R$id.mIvMatchLogo), Integer.valueOf(R$drawable.ic_match_logo_default), null, null, 0, 112, null);
        c7531f.m28865d(R$id.tvName, shelveMatch.getMatchName());
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b8.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C1165j.m5336s(C7531f.this, this, shelveMatch, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: b8.i
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m5337t;
                m5337t = C1165j.m5337t(C1165j.this, view, i10, keyEvent);
                return m5337t;
            }
        });
    }

    /* renamed from: u */
    public final void m5340u(boolean z10) {
        this.f4601e = z10;
    }

    /* renamed from: v */
    public final void m5341v(InterfaceC5660l interfaceC5660l) {
        this.f4602f = interfaceC5660l;
    }

    /* renamed from: w */
    public final void m5342w(InterfaceC5642a interfaceC5642a) {
        this.f4603g = interfaceC5642a;
    }
}
