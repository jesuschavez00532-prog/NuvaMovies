package p265oa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.request.bean.SubTitleItemData;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: oa.n */
/* loaded from: classes2.dex */
public final class C5956n extends AbstractC7527b {

    /* renamed from: f */
    public static final a f23662f = new a(null);

    /* renamed from: g */
    private static int f23663g;

    /* renamed from: e */
    private InterfaceC5660l f23664e;

    /* renamed from: oa.n$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m24114a(int i10) {
            C5956n.f23663g = i10;
        }
    }

    public C5956n() {
        super(R$layout.layout_type_adapter_subtitle, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m24110s(C5956n c5956n, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c5956n, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5660l interfaceC5660l = c5956n.f23664e;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c7531f.getPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, SubTitleItemData subTitleItemData) {
        boolean z10 = false;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(subTitleItemData, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.mTvTitle);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mIvChoose);
        textView.setText(subTitleItemData.getTransLanguage());
        View view = c7531f.itemView;
        int i10 = 0;
        if (f23663g == c7531f.getPosition()) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setSelected(z10);
        if (f23663g != c7531f.getPosition()) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: oa.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5956n.m24110s(C5956n.this, c7531f, view2);
            }
        });
    }

    /* renamed from: t */
    public final void m24112t(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f23664e = interfaceC5660l;
    }

    /* renamed from: u */
    public final void m24113u(int i10) {
        f23663g = i10;
        notifyDataSetChanged();
    }
}
