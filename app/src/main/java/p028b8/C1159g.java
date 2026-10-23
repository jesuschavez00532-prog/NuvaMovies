package p028b8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.request.result.Channel;
import com.umeng.analytics.pro.C3384f;
import com.widget.custom.MemoryListView;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p040c8.C1407f;
import p348u2.AbstractC7026c;
import p400xa.C7594o0;

/* renamed from: b8.g */
/* loaded from: classes2.dex */
public final class C1159g extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private Context f4572a;

    /* renamed from: b */
    private MemoryListView f4573b;

    /* renamed from: c */
    private ArrayList f4574c;

    /* renamed from: d */
    private final int f4575d;

    /* renamed from: e */
    private final int f4576e;

    /* renamed from: f */
    private int f4577f;

    /* renamed from: g */
    private boolean f4578g;

    /* renamed from: h */
    private int f4579h;

    /* renamed from: b8.g$a */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a */
        private final ImageView f4580a;

        /* renamed from: b */
        private final ImageView f4581b;

        /* renamed from: c */
        private final TextView f4582c;

        /* renamed from: d */
        final /* synthetic */ C1159g f4583d;

        public a(C1159g c1159g, View view) {
            AbstractC5868k.m23674f(view, "itemView");
            this.f4583d = c1159g;
            View findViewById = view.findViewById(R$id.mIvChannelIcon);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f4580a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R$id.mIvPlay);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f4581b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R$id.mTvChannelName);
            AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f4582c = (TextView) findViewById3;
        }

        /* renamed from: a */
        public final ImageView m5318a() {
            return this.f4580a;
        }

        /* renamed from: b */
        public final ImageView m5319b() {
            return this.f4581b;
        }

        /* renamed from: c */
        public final TextView m5320c() {
            return this.f4582c;
        }
    }

    public C1159g(Context context, MemoryListView memoryListView) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(memoryListView, "listView");
        this.f4572a = context;
        this.f4573b = memoryListView;
        this.f4574c = new ArrayList();
        this.f4575d = this.f4572a.getResources().getColor(R$color.selector_live_home_channel_color);
        this.f4576e = this.f4572a.getResources().getColor(R$color.color_font_common);
        this.f4577f = -1;
        this.f4578g = true;
        this.f4579h = -1;
    }

    /* renamed from: a */
    public final void m5310a() {
        View selectedView = this.f4573b.getSelectedView();
        if (selectedView != null) {
            Object tag = selectedView.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.HomeChannelAdapter.HomeChannelViewHolder");
            a aVar = (a) tag;
            aVar.m5320c().setTextColor(this.f4575d);
            if (aVar.m5319b().getVisibility() == 0) {
                aVar.m5319b().setImageResource(R$drawable.home_live_channel_play_normal);
            }
        }
    }

    /* renamed from: b */
    public final ArrayList m5311b() {
        return this.f4574c;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Channel getItem(int i10) {
        Object obj = this.f4574c.get(i10);
        AbstractC5868k.m23673e(obj, "mChannelList[position]");
        return (Channel) obj;
    }

    /* renamed from: d */
    public final int m5313d() {
        return this.f4579h;
    }

    /* renamed from: e */
    public final void m5314e(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "channelList");
        this.f4574c.clear();
        this.f4574c.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public final void m5315f(boolean z10) {
        this.f4578g = z10;
    }

    /* renamed from: g */
    public final void m5316g(int i10) {
        this.f4577f = i10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4574c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        int i11 = 0;
        int i12 = 0;
        if (view == null) {
            view2 = LayoutInflater.from(this.f4572a).inflate(R$layout.layout_home_channel_item, viewGroup, false);
            aVar = new a(this, view2);
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.HomeChannelAdapter.HomeChannelViewHolder");
            aVar = (a) tag;
            view2 = view;
        }
        Object obj = this.f4574c.get(i10);
        AbstractC5868k.m23673e(obj, "mChannelList[position]");
        Channel channel = (Channel) obj;
        aVar.m5320c().setText(channel.getShowChannelName());
        Drawable m27111a = AbstractC7026c.m27111a(this.f4572a, R$drawable.live_channel_default_icon);
        C7594o0 c7594o0 = C7594o0.f27942a;
        String showIconUrl = channel.getShowIconUrl();
        ImageView m5318a = aVar.m5318a();
        Context context = this.f4572a;
        AbstractC5868k.m23673e(m27111a, "defaultChannelIcon");
        C7594o0.m29204m(c7594o0, showIconUrl, m5318a, context, m27111a, 0, null, 48, null);
        if (C1407f.m6469G(C1407f.f5458a, channel.getChannelCode(), false, 2, null)) {
            aVar.m5319b().setVisibility(0);
            if (!this.f4573b.hasFocus() && (i12 = this.f4577f) != -1 && i12 == i10) {
                aVar.m5320c().setTextColor(this.f4576e);
                aVar.m5319b().setImageResource(R$drawable.home_live_channel_play_normal);
            } else {
                aVar.m5320c().setTextColor(this.f4575d);
                aVar.m5319b().setImageResource(R$drawable.home_live_channel_play_normal);
            }
            this.f4579h = i10;
            this.f4573b.setSelection(i10);
        } else {
            aVar.m5319b().setVisibility(8);
            if (!this.f4573b.hasFocus() && (i11 = this.f4577f) != -1 && i11 == i10) {
                aVar.m5320c().setTextColor(this.f4576e);
            } else {
                aVar.m5320c().setTextColor(this.f4575d);
            }
        }
        AbstractC5868k.m23671c(view2);
        return view2;
    }

    /* renamed from: h */
    public final void m5317h(a aVar) {
        AbstractC5868k.m23674f(aVar, "holder");
        if (this.f4573b.hasFocus()) {
            aVar.m5320c().setTextColor(this.f4575d);
            if (aVar.m5319b().getVisibility() == 0) {
                aVar.m5319b().setImageResource(R$drawable.home_live_channel_play_normal);
                return;
            }
            return;
        }
        aVar.m5320c().setTextColor(this.f4576e);
        if (aVar.m5319b().getVisibility() == 0) {
            aVar.m5319b().setImageResource(R$drawable.home_live_channel_play_focus);
        }
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
        View selectedView;
        boolean z10 = true;
        if (this.f4578g) {
            this.f4577f = i10;
            int firstVisiblePosition = this.f4573b.getFirstVisiblePosition();
            int lastVisiblePosition = this.f4573b.getLastVisiblePosition();
            if (firstVisiblePosition > i10 || i10 > lastVisiblePosition) {
                z10 = false;
            }
            if (z10) {
                View childAt = this.f4573b.getChildAt(i10 - firstVisiblePosition);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.HomeChannelAdapter.HomeChannelViewHolder");
                    m5317h((a) tag);
                    return;
                }
                return;
            }
            if (i10 == -1 && (selectedView = this.f4573b.getSelectedView()) != null) {
                Object tag2 = selectedView.getTag();
                AbstractC5868k.m23672d(tag2, "null cannot be cast to non-null type com.live.adapter.HomeChannelAdapter.HomeChannelViewHolder");
                m5317h((a) tag2);
                return;
            }
            return;
        }
        this.f4578g = true;
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
