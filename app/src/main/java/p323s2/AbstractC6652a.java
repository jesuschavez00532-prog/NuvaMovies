package p323s2;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import java.lang.reflect.Field;
import p231m2.AbstractC5584b;

/* renamed from: s2.a */
/* loaded from: classes.dex */
public abstract class AbstractC6652a {

    /* renamed from: s2.a$a */
    /* loaded from: classes.dex */
    private static class a extends Handler {

        /* renamed from: a */
        private final Handler f25507a;

        public a(Handler handler) {
            super(handler.getLooper());
            this.f25507a = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Handler handler = this.f25507a;
            if (handler != null) {
                try {
                    handler.handleMessage(message);
                } catch (WindowManager.BadTokenException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25971a(Toast toast) {
        if (Build.VERSION.SDK_INT >= 26) {
            return;
        }
        try {
            Field declaredField = toast.getClass().getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
            declaredField2.setAccessible(true);
            Handler handler = (Handler) declaredField2.get(obj);
            if (handler instanceof a) {
                return;
            }
            declaredField2.set(obj, new a(handler));
        } catch (Exception e10) {
            e10.printStackTrace();
            AbstractC5584b.m22679a(e10, "FIX TOAST FAIL");
        }
    }
}
