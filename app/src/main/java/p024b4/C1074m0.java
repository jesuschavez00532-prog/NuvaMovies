package p024b4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3329bx;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p036c4.C1357a;
import p036c4.InterfaceC1358b;
import p095d4.InterfaceC3935a;
import p111e4.AbstractC4130a;
import p294q3.C6335b;
import p324s3.AbstractC6661i;
import p324s3.AbstractC6667o;
import p324s3.C6660h;
import p349u3.InterfaceC7031a;
import p377w3.C7355a;
import p377w3.C7356b;
import p377w3.C7357c;
import p377w3.C7358d;
import p377w3.C7359e;
import p377w3.C7360f;
import p393x3.AbstractC7492a;

/* renamed from: b4.m0 */
/* loaded from: classes.dex */
public class C1074m0 implements InterfaceC1055d, InterfaceC1358b, InterfaceC1053c {

    /* renamed from: f */
    private static final C6335b f4352f = C6335b.m25117b("proto");

    /* renamed from: a */
    private final C1088t0 f4353a;

    /* renamed from: b */
    private final InterfaceC3935a f4354b;

    /* renamed from: c */
    private final InterfaceC3935a f4355c;

    /* renamed from: d */
    private final AbstractC1057e f4356d;

    /* renamed from: e */
    private final InterfaceC7031a f4357e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b4.m0$b */
    /* loaded from: classes.dex */
    public interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b4.m0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final String f4358a;

        /* renamed from: b */
        final String f4359b;

        private c(String str, String str2) {
            this.f4358a = str;
            this.f4359b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b4.m0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        Object mo4937a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1074m0(InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, AbstractC1057e abstractC1057e, C1088t0 c1088t0, InterfaceC7031a interfaceC7031a) {
        this.f4353a = c1088t0;
        this.f4354b = interfaceC3935a;
        this.f4355c = interfaceC3935a2;
        this.f4356d = abstractC1057e;
        this.f4357e = interfaceC7031a;
    }

    /* renamed from: A0 */
    private static byte[] m4951A0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: B0 */
    private void m4953B0(C7355a.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.m28391a(C7358d.m28406c().m28411c((String) entry.getKey()).m28410b((List) entry.getValue()).m28409a());
        }
    }

