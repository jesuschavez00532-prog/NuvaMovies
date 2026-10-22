package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R$layout;
import androidx.appcompat.app.DialogInterfaceC0301b;
import androidx.appcompat.view.menu.InterfaceC0330j;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0326f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0330j.a {

    /* renamed from: a */
    private C0325e f1354a;

    /* renamed from: b */
    private DialogInterfaceC0301b f1355b;

    /* renamed from: c */
    C0323c f1356c;

    /* renamed from: d */
    private InterfaceC0330j.a f1357d;

    public DialogInterfaceOnKeyListenerC0326f(C0325e c0325e) {
        this.f1354a = c0325e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
    /* renamed from: a */
    public void mo1162a(C0325e c0325e, boolean z10) {
        if (z10 || c0325e == this.f1354a) {
            m1378c();
        }
        InterfaceC0330j.a aVar = this.f1357d;
        if (aVar != null) {
            aVar.mo1162a(c0325e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
    /* renamed from: b */
    public boolean mo1163b(C0325e c0325e) {
        InterfaceC0330j.a aVar = this.f1357d;
        if (aVar != null) {
            return aVar.mo1163b(c0325e);
        }
        return false;
    }

    /* renamed from: c */
    public void m1378c() {
        DialogInterfaceC0301b dialogInterfaceC0301b = this.f1355b;
        if (dialogInterfaceC0301b != null) {
            dialogInterfaceC0301b.dismiss();
        }
    }

    /* renamed from: d */
    public void m1379d(IBinder iBinder) {
        C0325e c0325e = this.f1354a;
        DialogInterfaceC0301b.a aVar = new DialogInterfaceC0301b.a(c0325e.m1372u());
        C0323c c0323c = new C0323c(aVar.m1042b(), R$layout.abc_list_menu_item_layout);
        this.f1356c = c0323c;
        c0323c.mo1281f(this);
        this.f1354a.m1355b(this.f1356c);
        aVar.m1043c(this.f1356c.m1314h(), this);
        View m1376y = c0325e.m1376y();
        if (m1376y != null) {
            aVar.m1044d(m1376y);
        } else {
            aVar.m1045e(c0325e.m1374w()).m1048h(c0325e.m1375x());
        }
        aVar.m1046f(this);
        DialogInterfaceC0301b m1041a = aVar.m1041a();
        this.f1355b = m1041a;
        m1041a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1355b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1355b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1354a.m1340L((C0327g) this.f1356c.m1314h().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1356c.mo1277a(this.f1354a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1355b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1355b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1354a.m1360e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1354a.performShortcut(i10, keyEvent, 0);
    }
}
