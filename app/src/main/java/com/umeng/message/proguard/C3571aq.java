package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.message.UTrack;
import com.umeng.message.api.UPushInAppMessageCallback;
import com.umeng.message.api.UPushInAppMessageHandler;
import com.umeng.message.common.UPLog;

/* renamed from: com.umeng.message.proguard.aq */
/* loaded from: classes3.dex */
public final class C3571aq {

    /* renamed from: a */
    protected C3570ap f15964a;

    /* renamed from: b */
    public final C3574at f15965b;

    /* renamed from: c */
    public final View.OnClickListener f15966c;

    /* renamed from: d */
    public int f15967d;

    public C3571aq(Context context, final C3570ap c3570ap) {
        this.f15964a = c3570ap;
        C3574at c3574at = new C3574at(context, c3570ap);
        this.f15965b = c3574at;
        c3574at.setClipChildren(false);
        c3574at.setClipToPadding(false);
        c3574at.setClickable(true);
        c3574at.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.proguard.aq.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    Activity activity = (Activity) view.getContext();
                    if (activity == null) {
                        return;
                    }
                    UPLog.m15198i("Pop", "click msgId:", c3570ap.f15961a.getMsgId());
                    C3703v.m15825a().getNotificationClickHandler().handleMessage(activity, c3570ap.f15961a);
                    try {
                        UPushInAppMessageCallback inAppMessageCallback = C3703v.m15825a().getInAppMessageCallback();
                        if (inAppMessageCallback != null) {
                            inAppMessageCallback.onClick(C3706y.m15840a(), c3570ap.f15961a);
                        }
                    } catch (Throwable th) {
                        UPLog.m15197e("Pop", "onClick", th);
                    }
                    C3565ak.m15312a().mo15317a(activity);
                    UTrack.getInstance().trackInAppNotifyClick(c3570ap.f15961a);
                } catch (Throwable th2) {
                    UPLog.m15196e("Pop", th2);
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.umeng.message.proguard.aq.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    Activity activity = (Activity) view.getContext();
                    if (activity == null) {
                        return;
                    }
                    UPLog.m15198i("Pop", "close msgId:", c3570ap.f15961a.getMsgId());
                    C3565ak.m15312a().mo15317a(activity);
                } catch (Throwable th) {
                    UPLog.m15197e("Pop", "onDismiss", th);
                }
            }
        };
        this.f15966c = onClickListener;
        c3574at.setDismissListener(onClickListener);
        this.f15967d = C3597bo.m15440a(80.0f);
        UPushInAppMessageHandler inAppMessageHandler = C3703v.m15825a().getInAppMessageHandler();
        if (inAppMessageHandler != null) {
            try {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f15967d);
                layoutParams.gravity = 17;
                View view = inAppMessageHandler.getView(context, c3570ap.f15961a, layoutParams);
                if (view != null) {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    int i10 = layoutParams.height;
                    if (i10 > 0 && i10 != this.f15967d) {
                        this.f15967d = i10;
                    }
                    c3574at.setBackgroundColor(0);
                    c3574at.addView(view, layoutParams);
                    return;
                }
            } catch (Throwable th) {
                UPLog.m15197e("Pop", "custom view error", th);
            }
        }
        final int m15440a = C3597bo.m15440a(8.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            float f10 = m15440a;
            this.f15965b.setElevation(f10);
            this.f15965b.setTranslationZ(f10);
        }
        this.f15965b.setBackgroundDrawable(new ShapeDrawable(new RectShape() { // from class: com.umeng.message.proguard.aq.3
            @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
            public final void draw(Canvas canvas, Paint paint) {
                paint.setColor(-83886081);
                RectF rect = rect();
                int i11 = m15440a;
                canvas.drawRoundRect(rect, i11, i11, paint);
            }
        }));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(C3597bo.m15440a(12.0f), 0, C3597bo.m15440a(26.0f), 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 16;
        linearLayout.setLayoutParams(layoutParams2);
        this.f15965b.addView(linearLayout);
        Bitmap m15340a = m15340a(context, c3570ap.f15961a);
        if (m15340a != null && m15340a.getWidth() > 0 && m15340a.getHeight() > 0) {
            ImageView imageView = new ImageView(context);
            int m15440a2 = C3597bo.m15440a(48.0f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(Math.min(m15440a2 * 2, (m15340a.getWidth() * m15440a2) / m15340a.getHeight()), m15440a2);
            layoutParams3.gravity = 16;
            layoutParams3.leftMargin = C3597bo.m15440a(4.0f);
            linearLayout.addView(imageView, layoutParams3);
            imageView.setImageDrawable(new C3575au(m15340a, C3597bo.m15440a(8.0f)));
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 16;
        if (m15340a != null) {
            layoutParams4.leftMargin = C3597bo.m15440a(10.0f);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(context);
        textView.setText(c3570ap.f15961a.getTitle());
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(-14341836);
        textView.setTextSize(2, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(c3570ap.f15961a.getContent());
        textView2.setTextColor(-14341836);
        textView2.setSingleLine();
        textView2.setMaxLines(1);
        textView2.setTextSize(2, 14.0f);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = C3597bo.m15440a(4.0f);
        linearLayout2.addView(textView2, layoutParams5);
        if (C3565ak.m15312a().mo15323c().f15954f) {
            int m15440a3 = C3597bo.m15440a(24.0f);
            FrameLayout frameLayout = new FrameLayout(context);
            C3572ar c3572ar = new C3572ar(context);
            int m15440a4 = C3597bo.m15440a(3.0f);
            int m15440a5 = C3597bo.m15440a(8.0f);
            frameLayout.setPadding(m15440a4, m15440a5, m15440a5, m15440a4);
            frameLayout.addView(c3572ar);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(m15440a3, m15440a3);
            layoutParams6.gravity = 8388661;
            this.f15965b.addView(frameLayout, layoutParams6);
            frameLayout.setOnClickListener(this.f15966c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[Catch: all -> 0x0068, TRY_ENTER, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0011, B:9:0x0030, B:15:0x003a, B:13:0x0042, B:19:0x004c, B:21:0x005f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0011, B:9:0x0030, B:15:0x003a, B:13:0x0042, B:19:0x004c, B:21:0x005f), top: B:2:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap m15340a(android.content.Context r4, com.umeng.message.entity.UMessage r5) {
        /*
            r0 = 0
            boolean r1 = r5.isLargeIconFromInternet()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L2d
            java.lang.String r1 = r5.getLargeIconUrl()     // Catch: java.lang.Throwable -> L68
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L2d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = com.umeng.message.proguard.C3678f.m15759g(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.MD5(r1)     // Catch: java.lang.Throwable -> L68
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L68
            r1 = 1111490560(0x42400000, float:48.0)
            int r3 = com.umeng.message.proguard.C3597bo.m15440a(r1)     // Catch: java.lang.Throwable -> L68
            int r1 = com.umeng.message.proguard.C3597bo.m15440a(r1)     // Catch: java.lang.Throwable -> L68
            android.graphics.Bitmap r1 = com.umeng.message.proguard.C3678f.m15741a(r2, r3, r1)     // Catch: java.lang.Throwable -> L68
            goto L2e
        L2d:
            r1 = r0
        L2e:
            if (r1 != 0) goto L4a
            java.lang.String r5 = r5.getLargeIconDrawableName()     // Catch: java.lang.Throwable -> L68
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L3f
            int r5 = com.umeng.message.proguard.C3553a.m15275c(r5)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L68
            goto L40
        L3f:
            r5 = -1
        L40:
            if (r5 <= 0) goto L4a
            android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Throwable -> L68
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r5)     // Catch: java.lang.Throwable -> L68
        L4a:
            if (r1 != 0) goto L67
            android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L68
            r3 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L68
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch: java.lang.Throwable -> L68
            int r5 = r5.icon     // Catch: java.lang.Throwable -> L68
            if (r5 <= 0) goto L67
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L68
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r4, r5)     // Catch: java.lang.Throwable -> L68
        L67:
            return r1
        L68:
            r4 = move-exception
            java.lang.String r5 = "Pop"
            com.umeng.message.common.UPLog.m15196e(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3571aq.m15340a(android.content.Context, com.umeng.message.entity.UMessage):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final C3570ap m15342b() {
        return this.f15964a;
    }

    /* renamed from: a */
    public final String m15341a() {
        return this.f15964a.f15961a.getMsgId();
    }
}
