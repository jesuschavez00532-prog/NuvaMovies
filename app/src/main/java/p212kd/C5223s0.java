package p212kd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.RecyclerView;
import cc.C1466m0;
import com.request.result.ChildColumn;
import com.request.result.ContentList;
import com.request.result.RecommendList;
import com.request.result.UserInfo;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.R$string;
import com.vod.p089ui.activity.TopicActivity;
import com.vod.p089ui.activity.TopicMoreActivity;
import com.vod.p089ui.activity.VodCategoryActivity;
import com.vod.p089ui.activity.VodDetailsActivity;
import com.vod.view.PosterView;
import java.util.Arrays;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p101da.ViewOnClickListenerC4018d;
import p101da.ViewOnClickListenerC4019e;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p193ja.C5044a;
import p225ld.C5550d;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7619y;

/* renamed from: kd.s0 */
/* loaded from: classes3.dex */
public class C5223s0 extends AbstractC5243x0 {

    /* renamed from: a */
    private final PosterView f21343a;

    /* renamed from: b */
    private final PosterView f21344b;

    /* renamed from: c */
    private final PosterView f21345c;

    /* renamed from: d */
    private final PosterView f21346d;

    /* renamed from: kd.s0$a */
    /* loaded from: classes3.dex */
    public static final class a implements ViewOnClickListenerC4019e.a {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC0302c f21347a;

        /* renamed from: b */
        final /* synthetic */ C5223s0 f21348b;

        /* renamed from: c */
        final /* synthetic */ ContentList f21349c;

        /* renamed from: d */
        final /* synthetic */ String f21350d;

        /* renamed from: e */
        final /* synthetic */ String f21351e;

