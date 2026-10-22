package antlr;

import java.io.File;
import java.io.FileWriter;

/* loaded from: classes.dex */
public class PreservingFileWriter extends FileWriter {
    protected File target_file;
    protected File tmp_file;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreservingFileWriter(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = ".antlr.tmp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            r4.target_file = r0
            java.lang.String r0 = r0.getParent()
            if (r0 == 0) goto L69
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r0 = r2.exists()
            java.lang.String r3 = "destination directory of '"
            if (r0 == 0) goto L4f
            boolean r0 = r2.canWrite()
            if (r0 == 0) goto L35
            goto L69
        L35:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = "' isn't writeable"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L4f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = "' doesn't exist"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L69:
            java.io.File r0 = r4.target_file
            boolean r0 = r0.exists()
            if (r0 == 0) goto L96
            java.io.File r0 = r4.target_file
            boolean r0 = r0.canWrite()
            if (r0 == 0) goto L7a
            goto L96
        L7a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "cannot write to '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "'"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L96:
            java.io.File r0 = new java.io.File
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            r4.tmp_file = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.PreservingFileWriter.<init>(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.OutputStreamWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.PreservingFileWriter.close():void");
    }
}
