package gd;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import p135fd.AbstractC4309d;
import p135fd.C4307b;
import p135fd.C4308c;

/* renamed from: gd.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4433c {

    /* renamed from: a */
    private static final Function f19247a = new a();

    /* renamed from: b */
    private static final Function f19248b = new b();

    /* renamed from: gd.c$a */
    /* loaded from: classes3.dex */
    static class a implements Function {
        a() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC4431a apply(EnumC4431a enumC4431a) {
            switch (c.f19249a[enumC4431a.ordinal()]) {
                case 1:
                    return EnumC4431a.DESTROY;
                case 2:
                    return EnumC4431a.STOP;
                case 3:
                    return EnumC4431a.PAUSE;
                case 4:
                    return EnumC4431a.STOP;
                case 5:
                    return EnumC4431a.DESTROY;
                case 6:
                    throw new C4308c("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + enumC4431a + " not yet implemented");
            }
        }
    }

    /* renamed from: gd.c$b */
    /* loaded from: classes3.dex */
    static class b implements Function {
        b() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC4432b apply(EnumC4432b enumC4432b) {
            switch (c.f19250b[enumC4432b.ordinal()]) {
                case 1:
                    return EnumC4432b.DETACH;
                case 2:
                    return EnumC4432b.DESTROY;
                case 3:
                    return EnumC4432b.DESTROY_VIEW;
                case 4:
                    return EnumC4432b.STOP;
                case 5:
                    return EnumC4432b.PAUSE;
                case 6:
                    return EnumC4432b.STOP;
                case 7:
                    return EnumC4432b.DESTROY_VIEW;
                case 8:
                    return EnumC4432b.DESTROY;
                case 9:
                    return EnumC4432b.DETACH;
                case 10:
                    throw new C4308c("Cannot bind to Fragment lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + enumC4432b + " not yet implemented");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gd.c$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f19249a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19250b;

        static {
            int[] iArr = new int[EnumC4432b.values().length];
            f19250b = iArr;
            try {
                iArr[EnumC4432b.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19250b[EnumC4432b.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19250b[EnumC4432b.CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19250b[EnumC4432b.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19250b[EnumC4432b.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19250b[EnumC4432b.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19250b[EnumC4432b.STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19250b[EnumC4432b.DESTROY_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19250b[EnumC4432b.DESTROY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19250b[EnumC4432b.DETACH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[EnumC4431a.values().length];
            f19249a = iArr2;
            try {
                iArr2[EnumC4431a.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19249a[EnumC4431a.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19249a[EnumC4431a.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19249a[EnumC4431a.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19249a[EnumC4431a.STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19249a[EnumC4431a.DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* renamed from: a */
    public static C4307b m18619a(Observable observable) {
        return AbstractC4309d.m18083b(observable, f19247a);
    }

    /* renamed from: b */
    public static C4307b m18620b(Observable observable) {
        return AbstractC4309d.m18083b(observable, f19248b);
    }
}
