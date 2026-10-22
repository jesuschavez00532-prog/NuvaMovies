package com.raizlabs.android.dbflow.structure.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;

/* loaded from: classes2.dex */
public class FlowSQLiteOpenHelper extends SQLiteOpenHelper implements OpenHelper {
    private AndroidDatabase androidDatabase;
    private DatabaseHelperDelegate databaseHelperDelegate;

    /* loaded from: classes2.dex */
    private class BackupHelper extends SQLiteOpenHelper implements OpenHelper {
        private AndroidDatabase androidDatabase;
        private final BaseDatabaseHelper baseDatabaseHelper;

        public BackupHelper(Context context, String str, int i10, DatabaseDefinition databaseDefinition) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
            this.baseDatabaseHelper = new BaseDatabaseHelper(databaseDefinition);
        }

        @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
        public void backupDB() {
        }

        @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
        public void closeDB() {
        }

        @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
        public DatabaseWrapper getDatabase() {
            if (this.androidDatabase == null) {
                this.androidDatabase = AndroidDatabase.from(getWritableDatabase());
            }
            return this.androidDatabase;
        }

        @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
        public DatabaseHelperDelegate getDelegate() {
            return null;
        }

        @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
        public boolean isDatabaseIntegrityOk() {
            return false;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.baseDatabaseHelper.onCreate(AndroidDatabase.from(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.baseDatabaseHelper.onDowngrade(AndroidDatabase.from(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            this.baseDatabaseHelper.onOpen(AndroidDatabase.from(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.baseDatabaseHelper.onUpgrade(AndroidDatabase.from(sQLiteDatabase), i10, i11);
        }

        @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
        public void performRestoreFromBackup() {
        }

        @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
        public void setDatabaseListener(DatabaseHelperListener databaseHelperListener) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FlowSQLiteOpenHelper(com.raizlabs.android.dbflow.config.DatabaseDefinition r10, com.raizlabs.android.dbflow.structure.database.DatabaseHelperListener r11) {
        /*
            r9 = this;
            android.content.Context r0 = com.raizlabs.android.dbflow.config.FlowManager.getContext()
            boolean r1 = r10.isInMemory()
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r2
            goto L11
        Ld:
            java.lang.String r1 = r10.getDatabaseFileName()
        L11:
            int r3 = r10.getDatabaseVersion()
            r9.<init>(r0, r1, r2, r3)
            boolean r0 = r10.backupEnabled()
            if (r0 == 0) goto L32
            com.raizlabs.android.dbflow.structure.database.FlowSQLiteOpenHelper$BackupHelper r2 = new com.raizlabs.android.dbflow.structure.database.FlowSQLiteOpenHelper$BackupHelper
            android.content.Context r5 = com.raizlabs.android.dbflow.config.FlowManager.getContext()
            java.lang.String r6 = com.raizlabs.android.dbflow.structure.database.DatabaseHelperDelegate.getTempDbFileName(r10)
            int r7 = r10.getDatabaseVersion()
            r3 = r2
            r4 = r9
            r8 = r10
            r3.<init>(r5, r6, r7, r8)
        L32:
            com.raizlabs.android.dbflow.structure.database.DatabaseHelperDelegate r0 = new com.raizlabs.android.dbflow.structure.database.DatabaseHelperDelegate
            r0.<init>(r11, r10, r2)
            r9.databaseHelperDelegate = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.raizlabs.android.dbflow.structure.database.FlowSQLiteOpenHelper.<init>(com.raizlabs.android.dbflow.config.DatabaseDefinition, com.raizlabs.android.dbflow.structure.database.DatabaseHelperListener):void");
    }

    @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
    public void backupDB() {
        this.databaseHelperDelegate.backupDB();
    }

    @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
    public void closeDB() {
        getDatabase();
        this.androidDatabase.getDatabase().close();
    }

    @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
    public DatabaseWrapper getDatabase() {
        AndroidDatabase androidDatabase = this.androidDatabase;
        if (androidDatabase == null || !androidDatabase.getDatabase().isOpen()) {
            this.androidDatabase = AndroidDatabase.from(getWritableDatabase());
        }
        return this.androidDatabase;
    }

    @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
    public DatabaseHelperDelegate getDelegate() {
        return this.databaseHelperDelegate;
    }

    @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
    public boolean isDatabaseIntegrityOk() {
        return this.databaseHelperDelegate.isDatabaseIntegrityOk();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.databaseHelperDelegate.onCreate(AndroidDatabase.from(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.databaseHelperDelegate.onDowngrade(AndroidDatabase.from(sQLiteDatabase), i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.databaseHelperDelegate.onOpen(AndroidDatabase.from(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.databaseHelperDelegate.onUpgrade(AndroidDatabase.from(sQLiteDatabase), i10, i11);
    }

    @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
    public void performRestoreFromBackup() {
        this.databaseHelperDelegate.performRestoreFromBackup();
    }

    @Override // com.raizlabs.android.dbflow.structure.database.OpenHelper
    public void setDatabaseListener(DatabaseHelperListener databaseHelperListener) {
        this.databaseHelperDelegate.setDatabaseHelperListener(databaseHelperListener);
    }
}
