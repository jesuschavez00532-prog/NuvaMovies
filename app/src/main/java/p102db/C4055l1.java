package p102db;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: db.l1 */
/* loaded from: classes2.dex */
public final class C4055l1 extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: H0 */
    public static final a f17924H0 = new a(null);

    /* renamed from: C0 */
    private final Context f17925C0;

    /* renamed from: D0 */
    private final String f17926D0;

    /* renamed from: E0 */
    private final long f17927E0;

    /* renamed from: F0 */
    private final b f17928F0;

    /* renamed from: G0 */
    public Map f17929G0;

    /* renamed from: db.l1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C4055l1 m17082a(Context context, String str, long j10) {
            AbstractActivityC0302c abstractActivityC0302c;
            AbstractC0729o m3294d4;
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(str, "text");
            C4055l1 c4055l1 = new C4055l1(context, str, j10);
            if (context instanceof AbstractActivityC0302c) {
                abstractActivityC0302c = (AbstractActivityC0302c) context;
            } else {
                abstractActivityC0302c = null;
            }
            if (abstractActivityC0302c != null && (m3294d4 = abstractActivityC0302c.m3294d4()) != null) {
                c4055l1.mo3277E9(m3294d4, "reserve_match_dialog");
            }
            return c4055l1;
        }
    }

    /* renamed from: db.l1$b */
    /* loaded from: classes2.dex */
    public static final class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC5868k.m23674f(message, "msg");
            super.handleMessage(message);
            C4055l1.this.mo3279p9();
        }
    }

    public C4055l1(Context context, String str, long j10) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(str, "text");
        this.f17929G0 = new LinkedHashMap();
        this.f17925C0 = context;
        this.f17926D0 = str;
        this.f17927E0 = j10;
        this.f17928F0 = new b();
    }

    /* renamed from: I9 */
    private final void m17077I9() {
        this.f17928F0.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J9 */
    public static final boolean m17078J9(C4055l1 c4055l1, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c4055l1, "this$0");
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            c4055l1.m17077I9();
            c4055l1.mo3278o9();
            return true;
        }
        return true;
    }

    /* renamed from: K9 */
    private final void m17079K9() {
        this.f17928F0.sendEmptyMessageDelayed(1, this.f17927E0);
    }

    /* renamed from: G9 */
    public void m17080G9() {
        this.f17929G0.clear();
    }

    /* renamed from: H9 */
    public View m17081H9(int i10) {
        View findViewById;
        Map map = this.f17929G0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.LoadingDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_toast_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m17080G9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        ((TextView) m17081H9(R$id.mToastText)).setText(this.f17926D0);
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: db.k1
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean m17078J9;
                    m17078J9 = C4055l1.m17078J9(C4055l1.this, dialogInterface, i10, keyEvent);
                    return m17078J9;
                }
            });
        }
        m17079K9();
    }
}
