package p400xa;

import android.os.Environment;
import android.text.TextUtils;
import cc.AbstractC1459j;
import com.lzy.okgo.model.Progress;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;
import p170i2.C4842a;
import p287pb.AbstractApplicationC6253c;
import p359ue.C7149c;

/* renamed from: xa.k */
/* loaded from: classes2.dex */
public final class C7581k {

    /* renamed from: a */
    public static final C7581k f27855a;

    /* renamed from: b */
    private static final String f27856b;

    /* renamed from: c */
    private static boolean f27857c;

    /* renamed from: d */
    private static String f27858d;

    static {
        C7581k c7581k = new C7581k();
        f27855a = c7581k;
        f27856b = c7581k.getClass().getSimpleName();
        f27858d = "Documents";
    }

    private C7581k() {
    }

    /* renamed from: a */
    public final String m29092a(String str) {
        String str2 = null;
        AbstractC5868k.m23674f(str, "type");
        StringBuilder sb2 = new StringBuilder();
        File externalFilesDir = AbstractApplicationC6253c.f24484b.m24887a().getExternalFilesDir(str);
        if (externalFilesDir != null) {
            str2 = externalFilesDir.getPath();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append('/');
        return sb2.toString();
    }

    /* renamed from: b */
    public final String m29093b(String str) {
        AbstractC5868k.m23674f(str, "type");
        return AbstractApplicationC6253c.f24484b.m24887a().getFilesDir().getAbsolutePath() + '/' + str + '/';
    }

    /* renamed from: c */
    public final String m29094c(String str) {
        AbstractC5868k.m23674f(str, "type");
        return Environment.getExternalStorageDirectory().toString() + '/' + str + '/';
    }

    /* renamed from: d */
    public final String m29095d() {
        return f27858d;
    }

    /* renamed from: e */
    public final boolean m29096e() {
        return f27857c;
    }

    /* renamed from: f */
    public final String m29097f(String str) {
        AbstractC5868k.m23674f(str, Progress.FILE_NAME);
        StringBuffer stringBuffer = new StringBuffer();
        try {
            File file = new File(m29092a(f27858d) + str);
            if (file.isFile() && file.exists()) {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
                String readLine = new BufferedReader(inputStreamReader).readLine();
                AbstractC5868k.m23673e(readLine, "bufferedReader.readLine()");
                for (int i10 = 0; i10 < readLine.length(); i10++) {
                    stringBuffer.append(readLine.charAt(i10));
                }
                inputStreamReader.close();
            }
        } catch (Exception e10) {
            AbstractC4509b.m18870c(f27856b, e10.toString(), new Object[0]);
        }
        if (TextUtils.isEmpty(stringBuffer.toString())) {
            return null;
        }
        return AbstractC1459j.m6797b(stringBuffer.toString(), C4842a.f20329a.m19920a().mo19967p());
    }

    /* renamed from: g */
    public final void m29098g(String str, String str2) throws java.io.IOException {
        AbstractC5868k.m23674f(str, Progress.FILE_NAME);
        AbstractC5868k.m23674f(str2, "fileContent");
        try {
            String m6799d = AbstractC1459j.m6799d(str2, C4842a.f20329a.m19920a().mo19967p());
            String m29092a = m29092a(f27858d);
            File file = new File(m29092a);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(m29092a + str);
            AbstractC5868k.m23673e(m6799d, "encryptString");
            byte[] bytes = m6799d.getBytes(C7149c.f26829b);
            AbstractC5868k.m23673e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e10) {
            AbstractC4509b.m18870c(f27856b, e10.toString(), new Object[0]);
        }
    }
}
