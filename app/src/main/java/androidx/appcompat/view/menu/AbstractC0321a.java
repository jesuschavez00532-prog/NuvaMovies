package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.view.menu.InterfaceC0331k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0321a implements InterfaceC0330j {

    /* renamed from: a */
    protected Context f1263a;

    /* renamed from: b */
    protected Context f1264b;

    /* renamed from: c */
    protected C0325e f1265c;

    /* renamed from: d */
    protected LayoutInflater f1266d;

    /* renamed from: e */
    protected LayoutInflater f1267e;

    /* renamed from: f */
    private InterfaceC0330j.a f1268f;

    /* renamed from: g */
    private int f1269g;

    /* renamed from: h */
    private int f1270h;

    /* renamed from: i */
    protected InterfaceC0331k f1271i;

    /* renamed from: j */
    private int f1272j;

    public AbstractC0321a(Context context, int i10, int i11) {
        this.f1263a = context;
        this.f1266d = LayoutInflater.from(context);
        this.f1269g = i10;
        this.f1270h = i11;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: a */
    public void mo1277a(C0325e c0325e, boolean z10) {
        InterfaceC0330j.a aVar = this.f1268f;
        if (aVar != null) {
            aVar.mo1162a(c0325e, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: b */
    public void mo1278b(boolean z10) {
        C0327g c0327g;
        ViewGroup viewGroup = (ViewGroup) this.f1271i;
        if (viewGroup == null) {
            return;
        }
        C0325e c0325e = this.f1265c;
        int i10 = 0;
        if (c0325e != null) {
            c0325e.m1369r();
            ArrayList m1333E = this.f1265c.m1333E();
            int size = m1333E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                C0327g c0327g2 = (C0327g) m1333E.get(i12);
                if (mo1292q(i11, c0327g2)) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof InterfaceC0331k.a) {
                        c0327g = ((InterfaceC0331k.a) childAt).getItemData();
                    } else {
                        c0327g = null;
                    }
                    View mo1289n = mo1289n(c0327g2, childAt, viewGroup);
                    if (c0327g2 != c0327g) {
                        mo1289n.setPressed(false);
                        mo1289n.jumpDrawablesToCurrentState();
                    }
                    if (mo1289n != childAt) {
                        m1283h(mo1289n, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!mo1287l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: d */
    public boolean mo1279d(C0325e c0325e, C0327g c0327g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: e */
    public boolean mo1280e(C0325e c0325e, C0327g c0327g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: f */
    public void mo1281f(InterfaceC0330j.a aVar) {
        this.f1268f = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: g */
    public void mo1282g(Context context, C0325e c0325e) {
        this.f1264b = context;
        this.f1267e = LayoutInflater.from(context);
        this.f1265c = c0325e;
    }

    /* renamed from: h */
    protected void m1283h(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1271i).addView(view, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: i */
    public boolean mo1284i(SubMenuC0333m subMenuC0333m) {
        InterfaceC0330j.a aVar = this.f1268f;
        SubMenuC0333m subMenuC0333m2 = subMenuC0333m;
        if (aVar != null) {
            if (subMenuC0333m == null) {
                subMenuC0333m2 = this.f1265c;
            }
            return aVar.mo1163b(subMenuC0333m2);
        }
        return false;
    }

    /* renamed from: j */
    public abstract void mo1285j(C0327g c0327g, InterfaceC0331k.a aVar);

    /* renamed from: k */
    public InterfaceC0331k.a m1286k(ViewGroup viewGroup) {
        return (InterfaceC0331k.a) this.f1266d.inflate(this.f1270h, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1287l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* renamed from: m */
    public InterfaceC0330j.a m1288m() {
        return this.f1268f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public View mo1289n(C0327g c0327g, View view, ViewGroup viewGroup) {
        InterfaceC0331k.a aVar;
        if (view instanceof InterfaceC0331k.a) {
            aVar = (InterfaceC0331k.a) view;
        } else {
            aVar = m1286k(viewGroup);
        }
        mo1285j(c0327g, aVar);
        return (View) aVar;
    }

    /* renamed from: o */
    public InterfaceC0331k mo1290o(ViewGroup viewGroup) {
        if (this.f1271i == null) {
            InterfaceC0331k interfaceC0331k = (InterfaceC0331k) this.f1266d.inflate(this.f1269g, viewGroup, false);
            this.f1271i = interfaceC0331k;
            interfaceC0331k.mo1270b(this.f1265c);
            mo1278b(true);
        }
        return this.f1271i;
    }

    /* renamed from: p */
    public void m1291p(int i10) {
        this.f1272j = i10;
    }

    /* renamed from: q */
    public abstract boolean mo1292q(int i10, C0327g c0327g);
}
