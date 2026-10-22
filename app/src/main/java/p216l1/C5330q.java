package p216l1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p184j1.EnumC4970a;
import p184j1.InterfaceC4975f;

/* renamed from: l1.q */
/* loaded from: classes.dex */
public final class C5330q extends Exception {

    /* renamed from: g */
    private static final StackTraceElement[] f21823g = new StackTraceElement[0];

    /* renamed from: a */
    private final List f21824a;

    /* renamed from: b */
    private InterfaceC4975f f21825b;

    /* renamed from: c */
    private EnumC4970a f21826c;

    /* renamed from: d */
    private Class f21827d;

    /* renamed from: e */
    private String f21828e;

    /* renamed from: f */
    private Exception f21829f;

    public C5330q(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: a */
    private void m21581a(Throwable th, List list) {
        if (th instanceof C5330q) {
            Iterator it = ((C5330q) th).m21586e().iterator();
            while (it.hasNext()) {
                m21581a((Throwable) it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m21582b(List list, Appendable appendable) {
        try {
            m21583c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    private static void m21583c(List list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof C5330q) {
                ((C5330q) th).m21585h(appendable);
            } else {
                m21584d(th, appendable);
            }
            i10 = i11;
        }
    }

    /* renamed from: d */
    private static void m21584d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m21585h(Appendable appendable) {
        m21584d(this, appendable);
        m21582b(m21586e(), new a(appendable));
    }

    /* renamed from: e */
    public List m21586e() {
        return this.f21824a;
    }

    /* renamed from: f */
    public List m21587f() {
        ArrayList arrayList = new ArrayList();
        m21581a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m21588g(String str) {
        List m21587f = m21587f();
        int size = m21587f.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) m21587f.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f21828e);
        String str3 = "";
        if (this.f21827d == null) {
            str = "";
        } else {
            str = ", " + this.f21827d;
        }
        sb2.append(str);
        if (this.f21826c == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f21826c;
        }
        sb2.append(str2);
        if (this.f21825b != null) {
            str3 = ", " + this.f21825b;
        }
        sb2.append(str3);
        List<Throwable> m21587f = m21587f();
        if (m21587f.isEmpty()) {
            return sb2.toString();
        }
        if (m21587f.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(m21587f.size());
            sb2.append(" root causes:");
        }
        for (Throwable th : m21587f) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m21589i(InterfaceC4975f interfaceC4975f, EnumC4970a enumC4970a) {
        m21590j(interfaceC4975f, enumC4970a, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m21590j(InterfaceC4975f interfaceC4975f, EnumC4970a enumC4970a, Class cls) {
        this.f21825b = interfaceC4975f;
        this.f21826c = enumC4970a;
        this.f21827d = cls;
    }

    /* renamed from: k */
    public void m21591k(Exception exc) {
        this.f21829f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public C5330q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m21585h(printStream);
    }

    public C5330q(String str, List list) {
        this.f21828e = str;
        setStackTrace(f21823g);
        this.f21824a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m21585h(printWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.q$a */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a */
        private final Appendable f21830a;

        /* renamed from: b */
        private boolean f21831b = true;

        a(Appendable appendable) {
            this.f21830a = appendable;
        }

        /* renamed from: a */
        private CharSequence m21592a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) {
            if (this.f21831b) {
                this.f21831b = false;
                this.f21830a.append("  ");
            }
            this.f21831b = c10 == '\n';
            this.f21830a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence m21592a = m21592a(charSequence);
            return append(m21592a, 0, m21592a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence m21592a = m21592a(charSequence);
            boolean z10 = false;
            if (this.f21831b) {
                this.f21831b = false;
                this.f21830a.append("  ");
            }
            if (m21592a.length() > 0 && m21592a.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f21831b = z10;
            this.f21830a.append(m21592a, i10, i11);
            return this;
        }
    }
}
