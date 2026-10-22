package com.umeng.message;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.UPushNotificationChannel;
import com.umeng.message.component.UmengNotificationClickActivity;
import com.umeng.message.component.UmengNotificationReceiver;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3558ad;
import com.umeng.message.proguard.C3565ak;
import com.umeng.message.proguard.C3580az;
import com.umeng.message.proguard.C3592bj;
import com.umeng.message.proguard.C3597bo;
import com.umeng.message.proguard.C3637d;
import com.umeng.message.proguard.C3678f;
import com.umeng.message.proguard.C3705x;
import com.umeng.message.proguard.C3707z;
import com.umeng.message.push.C3708R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class UmengMessageHandler implements UPushMessageHandler {

    /* renamed from: a */
    private static Date f15774a;

    /* renamed from: b */
    private int f15775b;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private Notification m15188a(Context context, UMessage uMessage) {
        Bitmap bitmap;
        Bitmap bitmap2;
        String str;
        String str2;
        SimpleDateFormat simpleDateFormat;
        int i10;
        String id2;
        Notification.Builder builder = new Notification.Builder(context);
        String category = uMessage.getCategory();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21 && !TextUtils.isEmpty(category)) {
            builder.setCategory(category);
        }
        if (i11 >= 26) {
            NotificationChannel notificationChannel = getNotificationChannel(context, uMessage);
            if (notificationChannel == null) {
                if (uMessage.getImportance() == 1 && C3637d.m15609g()) {
                    notificationChannel = UPushNotificationChannel.getSilenceMode(context);
                } else if (isInNoDisturbTime(context)) {
                    notificationChannel = UPushNotificationChannel.getSilenceMode(context);
                } else {
                    notificationChannel = UPushNotificationChannel.getDefaultMode(context);
                }
            }
            if (notificationChannel != null) {
                id2 = notificationChannel.getId();
                builder.setChannelId(id2);
            } else {
                UPLog.m15197e("MsgHandler", "notification channel null!");
                return null;
            }
        }
        int smallIconId = getSmallIconId(context, uMessage);
        if (smallIconId < 0) {
            UPLog.m15197e("MsgHandler", "notification small icon error!");
            return null;
        }
        Bitmap largeIcon = getLargeIcon(context, uMessage);
        Bitmap expandImage = getExpandImage(context, uMessage);
        String title = uMessage.getTitle();
        String content = uMessage.getContent();
        String titleColor = uMessage.getTitleColor();
        if (!TextUtils.isEmpty(titleColor) && !TextUtils.isEmpty(title)) {
            try {
                int parseColor = Color.parseColor(titleColor);
                SpannableString spannableString = new SpannableString(title);
                spannableString.setSpan(new ForegroundColorSpan(parseColor), 0, title.length(), 34);
                title = spannableString;
            } catch (Exception unused) {
            }
        }
        String textColor = uMessage.getTextColor();
        if (!TextUtils.isEmpty(textColor) && !TextUtils.isEmpty(content)) {
            try {
                int parseColor2 = Color.parseColor(textColor);
                SpannableString spannableString2 = new SpannableString(content);
                spannableString2.setSpan(new ForegroundColorSpan(parseColor2), 0, content.length(), 34);
                content = spannableString2;
            } catch (Exception unused2) {
            }
        }
        builder.setTicker(uMessage.getTicker());
        builder.setSmallIcon(smallIconId);
        builder.setContentTitle(title);
        builder.setContentText(content);
        builder.setAutoCancel(true);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && uMessage.hasBackgroundImage()) {
            bitmap = getBackgroundImage(context, uMessage);
        } else {
            bitmap = null;
        }
        if (i12 >= 26 && bitmap != null) {
            builder.setGroupSummary(C3637d.m15611h());
            builder.setGroup(uMessage.msg_id);
            int i13 = C3708R.layout.upush_notification_shade_layout;
            int i14 = C3708R.id.upush_notification_small_icon;
            int i15 = C3708R.id.upush_notification_app_name;
            int i16 = C3708R.id.upush_notification_date;
            int i17 = C3708R.id.upush_notification_title;
            int i18 = C3708R.id.upush_notification_content;
            int i19 = C3708R.id.upush_notification_shade_iv;
            str2 = textColor;
            int i20 = C3708R.id.upush_notification_large_iv;
            str = titleColor;
            bitmap2 = expandImage;
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i13);
            remoteViews.setImageViewResource(i14, smallIconId);
            remoteViews.setTextViewText(i15, UMUtils.getAppName(context));
            long msgTime = uMessage.getMsgTime();
            if (C3678f.m15750a(msgTime)) {
                simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            } else {
                simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
            }
            remoteViews.setTextViewText(i16, simpleDateFormat.format(Long.valueOf(msgTime)));
            remoteViews.setTextViewText(i17, title);
            if (TextUtils.isEmpty(content)) {
                remoteViews.setViewVisibility(i18, 8);
                i10 = 0;
            } else {
                i10 = 0;
                remoteViews.setViewVisibility(i18, 0);
                remoteViews.setTextViewText(i18, content);
            }
            if (largeIcon != null) {
                remoteViews.setViewVisibility(i20, i10);
                remoteViews.setImageViewBitmap(i20, largeIcon);
            } else {
                remoteViews.setViewVisibility(i20, 8);
            }
            remoteViews.setViewVisibility(i19, i10);
            remoteViews.setImageViewBitmap(i19, bitmap);
            builder.setCustomContentView(remoteViews);
            if (context.getApplicationInfo().targetSdkVersion >= 31) {
                builder.setCustomBigContentView(remoteViews);
            }
            builder.setStyle(new Notification.DecoratedCustomViewStyle());
        } else {
            bitmap2 = expandImage;
            str = titleColor;
            str2 = textColor;
            if (!TextUtils.isEmpty(uMessage.getBarImageUrl())) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), C3708R.layout.upush_notification_banner_layout);
                remoteViews2.setImageViewBitmap(C3708R.id.upush_notification_banner, getBarImage(context, uMessage));
                if (i12 >= 24) {
                    builder.setCustomContentView(remoteViews2);
                    if (context.getApplicationInfo().targetSdkVersion >= 31) {
                        builder.setCustomBigContentView(remoteViews2);
                    }
                } else {
                    builder.setContent(remoteViews2);
                }
            } else if (largeIcon != null) {
                builder.setLargeIcon(largeIcon);
            }
        }
        if (bitmap2 != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.bigPicture(bitmap2);
            bigPictureStyle.bigLargeIcon(largeIcon);
            builder.setStyle(bigPictureStyle);
        } else if (!TextUtils.isEmpty(uMessage.getBigBody())) {
            String bigTitle = uMessage.getBigTitle();
            if (bigTitle != null && bigTitle.length() != 0) {
                title = bigTitle;
            }
            String bigBody = uMessage.getBigBody();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(title)) {
                try {
                    int parseColor3 = Color.parseColor(str);
                    SpannableString spannableString3 = new SpannableString(title);
                    spannableString3.setSpan(new ForegroundColorSpan(parseColor3), 0, title.length(), 34);
                    title = spannableString3;
                } catch (Exception unused3) {
                }
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(bigBody)) {
                try {
                    int parseColor4 = Color.parseColor(str2);
                    SpannableString spannableString4 = new SpannableString(bigBody);
                    spannableString4.setSpan(new ForegroundColorSpan(parseColor4), 0, bigBody.length(), 34);
                    bigBody = spannableString4;
                } catch (Exception unused4) {
                }
            }
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(title);
            bigTextStyle.bigText(bigBody);
            builder.setStyle(bigTextStyle);
        }
        return builder.getNotification();
    }

    public void dealWithCustomMessage(Context context, UMessage uMessage) {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0126 A[Catch: Exception -> 0x01db, TryCatch #0 {Exception -> 0x01db, blocks: (B:23:0x0083, B:27:0x009f, B:28:0x00da, B:31:0x00ea, B:34:0x0126, B:37:0x012f, B:39:0x0139, B:41:0x013f, B:42:0x0157, B:45:0x0163, B:46:0x016c, B:49:0x0174, B:51:0x017a, B:55:0x0182, B:56:0x0187, B:61:0x0194, B:63:0x019e, B:65:0x01ae, B:67:0x01b2, B:69:0x01b6, B:71:0x01bc, B:72:0x00f4, B:75:0x00fa, B:78:0x0107, B:80:0x0113, B:82:0x0119, B:83:0x00c6, B:86:0x00d1), top: B:22:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f A[Catch: Exception -> 0x01db, TryCatch #0 {Exception -> 0x01db, blocks: (B:23:0x0083, B:27:0x009f, B:28:0x00da, B:31:0x00ea, B:34:0x0126, B:37:0x012f, B:39:0x0139, B:41:0x013f, B:42:0x0157, B:45:0x0163, B:46:0x016c, B:49:0x0174, B:51:0x017a, B:55:0x0182, B:56:0x0187, B:61:0x0194, B:63:0x019e, B:65:0x01ae, B:67:0x01b2, B:69:0x01b6, B:71:0x01bc, B:72:0x00f4, B:75:0x00fa, B:78:0x0107, B:80:0x0113, B:82:0x0119, B:83:0x00c6, B:86:0x00d1), top: B:22:0x0083 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dealWithNotificationMessage(android.content.Context r14, com.umeng.message.entity.UMessage r15) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengMessageHandler.dealWithNotificationMessage(android.content.Context, com.umeng.message.entity.UMessage):void");
    }

    public Bitmap getBackgroundImage(Context context, UMessage uMessage) {
        try {
            String backgroundImageUrl = uMessage.getBackgroundImageUrl();
            if (TextUtils.isEmpty(backgroundImageUrl)) {
                return null;
            }
            return C3678f.m15741a(new File(C3678f.m15759g(context), UMUtils.MD5(backgroundImageUrl)), C3597bo.m15439a(), C3597bo.m15440a(64.0f));
        } catch (Throwable th) {
            UPLog.m15196e("MsgHandler", th);
            return null;
        }
    }

    public Bitmap getBarImage(Context context, UMessage uMessage) {
        try {
            String barImageUrl = uMessage.getBarImageUrl();
            if (TextUtils.isEmpty(barImageUrl)) {
                return null;
            }
            return C3678f.m15741a(new File(C3678f.m15759g(context), UMUtils.MD5(barImageUrl)), C3597bo.m15439a(), C3597bo.m15440a(64.0f));
        } catch (Throwable th) {
            UPLog.m15196e("MsgHandler", th);
            return null;
        }
    }

    public PendingIntent getClickPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        int i10 = 335544320;
        intent.setFlags(335544320);
        intent.setClass(context, UmengNotificationClickActivity.class);
        intent.putExtra("MSG", uMessage.getRaw().toString());
        intent.putExtra("NOTIFICATION_ID", this.f15775b);
        if (Build.VERSION.SDK_INT < 23) {
            i10 = 268435456;
        }
        return PendingIntent.getActivity(context, (int) System.currentTimeMillis(), intent, i10);
    }

    public PendingIntent getDismissPendingIntent(Context context, UMessage uMessage) {
        int i10;
        Intent intent = new Intent();
        intent.setClass(context, UmengNotificationReceiver.class);
        intent.putExtra("MSG", uMessage.getRaw().toString());
        intent.putExtra("ACTION", 11);
        intent.putExtra("NOTIFICATION_ID", this.f15775b);
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 335544320;
        } else {
            i10 = 268435456;
        }
        return PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() + 1), intent, i10);
    }

    public Bitmap getExpandImage(Context context, UMessage uMessage) {
        try {
            String bigImage = uMessage.getBigImage();
            if (TextUtils.isEmpty(bigImage)) {
                return null;
            }
            return C3678f.m15741a(new File(C3678f.m15759g(context), UMUtils.MD5(bigImage)), C3597bo.m15439a(), C3597bo.m15440a(256.0f));
        } catch (Throwable th) {
            UPLog.m15196e("MsgHandler", th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #2 {all -> 0x005e, blocks: (B:3:0x0003, B:5:0x0009, B:9:0x0014, B:11:0x0033, B:25:0x003d, B:16:0x0055, B:14:0x0047, B:28:0x0043, B:22:0x004f), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap getLargeIcon(android.content.Context r6, com.umeng.message.entity.UMessage r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MsgHandler"
            r1 = 0
            boolean r2 = r7.isLargeIconFromInternet()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L30
            java.lang.String r2 = r7.getLargeIconUrl()     // Catch: java.lang.Throwable -> L5e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L14
            return r1
        L14:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L5e
            java.io.File r4 = com.umeng.message.proguard.C3678f.m15759g(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.MD5(r2)     // Catch: java.lang.Throwable -> L5e
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L5e
            r2 = 1111490560(0x42400000, float:48.0)
            int r4 = com.umeng.message.proguard.C3597bo.m15440a(r2)     // Catch: java.lang.Throwable -> L5e
            int r2 = com.umeng.message.proguard.C3597bo.m15440a(r2)     // Catch: java.lang.Throwable -> L5e
            android.graphics.Bitmap r2 = com.umeng.message.proguard.C3678f.m15741a(r3, r4, r2)     // Catch: java.lang.Throwable -> L5e
            goto L31
        L30:
            r2 = r1
        L31:
            if (r2 != 0) goto L5d
            java.lang.String r7 = r7.getLargeIconDrawableName()     // Catch: java.lang.Throwable -> L5e
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L5e
            if (r3 != 0) goto L47
            int r7 = com.umeng.message.proguard.C3553a.m15275c(r7)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L5e
            goto L53
        L42:
            r7 = move-exception
            com.umeng.message.common.UPLog.m15199w(r0, r7)     // Catch: java.lang.Throwable -> L5e
            goto L52
        L47:
            java.lang.String r7 = "umeng_push_notification_default_large_icon"
            int r7 = com.umeng.message.proguard.C3553a.m15275c(r7)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L5e
            goto L53
        L4e:
            r7 = move-exception
            com.umeng.message.common.UPLog.m15199w(r0, r7)     // Catch: java.lang.Throwable -> L5e
        L52:
            r7 = -1
        L53:
            if (r7 <= 0) goto L5d
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L5e
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r6, r7)     // Catch: java.lang.Throwable -> L5e
        L5d:
            return r2
        L5e:
            r6 = move-exception
            com.umeng.message.common.UPLog.m15196e(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengMessageHandler.getLargeIcon(android.content.Context, com.umeng.message.entity.UMessage):android.graphics.Bitmap");
    }

    public Notification getNotification(Context context, UMessage uMessage) {
        return null;
    }

    public NotificationChannel getNotificationChannel() {
        return null;
    }

    public int getNotificationDefaults(Context context, UMessage uMessage) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        if (isInNoDisturbTime(context)) {
            return 0;
        }
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(context);
        long m15174g = messageSharedPrefs.m15174g() * 1000;
        if (f15774a != null && calendar.getTimeInMillis() - f15774a.getTime() < m15174g) {
            return 0;
        }
        int m15176i = messageSharedPrefs.m15176i();
        UPLog.m15198i("MsgHandler", "vibrate:", Integer.valueOf(m15176i));
        if (m15176i == 1 || (m15176i != 2 && uMessage.isVibrate())) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int m15177j = messageSharedPrefs.m15177j();
        UPLog.m15198i("MsgHandler", "lights:", Integer.valueOf(m15177j));
        if (m15177j == 1 || (m15177j != 2 && uMessage.isLights())) {
            i10 |= 4;
        }
        int m15178k = messageSharedPrefs.m15178k();
        UPLog.m15198i("MsgHandler", "sound:", Integer.valueOf(m15178k));
        if (m15178k == 1 || (m15178k != 2 && uMessage.isSound())) {
            i10 |= 1;
        }
        f15774a = calendar.getTime();
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0003, B:19:0x000d, B:9:0x0026, B:11:0x0038, B:6:0x0017, B:22:0x0013, B:17:0x001f), top: B:2:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0003, B:19:0x000d, B:9:0x0026, B:11:0x0038, B:6:0x0017, B:22:0x0013, B:17:0x001f), top: B:2:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSmallIconId(android.content.Context r6, com.umeng.message.entity.UMessage r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MsgHandler"
            r1 = -1
            java.lang.String r7 = r7.getSmallIconDrawableName()     // Catch: java.lang.Throwable -> L42
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L17
            int r1 = com.umeng.message.proguard.C3553a.m15275c(r7)     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L42
            goto L22
        L12:
            r7 = move-exception
            com.umeng.message.common.UPLog.m15199w(r0, r7)     // Catch: java.lang.Throwable -> L42
            goto L22
        L17:
            java.lang.String r7 = "umeng_push_notification_default_small_icon"
            int r1 = com.umeng.message.proguard.C3553a.m15275c(r7)     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L42
            goto L22
        L1e:
            r7 = move-exception
            com.umeng.message.common.UPLog.m15199w(r0, r7)     // Catch: java.lang.Throwable -> L42
        L22:
            r7 = 0
            r2 = 1
            if (r1 >= 0) goto L36
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "no custom notification small icon! change to use app icon"
            r3[r7] = r4     // Catch: java.lang.Throwable -> L42
            com.umeng.message.common.UPLog.m15198i(r0, r3)     // Catch: java.lang.Throwable -> L42
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()     // Catch: java.lang.Throwable -> L42
            int r6 = r6.icon     // Catch: java.lang.Throwable -> L42
            r1 = r6
        L36:
            if (r1 >= 0) goto L46
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "can't find notification small icon"
            r6[r7] = r2     // Catch: java.lang.Throwable -> L42
            com.umeng.message.common.UPLog.m15197e(r0, r6)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r6 = move-exception
            com.umeng.message.common.UPLog.m15196e(r0, r6)
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengMessageHandler.getSmallIconId(android.content.Context, com.umeng.message.entity.UMessage):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1.exists() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri getSound(android.content.Context r5, com.umeng.message.entity.UMessage r6) {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = r6.isSoundFromInternet()     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L22
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L64
            java.io.File r2 = com.umeng.message.proguard.C3678f.m15759g(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r6.getSoundUri()     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.MD5(r3)     // Catch: java.lang.Throwable -> L64
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L64
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L23
        L22:
            r2 = r0
        L23:
            if (r2 != 0) goto L5d
            java.lang.String r1 = r6.getSoundUri()     // Catch: java.lang.Throwable -> L64
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L38
            java.lang.String r6 = r6.getSoundUri()     // Catch: java.lang.Throwable -> L64
            int r6 = com.umeng.message.proguard.C3553a.m15276d(r6)     // Catch: java.lang.Throwable -> L64
            goto L39
        L38:
            r6 = -1
        L39:
            if (r6 >= 0) goto L41
            java.lang.String r6 = "umeng_push_notification_default_sound"
            int r6 = com.umeng.message.proguard.C3553a.m15276d(r6)     // Catch: java.lang.Throwable -> L64
        L41:
            if (r6 <= 0) goto L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "android.resource://"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L64
            r1.append(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "/"
            r1.append(r5)     // Catch: java.lang.Throwable -> L64
            r1.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L64
        L5d:
            if (r2 == 0) goto L6a
            android.net.Uri r5 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L64
            return r5
        L64:
            r5 = move-exception
            java.lang.String r6 = "MsgHandler"
            com.umeng.message.common.UPLog.m15199w(r6, r5)
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengMessageHandler.getSound(android.content.Context, com.umeng.message.entity.UMessage):android.net.Uri");
    }

    @Override // com.umeng.message.api.UPushMessageHandler
    public void handleMessage(Context context, UMessage uMessage) {
        if (UMessage.DISPLAY_TYPE_NOTIFICATION.equals(uMessage.getDisplayType())) {
            dealWithNotificationMessage(context, uMessage);
            return;
        }
        if ("custom".equals(uMessage.getDisplayType())) {
            if (!TextUtils.isEmpty(uMessage.getRecallMsgId())) {
                try {
                    C3705x m15834a = C3705x.m15834a();
                    C3558ad m15835a = m15834a.m15835a(uMessage.getRecallMsgId());
                    if (m15835a != null) {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
                        if (notificationManager != null) {
                            notificationManager.cancel("um", m15835a.f15879a);
                        }
                        m15834a.m15838b(m15835a);
                        C3580az.m15370a(m15835a);
                        C3707z.m15843a().m15854a(uMessage.getRecallMsgId(), 4);
                    } else {
                        C3707z.m15843a().m15854a(uMessage.getRecallMsgId(), 5);
                    }
                    C3565ak.m15312a().mo15320a(uMessage.getRecallMsgId());
                    return;
                } catch (Throwable th) {
                    UPLog.m15196e("MsgHandler", th);
                    return;
                }
            }
            dealWithCustomMessage(context, uMessage);
        }
    }

    public boolean isInNoDisturbTime(Context context) {
        boolean z10;
        boolean z11;
        boolean z12;
        Calendar calendar = Calendar.getInstance();
        int i10 = (calendar.get(11) * 60) + calendar.get(12);
        if (i10 >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 <= (PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute() >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z10 && z11) {
                return true;
            }
            return false;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    public void setBadgeNum(Context context, UMessage uMessage) {
        if (uMessage.getBadgeSet() >= 0) {
            C3592bj.m15423a(context, uMessage.getBadgeSet());
            UPLog.m15198i("MsgHandler", "setBadgeNum:", Integer.valueOf(uMessage.getBadgeSet()));
        } else if (uMessage.getBadgeAdd() != 0) {
            C3592bj.m15425b(context, uMessage.getBadgeAdd());
            UPLog.m15198i("MsgHandler", "changeBadgeNum:", Integer.valueOf(uMessage.getBadgeAdd()));
        }
    }

    public NotificationChannel getNotificationChannel(Context context, UMessage uMessage) {
        return getNotificationChannel();
    }
}
