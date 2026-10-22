package com.therouter;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import be.C1328x;
import mc.AbstractC5629d;
import mc.AbstractC5635j;
import mc.C5634i;
import ne.AbstractC5868k;

/* loaded from: classes3.dex */
public final class InnerTheRouterContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC5868k.m23674f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        AbstractC5868k.m23674f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        AbstractC5868k.m23674f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context;
        Context context2;
        context = AbstractC5629d.f22689a;
        if (context == null) {
            AbstractC5629d.f22689a = getContext();
            C1328x c1328x = C1328x.f4998a;
        }
        if (AbstractC5635j.m22863e()) {
            context2 = AbstractC5629d.f22689a;
            C5634i.m22848j(context2);
            AbstractC5635j.m22862d("InnerTheRouterContentProvider", "TheRouter auto init in Application", null, 4, null);
            return true;
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC5868k.m23674f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC5868k.m23674f(uri, "uri");
        return 0;
    }
}
