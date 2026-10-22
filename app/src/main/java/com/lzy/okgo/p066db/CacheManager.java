package com.lzy.okgo.p066db;

import android.content.ContentValues;
import android.database.Cursor;
import com.lzy.okgo.cache.CacheEntity;
import java.util.List;

/* loaded from: classes2.dex */
public class CacheManager extends BaseDao<CacheEntity<?>> {

    /* loaded from: classes2.dex */
    private static class CacheManagerHolder {
        private static final CacheManager instance = new CacheManager();

        private CacheManagerHolder() {
        }
    }

    public static CacheManager getInstance() {
        return CacheManagerHolder.instance;
    }

    public boolean clear() {
        return deleteAll();
    }

    public CacheEntity<?> get(String str) {
        if (str == null) {
            return null;
        }
        List<CacheEntity<?>> query = query("key=?", new String[]{str});
        if (query.size() > 0) {
            return query.get(0);
        }
        return null;
    }

    public List<CacheEntity<?>> getAll() {
        return queryAll();
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public String getTableName() {
        return "cache";
    }

    public boolean remove(String str) {
        if (str == null) {
            return false;
        }
        return delete("key=?", new String[]{str});
    }

    public <T> CacheEntity<T> replace(String str, CacheEntity<T> cacheEntity) {
        cacheEntity.setKey(str);
        replace((CacheManager) cacheEntity);
        return cacheEntity;
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public void unInit() {
    }

    private CacheManager() {
        super(new DBHelper());
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public ContentValues getContentValues(CacheEntity<?> cacheEntity) {
        return CacheEntity.getContentValues(cacheEntity);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.lzy.okgo.p066db.BaseDao
    public CacheEntity<?> parseCursorToBean(Cursor cursor) {
        return CacheEntity.parseCursorToBean(cursor);
    }

    public <T> CacheEntity<T> get(String str, Class<T> cls) {
        return (CacheEntity<T>) get(str);
    }
}
