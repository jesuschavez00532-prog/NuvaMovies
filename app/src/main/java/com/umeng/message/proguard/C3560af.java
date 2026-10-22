package com.umeng.message.proguard;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: com.umeng.message.proguard.af */
/* loaded from: classes3.dex */
public final class C3560af {

    /* renamed from: a */
    long f15883a;

    /* renamed from: b */
    String f15884b;

    /* renamed from: c */
    int f15885c;

    /* renamed from: d */
    public int f15886d;

    /* renamed from: e */
    public int f15887e;

    /* renamed from: f */
    public int f15888f;

    /* renamed from: g */
    public int f15889g;

    /* renamed from: h */
    public int f15890h;

    /* renamed from: i */
    public int f15891i;

    /* renamed from: j */
    public int f15892j;

    public C3560af(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f15883a = System.currentTimeMillis();
        this.f15884b = str;
        this.f15885c = i10;
        this.f15886d = i11;
        this.f15887e = i12;
        this.f15888f = i13;
        this.f15889g = i14;
        this.f15890h = i15;
        this.f15891i = i16;
        this.f15892j = i17;
    }

    /* renamed from: a */
    public final ContentValues m15291a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Time", Long.valueOf(this.f15883a));
        contentValues.put("MsgId", this.f15884b);
        contentValues.put("MsgType", Integer.valueOf(this.f15885c));
        contentValues.put("NumDisplay", Integer.valueOf(this.f15886d));
        contentValues.put("NumOpenFull", Integer.valueOf(this.f15887e));
        contentValues.put("NumOpenTop", Integer.valueOf(this.f15888f));
        contentValues.put("NumOpenBottom", Integer.valueOf(this.f15889g));
        contentValues.put("NumClose", Integer.valueOf(this.f15890h));
        contentValues.put("NumDuration", Integer.valueOf(this.f15891i));
        contentValues.put("NumCustom", Integer.valueOf(this.f15892j));
        return contentValues;
    }

    public C3560af(Cursor cursor) {
        this.f15884b = cursor.getString(cursor.getColumnIndexOrThrow("MsgId"));
        this.f15885c = cursor.getInt(cursor.getColumnIndexOrThrow("MsgType"));
        this.f15886d = cursor.getInt(cursor.getColumnIndexOrThrow("NumDisplay"));
        this.f15887e = cursor.getInt(cursor.getColumnIndexOrThrow("NumOpenFull"));
        this.f15888f = cursor.getInt(cursor.getColumnIndexOrThrow("NumOpenTop"));
        this.f15889g = cursor.getInt(cursor.getColumnIndexOrThrow("NumOpenBottom"));
        this.f15890h = cursor.getInt(cursor.getColumnIndexOrThrow("NumClose"));
        this.f15891i = cursor.getInt(cursor.getColumnIndexOrThrow("NumDuration"));
        this.f15892j = cursor.getInt(cursor.getColumnIndexOrThrow("NumCustom"));
    }
}
