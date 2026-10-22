package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.umeng.message.proguard.ag */
/* loaded from: classes3.dex */
public class AsyncTaskC3561ag extends AsyncTask<String, Void, Bitmap[]> {

    /* renamed from: b */
    private static final String f15893b = "com.umeng.message.proguard.ag";

    /* renamed from: a */
    public a f15894a;

    /* renamed from: c */
    private String f15895c;

    /* renamed from: d */
    private BitmapFactory.Options f15896d;

    /* renamed from: com.umeng.message.proguard.ag$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo15265a(Bitmap[] bitmapArr);
    }

    public AsyncTaskC3561ag(Context context, UInAppMessage uInAppMessage) {
        this.f15895c = C3678f.m15744a(context, uInAppMessage.msg_id);
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            BitmapFactory.Options options = new BitmapFactory.Options();
            this.f15896d = options;
            options.inSampleSize = m15292a(uInAppMessage, i10, i11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap[] doInBackground(String... strArr) {
        Bitmap decodeStream;
        boolean z10;
        FileOutputStream fileOutputStream;
        Bitmap[] bitmapArr = new Bitmap[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            try {
                String str = strArr[i10];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.hashCode());
                if (!new File(this.f15895c, sb2.toString()).exists()) {
                    Bitmap m15293a = m15293a(strArr[i10]);
                    bitmapArr[i10] = m15293a;
                    if (m15293a == null) {
                        String str2 = strArr[i10];
                        String str3 = f15893b;
                        UMLog.mutlInfo(str3, 2, "Downloading image start");
                        URLConnection openConnection = new URL(str2).openConnection();
                        openConnection.connect();
                        InputStream inputStream = openConnection.getInputStream();
                        if (this.f15896d == null) {
                            decodeStream = BitmapFactory.decodeStream(inputStream);
                        } else {
                            UMLog.mutlInfo(str3, 2, "decode options");
                            decodeStream = BitmapFactory.decodeStream(inputStream, null, this.f15896d);
                        }
                        inputStream.close();
                        UMLog.mutlInfo(str3, 2, "Downloading image finish");
                        bitmapArr[i10] = decodeStream;
                        String str4 = strArr[i10];
                        if (decodeStream != null) {
                            try {
                                File file = new File(this.f15895c);
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str4.hashCode());
                                fileOutputStream = new FileOutputStream(new File(this.f15895c, sb3.toString()));
                                z10 = decodeStream.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            } catch (Exception e10) {
                                e = e10;
                                z10 = false;
                            }
                            try {
                                fileOutputStream.close();
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                                UMLog.mutlInfo(f15893b, 2, "store bitmap".concat(String.valueOf(z10)));
                            }
                            UMLog.mutlInfo(f15893b, 2, "store bitmap".concat(String.valueOf(z10)));
                        }
                    }
                } else {
                    bitmapArr[i10] = m15293a(strArr[i10]);
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        }
        return bitmapArr;
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        Bitmap[] bitmapArr2 = bitmapArr;
        super.onPostExecute(bitmapArr2);
        for (Bitmap bitmap : bitmapArr2) {
            if (bitmap == null) {
                return;
            }
        }
        a aVar = this.f15894a;
        if (aVar != null) {
            aVar.mo15265a(bitmapArr2);
        }
    }

    /* renamed from: a */
    private Bitmap m15293a(String str) {
        Bitmap bitmap = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            bitmap = BitmapFactory.decodeFile(this.f15895c + sb2.toString());
            UMLog.mutlInfo(f15893b, 2, "load from local");
            return bitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: a */
    private static int m15292a(UInAppMessage uInAppMessage, int i10, int i11) {
        int i12 = uInAppMessage.height;
        int i13 = uInAppMessage.width;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }
}
