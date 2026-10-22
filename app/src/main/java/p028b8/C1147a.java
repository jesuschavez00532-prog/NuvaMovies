package p028b8;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.live.R$id;
import com.module.view.FixGifImageView;
import com.request.result.ChildColumn;
import com.umeng.analytics.pro.C3384f;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import java.util.HashMap;
import ne.AbstractC5868k;

/* renamed from: b8.a */
/* loaded from: classes2.dex */
public final class C1147a extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private Context f4474a;

    /* renamed from: b */
    private boolean f4475b;

    /* renamed from: c */
    private ArrayList f4476c;

    /* renamed from: d */
    private int f4477d;

    /* renamed from: e */
    private HashMap f4478e;

    /* renamed from: b8.a$a */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a */
        private RelativeLayout f4479a;

        /* renamed from: b */
        private TextView f4480b;

        /* renamed from: c */
        private FixGifImageView f4481c;

        /* renamed from: d */
        private ImageView f4482d;

        /* renamed from: e */
        final /* synthetic */ C1147a f4483e;

        public a(C1147a c1147a, View view) {
            AbstractC5868k.m23674f(view, "itemView");
            this.f4483e = c1147a;
            View findViewById = view.findViewById(R$id.mRlCategoryItem);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f4479a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R$id.mTvCategoryName);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f4480b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R$id.mIvDrawable);
            AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type com.module.view.FixGifImageView");
            this.f4481c = (FixGifImageView) findViewById3;
            View findViewById4 = view.findViewById(R$id.mIvLock);
            AbstractC5868k.m23672d(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f4482d = (ImageView) findViewById4;
        }

        /* renamed from: a */
        public final FixGifImageView m5210a() {
            return this.f4481c;
        }

        /* renamed from: b */
        public final ImageView m5211b() {
            return this.f4482d;
        }

        /* renamed from: c */
        public final RelativeLayout m5212c() {
            return this.f4479a;
        }

        /* renamed from: d */
        public final TextView m5213d() {
            return this.f4480b;
        }
    }

    public C1147a(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f4474a = context;
        this.f4475b = true;
        this.f4476c = new ArrayList();
        this.f4477d = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ChildColumn getItem(int i10) {
        Object obj = this.f4476c.get(i10);
        AbstractC5868k.m23673e(obj, "childColumnList[position]");
        return (ChildColumn) obj;
    }

    /* renamed from: b */
    public final void m5207b(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "liveColumnList");
        this.f4476c.clear();
        this.f4476c.addAll(arrayList);
        this.f4476c.remove(0);
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public final void m5208c(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "map");
        this.f4478e = hashMap;
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public final void m5209d(boolean z10) {
        this.f4475b = z10;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4476c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (r1.containsKey(java.lang.Integer.valueOf(r5.getId())) == true) goto L16;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L18
            android.content.Context r6 = r4.f4474a
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r1 = com.live.R$layout.layout_tab_category_item
            android.view.View r6 = r6.inflate(r1, r7, r0)
            b8.a$a r7 = new b8.a$a
            r7.<init>(r4, r6)
            r6.setTag(r7)
            goto L23
        L18:
            java.lang.Object r7 = r6.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.live.adapter.CategoryAdapter.CategoryViewHolder"
            ne.AbstractC5868k.m23672d(r7, r1)
            b8.a$a r7 = (p028b8.C1147a.a) r7
        L23:
            java.util.ArrayList r1 = r4.f4476c
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r1 = "childColumnList[position]"
            ne.AbstractC5868k.m23673e(r5, r1)
            com.request.result.ChildColumn r5 = (com.request.result.ChildColumn) r5
            boolean r1 = r4.f4475b
            r2 = 8
            if (r1 == 0) goto L3e
            android.widget.RelativeLayout r1 = r7.m5212c()
            r1.setVisibility(r0)
            goto L45
        L3e:
            android.widget.RelativeLayout r1 = r7.m5212c()
            r1.setVisibility(r2)
        L45:
            java.util.HashMap r1 = r4.f4478e
            if (r1 == 0) goto L59
            int r3 = r5.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.containsKey(r3)
            r3 = 1
            if (r1 != r3) goto L59
            goto L5a
        L59:
            r3 = 0
        L5a:
            if (r3 == 0) goto L85
            com.module.view.FixGifImageView r1 = r7.m5210a()
            r1.setVisibility(r0)
            android.widget.TextView r1 = r7.m5213d()
            r1.setVisibility(r2)
            com.module.view.FixGifImageView r1 = r7.m5210a()
            java.util.HashMap r2 = r4.f4478e
            ne.AbstractC5868k.m23671c(r2)
            int r3 = r5.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setImageDrawable(r2)
            goto L9e
        L85:
            com.module.view.FixGifImageView r1 = r7.m5210a()
            r1.setVisibility(r2)
            android.widget.TextView r1 = r7.m5213d()
            r1.setVisibility(r0)
            android.widget.TextView r1 = r7.m5213d()
            java.lang.String r2 = p237m8.AbstractC5607a.m22777b(r5)
            r1.setText(r2)
        L9e:
            java.lang.String r5 = r5.getRestricted()
            java.lang.String r1 = "1"
            boolean r5 = ne.AbstractC5868k.m23669a(r5, r1)
            if (r5 == 0) goto Lb2
            android.widget.ImageView r5 = r7.m5211b()
            r5.setVisibility(r0)
            goto Lba
        Lb2:
            android.widget.ImageView r5 = r7.m5211b()
            r7 = 4
            r5.setVisibility(r7)
        Lba:
            ne.AbstractC5868k.m23671c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p028b8.C1147a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
