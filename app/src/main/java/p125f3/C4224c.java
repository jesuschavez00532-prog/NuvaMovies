package p125f3;

import android.content.ContentValues;
import android.database.Cursor;
import com.lzy.okgo.model.Progress;
import com.titans.entity.CdnType;
import java.io.File;
import java.util.List;
import p258o3.C5911g;

/* renamed from: f3.c */
/* loaded from: classes.dex */
public class C4224c extends AbstractC4222a {

    /* renamed from: f */
    private static volatile C4224c f18511f;

    private C4224c() {
        super(new C4223b());
    }

    /* renamed from: u */
    public static C4224c m17666u() {
        if (f18511f == null || !f18511f.m17655f()) {
            synchronized (C4224c.class) {
                if (f18511f == null || !f18511f.m17655f()) {
                    f18511f = new C4224c();
                }
            }
        }
        return f18511f;
    }

    /* renamed from: v */
    public static C4224c m17667v() {
        return f18511f;
    }

    @Override // p125f3.AbstractC4222a
    /* renamed from: e */
    public String mo17654e() {
        return "download";
    }

    /* renamed from: n */
    public void m17668n() {
        if (f18511f != null) {
            f18511f.m17650a();
        }
        f18511f = null;
    }

    /* renamed from: o */
    public void m17669o(String str) {
        m17652c("tag=?", new String[]{str});
    }

    /* renamed from: p */
    public Progress m17670p(String str) {
        return (Progress) m17659j("tag=?", new String[]{str});
    }

    /* renamed from: q */
    public List m17671q() {
        return m17658i(null, null, null, null, null, "date DESC", null);
    }

    @Override // p125f3.AbstractC4222a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ContentValues mo17653d(Progress progress) {
        return Progress.buildContentValues(progress);
    }

    /* renamed from: s */
    public List m17673s() {
        List<Progress> m17658i = m17658i(null, "status not in(?)", new String[]{CdnType.DIGITAL_TYPE_PCDN}, null, null, "date DESC", null);
        if (m17658i != null) {
            for (Progress progress : m17658i) {
                File file = new File(C5911g.f23514h.m23905a().m23897l() + File.separator + progress.filePath);
                if (file.exists()) {
                    progress.currentSize = file.length();
                } else {
                    progress.currentSize = 0L;
                }
                progress.fraction = (((float) progress.currentSize) * 1.0f) / ((float) progress.totalSize);
            }
        }
        return m17658i;
    }

    /* renamed from: t */
    public List m17674t() {
        return m17658i(null, "status=?", new String[]{CdnType.DIGITAL_TYPE_PCDN}, null, null, "date DESC", null);
    }

    /* renamed from: w */
    public List m17675w() {
        return m17658i(null, "status=?", new String[]{"2"}, null, null, "date DESC", null);
    }

    @Override // p125f3.AbstractC4222a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Progress mo17657h(Cursor cursor) {
        return Progress.parseCursorToBean(cursor);
    }

    /* renamed from: y */
    public void m17677y() {
        m17668n();
    }

    /* renamed from: z */
    public boolean m17678z(ContentValues contentValues, String str) {
        return m17662m(contentValues, "tag=?", new String[]{str});
    }
}
