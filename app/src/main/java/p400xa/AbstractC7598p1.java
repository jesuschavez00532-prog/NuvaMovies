package p400xa;

import android.app.Activity;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import java.util.ArrayList;
import java.util.List;
import p041c9.AbstractC1438g;
import p323s2.AbstractC6652a;
import p415y9.AbstractApplicationC7689d;
import p433zd.AbstractC7786b;

/* renamed from: xa.p1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7598p1 {

    /* renamed from: a */
    private static String f27969a = "";

    /* renamed from: b */
    private static long f27970b;

    /* renamed from: a */
    public static void m29237a() {
        MediaCodecInfo[] codecInfos;
        if (Build.VERSION.SDK_INT >= 21 && !((Boolean) C7577i1.f27838b.m29084c().m29074f("app_media_codec", Boolean.FALSE)).booleanValue()) {
            codecInfos = new MediaCodecList(1).getCodecInfos();
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                arrayList.add(mediaCodecInfo.getName());
            }
            C7589m1.f27886a.m29139h(m29246j(arrayList, 3));
            C7577i1.f27838b.m29084c().m29076h("app_media_codec", Boolean.TRUE);
        }
    }

    /* renamed from: b */
    public static Long m29238b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Long.valueOf(Long.valueOf(statFs.getAvailableBlocksLong()).longValue() * Long.valueOf(statFs.getBlockSizeLong()).longValue());
    }

    /* renamed from: c */
    public static String m29239c() {
        String str = (String) C1466m0.f5627a.m6872j("KEY_APP_CHANNEL", "");
        if (TextUtils.isEmpty(str)) {
            str = AbstractC1438g.m6698b(AbstractApplicationC7689d.f28136e);
        }
        if (str == null) {
            str = "default";
        }
        return "?cc=" + AbstractC7551a.m28931a(str, "b7dd0cbae57072d2", AbstractC7551a.m28932b());
    }

    /* renamed from: d */
    public static String m29240d() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    /* renamed from: e */
    public static boolean m29241e(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static void m29242f(Context context, String str, int... iArr) {
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_toast, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R$id.textView_txt);
        ImageView imageView = (ImageView) inflate.findViewById(R$id.imageView_img);
        textView.setText(str);
        if (iArr != null && iArr.length > 0) {
            imageView.setBackgroundResource(iArr[0]);
        }
        Toast makeText = Toast.makeText(context, str, 1);
        AbstractC6652a.m25971a(makeText);
        makeText.setGravity(80, 0, AbstractC7786b.m30163g(140));
        makeText.setView(inflate);
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            makeText.show();
        }
    }

    /* renamed from: g */
    public static void m29243g(Context context, String str, int... iArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (context != null) {
            if (!f27969a.equals(str) || elapsedRealtime - f27970b >= 2500) {
                f27970b = elapsedRealtime;
                f27969a = str;
                View inflate = LayoutInflater.from(context).inflate(R$layout.layout_play_not_vip_toast, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R$id.textView_txt);
                ImageView imageView = (ImageView) inflate.findViewById(R$id.imageView_img);
                textView.setText(str);
                if (iArr != null && iArr.length > 0) {
                    imageView.setBackgroundResource(iArr[0]);
                }
                Toast makeText = Toast.makeText(context, str, 1);
                AbstractC6652a.m25971a(makeText);
                makeText.setGravity(80, 0, AbstractC7786b.m30163g(240));
                makeText.setView(inflate);
                makeText.show();
            }
        }
    }

    /* renamed from: h */
    public static void m29244h(Context context, String str, int... iArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (context != null) {
            if (!f27969a.equals(str) || elapsedRealtime - f27970b >= 2500) {
                f27970b = elapsedRealtime;
                f27969a = str;
                View inflate = LayoutInflater.from(context).inflate(R$layout.layout_toast, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R$id.textView_txt);
                ImageView imageView = (ImageView) inflate.findViewById(R$id.imageView_img);
                textView.setText(str);
                if (iArr != null && iArr.length > 0) {
                    imageView.setBackgroundResource(iArr[0]);
                }
                Toast makeText = Toast.makeText(context, str, 1);
                AbstractC6652a.m25971a(makeText);
                makeText.setGravity(80, 0, AbstractC7786b.m30163g(240));
                makeText.setView(inflate);
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    makeText.show();
                }
            }
        }
    }

    /* renamed from: i */
    public static void m29245i(Context context, String str, int... iArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (context != null) {
            if (!f27969a.equals(str) || elapsedRealtime - f27970b >= 2500) {
                f27970b = elapsedRealtime;
                f27969a = str;
                View inflate = LayoutInflater.from(context).inflate(R$layout.layout_toast, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R$id.textView_txt);
                ImageView imageView = (ImageView) inflate.findViewById(R$id.imageView_img);
                textView.setText(str);
                if (iArr != null && iArr.length > 0) {
                    imageView.setBackgroundResource(iArr[0]);
                }
                Toast makeText = Toast.makeText(context, str, 1);
                AbstractC6652a.m25971a(makeText);
                makeText.setGravity(17, 0, 0);
                makeText.setView(inflate);
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    makeText.show();
                }
            }
        }
    }

    /* renamed from: j */
    private static List m29246j(List list, int i10) {
        int i11;
        int size = list.size();
        if (size % i10 == 0) {
            i11 = size / i10;
        } else {
            i11 = (size / i10) + 1;
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 * i10;
            i12++;
            arrayList.add(list.subList(i13, Math.min(i12 * i10, size)));
        }
        return arrayList;
    }
}
