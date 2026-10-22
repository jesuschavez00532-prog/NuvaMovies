package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.ExecutorC5288a;

/* renamed from: kotlinx.coroutines.scheduling.b */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5289b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f21544a;

    static {
        int[] iArr = new int[ExecutorC5288a.c.values().length];
        f21544a = iArr;
        iArr[ExecutorC5288a.c.PARKING.ordinal()] = 1;
        iArr[ExecutorC5288a.c.BLOCKING.ordinal()] = 2;
        iArr[ExecutorC5288a.c.CPU_ACQUIRED.ordinal()] = 3;
        iArr[ExecutorC5288a.c.DORMANT.ordinal()] = 4;
        iArr[ExecutorC5288a.c.TERMINATED.ordinal()] = 5;
    }
}
