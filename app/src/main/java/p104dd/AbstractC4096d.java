package p104dd;

import com.umeng.analytics.pro.C3325bt;
import p418yc.C7705h;
import vc.EnumC7255c;
import vc.EnumC7256d;
import vc.EnumC7257e;

/* renamed from: dd.d */
/* loaded from: classes.dex */
public abstract class AbstractC4096d {
    /* renamed from: a */
    public static void m17151a(String str) {
        C7705h.f28256m.m29771a().m29764u(EnumC7256d.SYS_EVENT_TYPE_APP, EnumC7257e.NONE, m17156f(str));
    }

    /* renamed from: b */
    public static void m17152b(String str, String str2) {
        C7705h.f28256m.m29771a().m29764u(EnumC7256d.SYS_EVENT_TYPE_DEVICE, m17155e(str), m17156f(str2));
    }

    /* renamed from: c */
    public static void m17153c(String str, String str2) {
        C7705h.f28256m.m29771a().m29764u(EnumC7256d.SYS_EVENT_TYPE_KEY, m17157g(str), m17156f(str2));
    }

    /* renamed from: d */
    public static void m17154d(String str, String str2) {
        C7705h.f28256m.m29771a().m29764u(EnumC7256d.SYS_EVENT_TYPE_NET, m17158h(str), m17156f(str2));
    }

    /* renamed from: e */
    private static EnumC7257e m17155e(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -331239923:
                if (str.equals(C3325bt.f14181Z)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3083677:
                if (str.equals("disk")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3500592:
                if (str.equals("ring")) {
                    c10 = 2;
                    break;
                }
                break;
            case 104086693:
                if (str.equals("mouse")) {
                    c10 = 3;
                    break;
                }
                break;
            case 503739367:
                if (str.equals("keyboard")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return EnumC7257e.DEVICE_TYPE_BATTERY;
            case 1:
                return EnumC7257e.DEVICE_TYPE_DISK;
            case 2:
                return EnumC7257e.DEVICE_TYPE_RING;
            case 3:
                return EnumC7257e.DEVICE_TYPE_MOUSE;
            case 4:
                return EnumC7257e.DEVICE_TYPE_KEYBOARD;
            default:
                return EnumC7257e.NONE;
        }
    }

    /* renamed from: f */
    private static EnumC7255c m17156f(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -934426579:
                if (str.equals("resume")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c10 = 1;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return EnumC7255c.EVENT_TYPE_RESUME;
            case 1:
                return EnumC7255c.EVENT_TYPE_STOP;
            case 2:
                return EnumC7255c.EVENT_TYPE_PAUSE;
            case 3:
                return EnumC7255c.EVENT_TYPE_START;
            default:
                return EnumC7255c.EVENT_TYPE_START;
        }
    }

    /* renamed from: g */
    private static EnumC7257e m17157g(String str) {
        str.hashCode();
        if (!str.equals("home")) {
            if (!str.equals("task")) {
                return EnumC7257e.NONE;
            }
            return EnumC7257e.KEY_TYPE_TASK;
        }
        return EnumC7257e.KEY_TYPE_HOME;
    }

    /* renamed from: h */
    private static EnumC7257e m17158h(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -916596374:
                if (str.equals("cellular")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3652034:
                if (str.equals("wlan")) {
                    c10 = 1;
                    break;
                }
                break;
            case 113139839:
                if (str.equals("wired")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return EnumC7257e.NET_TYPE_CELLULAR;
            case 1:
                return EnumC7257e.NET_TYPE_WLAN;
            case 2:
                return EnumC7257e.NET_TYPE_WIRED;
            default:
                return EnumC7257e.NONE;
        }
    }
}
