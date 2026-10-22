package p102db;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.titans.entity.CdnType;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.Arrays;
import ne.AbstractC5868k;
import ne.C5881x;
import org.android.agoo.common.AgooConstants;
import p201k2.AbstractC5085b;
import p400xa.C7589m1;

/* renamed from: db.w0 */
/* loaded from: classes2.dex */
public final class DialogC4084w0 extends Dialog {

    /* renamed from: a */
    private boolean f17974a;

    /* renamed from: b */
    private final Runnable f17975b;

    /* renamed from: c */
    private a f17976c;

    /* renamed from: db.w0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo17117a(int i10, KeyEvent keyEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4084w0(Context context, boolean z10) {
        super(context, R$style.Dialog_Fullscreen);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17974a = z10;
        setContentView(R$layout.dialog_palyer_feedback);
        this.f17975b = new Runnable() { // from class: db.u0
            @Override // java.lang.Runnable
            public final void run() {
                DialogC4084w0.m17112c(DialogC4084w0.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m17112c(DialogC4084w0 dialogC4084w0) {
        AbstractC5868k.m23674f(dialogC4084w0, "this$0");
        if (dialogC4084w0.isShowing()) {
            dialogC4084w0.dismiss();
        }
    }

    /* renamed from: d */
    private final void m17113d() {
        String m6878m;
        Context context;
        int i10;
        String str;
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
            m6878m = c1466m0.m6888w();
        } else {
            m6878m = c1466m0.m6878m();
        }
        TextView textView = (TextView) findViewById(R$id.mTvAccount);
        C5881x c5881x = C5881x.f23415a;
        String string = getContext().getString(R$string.error_dialog_account);
        AbstractC5868k.m23673e(string, "context.getString(R.string.error_dialog_account)");
        String format = String.format(string, Arrays.copyOf(new Object[]{m6878m}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(format);
        TextView textView2 = (TextView) findViewById(R$id.mTvVersion);
        String string2 = getContext().getString(R$string.error_dialog_version);
        AbstractC5868k.m23673e(string2, "context.getString(R.string.error_dialog_version)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(getContext())}, 1));
        AbstractC5868k.m23673e(format2, "format(format, *args)");
        textView2.setText(format2);
        ((TextView) findViewById(R$id.mTvError)).setText(getContext().getString(R$string.error_code_play_type) + AgooConstants.REPORT_DUPLICATE_FAIL + getContext().getString(R$string.cdn_ec23));
        if (this.f17974a) {
            context = getContext();
            i10 = R$string.vod_menu_player_2;
        } else {
            context = getContext();
            i10 = R$string.vod_menu_player_1;
        }
        String string3 = context.getString(i10);
        AbstractC5868k.m23673e(string3, "if (isJik) context.getSt…string.vod_menu_player_1)");
        ((TextView) findViewById(R$id.mTvPlayer)).setText('(' + string3 + ')');
        if (this.f17974a) {
            str = "Player 2";
        } else {
            str = "Player 1";
        }
        C7589m1.f27886a.m29137f(str);
    }

    /* renamed from: f */
    private final void m17114f() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: db.v0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean m17115g;
                m17115g = DialogC4084w0.m17115g(DialogC4084w0.this, dialogInterface, i10, keyEvent);
                return m17115g;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m17115g(DialogC4084w0 dialogC4084w0, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        a aVar;
        AbstractC5868k.m23674f(dialogC4084w0, "this$0");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (keyEvent.getKeyCode() == 4) {
            dialogC4084w0.dismiss();
            return true;
        }
        if (keyEvent.getKeyCode() != 23 && keyEvent.getKeyCode() != 66) {
            if ((keyEvent.getKeyCode() == 19 || keyEvent.getKeyCode() == 20) && (aVar = dialogC4084w0.f17976c) != null) {
                AbstractC5868k.m23673e(keyEvent, "event");
                aVar.mo17117a(i10, keyEvent);
            }
            dialogC4084w0.dismiss();
            return false;
        }
        int i11 = R$id.mBtnFeedback;
        ((Button) dialogC4084w0.findViewById(i11)).clearFocus();
        ((AutoRelativeLayout) dialogC4084w0.findViewById(R$id.mLayoutFeedback)).setVisibility(8);
        ((TextView) dialogC4084w0.findViewById(R$id.mTvFbSuccess)).setVisibility(0);
        ((Button) dialogC4084w0.findViewById(i11)).removeCallbacks(dialogC4084w0.f17975b);
        ((Button) dialogC4084w0.findViewById(i11)).postDelayed(dialogC4084w0.f17975b, 3000L);
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ((Button) findViewById(R$id.mBtnFeedback)).removeCallbacks(this.f17975b);
        ((AutoRelativeLayout) findViewById(R$id.mLayoutFeedback)).setVisibility(0);
        ((TextView) findViewById(R$id.mTvFbSuccess)).setVisibility(8);
        super.dismiss();
    }

    /* renamed from: e */
    public final void m17116e(a aVar) {
        AbstractC5868k.m23674f(aVar, "iKeyLister");
        this.f17976c = aVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17113d();
        m17114f();
    }
}
