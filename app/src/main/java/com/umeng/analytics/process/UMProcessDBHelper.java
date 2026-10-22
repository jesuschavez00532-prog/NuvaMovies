package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.analytics.process.InterfaceC3410a;
import com.umeng.common.C3421a;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UMProcessDBHelper {
    private static UMProcessDBHelper mInstance;
    private Context mContext;
    private FileLockUtil mFileLock = new FileLockUtil();
    private InsertEventCallback ekvCallBack = new InsertEventCallback();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class InsertEventCallback implements FileLockCallback {
        private InsertEventCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i10) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = InterfaceC3410a.f14954c;
            if (str.startsWith(str2)) {
                str = str.replaceFirst(str2, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(InterfaceC3410a.f14955d, ""), (JSONArray) obj);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    private class ProcessToMainCallback implements FileLockCallback {
        private ProcessToMainCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i10) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = InterfaceC3410a.f14954c;
            if (str.startsWith(str2)) {
                str = str.replaceFirst(str2, "");
            }
            UMProcessDBHelper.this.processToMain(str.replace(InterfaceC3410a.f14955d, ""));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$a */
    /* loaded from: classes3.dex */
    public class C3409a implements Serializable {

        /* renamed from: a */
        int f14943a;

        /* renamed from: b */
        String f14944b;

        /* renamed from: c */
        String f14945c;

        /* renamed from: d */
        String f14946d;

        /* renamed from: e */
        int f14947e;

        /* renamed from: f */
        String f14948f;

        /* renamed from: g */
        String f14949g;

        /* renamed from: h */
        String f14950h;

        private C3409a() {
        }
    }

    private UMProcessDBHelper() {
    }

    private List<C3409a> datasAdapter(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                C3409a c3409a = new C3409a();
                c3409a.f14945c = jSONObject.optString("id");
                c3409a.f14949g = UMUtils.getAppVersionName(this.mContext);
                c3409a.f14950h = UMUtils.getAppVersionCode(this.mContext);
                c3409a.f14944b = jSONObject.optString("__i");
                c3409a.f14947e = jSONObject.optInt("__t");
                c3409a.f14948f = str;
                if (jSONObject.has("ds")) {
                    jSONObject.remove("ds");
                }
                jSONObject.put("ds", getDataSource());
                jSONObject.remove("__i");
                jSONObject.remove("__t");
                c3409a.f14946d = C3421a.m14511a().m14513a(jSONObject.toString());
                jSONObject.remove("ds");
                arrayList.add(c3409a);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            if (new File(C3411b.m14451b(this.mContext, str)).exists()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private int getDataSource() {
        return 0;
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBHelper(context);
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    private boolean insertEvents_(String str, List<C3409a> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase m14454a = C3412c.m14452a(this.mContext).m14454a(str);
            try {
                try {
                    m14454a.beginTransaction();
                    for (C3409a c3409a : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", c3409a.f14944b);
                            contentValues.put("__e", c3409a.f14945c);
                            contentValues.put("__t", Integer.valueOf(c3409a.f14947e));
                            contentValues.put(InterfaceC3410a.a.f14965f, c3409a.f14948f);
                            contentValues.put("__av", c3409a.f14949g);
                            contentValues.put("__vc", c3409a.f14950h);
                            contentValues.put("__s", c3409a.f14946d);
                            m14454a.insert(InterfaceC3410a.a.f14960a, null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    m14454a.setTransactionSuccessful();
                    try {
                        m14454a.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    C3412c.m14452a(this.mContext).m14455b(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = m14454a;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    C3412c.m14452a(this.mContext).m14455b(str);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = m14454a;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C3412c.m14452a(this.mContext).m14455b(str);
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean processIsService(Context context) {
        if (context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processToMain(String str) {
        if (!dbIsExists(str)) {
            return;
        }
        List<C3409a> readEventByProcess = readEventByProcess(str);
        if (!readEventByProcess.isEmpty() && insertEvents_(InterfaceC3410a.f14959h, readEventByProcess)) {
            deleteEventDatas(str, null, readEventByProcess);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[Catch: Exception -> 0x00c5, TRY_LEAVE, TryCatch #6 {Exception -> 0x00c5, blocks: (B:37:0x00bd, B:31:0x00c2), top: B:36:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.umeng.analytics.process.UMProcessDBHelper$1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.umeng.analytics.process.UMProcessDBHelper.C3409a> readEventByProcess(java.lang.String r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.Context r2 = r12.mContext     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9e
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.C3412c.m14452a(r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9e
            android.database.sqlite.SQLiteDatabase r2 = r2.m14454a(r13)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9e
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r4 = "__et_p"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r2
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r3 == 0) goto L8e
        L22:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            if (r4 == 0) goto L8e
            com.umeng.analytics.process.UMProcessDBHelper$a r4 = new com.umeng.analytics.process.UMProcessDBHelper$a     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.<init>()     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r5 = 0
            int r5 = r3.getInt(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14943a = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = "__i"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14944b = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = "__e"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14945c = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = "__s"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14946d = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = "__t"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            int r5 = r3.getInt(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14947e = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = "__pn"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14948f = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = "__av"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14949g = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = "__vc"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r4.f14950h = r5     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            r0.add(r4)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> Lb9
            goto L22
        L8c:
            r1 = move-exception
            goto La2
        L8e:
            if (r3 == 0) goto Lac
            r3.close()     // Catch: java.lang.Exception -> Laf
            goto Lac
        L94:
            r0 = move-exception
            goto Lbb
        L96:
            r3 = move-exception
            r11 = r3
            r3 = r1
            r1 = r11
            goto La2
        L9b:
            r0 = move-exception
            r2 = r1
            goto Lbb
        L9e:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        La2:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto Laa
            r3.close()     // Catch: java.lang.Exception -> Laf
        Laa:
            if (r2 == 0) goto Laf
        Lac:
            r2.endTransaction()     // Catch: java.lang.Exception -> Laf
        Laf:
            android.content.Context r1 = r12.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.C3412c.m14452a(r1)
            r1.m14455b(r13)
            return r0
        Lb9:
            r0 = move-exception
            r1 = r3
        Lbb:
            if (r1 == 0) goto Lc0
            r1.close()     // Catch: java.lang.Exception -> Lc5
        Lc0:
            if (r2 == 0) goto Lc5
            r2.endTransaction()     // Catch: java.lang.Exception -> Lc5
        Lc5:
            android.content.Context r1 = r12.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.C3412c.m14452a(r1)
            r1.m14455b(r13)
            goto Ld0
        Lcf:
            throw r0
        Ld0:
            goto Lcf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readEventByProcess(java.lang.String):java.util.List");
    }

    public void createDBByProcess(String str) {
        try {
            C3412c.m14452a(this.mContext).m14454a(str);
            C3412c.m14452a(this.mContext).m14455b(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void deleteEventDatas(String str, String str2, List<C3409a> list) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = C3412c.m14452a(this.mContext).m14454a(str);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            sQLiteDatabase = null;
            th = th2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            int size = list.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    sQLiteDatabase.execSQL("delete from __et_p where rowid=" + list.get(i10).f14943a);
                }
            } else {
                sQLiteDatabase.delete(InterfaceC3410a.a.f14960a, null, null);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Exception unused2) {
            sQLiteDatabase2 = sQLiteDatabase;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.endTransaction();
            }
            C3412c.m14452a(this.mContext).m14455b(str);
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            C3412c.m14452a(this.mContext).m14455b(str);
            throw th;
        }
        C3412c.m14452a(this.mContext).m14455b(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void deleteMainProcessEventDatasByIds(java.util.List<java.lang.Integer> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "_main_"
            r1 = 0
            android.content.Context r2 = r7.mContext     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.C3412c.m14452a(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            android.database.sqlite.SQLiteDatabase r1 = r2.m14454a(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
        L14:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            if (r2 == 0) goto L32
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            java.lang.String r3 = "__et_p"
            java.lang.String r4 = "id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            r6 = 0
            r5[r6] = r2     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            r1.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            goto L14
        L32:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L46
            goto L49
        L36:
            r8 = move-exception
            if (r1 == 0) goto L3c
            r1.endTransaction()
        L3c:
            android.content.Context r1 = r7.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.C3412c.m14452a(r1)
            r1.m14455b(r0)
            throw r8
        L46:
            if (r1 == 0) goto L4c
        L49:
            r1.endTransaction()
        L4c:
            android.content.Context r8 = r7.mContext
            com.umeng.analytics.process.c r8 = com.umeng.analytics.process.C3412c.m14452a(r8)
            r8.m14455b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.deleteMainProcessEventDatasByIds(java.util.List):void");
    }

    public void insertEvents(String str, JSONArray jSONArray) {
        if (!AnalyticsConstants.SUB_PROCESS_EVENT || TextUtils.isEmpty(str)) {
            return;
        }
        insertEvents_(str, datasAdapter(str, jSONArray));
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) {
        if (!AnalyticsConstants.SUB_PROCESS_EVENT || TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(C3411b.m14451b(this.mContext, str));
        if (file.exists()) {
            this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
        } else {
            insertEvents(str, jSONArray);
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(C3411b.m14449a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.InterfaceC3406a() { // from class: com.umeng.analytics.process.UMProcessDBHelper.1
                @Override // com.umeng.analytics.process.DBFileTraversalUtil.InterfaceC3406a
                /* renamed from: a */
                public void mo14447a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject readMainEvents(long r20, java.util.List<java.lang.Integer> r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readMainEvents(long, java.util.List):org.json.JSONObject");
    }

    public JSONObject readVersionInfoFromColumId(Integer num) {
        SQLiteDatabase sQLiteDatabase;
        JSONObject jSONObject;
        Cursor cursor = null;
        r3 = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        cursor = null;
        try {
            sQLiteDatabase = C3412c.m14452a(this.mContext).m14454a(InterfaceC3410a.f14959h);
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    Cursor query = sQLiteDatabase.query(InterfaceC3410a.a.f14960a, null, "rowid=?", new String[]{String.valueOf(num)}, null, null, null);
                    if (query != null) {
                        try {
                            try {
                                if (query.moveToNext()) {
                                    jSONObject = new JSONObject();
                                    try {
                                        String string = query.getString(query.getColumnIndex("__av"));
                                        String string2 = query.getString(query.getColumnIndex("__vc"));
                                        if (!TextUtils.isEmpty(string)) {
                                            jSONObject.put("__av", string);
                                        }
                                        if (!TextUtils.isEmpty(string2)) {
                                            jSONObject.put("__vc", string2);
                                        }
                                        jSONObject2 = jSONObject;
                                    } catch (Exception e10) {
                                        e = e10;
                                        cursor = query;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception unused) {
                                                C3412c.m14452a(this.mContext).m14455b(InterfaceC3410a.f14959h);
                                                return jSONObject;
                                            }
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        C3412c.m14452a(this.mContext).m14455b(InterfaceC3410a.f14959h);
                                        return jSONObject;
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                jSONObject = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused2) {
                                    C3412c.m14452a(this.mContext).m14455b(InterfaceC3410a.f14959h);
                                    throw th;
                                }
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            C3412c.m14452a(this.mContext).m14455b(InterfaceC3410a.f14959h);
                            throw th;
                        }
                    }
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception unused3) {
                        }
                    }
                    sQLiteDatabase.endTransaction();
                    C3412c.m14452a(this.mContext).m14455b(InterfaceC3410a.f14959h);
                    return jSONObject2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
                jSONObject = null;
            }
        } catch (Exception e13) {
            e = e13;
            sQLiteDatabase = null;
            jSONObject = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
        }
    }

    private UMProcessDBHelper(Context context) {
        C3421a.m14511a().m14514a(context);
    }
}
