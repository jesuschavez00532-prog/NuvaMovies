package p212kd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p212kd.C5192k1;
import p225ld.C5552f;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: kd.k1 */
/* loaded from: classes3.dex */
public final class C5192k1 extends AbstractC7527b {

    /* renamed from: e */
    private String f21239e;

    /* renamed from: f */
    private String f21240f;

    /* renamed from: g */
    private InterfaceC5660l f21241g;

    /* renamed from: h */
    private int f21242h;

    /* renamed from: i */
    private final String f21243i;

    /* renamed from: kd.k1$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC7527b {

        /* renamed from: e */
        private String f21244e;

        /* renamed from: f */
        private String f21245f;

        /* renamed from: g */
        private InterfaceC5660l f21246g;

        /* renamed from: h */
        private final String f21247h;

        /* renamed from: i */
        private int f21248i;

        public a() {
            super(R$layout.item_select_subtitle_audio_sub_big_color, null, 2, null);
            this.f21244e = "";
            this.f21245f = "";
            this.f21247h = "SubtitleColorSizeItemAdapter";
            this.f21248i = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public static final void m20958r(C7531f c7531f, a aVar, C5552f c5552f, View view) {
            AbstractC5868k.m23674f(c7531f, "$holder");
            AbstractC5868k.m23674f(aVar, "this$0");
            AbstractC5868k.m23674f(c5552f, "$bean");
            if (c7531f.itemView.isSelected()) {
                return;
            }
            InterfaceC5660l interfaceC5660l = aVar.f21246g;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Integer.valueOf(c5552f.m22513a()));
            }
            aVar.f21248i = c5552f.m22513a();
            aVar.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p399x9.AbstractC7527b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo5338e(final C7531f c7531f, final C5552f c5552f) {
            boolean z10;
            AbstractC5868k.m23674f(c7531f, "holder");
            AbstractC5868k.m23674f(c5552f, "bean");
            View view = c7531f.itemView;
            if (this.f21248i == c5552f.m22513a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            view.setSelected(z10);
            ((TextView) c7531f.m28863b(R$id.tvName)).setText(c5552f.m22514b());
            if (c7531f.itemView.isSelected()) {
                ((ImageView) c7531f.m28863b(R$id.ivIcon)).setVisibility(0);
            } else {
                ((ImageView) c7531f.m28863b(R$id.ivIcon)).setVisibility(8);
            }
            c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5192k1.a.m20958r(C7531f.this, this, c5552f, view2);
                }
            });
        }

        /* renamed from: s */
        public final void m20960s(String str) {
            AbstractC5868k.m23674f(str, "<set-?>");
            this.f21244e = str;
        }

        /* renamed from: t */
        public final void m20961t(String str) {
            AbstractC5868k.m23674f(str, "<set-?>");
            this.f21245f = str;
        }

        /* renamed from: u */
        public final void m20962u(InterfaceC5660l interfaceC5660l) {
            this.f21246g = interfaceC5660l;
        }

        /* renamed from: v */
        public final void m20963v(int i10) {
            this.f21248i = i10;
        }
    }

    public C5192k1() {
        super(R$layout.item_select_subtitle_audio_sub_big_color, null, 2, null);
        this.f21239e = "";
        this.f21240f = "";
        this.f21242h = 2;
        this.f21243i = "SubtitleColorSizeItemAdapter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m20951r(C7531f c7531f, C5552f c5552f, C5192k1 c5192k1, View view) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c5552f, "$bean");
        AbstractC5868k.m23674f(c5192k1, "this$0");
        if (c7531f.itemView.isSelected()) {
            return;
        }
        c5192k1.f21242h = c5552f.m22513a();
        InterfaceC5660l interfaceC5660l = c5192k1.f21241g;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c5552f.m22513a()));
        }
        c5192k1.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final C5552f c5552f) {
        boolean z10;
        int color;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(c5552f, "bean");
        View view = c7531f.itemView;
        if (this.f21242h == c5552f.m22513a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setSelected(z10);
        int i10 = R$id.tvName;
        TextView textView = (TextView) c7531f.m28863b(i10);
        ((TextView) c7531f.m28863b(i10)).setText(c5552f.m22514b());
        LinearLayout linearLayout = (LinearLayout) c7531f.m28863b(R$id.mLlName);
        if (c7531f.itemView.isSelected()) {
            ((ImageView) c7531f.m28863b(R$id.ivIcon)).setVisibility(0);
        } else {
            ((ImageView) c7531f.m28863b(R$id.ivIcon)).setVisibility(8);
        }
        if (c5552f.m22513a() == 3) {
            color = m28850h().getResources().getColor(R$color.color_ffffff);
            linearLayout.setBackgroundColor(m28850h().getResources().getColor(R$color.black));
        } else if (c5552f.m22513a() == 1) {
            color = m28850h().getResources().getColor(R$color.color_f6e33f);
            linearLayout.setBackgroundColor(m28850h().getResources().getColor(R$color.color_00ffffff));
        } else {
            color = m28850h().getResources().getColor(R$color.color_ffffff);
            linearLayout.setBackgroundColor(m28850h().getResources().getColor(R$color.color_00ffffff));
        }
        textView.setTextColor(color);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5192k1.m20951r(C7531f.this, c5552f, this, view2);
            }
        });
    }

    /* renamed from: s */
    public final void m20953s(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21239e = str;
    }

    /* renamed from: t */
    public final void m20954t(int i10) {
        this.f21242h = i10;
    }

    /* renamed from: u */
    public final void m20955u(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21240f = str;
    }

    /* renamed from: v */
    public final void m20956v(InterfaceC5660l interfaceC5660l) {
        this.f21241g = interfaceC5660l;
    }
}
