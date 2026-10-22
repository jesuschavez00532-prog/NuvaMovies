package com.umeng.message.proguard;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.raizlabs.android.dbflow.structure.provider.ContentUtils;
import com.umeng.analytics.pro.C3309bd;
import java.util.Map;

/* renamed from: com.umeng.message.proguard.cy */
/* loaded from: classes3.dex */
public final class C3635cy extends ContentProvider {

    /* renamed from: a */
    private final UriMatcher f16275a;

    /* renamed from: a */
    public static Uri m15591a(Context context) {
        return Uri.parse(ContentUtils.BASE_CONTENT_URI + m15593c(context) + "/sp");
    }

    /* renamed from: b */
    public static Uri m15592b(Context context) {
        return Uri.parse(ContentUtils.BASE_CONTENT_URI + m15593c(context) + "/ua");
    }

    /* renamed from: c */
    private static String m15593c(Context context) {
        return context.getPackageName() + ".umeng.union";
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        try {
            if (this.f16275a.match(uri) == 2 && strArr != null && strArr.length != 0) {
                C3657ds m15679a = C3657ds.m15679a();
                if (strArr.length == 0) {
                    return 0;
                }
                SharedPreferences.Editor edit = m15679a.f16440a.edit();
                int i10 = 0;
                for (String str2 : strArr) {
                    if (m15679a.f16440a.contains(str2)) {
                        edit.remove(str2);
                        i10++;
                    }
                }
                if (i10 > 0) {
                    edit.apply();
                }
                return i10;
            }
            return 0;
        } catch (Throwable th) {
            C3615ce.m15512d("Provider", "delete() ", th.getMessage());
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        int match = this.f16275a.match(uri);
        if (match != 2 && match != 11) {
            return null;
        }
        return "union";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        try {
            if (this.f16275a.match(uri) != 2 || contentValues == null) {
                return null;
            }
            C3657ds.m15679a().m15680a(contentValues.getAsString("k"), contentValues.getAsString("v"));
            return null;
        } catch (Throwable th) {
            C3615ce.m15512d("Provider", "insert() ", th.getMessage());
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            Context context = getContext();
            C3643de.m15639a(context);
            String m15593c = m15593c(context);
            this.f16275a.addURI(m15593c, m15591a(context).getPath(), 2);
            this.f16275a.addURI(m15593c, m15592b(context).getPath(), 11);
        } catch (Throwable th) {
            C3615ce.m15512d("Provider", "onCreate() ", th.getMessage());
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            int match = this.f16275a.match(uri);
            if (match != 2) {
                if (match == 11) {
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{C3309bd.f14097d});
                    matrixCursor.addRow(new Object[]{C3663dy.m15705a()});
                    return matrixCursor;
                }
                return null;
            }
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"k", "v"});
            Map<String, ?> all = C3657ds.m15679a().f16440a.getAll();
            if (strArr2 != null && strArr2.length != 0) {
                for (String str3 : strArr2) {
                    Object obj = all.get(str3);
                    if (obj instanceof String) {
                        matrixCursor2.addRow(new Object[]{str3, obj});
                    }
                }
                return matrixCursor2;
            }
            for (String str4 : all.keySet()) {
                Object obj2 = all.get(str4);
                if (obj2 instanceof String) {
                    matrixCursor2.addRow(new Object[]{str4, obj2});
                }
            }
            return matrixCursor2;
        } catch (Throwable th) {
            C3615ce.m15512d("Provider", "query() ", th.getMessage());
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            if (this.f16275a.match(uri) == 2 && contentValues != null && strArr != null && strArr.length != 0) {
                String str2 = strArr[0];
                String asString = contentValues.getAsString("v");
                if (!TextUtils.isEmpty(str2)) {
                    C3657ds.m15679a().m15680a(str2, asString);
                    return 1;
                }
            }
            return 0;
        } catch (Throwable th) {
            C3615ce.m15512d("Provider", "update() ", th.getMessage());
        }
        return 0;
    }
}
