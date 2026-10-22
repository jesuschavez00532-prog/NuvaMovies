package p212kd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.bean.VodQualityBean;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: kd.h1 */
/* loaded from: classes3.dex */
public final class C5180h1 extends AbstractC7527b {

    /* renamed from: e */
    private int f21201e;

    /* renamed from: f */
    private InterfaceC5660l f21202f;

    public C5180h1() {
        super(R$layout.layout_item_select_quality, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m20905r(C5180h1 c5180h1, int i10, View view) {
        AbstractC5868k.m23674f(c5180h1, "this$0");
        InterfaceC5660l interfaceC5660l = c5180h1.f21202f;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(i10));
        }
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, VodQualityBean vodQualityBean) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(vodQualityBean, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.tvName);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.ivIcon);
        textView.setText(vodQualityBean.getDisplayQuality());
        final int adapterPosition = c7531f.getAdapterPosition();
        if (adapterPosition == this.f21201e) {
            textView.setTextColor(m28850h().getResources().getColor(R$color.color_bnt_focused));
            imageView.setSelected(true);
        } else {
            textView.setTextColor(m28850h().getResources().getColor(R$color.color_c4c4c4));
            imageView.setSelected(false);
        }
        c7531f.m28864c(R$id.mLayoutQualityItem, new View.OnClickListener() { // from class: kd.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5180h1.m20905r(C5180h1.this, adapterPosition, view);
            }
        });
    }

    /* renamed from: s */
    public final int m20907s() {
        return this.f21201e;
    }

    /* renamed from: t */
    public final void m20908t(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "clickListener");
        this.f21202f = interfaceC5660l;
    }

    /* renamed from: u */
    public final void m20909u(int i10) {
        this.f21201e = i10;
        notifyDataSetChanged();
    }
}
