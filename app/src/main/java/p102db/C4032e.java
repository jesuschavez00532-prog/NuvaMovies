package p102db;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.module.R$color;
import com.module.R$drawable;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p433zd.AbstractC7786b;

/* renamed from: db.e */
/* loaded from: classes2.dex */
public final class C4032e extends PopupWindow {

    /* renamed from: a */
    private Context f17840a;

    /* renamed from: b */
    private ListView f17841b;

    /* renamed from: c */
    private a f17842c;

    /* renamed from: d */
    private InterfaceC5660l f17843d;

    /* renamed from: db.e$a */
    /* loaded from: classes2.dex */
    public static final class a extends BaseAdapter {

        /* renamed from: a */
        private Context f17844a;

        /* renamed from: b */
        private ArrayList f17845b;

        /* renamed from: c */
        private int f17846c;

        public a(Context context) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            this.f17844a = context;
            this.f17845b = new ArrayList();
        }

        /* renamed from: a */
        public final void m17025a(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "data");
            this.f17845b.clear();
            this.f17845b.addAll(arrayList);
            notifyDataSetChanged();
        }

        /* renamed from: b */
        public final void m17026b(int i10) {
            this.f17846c = i10;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f17845b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            Object obj = this.f17845b.get(i10);
            AbstractC5868k.m23673e(obj, "mData[position]");
            return obj;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            AutoLinearLayout autoLinearLayout = new AutoLinearLayout(this.f17844a);
            ViewGroup.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, AbstractC7786b.m30166j(48));
            autoLinearLayout.setGravity(16);
            autoLinearLayout.setLayoutParams(layoutParams);
            TextView textView = new TextView(this.f17844a);
            textView.setSingleLine();
            textView.setTextColor(this.f17844a.getResources().getColorStateList(R$color.text_dropdown_item_color));
            textView.setGravity(16);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setTextSize(0, AbstractC7786b.m30166j(32));
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            textView.setText((CharSequence) this.f17845b.get(i10));
            ImageView imageView = new ImageView(this.f17844a);
            imageView.setImageResource(R$drawable.sel_icon_dropdown_arrow);
            AutoLinearLayout.C3911a c3911a = new AutoLinearLayout.C3911a(AbstractC7786b.m30166j(20), AbstractC7786b.m30163g(15));
            ((LinearLayout.LayoutParams) c3911a).leftMargin = AbstractC7786b.m30166j(16);
            ((LinearLayout.LayoutParams) c3911a).rightMargin = AbstractC7786b.m30166j(6);
            imageView.setLayoutParams(c3911a);
            if (i10 == this.f17846c) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
            autoLinearLayout.addView(imageView);
            autoLinearLayout.addView(textView);
            return autoLinearLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4032e(Context context) {
        super(context);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17840a = context;
        m17021b();
    }

    /* renamed from: b */
    private final void m17021b() {
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(AbstractC7786b.m30166j(360));
        setHeight(AbstractC7786b.m30163g(295));
        ListView listView = new ListView(this.f17840a);
        this.f17841b = listView;
        listView.setFocusable(true);
        AutoLinearLayout.C3911a c3911a = new AutoLinearLayout.C3911a(-1, -1);
        ListView listView2 = this.f17841b;
        ListView listView3 = null;
        if (listView2 == null) {
            AbstractC5868k.m23686r("mListView");
            listView2 = null;
        }
        listView2.setLayoutParams(c3911a);
        ListView listView4 = this.f17841b;
        if (listView4 == null) {
            AbstractC5868k.m23686r("mListView");
            listView4 = null;
        }
        listView4.setBackgroundResource(R$drawable.bg_dropdown_list);
        ListView listView5 = this.f17841b;
        if (listView5 == null) {
            AbstractC5868k.m23686r("mListView");
            listView5 = null;
        }
        listView5.setSelector(R$drawable.sel_dropdown_item);
        ListView listView6 = this.f17841b;
        if (listView6 == null) {
            AbstractC5868k.m23686r("mListView");
            listView6 = null;
        }
        listView6.setDividerHeight(0);
        ListView listView7 = this.f17841b;
        if (listView7 == null) {
            AbstractC5868k.m23686r("mListView");
            listView7 = null;
        }
        setContentView(listView7);
        this.f17842c = new a(this.f17840a);
        ListView listView8 = this.f17841b;
        if (listView8 == null) {
            AbstractC5868k.m23686r("mListView");
            listView8 = null;
        }
        a aVar = this.f17842c;
        if (aVar == null) {
            AbstractC5868k.m23686r("mAdapter");
            aVar = null;
        }
        listView8.setAdapter((ListAdapter) aVar);
        ListView listView9 = this.f17841b;
        if (listView9 == null) {
            AbstractC5868k.m23686r("mListView");
        } else {
            listView3 = listView9;
        }
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: db.d
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                C4032e.m17022c(C4032e.this, adapterView, view, i10, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m17022c(C4032e c4032e, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(c4032e, "this$0");
        InterfaceC5660l interfaceC5660l = c4032e.f17843d;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(i10));
        }
        a aVar = c4032e.f17842c;
        if (aVar == null) {
            AbstractC5868k.m23686r("mAdapter");
            aVar = null;
        }
        aVar.m17026b(i10);
        c4032e.dismiss();
    }

    /* renamed from: d */
    public final void m17023d(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "data");
        a aVar = this.f17842c;
        if (aVar == null) {
            AbstractC5868k.m23686r("mAdapter");
            aVar = null;
        }
        aVar.m17025a(arrayList);
    }

    /* renamed from: e */
    public final void m17024e(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f17843d = interfaceC5660l;
    }
}
