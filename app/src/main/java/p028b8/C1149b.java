package p028b8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.module.event.LiveGuideShow;
import com.module.event.ShowGuideEvent;
import com.request.bean.ChannelEpg;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.umeng.analytics.pro.C3384f;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p040c8.C1407f;
import p040c8.C1427v;
import p102db.C4053l;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p400xa.C7594o0;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: b8.b */
/* loaded from: classes2.dex */
public final class C1149b extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private ListView f4485a;

    /* renamed from: b */
    private InterfaceC5642a f4486b;

    /* renamed from: c */
    private Context f4487c;

    /* renamed from: d */
    private ArrayList f4488d;

    /* renamed from: e */
    private HashMap f4489e;

    /* renamed from: f */
    private boolean f4490f;

    /* renamed from: g */
    private View f4491g;

    /* renamed from: h */
    private int f4492h;

    /* renamed from: i */
    private int f4493i;

    /* renamed from: j */
    private final SimpleDateFormat f4494j;

    /* renamed from: k */
    private final int f4495k;

    /* renamed from: l */
    private final int f4496l;

    /* renamed from: m */
    private boolean f4497m;

    /* renamed from: n */
    private final b f4498n;

    /* renamed from: b8.b$a */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a */
        private ImageView f4499a;

        /* renamed from: b */
        private ImageView f4500b;

        /* renamed from: c */
        private ImageView f4501c;

        /* renamed from: d */
        private ImageView f4502d;

        /* renamed from: e */
        private ImageView f4503e;

        /* renamed from: f */
        private TextView f4504f;

        /* renamed from: g */
        private TextView f4505g;

        /* renamed from: h */
        private TextView f4506h;

        /* renamed from: i */
        final /* synthetic */ C1149b f4507i;

        public a(C1149b c1149b, View view) {
            AbstractC5868k.m23674f(view, "itemView");
            this.f4507i = c1149b;
            View findViewById = view.findViewById(R$id.mIvChannelIcon);
            AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mIvChannelIcon)");
            this.f4499a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R$id.mIvPlay);
            AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mIvPlay)");
            this.f4500b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R$id.mIvBack);
            AbstractC5868k.m23673e(findViewById3, "itemView.findViewById(R.id.mIvBack)");
            this.f4501c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R$id.mIvLock);
            AbstractC5868k.m23673e(findViewById4, "itemView.findViewById(R.id.mIvLock)");
            this.f4502d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R$id.mIvFav);
            AbstractC5868k.m23673e(findViewById5, "itemView.findViewById(R.id.mIvFav)");
            this.f4503e = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R$id.mTvNumber);
            AbstractC5868k.m23673e(findViewById6, "itemView.findViewById(R.id.mTvNumber)");
            this.f4504f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R$id.mTvChannelName);
            AbstractC5868k.m23673e(findViewById7, "itemView.findViewById(R.id.mTvChannelName)");
            this.f4505g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R$id.mTvCurrentEpg);
            AbstractC5868k.m23673e(findViewById8, "itemView.findViewById(R.id.mTvCurrentEpg)");
            this.f4506h = (TextView) findViewById8;
        }

        /* renamed from: a */
        public final ImageView m5226a() {
            return this.f4501c;
        }

        /* renamed from: b */
        public final ImageView m5227b() {
            return this.f4499a;
        }

        /* renamed from: c */
        public final ImageView m5228c() {
            return this.f4503e;
        }

        /* renamed from: d */
        public final ImageView m5229d() {
            return this.f4502d;
        }

        /* renamed from: e */
        public final ImageView m5230e() {
            return this.f4500b;
        }

        /* renamed from: f */
        public final TextView m5231f() {
            return this.f4505g;
        }

        /* renamed from: g */
        public final TextView m5232g() {
            return this.f4506h;
        }

        /* renamed from: h */
        public final TextView m5233h() {
            return this.f4504f;
        }
    }

    /* renamed from: b8.b$b */
    /* loaded from: classes2.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = C1149b.this.f4491g;
            AbstractC5868k.m23671c(view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            if (!C1149b.this.f4497m) {
                if (C1149b.this.f4492h - C1149b.this.f4485a.getFirstVisiblePosition() < 5) {
                    C1149b c1149b = C1149b.this;
                    View view2 = c1149b.f4491g;
                    AbstractC5868k.m23671c(view2);
                    c1149b.m5220k(false, view2);
                } else {
                    C1149b c1149b2 = C1149b.this;
                    View view3 = c1149b2.f4491g;
                    AbstractC5868k.m23671c(view3);
                    c1149b2.m5220k(true, view3);
                }
                C1149b.this.f4497m = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b8.b$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f4509a = new c();

        c() {
            super(0);
        }

        /* renamed from: a */
        public final void m5234a() {
            C7709c.m29787d().m29801m(new ShowGuideEvent(C4053l.c.EpgRight));
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m5234a();
            return C1328x.f4998a;
        }
    }

    public C1149b(Context context, ListView listView, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(listView, "mListView");
        this.f4485a = listView;
        this.f4486b = interfaceC5642a;
        this.f4487c = context;
        this.f4488d = new ArrayList();
        this.f4489e = new HashMap();
        this.f4493i = -1;
        this.f4494j = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
        this.f4495k = this.f4487c.getResources().getColor(R$color.color_f5f5f5);
        this.f4496l = this.f4487c.getResources().getColor(R$color.color_font_common);
        this.f4498n = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m5220k(boolean z10, View view) {
        C4053l.b bVar;
        int i10;
        C4053l c4053l = new C4053l();
        c4053l.m17069ea(view);
        if (z10) {
            bVar = C4053l.b.TOP_RIGHT;
        } else {
            bVar = C4053l.b.BOTTOM_RIGHT;
        }
        c4053l.m17067ca(bVar);
        if (z10) {
            i10 = R$layout.layout_guide_back_up;
        } else {
            i10 = R$layout.layout_guide_back_down;
        }
        c4053l.m17065aa(i10);
        c4053l.m17066ba(AbstractC7786b.m30166j(-50), 0);
        c4053l.m17068da(c.f4509a);
        Context context = this.f4487c;
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "mContext as FragmentActi…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "GuideDialog");
        C4053l.f17879P0.m17073d(C4053l.c.BackIcon, true);
        C7709c.m29787d().m29801m(new LiveGuideShow(true));
    }

    /* renamed from: g */
    public final ArrayList m5221g() {
        return this.f4488d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4488d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Object obj = this.f4488d.get(i10);
        AbstractC5868k.m23673e(obj, "mChannelList[position]");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        String valueOf;
        ArrayList<EpgProgram> programList;
        String valueOf2;
        if (view == null) {
            view2 = LayoutInflater.from(this.f4487c).inflate(R$layout.layout_channel_item, viewGroup, false);
            aVar = new a(this, view2);
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.ChannelAdapter.ChannelViewHolder");
            aVar = (a) tag;
            view2 = view;
        }
        if (this.f4493i == i10) {
            aVar.m5233h().setTextColor(this.f4496l);
            aVar.m5231f().setTextColor(this.f4496l);
            aVar.m5232g().setTextColor(this.f4496l);
        } else {
            aVar.m5233h().setTextColor(this.f4495k);
            aVar.m5231f().setTextColor(this.f4495k);
            aVar.m5232g().setTextColor(this.f4495k);
        }
        Object obj = this.f4488d.get(i10);
        AbstractC5868k.m23673e(obj, "mChannelList[position]");
        Channel channel = (Channel) obj;
        aVar.m5231f().setText(channel.getShowChannelName());
        C1407f c1407f = C1407f.f5458a;
        if (c1407f.m6522n0(channel)) {
            aVar.m5226a().setImageResource(R$drawable.live_channel_back);
            aVar.m5226a().setVisibility(0);
        } else {
            aVar.m5226a().setVisibility(4);
        }
        Drawable m27111a = AbstractC7026c.m27111a(this.f4487c, R$drawable.live_channel_default_icon);
        C7594o0 c7594o0 = C7594o0.f27942a;
        String showIconUrl = channel.getShowIconUrl();
        ImageView m5227b = aVar.m5227b();
        Context context = this.f4487c;
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29204m(c7594o0, showIconUrl, m5227b, context, m27111a, 0, null, 48, null);
        if (channel.isLock()) {
            aVar.m5229d().setImageResource(R$drawable.live_channel_lock);
            aVar.m5229d().setVisibility(0);
        } else {
            aVar.m5229d().setVisibility(4);
        }
        if (channel.isFav()) {
            aVar.m5228c().setImageResource(R$drawable.live_channel_fav);
            aVar.m5228c().setVisibility(0);
        } else {
            aVar.m5228c().setVisibility(4);
        }
        InterfaceC5642a interfaceC5642a = this.f4486b;
        String str = "";
        if (interfaceC5642a != null && ((Boolean) interfaceC5642a.invoke()).booleanValue()) {
            if (C1427v.f5519a.m6636W(channel.getChannelCode())) {
                aVar.m5230e().setVisibility(0);
                aVar.m5233h().setVisibility(8);
                aVar.m5230e().setImageResource(R$drawable.live_channel_play_normal);
            } else {
                aVar.m5230e().setVisibility(8);
                aVar.m5233h().setVisibility(0);
                TextView m5233h = aVar.m5233h();
                if (c1407f.m6527s()) {
                    valueOf2 = channel.getFixedChannelNumber();
                    if (valueOf2 == null) {
                        valueOf2 = "";
                    }
                } else {
                    valueOf2 = String.valueOf(i10 + 1);
                }
                m5233h.setText(valueOf2);
            }
        } else if (C1407f.m6469G(c1407f, channel.getChannelCode(), false, 2, null)) {
            aVar.m5230e().setVisibility(0);
            aVar.m5233h().setVisibility(8);
            aVar.m5230e().setImageResource(R$drawable.live_channel_play_normal);
        } else {
            aVar.m5230e().setVisibility(8);
            aVar.m5233h().setVisibility(0);
            TextView m5233h2 = aVar.m5233h();
            if (c1407f.m6527s()) {
                valueOf = channel.getFixedChannelNumber();
                if (valueOf == null) {
                    valueOf = "";
                }
            } else {
                valueOf = String.valueOf(i10 + 1);
            }
            m5233h2.setText(valueOf);
        }
        if (!C1427v.f5519a.m6634U()) {
            aVar.m5232g().setText(this.f4487c.getResources().getString(R$string.getting_epg));
        } else if (AbstractC6567a.m25636f(this.f4489e)) {
            aVar.m5232g().setText("");
        } else {
            String format = this.f4494j.format(new Date());
            ChannelEpg channelEpg = (ChannelEpg) this.f4489e.get(channel.getChannelCode());
            if (channelEpg != null && (programList = channelEpg.getProgramList()) != null) {
                Iterator<EpgProgram> it = programList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    EpgProgram next = it.next();
                    if (!AbstractC6567a.m25634d(next.getProgramName())) {
                        String startTime = next.getStartTime();
                        if (startTime == null) {
                            startTime = "";
                        }
                        if (format.compareTo(startTime) < 0) {
                            continue;
                        } else {
                            String endTime = next.getEndTime();
                            if (endTime == null) {
                                endTime = "";
                            }
                            if (format.compareTo(endTime) <= 0) {
                                String programName = next.getProgramName();
                                if (programName != null) {
                                    str = programName;
                                }
                            }
                        }
                    }
                }
            }
            TextView m5232g = aVar.m5232g();
            if (AbstractC6567a.m25634d(str)) {
                str = this.f4487c.getResources().getString(R$string.no_epg_data);
            }
            m5232g.setText(str);
        }
        if (C1407f.f5458a.m6522n0(channel) && !this.f4490f && !C4053l.f17879P0.m17071b(C4053l.c.BackIcon)) {
            this.f4490f = true;
            ImageView m5226a = aVar.m5226a();
            this.f4491g = m5226a;
            this.f4492h = i10;
            AbstractC5868k.m23671c(m5226a);
            m5226a.getViewTreeObserver().addOnGlobalLayoutListener(this.f4498n);
        }
        AbstractC5868k.m23671c(view2);
        return view2;
    }

    /* renamed from: h */
    public final void m5222h() {
        this.f4493i = -1;
    }

    /* renamed from: i */
    public final void m5223i(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "channelList");
        this.f4488d.clear();
        this.f4488d.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public final void m5224j(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "epgMap");
        this.f4489e.clear();
        this.f4489e.putAll(hashMap);
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final void m5225l(int i10) {
        this.f4493i = i10;
        int firstVisiblePosition = this.f4485a.getFirstVisiblePosition();
        View childAt = this.f4485a.getChildAt(this.f4485a.getSelectedItemPosition() - firstVisiblePosition);
        if (childAt != null) {
            Object tag = childAt.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.ChannelAdapter.ChannelViewHolder");
            a aVar = (a) tag;
            if (this.f4493i == -1) {
                aVar.m5233h().setTextColor(this.f4495k);
                aVar.m5231f().setTextColor(this.f4495k);
                aVar.m5232g().setTextColor(this.f4495k);
                aVar.m5230e().setImageResource(R$drawable.live_channel_play_normal);
                return;
            }
            aVar.m5233h().setTextColor(this.f4496l);
            aVar.m5231f().setTextColor(this.f4496l);
            aVar.m5232g().setTextColor(this.f4496l);
            aVar.m5230e().setImageResource(R$drawable.live_channel_play_selected);
        }
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
