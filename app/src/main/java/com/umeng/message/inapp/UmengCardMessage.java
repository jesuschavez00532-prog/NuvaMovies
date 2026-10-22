package com.umeng.message.inapp;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.C3553a;
import com.umeng.message.proguard.C3564aj;
import com.umeng.message.proguard.C3597bo;
import com.umeng.message.proguard.C3600br;
import com.umeng.message.proguard.C3678f;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class UmengCardMessage extends DialogFragment {

    /* renamed from: b */
    private static final String f15815b = "com.umeng.message.inapp.UmengCardMessage";

    /* renamed from: a */
    public IUmengInAppMsgCloseCallback f15816a;

    /* renamed from: c */
    private Activity f15817c;

    /* renamed from: d */
    private UInAppMessage f15818d;

    /* renamed from: e */
    private String f15819e;

    /* renamed from: f */
    private Bitmap f15820f;

    /* renamed from: g */
    private ViewGroup f15821g;

    /* renamed from: h */
    private int f15822h;

    /* renamed from: i */
    private int f15823i;

    /* renamed from: j */
    private int f15824j;

    /* renamed from: k */
    private int f15825k;

    /* renamed from: l */
    private UInAppHandler f15826l;

    /* renamed from: m */
    private boolean f15827m = false;

    /* renamed from: n */
    private boolean f15828n = false;

    /* renamed from: o */
    private boolean f15829o = false;

    /* renamed from: p */
    private boolean f15830p = false;

    /* renamed from: q */
    private String[] f15831q = {"18", "16", "16"};

    /* renamed from: a */
    static /* synthetic */ boolean m15224a(UmengCardMessage umengCardMessage) {
        umengCardMessage.f15828n = true;
        return true;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m15228e(UmengCardMessage umengCardMessage) {
        umengCardMessage.f15830p = true;
        return true;
    }

    /* renamed from: f */
    static /* synthetic */ boolean m15229f(UmengCardMessage umengCardMessage) {
        umengCardMessage.f15829o = true;
        return true;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        RelativeLayout.LayoutParams layoutParams;
        super.onConfigurationChanged(configuration);
        if (this.f15821g != null) {
            if (configuration.orientation == 1) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            int m15440a = C3597bo.m15440a(30.0f);
            int m15440a2 = C3597bo.m15440a(15.0f);
            layoutParams.setMargins(m15440a, m15440a2, m15440a, m15440a2);
            layoutParams.addRule(13);
            this.f15821g.setLayoutParams(layoutParams);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.NoTitleBar);
        setRetainInstance(true);
        try {
            this.f15817c = getActivity();
            Bundle arguments = getArguments();
            this.f15818d = new UInAppMessage(new JSONObject(arguments.getString("msg")));
            this.f15819e = arguments.getString("label");
            byte[] byteArray = arguments.getByteArray("bitmapByte");
            if (byteArray != null) {
                this.f15820f = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            this.f15826l = InAppMessageManager.getInstance(this.f15817c).getInAppHandler();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        int i10 = this.f15818d.msg_type;
        if (i10 == 5 || i10 == 6) {
            String m15214a = InAppMessageManager.getInstance(this.f15817c).m15214a("KEY_PLAIN_TEXT_SIZE", "");
            if (!TextUtils.isEmpty(m15214a)) {
                strArr = m15214a.split(",");
            } else {
                strArr = null;
            }
            if (strArr != null) {
                this.f15831q = strArr;
            }
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Rect rect;
        RelativeLayout.LayoutParams layoutParams;
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int height = rect.height() - C3597bo.m15440a(65.0f);
            this.f15823i = height;
            double d10 = height;
            Double.isNaN(d10);
            this.f15822h = (int) (d10 * 1.2d);
            int width = rect.width() - C3597bo.m15440a(70.0f);
            this.f15824j = width;
            this.f15825k = (width / 2) * 3;
        } else {
            rect = null;
        }
        int i10 = this.f15818d.msg_type;
        if (i10 == 2 || i10 == 3) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f15817c);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.setBackgroundColor(Color.parseColor("#33000000"));
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            } else if (this.f15818d.msg_type == 2) {
                layoutParams = new RelativeLayout.LayoutParams(this.f15822h, this.f15823i);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            int m15440a = C3597bo.m15440a(30.0f);
            int m15440a2 = C3597bo.m15440a(15.0f);
            layoutParams.setMargins(m15440a, m15440a2, m15440a, m15440a2);
            layoutParams.addRule(13);
            FrameLayout frameLayout = new FrameLayout(this.f15817c);
            this.f15821g = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int m15440a3 = C3597bo.m15440a(12.0f);
            layoutParams2.setMargins(m15440a3, m15440a3, m15440a3, m15440a3);
            ImageView imageView = new ImageView(this.f15817c);
            imageView.setLayoutParams(layoutParams2);
            imageView.setAdjustViewBounds(true);
            imageView.setId(C3678f.m15740a());
            imageView.setImageBitmap(this.f15820f);
            this.f15821g.addView(imageView);
            int m15440a4 = C3597bo.m15440a(24.0f);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m15440a4, m15440a4, 5);
            C3600br c3600br = new C3600br(this.f15817c);
            c3600br.setLayoutParams(layoutParams3);
            this.f15821g.addView(c3600br);
            relativeLayout.addView(this.f15821g);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.m15224a(UmengCardMessage.this);
                    if (TextUtils.equals("none", UmengCardMessage.this.f15818d.action_type)) {
                        return;
                    }
                    UmengCardMessage.this.f15826l.handleInAppMessage(UmengCardMessage.this.f15817c, UmengCardMessage.this.f15818d, 16);
                    UmengCardMessage.this.dismiss();
                }
            });
            c3600br.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.m15228e(UmengCardMessage.this);
                    UmengCardMessage.this.dismiss();
                }
            });
            return relativeLayout;
        }
        if (i10 == 4) {
            View inflate = layoutInflater.inflate(C3553a.m15272a("umeng_custom_card_message"), viewGroup, false);
            ImageView imageView2 = (ImageView) inflate.findViewById(C3553a.m15274b("umeng_card_message_image"));
            Button button = (Button) inflate.findViewById(C3553a.m15274b("umeng_card_message_ok"));
            Button button2 = (Button) inflate.findViewById(C3553a.m15274b("umeng_card_message_close"));
            imageView2.setImageBitmap(this.f15820f);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.m15224a(UmengCardMessage.this);
                    if (TextUtils.equals("none", UmengCardMessage.this.f15818d.action_type)) {
                        return;
                    }
                    UmengCardMessage.this.f15826l.handleInAppMessage(UmengCardMessage.this.f15817c, UmengCardMessage.this.f15818d, 16);
                    UmengCardMessage.this.dismiss();
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.m15229f(UmengCardMessage.this);
                    if (TextUtils.equals("none", UmengCardMessage.this.f15818d.action_type)) {
                        return;
                    }
                    UmengCardMessage.this.f15826l.handleInAppMessage(UmengCardMessage.this.f15817c, UmengCardMessage.this.f15818d, 19);
                    UmengCardMessage.this.dismiss();
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.m15228e(UmengCardMessage.this);
                    UmengCardMessage.this.dismiss();
                }
            });
            return inflate;
        }
        if ((i10 != 5 && i10 != 6) || rect == null) {
            return null;
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(this.f15817c);
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout2.setBackgroundColor(Color.parseColor("#33000000"));
        if (getResources().getConfiguration().orientation == 1) {
            int width2 = rect.width() - C3597bo.m15440a(70.0f);
            this.f15824j = width2;
            if (this.f15818d.msg_type == 5) {
                this.f15825k = (width2 / 6) * 5;
            } else {
                this.f15825k = (width2 / 2) * 3;
            }
        } else {
            int height2 = rect.height() - C3597bo.m15440a(65.0f);
            this.f15825k = height2;
            this.f15824j = (height2 / 5) * 6;
        }
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.f15824j, this.f15825k);
        layoutParams4.addRule(13);
        LinearLayout linearLayout = new LinearLayout(this.f15817c);
        linearLayout.setLayoutParams(layoutParams4);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int m15440a5 = C3597bo.m15440a(20.0f);
        layoutParams5.setMargins(m15440a5, m15440a5, m15440a5, m15440a5);
        TextView textView = new TextView(this.f15817c);
        textView.setLayoutParams(layoutParams5);
        textView.setGravity(17);
        textView.setText(this.f15818d.title);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView.setTextSize(Integer.parseInt(this.f15831q[0]));
        textView.setTextColor(Color.parseColor("#000000"));
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams6.setMargins(m15440a5, 0, m15440a5, 0);
        layoutParams6.weight = 1.0f;
        ScrollView scrollView = new ScrollView(this.f15817c);
        scrollView.setLayoutParams(layoutParams6);
        scrollView.setScrollBarStyle(16777216);
        scrollView.setVerticalScrollBarEnabled(false);
        TextView textView2 = new TextView(this.f15817c);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setText(this.f15818d.content);
        textView2.setTextSize(Integer.parseInt(this.f15831q[1]));
        textView2.setTextColor(Color.parseColor("#000000"));
        scrollView.addView(textView2);
        linearLayout.addView(scrollView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(C3597bo.m15440a(1.0f), Color.parseColor("#D8D8D8"));
        gradientDrawable.setCornerRadius(20.0f);
        gradientDrawable.setColor(-1);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, C3597bo.m15440a(35.0f));
        layoutParams7.setMargins(m15440a5, C3597bo.m15440a(30.0f), m15440a5, m15440a5);
        TextView textView3 = new TextView(this.f15817c);
        textView3.setLayoutParams(layoutParams7);
        textView3.setGravity(17);
        textView3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        textView3.setText(this.f15818d.button_text);
        textView3.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView3.setTextSize(Integer.parseInt(this.f15831q[2]));
        textView3.setTextColor(Color.parseColor("#000000"));
        textView3.setBackgroundDrawable(gradientDrawable);
        linearLayout.addView(textView3);
        relativeLayout2.addView(linearLayout);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmengCardMessage.m15224a(UmengCardMessage.this);
                UmengCardMessage.this.f15826l.handleInAppMessage(UmengCardMessage.this.f15817c, UmengCardMessage.this.f15818d, 18);
                UmengCardMessage.this.dismiss();
            }
        });
        return relativeLayout2;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C3564aj m15304a = C3564aj.m15304a(this.f15817c);
        UInAppMessage uInAppMessage = this.f15818d;
        m15304a.m15310a(uInAppMessage.msg_id, uInAppMessage.msg_type, 0, this.f15828n ? 1 : 0, 0, 0, this.f15830p ? 1 : 0, 0, this.f15829o ? 1 : 0);
        this.f15830p = false;
        this.f15828n = false;
        this.f15829o = false;
        this.f15827m = false;
        IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback = this.f15816a;
        if (iUmengInAppMsgCloseCallback != null) {
            iUmengInAppMsgCloseCallback.onClose();
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.f15827m) {
            C3564aj m15304a = C3564aj.m15304a(this.f15817c);
            UInAppMessage uInAppMessage = this.f15818d;
            m15304a.m15310a(uInAppMessage.msg_id, uInAppMessage.msg_type, 1, 0, 0, 0, 0, 0, 0);
        }
        this.f15827m = true;
    }
}
