package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.util.Log;
import androidx.core.app.AbstractC0501d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import p090d.AbstractC3914a;

/* renamed from: androidx.activity.result.d */
/* loaded from: classes.dex */
public abstract class AbstractC0289d {

    /* renamed from: a */
    private Random f862a = new Random();

    /* renamed from: b */
    private final Map f863b = new HashMap();

    /* renamed from: c */
    final Map f864c = new HashMap();

    /* renamed from: d */
    private final Map f865d = new HashMap();

    /* renamed from: e */
    ArrayList f866e = new ArrayList();

    /* renamed from: f */
    final transient Map f867f = new HashMap();

    /* renamed from: g */
    final Map f868g = new HashMap();

    /* renamed from: h */
    final Bundle f869h = new Bundle();

    /* renamed from: androidx.activity.result.d$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0288c {

        /* renamed from: a */
        final /* synthetic */ String f870a;

        /* renamed from: b */
        final /* synthetic */ int f871b;

        /* renamed from: c */
        final /* synthetic */ AbstractC3914a f872c;

        a(String str, int i10, AbstractC3914a abstractC3914a) {
            this.f870a = str;
            this.f871b = i10;
            this.f872c = abstractC3914a;
        }

        @Override // androidx.activity.result.AbstractC0288c
        /* renamed from: b */
        public void mo973b(Object obj, AbstractC0501d abstractC0501d) {
            int i10;
            AbstractC0289d.this.f866e.add(this.f870a);
            Integer num = (Integer) AbstractC0289d.this.f864c.get(this.f870a);
            AbstractC0289d abstractC0289d = AbstractC0289d.this;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = this.f871b;
            }
            abstractC0289d.mo954f(i10, this.f872c, obj, abstractC0501d);
        }

        @Override // androidx.activity.result.AbstractC0288c
        /* renamed from: c */
        public void mo974c() {
            AbstractC0289d.this.m984k(this.f870a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final InterfaceC0287b f874a;

        /* renamed from: b */
        final AbstractC3914a f875b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(InterfaceC0287b interfaceC0287b, AbstractC3914a abstractC3914a) {
            this.f874a = interfaceC0287b;
            this.f875b = abstractC3914a;
        }
    }

    /* renamed from: a */
    private void m975a(int i10, String str) {
        this.f863b.put(Integer.valueOf(i10), str);
        this.f864c.put(str, Integer.valueOf(i10));
    }

    /* renamed from: d */
    private void m976d(String str, int i10, Intent intent, b bVar) {
        InterfaceC0287b interfaceC0287b;
        if (bVar != null && (interfaceC0287b = bVar.f874a) != null) {
            interfaceC0287b.mo971a(bVar.f875b.mo3563c(i10, intent));
        } else {
            this.f868g.remove(str);
            this.f869h.putParcelable(str, new C0286a(i10, intent));
        }
    }

    /* renamed from: e */
    private int m977e() {
        int nextInt = this.f862a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (this.f863b.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f862a.nextInt(2147418112);
            } else {
                return i10;
            }
        }
    }

    /* renamed from: j */
    private int m978j(String str) {
        Integer num = (Integer) this.f864c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int m977e = m977e();
        m975a(m977e, str);
        return m977e;
    }

    /* renamed from: b */
    public final boolean m979b(int i10, int i11, Intent intent) {
        String str = (String) this.f863b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f866e.remove(str);
        m976d(str, i11, intent, (b) this.f867f.get(str));
        return true;
    }

    /* renamed from: c */
    public final boolean m980c(int i10, Object obj) {
        InterfaceC0287b interfaceC0287b;
        String str = (String) this.f863b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f866e.remove(str);
        b bVar = (b) this.f867f.get(str);
        if (bVar != null && (interfaceC0287b = bVar.f874a) != null) {
            interfaceC0287b.mo971a(obj);
            return true;
        }
        this.f869h.remove(str);
        this.f868g.put(str, obj);
        return true;
    }

    /* renamed from: f */
    public abstract void mo954f(int i10, AbstractC3914a abstractC3914a, Object obj, AbstractC0501d abstractC0501d);

    /* renamed from: g */
    public final void m981g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.f866e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.f862a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.f869h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                String str = stringArrayList.get(i10);
                if (this.f864c.containsKey(str)) {
                    Integer num = (Integer) this.f864c.remove(str);
                    if (!this.f869h.containsKey(str)) {
                        this.f863b.remove(num);
                    }
                }
                m975a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
            }
        }
    }

    /* renamed from: h */
    public final void m982h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f864c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f864c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f866e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f869h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f862a);
    }

    /* renamed from: i */
    public final AbstractC0288c m983i(String str, AbstractC3914a abstractC3914a, InterfaceC0287b interfaceC0287b) {
        int m978j = m978j(str);
        this.f867f.put(str, new b(interfaceC0287b, abstractC3914a));
        if (this.f868g.containsKey(str)) {
            Object obj = this.f868g.get(str);
            this.f868g.remove(str);
            interfaceC0287b.mo971a(obj);
        }
        C0286a c0286a = (C0286a) this.f869h.getParcelable(str);
        if (c0286a != null) {
            this.f869h.remove(str);
            interfaceC0287b.mo971a(abstractC3914a.mo3563c(c0286a.m968b(), c0286a.m967a()));
        }
        return new a(str, m978j, abstractC3914a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m984k(String str) {
        Integer num;
        if (!this.f866e.contains(str) && (num = (Integer) this.f864c.remove(str)) != null) {
            this.f863b.remove(num);
        }
        this.f867f.remove(str);
        if (this.f868g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f868g.get(str));
            this.f868g.remove(str);
        }
        if (this.f869h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f869h.getParcelable(str));
            this.f869h.remove(str);
        }
        AbstractC0272b.m941a(this.f865d.get(str));
    }
}
