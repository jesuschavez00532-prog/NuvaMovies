package p422z1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C7739b {

    /* renamed from: a */
    private final List f28488a = new ArrayList();

    /* renamed from: a */
    public synchronized void m29922a(ImageHeaderParser imageHeaderParser) {
        this.f28488a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m29923b() {
        return this.f28488a;
    }
}
