package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC1605e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p109e2.AbstractC4121k;

/* renamed from: com.bumptech.glide.load.data.f */
/* loaded from: classes.dex */
public class C1606f {

    /* renamed from: b */
    private static final InterfaceC1605e.a f6399b = new a();

    /* renamed from: a */
    private final Map f6400a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC1605e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: a */
        public Class mo7415a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: b */
        public InterfaceC1605e mo7416b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC1605e {

        /* renamed from: a */
        private final Object f6401a;

        b(Object obj) {
            this.f6401a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e
        /* renamed from: a */
        public Object mo7412a() {
            return this.f6401a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e
        /* renamed from: b */
        public void mo7413b() {
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC1605e m7432a(Object obj) {
        InterfaceC1605e.a aVar;
        AbstractC4121k.m17226d(obj);
        aVar = (InterfaceC1605e.a) this.f6400a.get(obj.getClass());
        if (aVar == null) {
            Iterator it = this.f6400a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC1605e.a aVar2 = (InterfaceC1605e.a) it.next();
                if (aVar2.mo7415a().isAssignableFrom(obj.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f6399b;
        }
        return aVar.mo7416b(obj);
    }

    /* renamed from: b */
    public synchronized void m7433b(InterfaceC1605e.a aVar) {
        this.f6400a.put(aVar.mo7415a(), aVar);
    }
}
