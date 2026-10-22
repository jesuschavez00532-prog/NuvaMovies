package com.lzy.okgo.p066db;

import android.content.ContentValues;
import android.database.Cursor;
import com.lzy.okgo.model.Progress;
import com.titans.entity.CdnType;
import java.util.List;

/* loaded from: classes2.dex */
public class UploadManager extends BaseDao<Progress> {

    /* loaded from: classes2.dex */
    private static class UploadManagerHolder {
        private static final UploadManager instance = new UploadManager();

        private UploadManagerHolder() {
        }
    }

    public static UploadManager getInstance() {
        return UploadManagerHolder.instance;
    }

    public boolean clear() {
        return deleteAll();
    }

    public void delete(String str) {
        delete("tag=?", new String[]{str});
    }

    public Progress get(String str) {
        return queryOne("tag=?", new String[]{str});
    }

    public List<Progress> getAll() {
        return query(null, null, null, null, null, "date ASC", null);
    }

    public List<Progress> getFinished() {
        return query(null, "status=?", new String[]{CdnType.DIGITAL_TYPE_PCDN}, null, null, "date ASC", null);
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public String getTableName() {
        return "upload";
    }

    public List<Progress> getUploading() {
        return query(null, "status not in(?)", new String[]{CdnType.DIGITAL_TYPE_PCDN}, null, null, "date ASC", null);
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public void unInit() {
    }

    public boolean update(Progress progress) {
        return update((UploadManager) progress, "tag=?", new String[]{progress.tag});
    }

    private UploadManager() {
        super(new DBHelper());
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public ContentValues getContentValues(Progress progress) {
        return Progress.buildContentValues(progress);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.lzy.okgo.p066db.BaseDao
    public Progress parseCursorToBean(Cursor cursor) {
        return Progress.parseCursorToBean(cursor);
    }

    public boolean update(ContentValues contentValues, String str) {
        return update(contentValues, "tag=?", new String[]{str});
    }
}
