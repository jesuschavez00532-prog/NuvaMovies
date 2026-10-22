package p212kd;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$string;
import com.request.bean.SubTitleItemData;
import com.vod.R$id;
import com.vod.R$layout;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p287pb.AbstractApplicationC6253c;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: kd.m1 */
/* loaded from: classes3.dex */
public final class C5200m1 extends AbstractC7527b {

    /* renamed from: e */
    private String f21284e;

    /* renamed from: f */
    private String f21285f;

    /* renamed from: g */
    private InterfaceC5664p f21286g;

    /* renamed from: h */
    private int f21287h;

    public C5200m1() {
        super(R$layout.item_select_subtitle_audio_sub_content, null, 2, null);
        this.f21284e = "";
        this.f21285f = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m21006r(C7531f c7531f, SubTitleItemData subTitleItemData, C5200m1 c5200m1, View view) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(subTitleItemData, "$bean");
        AbstractC5868k.m23674f(c5200m1, "this$0");
        if (c7531f.itemView.isSelected()) {
            return;
        }
        int adapterPosition = c7531f.getAdapterPosition();
        c5200m1.f21287h = adapterPosition;
        InterfaceC5664p interfaceC5664p = c5200m1.f21286g;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Integer.valueOf(adapterPosition), String.valueOf(subTitleItemData.getLanguage()));
        }
        c5200m1.notifyDataSetChanged();
    }

    /* renamed from: s */
    private final String m21007s(String str) {
        Context m24887a = AbstractApplicationC6253c.f24484b.m24887a();
        if (AbstractC5868k.m23669a(str, "zh")) {
            String string = m24887a.getString(R$string.language_zh);
            AbstractC5868k.m23673e(string, "mContext.getString(com.m…ule.R.string.language_zh)");
            return string;
        }
        if (AbstractC5868k.m23669a(str, "zh_HK")) {
            String string2 = m24887a.getString(R$string.language_zh_HK);
            AbstractC5868k.m23673e(string2, "mContext.getString(com.m….R.string.language_zh_HK)");
            return string2;
        }
        if (AbstractC5868k.m23669a(str, "en")) {
            String string3 = m24887a.getString(R$string.language_en);
            AbstractC5868k.m23673e(string3, "mContext.getString(com.m…ule.R.string.language_en)");
            return string3;
        }
        if (AbstractC5868k.m23669a(str, "es")) {
            String string4 = m24887a.getString(R$string.language_es);
            AbstractC5868k.m23673e(string4, "mContext.getString(com.m…ule.R.string.language_es)");
            return string4;
        }
        if (AbstractC5868k.m23669a(str, "hi")) {
            String string5 = m24887a.getString(R$string.language_hi);
            AbstractC5868k.m23673e(string5, "mContext.getString(com.m…ule.R.string.language_hi)");
            return string5;
        }
        if (AbstractC5868k.m23669a(str, "pt")) {
            String string6 = m24887a.getString(R$string.language_pt);
            AbstractC5868k.m23673e(string6, "mContext.getString(com.m…ule.R.string.language_pt)");
            return string6;
        }
        if (AbstractC5868k.m23669a(str, "ms")) {
            String string7 = m24887a.getString(R$string.language_ms);
            AbstractC5868k.m23673e(string7, "mContext.getString(com.m…ule.R.string.language_ms)");
            return string7;
        }
        if (AbstractC5868k.m23669a(str, "fr")) {
            String string8 = m24887a.getString(R$string.language_fr);
            AbstractC5868k.m23673e(string8, "mContext.getString(com.m…ule.R.string.language_fr)");
            return string8;
        }
        if (AbstractC5868k.m23669a(str, "chi")) {
            String string9 = m24887a.getString(R$string.audio_zh);
            AbstractC5868k.m23673e(string9, "mContext.getString(com.module.R.string.audio_zh)");
            return string9;
        }
        if (AbstractC5868k.m23669a(str, "por")) {
            String string10 = m24887a.getString(R$string.language_pt);
            AbstractC5868k.m23673e(string10, "mContext.getString(com.m…ule.R.string.language_pt)");
            return string10;
        }
        if (AbstractC5868k.m23669a(str, "eng")) {
            String string11 = m24887a.getString(R$string.language_en);
            AbstractC5868k.m23673e(string11, "mContext.getString(com.m…ule.R.string.language_en)");
            return string11;
        }
        if (AbstractC5868k.m23669a(str, "spa")) {
            String string12 = m24887a.getString(R$string.language_es);
            AbstractC5868k.m23673e(string12, "mContext.getString(com.m…ule.R.string.language_es)");
            return string12;
        }
        if (AbstractC5868k.m23669a(str, "fre")) {
            String string13 = m24887a.getString(R$string.language_fr);
            AbstractC5868k.m23673e(string13, "mContext.getString(com.m…ule.R.string.language_fr)");
            return string13;
        }
        if (AbstractC5868k.m23669a(str, "ara")) {
            String string14 = m24887a.getString(R$string.audio_ara);
            AbstractC5868k.m23673e(string14, "mContext.getString(com.module.R.string.audio_ara)");
            return string14;
        }
        if (AbstractC5868k.m23669a(str, "ita")) {
            String string15 = m24887a.getString(R$string.audio_ita);
            AbstractC5868k.m23673e(string15, "mContext.getString(com.module.R.string.audio_ita)");
            return string15;
        }
        if (AbstractC5868k.m23669a(str, "dut")) {
            String string16 = m24887a.getString(R$string.audio_dut);
            AbstractC5868k.m23673e(string16, "mContext.getString(com.module.R.string.audio_dut)");
            return string16;
        }
        if (AbstractC5868k.m23669a(str, "ger")) {
            String string17 = m24887a.getString(R$string.audio_ger);
            AbstractC5868k.m23673e(string17, "mContext.getString(com.module.R.string.audio_ger)");
            return string17;
        }
        if (AbstractC5868k.m23669a(str, "heb")) {
            String string18 = m24887a.getString(R$string.audio_heb);
            AbstractC5868k.m23673e(string18, "mContext.getString(com.module.R.string.audio_heb)");
            return string18;
        }
        if (AbstractC5868k.m23669a(str, "jpn")) {
            String string19 = m24887a.getString(R$string.audio_jpn);
            AbstractC5868k.m23673e(string19, "mContext.getString(com.module.R.string.audio_jpn)");
            return string19;
        }
        int i10 = R$string.language_null;
        if (AbstractC5868k.m23669a(str, m24887a.getString(i10))) {
            String string20 = m24887a.getString(i10);
            AbstractC5868k.m23673e(string20, "mContext.getString(com.m…e.R.string.language_null)");
            return string20;
        }
        String string21 = m24887a.getString(R$string.audio_default);
        AbstractC5868k.m23673e(string21, "{\n                mConte…io_default)\n            }");
        return string21;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final SubTitleItemData subTitleItemData) {
        boolean z10;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(subTitleItemData, "bean");
        View view = c7531f.itemView;
        if (this.f21287h == c7531f.getAdapterPosition()) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setSelected(z10);
        TextView textView = (TextView) c7531f.m28863b(R$id.tvName);
        if (c7531f.itemView.isSelected()) {
            ((ImageView) c7531f.m28863b(R$id.ivIcon)).setVisibility(0);
        } else {
            ((ImageView) c7531f.m28863b(R$id.ivIcon)).setVisibility(8);
        }
        String language = subTitleItemData.getLanguage();
        if (language == null) {
            language = "";
        }
        textView.setText(m21007s(language));
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5200m1.m21006r(C7531f.this, subTitleItemData, this, view2);
            }
        });
    }

    /* renamed from: t */
    public final void m21009t(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21284e = str;
    }

    /* renamed from: u */
    public final void m21010u(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21285f = str;
    }

    /* renamed from: v */
    public final void m21011v(InterfaceC5664p interfaceC5664p) {
        this.f21286g = interfaceC5664p;
    }

    /* renamed from: w */
    public final void m21012w(int i10) {
        this.f21287h = i10;
    }
}
