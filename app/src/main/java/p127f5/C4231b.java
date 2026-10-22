package p127f5;

/* renamed from: f5.b */
/* loaded from: classes.dex */
public final class C4231b extends IllegalStateException {
    private C4231b(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m17690a(AbstractC4245i abstractC4245i) {
        String str;
        if (!abstractC4245i.mo17711m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception mo17707i = abstractC4245i.mo17707i();
        if (mo17707i != null) {
            str = "failure";
        } else if (abstractC4245i.mo17712n()) {
            str = "result ".concat(String.valueOf(abstractC4245i.mo17708j()));
        } else if (abstractC4245i.mo17710l()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new C4231b("Complete with: ".concat(str), mo17707i);
    }
}
