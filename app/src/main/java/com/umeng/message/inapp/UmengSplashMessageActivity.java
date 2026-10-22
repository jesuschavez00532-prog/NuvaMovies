package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.AbstractC3563ai;
import com.umeng.message.proguard.AsyncTaskC3561ag;
import com.umeng.message.proguard.C3564aj;
import com.umeng.message.proguard.C3597bo;
import com.umeng.message.proguard.InterfaceC3559ae;
import java.util.Calendar;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public class UmengSplashMessageActivity extends Activity {

    /* renamed from: a */
    private static final String f15842a = "com.umeng.message.inapp.UmengSplashMessageActivity";

    /* renamed from: s */
    private static int f15843s = 2000;

    /* renamed from: t */
    private static int f15844t = 1000;

    /* renamed from: b */
    private Activity f15845b;

    /* renamed from: c */
    private AsyncTaskC3561ag f15846c;

    /* renamed from: d */
    private ImageView f15847d;

    /* renamed from: e */
    private ImageView f15848e;

    /* renamed from: f */
    private TextView f15849f;

    /* renamed from: i */
    private C3552a f15852i;

    /* renamed from: j */
    private C3552a f15853j;

    /* renamed from: k */
    private UInAppMessage f15854k;

    /* renamed from: l */
    private UInAppHandler f15855l;

    /* renamed from: q */
    private long f15860q;

    /* renamed from: r */
    private long f15861r;

    /* renamed from: g */
    private boolean f15850g = true;

    /* renamed from: h */
    private boolean f15851h = true;

    /* renamed from: m */
    private boolean f15856m = false;

    /* renamed from: n */
    private boolean f15857n = false;

    /* renamed from: o */
    private boolean f15858o = false;

    /* renamed from: p */
    private boolean f15859p = false;

    /* renamed from: u */
    private AsyncTaskC3561ag.a f15862u = new AsyncTaskC3561ag.a() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1
        @Override // com.umeng.message.proguard.AsyncTaskC3561ag.a
        /* renamed from: a */
        public final void mo15265a(Bitmap[] bitmapArr) {
            if (UmengSplashMessageActivity.this.m15242c()) {
                return;
            }
            if (UmengSplashMessageActivity.this.f15852i != null) {
                UmengSplashMessageActivity.this.f15852i.m15299a();
                UmengSplashMessageActivity.m15241c(UmengSplashMessageActivity.this);
            }
            try {
                if (bitmapArr.length == 1) {
                    UmengSplashMessageActivity.this.f15847d.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.m15244d(UmengSplashMessageActivity.this);
                            if (TextUtils.equals("none", UmengSplashMessageActivity.this.f15854k.action_type)) {
                                return;
                            }
                            UmengSplashMessageActivity.m15232a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f15860q);
                            C3564aj.m15304a(UmengSplashMessageActivity.this.f15845b).m15310a(UmengSplashMessageActivity.this.f15854k.msg_id, UmengSplashMessageActivity.this.f15854k.msg_type, 1, 1, 0, 0, 0, (int) UmengSplashMessageActivity.this.f15861r, 0);
                            UmengSplashMessageActivity.this.m15243d();
                            UmengSplashMessageActivity.this.f15855l.handleInAppMessage(UmengSplashMessageActivity.this.f15845b, UmengSplashMessageActivity.this.f15854k, 16);
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                    UmengSplashMessageActivity.this.f15848e.setVisibility(8);
                    UmengSplashMessageActivity.this.f15847d.setImageBitmap(bitmapArr[0]);
                    UmengSplashMessageActivity.m15236a(UmengSplashMessageActivity.this.f15847d);
                }
                if (bitmapArr.length == 2) {
                    UmengSplashMessageActivity.this.f15847d.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.m15253m(UmengSplashMessageActivity.this);
                            if (TextUtils.equals("none", UmengSplashMessageActivity.this.f15854k.action_type)) {
                                return;
                            }
                            UmengSplashMessageActivity.m15232a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f15860q);
                            C3564aj.m15304a(UmengSplashMessageActivity.this.f15845b).m15310a(UmengSplashMessageActivity.this.f15854k.msg_id, UmengSplashMessageActivity.this.f15854k.msg_type, 1, 0, 1, UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15858o), 0, (int) UmengSplashMessageActivity.this.f15861r, 0);
                            UmengSplashMessageActivity.this.m15243d();
                            UmengSplashMessageActivity.this.f15855l.handleInAppMessage(UmengSplashMessageActivity.this.f15845b, UmengSplashMessageActivity.this.f15854k, 16);
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                    UmengSplashMessageActivity.this.f15848e.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.m15255o(UmengSplashMessageActivity.this);
                            if (TextUtils.equals("none", UmengSplashMessageActivity.this.f15854k.bottom_action_type)) {
                                return;
                            }
                            UmengSplashMessageActivity.m15232a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f15860q);
                            C3564aj.m15304a(UmengSplashMessageActivity.this.f15845b).m15310a(UmengSplashMessageActivity.this.f15854k.msg_id, UmengSplashMessageActivity.this.f15854k.msg_type, 1, 0, UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15857n), 1, 0, (int) UmengSplashMessageActivity.this.f15861r, 0);
                            UmengSplashMessageActivity.this.m15243d();
                            UmengSplashMessageActivity.this.f15855l.handleInAppMessage(UmengSplashMessageActivity.this.f15845b, UmengSplashMessageActivity.this.f15854k, 17);
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                    UmengSplashMessageActivity.this.f15847d.setImageBitmap(bitmapArr[0]);
                    UmengSplashMessageActivity.this.f15848e.setImageBitmap(bitmapArr[1]);
                    UmengSplashMessageActivity.m15236a(UmengSplashMessageActivity.this.f15847d);
                    UmengSplashMessageActivity.m15236a(UmengSplashMessageActivity.this.f15848e);
                }
                UmengSplashMessageActivity.this.f15860q = SystemClock.elapsedRealtime();
                if (!UmengSplashMessageActivity.this.f15854k.display_button) {
                    UmengSplashMessageActivity.this.f15849f.setVisibility(8);
                } else {
                    UmengSplashMessageActivity.this.f15849f.setVisibility(0);
                    UmengSplashMessageActivity.this.f15849f.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.m15232a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f15860q);
                            C3564aj.m15304a(UmengSplashMessageActivity.this.f15845b).m15310a(UmengSplashMessageActivity.this.f15854k.msg_id, UmengSplashMessageActivity.this.f15854k.msg_type, 1, UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15856m), UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15857n), UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15858o), 1, (int) UmengSplashMessageActivity.this.f15861r, 0);
                            UmengSplashMessageActivity.this.m15243d();
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                }
                InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f15845b).m15215a(UmengSplashMessageActivity.this.f15854k);
                InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f15845b).m15218a(UmengSplashMessageActivity.this.f15854k.msg_id, 1);
                InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f15845b);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(System.currentTimeMillis());
                inAppMessageManager.m15221b("KEY_LAST_SHOW_SPLASH_TS", sb2.toString());
                UmengSplashMessageActivity.m15259s(UmengSplashMessageActivity.this);
                UmengSplashMessageActivity umengSplashMessageActivity = UmengSplashMessageActivity.this;
                umengSplashMessageActivity.f15853j = new C3552a(umengSplashMessageActivity.f15854k.display_time * 1000, UmengSplashMessageActivity.f15844t);
                UmengSplashMessageActivity.this.f15853j.m15300b();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    };

    /* renamed from: v */
    private final InterfaceC3559ae f15863v = new InterfaceC3559ae() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.2
        /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
        @Override // com.umeng.message.proguard.InterfaceC3559ae
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo15266a(com.umeng.message.entity.UInAppMessage r6) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.UmengSplashMessageActivity.C35512.mo15266a(com.umeng.message.entity.UInAppMessage):void");
        }

        @Override // com.umeng.message.proguard.InterfaceC3559ae
        /* renamed from: b */
        public final void mo15267b(UInAppMessage uInAppMessage) {
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.inapp.UmengSplashMessageActivity$a */
    /* loaded from: classes3.dex */
    public class C3552a extends AbstractC3563ai {
        C3552a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // com.umeng.message.proguard.AbstractC3563ai
        /* renamed from: a */
        public final void mo15268a(long j10) {
            if (!UmengSplashMessageActivity.this.f15850g) {
                UmengSplashMessageActivity.this.f15849f.setVisibility(0);
                TextView textView = UmengSplashMessageActivity.this.f15849f;
                StringBuilder sb2 = new StringBuilder();
                double d10 = j10;
                Double.isNaN(d10);
                double d11 = UmengSplashMessageActivity.f15844t;
                Double.isNaN(d11);
                sb2.append((int) Math.ceil((d10 * 1.0d) / d11));
                sb2.append(" ");
                sb2.append(UmengSplashMessageActivity.this.f15854k.display_name);
                textView.setText(sb2.toString());
            }
        }

        @Override // com.umeng.message.proguard.AbstractC3563ai
        /* renamed from: e */
        public final void mo15269e() {
            if (UmengSplashMessageActivity.this.m15242c() && UmengSplashMessageActivity.this.f15850g) {
                return;
            }
            if (!UmengSplashMessageActivity.this.f15850g) {
                C3564aj.m15304a(UmengSplashMessageActivity.this.f15845b).m15310a(UmengSplashMessageActivity.this.f15854k.msg_id, UmengSplashMessageActivity.this.f15854k.msg_type, 1, UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15856m), UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15857n), UmengSplashMessageActivity.m15231a(UmengSplashMessageActivity.this.f15858o), 0, UmengSplashMessageActivity.this.f15854k.display_time * 1000, 0);
            }
            UmengSplashMessageActivity.this.m15243d();
            UmengSplashMessageActivity.this.finish();
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m15231a(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* renamed from: c */
    static /* synthetic */ C3552a m15241c(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f15852i = null;
        return null;
    }

    /* renamed from: d */
    static /* synthetic */ boolean m15244d(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f15856m = true;
        return true;
    }

    /* renamed from: m */
    static /* synthetic */ boolean m15253m(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f15857n = true;
        return true;
    }

    /* renamed from: o */
    static /* synthetic */ boolean m15255o(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f15858o = true;
        return true;
    }

    /* renamed from: s */
    static /* synthetic */ boolean m15259s(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f15850g = false;
        return false;
    }

    /* renamed from: u */
    static /* synthetic */ boolean m15261u(UmengSplashMessageActivity umengSplashMessageActivity) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Long.parseLong(InAppMessageManager.getInstance(umengSplashMessageActivity.f15845b).m15214a("KEY_LAST_SHOW_SPLASH_TS", MessageService.MSG_DB_READY_REPORT)));
        Calendar calendar2 = Calendar.getInstance();
        if (calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1)) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15845b = this;
        if ((getIntent().getFlags() & 4194304) > 0) {
            finish();
            return;
        }
        if (onCustomPretreatment()) {
            return;
        }
        setRequestedOrientation(1);
        FrameLayout frameLayout = new FrameLayout(this.f15845b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this.f15845b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 13.0f);
        ImageView imageView = new ImageView(this.f15845b);
        this.f15847d = imageView;
        imageView.setLayoutParams(layoutParams);
        this.f15847d.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f15847d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 3.0f);
        ImageView imageView2 = new ImageView(this.f15845b);
        this.f15848e = imageView2;
        imageView2.setLayoutParams(layoutParams2);
        this.f15848e.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f15848e);
        frameLayout.addView(linearLayout);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 5;
        layoutParams3.rightMargin = C3597bo.m15440a(30.0f);
        layoutParams3.topMargin = C3597bo.m15440a(20.0f);
        TextView textView = new TextView(this.f15845b);
        this.f15849f = textView;
        textView.setLayoutParams(layoutParams3);
        int m15440a = C3597bo.m15440a(6.0f);
        int i10 = m15440a / 3;
        this.f15849f.setPadding(m15440a, i10, m15440a, i10);
        this.f15849f.setTextSize(14.0f);
        this.f15849f.setBackgroundColor(Color.parseColor("#80000000"));
        this.f15849f.setTextColor(-1);
        this.f15849f.setVisibility(8);
        frameLayout.addView(this.f15849f);
        setContentView(frameLayout);
        if (InAppMessageManager.f15792a) {
            C3564aj.m15304a(this).m15309a(this.f15863v);
        } else if (System.currentTimeMillis() - Long.parseLong(InAppMessageManager.getInstance(this.f15845b).m15214a("KEY_SPLASH_TS", MessageService.MSG_DB_READY_REPORT)) > InAppMessageManager.f15793d) {
            C3564aj.m15304a(this).m15309a(this.f15863v);
        } else {
            this.f15863v.mo15266a(null);
        }
        this.f15855l = InAppMessageManager.getInstance(this.f15845b).getInAppHandler();
        C3552a c3552a = new C3552a(f15843s, f15844t);
        this.f15852i = c3552a;
        c3552a.m15300b();
    }

    public boolean onCustomPretreatment() {
        return false;
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        C3552a c3552a = this.f15852i;
        if (c3552a != null) {
            c3552a.m15299a();
        }
        C3552a c3552a2 = this.f15853j;
        if (c3552a2 != null) {
            c3552a2.m15299a();
        }
        AsyncTaskC3561ag asyncTaskC3561ag = this.f15846c;
        if (asyncTaskC3561ag != null) {
            asyncTaskC3561ag.f15894a = null;
        }
        this.f15859p = false;
        this.f15856m = false;
        this.f15857n = false;
        this.f15858o = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        C3552a c3552a = this.f15852i;
        if (c3552a != null) {
            c3552a.m15301c();
        }
        if (this.f15853j != null) {
            this.f15861r += SystemClock.elapsedRealtime() - this.f15860q;
            this.f15853j.m15301c();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        C3552a c3552a = this.f15852i;
        if (c3552a != null) {
            c3552a.m15302d();
        }
        if (this.f15853j != null) {
            this.f15860q = SystemClock.elapsedRealtime();
            this.f15853j.m15302d();
        }
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized boolean m15242c() {
        boolean z10;
        z10 = this.f15859p;
        this.f15859p = true;
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m15243d() {
        if (this.f15851h) {
            this.f15851h = false;
            Intent intent = new Intent();
            intent.setClassName(this.f15845b, InAppMessageManager.getInstance(this).f15797c);
            intent.setFlags(536870912);
            try {
                this.f15845b.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ long m15232a(UmengSplashMessageActivity umengSplashMessageActivity, long j10) {
        long j11 = umengSplashMessageActivity.f15861r + j10;
        umengSplashMessageActivity.f15861r = j11;
        return j11;
    }

    /* renamed from: a */
    static /* synthetic */ void m15236a(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        alphaAnimation.setDuration(500L);
        view.startAnimation(alphaAnimation);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }
}
