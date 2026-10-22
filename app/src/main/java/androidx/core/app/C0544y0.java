package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0272b;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC0517l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p214l.C5304b;
import p331t.AbstractC6870a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.y0 */
/* loaded from: classes.dex */
public class C0544y0 implements InterfaceC0515k {

    /* renamed from: a */
    private final Context f2281a;

    /* renamed from: b */
    private final Notification.Builder f2282b;

    /* renamed from: c */
    private final AbstractC0517l.e f2283c;

    /* renamed from: d */
    private RemoteViews f2284d;

    /* renamed from: e */
    private RemoteViews f2285e;

    /* renamed from: f */
    private final List f2286f = new ArrayList();

    /* renamed from: g */
    private final Bundle f2287g = new Bundle();

    /* renamed from: h */
    private int f2288h;

    /* renamed from: i */
    private RemoteViews f2289i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0544y0(AbstractC0517l.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        Icon icon;
        Notification.Builder category;
        Notification.Builder color;
        Notification.Builder visibility;
        Notification.Builder publicVersion;
        AudioAttributes audioAttributes;
        List list;
        Notification.Builder localOnly;
        Notification.Builder group;
        Notification.Builder groupSummary;
        List m2307e;
        this.f2283c = eVar;
        this.f2281a = eVar.f2251a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f2282b = new Notification.Builder(eVar.f2251a, eVar.f2240K);
        } else {
            this.f2282b = new Notification.Builder(eVar.f2251a);
        }
        Notification notification = eVar.f2247R;
        Notification.Builder lights = this.f2282b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2259i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(eVar.f2255e).setContentText(eVar.f2256f).setContentInfo(eVar.f2261k).setContentIntent(eVar.f2257g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f2258h;
        if ((notification.flags & 128) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z13).setLargeIcon(eVar.f2260j).setNumber(eVar.f2262l).setProgress(eVar.f2270t, eVar.f2271u, eVar.f2272v);
        if (i11 < 21) {
            this.f2282b.setSound(notification.sound, notification.audioStreamType);
        }
        this.f2282b.setSubText(eVar.f2267q).setUsesChronometer(eVar.f2265o).setPriority(eVar.f2263m);
        Iterator it = eVar.f2252b.iterator();
        while (it.hasNext()) {
            m2306b((AbstractC0517l.a) it.next());
        }
        Bundle bundle = eVar.f2233D;
        if (bundle != null) {
            this.f2287g.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 20) {
            if (eVar.f2276z) {
                this.f2287g.putBoolean("android.support.localOnly", true);
            }
            String str = eVar.f2273w;
            if (str != null) {
                this.f2287g.putString("android.support.groupKey", str);
                if (eVar.f2274x) {
                    this.f2287g.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f2287g.putBoolean("android.support.useSideChannel", true);
                }
            }
            String str2 = eVar.f2275y;
            if (str2 != null) {
                this.f2287g.putString("android.support.sortKey", str2);
            }
        }
        this.f2284d = eVar.f2237H;
        this.f2285e = eVar.f2238I;
        this.f2282b.setShowWhen(eVar.f2264n);
        if (i12 < 21 && (m2307e = m2307e(m2308g(eVar.f2253c), eVar.f2250U)) != null && !m2307e.isEmpty()) {
            this.f2287g.putStringArray("android.people", (String[]) m2307e.toArray(new String[m2307e.size()]));
        }
        if (i12 >= 20) {
            localOnly = this.f2282b.setLocalOnly(eVar.f2276z);
            group = localOnly.setGroup(eVar.f2273w);
            groupSummary = group.setGroupSummary(eVar.f2274x);
            groupSummary.setSortKey(eVar.f2275y);
            this.f2288h = eVar.f2244O;
        }
        if (i12 >= 21) {
            category = this.f2282b.setCategory(eVar.f2232C);
            color = category.setColor(eVar.f2234E);
            visibility = color.setVisibility(eVar.f2235F);
            publicVersion = visibility.setPublicVersion(eVar.f2236G);
            Uri uri = notification.sound;
            audioAttributes = notification.audioAttributes;
            publicVersion.setSound(uri, audioAttributes);
            if (i12 < 28) {
                list = m2307e(m2308g(eVar.f2253c), eVar.f2250U);
            } else {
                list = eVar.f2250U;
            }
            if (list != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.f2282b.addPerson((String) it2.next());
                }
            }
            this.f2289i = eVar.f2239J;
            if (eVar.f2254d.size() > 0) {
                Bundle bundle2 = eVar.m2255c().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i13 = 0; i13 < eVar.f2254d.size(); i13++) {
                    bundle4.putBundle(Integer.toString(i13), AbstractC0546z0.m2315b((AbstractC0517l.a) eVar.f2254d.get(i13)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.m2255c().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2287g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (icon = eVar.f2249T) != null) {
            this.f2282b.setSmallIcon(icon);
        }
        if (i14 >= 24) {
            this.f2282b.setExtras(eVar.f2233D).setRemoteInputHistory(eVar.f2269s);
            RemoteViews remoteViews = eVar.f2237H;
            if (remoteViews != null) {
                this.f2282b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f2238I;
            if (remoteViews2 != null) {
                this.f2282b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f2239J;
            if (remoteViews3 != null) {
                this.f2282b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i14 >= 26) {
            badgeIconType = this.f2282b.setBadgeIconType(eVar.f2241L);
            settingsText = badgeIconType.setSettingsText(eVar.f2268r);
            shortcutId = settingsText.setShortcutId(eVar.f2242M);
            timeoutAfter = shortcutId.setTimeoutAfter(eVar.f2243N);
            timeoutAfter.setGroupAlertBehavior(eVar.f2244O);
            if (eVar.f2231B) {
                this.f2282b.setColorized(eVar.f2230A);
            }
            if (!TextUtils.isEmpty(eVar.f2240K)) {
                this.f2282b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator it3 = eVar.f2253c.iterator();
            if (it3.hasNext()) {
                AbstractC0272b.m941a(it3.next());
                throw null;
            }
        }
        if (i14 >= 29) {
            this.f2282b.setAllowSystemGeneratedContextualActions(eVar.f2246Q);
            this.f2282b.setBubbleMetadata(AbstractC0517l.d.m2248a(null));
        }
        if (AbstractC6870a.m26777c() && (i10 = eVar.f2245P) != 0) {
            this.f2282b.setForegroundServiceBehavior(i10);
        }
        if (eVar.f2248S) {
            if (this.f2283c.f2274x) {
                this.f2288h = 2;
            } else {
                this.f2288h = 1;
            }
            this.f2282b.setVibrate(null);
            this.f2282b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f2282b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f2283c.f2273w)) {
                    this.f2282b.setGroup("silent");
                }
                this.f2282b.setGroupAlertBehavior(this.f2288h);
            }
        }
    }

    /* renamed from: b */
    private void m2306b(AbstractC0517l.a aVar) {
        Notification.Action.Builder builder;
        int i10;
        Bundle bundle;
        Notification.Action build;
        Icon icon;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 20) {
            IconCompat m2232e = aVar.m2232e();
            if (i11 >= 23) {
                if (m2232e != null) {
                    icon = m2232e.m2373p();
                } else {
                    icon = null;
                }
                builder = new Notification.Action.Builder(icon, aVar.m2236i(), aVar.m2228a());
            } else {
                if (m2232e != null) {
                    i10 = m2232e.m2366e();
                } else {
                    i10 = 0;
                }
                builder = new Notification.Action.Builder(i10, aVar.m2236i(), aVar.m2228a());
            }
            if (aVar.m2233f() != null) {
                for (RemoteInput remoteInput : AbstractC0494a1.m2178b(aVar.m2233f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (aVar.m2231d() != null) {
                bundle = new Bundle(aVar.m2231d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m2229b());
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 24) {
                builder.setAllowGeneratedReplies(aVar.m2229b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.m2234g());
            if (i12 >= 28) {
                builder.setSemanticAction(aVar.m2234g());
            }
            if (i12 >= 29) {
                builder.setContextual(aVar.m2237j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.m2235h());
            builder.addExtras(bundle);
            Notification.Builder builder2 = this.f2282b;
            build = builder.build();
            builder2.addAction(build);
            return;
        }
        this.f2286f.add(AbstractC0546z0.m2318e(this.f2282b, aVar));
    }

    /* renamed from: e */
    private static List m2307e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C5304b c5304b = new C5304b(list.size() + list2.size());
        c5304b.addAll(list);
        c5304b.addAll(list2);
        return new ArrayList(c5304b);
    }

    /* renamed from: g */
    private static List m2308g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC0272b.m941a(it.next());
        throw null;
    }

    /* renamed from: h */
    private void m2309h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.InterfaceC0515k
    /* renamed from: a */
    public Notification.Builder mo2225a() {
        return this.f2282b;
    }

    /* renamed from: c */
    public Notification m2310c() {
        RemoteViews remoteViews;
        Bundle m2227a;
        RemoteViews m2278f;
        RemoteViews m2276d;
        AbstractC0517l.f fVar = this.f2283c.f2266p;
        if (fVar != null) {
            fVar.mo2238b(this);
        }
        if (fVar != null) {
            remoteViews = fVar.m2277e(this);
        } else {
            remoteViews = null;
        }
        Notification m2311d = m2311d();
        if (remoteViews != null) {
            m2311d.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f2283c.f2237H;
            if (remoteViews2 != null) {
                m2311d.contentView = remoteViews2;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (fVar != null && (m2276d = fVar.m2276d(this)) != null) {
            m2311d.bigContentView = m2276d;
        }
        if (i10 >= 21 && fVar != null && (m2278f = this.f2283c.f2266p.m2278f(this)) != null) {
            m2311d.headsUpContentView = m2278f;
        }
        if (fVar != null && (m2227a = AbstractC0517l.m2227a(m2311d)) != null) {
            fVar.mo2246a(m2227a);
        }
        return m2311d;
    }

    /* renamed from: d */
    protected Notification m2311d() {
        String group;
        String group2;
        String group3;
        String group4;
        String group5;
        String group6;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f2282b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f2282b.build();
            if (this.f2288h != 0) {
                group5 = build.getGroup();
                if (group5 != null && (build.flags & 512) != 0 && this.f2288h == 2) {
                    m2309h(build);
                }
                group6 = build.getGroup();
                if (group6 != null && (build.flags & 512) == 0 && this.f2288h == 1) {
                    m2309h(build);
                }
            }
            return build;
        }
        if (i10 >= 21) {
            this.f2282b.setExtras(this.f2287g);
            Notification build2 = this.f2282b.build();
            RemoteViews remoteViews = this.f2284d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2285e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2289i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2288h != 0) {
                group3 = build2.getGroup();
                if (group3 != null && (build2.flags & 512) != 0 && this.f2288h == 2) {
                    m2309h(build2);
                }
                group4 = build2.getGroup();
                if (group4 != null && (build2.flags & 512) == 0 && this.f2288h == 1) {
                    m2309h(build2);
                }
            }
            return build2;
        }
        if (i10 >= 20) {
            this.f2282b.setExtras(this.f2287g);
            Notification build3 = this.f2282b.build();
            RemoteViews remoteViews4 = this.f2284d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2285e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2288h != 0) {
                group = build3.getGroup();
                if (group != null && (build3.flags & 512) != 0 && this.f2288h == 2) {
                    m2309h(build3);
                }
                group2 = build3.getGroup();
                if (group2 != null && (build3.flags & 512) == 0 && this.f2288h == 1) {
                    m2309h(build3);
                }
            }
            return build3;
        }
        SparseArray<? extends Parcelable> m2314a = AbstractC0546z0.m2314a(this.f2286f);
        if (m2314a != null) {
            this.f2287g.putSparseParcelableArray("android.support.actionExtras", m2314a);
        }
        this.f2282b.setExtras(this.f2287g);
        Notification build4 = this.f2282b.build();
        RemoteViews remoteViews6 = this.f2284d;
        if (remoteViews6 != null) {
            build4.contentView = remoteViews6;
        }
        RemoteViews remoteViews7 = this.f2285e;
        if (remoteViews7 != null) {
            build4.bigContentView = remoteViews7;
        }
        return build4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m2312f() {
        return this.f2281a;
    }
}
