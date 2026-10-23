package p355u9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Pair;
import androidx.core.content.AbstractC0547a;
import androidx.core.content.AbstractC0549c;
import com.mobile.autoupdate.R$string;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.util.concurrent.Callable;
import p341t9.AbstractC6927a;
import p348u2.AbstractC7029f;
import p370v9.AbstractC7250a;

/* renamed from: u9.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7063c {

    /* renamed from: a */
    private static c f26491a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u9.c$a */
    /* loaded from: classes2.dex */
    public class a implements Observer {

        /* renamed from: a */
        final /* synthetic */ String f26492a;

        /* renamed from: b */
        final /* synthetic */ File f26493b;

        a(String str, File file) {
            this.f26492a = str;
            this.f26493b = file;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Pair pair) {
            String str = null;
            if (AbstractC7063c.m27218e(this.f26492a)) {
                str = "externalStorage_";
            } else {
                str = "internalStorage_";
            }
            AbstractC6927a.m26914d(str + ((String) pair.second), this.f26493b.length(), (String) pair.first);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u9.c$b */
    /* loaded from: classes2.dex */
    public class b implements Callable {

        /* renamed from: a */
        final /* synthetic */ File f26494a;

        /* renamed from: b */
        final /* synthetic */ String f26495b;

        b(File file, String str) {
            this.f26494a = file;
            this.f26495b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair call() {
            String m27227b = AbstractC7065e.m27227b(this.f26494a);
            if (m27227b == null || m27227b.isEmpty()) {
                m27227b = "apkMd5 is empty";
            }
            String m27228c = AbstractC7065e.m27228c(this.f26495b);
            if (m27228c == null || m27228c.trim().isEmpty()) {
                m27228c = "pathMd5 is empty";
            }
            return new Pair(m27227b, m27228c);
        }
    }

    /* renamed from: u9.c$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        void mo487a();
    }

    /* renamed from: b */
    public static void m27215b(Context context, String str, boolean z10) {
        Uri fromFile;
        Long m27216c = m27216c();
        File file = new File(str);
        if (m27216c.longValue() < file.length()) {
            AbstractC7250a.m28063a(context, context.getString(R$string.insufficient_disk_space), 0);
        }
        m27219f(file, str);
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (z10) {
                intent.setFlags(262144);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                fromFile = AbstractC0549c.m2349e(context, context.getPackageName() + ".downloadFileProvider", file);
                intent.addFlags(3);
            } else {
                fromFile = Uri.fromFile(file);
            }
            if (!m27220g(context)) {
                try {
                    Runtime.getRuntime().exec("chmod 777 " + file);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            intent.setDataAndType(fromFile, "application/vnd.android.package-archive");
            c cVar = f26491a;
            if (cVar != null) {
                cVar.mo487a();
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: c */
    private static Long m27216c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Long.valueOf(Long.valueOf(statFs.getAvailableBlocksLong()).longValue() * Long.valueOf(statFs.getBlockSizeLong()).longValue());
    }

    /* renamed from: d */
    public static String m27217d(Context context, String str) {
        String absolutePath = null;
        if (m27220g(context)) {
            if (context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS) == null) {
                return "";
            }
            absolutePath = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        } else {
            absolutePath = context.getFilesDir().getAbsolutePath();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absolutePath);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("release.apk");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m27218e(String str) {
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    /* renamed from: f */
    private static void m27219f(File file, String str) {
        Observable.fromCallable(new b(file, str)).compose(AbstractC7029f.m27121b()).subscribe(new a(str, file));
    }

    /* renamed from: g */
    public static boolean m27220g(Context context) {
        boolean z10 = false;
        boolean equals = Environment.getExternalStorageState().equals("mounted");
        if (Build.VERSION.SDK_INT >= 23 && AbstractC0547a.m2319a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!equals || !z10) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static void m27221h(c cVar) {
        f26491a = cVar;
    }
}
