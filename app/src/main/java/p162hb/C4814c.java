package p162hb;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import com.lzy.okgo.model.Progress;
import com.module.p069db.UmengPush;
import com.taobao.accs.common.Constants;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.R$style;
import com.vod.p089ui.activity.VodDetailsActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p400xa.C7589m1;
import p400xa.C7619y;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: hb.c */
/* loaded from: classes2.dex */
public final class C4814c extends C7767e {

    /* renamed from: G0 */
    private View f20283G0;

    /* renamed from: H0 */
    private UmengPush f20284H0;

    /* renamed from: I0 */
    public Map f20285I0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f20282F0 = C4814c.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hb.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ UmengPush f20286a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(UmengPush umengPush) {
            super(1);
            this.f20286a = umengPush;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f20286a.getContentId());
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_type", this.f20286a.getType());
            Intent putExtra = intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29168f());
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…gEventVodKey.CH_PLAY_VOD)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public static final void m19892L9(C4814c c4814c, View view) {
        AbstractC5868k.m23674f(c4814c, "this$0");
        UmengPush umengPush = c4814c.f20284H0;
        if (umengPush != null) {
            c4814c.m19897O9(umengPush);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final void m19893M9(C4814c c4814c, View view) {
        AbstractC5868k.m23674f(c4814c, "this$0");
        c4814c.mo3278o9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20285I0.clear();
    }

    /* renamed from: J9 */
    public View m19894J9(int i10) {
        View findViewById;
        Map map = this.f20285I0;
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

    /* renamed from: K9 */
    public final void m19895K9() {
        ((Button) m19894J9(R$id.mBtnToWatch)).setOnClickListener(new View.OnClickListener() { // from class: hb.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4814c.m19892L9(C4814c.this, view);
            }
        });
        ((Button) m19894J9(R$id.mBtnToReturn)).setOnClickListener(new View.OnClickListener() { // from class: hb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4814c.m19893M9(C4814c.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: N9 */
    public final void m19896N9(AbstractC0729o abstractC0729o, String str, UmengPush umengPush) {
        AbstractC5868k.m23674f(abstractC0729o, "manager");
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        super.mo3277E9(abstractC0729o, str);
        this.f20284H0 = umengPush;
    }

    /* renamed from: O9 */
    public final void m19897O9(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, "bean");
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            C7619y.m29367d(C7619y.f28056a, m3096J6, VodDetailsActivity.class, null, new a(umengPush), 2, null);
        }
        mo3278o9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_msg_push_program, viewGroup, false);
        this.f20283G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: W0 */
    public final void m19898W0() {
        String str;
        String text;
        UmengPush umengPush = this.f20284H0;
        if (umengPush != null) {
            AbstractC5868k.m23671c(umengPush);
            if (AbstractC5868k.m23669a(umengPush.getType(), "1")) {
                ((TextView) m19894J9(R$id.mDialogTitle)).setText(m3172j7(R$string.push_program_title));
            } else {
                ((TextView) m19894J9(R$id.mDialogTitle)).setText(m3172j7(R$string.push_dram_title));
            }
            TextView textView = (TextView) m19894J9(R$id.mProgramTitle);
            UmengPush umengPush2 = this.f20284H0;
            String str2 = "";
            if (umengPush2 == null || (str = umengPush2.getTitle()) == null) {
                str = "";
            }
            textView.setText(str);
            TextView textView2 = (TextView) m19894J9(R$id.mProgramUpdateContent);
            UmengPush umengPush3 = this.f20284H0;
            if (umengPush3 != null && (text = umengPush3.getText()) != null) {
                str2 = text;
            }
            textView2.setText(str2);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        Window window;
        super.mo3170i8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            window = m3280r9.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = AbstractC7786b.m30166j(980);
            int m30163g = AbstractC7786b.m30163g(580);
            attributes.height = m30163g;
            window.setLayout(attributes.width, m30163g);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        m19895K9();
        m19898W0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: o9 */
    public void mo3278o9() {
        super.mo3278o9();
    }
}
