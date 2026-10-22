package p366v5;

import java.util.Arrays;
import java.util.List;

/* renamed from: v5.s */
/* loaded from: classes.dex */
public class C7234s extends C7235t {

    /* renamed from: a */
    private final List f27039a;

    public C7234s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f27039a = list;
    }
}
