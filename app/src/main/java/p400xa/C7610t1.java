package p400xa;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractC0729o;
import com.lzy.okgo.cookie.SerializableCookie;
import com.module.R$array;
import com.module.event.AwakenVoiceAssistEvent;
import com.umeng.analytics.pro.C3384f;
import com.umeng.umcrash.UMCrash;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p161ha.C4774h1;
import p359ue.AbstractC7166t;
import p430z9.AbstractActivityC7763a;
import ye.C7709c;

/* renamed from: xa.t1 */
/* loaded from: classes2.dex */
public final class C7610t1 {

    /* renamed from: a */
    public static final C7610t1 f27984a;

    /* renamed from: b */
    private static final String f27985b;

    /* renamed from: c */
    private static final Uri f27986c;

    /* renamed from: d */
    private static Context f27987d;

    /* renamed from: e */
    private static ContentObserver f27988e;

    /* renamed from: f */
    private static C4774h1 f27989f;

    /* renamed from: g */
    private static String[] f27990g;

    /* renamed from: h */
    private static AwakenVoiceAssistEvent f27991h;

    /* renamed from: xa.t1$a */
    /* loaded from: classes2.dex */
    public static final class a extends ContentObserver {

        /* renamed from: a */
        private String[] f27992a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Handler handler, String[] strArr) {
            super(handler);
            AbstractC5868k.m23674f(handler, "handler");
            AbstractC5868k.m23674f(strArr, "meaningWords");
            this.f27992a = strArr;
        }

        /* renamed from: a */
        private final String m29272a(String str, int i10) {
            if (i10 >= 0) {
                String[] strArr = this.f27992a;
                if (strArr.length > i10) {
                    String substring = str.substring(strArr[i10].length());
                    AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
                    return substring;
                }
                return str;
            }
            return str;
        }

        /* renamed from: b */
        private final int m29273b(String str) {
            boolean m27729p;
            String[] strArr = this.f27992a;
            int length = strArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                m27729p = AbstractC7166t.m27729p(str, strArr[i10], true);
                if (m27729p) {
                    return i11;
                }
                i10++;
                i11 = i12;
            }
            return -1;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            boolean z11;
            String str;
            int i10 = 0;
            super.onChange(z10);
            Context context = C7610t1.f27987d;
            AbstractC5868k.m23671c(context);
            Cursor query = context.getContentResolver().query(C7610t1.f27986c, null, null, null, null);
            boolean z12 = true;
            if (query != null && query.moveToNext()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                String string = query.getString(query.getColumnIndex(SerializableCookie.NAME));
                int columnIndex = query.getColumnIndex("command");
                int columnIndex2 = query.getColumnIndex("type");
                String str2 = "";
                if (columnIndex == -1 || columnIndex2 == -1) {
                    str = "";
                    i10 = -1;
                } else {
                    i10 = query.getInt(columnIndex);
                    str = query.getString(columnIndex2);
                }
                if (string != null && string.length() != 0) {
                    z12 = false;
                }
                if (!z12 && C1224f.f4816e.m5632c()) {
                    AbstractC5868k.m23673e(string, "voiceMsg");
                    int m29273b = m29273b(string);
                    if (m29273b != -1) {
                        AbstractC5868k.m23673e(string, "voiceMsg");
                        string = m29272a(string, m29273b);
                    }
                    C7709c m29787d = C7709c.m29787d();
                    AbstractC5868k.m23673e(string, "voiceMsg");
                    if (str != null) {
                        str2 = str;
                    }
                    m29787d.m29801m(new AwakenVoiceAssistEvent(i10, string, str2));
                } else {
                    return;
                }
            }
            if (query != null) {
                query.close();
            }
        }
    }

    /* renamed from: xa.t1$b */
    /* loaded from: classes2.dex */
    public static final class b implements C4774h1.a {
        b() {
        }

        @Override // p161ha.C4774h1.a
        /* renamed from: a */
        public void mo19755a() {
            C7610t1.f27989f = null;
        }
    }

    static {
        C7610t1 c7610t1 = new C7610t1();
        f27984a = c7610t1;
        f27985b = c7610t1.getClass().getSimpleName();
        f27986c = Uri.parse("content://com.assistant.voice.provider/message");
        f27990g = new String[0];
    }

    private C7610t1() {
    }

    /* renamed from: g */
    private final String[] m29265g(Context context) {
        boolean z10;
        if (f27990g.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String[] stringArray = context.getResources().getStringArray(R$array.meaning_words);
            AbstractC5868k.m23673e(stringArray, "context.resources.getStr…ay(R.array.meaning_words)");
            f27990g = stringArray;
        }
        return f27990g;
    }

    /* renamed from: d */
    public final void m29266d(AbstractActivityC7763a abstractActivityC7763a, AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "voiceMsg");
        C4774h1 c4774h1 = f27989f;
        boolean z10 = false;
        if (c4774h1 != null && c4774h1.m3079D7()) {
            z10 = true;
        }
        if (z10) {
            C4774h1 c4774h12 = f27989f;
            if (c4774h12 != null) {
                c4774h12.m19748V9(awakenVoiceAssistEvent);
            }
            C4774h1 c4774h13 = f27989f;
            if (c4774h13 != null) {
                c4774h13.m19750X9();
                return;
            }
            return;
        }
        C4774h1 c4774h14 = new C4774h1();
        f27989f = c4774h14;
        c4774h14.m19748V9(awakenVoiceAssistEvent);
        C4774h1 c4774h15 = f27989f;
        if (c4774h15 != null) {
            c4774h15.m19747U9(new b());
        }
        C4774h1 c4774h16 = f27989f;
        if (c4774h16 != null) {
            AbstractC0729o m3294d4 = abstractActivityC7763a.m3294d4();
            AbstractC5868k.m23673e(m3294d4, "activity.supportFragmentManager");
            c4774h16.mo3277E9(m3294d4, "voice_assist");
        }
    }

    /* renamed from: e */
    public final void m29267e() {
        Dialog m3280r9;
        C4774h1 c4774h1 = f27989f;
        if (c4774h1 != null && (m3280r9 = c4774h1.m3280r9()) != null) {
            m3280r9.cancel();
        }
    }

    /* renamed from: f */
    public final AwakenVoiceAssistEvent m29268f() {
        return f27991h;
    }

    /* renamed from: h */
    public final void m29269h(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        try {
            f27987d = context.getApplicationContext();
            a aVar = new a(new Handler(Looper.getMainLooper()), m29265g(context));
            f27988e = aVar;
            if (!(aVar instanceof a)) {
                aVar = null;
            }
            if (aVar != null) {
                Context context2 = f27987d;
                AbstractC5868k.m23671c(context2);
                context2.getContentResolver().registerContentObserver(f27986c, true, aVar);
            }
        } catch (Exception e10) {
            UMCrash.generateCustomLog(e10, "voice");
        }
    }

    /* renamed from: i */
    public final void m29270i(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        f27991h = awakenVoiceAssistEvent;
    }

    /* renamed from: j */
    public final void m29271j(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (f27988e != null) {
            ContentResolver contentResolver = context.getContentResolver();
            ContentObserver contentObserver = f27988e;
            AbstractC5868k.m23671c(contentObserver);
            contentResolver.unregisterContentObserver(contentObserver);
        }
    }
}
