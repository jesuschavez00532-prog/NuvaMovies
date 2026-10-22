package com.raizlabs.android.dbflow.sql.queriable;

/* loaded from: classes2.dex */
public class SingleKeyCacheableListModelLoader<TModel> extends CacheableListModelLoader<TModel> {
    public SingleKeyCacheableListModelLoader(Class<TModel> cls) {
        super(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r1 = getModelAdapter().newInstance();
        getModelAdapter().loadFromCursor(r4, r1);
        getModelCache().addModel(r0, r1);
        r5.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r4.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r0 = getModelAdapter().getCachingColumnValueFromCursor(r4);
        r1 = getModelCache().get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        getModelAdapter().reloadRelationships(r1, r4);
        r5.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r4.moveToNext() != false) goto L14;
     */
    @Override // com.raizlabs.android.dbflow.sql.queriable.CacheableListModelLoader, com.raizlabs.android.dbflow.sql.queriable.ListModelLoader, com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<TModel> convertToData(com.raizlabs.android.dbflow.structure.database.FlowCursor r4, java.util.List<TModel> r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L7:
            boolean r0 = r4.moveToFirst()
            if (r0 == 0) goto L49
        Ld:
            com.raizlabs.android.dbflow.structure.ModelAdapter r0 = r3.getModelAdapter()
            java.lang.Object r0 = r0.getCachingColumnValueFromCursor(r4)
            com.raizlabs.android.dbflow.structure.cache.ModelCache r1 = r3.getModelCache()
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L2a
            com.raizlabs.android.dbflow.structure.ModelAdapter r0 = r3.getModelAdapter()
            r0.reloadRelationships(r1, r4)
            r5.add(r1)
            goto L43
        L2a:
            com.raizlabs.android.dbflow.structure.ModelAdapter r1 = r3.getModelAdapter()
            java.lang.Object r1 = r1.newInstance()
            com.raizlabs.android.dbflow.structure.ModelAdapter r2 = r3.getModelAdapter()
            r2.loadFromCursor(r4, r1)
            com.raizlabs.android.dbflow.structure.cache.ModelCache r2 = r3.getModelCache()
            r2.addModel(r0, r1)
            r5.add(r1)
        L43:
            boolean r0 = r4.moveToNext()
            if (r0 != 0) goto Ld
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.raizlabs.android.dbflow.sql.queriable.SingleKeyCacheableListModelLoader.convertToData(com.raizlabs.android.dbflow.structure.database.FlowCursor, java.util.List):java.util.List");
    }
}
