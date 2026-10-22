package p302qc;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.Fragment;
import anet.channel.strategy.dispatch.DispatchConstants;
import be.C1328x;
import com.lzy.okgo.cache.CacheEntity;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.therouter.router.RouteItem;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mc.AbstractC5629d;
import mc.AbstractC5635j;
import mc.C5634i;
import mc.C5636k;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p267oc.AbstractC5963c;
import p267oc.C5961a;
import p318rc.C6571a;
import p359ue.AbstractC7167u;
import tc.C6932b;

/* renamed from: qc.c */
/* loaded from: classes.dex */
public class C6448c {

    /* renamed from: a */
    private String f24788a;

    /* renamed from: b */
    private final Intent f24789b;

    /* renamed from: c */
    private final String f24790c;

    /* renamed from: d */
    private final Bundle f24791d;

    /* renamed from: e */
    private Bundle f24792e;

    /* renamed from: f */
    private boolean f24793f;

    /* renamed from: g */
    private String f24794g;

    /* renamed from: h */
    private Uri f24795h;

    /* renamed from: i */
    private ClipData f24796i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qc.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final a f24797a = new a();

        a() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo2391h(String str, String str2) {
            AbstractC5868k.m23674f(str, "k");
            AbstractC5868k.m23674f(str2, "v");
            return str + '=' + str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qc.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: b */
        final /* synthetic */ Context f24799b;

        /* renamed from: c */
        final /* synthetic */ Fragment f24800c;

        /* renamed from: d */
        final /* synthetic */ int f24801d;

        /* renamed from: e */
        final /* synthetic */ C6932b f24802e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Fragment fragment, int i10, C6932b c6932b) {
            super(0);
            this.f24799b = context;
            this.f24800c = fragment;
            this.f24801d = i10;
            this.f24802e = c6932b;
        }

        /* renamed from: a */
        public final void m25259a() {
            C6448c.this.f24793f = false;
            C6448c.this.m25249m(this.f24799b, this.f24800c, this.f24801d, this.f24802e);
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m25259a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qc.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Context f24804b;

        /* renamed from: c */
        final /* synthetic */ Fragment f24805c;

        /* renamed from: d */
        final /* synthetic */ int f24806d;

        /* renamed from: e */
        final /* synthetic */ C6932b f24807e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qc.c$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ RouteItem f24808a;

            /* renamed from: b */
            final /* synthetic */ C6932b f24809b;

            /* renamed from: c */
            final /* synthetic */ C6448c f24810c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(RouteItem routeItem, C6932b c6932b, C6448c c6448c) {
                super(1);
                this.f24808a = routeItem;
                this.f24809b = c6932b;
                this.f24810c = c6448c;
            }

            /* renamed from: a */
            public final void m25261a(Activity activity) {
                AbstractC5868k.m23674f(activity, "it");
                if (AbstractC5868k.m23669a(activity.getClass().getName(), this.f24808a.getClassName())) {
                    this.f24809b.m26923a(this.f24810c, activity);
                    if (!TextUtils.isEmpty(this.f24808a.getAction())) {
                        C5634i.m22843d(this.f24808a.getAction()).m25256v("therouter_object_navigator", this.f24810c).m25256v("therouter_object_current_activity", activity).m25242f(activity);
                    }
                }
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m25261a((Activity) obj);
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, Fragment fragment, int i10, C6932b c6932b) {
            super(1);
            this.f24804b = context;
            this.f24805c = fragment;
            this.f24806d = i10;
            this.f24807e = c6932b;
        }

        /* renamed from: a */
        public final void m25260a(RouteItem routeItem) {
            AbstractC5868k.m23674f(routeItem, "routeItem");
            Intent m25243g = C6448c.this.m25243g();
            if (m25243g == null) {
                m25243g = new Intent();
            }
            Uri uri = C6448c.this.f24795h;
            if (uri != null) {
                m25243g.setData(uri);
            }
            ClipData clipData = C6448c.this.f24796i;
            if (clipData != null) {
                m25243g.setClipData(clipData);
            }
            if (Build.VERSION.SDK_INT >= 29 && C6448c.this.f24794g != null) {
                m25243g.setIdentifier(C6448c.this.f24794g);
            }
            Context context = this.f24804b;
            AbstractC5868k.m23671c(context);
            m25243g.setComponent(new ComponentName(context.getPackageName(), routeItem.getClassName()));
            if (!(this.f24804b instanceof Activity) && this.f24805c == null) {
                m25243g.addFlags(268435456);
            }
            C5636k.f22705a.m22866a(routeItem.getClassName(), new a(routeItem, this.f24807e, C6448c.this));
            m25243g.putExtra("therouter_action", routeItem.getAction());
            m25243g.putExtra("therouter_path", C6448c.this.m25245i());
            m25243g.putExtra("therouter_description", routeItem.getDescription());
            Bundle extras = routeItem.getExtras();
            Bundle bundle = extras.getBundle("therouter_bundle");
            if (bundle != null) {
                extras.remove("therouter_bundle");
                m25243g.putExtra("therouter_bundle", bundle);
            }
            m25243g.putExtras(extras);
            m25243g.addFlags(routeItem.getExtras().getInt("therouter_intent_flags"));
            if (this.f24806d == -1008600) {
                if (this.f24805c != null) {
                    AbstractC5635j.m22862d("Navigator::navigation", "fragment.startActivity " + routeItem.getClassName(), null, 4, null);
                    this.f24805c.m3171i9(m25243g, C6448c.this.f24792e);
                } else {
                    AbstractC5635j.m22862d("Navigator::navigation", "startActivity " + routeItem.getClassName(), null, 4, null);
                    this.f24804b.startActivity(m25243g, C6448c.this.f24792e);
                }
                int i10 = routeItem.getExtras().getInt("therouter_intent_animation_in");
                int i11 = routeItem.getExtras().getInt("therouter_intent_animation_out");
                if (i10 != 0 || i11 != 0) {
                    if (this.f24804b instanceof Activity) {
                        AbstractC5635j.m22862d("Navigator::navigation", "overridePendingTransition " + routeItem.getClassName(), null, 4, null);
                        ((Activity) this.f24804b).overridePendingTransition(routeItem.getExtras().getInt("therouter_intent_animation_in"), routeItem.getExtras().getInt("therouter_intent_animation_out"));
                    } else if (C5634i.m22853o()) {
                        throw new RuntimeException("TheRouter::Navigator context is not Activity, ignore animation");
                    }
                }
            } else if (this.f24805c != null) {
                AbstractC5635j.m22862d("Navigator::navigation", "fragment.startActivityForResult " + routeItem.getClassName(), null, 4, null);
                this.f24805c.m3174j9(m25243g, this.f24806d, C6448c.this.f24792e);
            } else if (this.f24804b instanceof Activity) {
                AbstractC5635j.m22862d("Navigator::navigation", "startActivityForResult " + routeItem.getClassName(), null, 4, null);
                ((Activity) this.f24804b).startActivityForResult(m25243g, this.f24806d, C6448c.this.f24792e);
            } else if (!C5634i.m22853o()) {
                this.f24804b.startActivity(m25243g, C6448c.this.f24792e);
            } else {
                throw new RuntimeException("TheRouter::Navigator context is not Activity or Fragment");
            }
            AbstractC5963c.m24121b(new C5961a(C6448c.this.m25245i()));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25260a((RouteItem) obj);
            return C1328x.f4998a;
        }
    }

