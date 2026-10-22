package p345u;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.umeng.analytics.pro.C3329bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p254o.AbstractC5891f;
import p345u.AbstractC7005f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u.c */
/* loaded from: classes.dex */
public abstract class AbstractC7002c {

    /* renamed from: a */
    private static final Comparator f26331a = new a();

    /* renamed from: u.c$a */
    /* loaded from: classes.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                byte b11 = bArr2[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static List m27013a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m27014b(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List m27015c(C7003d c7003d, Resources resources) {
        if (c7003d.m27021b() != null) {
            return c7003d.m27021b();
        }
        return AbstractC5891f.m23769c(resources, c7003d.m27022c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static AbstractC7005f.a m27016d(Context context, C7003d c7003d, CancellationSignal cancellationSignal) {
        ProviderInfo m27017e = m27017e(context.getPackageManager(), c7003d, context.getResources());
        if (m27017e == null) {
            return AbstractC7005f.a.m27038a(1, null);
        }
        return AbstractC7005f.a.m27038a(0, m27018f(context, c7003d, m27017e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m27017e(PackageManager packageManager, C7003d c7003d, Resources resources) {
        String m27024e = c7003d.m27024e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m27024e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c7003d.m27025f())) {
                List m27013a = m27013a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m27013a, f26331a);
                List m27015c = m27015c(c7003d, resources);
                for (int i10 = 0; i10 < m27015c.size(); i10++) {
                    ArrayList arrayList = new ArrayList((Collection) m27015c.get(i10));
                    Collections.sort(arrayList, f26331a);
                    if (m27014b(m27013a, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + m27024e + ", but package was not " + c7003d.m27025f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + m27024e);
    }

    /* renamed from: f */
    static AbstractC7005f.b[] m27018f(Context context, C7003d c7003d, String str, CancellationSignal cancellationSignal) {
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(build, new String[]{C3329bx.f14344d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c7003d.m27026g()}, null, cancellationSignal);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = query.getColumnIndex(C3329bx.f14344d);
                        int columnIndex3 = query.getColumnIndex("file_id");
                        int columnIndex4 = query.getColumnIndex("font_ttc_index");
                        int columnIndex5 = query.getColumnIndex("font_weight");
                        int columnIndex6 = query.getColumnIndex("font_italic");
                        while (query.moveToNext()) {
                            if (columnIndex != -1) {
                                i10 = query.getInt(columnIndex);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i11 = query.getInt(columnIndex4);
                            } else {
                                i11 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i12 = query.getInt(columnIndex5);
                            } else {
                                i12 = 400;
                            }
                            if (columnIndex6 != -1 && query.getInt(columnIndex6) == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            arrayList.add(AbstractC7005f.b.m27041a(withAppendedId, i11, i12, z10, i10));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return (AbstractC7005f.b[]) arrayList.toArray(new AbstractC7005f.b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
