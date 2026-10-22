package retrofit2;

import be.AbstractC1319o;
import be.AbstractC1320p;
import be.C1309e;
import ee.InterfaceC4181d;
import ge.AbstractC4441h;
import java.lang.reflect.Method;
import ne.AbstractC5868k;
import p136fe.AbstractC4312c;
import p136fe.AbstractC4313d;
import ve.C7284i;
import ve.InterfaceC7281h;

/* loaded from: classes3.dex */
public final class KotlinExtensions {
    /* renamed from: a */
    public static final Object m25703a(Call call, InterfaceC4181d interfaceC4181d) {
        InterfaceC4181d m18093b;
        Object m18094c;
        m18093b = AbstractC4312c.m18093b(interfaceC4181d);
        final C7284i c7284i = new C7284i(m18093b, 1);
        c7284i.mo28138j(new C6585x19835f10(call));
        call.mo25686n(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            /* renamed from: a */
            public void mo21158a(Call call2, Throwable th) {
                AbstractC5868k.m23675g(call2, "call");
                AbstractC5868k.m23675g(th, "t");
                InterfaceC7281h interfaceC7281h = InterfaceC7281h.this;
                AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                interfaceC7281h.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(th)));
            }

            @Override // retrofit2.Callback
            /* renamed from: b */
            public void mo21159b(Call call2, Response response) {
                AbstractC5868k.m23675g(call2, "call");
                AbstractC5868k.m23675g(response, "response");
                if (response.m25763d()) {
                    Object m25761a = response.m25761a();
                    if (m25761a == null) {
                        Object tag = call2.request().tag(Invocation.class);
                        if (tag == null) {
                            AbstractC5868k.m23682n();
                        }
                        AbstractC5868k.m23670b(tag, "call.request().tag(Invocation::class.java)!!");
                        Method m25702a = ((Invocation) tag).m25702a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Response from ");
                        AbstractC5868k.m23670b(m25702a, "method");
                        Class<?> declaringClass = m25702a.getDeclaringClass();
                        AbstractC5868k.m23670b(declaringClass, "method.declaringClass");
                        sb2.append(declaringClass.getName());
                        sb2.append('.');
                        sb2.append(m25702a.getName());
                        sb2.append(" was null but response body type was declared as non-null");
                        C1309e c1309e = new C1309e(sb2.toString());
                        InterfaceC7281h interfaceC7281h = InterfaceC7281h.this;
                        AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                        interfaceC7281h.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(c1309e)));
                        return;
                    }
                    InterfaceC7281h.this.mo17486d(AbstractC1319o.m5971a(m25761a));
                    return;
                }
                InterfaceC7281h interfaceC7281h2 = InterfaceC7281h.this;
                HttpException httpException = new HttpException(response);
                AbstractC1319o.a aVar2 = AbstractC1319o.f4987a;
                interfaceC7281h2.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(httpException)));
            }
        });
        Object m28224w = c7284i.m28224w();
        m18094c = AbstractC4313d.m18094c();
        if (m28224w == m18094c) {
            AbstractC4441h.m18639c(interfaceC4181d);
        }
        return m28224w;
    }

    /* renamed from: b */
    public static final Object m25704b(Call call, InterfaceC4181d interfaceC4181d) {
        InterfaceC4181d m18093b;
        Object m18094c;
        m18093b = AbstractC4312c.m18093b(interfaceC4181d);
        final C7284i c7284i = new C7284i(m18093b, 1);
        c7284i.mo28138j(new C6586x19835f11(call));
        call.mo25686n(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            /* renamed from: a */
            public void mo21158a(Call call2, Throwable th) {
                AbstractC5868k.m23675g(call2, "call");
                AbstractC5868k.m23675g(th, "t");
                InterfaceC7281h interfaceC7281h = InterfaceC7281h.this;
                AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                interfaceC7281h.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(th)));
            }

            @Override // retrofit2.Callback
            /* renamed from: b */
            public void mo21159b(Call call2, Response response) {
                AbstractC5868k.m23675g(call2, "call");
                AbstractC5868k.m23675g(response, "response");
                if (response.m25763d()) {
                    InterfaceC7281h.this.mo17486d(AbstractC1319o.m5971a(response.m25761a()));
                    return;
                }
                InterfaceC7281h interfaceC7281h = InterfaceC7281h.this;
                HttpException httpException = new HttpException(response);
                AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                interfaceC7281h.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(httpException)));
            }
        });
        Object m28224w = c7284i.m28224w();
        m18094c = AbstractC4313d.m18094c();
        if (m28224w == m18094c) {
            AbstractC4441h.m18639c(interfaceC4181d);
        }
        return m28224w;
    }

    /* renamed from: c */
    public static final Object m25705c(Call call, InterfaceC4181d interfaceC4181d) {
        InterfaceC4181d m18093b;
        Object m18094c;
        m18093b = AbstractC4312c.m18093b(interfaceC4181d);
        final C7284i c7284i = new C7284i(m18093b, 1);
        c7284i.mo28138j(new C6587xc95e9eb1(call));
        call.mo25686n(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            /* renamed from: a */
            public void mo21158a(Call call2, Throwable th) {
                AbstractC5868k.m23675g(call2, "call");
                AbstractC5868k.m23675g(th, "t");
                InterfaceC7281h interfaceC7281h = InterfaceC7281h.this;
                AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                interfaceC7281h.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(th)));
            }

            @Override // retrofit2.Callback
            /* renamed from: b */
            public void mo21159b(Call call2, Response response) {
                AbstractC5868k.m23675g(call2, "call");
                AbstractC5868k.m23675g(response, "response");
                InterfaceC7281h.this.mo17486d(AbstractC1319o.m5971a(response));
            }
        });
        Object m28224w = c7284i.m28224w();
        m18094c = AbstractC4313d.m18094c();
        if (m28224w == m18094c) {
            AbstractC4441h.m18639c(interfaceC4181d);
        }
        return m28224w;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m25706d(final java.lang.Exception r4, ee.InterfaceC4181d r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f25252e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25252e = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25251d
            java.lang.Object r1 = p136fe.AbstractC4311b.m18091c()
            int r2 = r0.f25252e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f25253f
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r4 = r5 instanceof be.AbstractC1319o.b
            if (r4 != 0) goto L2e
            goto L63
        L2e:
            be.o$b r5 = (be.AbstractC1319o.b) r5
            java.lang.Throwable r4 = r5.f4988a
            throw r4
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            boolean r2 = r5 instanceof be.AbstractC1319o.b
            if (r2 != 0) goto L66
            r0.f25253f = r4
            r0.f25252e = r3
            ve.x r5 = ve.C7297m0.m28251a()
            ee.g r2 = r0.mo17487e()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.mo21239x(r2, r3)
            java.lang.Object r4 = p136fe.AbstractC4311b.m18091c()
            java.lang.Object r5 = p136fe.AbstractC4311b.m18091c()
            if (r4 != r5) goto L60
            ge.AbstractC4441h.m18639c(r0)
        L60:
            if (r4 != r1) goto L63
            return r1
        L63:
            be.x r4 = be.C1328x.f4998a
            return r4
        L66:
            be.o$b r5 = (be.AbstractC1319o.b) r5
            java.lang.Throwable r4 = r5.f4988a
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m25706d(java.lang.Exception, ee.d):java.lang.Object");
    }
}
