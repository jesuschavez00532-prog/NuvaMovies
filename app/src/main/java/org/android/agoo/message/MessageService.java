package org.android.agoo.message;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.UTMini;
import com.umeng.analytics.pro.C3325bt;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MessageService {
    public static final String MSG_ACCS_NOTIFY_CLICK = "8";
    public static final String MSG_ACCS_NOTIFY_DISMISS = "9";
    public static final String MSG_ACCS_READY_REPORT = "4";
    public static final String MSG_DB_COMPLETE = "100";
    public static final String MSG_DB_NOTIFY_CLICK = "2";
    public static final String MSG_DB_NOTIFY_DISMISS = "3";
    public static final String MSG_DB_NOTIFY_REACHED = "1";
    public static final String MSG_DB_READY_REPORT = "0";

    /* renamed from: a */
    private static Context f23723a;

    /* renamed from: c */
    private static LruCache<String, Integer> f23724c;

    /* renamed from: b */
    private volatile SQLiteOpenHelper f23725b = null;

    /* renamed from: org.android.agoo.message.MessageService$a */
    /* loaded from: classes3.dex */
    private static class C6054a extends SQLiteOpenHelper {
        public C6054a(Context context) {
            super(context, "message_accs_db", (SQLiteDatabase.CursorFactory) null, 3);
        }

        /* renamed from: a */
        private String m24218a() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table accs_message");
            stringBuffer.append("(");
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state text,");
            stringBuffer.append("message text,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        /* renamed from: b */
        private String m24219b() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table message");
            stringBuffer.append("(");
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state integer,");
            stringBuffer.append("body_code integer,");
            stringBuffer.append("report long,");
            stringBuffer.append("target_time long,");
            stringBuffer.append("interval integer,");
            stringBuffer.append("type text,");
            stringBuffer.append("message text,");
            stringBuffer.append("notify integer,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            if (!C3197j.m13006a(super.getWritableDatabase().getPath(), 102400)) {
                return null;
            }
            return super.getWritableDatabase();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL(m24219b());
                    sQLiteDatabase.execSQL("CREATE INDEX id_index ON message(id)");
                    sQLiteDatabase.execSQL("CREATE INDEX body_code_index ON message(body_code)");
                    sQLiteDatabase.execSQL(m24218a());
                } catch (Throwable th) {
                    ALog.m12939e("MessageService", "messagedbhelper create", th, new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                } catch (Throwable th) {
                    try {
                        ALog.m12939e("MessageService", "messagedbhelper create", th, new Object[0]);
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(m24218a());
                            return;
                        } catch (Throwable th2) {
                            ALog.m12939e("MessageService", "MessageService onUpgrade is error", th2, new Object[0]);
                            return;
                        }
                    } catch (Throwable th3) {
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(m24218a());
                        } catch (Throwable th4) {
                            ALog.m12939e("MessageService", "MessageService onUpgrade is error", th4, new Object[0]);
                        }
                        throw th3;
                    }
                }
            }
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                sQLiteDatabase.execSQL(m24218a());
            } catch (Throwable th5) {
                ALog.m12939e("MessageService", "MessageService onUpgrade is error", th5, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void m24211a(Context context) {
        f23724c = new LruCache<>(100);
        f23723a = context;
        this.f23725b = new C6054a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x014b A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #7 {all -> 0x018e, blocks: (B:66:0x0143, B:68:0x014b), top: B:65:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c A[Catch: all -> 0x0168, TRY_LEAVE, TryCatch #2 {all -> 0x0168, blocks: (B:80:0x0164, B:72:0x016c), top: B:79:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<org.android.agoo.common.MsgDO> m24217b() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.m24217b():java.util.ArrayList");
    }

    /* renamed from: a */
    public void m24212a(String str, String str2) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i("MessageService", "updateAccsMessage sqlite3--->[" + str + ",state=" + str2 + "]", new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
        } catch (Throwable th) {
            try {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.m12940e("MessageService", "updateAccsMessage error,e--->[" + th + "],ex=" + th.getStackTrace().toString(), new Object[0]);
                }
                UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", C3197j.m13007b(f23723a), "updateAccsMessageFailed", th.toString());
                if (0 == 0) {
                    return;
                }
            } finally {
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            sQLiteDatabase = this.f23725b.getWritableDatabase();
            if (sQLiteDatabase == null) {
                if (sQLiteDatabase != null) {
                    return;
                } else {
                    return;
                }
            }
            if (TextUtils.equals(str2, "1")) {
                sQLiteDatabase.execSQL("UPDATE accs_message set state = ? where id = ? and state = ?", new Object[]{str2, str, MSG_DB_READY_REPORT});
            } else {
                sQLiteDatabase.execSQL("UPDATE accs_message set state = ? where id = ?", new Object[]{str2, str});
            }
            sQLiteDatabase.close();
        }
    }

    /* renamed from: a */
    public void m24213a(String str, String str2, String str3) {
        Cursor cursor;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i("MessageService", "addAccsMessage sqlite3--->[" + str + ",message=" + str2 + ",state=" + str3 + "]", new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                SQLiteDatabase writableDatabase = this.f23725b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase != null) {
                        writableDatabase.close();
                        return;
                    }
                    return;
                }
                try {
                    Cursor rawQuery = writableDatabase.rawQuery("select count(1) from accs_message where id = ?", new String[]{str});
                    if (rawQuery != null && rawQuery.moveToFirst() && rawQuery.getInt(0) > 0) {
                        rawQuery.close();
                        rawQuery.close();
                        writableDatabase.close();
                    } else {
                        writableDatabase.execSQL("INSERT INTO accs_message VALUES(?,?,?,date('now'))", new Object[]{str, str3, str2});
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.m12940e("MessageService", "addAccsMessage error,e--->[" + th + "],ex=" + m24206a(th), new Object[0]);
                        }
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", C3197j.m13007b(f23723a), "addAccsMessageFailed", th.toString());
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* renamed from: a */
    private String m24206a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private MsgDO m24209b(String str, String str2) {
        boolean z10;
        ALog.Level level = ALog.Level.I;
        if (ALog.isPrintLog(level)) {
            ALog.m12941i("MessageService", "msgRecevie,message--->[" + str + "],utdid=" + C3197j.m13007b(f23723a), new Object[0]);
        }
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", C3197j.m13007b(f23723a), "message==null");
            if (ALog.isPrintLog(level)) {
                ALog.m12941i("MessageService", "handleMessage message==null,utdid=" + C3197j.m13007b(f23723a), new Object[0]);
            }
            return null;
        }
        MsgDO msgDO = new MsgDO();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            new Bundle();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    String string = jSONObject.getString(C3325bt.f14186aD);
                    String string2 = jSONObject.getString(C3325bt.f14191aI);
                    String string3 = jSONObject.getString("b");
                    long j10 = jSONObject.getLong("f");
                    if (!jSONObject.isNull("ext")) {
                        str3 = jSONObject.getString("ext");
                    }
                    int i11 = length - 1;
                    msgDO.msgIds = string2;
                    msgDO.extData = str3;
                    msgDO.messageSource = "accs";
                    msgDO.type = "cache";
                    if (TextUtils.isEmpty(string3)) {
                        msgDO.errorCode = AgooConstants.ACK_BODY_NULL;
                    } else if (TextUtils.isEmpty(string)) {
                        msgDO.errorCode = AgooConstants.ACK_PACK_NULL;
                    } else if (j10 == -1) {
                        msgDO.errorCode = AgooConstants.ACK_FLAG_NULL;
                    } else if (!m24208a(f23723a, string)) {
                        ALog.m12938d("MessageService", "ondata checkpackage is del,pack=" + string, new Object[0]);
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", C3197j.m13007b(f23723a), "deletePack", string);
                        msgDO.removePacks = string;
                    } else {
                        String string4 = m24205a(j10, msgDO).getString(AgooConstants.MESSAGE_ENCRYPTED);
                        if (!f23723a.getPackageName().equals(string)) {
                            z10 = true;
                        } else if (TextUtils.equals(Integer.toString(0), string4) || TextUtils.equals(Integer.toString(4), string4)) {
                            z10 = false;
                        } else {
                            msgDO.errorCode = AgooConstants.ACK_PACK_ERROR;
                            ALog.m12940e("MessageService", "error encrypted: " + string4, new Object[0]);
                        }
                        msgDO.agooFlag = z10;
                        if (!TextUtils.isEmpty(str2)) {
                            msgDO.msgStatus = str2;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m12940e("MessageService", "createMsg is error,e: " + th, new Object[0]);
            }
        }
        return msgDO;
    }

    /* renamed from: a */
    public void m24214a(String str, String str2, String str3, int i10) {
        m24207a(str, str2, str3, 1, -1L, -1, i10);
    }

    /* renamed from: a */
    private void m24207a(String str, String str2, String str3, int i10, long j10, int i11, int i12) {
        Throwable th;
        int hashCode;
        String str4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("add sqlite3--->[");
        sb2.append(str);
        sb2.append("]");
        ALog.m12938d("MessageService", sb2.toString(), new Object[0]);
        SQLiteClosable sQLiteClosable = null;
        try {
            String str5 = "";
            if (TextUtils.isEmpty(str2)) {
                str4 = "";
                hashCode = -1;
            } else {
                hashCode = str2.hashCode();
                str4 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                str5 = str3;
            }
            if (f23724c.get(str) == null) {
                f23724c.put(str, Integer.valueOf(hashCode));
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m12941i("MessageService", "addMessage,messageId=" + str + ", mCache size:" + f23724c.size(), new Object[0]);
                }
            }
            try {
                SQLiteDatabase writableDatabase = this.f23725b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.close();
                            return;
                        } catch (Throwable th2) {
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.m12940e("MessageService", "addMessage,db.close(),error,e--->[" + th2 + "]", new Object[0]);
                            }
                            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", C3197j.m13007b(f23723a), "addMessageDBcloseFailed", th2.toString());
                            return;
                        }
                    }
                    return;
                }
                writableDatabase.execSQL("INSERT INTO message VALUES(?,?,?,?,?,?,?,?,?,date('now'))", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(hashCode), 0, Long.valueOf(j10), Integer.valueOf(i11), str5, str4, Integer.valueOf(i12)});
                try {
                    writableDatabase.close();
                } catch (Throwable th3) {
                    th = th3;
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.m12940e("MessageService", "addMessage,db.close(),error,e--->[" + th + "]", new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", C3197j.m13007b(f23723a), "addMessageDBcloseFailed", th.toString());
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.m12940e("MessageService", "addMessage error,e--->[" + th + "]", new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", C3197j.m13007b(f23723a), "addMessageFailed", th.toString());
                    if (0 != 0) {
                        try {
                            sQLiteClosable.close();
                        } catch (Throwable th5) {
                            th = th5;
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.m12940e("MessageService", "addMessage,db.close(),error,e--->[" + th + "]", new Object[0]);
                            }
                            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", C3197j.m13007b(f23723a), "addMessageDBcloseFailed", th.toString());
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* renamed from: a */
    public void m24210a() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.f23725b.getWritableDatabase();
        } catch (Throwable th) {
            try {
                ALog.m12939e("MessageService", "deleteCacheMessage sql Throwable", th, new Object[0]);
                if (0 == 0) {
                    return;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        sQLiteDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
        if (sQLiteDatabase == null) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.close();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            return;
        }
        sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
        sQLiteDatabase.execSQL("delete from accs_message where create_time< date('now','-1 day') ");
        try {
            sQLiteDatabase.close();
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r0.getInt(0) > 0) goto L23;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m24215a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            android.util.LruCache<java.lang.String, java.lang.Integer> r2 = org.android.agoo.message.MessageService.f23724c     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L64
            r3 = 1
            if (r2 == 0) goto L2f
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.E     // Catch: java.lang.Throwable -> L64
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L2d
            java.lang.String r2 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r4.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "hasMessageDuplicate,msgid="
            r4.append(r5)     // Catch: java.lang.Throwable -> L64
            r4.append(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L64
            com.taobao.accs.utl.ALog.m12940e(r2, r4, r5)     // Catch: java.lang.Throwable -> L64
        L2d:
            r2 = 1
            goto L30
        L2f:
            r2 = 0
        L30:
            android.database.sqlite.SQLiteOpenHelper r4 = r6.f23725b     // Catch: java.lang.Throwable -> L61
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L61
            if (r4 != 0) goto L3e
            if (r4 == 0) goto L3d
            r4.close()     // Catch: java.lang.Throwable -> L3d
        L3d:
            return r2
        L3e:
            java.lang.String r5 = "select count(1) from message where id = ?"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L62
            android.database.Cursor r0 = r4.rawQuery(r5, r7)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L57
            boolean r7 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L57
            int r7 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L62
            if (r7 <= 0) goto L57
            goto L58
        L57:
            r3 = r2
        L58:
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Throwable -> L70
        L5d:
            r4.close()     // Catch: java.lang.Throwable -> L70
            goto L70
        L61:
            r4 = r0
        L62:
            r1 = r2
            goto L65
        L64:
            r4 = r0
        L65:
            if (r0 == 0) goto L6a
            r0.close()     // Catch: java.lang.Throwable -> L6f
        L6a:
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.lang.Throwable -> L6f
        L6f:
            r3 = r1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.m24215a(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r0.getInt(0) > 0) goto L25;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m24216a(java.lang.String r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            android.util.LruCache<java.lang.String, java.lang.Integer> r2 = org.android.agoo.message.MessageService.f23724c     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L7e
            r3 = 1
            if (r2 == 0) goto L35
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r10 != r2) goto L35
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.E     // Catch: java.lang.Throwable -> L7e
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L33
            java.lang.String r2 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r4.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "hasMessageDuplicate,msgid="
            r4.append(r5)     // Catch: java.lang.Throwable -> L7e
            r4.append(r9)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L7e
            com.taobao.accs.utl.ALog.m12940e(r2, r4, r5)     // Catch: java.lang.Throwable -> L7e
        L33:
            r2 = 1
            goto L36
        L35:
            r2 = 0
        L36:
            android.database.sqlite.SQLiteOpenHelper r4 = r8.f23725b     // Catch: java.lang.Throwable -> L7b
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L44
            if (r4 == 0) goto L43
            r4.close()     // Catch: java.lang.Throwable -> L43
        L43:
            return r2
        L44:
            java.lang.String r5 = "select count(1) from message where id = ? and body_code=? create_time< date('now','-1 day')"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L7c
            r6[r1] = r9     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r9.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = ""
            r9.append(r7)     // Catch: java.lang.Throwable -> L7c
            r9.append(r10)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L7c
            r6[r3] = r9     // Catch: java.lang.Throwable -> L7c
            android.database.Cursor r0 = r4.rawQuery(r5, r6)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L71
            boolean r9 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L7c
            if (r9 == 0) goto L71
            int r9 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L7c
            if (r9 <= 0) goto L71
            goto L72
        L71:
            r3 = r2
        L72:
            if (r0 == 0) goto L77
            r0.close()     // Catch: java.lang.Throwable -> L8a
        L77:
            r4.close()     // Catch: java.lang.Throwable -> L8a
            goto L8a
        L7b:
            r4 = r0
        L7c:
            r1 = r2
            goto L7f
        L7e:
            r4 = r0
        L7f:
            if (r0 == 0) goto L84
            r0.close()     // Catch: java.lang.Throwable -> L89
        L84:
            if (r4 == 0) goto L89
            r4.close()     // Catch: java.lang.Throwable -> L89
        L89:
            r3 = r1
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.m24216a(java.lang.String, int):boolean");
    }

    /* renamed from: a */
    public static final boolean m24208a(Context context, String str) {
        return context.getPackageManager().getApplicationInfo(str, 0) != null;
    }

    /* renamed from: a */
    private static Bundle m24205a(long j10, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j10).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2.toString());
                    if (charArray[6] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_REPORT, "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_NOTIFICATION, "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }
}
