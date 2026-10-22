package com.raizlabs.android.dbflow.sql.queriable;

import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;

/* loaded from: classes2.dex */
public class CacheableListModelLoader<TModel> extends ListModelLoader<TModel> {
    private ModelAdapter<TModel> modelAdapter;
    private ModelCache<TModel, ?> modelCache;

    public CacheableListModelLoader(Class<TModel> cls) {
        super(cls);
    }

    public ModelAdapter<TModel> getModelAdapter() {
        if (this.modelAdapter == null) {
            if (getInstanceAdapter() instanceof ModelAdapter) {
                ModelAdapter<TModel> modelAdapter = (ModelAdapter) getInstanceAdapter();
                this.modelAdapter = modelAdapter;
                if (!modelAdapter.cachingEnabled()) {
                    throw new IllegalArgumentException("You cannot call this method for a table that has no caching id. Eitheruse one Primary Key or use the MultiCacheKeyConverter");
                }
            } else {
                throw new IllegalArgumentException("A non-Table type was used.");
            }
        }
        return this.modelAdapter;
    }

    public ModelCache<TModel, ?> getModelCache() {
        if (this.modelCache == null) {
            ModelCache<TModel, ?> modelCache = this.modelAdapter.getModelCache();
            this.modelCache = modelCache;
            if (modelCache == null) {
                throw new IllegalArgumentException("ModelCache specified in convertToCacheableList() must not be null.");
            }
        }
        return this.modelCache;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r2 = getModelAdapter().newInstance();
        getModelAdapter().loadFromCursor(r6, r2);
        getModelCache().addModel(getModelAdapter().getCachingId(r1), r2);
        r7.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r6.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        r1 = getModelAdapter().getCachingColumnValuesFromCursor(r0, r6);
        r2 = getModelCache().get(getModelAdapter().getCachingId(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        getModelAdapter().reloadRelationships(r2, r6);
        r7.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
    
        if (r6.moveToNext() != false) goto L14;
     */
    @Override // com.raizlabs.android.dbflow.sql.queriable.ListModelLoader, com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<TModel> convertToData(com.raizlabs.android.dbflow.structure.database.FlowCursor r6, java.util.List<TModel> r7) {
        /*
            r5 = this;
            if (r7 != 0) goto L7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L7:
            com.raizlabs.android.dbflow.structure.ModelAdapter r0 = r5.getModelAdapter()
            java.lang.String[] r0 = r0.getCachingColumns()
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r6.moveToFirst()
            if (r1 == 0) goto L64
        L18:
            com.raizlabs.android.dbflow.structure.ModelAdapter r1 = r5.getModelAdapter()
            java.lang.Object[] r1 = r1.getCachingColumnValuesFromCursor(r0, r6)
            com.raizlabs.android.dbflow.structure.cache.ModelCache r2 = r5.getModelCache()
            com.raizlabs.android.dbflow.structure.ModelAdapter r3 = r5.getModelAdapter()
            java.lang.Object r3 = r3.getCachingId(r1)
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L3d
            com.raizlabs.android.dbflow.structure.ModelAdapter r1 = r5.getModelAdapter()
            r1.reloadRelationships(r2, r6)
            r7.add(r2)
            goto L5e
        L3d:
            com.raizlabs.android.dbflow.structure.ModelAdapter r2 = r5.getModelAdapter()
            java.lang.Object r2 = r2.newInstance()
            com.raizlabs.android.dbflow.structure.ModelAdapter r3 = r5.getModelAdapter()
            r3.loadFromCursor(r6, r2)
            com.raizlabs.android.dbflow.structure.cache.ModelCache r3 = r5.getModelCache()
            com.raizlabs.android.dbflow.structure.ModelAdapter r4 = r5.getModelAdapter()
            java.lang.Object r1 = r4.getCachingId(r1)
            r3.addModel(r1, r2)
            r7.add(r2)
        L5e:
            boolean r1 = r6.moveToNext()
            if (r1 != 0) goto L18
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.raizlabs.android.dbflow.sql.queriable.CacheableListModelLoader.convertToData(com.raizlabs.android.dbflow.structure.database.FlowCursor, java.util.List):java.util.List");
    }
}
