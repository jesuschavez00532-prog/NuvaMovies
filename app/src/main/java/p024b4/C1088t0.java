package p024b4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b4.t0 */
/* loaded from: classes.dex */
public final class C1088t0 extends SQLiteOpenHelper {

    /* renamed from: c */
    private static final String f4380c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d */
    static int f4381d = 5;

    /* renamed from: e */
    private static final a f4382e;

    /* renamed from: f */
    private static final a f4383f;

    /* renamed from: g */
    private static final a f4384g;

    /* renamed from: h */
    private static final a f4385h;

    /* renamed from: i */
    private static final a f4386i;

    /* renamed from: j */
    private static final List f4387j;

    /* renamed from: a */
    private final int f4388a;

    /* renamed from: b */
    private boolean f4389b;

    /* renamed from: b4.t0$a */
    /* loaded from: classes.dex */
    public class a {
        /* renamed from: a */
        void mo5026a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: b4.o0
            @Override // p024b4.C1088t0.a
            /* renamed from: a */
            public final void mo5026a(SQLiteDatabase sQLiteDatabase) {
                C1088t0.m5033h(sQLiteDatabase);
            }
        };
        f4382e = aVar;
        a aVar2 = new a() { // from class: b4.p0
            @Override // p024b4.C1088t0.a
            /* renamed from: a */
            public final void mo5026a(SQLiteDatabase sQLiteDatabase) {
                C1088t0.m5034l(sQLiteDatabase);
            }
        };
        f4383f = aVar2;
        a aVar3 = new a() { // from class: b4.q0
            @Override // p024b4.C1088t0.a
            /* renamed from: a */
            public final void mo5026a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f4384g = aVar3;
        a aVar4 = new a() { // from class: b4.r0
            @Override // p024b4.C1088t0.a
            /* renamed from: a */
            public final void mo5026a(SQLiteDatabase sQLiteDatabase) {
                C1088t0.m5036n(sQLiteDatabase);
            }
        };
        f4385h = aVar4;
        a aVar5 = new a() { // from class: b4.s0
            @Override // p024b4.C1088t0.a
            /* renamed from: a */
            public final void mo5026a(SQLiteDatabase sQLiteDatabase) {
                C1088t0.m5037q(sQLiteDatabase);
            }
        };
        f4386i = aVar5;
        f4387j = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1088t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f4389b = false;
        this.f4388a = i10;
    }

    /* renamed from: f */
    private void m5032f(SQLiteDatabase sQLiteDatabase) {
        if (!this.f4389b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m5033h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m5034l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m5036n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m5037q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f4380c);
    }

    /* renamed from: r */
    private void m5038r(SQLiteDatabase sQLiteDatabase, int i10) {
        m5032f(sQLiteDatabase);
        m5039s(sQLiteDatabase, 0, i10);
    }

    /* renamed from: s */
    private void m5039s(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f4387j;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                ((a) f4387j.get(i10)).mo5026a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f4389b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m5038r(sQLiteDatabase, this.f4388a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m5038r(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m5032f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m5032f(sQLiteDatabase);
        m5039s(sQLiteDatabase, i10, i11);
    }
}
