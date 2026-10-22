package p322s1;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p184j1.C4977h;
import p184j1.EnumC4972c;
import p184j1.InterfaceC4980k;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5571d;

/* renamed from: s1.b */
/* loaded from: classes.dex */
public class C6614b implements InterfaceC4980k {

    /* renamed from: a */
    private final InterfaceC5571d f25416a;

    /* renamed from: b */
    private final InterfaceC4980k f25417b;

    public C6614b(InterfaceC5571d interfaceC5571d, InterfaceC4980k interfaceC4980k) {
        this.f25416a = interfaceC5571d;
        this.f25417b = interfaceC4980k;
    }

    @Override // p184j1.InterfaceC4980k
    /* renamed from: a */
    public EnumC4972c mo20331a(C4977h c4977h) {
        return this.f25417b.mo20331a(c4977h);
    }

    @Override // p184j1.InterfaceC4973d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo20315b(InterfaceC5335v interfaceC5335v, File file, C4977h c4977h) {
        return this.f25417b.mo20315b(new C6624g(((BitmapDrawable) interfaceC5335v.get()).getBitmap(), this.f25416a), file, c4977h);
    }
}
