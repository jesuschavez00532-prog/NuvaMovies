package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.live.R$id;
import com.live.R$layout;
import com.live.bean.TabData;
import com.umeng.analytics.pro.C3384f;
import com.widget.custom.adapter.BaseAdapterImpl;
import me.InterfaceC5664p;
import ne.AbstractC5868k;

/* renamed from: b8.q0 */
/* loaded from: classes2.dex */
public final class C1180q0 extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private final InterfaceC5664p f4665a;

    /* renamed from: b */
    private Context f4666b;

    /* renamed from: c */
    private boolean f4667c;

    /* renamed from: d */
    private TabData f4668d;

    /* renamed from: e */
    private int[] f4669e;

    /* renamed from: f */
    private int[] f4670f;

    /* renamed from: g */
    private int[] f4671g;

    /* renamed from: h */
    private int f4672h;

    /* renamed from: i */
    private boolean f4673i;

    /* renamed from: b8.q0$a */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a */
        private ImageView f4674a;

        /* renamed from: b */
        private TextView f4675b;

        /* renamed from: c */
        final /* synthetic */ C1180q0 f4676c;

        public a(C1180q0 c1180q0, View view) {
            AbstractC5868k.m23674f(view, "itemView");
            this.f4676c = c1180q0;
            View findViewById = view.findViewById(R$id.mIvTab);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f4674a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R$id.mTvTab);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f4675b = (TextView) findViewById2;
        }

        /* renamed from: a */
        public final ImageView m5419a() {
            return this.f4674a;
        }

        /* renamed from: b */
        public final TextView m5420b() {
            return this.f4675b;
        }
    }

    public C1180q0(Context context, InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(interfaceC5664p, "touchListener");
        this.f4665a = interfaceC5664p;
        this.f4666b = context;
        this.f4667c = true;
        TabData tabData = new TabData();
        this.f4668d = tabData;
        this.f4669e = tabData.getTitles();
        this.f4670f = this.f4668d.getImageNormal();
        this.f4671g = this.f4668d.getImageSelect();
        this.f4672h = -1;
        this.f4673i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m5416b(C1180q0 c1180q0, int i10, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c1180q0, "this$0");
        if (motionEvent.getAction() == 1) {
            c1180q0.setSecondPosition(i10);
            InterfaceC5664p interfaceC5664p = c1180q0.f4665a;
            AbstractC5868k.m23673e(view, "v");
            interfaceC5664p.mo2391h(view, Integer.valueOf(i10));
        }
        return true;
    }

    /* renamed from: c */
    public final void m5417c(boolean z10) {
        this.f4673i = z10;
    }

    /* renamed from: d */
    public final void m5418d(boolean z10) {
        this.f4667c = z10;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4668d.getTitles().length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return Integer.valueOf(this.f4668d.getTitles()[i10]);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(final int i10, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f4666b).inflate(R$layout.layout_tab_item, viewGroup, false);
            aVar = new a(this, view);
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.TabListAdapter.TabViewHolder");
            aVar = (a) tag;
        }
        aVar.m5420b().setText(this.f4669e[i10]);
        if (this.f4667c) {
            aVar.m5420b().setVisibility(0);
        } else {
            aVar.m5420b().setVisibility(8);
        }
        aVar.m5419a().setImageResource(this.f4670f[i10]);
        if (this.f4672h == i10) {
            aVar.m5419a().setImageResource(this.f4671g[i10]);
        } else {
            aVar.m5419a().setImageResource(this.f4670f[i10]);
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: b8.p0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m5416b;
                m5416b = C1180q0.m5416b(C1180q0.this, i10, view2, motionEvent);
                return m5416b;
            }
        });
        AbstractC5868k.m23671c(view);
        return view;
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
        if (this.f4673i) {
            this.f4672h = i10;
            notifyDataSetChanged();
        } else {
            this.f4673i = true;
        }
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
