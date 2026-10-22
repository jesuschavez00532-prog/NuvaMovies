package p007a6;

import java.io.File;
import p038c6.AbstractC1366a0;

/* renamed from: a6.b */
/* loaded from: classes.dex */
final class C0064b extends AbstractC0092p {

    /* renamed from: a */
    private final AbstractC1366a0 f191a;

    /* renamed from: b */
    private final String f192b;

    /* renamed from: c */
    private final File f193c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0064b(AbstractC1366a0 abstractC1366a0, String str, File file) {
        if (abstractC1366a0 != null) {
            this.f191a = abstractC1366a0;
            if (str != null) {
                this.f192b = str;
                if (file != null) {
                    this.f193c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // p007a6.AbstractC0092p
    /* renamed from: b */
    public AbstractC1366a0 mo222b() {
        return this.f191a;
    }

    @Override // p007a6.AbstractC0092p
    /* renamed from: c */
    public File mo223c() {
        return this.f193c;
    }

    @Override // p007a6.AbstractC0092p
    /* renamed from: d */
    public String mo224d() {
        return this.f192b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0092p)) {
            return false;
        }
        AbstractC0092p abstractC0092p = (AbstractC0092p) obj;
        if (this.f191a.equals(abstractC0092p.mo222b()) && this.f192b.equals(abstractC0092p.mo224d()) && this.f193c.equals(abstractC0092p.mo223c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f191a.hashCode() ^ 1000003) * 1000003) ^ this.f192b.hashCode()) * 1000003) ^ this.f193c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f191a + ", sessionId=" + this.f192b + ", reportFile=" + this.f193c + "}";
    }
}
