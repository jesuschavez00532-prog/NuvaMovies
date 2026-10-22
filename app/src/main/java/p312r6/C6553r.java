package p312r6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r6.r */
/* loaded from: classes.dex */
public class C6553r {

    /* renamed from: a */
    private final SharedPreferences f25174a;

    public C6553r(Context context, String str) {
        this.f25174a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m25600a() {
        long j10 = this.f25174a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f25174a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f25174a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f25174a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m25601d(long j10) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j10).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    /* renamed from: e */
    private synchronized String m25602e(String str) {
        for (Map.Entry<String, ?> entry : this.f25174a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private synchronized void m25603h(String str) {
        String m25602e = m25602e(str);
        if (m25602e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f25174a.getStringSet(m25602e, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f25174a.edit().remove(m25602e).commit();
        } else {
            this.f25174a.edit().putStringSet(m25602e, hashSet).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m25604b() {
        SharedPreferences.Editor edit = this.f25174a.edit();
        for (Map.Entry<String, ?> entry : this.f25174a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List m25605c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f25174a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(AbstractC6554s.m25612a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        m25611l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: f */
    synchronized boolean m25606f(long j10, long j11) {
        return m25601d(j10).equals(m25601d(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m25607g() {
        String m25601d = m25601d(System.currentTimeMillis());
        this.f25174a.edit().putString("last-used-date", m25601d).commit();
        m25603h(m25601d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean m25608i(long j10) {
        return m25609j("fire-global", j10);
    }

    /* renamed from: j */
    synchronized boolean m25609j(String str, long j10) {
        if (this.f25174a.contains(str)) {
            if (!m25606f(this.f25174a.getLong(str, -1L), j10)) {
                this.f25174a.edit().putLong(str, j10).commit();
                return true;
            }
            return false;
        }
        this.f25174a.edit().putLong(str, j10).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void m25610k(long j10, String str) {
        String m25601d = m25601d(j10);
        if (this.f25174a.getString("last-used-date", "").equals(m25601d)) {
            return;
        }
        long j11 = this.f25174a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            m25600a();
            j11 = this.f25174a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f25174a.getStringSet(str, new HashSet()));
        hashSet.add(m25601d);
        this.f25174a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", m25601d).commit();
    }

    /* renamed from: l */
    synchronized void m25611l(long j10) {
        this.f25174a.edit().putLong("fire-global", j10).commit();
    }
}
