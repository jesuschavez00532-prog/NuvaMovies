package p265oa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7577i1;

/* renamed from: oa.l */
/* loaded from: classes2.dex */
public final class C5954l extends AbstractC7527b {

    /* renamed from: e */
    private int f23657e;

    /* renamed from: f */
    private InterfaceC5660l f23658f;

    /* renamed from: g */
    private int f23659g;

    public C5954l(int i10) {
        super(R$layout.layout_type_adapter_subtitle, null, 2, null);
        this.f23657e = i10;
        this.f23659g = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m24104s(TextView textView, View view, boolean z10) {
        AbstractC5868k.m23674f(textView, "$mTextTitle");
        textView.setSelected(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m24105t(C5954l c5954l, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c5954l, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5660l interfaceC5660l = c5954l.f23658f;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c7531f.getPosition()));
        }
        if (c5954l.f23657e == 4) {
            c5954l.f23659g = c7531f.getPosition();
            c5954l.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, String str) {
        int i10 = 0;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(str, "bean");
        final TextView textView = (TextView) c7531f.m28863b(R$id.mTvTitle);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mIvChoose);
        textView.setText(str);
        if (this.f23657e == 4) {
            if (this.f23659g == c7531f.getPosition()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oa.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5954l.m24104s(textView, view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: oa.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5954l.m24105t(C5954l.this, c7531f, view);
            }
        });
    }

    /* renamed from: u */
    public final void m24107u(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f23658f = interfaceC5660l;
    }
}
