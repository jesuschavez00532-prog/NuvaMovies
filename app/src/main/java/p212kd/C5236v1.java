package p212kd;

import android.view.MotionEvent;
import android.view.View;
import com.vod.R$layout;
import java.util.HashMap;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: kd.v1 */
/* loaded from: classes3.dex */
public final class C5236v1 extends AbstractC7527b {

    /* renamed from: e */
    private HashMap f21391e;

    /* renamed from: f */
    private InterfaceC5664p f21392f;

    /* renamed from: g */
    private InterfaceC5660l f21393g;

    public C5236v1() {
        super(R$layout.layout_item_vod_category, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m21098s(C7531f c7531f, C5236v1 c5236v1, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c5236v1, "this$0");
        c7531f.itemView.setSelected(z10);
        InterfaceC5664p interfaceC5664p = c5236v1.f21392f;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Integer.valueOf(c7531f.getAdapterPosition()), Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final boolean m21099t(C5236v1 c5236v1, C7531f c7531f, View view, MotionEvent motionEvent) {
        InterfaceC5660l interfaceC5660l;
        AbstractC5868k.m23674f(c5236v1, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (motionEvent.getAction() == 1 && (interfaceC5660l = c5236v1.f21393g) != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c7531f.getAdapterPosition()));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0.containsKey(java.lang.Integer.valueOf(r6.getId())) == true) goto L8;
     */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5338e(final p399x9.C7531f r5, com.request.result.ChildColumn r6) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            ne.AbstractC5868k.m23674f(r5, r0)
            java.lang.String r0 = "bean"
            ne.AbstractC5868k.m23674f(r6, r0)
            java.util.HashMap r0 = r4.f21391e
            r1 = 0
            if (r0 == 0) goto L1f
            int r2 = r6.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r2)
            r2 = 1
            if (r0 != r2) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            r0 = 8
            if (r2 == 0) goto L57
            int r2 = com.vod.R$id.mTextName
            java.lang.Object r2 = r5.m28863b(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setVisibility(r0)
            int r0 = com.vod.R$id.mIvDrawable
            java.lang.Object r2 = r5.m28863b(r0)
            com.module.view.FixGifImageView r2 = (com.module.view.FixGifImageView) r2
            r2.setVisibility(r1)
            java.lang.Object r0 = r5.m28863b(r0)
            com.module.view.FixGifImageView r0 = (com.module.view.FixGifImageView) r0
            java.util.HashMap r1 = r4.f21391e
            ne.AbstractC5868k.m23671c(r1)
            int r6 = r6.getId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r1.get(r6)
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r0.setImageDrawable(r6)
            goto L82
        L57:
            int r2 = com.vod.R$id.mTextName
            java.lang.Object r3 = r5.m28863b(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setVisibility(r1)
            int r1 = com.vod.R$id.mIvDrawable
            java.lang.Object r1 = r5.m28863b(r1)
            com.module.view.FixGifImageView r1 = (com.module.view.FixGifImageView) r1
            r1.setVisibility(r0)
            java.lang.Object r0 = r5.m28863b(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r6.getName()
            java.lang.String r6 = r6.getAlias()
            java.lang.String r6 = p201k2.AbstractC5091h.m20660c(r1, r6)
            r0.setText(r6)
        L82:
            android.view.View r6 = r5.itemView
            kd.t1 r0 = new kd.t1
            r0.<init>()
            r6.setOnFocusChangeListener(r0)
            android.view.View r6 = r5.itemView
            kd.u1 r0 = new kd.u1
            r0.<init>()
            r6.setOnTouchListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212kd.C5236v1.mo5338e(x9.f, com.request.result.ChildColumn):void");
    }

    /* renamed from: u */
    public final void m21101u(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "map");
        this.f21391e = hashMap;
        notifyDataSetChanged();
    }

    /* renamed from: v */
    public final void m21102v(InterfaceC5660l interfaceC5660l) {
        this.f21393g = interfaceC5660l;
    }
}
