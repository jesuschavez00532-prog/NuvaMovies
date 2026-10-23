package p161ha;

import ac.C0205s2;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import anet.channel.request.Request;
import antlr.Version;
import be.C1328x;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.module.p070ui.activity.WebActivity;
import com.module.view.AutoRadioGroup;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.UserFeedBackResult;
import com.request.result.UserInfo;
import com.titans.entity.CdnType;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.common.AgooConstants;
import p132fa.C4300d;
import p170i2.AbstractC4843b;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5095l;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6424s1;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p371vb.C7252a;
import p400xa.AbstractC7598p1;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.c0 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4758c0 extends C7767e implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, DialogInterface.OnKeyListener, InterfaceC6424s1 {

    /* renamed from: M0 */
    public static final a f20101M0 = new a(null);

    /* renamed from: N0 */
    private static ViewOnClickListenerC4758c0 f20102N0;

    /* renamed from: L0 */
    public Map f20109L0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f20103F0 = ViewOnClickListenerC4758c0.class.getSimpleName();

    /* renamed from: G0 */
    private String f20104G0 = "vod";

    /* renamed from: H0 */
    private String f20105H0 = "";

    /* renamed from: I0 */
    private String f20106I0 = "";

    /* renamed from: J0 */
    private String f20107J0 = "";

    /* renamed from: K0 */
    private final C0205s2 f20108K0 = new C0205s2(this);

    /* renamed from: ha.c0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final ViewOnClickListenerC4758c0 m19680a() {
            return ViewOnClickListenerC4758c0.f20102N0;
        }

        /* renamed from: b */
        public final ViewOnClickListenerC4758c0 m19681b(String str, String str2) {
            AbstractC5868k.m23674f(str, "bussinessType");
            AbstractC5868k.m23674f(str2, "programName");
            m19682c(new ViewOnClickListenerC4758c0());
            ViewOnClickListenerC4758c0 m19680a = m19680a();
            AbstractC5868k.m23671c(m19680a);
            m19680a.f20104G0 = str;
            ViewOnClickListenerC4758c0 m19680a2 = m19680a();
            AbstractC5868k.m23671c(m19680a2);
            m19680a2.f20105H0 = str2;
            ViewOnClickListenerC4758c0 m19680a3 = m19680a();
            AbstractC5868k.m23671c(m19680a3);
            return m19680a3;
        }

        /* renamed from: c */
        public final void m19682c(ViewOnClickListenerC4758c0 viewOnClickListenerC4758c0) {
            ViewOnClickListenerC4758c0.f20102N0 = viewOnClickListenerC4758c0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.c0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f20110a = new b();

        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return AbstractC5095l.m20689c(str, AbstractC7786b.m30166j(280), AbstractC7786b.m30166j(280));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.c0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19684a(Bitmap bitmap) {
            ImageView imageView;
            if (bitmap != null && (imageView = (ImageView) ViewOnClickListenerC4758c0.this.m19677L9(R$id.ivVodQrCode)) != null) {
                imageView.setImageBitmap(bitmap);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19684a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.c0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f20112a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m19685a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19685a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: Q9 */
    private final void m19665Q9() {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String customer = null;
        String mobile = null;
        String email = null;
        if (TextUtils.isEmpty(this.f20106I0)) {
            Context m3096J6 = m3096J6();
            Context m3096J62 = m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            AbstractC7598p1.m29244h(m3096J6, m3096J62.getString(R$string.feedback_back_no_selete_tip), 0);
            return;
        }
        if (TextUtils.isEmpty(this.f20105H0)) {
            this.f20105H0 = "empty";
        }
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6887v() != null) {
            UserInfo m6887v = c1466m0.m6887v();
            if (m6887v != null) {
                str = m6887v.getUserId();
            } else {
                str = null;
            }
            if (str != null) {
                String m19666R9 = m19666R9(false);
                AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
                String valueOf = String.valueOf(AbstractC5085b.m20602l(aVar.m24887a()));
                String mo19960i = C4842a.f20329a.m19920a().mo19960i(aVar.m24887a());
                String m20601k = AbstractC5085b.m20601k();
                UserInfo m6887v2 = c1466m0.m6887v();
                if (m6887v2 == null || (email = m6887v2.getEmail()) == null) {
                    str2 = "";
                } else {
                    str2 = email;
                }
                UserInfo m6887v3 = c1466m0.m6887v();
                if (m6887v3 == null || (mobile = m6887v3.getMobile()) == null) {
                    str3 = "";
                } else {
                    str3 = mobile;
                }
                UserInfo m6887v4 = c1466m0.m6887v();
                if (m6887v4 == null || (customer = m6887v4.getCustomer()) == null) {
                    str4 = "";
                } else {
                    str4 = customer;
                }
                String m6888w = c1466m0.m6888w();
                C0205s2 c0205s2 = this.f20108K0;
                String str5 = this.f20106I0;
                String str6 = this.f20105H0;
                AbstractC5868k.m23673e(m20601k, "sysVersion");
                c0205s2.m728b(m19666R9, str5, str2, str3, valueOf, mo19960i, m6888w, m20601k, str6, str4);
            }
        }
        AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.feedback_submit_success), 0);
        mo3278o9();
    }

    /* renamed from: R9 */
    private final String m19666R9(boolean z10) {
        String str = this.f20104G0;
        int hashCode = str.hashCode();
        if (hashCode != 116939) {
            if (hashCode != 3015911) {
                if (hashCode != 3322092 || !str.equals("live")) {
                    return "";
                }
                return Version.subversion;
            }
            if (!str.equals("back") || z10) {
                return "";
            }
            return AgooConstants.ACK_REMOVE_PACKAGE;
        }
        if (!str.equals("vod")) {
            return "";
        }
        return CdnType.DIGITAL_TYPE_PEERSTAR;
    }

    /* renamed from: S9 */
    static /* synthetic */ String m19667S9(ViewOnClickListenerC4758c0 viewOnClickListenerC4758c0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return viewOnClickListenerC4758c0.m19666R9(z10);
    }

    /* renamed from: T9 */
    private final void m19668T9() {
        RadioButton radioButton;
        if (Build.VERSION.SDK_INT == 19) {
            int childCount = ((AutoRadioGroup) m19677L9(R$id.feedback_vod_grp)).getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ((AutoRadioGroup) m19677L9(R$id.feedback_vod_grp)).getChildAt(i10);
                if (childAt instanceof RadioButton) {
                    radioButton = (RadioButton) childAt;
                } else {
                    radioButton = null;
                }
                if (radioButton != null) {
                    radioButton.setButtonDrawable(new ColorDrawable(0));
                }
            }
        }
        ((Button) m19677L9(R$id.vod_feedback_submit)).setOnClickListener(this);
        int i11 = R$id.fb_btn_vod_abnormal_exit;
        ((RadioButton) m19677L9(i11)).setOnCheckedChangeListener(this);
        int i12 = R$id.fb_btn_vod_blank_screen_or_video_not_sync;
        ((RadioButton) m19677L9(i12)).setOnCheckedChangeListener(this);
        int i13 = R$id.fb_btn_vod_audio_and_video_not_sync;
        ((RadioButton) m19677L9(i13)).setOnCheckedChangeListener(this);
        int i14 = R$id.fb_btn_vod_not_play;
        ((RadioButton) m19677L9(i14)).setOnCheckedChangeListener(this);
        int i15 = R$id.fb_btn_vod_repeat_play;
        ((RadioButton) m19677L9(i15)).setOnCheckedChangeListener(this);
        int i16 = R$id.fb_btn_vod_image_resolution_not_suitable;
        ((RadioButton) m19677L9(i16)).setOnCheckedChangeListener(this);
        int i17 = R$id.fb_btn_vod_resolution_too_low;
        ((RadioButton) m19677L9(i17)).setOnCheckedChangeListener(this);
        int i18 = R$id.fb_btn_vod_program_details_error;
        ((RadioButton) m19677L9(i18)).setOnCheckedChangeListener(this);
        int i19 = R$id.fb_btn_sync_error;
        ((RadioButton) m19677L9(i19)).setOnCheckedChangeListener(this);
        int i20 = R$id.fb_btn_vod_others;
        ((RadioButton) m19677L9(i20)).setOnCheckedChangeListener(this);
        ((RadioButton) m19677L9(i11)).setChecked(true);
        ((RadioButton) m19677L9(i12)).setChecked(false);
        ((RadioButton) m19677L9(i13)).setChecked(false);
        ((RadioButton) m19677L9(i14)).setChecked(false);
        ((RadioButton) m19677L9(i15)).setChecked(false);
        ((RadioButton) m19677L9(i16)).setChecked(false);
        ((RadioButton) m19677L9(i17)).setChecked(false);
        ((RadioButton) m19677L9(i18)).setChecked(false);
        ((RadioButton) m19677L9(i19)).setChecked(false);
        ((RadioButton) m19677L9(i20)).setChecked(false);
        RadioButton radioButton2 = (RadioButton) m19677L9(i11);
        AbstractC5868k.m23673e(radioButton2, "fb_btn_vod_abnormal_exit");
        m19671W9(radioButton2);
        RadioButton radioButton3 = (RadioButton) m19677L9(i12);
        AbstractC5868k.m23673e(radioButton3, "fb_btn_vod_blank_screen_or_video_not_sync");
        m19671W9(radioButton3);
        RadioButton radioButton4 = (RadioButton) m19677L9(i13);
        AbstractC5868k.m23673e(radioButton4, "fb_btn_vod_audio_and_video_not_sync");
        m19671W9(radioButton4);
        RadioButton radioButton5 = (RadioButton) m19677L9(i14);
        AbstractC5868k.m23673e(radioButton5, "fb_btn_vod_not_play");
        m19671W9(radioButton5);
        RadioButton radioButton6 = (RadioButton) m19677L9(i15);
        AbstractC5868k.m23673e(radioButton6, "fb_btn_vod_repeat_play");
        m19671W9(radioButton6);
        RadioButton radioButton7 = (RadioButton) m19677L9(i16);
        AbstractC5868k.m23673e(radioButton7, "fb_btn_vod_image_resolution_not_suitable");
        m19671W9(radioButton7);
        RadioButton radioButton8 = (RadioButton) m19677L9(i17);
        AbstractC5868k.m23673e(radioButton8, "fb_btn_vod_resolution_too_low");
        m19671W9(radioButton8);
        RadioButton radioButton9 = (RadioButton) m19677L9(i18);
        AbstractC5868k.m23673e(radioButton9, "fb_btn_vod_program_details_error");
        m19671W9(radioButton9);
        RadioButton radioButton10 = (RadioButton) m19677L9(i19);
        AbstractC5868k.m23673e(radioButton10, "fb_btn_sync_error");
        m19671W9(radioButton10);
        RadioButton radioButton11 = (RadioButton) m19677L9(i20);
        AbstractC5868k.m23673e(radioButton11, "fb_btn_vod_others");
        m19671W9(radioButton11);
        int i21 = R$id.mTvVodHelpCenter;
        ((TextView) m19677L9(i21)).setPaintFlags(8);
        ((TextView) m19677L9(i21)).getPaint().setAntiAlias(true);
        ((TextView) m19677L9(i21)).setOnClickListener(this);
    }

    /* renamed from: U9 */
    private final void m19669U9() {
        ((Button) m19677L9(R$id.vod_feedback_submit)).requestFocus();
    }

    /* renamed from: V9 */
    private final void m19670V9() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        Window window2;
        View decorView;
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window2 = m3280r9.getWindow()) != null && (decorView = window2.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        Dialog m3280r92 = m3280r9();
        Window window3 = null;
        if (m3280r92 != null && (window = m3280r92.getWindow()) != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (layoutParams != null) {
            Dialog m3280r93 = m3280r9();
            if (m3280r93 != null) {
                window3 = m3280r93.getWindow();
            }
            if (window3 != null) {
                window3.setAttributes(layoutParams);
            }
        }
    }

    /* renamed from: W9 */
    private final void m19671W9(final RadioButton radioButton) {
        radioButton.setOnTouchListener(new View.OnTouchListener() { // from class: ha.b0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m19672X9;
                m19672X9 = ViewOnClickListenerC4758c0.m19672X9(radioButton, view, motionEvent);
                return m19672X9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public static final boolean m19672X9(RadioButton radioButton, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(radioButton, "$radioButton");
        if (motionEvent.getAction() == 1) {
            radioButton.setChecked(!radioButton.isChecked());
        }
        return true;
    }

    /* renamed from: Y9 */
    private final void m19673Y9() {
        String str = null;
        String str2 = null;
        String str3 = null;
        GetAuthInfoResultData data;
        String showFlag = null;
        String str4 = "";
        try {
            String encode = URLEncoder.encode(this.f20105H0, Request.DEFAULT_CHARSET);
            AbstractC5868k.m23673e(encode, "encode(mProgramName, \"UTF-8\")");
            str = AbstractC7166t.m27728o(encode, Operator.Operation.PLUS, "%20", false, 4, null);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            str = "";
        }
        C5881x c5881x = C5881x.f23415a;
        Object[] objArr = new Object[10];
        objArr[0] = C4300d.f18678a.m18049o();
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            str2 = C4842a.f20329a.m19920a().mo19960i(m3096J6);
        } else {
            str2 = null;
        }
        objArr[1] = str2;
        C1466m0 c1466m0 = C1466m0.f5627a;
        objArr[2] = c1466m0.m6878m();
        objArr[3] = Locale.getDefault().getLanguage();
        objArr[4] = Integer.valueOf(AbstractC5085b.m20602l(m3096J6()));
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v == null || (str3 = m6887v.getEmail()) == null) {
            str3 = "";
        }
        objArr[5] = str3;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null && (data = m28073h.getData()) != null && (showFlag = data.getShowFlag()) != null) {
            str4 = showFlag;
        }
        objArr[6] = str4;
        objArr[7] = Long.valueOf(new Date().getTime());
        objArr[8] = str;
        objArr[9] = m19667S9(this, false, 1, null);
        String format = String.format("http://%s/#/feedback?appId=%s&userId=%s&lang=%s&appVersion=%s&email=%s&tvType=1&userType=%s&timeStamp=%s&programName=%s&editType=%s", Arrays.copyOf(objArr, 10));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        Observable just = Observable.just(format);
        final b bVar = b.f20110a;
        Observable compose = just.map(new Function() { // from class: ha.y
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m19674Z9;
                m19674Z9 = ViewOnClickListenerC4758c0.m19674Z9(InterfaceC5660l.this, obj);
                return m19674Z9;
            }
        }).compose(m30065N3()).compose(AbstractC7029f.m27120a());
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: ha.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC4758c0.m19675aa(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f20112a;
        compose.subscribe(consumer, new Consumer() { // from class: ha.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC4758c0.m19676ba(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z9 */
    public static final Bitmap m19674Z9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final void m19675aa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m19676ba(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20109L0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public View m19677L9(int i10) {
        View findViewById;
        Map map = this.f20109L0;
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

    @Override // p301qb.InterfaceC6424s1
    /* renamed from: N5 */
    public void mo19678N5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.feedback_dialog_common, viewGroup, false);
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // p301qb.InterfaceC6424s1
    /* renamed from: U0 */
    public void mo19679U0(UserFeedBackResult userFeedBackResult) {
        AbstractC5868k.m23674f(userFeedBackResult, "bean");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m19670V9();
        m19668T9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setOnKeyListener(this);
        }
        m19673Y9();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        AbstractC5868k.m23674f(compoundButton, "buttonView");
        if (z10) {
            if (compoundButton instanceof RadioButton) {
                this.f20106I0 = ((RadioButton) compoundButton).getText().toString();
            }
            this.f20107J0 = compoundButton.getText().toString();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context m3096J6;
        String str = null;
        GetAuthInfoResultData data;
        if (AbstractC5868k.m23669a((Button) m19677L9(R$id.vod_feedback_submit), view)) {
            m19665Q9();
        }
        if (AbstractC5868k.m23669a((TextView) m19677L9(R$id.mTvVodHelpCenter), view) && (m3096J6 = m3096J6()) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("http://");
            sb2.append(C4300d.f18678a.m18049o());
            sb2.append("/#/tv-help?appId=");
            AbstractC4843b m19920a = C4842a.f20329a.m19920a();
            Context m3096J62 = m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            sb2.append(m19920a.mo19960i(m3096J62));
            sb2.append("&lang=");
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("&userType=");
            GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
            if (m28073h == null || (data = m28073h.getData()) == null || (str = data.getUserType()) == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append("&timestamp=");
            sb2.append(new Date().getTime());
            sb2.append("&portalCode=");
            sb2.append(C1466m0.f5627a.m6882q());
            WebActivity.f12115H.m12054a(m3096J6, sb2.toString());
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if (i10 != 21) {
            if (i10 != 22) {
                if (i10 == 82) {
                    Dialog m3280r9 = m3280r9();
                    if (m3280r9 != null) {
                        z12 = m3280r9.isShowing();
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        mo3278o9();
                        return true;
                    }
                }
            } else {
                Dialog m3280r92 = m3280r9();
                if (m3280r92 != null) {
                    z11 = m3280r92.isShowing();
                } else {
                    z11 = false;
                }
                if (z11) {
                    m19669U9();
                    return true;
                }
            }
        } else {
            Dialog m3280r93 = m3280r9();
            if (m3280r93 != null) {
                z10 = m3280r93.isShowing();
            } else {
                z10 = false;
            }
            if (z10) {
                m19669U9();
                return true;
            }
        }
        return false;
    }
}
