package p143g4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p219l4.AbstractC5391n;

/* renamed from: g4.a */
/* loaded from: classes.dex */
public class C4345a {

    /* renamed from: c */
    private static final Lock f18920c = new ReentrantLock();

    /* renamed from: d */
    private static C4345a f18921d;

    /* renamed from: a */
    private final Lock f18922a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f18923b;

    C4345a(Context context) {
        this.f18923b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C4345a m18238a(Context context) {
        AbstractC5391n.m21783i(context);
        Lock lock = f18920c;
        lock.lock();
        try {
            if (f18921d == null) {
                f18921d = new C4345a(context.getApplicationContext());
            }
            C4345a c4345a = f18921d;
            lock.unlock();
            return c4345a;
        } catch (Throwable th) {
            f18920c.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    private static final String m18239d(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: b */
    public GoogleSignInAccount m18240b() {
        String m18241c = null;
        String m18241c2 = m18241c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m18241c2) || (m18241c = m18241c(m18239d("googleSignInAccount", m18241c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m7899v(m18241c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    protected final String m18241c(String str) {
        this.f18922a.lock();
        try {
            return this.f18923b.getString(str, null);
        } finally {
            this.f18922a.unlock();
        }
    }
}
