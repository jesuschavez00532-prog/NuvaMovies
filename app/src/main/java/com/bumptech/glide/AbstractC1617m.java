package com.bumptech.glide;

import p034c2.C1343a;
import p034c2.InterfaceC1345c;
import p109e2.AbstractC4122l;

/* renamed from: com.bumptech.glide.m */
/* loaded from: classes.dex */
public abstract class AbstractC1617m implements Cloneable {

    /* renamed from: a */
    private InterfaceC1345c f6420a = C1343a.m6109b();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC1617m clone() {
        try {
            return (AbstractC1617m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC1345c m7457b() {
        return this.f6420a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC1617m) {
            return AbstractC4122l.m17232e(this.f6420a, ((AbstractC1617m) obj).f6420a);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC1345c interfaceC1345c = this.f6420a;
        if (interfaceC1345c != null) {
            return interfaceC1345c.hashCode();
        }
        return 0;
    }
}
