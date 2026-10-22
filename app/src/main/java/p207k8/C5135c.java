package p207k8;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import cc.C1464l0;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$style;
import com.live.p063db.ReserveMatch;
import com.live.p063db.ReserveTeam;
import com.live.p064ui.activity.MatchDetailActivity;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p237m8.C5608b;
import p359ue.AbstractC7166t;

/* renamed from: k8.c */
/* loaded from: classes2.dex */
public final class C5135c extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: F0 */
    public static final a f21073F0 = new a(null);

    /* renamed from: C0 */
    private final Context f21074C0;

    /* renamed from: D0 */
    private final ReserveMatch f21075D0;

    /* renamed from: E0 */
    public Map f21076E0;

    /* renamed from: k8.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5135c m20771a(Context context, ReserveMatch reserveMatch) {
            AbstractActivityC0302c abstractActivityC0302c;
            AbstractC0729o m3294d4;
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(reserveMatch, "match");
            C5135c c5135c = new C5135c(context, reserveMatch);
            if (context instanceof AbstractActivityC0302c) {
                abstractActivityC0302c = (AbstractActivityC0302c) context;
            } else {
                abstractActivityC0302c = null;
            }
            if (abstractActivityC0302c != null && (m3294d4 = abstractActivityC0302c.m3294d4()) != null) {
                c5135c.mo3277E9(m3294d4, "match_notify_dialog");
            }
            return c5135c;
        }
    }

    public C5135c(Context context, ReserveMatch reserveMatch) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(reserveMatch, "match");
        this.f21076E0 = new LinkedHashMap();
        this.f21074C0 = context;
        this.f21075D0 = reserveMatch;
    }

    /* renamed from: I9 */
    private final void m20767I9() {
        String str;
        String str2;
        String str3;
        String logo;
        TextView textView = (TextView) m20770H9(R$id.mTvTeam1);
        ReserveTeam visitTeam = this.f21075D0.getVisitTeam();
        String str4 = "";
        if (visitTeam == null || (str = visitTeam.getName()) == null) {
            str = "";
        }
        textView.setText(str);
        C5608b c5608b = C5608b.f22632a;
        Context context = this.f21074C0;
        ImageView imageView = (ImageView) m20770H9(R$id.mIvTeam1);
        AbstractC5868k.m23673e(imageView, "mIvTeam1");
        ReserveTeam visitTeam2 = this.f21075D0.getVisitTeam();
        if (visitTeam2 == null || (str2 = visitTeam2.getLogo()) == null) {
            str2 = "";
        }
        c5608b.m22780c(context, imageView, str2);
        TextView textView2 = (TextView) m20770H9(R$id.mTvTeam2);
        ReserveTeam homeTeam = this.f21075D0.getHomeTeam();
        if (homeTeam == null || (str3 = homeTeam.getName()) == null) {
            str3 = "";
        }
        textView2.setText(str3);
        Context context2 = this.f21074C0;
        ImageView imageView2 = (ImageView) m20770H9(R$id.mIvTeam2);
        AbstractC5868k.m23673e(imageView2, "mIvTeam2");
        ReserveTeam homeTeam2 = this.f21075D0.getHomeTeam();
        if (homeTeam2 != null && (logo = homeTeam2.getLogo()) != null) {
            str4 = logo;
        }
        c5608b.m22780c(context2, imageView2, str4);
        TextView textView3 = (TextView) m20770H9(R$id.mTvTime);
        String substring = this.f21075D0.getGameTime().substring(11);
        AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
        textView3.setText(substring);
        ((Button) m20770H9(R$id.mBtnOk)).setOnClickListener(new View.OnClickListener() { // from class: k8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5135c.m20768J9(C5135c.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J9 */
    public static final void m20768J9(C5135c c5135c, View view) {
        String m27728o;
        AbstractC5868k.m23674f(c5135c, "this$0");
        c5135c.mo3278o9();
        String m6824c = C1464l0.f5622a.m6824c(c5135c.f21075D0.getGameTime(), "yyyy-MM-dd HH:mm");
        MatchDetailActivity.C2860a c2860a = MatchDetailActivity.f10864W;
        AbstractActivityC0712e m3104L8 = c5135c.m3104L8();
        AbstractC5868k.m23673e(m3104L8, "requireActivity()");
        String gameId = c5135c.f21075D0.getGameId();
        String substring = m6824c.substring(0, 10);
        AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        m27728o = AbstractC7166t.m27728o(substring, Operator.Operation.MINUS, "", false, 4, null);
        c2860a.m11527a(m3104L8, gameId, m27728o);
    }

    /* renamed from: G9 */
    public void m20769G9() {
        this.f21076E0.clear();
    }

    /* renamed from: H9 */
    public View m20770H9(int i10) {
        View findViewById;
        Map map = this.f21076E0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.ReserveDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_match_notify, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m20769G9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m20767I9();
    }
}
