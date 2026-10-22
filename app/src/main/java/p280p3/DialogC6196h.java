package p280p3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.download.R$id;
import com.download.R$layout;
import com.download.R$string;
import com.download.R$style;
import com.download.bean.LocalPlayBean;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.C3384f;
import java.util.Arrays;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.C5881x;
import p142g3.RunnableC4341c;
import p433zd.AbstractC7786b;

/* renamed from: p3.h */
/* loaded from: classes.dex */
public final class DialogC6196h extends Dialog {

    /* renamed from: f */
    public static final a f24363f = new a(null);

    /* renamed from: a */
    private final int f24364a;

    /* renamed from: b */
    private final InterfaceC5664p f24365b;

    /* renamed from: c */
    private final Progress f24366c;

    /* renamed from: d */
    private final RunnableC4341c f24367d;

    /* renamed from: e */
    private final LocalPlayBean f24368e;

    /* renamed from: p3.h$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    public /* synthetic */ DialogC6196h(Context context, int i10, InterfaceC5664p interfaceC5664p, Progress progress, RunnableC4341c runnableC4341c, LocalPlayBean localPlayBean, int i11, AbstractC5864g abstractC5864g) {
        this(context, i10, interfaceC5664p, (i11 & 8) != 0 ? null : progress, (i11 & 16) != 0 ? null : runnableC4341c, (i11 & 32) != 0 ? null : localPlayBean);
    }

    /* renamed from: c */
    private final void m24738c() {
        int i10;
        int i11 = R$id.mBtCancel;
        ((Button) findViewById(i11)).setVisibility(0);
        int i12 = this.f24364a;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        ((TextView) findViewById(R$id.mTvTitle)).setText(getContext().getString(R$string.download_storage_insufficient));
                        ((Button) findViewById(i11)).setVisibility(8);
                    }
                } else {
                    ((TextView) findViewById(R$id.mTvTitle)).setText(getContext().getString(R$string.download_failed));
                    ((Button) findViewById(i11)).setVisibility(8);
                }
            } else {
                TextView textView = (TextView) findViewById(R$id.mTvTitle);
                C5881x c5881x = C5881x.f23415a;
                String string = getContext().getString(R$string.download_ensure_delete);
                AbstractC5868k.m23673e(string, "context.getString(R.string.download_ensure_delete)");
                Object[] objArr = new Object[1];
                Progress progress = this.f24366c;
                if (progress != null) {
                    long j10 = progress.totalSize;
                    if (j10 != 0) {
                        i10 = (int) ((progress.currentSize * 100) / j10);
                        objArr[0] = Integer.valueOf(i10);
                        String format = String.format(string, Arrays.copyOf(objArr, 1));
                        AbstractC5868k.m23673e(format, "format(format, *args)");
                        textView.setText(format);
                    }
                }
                i10 = 0;
                objArr[0] = Integer.valueOf(i10);
                String format2 = String.format(string, Arrays.copyOf(objArr, 1));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                textView.setText(format2);
            }
        } else {
            ((TextView) findViewById(R$id.mTvTitle)).setText(getContext().getString(R$string.download_delete_exist_video));
        }
        ((Button) findViewById(R$id.mBtConfirm)).setOnClickListener(new View.OnClickListener() { // from class: p3.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC6196h.m24739d(DialogC6196h.this, view);
            }
        });
        ((Button) findViewById(i11)).setOnClickListener(new View.OnClickListener() { // from class: p3.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC6196h.m24740e(DialogC6196h.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m24739d(DialogC6196h dialogC6196h, View view) {
        AbstractC5868k.m23674f(dialogC6196h, "this$0");
        dialogC6196h.dismiss();
        dialogC6196h.f24365b.mo2391h(dialogC6196h.f24367d, dialogC6196h.f24368e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m24740e(DialogC6196h dialogC6196h, View view) {
        AbstractC5868k.m23674f(dialogC6196h, "this$0");
        dialogC6196h.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_download_tip);
        m24738c();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30166j(660));
            window.setGravity(17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6196h(Context context, int i10, InterfaceC5664p interfaceC5664p, Progress progress, RunnableC4341c runnableC4341c, LocalPlayBean localPlayBean) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(interfaceC5664p, "callback");
        this.f24364a = i10;
        this.f24365b = interfaceC5664p;
        this.f24366c = progress;
        this.f24367d = runnableC4341c;
        this.f24368e = localPlayBean;
    }
}
