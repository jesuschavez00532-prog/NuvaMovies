package androidx.lifecycle;

import androidx.lifecycle.AbstractC0749c;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements InterfaceC0750d {

    /* renamed from: a */
    private final InterfaceC0750d f3090a;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0741a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3091a;

        static {
            int[] iArr = new int[AbstractC0749c.b.values().length];
            f3091a = iArr;
            try {
                iArr[AbstractC0749c.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3091a[AbstractC0749c.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3091a[AbstractC0749c.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3091a[AbstractC0749c.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3091a[AbstractC0749c.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3091a[AbstractC0749c.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3091a[AbstractC0749c.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0750d
    public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
        switch (C0741a.f3091a[bVar.ordinal()]) {
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                InterfaceC0750d interfaceC0750d = this.f3090a;
                if (interfaceC0750d != null) {
                    interfaceC0750d.onStateChanged(interfaceC0752f, bVar);
                    return;
                }
                return;
        }
    }
}
