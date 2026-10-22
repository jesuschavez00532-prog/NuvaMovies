package com.umeng.message.proguard;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.umeng.message.proguard.C3630ct;
import com.umeng.message.proguard.InterfaceC3606bx;
import com.umeng.message.push.C3708R;

/* renamed from: com.umeng.message.proguard.co */
/* loaded from: classes3.dex */
public final class C3625co extends AbstractC3624cn {

    /* renamed from: c */
    final C3632cv f16191c;

    /* renamed from: d */
    SurfaceHolderCallbackC3676ej f16192d;

    /* renamed from: e */
    final C3617cg f16193e;

    /* renamed from: f */
    private final FrameLayout f16194f;

    /* renamed from: g */
    private InterfaceC3606bx.f f16195g;

    /* renamed from: h */
    private ImageView f16196h;

    /* renamed from: i */
    private boolean f16197i;

    /* renamed from: com.umeng.message.proguard.co$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC3606bx.f {

        /* renamed from: b */
        private final boolean f16204b;

        /* renamed from: c */
        private final InterfaceC3606bx.f f16205c;

        a(boolean z10, InterfaceC3606bx.f fVar) {
            this.f16205c = fVar;
            this.f16204b = z10;
        }
    }

    public C3625co(Context context, C3622cl c3622cl) {
        super(context, c3622cl);
        this.f16193e = new C3617cg();
        this.f16197i = true;
        this.f16191c = new C3632cv();
        this.f16194f = new FrameLayout(context);
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: a */
    public final View mo15535a() {
        return this.f16194f;
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: b */
    public final void mo15537b() {
        if (this.f16195g == null) {
            this.f16195g = new a(m15542a(this.f16190b.f16185a), this.f16191c);
        }
        this.f16191c.f16264l = new InterfaceC3606bx.e() { // from class: com.umeng.message.proguard.co.1
            /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
            @Override // com.umeng.message.proguard.InterfaceC3606bx.e
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void mo15459a() {
                /*
                    r5 = this;
                    com.umeng.message.proguard.co r0 = com.umeng.message.proguard.C3625co.this
                    com.umeng.message.proguard.cv r1 = r0.f16191c
                    com.umeng.message.proguard.cl r0 = r0.f16190b
                    com.umeng.message.proguard.ck r0 = r0.f16185a
                    boolean r0 = com.umeng.message.proguard.C3625co.m15542a(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 != 0) goto L28
                    com.umeng.message.proguard.co r0 = com.umeng.message.proguard.C3625co.this
                    com.umeng.message.proguard.cl r0 = r0.f16190b
                    com.umeng.message.proguard.ck r0 = r0.f16185a
                    org.json.JSONObject r0 = r0.f16166b
                    java.lang.String r4 = "video_loop"
                    int r0 = r0.optInt(r4, r3)
                    if (r0 != r3) goto L22
                    r0 = 1
                    goto L23
                L22:
                    r0 = 0
                L23:
                    if (r0 == 0) goto L26
                    goto L28
                L26:
                    r0 = 0
                    goto L29
                L28:
                    r0 = 1
                L29:
                    r1.f16257e = r0
                    com.umeng.message.proguard.co r0 = com.umeng.message.proguard.C3625co.this
                    com.umeng.message.proguard.cl r0 = r0.f16190b
                    com.umeng.message.proguard.ck r0 = r0.f16185a
                    org.json.JSONObject r0 = r0.f16166b
                    java.lang.String r1 = "video_sound"
                    int r0 = r0.optInt(r1, r2)
                    if (r0 != 0) goto L3c
                    r2 = 1
                L3c:
                    com.umeng.message.proguard.co r0 = com.umeng.message.proguard.C3625co.this
                    com.umeng.message.proguard.cv r0 = r0.f16191c
                    r0.m15585b(r2)
                    com.umeng.message.proguard.co r0 = com.umeng.message.proguard.C3625co.this
                    r0.m15543a(r2)
                    com.umeng.message.proguard.co r0 = com.umeng.message.proguard.C3625co.this
                    com.umeng.message.proguard.cg r0 = r0.f16193e
                    r0.mo15459a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3625co.AnonymousClass1.mo15459a():void");
            }

            @Override // com.umeng.message.proguard.InterfaceC3606bx.e
            /* renamed from: b */
            public final void mo15461b() {
                C3625co.this.f16193e.mo15461b();
            }

            @Override // com.umeng.message.proguard.InterfaceC3606bx.e
            /* renamed from: c */
            public final void mo15462c() {
                C3625co.this.f16193e.mo15462c();
            }

            @Override // com.umeng.message.proguard.InterfaceC3606bx.e
            /* renamed from: d */
            public final void mo15463d() {
                C3625co.this.f16193e.mo15463d();
            }

            @Override // com.umeng.message.proguard.InterfaceC3606bx.e
            /* renamed from: a */
            public final void mo15460a(String str) {
                C3625co.this.f16193e.mo15460a(str);
            }
        };
        C3630ct.m15572a(true, this.f16190b.f16185a.m15532l(), new C3630ct.a() { // from class: com.umeng.message.proguard.co.2
            @Override // com.umeng.message.proguard.C3630ct.a
            /* renamed from: a */
            public final void mo15544a() {
            }

            /* JADX WARN: Can't wrap try/catch for region: R(17:3|4|5|6|7|8|9|(2:10|11)|12|(2:15|16)|(2:20|21)|24|25|(2:27|(2:29|30)(1:33))|34|35|36) */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
            
                r2 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
            
                com.umeng.message.proguard.C3615ce.m15512d("VideoPlayer", "prepare mmr ready error:", r2.getMessage());
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0098, TryCatch #4 {all -> 0x0098, blocks: (B:25:0x008a, B:27:0x008e, B:29:0x0094), top: B:24:0x008a }] */
            @Override // com.umeng.message.proguard.C3630ct.a
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void mo15545a(java.lang.String r13) {
                /*
                    Method dump skipped, instructions count: 209
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3625co.AnonymousClass2.mo15545a(java.lang.String):void");
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: c */
    public final void mo15538c() {
        boolean z10;
        boolean z11;
        float f10;
        int i10;
        int i11;
        int i12;
        boolean m15542a = m15542a(this.f16190b.f16185a);
        if (this.f16192d == null) {
            SurfaceHolderCallbackC3676ej surfaceHolderCallbackC3676ej = new SurfaceHolderCallbackC3676ej(this.f16189a);
            this.f16192d = surfaceHolderCallbackC3676ej;
            surfaceHolderCallbackC3676ej.setVideoPlayer(this.f16191c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f16192d.setLayoutParams(layoutParams);
        }
        ViewParent parent = this.f16192d.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f16192d);
        }
        this.f16194f.addView(this.f16192d);
        if (this.f16197i && m15542a) {
            if (this.f16196h == null) {
                this.f16196h = new ImageView(this.f16189a);
                int m15728a = C3670ed.m15728a(4.0f);
                int i13 = m15728a * 10;
                int i14 = m15728a * 3;
                int i15 = m15728a * 2;
                this.f16196h.setPadding(i14, i14, i15, i15);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i13, i13);
                layoutParams2.gravity = 8388659;
                this.f16196h.setLayoutParams(layoutParams2);
                this.f16196h.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.proguard.co.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3625co.this.f16191c.m15585b(!r2.f16256d);
                        C3625co c3625co = C3625co.this;
                        c3625co.m15543a(c3625co.f16191c.f16256d);
                    }
                });
            }
            m15543a(this.f16191c.f16256d);
            ViewParent parent2 = this.f16196h.getParent();
            if (parent2 != null) {
                ((ViewGroup) parent2).removeView(this.f16196h);
            }
            this.f16194f.addView(this.f16196h);
        }
        InterfaceC3606bx.c m15448a = C3602bt.m15448a(this.f16190b.f16185a);
        InterfaceC3606bx.c cVar = InterfaceC3606bx.c.INTERSTITIAL;
        boolean z12 = true;
        if (m15448a == cVar) {
            DisplayMetrics displayMetrics = this.f16189a.getResources().getDisplayMetrics();
            if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                z11 = true;
            } else {
                z11 = false;
            }
            C3632cv c3632cv = this.f16191c;
            int i16 = c3632cv.f16262j;
            int i17 = c3632cv.f16263k;
            if (i16 > 0 && i17 > 0) {
                f10 = (i16 * 1.0f) / i17;
            } else {
                f10 = 0.5625f;
            }
            int m15728a2 = C3670ed.m15728a(72.0f);
            int m15728a3 = C3670ed.m15728a(144.0f);
            if (z11) {
                i12 = displayMetrics.widthPixels - m15728a2;
                i11 = (int) (i12 / f10);
                int i18 = displayMetrics.heightPixels;
                if (i11 > i18 - m15728a3) {
                    i11 = i18 - m15728a3;
                    i12 = (int) (i11 * f10);
                }
                i10 = i12;
            } else {
                int i19 = displayMetrics.heightPixels - m15728a3;
                int i20 = (int) (i19 * f10);
                int i21 = displayMetrics.widthPixels;
                if (i20 > i21 - m15728a2) {
                    i10 = i21 - m15728a2;
                    i11 = i19;
                } else if (i20 > i19) {
                    i11 = i19;
                    i10 = i20;
                } else {
                    i10 = i19;
                    i11 = i10;
                    i12 = i20;
                }
                i12 = i10;
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f16192d.getLayoutParams();
            layoutParams3.width = i12;
            layoutParams3.height = i11;
            this.f16192d.setLayoutParams(layoutParams3);
            this.f16194f.setLayoutParams(new FrameLayout.LayoutParams(i10, i11));
        }
        if (m15448a != cVar) {
            if (this.f16190b.f16185a.f16166b.optInt("auto_play", 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z12 = false;
            }
        }
        if (!z12) {
            return;
        }
        C3630ct.m15572a(false, this.f16190b.f16185a.m15532l(), new C3630ct.a() { // from class: com.umeng.message.proguard.co.4
            @Override // com.umeng.message.proguard.C3630ct.a
            /* renamed from: a */
            public final void mo15544a() {
            }

            @Override // com.umeng.message.proguard.C3630ct.a
            /* renamed from: a */
            public final void mo15545a(String str) {
                SurfaceHolderCallbackC3676ej surfaceHolderCallbackC3676ej2 = C3625co.this.f16192d;
                if (surfaceHolderCallbackC3676ej2 == null) {
                    return;
                }
                surfaceHolderCallbackC3676ej2.post(new Runnable() { // from class: com.umeng.message.proguard.co.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3632cv c3632cv2;
                        SurfaceHolderCallbackC3676ej surfaceHolderCallbackC3676ej3 = C3625co.this.f16192d;
                        if (surfaceHolderCallbackC3676ej3 != null && (c3632cv2 = surfaceHolderCallbackC3676ej3.f16483a) != null) {
                            surfaceHolderCallbackC3676ej3.f16484b = c3632cv2.m15586b();
                        }
                    }
                });
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: d */
    public final void mo15539d() {
        C3621ck c3621ck = this.f16190b.f16185a;
        int m15590e = this.f16191c.m15590e();
        c3621ck.f16170f = m15590e;
        this.f16191c.m15582a(m15590e);
        C3632cv c3632cv = this.f16191c;
        C3628cr.m15569a().mo15563a(true, c3621ck, c3632cv.f16260h, m15590e, c3632cv.f16259g, c3632cv.f16261i);
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: e */
    public final void mo15540e() {
        this.f16191c.m15585b(true);
        m15543a(true);
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: f */
    public final void mo15541f() {
        C3621ck c3621ck = this.f16190b.f16185a;
        int m15590e = this.f16191c.m15590e();
        this.f16191c.m15582a(m15590e);
        C3632cv c3632cv = this.f16191c;
        boolean z10 = c3632cv.f16260h;
        int i10 = c3632cv.f16259g;
        long j10 = c3632cv.f16261i;
        c3621ck.f16170f = m15590e;
        C3628cr.m15569a().mo15563a(false, c3621ck, z10, m15590e, i10, j10);
    }

    /* renamed from: a */
    static boolean m15542a(C3621ck c3621ck) {
        InterfaceC3606bx.c m15448a = C3602bt.m15448a(c3621ck);
        return m15448a != null && m15448a == InterfaceC3606bx.c.INTERSTITIAL;
    }

    /* renamed from: a */
    final void m15543a(boolean z10) {
        ImageView imageView = this.f16196h;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z10 ? C3708R.drawable.umeng_union_sound_off : C3708R.drawable.umeng_union_sound_on);
    }
}
