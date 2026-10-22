package p254o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.d */
/* loaded from: classes.dex */
public final class C5889d {

    /* renamed from: a */
    private final Shader f23434a;

    /* renamed from: b */
    private final ColorStateList f23435b;

    /* renamed from: c */
    private int f23436c;

    private C5889d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f23434a = shader;
        this.f23435b = colorStateList;
        this.f23436c = i10;
    }

    /* renamed from: a */
    private static C5889d m23754a(Resources resources, int i10, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return m23756c(AbstractC5888c.m23747b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return m23757d(AbstractC5892g.m23787b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5889d m23755b(int i10) {
        return new C5889d(null, null, i10);
    }

    /* renamed from: c */
    static C5889d m23756c(ColorStateList colorStateList) {
        return new C5889d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C5889d m23757d(Shader shader) {
        return new C5889d(shader, null, 0);
    }

    /* renamed from: g */
    public static C5889d m23758g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m23754a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    /* renamed from: e */
    public int m23759e() {
        return this.f23436c;
    }

    /* renamed from: f */
    public Shader m23760f() {
        return this.f23434a;
    }

    /* renamed from: h */
    public boolean m23761h() {
        if (this.f23434a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m23762i() {
        ColorStateList colorStateList;
        if (this.f23434a == null && (colorStateList = this.f23435b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m23763j(int[] iArr) {
        if (m23762i()) {
            ColorStateList colorStateList = this.f23435b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f23436c) {
                this.f23436c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m23764k(int i10) {
        this.f23436c = i10;
    }

    /* renamed from: l */
    public boolean m23765l() {
        if (!m23761h() && this.f23436c == 0) {
            return false;
        }
        return true;
    }
}
