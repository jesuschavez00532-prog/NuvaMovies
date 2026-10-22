package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogInterfaceC0301b extends AbstractDialogC0312m implements DialogInterface {

    /* renamed from: c */
    final AlertController f1045c;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.C0297f f1046a;

        /* renamed from: b */
        private final int f1047b;

        public a(Context context) {
            this(context, DialogInterfaceC0301b.m1039f(context, 0));
        }

        /* renamed from: a */
        public DialogInterfaceC0301b m1041a() {
            DialogInterfaceC0301b dialogInterfaceC0301b = new DialogInterfaceC0301b(this.f1046a.f1005a, this.f1047b);
            this.f1046a.m1023a(dialogInterfaceC0301b.f1045c);
            dialogInterfaceC0301b.setCancelable(this.f1046a.f1022r);
            if (this.f1046a.f1022r) {
                dialogInterfaceC0301b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0301b.setOnCancelListener(this.f1046a.f1023s);
            dialogInterfaceC0301b.setOnDismissListener(this.f1046a.f1024t);
            DialogInterface.OnKeyListener onKeyListener = this.f1046a.f1025u;
            if (onKeyListener != null) {
                dialogInterfaceC0301b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0301b;
        }

        /* renamed from: b */
        public Context m1042b() {
            return this.f1046a.f1005a;
        }

        /* renamed from: c */
        public a m1043c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0297f c0297f = this.f1046a;
            c0297f.f1027w = listAdapter;
            c0297f.f1028x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public a m1044d(View view) {
            this.f1046a.f1011g = view;
            return this;
        }

        /* renamed from: e */
        public a m1045e(Drawable drawable) {
            this.f1046a.f1008d = drawable;
            return this;
        }

        /* renamed from: f */
        public a m1046f(DialogInterface.OnKeyListener onKeyListener) {
            this.f1046a.f1025u = onKeyListener;
            return this;
        }

        /* renamed from: g */
        public a m1047g(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0297f c0297f = this.f1046a;
            c0297f.f1027w = listAdapter;
            c0297f.f1028x = onClickListener;
            c0297f.f998I = i10;
            c0297f.f997H = true;
            return this;
        }

        /* renamed from: h */
        public a m1048h(CharSequence charSequence) {
            this.f1046a.f1010f = charSequence;
            return this;
        }

        public a(Context context, int i10) {
            this.f1046a = new AlertController.C0297f(new ContextThemeWrapper(context, DialogInterfaceC0301b.m1039f(context, i10)));
            this.f1047b = i10;
        }
    }

    protected DialogInterfaceC0301b(Context context, int i10) {
        super(context, m1039f(context, i10));
        this.f1045c = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: f */
    static int m1039f(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m1040e() {
        return this.f1045c.m1007d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AbstractDialogC0312m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1045c.m1008e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f1045c.m1009g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f1045c.m1010h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractDialogC0312m, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1045c.m1016q(charSequence);
    }
}
