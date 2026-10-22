package com.alibaba.sdk.android.beacon;

import com.alibaba.sdk.android.beacon.Beacon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.alibaba.sdk.android.beacon.b */
/* loaded from: classes.dex */
public final class C1520b {

    /* renamed from: a */
    private final List<Beacon.Config> f5863a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1520b(Beacon beacon) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<Beacon.Config> m7053a() {
        return Collections.unmodifiableList(this.f5863a);
    }
}
