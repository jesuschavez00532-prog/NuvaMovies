package com.raizlabs.android.dbflow.sql.queriable;

import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ListModelLoader<TModel> extends ModelLoader<TModel, List<TModel>> {
    public ListModelLoader(Class<TModel> cls) {
        super(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = getInstanceAdapter().newInstance();
        getInstanceAdapter().loadFromCursor(r3, r0);
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r3.moveToNext() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return r4;
     */
    @Override // com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<TModel> convertToData(com.raizlabs.android.dbflow.structure.database.FlowCursor r3, java.util.List<TModel> r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto Lb
        L8:
            r4.clear()
        Lb:
            boolean r0 = r3.moveToFirst()
            if (r0 == 0) goto L29
        L11:
            com.raizlabs.android.dbflow.structure.InstanceAdapter r0 = r2.getInstanceAdapter()
            java.lang.Object r0 = r0.newInstance()
            com.raizlabs.android.dbflow.structure.InstanceAdapter r1 = r2.getInstanceAdapter()
            r1.loadFromCursor(r3, r0)
            r4.add(r0)
            boolean r0 = r3.moveToNext()
            if (r0 != 0) goto L11
        L29:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.raizlabs.android.dbflow.sql.queriable.ListModelLoader.convertToData(com.raizlabs.android.dbflow.structure.database.FlowCursor, java.util.List):java.util.List");
    }

    @Override // com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    public List<TModel> load(String str) {
        return (List) super.load(str);
    }

    @Override // com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    public List<TModel> load(String str, List<TModel> list) {
        return (List) super.load(str, (String) list);
    }

    @Override // com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    public List<TModel> load(DatabaseWrapper databaseWrapper, String str) {
        return (List) super.load(databaseWrapper, str);
    }

    @Override // com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    public List<TModel> load(DatabaseWrapper databaseWrapper, String str, List<TModel> list) {
        return (List) super.load(databaseWrapper, str, (String) list);
    }

    @Override // com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    public List<TModel> load(FlowCursor flowCursor) {
        return (List) super.load(flowCursor);
    }

    @Override // com.raizlabs.android.dbflow.sql.queriable.ModelLoader
    public List<TModel> load(FlowCursor flowCursor, List<TModel> list) {
        if (list == null) {
            list = new ArrayList<>();
        } else {
            list.clear();
        }
        return (List) super.load(flowCursor, (FlowCursor) list);
    }
}
