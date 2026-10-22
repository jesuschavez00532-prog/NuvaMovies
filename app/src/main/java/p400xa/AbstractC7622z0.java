package p400xa;

/* renamed from: xa.z0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC7622z0 {
    /* renamed from: a */
    public static /* synthetic */ int m29374a(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
