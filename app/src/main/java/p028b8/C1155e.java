package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.request.bean.EpgProgram;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import p040c8.C1427v;
import p043ce.AbstractC1500l;

/* renamed from: b8.e */
/* loaded from: classes2.dex */
public final class C1155e extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private final Context f4552a;

    /* renamed from: b */
    private boolean f4553b;

    /* renamed from: c */
    private String f4554c;

    /* renamed from: d */
    private final ArrayList f4555d;

    /* renamed from: e */
    private boolean f4556e;

    /* renamed from: f */
    private int f4557f;

    /* renamed from: g */
    private int f4558g;

    /* renamed from: h */
    private InterfaceC5642a f4559h;

    /* renamed from: b8.e$a */
    /* loaded from: classes2.dex */
    private final class a {

        /* renamed from: a */
        private RelativeLayout f4560a;

        /* renamed from: b */
        private TextView f4561b;

        /* renamed from: c */
        private TextView f4562c;

        /* renamed from: d */
        private ImageView f4563d;

        public a() {
        }

        /* renamed from: a */
        public final ImageView m5303a() {
            return this.f4563d;
        }

        /* renamed from: b */
        public final TextView m5304b() {
            return this.f4561b;
        }

        /* renamed from: c */
        public final TextView m5305c() {
            return this.f4562c;
        }

        /* renamed from: d */
        public final void m5306d(RelativeLayout relativeLayout) {
            this.f4560a = relativeLayout;
        }

        /* renamed from: e */
        public final void m5307e(ImageView imageView) {
            this.f4563d = imageView;
        }

        /* renamed from: f */
        public final void m5308f(TextView textView) {
            this.f4561b = textView;
        }

        /* renamed from: g */
        public final void m5309g(TextView textView) {
            this.f4562c = textView;
        }
    }

    public C1155e(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f4552a = context;
        this.f4554c = "";
        this.f4555d = new ArrayList();
        this.f4557f = -1;
    }

    /* renamed from: a */
    public final int m5295a() {
        int i10 = -1;
        int i11 = 0;
        for (Object obj : this.f4555d) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1500l.m6991j();
            }
            if (C1427v.f5519a.m6635V((EpgProgram) obj) == 1) {
                i10 = i11;
            }
            i11 = i12;
        }
        return i10;
    }

    /* renamed from: b */
    public final int m5296b() {
        int i10 = -1;
        int i11 = 0;
        for (Object obj : this.f4555d) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1500l.m6991j();
            }
            EpgProgram epgProgram = (EpgProgram) obj;
            if (this.f4553b && AbstractC5868k.m23669a(this.f4554c, epgProgram.getContentId()) && C1427v.f5519a.m6635V(epgProgram) == 0) {
                i10 = i11;
            }
            i11 = i12;
        }
        return i10;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public EpgProgram getItem(int i10) {
        if (i10 >= 0 && i10 < this.f4555d.size()) {
            return (EpgProgram) this.f4555d.get(i10);
        }
        return null;
    }

    /* renamed from: d */
    public final ArrayList m5298d() {
        return this.f4555d;
    }

    /* renamed from: e */
    public final boolean m5299e(EpgProgram epgProgram, int i10) {
        AbstractC5868k.m23674f(epgProgram, "epgResultData");
        if (this.f4553b && AbstractC5868k.m23669a(this.f4554c, epgProgram.getContentId())) {
            return true;
        }
        if (!this.f4553b && this.f4556e && i10 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m5300f(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        this.f4559h = interfaceC5642a;
    }

    /* renamed from: g */
    public final void m5301g(boolean z10, String str, ArrayList arrayList, boolean z11) {
        AbstractC5868k.m23674f(str, "playbackId");
        this.f4553b = z10;
        this.f4554c = str;
        this.f4555d.clear();
        if (arrayList != null) {
            this.f4555d.addAll(arrayList);
        }
        this.f4556e = z11;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4555d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        AbstractC5868k.m23674f(viewGroup, "parent");
        boolean z10 = false;
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f4552a).inflate(R$layout.layout_epg_list, viewGroup, false);
            View findViewById = view2.findViewById(R$id.epgContent);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            aVar.m5306d((RelativeLayout) findViewById);
            View findViewById2 = view2.findViewById(R$id.tv_content);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5308f((TextView) findViewById2);
            View findViewById3 = view2.findViewById(R$id.tv_time);
            AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5309g((TextView) findViewById3);
            View findViewById4 = view2.findViewById(R$id.iv_status);
            AbstractC5868k.m23672d(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.m5307e((ImageView) findViewById4);
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.EpgListAdapter.ViewHolder");
            a aVar2 = (a) tag;
            view2 = view;
            aVar = aVar2;
        }
        ArrayList arrayList = this.f4555d;
        if (arrayList != null && arrayList.size() > 0) {
            Object obj = this.f4555d.get(i10);
            AbstractC5868k.m23673e(obj, "mListEpgData[position]");
            EpgProgram epgProgram = (EpgProgram) obj;
            TextView m5304b = aVar.m5304b();
            AbstractC5868k.m23671c(m5304b);
            m5304b.setText(epgProgram.getProgramName());
            TextView m5305c = aVar.m5305c();
            AbstractC5868k.m23671c(m5305c);
            m5305c.setText(epgProgram.getStart() + '-' + epgProgram.getStop());
            int m6635V = C1427v.f5519a.m6635V(epgProgram);
            if (m5299e(epgProgram, m6635V)) {
                if (this.f4553b && m6635V == 0) {
                    this.f4558g = i10;
                }
                if (i10 == this.f4557f) {
                    InterfaceC5642a interfaceC5642a = this.f4559h;
                    if (interfaceC5642a != null && !((Boolean) interfaceC5642a.invoke()).booleanValue()) {
                        z10 = true;
                    }
                    if (!z10) {
                        TextView m5304b2 = aVar.m5304b();
                        if (m5304b2 != null) {
                            m5304b2.setTextColor(this.f4552a.getResources().getColorStateList(R$color.selector_live_epg_title));
                        }
                        TextView m5305c2 = aVar.m5305c();
                        if (m5305c2 != null) {
                            m5305c2.setTextColor(this.f4552a.getResources().getColorStateList(R$color.selector_live_epg_date));
                        }
                    }
                }
                TextView m5304b3 = aVar.m5304b();
                if (m5304b3 != null) {
                    m5304b3.setTextColor(this.f4552a.getResources().getColor(R$color.color_main));
                }
                TextView m5305c3 = aVar.m5305c();
                if (m5305c3 != null) {
                    m5305c3.setTextColor(this.f4552a.getResources().getColor(R$color.color_main));
                }
            } else {
                TextView m5304b4 = aVar.m5304b();
                if (m5304b4 != null) {
                    m5304b4.setTextColor(this.f4552a.getResources().getColorStateList(R$color.selector_live_epg_title));
                }
                TextView m5305c4 = aVar.m5305c();
                if (m5305c4 != null) {
                    m5305c4.setTextColor(this.f4552a.getResources().getColorStateList(R$color.selector_live_epg_date));
                }
            }
            if (m6635V != 0) {
                if (m6635V != 1) {
                    if (epgProgram.getFlag() == 1) {
                        ImageView m5303a = aVar.m5303a();
                        AbstractC5868k.m23671c(m5303a);
                        m5303a.setImageResource(R$drawable.reservation_icon);
                    } else {
                        ImageView m5303a2 = aVar.m5303a();
                        AbstractC5868k.m23671c(m5303a2);
                        m5303a2.setImageResource(R$drawable.reservation_nomal);
                    }
                } else {
                    ImageView m5303a3 = aVar.m5303a();
                    AbstractC5868k.m23671c(m5303a3);
                    m5303a3.setImageResource(R$drawable.live_channel_play_normal);
                }
            } else {
                ImageView m5303a4 = aVar.m5303a();
                AbstractC5868k.m23671c(m5303a4);
                m5303a4.setImageResource(R$drawable.live_channel_back);
            }
        }
        AbstractC5868k.m23671c(view2);
        return view2;
    }

    /* renamed from: h */
    public final void m5302h(int i10) {
        this.f4557f = i10;
        if (this.f4556e) {
            notifyDataSetChanged();
        }
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