    /* renamed from: C0 */
    private byte[] m4955C0(long j10) {
        return (byte[]) m4963G0(m5020Q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: b4.y
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                byte[] m5005r0;
                m5005r0 = C1074m0.m5005r0((Cursor) obj);
                return m5005r0;
            }
        });
    }

    /* renamed from: D0 */
    private Object m4957D0(d dVar, b bVar) {
        long mo16762a = this.f4355c.mo16762a();
        while (true) {
            try {
                return dVar.mo4937a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f4355c.mo16762a() >= this.f4356d.mo4902b() + mo16762a) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: E0 */
    private static C6335b m4959E0(String str) {
        if (str == null) {
            return f4352f;
        }
        return C6335b.m25117b(str);
    }

    /* renamed from: F0 */
    private static String m4961F0(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC1069k) it.next()).mo4914c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: G0 */
    static Object m4963G0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: M */
    private C7357c.b m4969M(int i10) {
        C7357c.b bVar = C7357c.b.REASON_UNKNOWN;
        if (i10 == bVar.mo24813a()) {
            return bVar;
        }
        C7357c.b bVar2 = C7357c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.mo24813a()) {
            return bVar2;
        }
        C7357c.b bVar3 = C7357c.b.CACHE_FULL;
        if (i10 == bVar3.mo24813a()) {
            return bVar3;
        }
        C7357c.b bVar4 = C7357c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.mo24813a()) {
            return bVar4;
        }
        C7357c.b bVar5 = C7357c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.mo24813a()) {
            return bVar5;
        }
        C7357c.b bVar6 = C7357c.b.INVALID_PAYLOD;
        if (i10 == bVar6.mo24813a()) {
            return bVar6;
        }
        C7357c.b bVar7 = C7357c.b.SERVER_ERROR;
        if (i10 == bVar7.mo24813a()) {
            return bVar7;
        }
        AbstractC7492a.m28688b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* renamed from: N */
    private void m4970N(final SQLiteDatabase sQLiteDatabase) {
        m4957D0(new d() { // from class: b4.g0
            @Override // p024b4.C1074m0.d
            /* renamed from: a */
            public final Object mo4937a() {
                Object m4981b0 = null;
                m4981b0 = C1074m0.m4981b0(sQLiteDatabase);
                return m4981b0;
            }
        }, new b() { // from class: b4.h0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m4982c0 = null;
                m4982c0 = C1074m0.m4982c0((Throwable) obj);
                return m4982c0;
            }
        });
    }

    /* renamed from: O */
    private long m4971O(SQLiteDatabase sQLiteDatabase, AbstractC6667o abstractC6667o) {
        Long m4976V = m4976V(sQLiteDatabase, abstractC6667o);
        if (m4976V != null) {
            return m4976V.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC6667o.mo26004b());
        contentValues.put(Progress.PRIORITY, Integer.valueOf(AbstractC4130a.m17312a(abstractC6667o.mo26006d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC6667o.mo26005c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC6667o.mo26005c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: R */
    private C7356b m4972R() {
        return C7356b.m28396b().m28399b(C7359e.m28412c().m28416b(m5019P()).m28417c(AbstractC1057e.f4337a.mo4906f()).m28415a()).m28398a();
    }

    /* renamed from: S */
    private long m4973S() {
        return m5020Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: T */
    private long m4974T() {
        return m5020Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: U */
    private C7360f m4975U() {
        final long mo16762a = this.f4354b.mo16762a();
        return (C7360f) m5021W(new b() { // from class: b4.c0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                C7360f m4988g0;
                m4988g0 = C1074m0.m4988g0(mo16762a, (SQLiteDatabase) obj);
                return m4988g0;
            }
        });
    }

    /* renamed from: V */
    private Long m4976V(SQLiteDatabase sQLiteDatabase, AbstractC6667o abstractC6667o) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC6667o.mo26004b(), String.valueOf(AbstractC4130a.m17312a(abstractC6667o.mo26006d()))));
        if (abstractC6667o.mo26005c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC6667o.mo26005c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m4963G0(sQLiteDatabase.query("transport_contexts", new String[]{C3329bx.f14344d}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: b4.b0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Long m4990h0;
                m4990h0 = C1074m0.m4990h0((Cursor) obj);
                return m4990h0;
            }
        });
    }

    /* renamed from: X */
    private boolean m4977X() {
        if (m4973S() * m4974T() >= this.f4356d.mo4906f()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private List m4978Y(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1069k abstractC1069k = (AbstractC1069k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC1069k.mo4914c()))) {
                AbstractC6661i.a m26025l = abstractC1069k.mo4913b().m26025l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC1069k.mo4914c()))) {
                    m26025l.m26028c(cVar.f4358a, cVar.f4359b);
                }
                listIterator.set(AbstractC1069k.m4949a(abstractC1069k.mo4914c(), abstractC1069k.mo4915d(), m26025l.mo25985d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ Object m4979Z(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo4918d(cursor.getInt(0), C7357c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ Integer m4980a0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        m4963G0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: b4.q
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m4979Z = null;
                m4979Z = C1074m0.this.m4979Z((Cursor) obj);
                return m4979Z;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete(C3384f.f14604ax, "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static /* synthetic */ Object m4981b0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static /* synthetic */ Object m4982c0(Throwable th) {
        throw new C1357a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static /* synthetic */ SQLiteDatabase m4983d0(Throwable th) {
        throw new C1357a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static /* synthetic */ Long m4985e0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static /* synthetic */ C7360f m4987f0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C7360f.m28418c().m28423c(cursor.getLong(0)).m28422b(j10).m28421a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static /* synthetic */ C7360f m4988g0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C7360f) m4963G0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: b4.d0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                C7360f m4987f0;
                m4987f0 = C1074m0.m4987f0(j10, (Cursor) obj);
                return m4987f0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static /* synthetic */ Long m4990h0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ Boolean m4991i0(AbstractC6667o abstractC6667o, SQLiteDatabase sQLiteDatabase) {
        Long m4976V = m4976V(sQLiteDatabase, abstractC6667o);
        if (m4976V == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m4963G0(m5020Q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m4976V.toString()}), new b() { // from class: b4.x
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static /* synthetic */ List m4992j0(SQLiteDatabase sQLiteDatabase) {
        return (List) m4963G0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: b4.j0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                List m4993k0;
                m4993k0 = C1074m0.m4993k0((Cursor) obj);
                return m4993k0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static /* synthetic */ List m4993k0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC6667o.m26037a().mo26008b(cursor.getString(1)).mo26010d(AbstractC4130a.m17313b(cursor.getInt(2))).mo26009c(m4951A0(cursor.getString(3))).mo26007a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ List m4995l0(AbstractC6667o abstractC6667o, SQLiteDatabase sQLiteDatabase) {
        List m5016y0 = m5016y0(sQLiteDatabase, abstractC6667o);
        return m4978Y(m5016y0, m5018z0(sQLiteDatabase, m5016y0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ C7355a m4997m0(Map map, C7355a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C7357c.b m4969M = m4969M(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C7357c.m28400c().m28405c(m4969M).m28404b(j10).m28403a());
        }
        m4953B0(aVar, map);
        aVar.m28395e(m4975U());
        aVar.m28394d(m4972R());
        aVar.m28393c((String) this.f4357e.get());
        return aVar.m28392b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ C7355a m4999n0(String str, final Map map, final C7355a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C7355a) m4963G0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: b4.z
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                C7355a m4997m0;
                m4997m0 = C1074m0.this.m4997m0(map, aVar, (Cursor) obj);
                return m4997m0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ Object m5000o0(List list, AbstractC6667o abstractC6667o, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            AbstractC6661i.a mo25992k = AbstractC6661i.m26020a().mo25991j(cursor.getString(1)).mo25990i(cursor.getLong(2)).mo25992k(cursor.getLong(3));
            if (z10) {
                mo25992k.mo25989h(new C6660h(m4959E0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo25992k.mo25989h(new C6660h(m4959E0(cursor.getString(4)), m4955C0(j10)));
            }
            if (!cursor.isNull(6)) {
                mo25992k.mo25988g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC1069k.m4949a(j10, abstractC6667o, mo25992k.mo25985d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static /* synthetic */ Object m5001p0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ Long m5003q0(AbstractC6661i abstractC6661i, AbstractC6667o abstractC6667o, SQLiteDatabase sQLiteDatabase) {
        boolean z10 = false;
        byte[] bArr;
        if (m4977X()) {
            mo4918d(1L, C7357c.b.CACHE_FULL, abstractC6661i.mo25983j());
            return -1L;
        }
        long m4971O = m4971O(sQLiteDatabase, abstractC6667o);
        int mo4905e = this.f4356d.mo4905e();
        byte[] m26018a = abstractC6661i.mo25981e().m26018a();
        if (m26018a.length <= mo4905e) {
            z10 = true;
        } else {
            z10 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m4971O));
        contentValues.put("transport_name", abstractC6661i.mo25983j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC6661i.mo25982f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC6661i.mo25984k()));
        contentValues.put("payload_encoding", abstractC6661i.mo25981e().m26019b().m25118a());
        contentValues.put(Constants.KEY_HTTP_CODE, abstractC6661i.mo25980d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        if (z10) {
            bArr = m26018a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert(C3384f.f14604ax, null, contentValues);
        if (!z10) {
            double length = m26018a.length;
            double d10 = mo4905e;
            Double.isNaN(length);
            Double.isNaN(d10);
            int ceil = (int) Math.ceil(length / d10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(m26018a, (i10 - 1) * mo4905e, Math.min(i10 * mo4905e, m26018a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC6661i.m26024i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(SerializableCookie.NAME, (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static /* synthetic */ byte[] m5005r0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ Object m5007s0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo4918d(cursor.getInt(0), C7357c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ Object m5009t0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m4963G0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: b4.v
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m5007s0 = null;
                m5007s0 = C1074m0.this.m5007s0((Cursor) obj);
                return m5007s0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static /* synthetic */ Boolean m5010u0(Cursor cursor) {
        boolean z10 = false;
        if (cursor.getCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static /* synthetic */ Object m5011v0(String str, C7357c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m4963G0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo24813a())}), new b() { // from class: b4.u
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Boolean m5010u0;
                m5010u0 = C1074m0.m5010u0((Cursor) obj);
                return m5010u0;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo24813a()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo24813a())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static /* synthetic */ Object m5012w0(long j10, AbstractC6667o abstractC6667o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC6667o.mo26004b(), String.valueOf(AbstractC4130a.m17312a(abstractC6667o.mo26006d()))}) < 1) {
            contentValues.put("backend_name", abstractC6667o.mo26004b());
            contentValues.put(Progress.PRIORITY, Integer.valueOf(AbstractC4130a.m17312a(abstractC6667o.mo26006d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ Object m5014x0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f4354b.mo16762a()).execute();
        return null;
    }

    /* renamed from: y0 */
    private List m5016y0(SQLiteDatabase sQLiteDatabase, final AbstractC6667o abstractC6667o) {
        final ArrayList arrayList = new ArrayList();
        Long m4976V = m4976V(sQLiteDatabase, abstractC6667o);
        if (m4976V == null) {
            return arrayList;
        }
        m4963G0(sQLiteDatabase.query(C3384f.f14604ax, new String[]{C3329bx.f14344d, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", Constants.KEY_HTTP_CODE, "inline"}, "context_id = ?", new String[]{m4976V.toString()}, null, null, null, String.valueOf(this.f4356d.mo4904d())), new b() { // from class: b4.t
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m5000o0 = null;
                m5000o0 = C1074m0.this.m5000o0(arrayList, abstractC6667o, (Cursor) obj);
                return m5000o0;
            }
        });
        return arrayList;
    }

    /* renamed from: z0 */
    private Map m5018z0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((AbstractC1069k) list.get(i10)).mo4914c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m4963G0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", SerializableCookie.NAME, "value"}, sb2.toString(), null, null, null, null), new b() { // from class: b4.r
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m5001p0 = null;
                m5001p0 = C1074m0.m5001p0(hashMap, (Cursor) obj);
                return m5001p0;
            }
        });
        return hashMap;
    }

    /* renamed from: P */
    long m5019P() {
        return m4973S() * m4974T();
    }

    /* renamed from: Q */
    SQLiteDatabase m5020Q() {
        final C1088t0 c1088t0 = this.f4353a;
        Objects.requireNonNull(c1088t0);
        return (SQLiteDatabase) m4957D0(new d() { // from class: b4.w
            @Override // p024b4.C1074m0.d
            /* renamed from: a */
            public final Object mo4937a() {
                return C1088t0.this.getWritableDatabase();
            }
        }, new b() { // from class: b4.e0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase m4983d0;
                m4983d0 = C1074m0.m4983d0((Throwable) obj);
                return m4983d0;
            }
        });
    }

    /* renamed from: W */
    Object m5021W(b bVar) {
        SQLiteDatabase m5020Q = m5020Q();
        m5020Q.beginTransaction();
        try {
            Object apply = bVar.apply(m5020Q);
            m5020Q.setTransactionSuccessful();
            return apply;
        } finally {
            m5020Q.endTransaction();
        }
    }

    @Override // p024b4.InterfaceC1053c
    /* renamed from: a */
    public void mo4916a() {
        m5021W(new b() { // from class: b4.n
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m5014x0 = null;
                m5014x0 = C1074m0.this.m5014x0((SQLiteDatabase) obj);
                return m5014x0;
            }
        });
    }

    @Override // p024b4.InterfaceC1053c
    /* renamed from: b */
    public C7355a mo4917b() {
        final C7355a.a m28385e = C7355a.m28385e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C7355a) m5021W(new b() { // from class: b4.s
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                C7355a m4999n0;
                m4999n0 = C1074m0.this.m4999n0(str, hashMap, m28385e, (SQLiteDatabase) obj);
                return m4999n0;
            }
        });
    }

    @Override // p036c4.InterfaceC1358b
    /* renamed from: c */
    public Object mo5022c(InterfaceC1358b.a aVar) {
        SQLiteDatabase m5020Q = m5020Q();
        m4970N(m5020Q);
        try {
            Object execute = aVar.execute();
            m5020Q.setTransactionSuccessful();
            return execute;
        } finally {
            m5020Q.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.f4353a.close();
    }

    @Override // p024b4.InterfaceC1053c
    /* renamed from: d */
    public void mo4918d(final long j10, final C7357c.b bVar, final String str) {
        m5021W(new b() { // from class: b4.l0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m5011v0 = null;
                m5011v0 = C1074m0.m5011v0(str, bVar, j10, (SQLiteDatabase) obj);
                return m5011v0;
            }
        });
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: g */
    public int mo4919g() {
        final long mo16762a = this.f4354b.mo16762a() - this.f4356d.mo4903c();
        return ((Integer) m5021W(new b() { // from class: b4.i0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Integer m4980a0;
                m4980a0 = C1074m0.this.m4980a0(mo16762a, (SQLiteDatabase) obj);
                return m4980a0;
            }
        })).intValue();
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: i */
    public Iterable mo4920i(final AbstractC6667o abstractC6667o) {
        return (Iterable) m5021W(new b() { // from class: b4.o
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                List m4995l0;
                m4995l0 = C1074m0.this.m4995l0(abstractC6667o, (SQLiteDatabase) obj);
                return m4995l0;
            }
        });
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: j */
    public void mo4921j(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        m5020Q().compileStatement("DELETE FROM events WHERE _id in " + m4961F0(iterable)).execute();
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: k */
    public Iterable mo4922k() {
        return (Iterable) m5021W(new b() { // from class: b4.l
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                List m4992j0;
                m4992j0 = C1074m0.m4992j0((SQLiteDatabase) obj);
                return m4992j0;
            }
        });
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: o */
    public AbstractC1069k mo4923o(final AbstractC6667o abstractC6667o, final AbstractC6661i abstractC6661i) {
        AbstractC7492a.m28689c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC6667o.mo26006d(), abstractC6661i.mo25983j(), abstractC6667o.mo26004b());
        long longValue = ((Long) m5021W(new b() { // from class: b4.a0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Long m5003q0;
                m5003q0 = C1074m0.this.m5003q0(abstractC6661i, abstractC6667o, (SQLiteDatabase) obj);
                return m5003q0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC1069k.m4949a(longValue, abstractC6667o, abstractC6661i);
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: p */
    public void mo4924p(final AbstractC6667o abstractC6667o, final long j10) {
        m5021W(new b() { // from class: b4.m
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m5012w0 = null;
                m5012w0 = C1074m0.m5012w0(j10, abstractC6667o, (SQLiteDatabase) obj);
                return m5012w0;
            }
        });
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: u */
    public void mo4925u(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m4961F0(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        m5021W(new b() { // from class: b4.p
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Object m5009t0 = null;
                m5009t0 = C1074m0.this.m5009t0(str, str2, (SQLiteDatabase) obj);
                return m5009t0;
            }
        });
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: v */
    public long mo4926v(AbstractC6667o abstractC6667o) {
        return ((Long) m4963G0(m5020Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC6667o.mo26004b(), String.valueOf(AbstractC4130a.m17312a(abstractC6667o.mo26006d()))}), new b() { // from class: b4.f0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Long m4985e0;
                m4985e0 = C1074m0.m4985e0((Cursor) obj);
                return m4985e0;
            }
        })).longValue();
    }

    @Override // p024b4.InterfaceC1055d
    /* renamed from: w */
    public boolean mo4927w(final AbstractC6667o abstractC6667o) {
        return ((Boolean) m5021W(new b() { // from class: b4.k0
            @Override // p024b4.C1074m0.b
            public final Object apply(Object obj) {
                Boolean m4991i0;
                m4991i0 = C1074m0.this.m4991i0(abstractC6667o, (SQLiteDatabase) obj);
                return m4991i0;
            }
        })).booleanValue();
    }
}
