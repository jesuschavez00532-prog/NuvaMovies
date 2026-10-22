package org.repackage.com.vivo.identifier;

import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes3.dex */
public class IdentifierIdObserver extends ContentObserver {

    /* renamed from: a */
    private static final String f23965a = "VMS_SDK_Observer";

    /* renamed from: b */
    private String f23966b;

    /* renamed from: c */
    private int f23967c;

    /* renamed from: d */
    private IdentifierIdClient f23968d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentifierIdObserver(IdentifierIdClient identifierIdClient, int i10, String str) {
        super(null);
        this.f23968d = identifierIdClient;
        this.f23967c = i10;
        this.f23966b = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        IdentifierIdClient identifierIdClient = this.f23968d;
        if (identifierIdClient != null) {
            identifierIdClient.m24318a(this.f23967c, this.f23966b);
        } else {
            Log.e(f23965a, "mIdentifierIdClient is null");
        }
    }
}
