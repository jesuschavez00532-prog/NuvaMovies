package p265oa;

import android.view.View;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: oa.c */
/* loaded from: classes2.dex */
public final class C5945c extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5660l f23636e;

    public C5945c() {
        super(R$layout.layout_type_adapter_subtitle, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m24077s(TextView textView, View view, boolean z10) {
        AbstractC5868k.m23674f(textView, "$mTextTitle");
        textView.setSelected(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m24078t(C5945c c5945c, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c5945c, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5660l interfaceC5660l = c5945c.f23636e;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c7531f.getPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, String str) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(str, "bean");
        final TextView textView = (TextView) c7531f.m28863b(R$id.mTvTitle);
        textView.setText(str);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oa.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5945c.m24077s(textView, view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: oa.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5945c.m24078t(C5945c.this, c7531f, view);
            }
        });
    }

    /* renamed from: u */
    public final void m24080u(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f23636e = interfaceC5660l;
    }
}
