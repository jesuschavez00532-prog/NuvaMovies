package androidx.activity;

import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f841a;

    /* renamed from: b */
    final ArrayDeque f842b = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements InterfaceC0750d, InterfaceC0283a {

        /* renamed from: a */
        private final AbstractC0749c f843a;

        /* renamed from: b */
        private final AbstractC0284b f844b;

        /* renamed from: c */
        private InterfaceC0283a f845c;

        LifecycleOnBackPressedCancellable(AbstractC0749c abstractC0749c, AbstractC0284b abstractC0284b) {
            this.f843a = abstractC0749c;
            this.f844b = abstractC0284b;
            abstractC0749c.mo3703a(this);
        }

        @Override // androidx.activity.InterfaceC0283a
        public void cancel() {
            this.f843a.mo3705c(this);
            this.f844b.m964e(this);
            InterfaceC0283a interfaceC0283a = this.f845c;
            if (interfaceC0283a != null) {
                interfaceC0283a.cancel();
                this.f845c = null;
            }
        }

        @Override // androidx.lifecycle.InterfaceC0750d
        public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
            if (bVar == AbstractC0749c.b.ON_START) {
                this.f845c = OnBackPressedDispatcher.this.m958b(this.f844b);
                return;
            }
            if (bVar == AbstractC0749c.b.ON_STOP) {
                InterfaceC0283a interfaceC0283a = this.f845c;
                if (interfaceC0283a != null) {
                    interfaceC0283a.cancel();
                    return;
                }
                return;
            }
            if (bVar == AbstractC0749c.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public class C0282a implements InterfaceC0283a {

        /* renamed from: a */
        private final AbstractC0284b f847a;

        C0282a(AbstractC0284b abstractC0284b) {
            this.f847a = abstractC0284b;
        }

        @Override // androidx.activity.InterfaceC0283a
        public void cancel() {
            OnBackPressedDispatcher.this.f842b.remove(this.f847a);
            this.f847a.m964e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f841a = runnable;
    }

    /* renamed from: a */
    public void m957a(InterfaceC0752f interfaceC0752f, AbstractC0284b abstractC0284b) {
        AbstractC0749c mo953f6 = interfaceC0752f.mo953f6();
        if (mo953f6.mo3704b() == AbstractC0749c.c.DESTROYED) {
            return;
        }
        abstractC0284b.m960a(new LifecycleOnBackPressedCancellable(mo953f6, abstractC0284b));
    }

    /* renamed from: b */
    InterfaceC0283a m958b(AbstractC0284b abstractC0284b) {
        this.f842b.add(abstractC0284b);
        C0282a c0282a = new C0282a(abstractC0284b);
        abstractC0284b.m960a(c0282a);
        return c0282a;
    }

    /* renamed from: c */
    public void m959c() {
        Iterator descendingIterator = this.f842b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0284b abstractC0284b = (AbstractC0284b) descendingIterator.next();
            if (abstractC0284b.m962c()) {
                abstractC0284b.mo961b();
                return;
            }
        }
        Runnable runnable = this.f841a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
