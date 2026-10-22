package p265oa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p104dd.C4094b;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import vc.EnumC7254b;

/* renamed from: oa.g */
/* loaded from: classes2.dex */
public final class C5949g extends AbstractC7527b {

    /* renamed from: e */
    private int f23645e;

    /* renamed from: f */
    private InterfaceC5660l f23646f;

    /* renamed from: g */
    private int f23647g;

    /* renamed from: oa.g$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23648a;

        static {
            int[] iArr = new int[EnumC7254b.values().length];
            try {
                iArr[EnumC7254b.IJK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23648a = iArr;
        }
    }

    public C5949g(int i10) {
        super(R$layout.layout_type_adapter_subtitle, null, 2, null);
        this.f23645e = i10;
        this.f23647g = m24091u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m24089s(TextView textView, View view, boolean z10) {
        AbstractC5868k.m23674f(textView, "$mTextTitle");
        textView.setSelected(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m24090t(C5949g c5949g, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c5949g, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (c5949g.f23647g != c7531f.getPosition()) {
            InterfaceC5660l interfaceC5660l = c5949g.f23646f;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Integer.valueOf(c7531f.getPosition()));
            }
            c5949g.f23647g = c7531f.getPosition();
            c5949g.notifyDataSetChanged();
        }
    }

    /* renamed from: u */
    private final int m24091u() {
        EnumC7254b m17145h;
        if (this.f23645e == 2) {
            m17145h = C4094b.f17998a.m17144g();
        } else {
            m17145h = C4094b.f17998a.m17145h();
        }
        if (a.f23648a[m17145h.ordinal()] == 1) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, String str) {
        int i10;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(str, "bean");
        final TextView textView = (TextView) c7531f.m28863b(R$id.mTvTitle);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mIvChoose);
        textView.setText(str);
        if (this.f23647g == c7531f.getPosition()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oa.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5949g.m24089s(textView, view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: oa.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5949g.m24090t(C5949g.this, c7531f, view);
            }
        });
    }

    /* renamed from: v */
    public final void m24093v(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f23646f = interfaceC5660l;
    }

    /* renamed from: w */
    public final void m24094w() {
        this.f23647g = m24091u();
        notifyDataSetChanged();
    }
}
