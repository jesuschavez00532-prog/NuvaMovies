package p102db;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.module.view.NetConnectStatusView;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;
import p400xa.C7586l1;
import ua.C7069a;

/* renamed from: db.r0 */
/* loaded from: classes2.dex */
public final class DialogC4072r0 extends Dialog implements C7069a.a {

    /* renamed from: a */
    private final Context f17956a;

    /* renamed from: b */
    private C7069a f17957b;

    /* renamed from: c */
    private b f17958c;

    /* renamed from: db.r0$a */
    /* loaded from: classes2.dex */
    public enum a {
        Route,
        ExtraNet,
        Server
    }

    /* renamed from: db.r0$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo17107a(int i10, KeyEvent keyEvent);

        /* renamed from: b */
        void mo17108b();
    }

    /* renamed from: db.r0$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17963a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Route.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ExtraNet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Server.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17963a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4072r0(Context context) {
        super(context, R$style.Dialog_Fullscreen);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17956a = context;
        setContentView(R$layout.dialog_network_detection);
    }

    /* renamed from: c */
    private final void m17097c() {
        if (this.f17957b == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C7069a c7069a = new C7069a();
            this.f17957b = c7069a;
            c7069a.m27233a(this);
            getContext().registerReceiver(this.f17957b, intentFilter);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m17098e(DialogC4072r0 dialogC4072r0, a aVar, NetConnectStatusView.EnumC3019a enumC3019a, String str, long j10, boolean z10, int i10, Object obj) {
        boolean z11;
        if ((i10 & 4) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        dialogC4072r0.m17104d(aVar, enumC3019a, str2, j11, z11);
    }

    /* renamed from: f */
    private final void m17099f(String str) {
        int i10 = R$id.mTvErrorMsg;
        ((TextView) findViewById(i10)).setVisibility(0);
        ((TextView) findViewById(i10)).setText(str);
    }

    /* renamed from: g */
    private final void m17100g() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        ((ImageView) findViewById(R$id.mIvBox)).setActivated(true);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: db.q0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean m17101h;
                m17101h = DialogC4072r0.m17101h(DialogC4072r0.this, dialogInterface, i10, keyEvent);
                return m17101h;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m17101h(DialogC4072r0 dialogC4072r0, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        b bVar;
        AbstractC5868k.m23674f(dialogC4072r0, "this$0");
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 4) {
                dialogC4072r0.dismiss();
                return true;
            }
            if (keyEvent.getKeyCode() != 23 && keyEvent.getKeyCode() != 66) {
                if ((keyEvent.getKeyCode() == 19 || keyEvent.getKeyCode() == 20) && (bVar = dialogC4072r0.f17958c) != null) {
                    AbstractC5868k.m23673e(keyEvent, "event");
                    bVar.mo17107a(i10, keyEvent);
                }
                dialogC4072r0.dismiss();
            } else {
                if (((Button) dialogC4072r0.findViewById(R$id.mBtnNetFb)).getVisibility() == 0) {
                    C7586l1 c7586l1 = C7586l1.f27877a;
                    Context context = dialogC4072r0.f17956a;
                    String string = context.getString(R$string.nd_fb_suc);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.nd_fb_suc)");
                    C7586l1.m29112f(c7586l1, context, string, 1, 0, 8, null);
                }
                dialogC4072r0.dismiss();
            }
        }
        return false;
    }

    /* renamed from: j */
    private final void m17102j() {
        if (this.f17957b != null) {
            try {
                getContext().unregisterReceiver(this.f17957b);
            } catch (Exception unused) {
                this.f17957b = null;
            }
        }
    }

    /* renamed from: b */
    public final Context m17103b() {
        return this.f17956a;
    }

    /* renamed from: d */
    public final void m17104d(a aVar, NetConnectStatusView.EnumC3019a enumC3019a, String str, long j10, boolean z10) {
        boolean z11;
        String string;
        boolean z12;
        boolean z13;
        AbstractC5868k.m23674f(aVar, "channel");
        AbstractC5868k.m23674f(enumC3019a, "state");
        AbstractC5868k.m23674f(str, "errCode");
        ((TextView) findViewById(R$id.mTvErrorMsg)).setVisibility(4);
        int i10 = c.f17963a[aVar.ordinal()];
        boolean z14 = false;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ImageView imageView = (ImageView) findViewById(R$id.mIvServer);
                    if (enumC3019a == NetConnectStatusView.EnumC3019a.Connected) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    imageView.setActivated(z13);
                    ((NetConnectStatusView) findViewById(R$id.mConnectingViewServer)).m12231a(enumC3019a, j10);
                    if (z10) {
                        if (enumC3019a == NetConnectStatusView.EnumC3019a.Error) {
                            int i11 = R$id.mBtnNetFb;
                            ((Button) findViewById(i11)).setVisibility(0);
                            ((Button) findViewById(i11)).requestFocusFromTouch();
                            ((Button) findViewById(i11)).requestFocus();
                            string = str + this.f17956a.getString(R$string.cdn_ea7_2);
                        } else {
                            string = str + this.f17956a.getString(R$string.cdn_ea7);
                        }
                    }
                }
                string = "";
            } else {
                ImageView imageView2 = (ImageView) findViewById(R$id.mIvExtraNet);
                if (enumC3019a == NetConnectStatusView.EnumC3019a.Connected) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageView2.setActivated(z12);
                ((NetConnectStatusView) findViewById(R$id.mConnectingViewExtraNet)).m12231a(enumC3019a, j10);
                if (enumC3019a == NetConnectStatusView.EnumC3019a.Error) {
                    string = getContext().getString(R$string.network_detection_check_network);
                    AbstractC5868k.m23673e(string, "context.getString(R.stri…_detection_check_network)");
                }
                string = "";
            }
        } else {
            ImageView imageView3 = (ImageView) findViewById(R$id.mIvRoute);
            if (enumC3019a == NetConnectStatusView.EnumC3019a.Connected) {
                z11 = true;
            } else {
                z11 = false;
            }
            imageView3.setActivated(z11);
            ((NetConnectStatusView) findViewById(R$id.mConnectingViewRoute)).m12231a(enumC3019a, j10);
            if (enumC3019a == NetConnectStatusView.EnumC3019a.Error) {
                string = getContext().getString(R$string.network_detection_check_router);
                AbstractC5868k.m23673e(string, "context.getString(R.stri…k_detection_check_router)");
            }
            string = "";
        }
        if (string.length() > 0) {
            z14 = true;
        }
        if (z14) {
            m17099f(string);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m17102j();
        super.dismiss();
    }

    @Override // ua.C7069a.a
    /* renamed from: e5 */
    public void mo16596e5(int i10) {
    }

    /* renamed from: i */
    public final void m17105i(b bVar) {
        AbstractC5868k.m23674f(bVar, "iNetConnectChanged");
        this.f17958c = bVar;
    }

    @Override // ua.C7069a.a
    /* renamed from: o1 */
    public void mo16601o1(NetworkInfo networkInfo) {
        ((TextView) findViewById(R$id.mTvErrorMsg)).setVisibility(4);
        ((Button) findViewById(R$id.mBtnNetFb)).setVisibility(4);
        b bVar = this.f17958c;
        if (bVar != null) {
            bVar.mo17108b();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17100g();
        m17097c();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m17102j();
    }
}
