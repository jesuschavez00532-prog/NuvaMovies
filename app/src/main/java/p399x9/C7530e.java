package p399x9;

import android.view.View;
import android.widget.ImageView;
import com.module.R$layout;
import com.module.R$mipmap;
import com.request.result.DeviceData;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p011aa.AbstractViewOnClickListenerC0123a;

/* renamed from: x9.e */
/* loaded from: classes2.dex */
public final class C7530e extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5660l f27671e;

    /* renamed from: x9.e$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractViewOnClickListenerC0123a {

        /* renamed from: b */
        final /* synthetic */ DeviceData f27672b;

        /* renamed from: c */
        final /* synthetic */ ImageView f27673c;

        /* renamed from: d */
        final /* synthetic */ C7530e f27674d;

        a(DeviceData deviceData, ImageView imageView, C7530e c7530e) {
            this.f27672b = deviceData;
            this.f27673c = imageView;
            this.f27674d = c7530e;
        }

        @Override // p011aa.AbstractViewOnClickListenerC0123a
        /* renamed from: c */
        public void mo492c(View view) {
            int i10 = 0;
            boolean z10 = true;
            this.f27672b.setSelected(!r5.isSelected());
            if (this.f27672b.isSelected()) {
                i10 = R$mipmap.icon_device_selected;
            } else {
                i10 = R$mipmap.icon_device_unselected;
            }
            this.f27673c.setImageResource(i10);
            List m28849g = this.f27674d.m28849g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m28849g) {
                if (((DeviceData) obj).isSelected()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            InterfaceC5660l m28861s = this.f27674d.m28861s();
            if (m28861s != null) {
                if (size <= 0) {
                    z10 = false;
                }
                m28861s.mo542f(Boolean.valueOf(z10));
            }
        }
    }

    public C7530e() {
        super(R$layout.item_device_limit, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m28859r(C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        c7531f.itemView.setSelected(z10);
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006f, code lost:
    
        if (r1.equals("2") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007b, code lost:
    
        r1 = com.module.R$mipmap.icon_tv;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0078, code lost:
    
        if (r1.equals("1") == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5338e(final p399x9.C7531f r6, com.request.result.DeviceData r7) {
        /*
            r5 = this;
            java.lang.String r0 = "holder"
            ne.AbstractC5868k.m23674f(r6, r0)
            java.lang.String r0 = "bean"
            ne.AbstractC5868k.m23674f(r7, r0)
            int r0 = com.module.R$id.tvDevice
            java.lang.String r1 = r7.getDeviceName()
            java.lang.String r2 = "unknown"
            if (r1 != 0) goto L15
            r1 = r2
        L15:
            r6.m28865d(r0, r1)
            int r0 = com.module.R$id.tvLocation
            java.lang.String r1 = r7.getLoginCountry()
            if (r1 != 0) goto L21
            r1 = r2
        L21:
            r6.m28865d(r0, r1)
            int r0 = com.module.R$id.tvTime
            java.lang.String r1 = r7.getLoginTime()
            if (r1 == 0) goto L38
            cc.l0 r3 = cc.C1464l0.f5622a
            java.lang.String r4 = "HH:mm dd/MM/yyyy"
            java.lang.String r1 = r3.m6826e(r1, r4)
            if (r1 != 0) goto L37
            goto L38
        L37:
            r2 = r1
        L38:
            r6.m28865d(r0, r2)
            int r0 = com.module.R$id.ivDevice
            java.lang.Object r0 = r6.m28863b(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = r7.getLoginType()
            if (r1 == 0) goto L7e
            int r2 = r1.hashCode()
            switch(r2) {
                case 49: goto L72;
                case 50: goto L69;
                case 51: goto L5d;
                case 52: goto L51;
                default: goto L50;
            }
        L50:
            goto L7e
        L51:
            java.lang.String r2 = "4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5a
            goto L7e
        L5a:
            int r1 = com.module.R$mipmap.icon_web
            goto L80
        L5d:
            java.lang.String r2 = "3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L66
            goto L7e
        L66:
            int r1 = com.module.R$mipmap.icon_mob
            goto L80
        L69:
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7b
            goto L7e
        L72:
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7b
            goto L7e
        L7b:
            int r1 = com.module.R$mipmap.icon_tv
            goto L80
        L7e:
            int r1 = com.module.R$mipmap.icon_unknow
        L80:
            r0.setImageResource(r1)
            int r0 = com.module.R$id.ivChoose
            java.lang.Object r0 = r6.m28863b(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r1 = r7.isSelected()
            if (r1 == 0) goto L94
            int r1 = com.module.R$mipmap.icon_device_selected
            goto L96
        L94:
            int r1 = com.module.R$mipmap.icon_device_unselected
        L96:
            r0.setImageResource(r1)
            java.util.List r1 = r5.m28849g()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        La6:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.request.result.DeviceData r4 = (com.request.result.DeviceData) r4
            boolean r4 = r4.isSelected()
            if (r4 == 0) goto La6
            r2.add(r3)
            goto La6
        Lbd:
            int r1 = r2.size()
            me.l r2 = r5.f27671e
            if (r2 == 0) goto Ld1
            if (r1 <= 0) goto Lc9
            r1 = 1
            goto Lca
        Lc9:
            r1 = 0
        Lca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.mo542f(r1)
        Ld1:
            android.view.View r1 = r6.itemView
            x9.d r2 = new x9.d
            r2.<init>()
            r1.setOnFocusChangeListener(r2)
            android.view.View r6 = r6.itemView
            x9.e$a r1 = new x9.e$a
            r1.<init>(r7, r0, r5)
            r6.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p399x9.C7530e.mo5338e(x9.f, com.request.result.DeviceData):void");
    }

    /* renamed from: s */
    public final InterfaceC5660l m28861s() {
        return this.f27671e;
    }

    /* renamed from: t */
    public final void m28862t(InterfaceC5660l interfaceC5660l) {
        this.f27671e = interfaceC5660l;
    }
}