    public C6448c(String str, Intent intent) {
        List list;
        int m27734D;
        List<String> m27748R;
        int m27735E;
        String str2;
        String str3;
        int i10;
        this.f24788a = str;
        this.f24789b = intent;
        this.f24790c = str;
        this.f24791d = new Bundle();
        AbstractC5635j.m22864f(!TextUtils.isEmpty(this.f24788a), "Navigator", "Navigator constructor parameter url is empty");
        list = AbstractC6450e.f24813c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0272b.m941a(it.next());
        }
        String str4 = this.f24788a;
        if (str4 != null) {
            m27734D = AbstractC7167u.m27734D(str4, '?', 0, false, 6, null);
            if (m27734D >= 0 && str4.length() > m27734D) {
                str4 = str4.substring(m27734D + 1);
                AbstractC5868k.m23673e(str4, "this as java.lang.String).substring(startIndex)");
            }
            m27748R = AbstractC7167u.m27748R(str4, new String[]{DispatchConstants.SIGN_SPLIT_SYMBOL}, false, 0, 6, null);
            for (String str5 : m27748R) {
                m27735E = AbstractC7167u.m27735E(str5, Operator.Operation.EQUALS, 0, false, 6, null);
                if (m27735E > 0) {
                    str2 = str5.substring(0, m27735E);
                    AbstractC5868k.m23673e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str2 = str5;
                }
                if (m27735E <= 0 || str5.length() <= (i10 = m27735E + 1)) {
                    str3 = null;
                } else {
                    str3 = str5.substring(i10);
                    AbstractC5868k.m23673e(str3, "this as java.lang.String).substring(startIndex)");
                }
                this.f24791d.putString(str2, str3);
            }
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m25240q(C6448c c6448c, Context context, C6932b c6932b, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                context = AbstractC5629d.m22837c();
            }
            if ((i10 & 2) != 0) {
                c6932b = null;
            }
            c6448c.m25250n(context, c6932b);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigation");
    }

