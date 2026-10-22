package p184j1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 j1.b, still in use, count: 1, list:
  (r0v0 j1.b) from 0x001a: SPUT (r0v0 j1.b) (LINE:27) j1.b.c j1.b
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j1.b */
/* loaded from: classes.dex */
public final class EnumC4971b {


    /* renamed from: c */
    public static final EnumC4971b f20704c = new EnumC4971b();

    static {
    }

    private EnumC4971b() {
    }

    public static EnumC4971b valueOf(String str) {
        return (EnumC4971b) Enum.valueOf(EnumC4971b.class, str);
    }

    public static EnumC4971b[] values() {
        return (EnumC4971b[]) f20705d.clone();
    }
}