        a(AbstractActivityC0302c abstractActivityC0302c, C5223s0 c5223s0, ContentList contentList, String str, String str2) {
            this.f21347a = abstractActivityC0302c;
            this.f21348b = c5223s0;
            this.f21349c = contentList;
            this.f21350d = str;
            this.f21351e = str2;
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: Z2 */
        public void mo17006Z2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: b2 */
        public void mo17007b2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: n2 */
        public void mo17008n2() {
            String str;
            String str2;
            C4160d.b bVar = C4160d.f18217d;
            AbstractActivityC0302c abstractActivityC0302c = this.f21347a;
            String string = abstractActivityC0302c.getString(R$string.pwd_set_suc);
            AbstractC5868k.m23673e(string, "activity.getString(R.string.pwd_set_suc)");
            C4160d.b.m17389f(bVar, abstractActivityC0302c, string, false, 4, null);
            C5223s0 c5223s0 = this.f21348b;
            AbstractActivityC0302c abstractActivityC0302c2 = this.f21347a;
            String contentId = this.f21349c.getContentId();
            String str3 = this.f21350d;
            String name = this.f21349c.getName();
            if (name == null) {
                str = "";
            } else {
                str = name;
            }
            String str4 = this.f21351e;
            String columnAlias = this.f21349c.getColumnAlias();
            if (columnAlias == null) {
                str2 = "";
            } else {
                str2 = columnAlias;
            }
            c5223s0.m21074p(abstractActivityC0302c2, contentId, str3, str, str4, str2, true);
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: q0 */
        public void mo17009q0() {
            ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
        }
    }

    /* renamed from: kd.s0$b */
    /* loaded from: classes3.dex */
    public static final class b implements ViewOnClickListenerC4018d.a {

        /* renamed from: b */
        final /* synthetic */ AbstractActivityC0302c f21353b;

        /* renamed from: c */
        final /* synthetic */ ContentList f21354c;

        /* renamed from: d */
        final /* synthetic */ String f21355d;

        /* renamed from: e */
        final /* synthetic */ String f21356e;

        b(AbstractActivityC0302c abstractActivityC0302c, ContentList contentList, String str, String str2) {
            this.f21353b = abstractActivityC0302c;
            this.f21354c = contentList;
            this.f21355d = str;
            this.f21356e = str2;
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            C5223s0 c5223s0 = C5223s0.this;
            AbstractActivityC0302c abstractActivityC0302c = this.f21353b;
            String contentId = this.f21354c.getContentId();
            String str = this.f21355d;
            String name = this.f21354c.getName();
            if (name == null) {
                name = "";
            }
            String str2 = this.f21356e;
            String columnAlias = this.f21354c.getColumnAlias();
            if (columnAlias == null) {
                columnAlias = "";
            }
            c5223s0.m21074p(abstractActivityC0302c, contentId, str, name, str2, columnAlias, true);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.s0$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ChildColumn f21357a;

        /* renamed from: b */
        final /* synthetic */ String f21358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ChildColumn childColumn, String str) {
            super(1);
            this.f21357a = childColumn;
            this.f21358b = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            C7594o0 c7594o0 = C7594o0.f27942a;
            intent.putExtra("extra_topic_poster", c7594o0.m29220i(this.f21357a.getPosterList(), C7594o0.a.SpecialTopic));
            intent.putExtra("extra_topic_background", c7594o0.m29220i(this.f21357a.getPosterList(), C7594o0.a.Background));
            intent.putExtra("extra_topic_column_id", String.valueOf(this.f21357a.getId()));
            intent.putExtra("extra_topic_name", this.f21357a.getName());
            intent.putExtra("extra_topic_alias", this.f21357a.getAlias());
            Intent putExtra = intent.putExtra("extra_play_entrance", this.f21358b);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(TopicAct…Y_ENTRANCE, playEntrance)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.s0$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f21359a;

        /* renamed from: b */
        final /* synthetic */ String f21360b;

        /* renamed from: c */
        final /* synthetic */ boolean f21361c;

        /* renamed from: d */
        final /* synthetic */ String f21362d;

        /* renamed from: e */
        final /* synthetic */ String f21363e;

        /* renamed from: f */
        final /* synthetic */ String f21364f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, boolean z10, String str3, String str4, String str5) {
            super(1);
            this.f21359a = str;
            this.f21360b = str2;
            this.f21361c = z10;
            this.f21362d = str3;
            this.f21363e = str4;
            this.f21364f = str5;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_column_id", Integer.parseInt(this.f21359a));
            intent.putExtra("extra_column_code", "");
            intent.putExtra("extra_column_name", this.f21360b);
            intent.putExtra("extra_restrict", this.f21361c);
            intent.putExtra("extra_category_type", this.f21362d);
            intent.putExtra("extra_play_entrance", this.f21363e);
            Intent putExtra = intent.putExtra("extra_category_selected_alias", this.f21364f);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodCateg…ECTED_ALIAS, columnAlias)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.s0$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ContentList f21365a;

        /* renamed from: b */
        final /* synthetic */ String f21366b;

        /* renamed from: c */
        final /* synthetic */ String f21367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ContentList contentList, String str, String str2) {
            super(1);
            this.f21365a = contentList;
            this.f21366b = str;
            this.f21367c = str2;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21365a.getContentId());
            intent.putExtra("extra_type", this.f21365a.getType());
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29166d());
            intent.putExtra("extra_umeng_event_category", this.f21366b);
            Intent putExtra = intent.putExtra("extra_play_entrance", this.f21367c);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…Y_ENTRANCE, playEntrance)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.s0$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f21368a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f21368a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            Intent putExtra = intent.putExtra("extra_play_entrance", this.f21368a);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(TopicMor…Y_ENTRANCE, playEntrance)");
            return putExtra;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5223s0(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mRecommend01);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mRecommend01)");
        this.f21343a = (PosterView) findViewById;
        View findViewById2 = view.findViewById(R$id.mRecommend02);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mRecommend02)");
        this.f21344b = (PosterView) findViewById2;
        View findViewById3 = view.findViewById(R$id.mRecommend03);
        AbstractC5868k.m23673e(findViewById3, "itemView.findViewById(R.id.mRecommend03)");
        this.f21345c = (PosterView) findViewById3;
        View findViewById4 = view.findViewById(R$id.mRecommend04);
        AbstractC5868k.m23673e(findViewById4, "itemView.findViewById(R.id.mRecommend04)");
        this.f21346d = (PosterView) findViewById4;
    }

    /* renamed from: h */
    private final String m21068h(C5203n0 c5203n0, int i10) {
        C5881x c5881x = C5881x.f23415a;
        String format = String.format("%s_%s%02d", Arrays.copyOf(new Object[]{C1466m0.f5627a.m6882q(), c5203n0.m21023b(), Integer.valueOf(i10)}, 3));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final boolean m21069j(C5203n0 c5203n0, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5203n0, "$homeVodAdapter");
        if (keyEvent.getAction() == 0 && i10 == 19) {
            if (keyEvent.getRepeatCount() == 0) {
                c5203n0.m21025d().invoke();
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final boolean m21070k(C5203n0 c5203n0, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5203n0, "$homeVodAdapter");
        if (keyEvent.getAction() == 0 && i10 == 19) {
            if (keyEvent.getRepeatCount() == 0) {
                c5203n0.m21025d().invoke();
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m21071m(C5550d c5550d, PosterView posterView, C5203n0 c5203n0, C5223s0 c5223s0, int i10, View view) {
        ContentList contentList;
        String str;
        AbstractC5868k.m23674f(c5550d, "$data");
        AbstractC5868k.m23674f(posterView, "$posterView");
        AbstractC5868k.m23674f(c5203n0, "$adappter");
        AbstractC5868k.m23674f(c5223s0, "this$0");
        if (c5550d.m22503f() || (contentList = posterView.getContentList()) == null) {
            return;
        }
        Context m21024c = c5203n0.m21024c();
        AbstractC5868k.m23672d(m21024c, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AbstractActivityC0302c abstractActivityC0302c = (AbstractActivityC0302c) m21024c;
        String m21023b = c5203n0.m21023b();
        String m21068h = c5223s0.m21068h(c5203n0, i10);
        String type = contentList.getType();
        switch (type.hashCode()) {
            case 48:
                if (type.equals(MessageService.MSG_DB_READY_REPORT)) {
                    c5223s0.m21075q(abstractActivityC0302c, contentList, m21023b, m21068h);
                    return;
                }
                return;
            case 49:
                if (type.equals("1")) {
                    c5223s0.m21075q(abstractActivityC0302c, contentList, m21023b, m21068h);
                    return;
                }
                return;
            case 50:
            default:
                return;
            case 51:
                if (type.equals("3")) {
                    ChildColumn childColumn = null;
                    String str2 = null;
                    boolean z10 = false;
                    String str3 = "";
                    if (AbstractC5868k.m23669a(contentList.getRestricted(), "1")) {
                        UserInfo m6887v = C1466m0.f5627a.m6887v();
                        if (m6887v != null) {
                            str2 = m6887v.getRestrictedStatus();
                        }
                        if (AbstractC5868k.m23669a(str2, "1")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m21068h);
                            sb2.append('/');
                            String columnAlias = contentList.getColumnAlias();
                            if (columnAlias != null) {
                                str3 = columnAlias;
                            }
                            sb2.append(str3);
                            c5223s0.m21072n(abstractActivityC0302c, contentList, m21023b, sb2.toString());
                            return;
                        }
                        AbstractC7598p1.m29244h(abstractActivityC0302c, abstractActivityC0302c.getResources().getString(R$string.adult_zones_tip), new int[0]);
                        return;
                    }
                    if (AbstractC5868k.m23669a(contentList.getSpecialFlag(), "1") && TextUtils.isDigitsOnly(contentList.getContentId())) {
                        Object m20485a = C5044a.f20862a.m20485a("Special_root");
                        if (m20485a instanceof ChildColumn) {
                            childColumn = (ChildColumn) m20485a;
                        }
                        if (childColumn != null && Integer.parseInt(contentList.getContentId()) == childColumn.getId()) {
                            z10 = true;
                        }
                        if (z10) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m21068h);
                            sb3.append('/');
                            String columnAlias2 = contentList.getColumnAlias();
                            if (columnAlias2 != null) {
                                str3 = columnAlias2;
                            }
                            sb3.append(str3);
                            c5223s0.m21076r(abstractActivityC0302c, sb3.toString());
                            return;
                        }
                        ChildColumn childColumn2 = new ChildColumn();
                        String name = contentList.getName();
                        AbstractC5868k.m23671c(name);
                        childColumn2.setName(name);
                        childColumn2.setId(Integer.parseInt(contentList.getContentId()));
                        childColumn2.setAlias(contentList.getName());
                        childColumn2.setPosterList(contentList.getPosterList());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(m21068h);
                        sb4.append("_special/");
                        String columnAlias3 = contentList.getColumnAlias();
                        if (columnAlias3 != null) {
                            str3 = columnAlias3;
                        }
                        sb4.append(str3);
                        c5223s0.m21073o(abstractActivityC0302c, childColumn2, sb4.toString());
                        return;
                    }
                    String contentId = contentList.getContentId();
                    String name2 = contentList.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(m21068h);
                    sb5.append('/');
                    String columnAlias4 = contentList.getColumnAlias();
                    if (columnAlias4 == null) {
                        columnAlias4 = "";
                    }
                    sb5.append(columnAlias4);
                    String sb6 = sb5.toString();
                    String columnAlias5 = contentList.getColumnAlias();
                    if (columnAlias5 == null) {
                        str = "";
                    } else {
                        str = columnAlias5;
                    }
                    c5223s0.m21074p(abstractActivityC0302c, contentId, m21023b, name2, sb6, str, false);
                    return;
                }
                return;
            case 52:
                if (type.equals("4")) {
                    AbstractC7555b0.m28950d(contentList.getUrl(), abstractActivityC0302c);
                    return;
                }
                return;
        }
    }

    /* renamed from: n */
    private final void m21072n(AbstractActivityC0302c abstractActivityC0302c, ContentList contentList, String str, String str2) {
        if (TextUtils.isEmpty(AbstractC4161e.f18225a.m17399b())) {
            C4160d m17390a = C4160d.f18217d.m17390a();
            AbstractC0729o m3294d4 = abstractActivityC0302c.m3294d4();
            AbstractC5868k.m23673e(m3294d4, "activity.supportFragmentManager");
            m17390a.m17384j(m3294d4, new a(abstractActivityC0302c, this, contentList, str, str2));
            return;
        }
        C4160d m17390a2 = C4160d.f18217d.m17390a();
        AbstractC0729o m3294d42 = abstractActivityC0302c.m3294d4();
        AbstractC5868k.m23673e(m3294d42, "activity.supportFragmentManager");
        C4160d.m17379m(m17390a2, m3294d42, new b(abstractActivityC0302c, contentList, str, str2), false, 4, null);
    }

    /* renamed from: o */
    private final void m21073o(Activity activity, ChildColumn childColumn, String str) {
        if (childColumn != null) {
            C7619y.m29367d(C7619y.f28056a, activity, TopicActivity.class, null, new c(childColumn, str), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m21074p(Activity activity, String str, String str2, String str3, String str4, String str5, boolean z10) {
        C7619y.m29367d(C7619y.f28056a, activity, VodCategoryActivity.class, null, new d(str, str3, z10, str2, str4, str5), 2, null);
    }

    /* renamed from: q */
    private final void m21075q(Activity activity, ContentList contentList, String str, String str2) {
        C7619y.m29367d(C7619y.f28056a, activity, VodDetailsActivity.class, null, new e(contentList, str, str2), 2, null);
    }

    /* renamed from: r */
    private final void m21076r(Activity activity, String str) {
        if (C5044a.f20862a.m20485a("Special_root") == null) {
            return;
        }
        C7619y.m29367d(C7619y.f28056a, activity, TopicMoreActivity.class, null, new f(str), 2, null);
    }

    @Override // p212kd.AbstractC5243x0
    /* renamed from: b */
    public void mo21032b(final C5203n0 c5203n0, Context context, C5550d c5550d, int i10, RecyclerView recyclerView) {
        AbstractC5868k.m23674f(c5203n0, "homeVodAdapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(c5550d, "data");
        this.f21343a.setOnKeyListener(new View.OnKeyListener() { // from class: kd.p0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m21069j;
                m21069j = C5223s0.m21069j(C5203n0.this, view, i11, keyEvent);
                return m21069j;
            }
        });
        this.f21344b.setOnKeyListener(new View.OnKeyListener() { // from class: kd.q0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m21070k;
                m21070k = C5223s0.m21070k(C5203n0.this, view, i11, keyEvent);
                return m21070k;
            }
        });
        if (c5550d.m22503f()) {
            this.f21343a.m16618h();
            this.f21344b.m16618h();
            this.f21345c.m16618h();
            this.f21346d.m16618h();
            return;
        }
        mo21077g(c5203n0, c5550d, c5550d.m22502e());
    }

    /* renamed from: g */
    public void mo21077g(C5203n0 c5203n0, C5550d c5550d, List list) {
        int i10;
        AbstractC5868k.m23674f(c5203n0, "adappter");
        AbstractC5868k.m23674f(c5550d, "extra");
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 >= 1) {
            PosterView posterView = this.f21343a;
            AbstractC5868k.m23671c(list);
            posterView.setRcmbData((RecommendList) list.get(0));
            m21079l(c5203n0, 1, this.f21343a, c5550d, (RecommendList) list.get(0));
        } else {
            this.f21343a.m16618h();
        }
        if (i10 >= 2) {
            PosterView posterView2 = this.f21344b;
            AbstractC5868k.m23671c(list);
            posterView2.setRcmbData((RecommendList) list.get(1));
            m21079l(c5203n0, 2, this.f21344b, c5550d, (RecommendList) list.get(1));
        } else {
            this.f21344b.m16618h();
        }
        if (i10 >= 3) {
            PosterView posterView3 = this.f21345c;
            AbstractC5868k.m23671c(list);
            posterView3.setRcmbData((RecommendList) list.get(2));
            m21079l(c5203n0, 3, this.f21345c, c5550d, (RecommendList) list.get(2));
        } else {
            this.f21345c.m16618h();
        }
        if (i10 >= 4) {
            PosterView posterView4 = this.f21346d;
            AbstractC5868k.m23671c(list);
            posterView4.setRcmbData((RecommendList) list.get(3));
            m21079l(c5203n0, 4, this.f21346d, c5550d, (RecommendList) list.get(3));
            return;
        }
        this.f21346d.m16618h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final PosterView m21078i() {
        return this.f21345c;
    }

    /* renamed from: l */
    public final void m21079l(final C5203n0 c5203n0, final int i10, final PosterView posterView, final C5550d c5550d, RecommendList recommendList) {
        AbstractC5868k.m23674f(c5203n0, "adappter");
        AbstractC5868k.m23674f(posterView, "posterView");
        AbstractC5868k.m23674f(c5550d, "data");
        AbstractC5868k.m23674f(recommendList, "recommendList");
        posterView.setOnClickListener(new View.OnClickListener() { // from class: kd.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5223s0.m21071m(C5550d.this, posterView, c5203n0, this, i10, view);
            }
        });
    }
}
