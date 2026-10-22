package p324s3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: s3.j */
/* loaded from: classes.dex */
abstract class AbstractC6662j {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m26029a() {
        return new ExecutorC6665m(Executors.newSingleThreadExecutor());
    }
}
