package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p335t3.AbstractC6900h;
import p335t3.InterfaceC6896d;
import p335t3.InterfaceC6905m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC6896d {
    @Override // p335t3.InterfaceC6896d
    public InterfaceC6905m create(AbstractC6900h abstractC6900h) {
        return new C1785d(abstractC6900h.mo26823b(), abstractC6900h.mo26826e(), abstractC6900h.mo26825d());
    }
}
