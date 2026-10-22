package com.umeng.message.proguard;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.j */
/* loaded from: classes3.dex */
public final class C3686j {

    /* renamed from: b */
    private static final C3686j f16527b = new C3686j();

    /* renamed from: a */
    private final Vector<String> f16528a = new Vector<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.j$a */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private final UMessage f16529a;

        /* renamed from: b */
        private final ArrayList<String> f16530b;

        /* renamed from: c */
        private final int f16531c;

        public a(UMessage uMessage) {
            this.f16529a = uMessage;
            ArrayList<String> arrayList = new ArrayList<>();
            this.f16530b = arrayList;
            if (uMessage.isLargeIconFromInternet()) {
                arrayList.add(uMessage.getLargeIconUrl());
            }
            if (uMessage.isSoundFromInternet()) {
                arrayList.add(uMessage.getSoundUri());
            }
            if (!TextUtils.isEmpty(uMessage.getBarImageUrl())) {
                arrayList.add(uMessage.getBarImageUrl());
            }
            if (uMessage.hasBackgroundImage()) {
                arrayList.add(uMessage.getBackgroundImageUrl());
            }
            if (!TextUtils.isEmpty(uMessage.getBigImage())) {
                arrayList.add(uMessage.getBigImage());
            }
            this.f16531c = 3;
        }

        /* renamed from: a */
        private static boolean m15785a(String str) {
            FileOutputStream fileOutputStream;
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            InputStream inputStream = null;
            try {
                Application m15840a = C3706y.m15840a();
                File file = new File(C3678f.m15759g(m15840a), UMUtils.MD5(str));
                File file2 = new File(C3678f.m15759g(m15840a), UMUtils.MD5(str) + ".tmp");
                if (file.exists()) {
                    C3678f.m15748a((Closeable) null);
                    C3678f.m15748a((Closeable) null);
                    return true;
                }
                if (file2.exists()) {
                    file2.delete();
                }
                InputStream openStream = new URL(new URI(str).toASCIIString()).openStream();
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = openStream.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                file2.renameTo(file);
                                C3678f.m15748a(openStream);
                                C3678f.m15748a(fileOutputStream);
                                return true;
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        inputStream = openStream;
                        e = e;
                        try {
                            UPLog.m15196e("DownloadResource", e);
                            C3678f.m15748a(inputStream);
                            C3678f.m15748a(fileOutputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            C3678f.m15748a(inputStream);
                            C3678f.m15748a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = openStream;
                        th = th;
                        C3678f.m15748a(inputStream);
                        C3678f.m15748a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C3686j.m15783a(C3678f.m15759g(C3706y.m15840a()));
                int i10 = 0;
                boolean z10 = true;
                do {
                    i10++;
                    Iterator<String> it = this.f16530b.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        boolean m15785a = m15785a(next);
                        if (!m15785a) {
                            UPLog.m15198i("DownloadResource", "download fail:", next);
                        }
                        z10 &= m15785a;
                    }
                    if (z10) {
                        break;
                    }
                } while (i10 < this.f16531c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C3686j.m15781a().f16528a.remove(this.f16529a.getMsgId());
            Application m15840a = C3706y.m15840a();
            UPushMessageHandler messageHandler = PushAgent.getInstance(m15840a).getMessageHandler();
            if (messageHandler != null) {
                messageHandler.handleMessage(m15840a, this.f16529a);
            }
        }
    }

    /* renamed from: a */
    public static C3686j m15781a() {
        return f16527b;
    }

    /* renamed from: a */
    public final boolean m15784a(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("body")) != null && stringExtra.length() != 0) {
            try {
                UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                if (this.f16528a.contains(uMessage.getMsgId())) {
                    return true;
                }
                this.f16528a.add(uMessage.getMsgId());
                C3581b.m15378c(new a(uMessage));
                return true;
            } catch (Throwable th) {
                UPLog.m15196e("DownloadResource", th);
            }
        }
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ void m15783a(File file) {
        try {
            if (file.exists()) {
                long j10 = 0;
                if (file.exists()) {
                    if (!file.isDirectory()) {
                        j10 = file.length();
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.push(file);
                        while (!linkedList.isEmpty()) {
                            File[] listFiles = ((File) linkedList.pop()).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    if (file2.isDirectory()) {
                                        linkedList.push(file2);
                                    } else {
                                        j10 += file2.length();
                                    }
                                }
                            }
                        }
                    }
                }
                if (j10 > 1048576) {
                    C3595bm.m15431a(file.getPath(), new FileFilter() { // from class: com.umeng.message.proguard.j.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file3) {
                            if (System.currentTimeMillis() - file3.lastModified() > 86400000) {
                                return true;
                            }
                            return false;
                        }
                    });
                }
            }
        } catch (Throwable th) {
            UPLog.m15196e("DownloadResource", th);
        }
    }
}
