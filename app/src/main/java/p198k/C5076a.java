package p198k;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;
import p373w.C7341f;

/* renamed from: k.a */
/* loaded from: classes.dex */
public final class C5076a {

    /* renamed from: a */
    LayoutInflater f20893a;

    /* renamed from: d */
    private Handler.Callback f20896d = new a();

    /* renamed from: b */
    Handler f20894b = new Handler(this.f20896d);

    /* renamed from: c */
    d f20895c = d.m20546b();

    /* renamed from: k.a$a */
    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.f20902d == null) {
                cVar.f20902d = C5076a.this.f20893a.inflate(cVar.f20901c, cVar.f20900b, false);
            }
            cVar.f20903e.mo11400a(cVar.f20902d, cVar.f20901c, cVar.f20900b);
            C5076a.this.f20895c.m20549d(cVar);
            return true;
        }
    }

    /* renamed from: k.a$b */
    /* loaded from: classes.dex */
    private static class b extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f20898a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) {
            View createView;
            for (String str2 : f20898a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k.a$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        C5076a f20899a;

        /* renamed from: b */
        ViewGroup f20900b;

        /* renamed from: c */
        int f20901c;

        /* renamed from: d */
        View f20902d;

        /* renamed from: e */
        e f20903e;

        c() {
        }
    }

    /* renamed from: k.a$d */
    /* loaded from: classes.dex */
    private static class d extends Thread {

        /* renamed from: c */
        private static final d f20904c;

        /* renamed from: a */
        private ArrayBlockingQueue f20905a = new ArrayBlockingQueue(10);

        /* renamed from: b */
        private C7341f f20906b = new C7341f(10);

        static {
            d dVar = new d();
            f20904c = dVar;
            dVar.start();
        }

        private d() {
        }

        /* renamed from: b */
        public static d m20546b() {
            return f20904c;
        }

        /* renamed from: a */
        public void m20547a(c cVar) {
            try {
                this.f20905a.put(cVar);
            } catch (InterruptedException e10) {
                throw new RuntimeException("Failed to enqueue async inflate request", e10);
            }
        }

        /* renamed from: c */
        public c m20548c() {
            c cVar = (c) this.f20906b.mo16818b();
            if (cVar == null) {
                return new c();
            }
            return cVar;
        }

        /* renamed from: d */
        public void m20549d(c cVar) {
            cVar.f20903e = null;
            cVar.f20899a = null;
            cVar.f20900b = null;
            cVar.f20901c = 0;
            cVar.f20902d = null;
            this.f20906b.mo16817a(cVar);
        }

        /* renamed from: e */
        public void m20550e() {
            try {
                c cVar = (c) this.f20905a.take();
                try {
                    cVar.f20902d = cVar.f20899a.f20893a.inflate(cVar.f20901c, cVar.f20900b, false);
                } catch (RuntimeException e10) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e10);
                }
                Message.obtain(cVar.f20899a.f20894b, 0, cVar).sendToTarget();
            } catch (InterruptedException e11) {
                Log.w("AsyncLayoutInflater", e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                m20550e();
            }
        }
    }

    /* renamed from: k.a$e */
    /* loaded from: classes.dex */
    public class e {
        /* renamed from: a */
        void mo11400a(View view, int i10, ViewGroup viewGroup);
    }

    public C5076a(Context context) {
        this.f20893a = new b(context);
    }

    /* renamed from: a */
    public void m20545a(int i10, ViewGroup viewGroup, e eVar) {
        if (eVar != null) {
            c m20548c = this.f20895c.m20548c();
            m20548c.f20899a = this;
            m20548c.f20901c = i10;
            m20548c.f20900b = viewGroup;
            m20548c.f20903e = eVar;
            this.f20895c.m20547a(m20548c);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
