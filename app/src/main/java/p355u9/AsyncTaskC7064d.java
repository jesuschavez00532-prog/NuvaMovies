package p355u9;

import android.os.AsyncTask;

/* renamed from: u9.d */
/* loaded from: classes2.dex */
public class AsyncTaskC7064d extends AsyncTask {

    /* renamed from: a */
    private final a f26496a;

    /* renamed from: u9.d$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo22883a(String str);
    }

    public AsyncTaskC7064d(a aVar) {
        this.f26496a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.String... r10) {
        /*
            r9 = this;
            java.lang.String r0 = "GET"
            r1 = 0
            r2 = r10[r1]
            int r3 = r10.length
            r4 = 0
            r5 = 1
            if (r3 <= r5) goto Ld
            r10 = r10[r5]
            goto Le
        Ld:
            r10 = r4
        Le:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9b
            java.net.URLConnection r2 = r3.openConnection()     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9b
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9b
            r3 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            r2.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            r2.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            int r5 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.String r7 = "Content-Md5"
            if (r5 != r6) goto L47
            java.util.Map r10 = r2.getHeaderFields()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            boolean r0 = r10.containsKey(r7)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            if (r0 == 0) goto L45
            java.lang.Object r10 = r10.get(r7)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            java.lang.Object r10 = r10.get(r1)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            goto L7d
        L45:
            r10 = r4
            goto L7d
        L47:
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            java.net.URLConnection r10 = r5.openConnection()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            r10.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            r10.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            r10.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            int r0 = r10.getResponseCode()     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            if (r0 != r6) goto L7a
            java.util.Map r0 = r10.getHeaderFields()     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            boolean r3 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            if (r3 == 0) goto L7a
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8d
            r4 = r10
            r10 = r0
            goto L7d
        L7a:
            r8 = r4
            r4 = r10
            r10 = r8
        L7d:
            r2.disconnect()
            if (r4 == 0) goto L85
            r4.disconnect()
        L85:
            r4 = r10
            goto Lb2
        L87:
            r0 = move-exception
            r4 = r2
            r8 = r0
            r0 = r10
            r10 = r8
            goto Lb5
        L8d:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L9e
        L92:
            r10 = move-exception
            r0 = r4
            goto Lb4
        L95:
            r10 = move-exception
            r0 = r4
            goto L9e
        L98:
            r10 = move-exception
            r0 = r4
            goto Lb5
        L9b:
            r10 = move-exception
            r0 = r4
            r2 = r0
        L9e:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "FetchHeaderTask"
            java.lang.String r3 = "Error fetching headers"
            android.util.Log.e(r1, r3, r10)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto Lad
            r2.disconnect()
        Lad:
            if (r0 == 0) goto Lb2
            r0.disconnect()
        Lb2:
            return r4
        Lb3:
            r10 = move-exception
        Lb4:
            r4 = r2
        Lb5:
            if (r4 == 0) goto Lba
            r4.disconnect()
        Lba:
            if (r0 == 0) goto Lbf
            r0.disconnect()
        Lbf:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p355u9.AsyncTaskC7064d.doInBackground(java.lang.String[]):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        a aVar = this.f26496a;
        if (aVar != null) {
            aVar.mo22883a(str);
        }
    }
}
