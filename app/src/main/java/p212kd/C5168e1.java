package p212kd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.bean.AudioInfoBean;
import com.vod.R$id;
import com.vod.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: kd.e1 */
/* loaded from: classes3.dex */
public final class C5168e1 extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5660l f21173e;

    /* renamed from: f */
    private int f21174f;

    /* renamed from: g */
    private boolean f21175g;

    /* renamed from: h */
    private String f21176h;

    public C5168e1() {
        super(R$layout.layout_item_vod_subtitle_and_audio, null, 2, null);
        this.f21174f = -1;
        this.f21176h = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m20887r(C7531f c7531f, C5168e1 c5168e1, View view) {
        InterfaceC5660l interfaceC5660l;
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c5168e1, "this$0");
        if ((c7531f.getAdapterPosition() != c5168e1.f21174f || !c5168e1.f21175g) && (interfaceC5660l = c5168e1.f21173e) != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c7531f.getAdapterPosition()));
        }
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, AudioInfoBean audioInfoBean) {
        boolean z10;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(audioInfoBean, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.mSubTitleText);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mChooseImg);
        View view = c7531f.itemView;
        if (c7531f.getAdapterPosition() == this.f21174f && this.f21175g) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setSelected(z10);
        if (c7531f.itemView.isSelected()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(audioInfoBean.getTransLanguage());
        textView.setSelected(c7531f.itemView.hasFocus());
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5168e1.m20887r(C7531f.this, this, view2);
            }
        });
    }

    /* renamed from: s */
    public final void m20889s(InterfaceC5660l interfaceC5660l) {
        this.f21173e = interfaceC5660l;
    }

    /* renamed from: t */
    public final void m20890t(int i10) {
        this.f21174f = i10;
    }

    /* renamed from: u */
    public final void m20891u(boolean z10) {
        this.f21175g = z10;
    }
}
