package p254o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p345u.C7003d;

/* renamed from: o.f */
/* loaded from: classes.dex */
public abstract class AbstractC5891f {

    /* renamed from: o.f$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: o.f$b */
    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a */
        private final c[] f23437a;

        public b(c[] cVarArr) {
            this.f23437a = cVarArr;
        }

        /* renamed from: a */
        public c[] m23775a() {
            return this.f23437a;
        }
    }

    /* renamed from: o.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final String f23438a;

        /* renamed from: b */
        private int f23439b;

        /* renamed from: c */
        private boolean f23440c;

        /* renamed from: d */
        private String f23441d;

        /* renamed from: e */
        private int f23442e;

        /* renamed from: f */
        private int f23443f;

        public c(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f23438a = str;
            this.f23439b = i10;
            this.f23440c = z10;
            this.f23441d = str2;
            this.f23442e = i11;
            this.f23443f = i12;
        }

        /* renamed from: a */
        public String m23776a() {
            return this.f23438a;
        }

        /* renamed from: b */
        public int m23777b() {
            return this.f23443f;
        }

        /* renamed from: c */
        public int m23778c() {
            return this.f23442e;
        }

        /* renamed from: d */
        public String m23779d() {
            return this.f23441d;
        }

        /* renamed from: e */
        public int m23780e() {
            return this.f23439b;
        }

        /* renamed from: f */
        public boolean m23781f() {
            return this.f23440c;
        }
    }

    /* renamed from: o.f$d */
    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final C7003d f23444a;

        /* renamed from: b */
        private final int f23445b;

        /* renamed from: c */
        private final int f23446c;

        /* renamed from: d */
        private final String f23447d;

        public d(C7003d c7003d, int i10, int i11, String str) {
            this.f23444a = c7003d;
            this.f23446c = i10;
            this.f23445b = i11;
            this.f23447d = str;
        }

        /* renamed from: a */
        public int m23782a() {
            return this.f23446c;
        }

        /* renamed from: b */
        public C7003d m23783b() {
            return this.f23444a;
        }

        /* renamed from: c */
        public String m23784c() {
            return this.f23447d;
        }

        /* renamed from: d */
        public int m23785d() {
            return this.f23445b;
        }
    }

    /* renamed from: a */
    private static int m23767a(TypedArray typedArray, int i10) {
        int type;
        if (Build.VERSION.SDK_INT >= 21) {
            type = typedArray.getType(i10);
            return type;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static a m23768b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m23770d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List m23769c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m23767a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(m23774h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m23774h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static a m23770d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m23771e(xmlPullParser, resources);
        }
        m23773g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static a m23771e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.f2177c);
        String string = obtainAttributes.getString(R$styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m23773g(xmlPullParser);
            }
            return new d(new C7003d(string, string2, string3, m23769c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m23772f(xmlPullParser, resources));
                } else {
                    m23773g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    /* renamed from: f */
    private static c m23772f(XmlPullParser xmlPullParser, Resources resources) {
        boolean z10 = false;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.f2178d);
        int i10 = R$styleable.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = R$styleable.FontFamilyFont_android_fontWeight;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = R$styleable.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = R$styleable.FontFamilyFont_android_fontStyle;
        }
        if (1 == obtainAttributes.getInt(i12, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = R$styleable.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = R$styleable.FontFamilyFont_android_ttcIndex;
        }
        int i14 = R$styleable.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = R$styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = R$styleable.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = R$styleable.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m23773g(xmlPullParser);
        }
        return new c(string2, i11, z10, string, i15, resourceId);
    }

    /* renamed from: g */
    private static void m23773g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i10--;
                }
            } else {
                i10++;
            }
        }
    }

    /* renamed from: h */
    private static List m23774h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
