package p348u2;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

/* renamed from: u2.b */
/* loaded from: classes.dex */
public abstract class AbstractC7025b {
    /* renamed from: a */
    public static File[] m27109a(File file, FileFilter fileFilter, int i10) {
        String[] list;
        if (!file.exists() || (list = file.list()) == null) {
            return null;
        }
        int min = Math.min(list.length, i10);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < min; i11++) {
            File file2 = new File(file, list[i11]);
            if (fileFilter == null || fileFilter.accept(file2)) {
                arrayList.add(file2);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    /* renamed from: b */
    public static void m27110b(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    m27110b(file2);
                }
            } else {
                return;
            }
        }
        file.delete();
    }
}
