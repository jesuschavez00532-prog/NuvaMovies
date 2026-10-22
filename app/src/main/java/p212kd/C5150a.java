package p212kd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.request.result.PersonDetailInfo;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p400xa.C7580j1;
import p400xa.C7594o0;
import p433zd.AbstractC7786b;

/* renamed from: kd.a */
/* loaded from: classes3.dex */
public final class C5150a extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private Context f21117a;

    /* renamed from: b */
    private ListView f21118b;

    /* renamed from: c */
    private ArrayList f21119c;

    /* renamed from: d */
    private View f21120d;

    /* renamed from: e */
    private int f21121e;

    /* renamed from: kd.a$a */
    /* loaded from: classes3.dex */
    private final class a {

        /* renamed from: a */
        private ImageView f21122a;

        /* renamed from: b */
        private TextView f21123b;

        public a() {
        }

        /* renamed from: a */
        public final ImageView m20829a() {
            return this.f21122a;
        }

        /* renamed from: b */
        public final TextView m20830b() {
            return this.f21123b;
        }

        /* renamed from: c */
        public final void m20831c(ImageView imageView) {
            this.f21122a = imageView;
        }

        /* renamed from: d */
        public final void m20832d(TextView textView) {
            this.f21123b = textView;
        }
    }

    public C5150a(Context context, ListView listView) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(listView, "mListView");
        this.f21117a = context;
        this.f21118b = listView;
        this.f21119c = new ArrayList();
        this.f21121e = -1;
    }

    /* renamed from: a */
    public final void m20822a(List list) {
        AbstractC5868k.m23674f(list, "data");
        this.f21119c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final int m20823b() {
        int i10 = 0;
        for (Object obj : this.f21119c) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            if (((PersonDetailInfo) obj).getPersonType() == 1) {
                return i10;
            }
            i10 = i11;
        }
        return 0;
    }

    /* renamed from: c */
    public final int m20824c() {
        int i10 = 0;
        for (Object obj : this.f21119c) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            if (((PersonDetailInfo) obj).getPersonType() == 0) {
                return i10;
            }
            i10 = i11;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public PersonDetailInfo getItem(int i10) {
        Object obj = this.f21119c.get(i10);
        AbstractC5868k.m23673e(obj, "mActorList[position]");
        return (PersonDetailInfo) obj;
    }

    /* renamed from: e */
    public final int m20826e() {
        return this.f21121e;
    }

    /* renamed from: f */
    public final View m20827f() {
        return this.f21120d;
    }

    /* renamed from: g */
    public final void m20828g(int i10, View view) {
        this.f21120d = view;
        this.f21121e = i10;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f21119c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        AbstractC5868k.m23674f(viewGroup, "parent");
        boolean z10 = false;
        if (view == null) {
            a aVar2 = new a();
            View inflate = LayoutInflater.from(this.f21117a).inflate(R$layout.layout_item_actor_list, viewGroup, false);
            AbstractC7786b.m30161e(inflate);
            View view3 = null;
            if (inflate != null) {
                view2 = inflate.findViewById(R$id.mImgActorHeader);
            } else {
                view2 = null;
            }
            AbstractC5868k.m23672d(view2, "null cannot be cast to non-null type android.widget.ImageView");
            aVar2.m20831c((ImageView) view2);
            if (inflate != null) {
                view3 = inflate.findViewById(R$id.mTextActorName);
            }
            AbstractC5868k.m23672d(view3, "null cannot be cast to non-null type android.widget.TextView");
            aVar2.m20832d((TextView) view3);
            inflate.setTag(aVar2);
            aVar = aVar2;
            view = inflate;
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.vod.adapter.ActorAdapter.ViewHolder");
            aVar = (a) tag;
        }
        if (this.f21121e == i10) {
            z10 = true;
        }
        view.setActivated(z10);
        if (this.f21121e == i10) {
            this.f21120d = view;
        }
        String m29088a = C7580j1.f27853a.m29088a(((PersonDetailInfo) this.f21119c.get(i10)).getIcon());
        C7594o0 c7594o0 = C7594o0.f27942a;
        ImageView m20829a = aVar.m20829a();
        AbstractC5868k.m23671c(m20829a);
        C7594o0.m29203l(c7594o0, m29088a, m20829a, this.f21117a, R$drawable.bg_head_placehoder, 0, 16, null);
        TextView m20830b = aVar.m20830b();
        if (m20830b != null) {
            m20830b.setText(((PersonDetailInfo) this.f21119c.get(i10)).getName());
        }
        return view;
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