    /* renamed from: r */
    public static /* synthetic */ void m25241r(C6448c c6448c, Fragment fragment, C6932b c6932b, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                c6932b = null;
            }
            c6448c.m25252p(fragment, c6932b);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigation");
    }

    /* renamed from: f */
    public final void m25242f(Context context) {
        if (C6571a.f25183a.m25650b(this)) {
            m25240q(this, context, null, 2, null);
        }
    }

    /* renamed from: g */
    public final Intent m25243g() {
        return this.f24789b;
    }

    /* renamed from: h */
    public final String m25244h() {
        boolean m27763v;
        int m27734D;
        String str = this.f24788a;
        if (str == null) {
            str = "";
        }
        m27763v = AbstractC7167u.m27763v(str, Operator.Operation.EMPTY_PARAM, false, 2, null);
        if (m27763v) {
            m27734D = AbstractC7167u.m27734D(str, '?', 0, false, 6, null);
            String substring = str.substring(0, m27734D);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: i */
    public final String m25245i() {
        return m25246j(a.f24797a);
    }

    /* renamed from: j */
    public final String m25246j(InterfaceC5664p interfaceC5664p) {
        Object obj;
        AbstractC5868k.m23674f(interfaceC5664p, "handle");
        StringBuilder sb2 = new StringBuilder(m25244h());
        boolean z10 = true;
        for (String str : this.f24791d.keySet()) {
            if (z10) {
                sb2.append(Operator.Operation.EMPTY_PARAM);
                z10 = false;
            } else {
                sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
            }
            AbstractC5868k.m23673e(str, CacheEntity.KEY);
            Object obj2 = this.f24791d.get(str);
            if (obj2 == null || (obj = obj2.toString()) == null) {
                obj = "";
            }
            sb2.append((String) interfaceC5664p.mo2391h(str, obj));
        }
        String sb3 = sb2.toString();
        AbstractC5868k.m23673e(sb3, "stringBuilder.toString()");
        return sb3;
    }

    /* renamed from: k */
    public final void m25247k(Context context) {
        m25240q(this, context, null, 2, null);
    }

    /* renamed from: l */
    public final void m25248l(Context context, int i10, C6932b c6932b) {
        m25249m(context, null, i10, c6932b);
    }

    /* renamed from: m */
    public final void m25249m(Context context, Fragment fragment, int i10, C6932b c6932b) {
        LinkedList linkedList;
        List list;
        List list2;
        InterfaceC5664p interfaceC5664p;
        Bundle extras;
        if (AbstractC6455j.m25289h() && !this.f24793f) {
            AbstractC5635j.m22862d("Navigator::navigation", "begin navigate " + m25244h(), null, 4, null);
            if (context == null) {
                context = AbstractC5629d.m22837c();
            }
            Context context2 = context;
            if (c6932b == null) {
                c6932b = AbstractC6450e.f24816f;
            }
            String m25244h = m25244h();
            list = AbstractC6450e.f24814d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC0272b.m941a(it.next());
            }
            RouteItem m25291j = AbstractC6455j.m25291j(m25244h);
            C6571a c6571a = C6571a.f25183a;
            if (c6571a.m25650b(this) && m25291j == null) {
                c6571a.m25649a(this, context2);
                return;
            }
            if (m25291j != null && (extras = m25291j.getExtras()) != null) {
                extras.putAll(this.f24791d);
            }
            if (m25291j != null) {
                AbstractC5635j.m22862d("Navigator::navigation", "match route " + m25291j, null, 4, null);
            }
            list2 = AbstractC6450e.f24815e;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AbstractC0272b.m941a(it2.next());
            }
            if (m25291j != null) {
                AbstractC5635j.m22862d("Navigator::navigation", "NavigationCallback on found", null, 4, null);
                c6932b.m26925c(this);
                interfaceC5664p = AbstractC6450e.f24817g;
                interfaceC5664p.mo2391h(m25291j, new c(context2, fragment, i10, c6932b));
                c6932b.m26924b(this);
                return;
            }
            c6932b.m26926d(this);
            return;
        }
        this.f24793f = true;
        AbstractC5635j.m22862d("Navigator::navigation", "add pending navigator " + m25244h(), null, 4, null);
        linkedList = AbstractC6450e.f24811a;
        linkedList.addLast(new C6451f(this, new b(context, fragment, i10, c6932b)));
    }

    /* renamed from: n */
    public final void m25250n(Context context, C6932b c6932b) {
        m25248l(context, -1008600, c6932b);
    }

    /* renamed from: o */
    public final void m25251o(Fragment fragment, int i10, C6932b c6932b) {
        AbstractActivityC0712e abstractActivityC0712e;
        if (fragment != null) {
            abstractActivityC0712e = fragment.m3075C6();
        } else {
            abstractActivityC0712e = null;
        }
        m25249m(abstractActivityC0712e, fragment, i10, c6932b);
    }

    /* renamed from: p */
    public final void m25252p(Fragment fragment, C6932b c6932b) {
        m25251o(fragment, -1008600, c6932b);
    }

    /* renamed from: s */
    public final C6448c m25253s(String str, boolean z10) {
        this.f24791d.putBoolean(str, z10);
        return this;
    }

    /* renamed from: t */
    public final C6448c m25254t(int i10) {
        this.f24791d.putInt("therouter_intent_flags", i10);
        return this;
    }

    /* renamed from: u */
    public final C6448c m25255u(String str, int i10) {
        this.f24791d.putInt(str, i10);
        return this;
    }

    /* renamed from: v */
    public final C6448c m25256v(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(obj, "value");
        AbstractC6450e.m25269g().put(str, new SoftReference(obj));
        return this;
    }

    /* renamed from: w */
    public final C6448c m25257w(String str, String str2) {
        this.f24791d.putString(str, str2);
        return this;
    }

    public C6448c(String str) {
        this(str, null);
    }
}
