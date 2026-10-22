package com.umeng.message.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.message.common.UPLog;

/* renamed from: com.umeng.message.proguard.bb */
/* loaded from: classes3.dex */
public final class C3584bb {

    /* renamed from: b */
    private static C3584bb f16049b;

    /* renamed from: a */
    public final Context f16050a;

    private C3584bb(Context context) {
        this.f16050a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3584bb m15383a(Context context) {
        if (f16049b == null) {
            f16049b = new C3584bb(context);
        }
        return f16049b;
    }

    /* renamed from: com.umeng.message.proguard.bb$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f16051a;

        /* renamed from: b */
        public long f16052b;

        /* renamed from: c */
        public int f16053c;

        public a(String str, int i10, long j10) {
            this.f16051a = str;
            this.f16053c = i10;
            this.f16052b = j10;
        }

        /* renamed from: a */
        public final ContentValues m15385a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsgId", this.f16051a);
            contentValues.put("Time", Long.valueOf(this.f16052b));
            contentValues.put("ActionType", Integer.valueOf(this.f16053c));
            return contentValues;
        }

        public a(Cursor cursor) {
            this.f16051a = cursor.getString(cursor.getColumnIndex("MsgId"));
            this.f16052b = cursor.getLong(cursor.getColumnIndex("Time"));
            this.f16053c = cursor.getInt(cursor.getColumnIndex("ActionType"));
        }
    }

    /* renamed from: a */
    public final void m15384a(String str, int i10, long j10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f16050a.getContentResolver().insert(C3682h.m15770d(this.f16050a), new a(str, i10, j10).m15385a());
        } catch (Exception e10) {
            UPLog.m15196e("MsgLog", e10);
        }
    }
}
