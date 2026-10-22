package p400xa;

import be.C1328x;
import com.lzy.okgo.model.Progress;
import com.module.event.TimeChangedEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import ne.AbstractC5868k;
import org.android.agoo.common.AgooConstants;
import p348u2.AbstractC7030g;
import ye.C7709c;

/* renamed from: xa.k1 */
/* loaded from: classes2.dex */
public final class RunnableC7583k1 implements Runnable {

    /* renamed from: a */
    private final SimpleDateFormat f27860a = new SimpleDateFormat("dd/MM/yyyy HH:mm E", Locale.getDefault());

    /* renamed from: b */
    private final Object f27861b = new Object();

    /* renamed from: c */
    private Future f27862c;

    /* renamed from: xa.k1$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final long f27863a;

        /* renamed from: b */
        private final long f27864b;

        /* renamed from: c */
        private final String f27865c;

        /* renamed from: d */
        private final String f27866d;

        /* renamed from: e */
        private final String f27867e;

        public a(long j10, long j11, String str, String str2, String str3) {
            AbstractC5868k.m23674f(str, Progress.DATE);
            AbstractC5868k.m23674f(str2, AgooConstants.MESSAGE_TIME);
            AbstractC5868k.m23674f(str3, "weekDay");
            this.f27863a = j10;
            this.f27864b = j11;
            this.f27865c = str;
            this.f27866d = str2;
            this.f27867e = str3;
        }

        /* renamed from: a */
        public final long m29101a() {
            return this.f27864b;
        }

        public String toString() {
            return "TimeInfo(delaySecond=" + this.f27863a + ", currentTimeMills=" + this.f27864b + ", date='" + this.f27865c + "', time='" + this.f27866d + "', weekDay='" + this.f27867e + "')";
        }
    }

    /* renamed from: a */
    public final void m29099a() {
        synchronized (this.f27861b) {
            Future future = this.f27862c;
            if (future != null && !future.isDone() && !future.isCancelled()) {
                future.cancel(true);
            }
            this.f27862c = null;
            this.f27862c = AbstractC7030g.m27130d().schedule(this, 0L, TimeUnit.MILLISECONDS);
            C1328x c1328x = C1328x.f4998a;
        }
    }

    /* renamed from: b */
    public final void m29100b() {
        synchronized (this.f27861b) {
            Future future = this.f27862c;
            if (future != null && !future.isDone() && !future.isCancelled()) {
                future.cancel(true);
            }
            this.f27862c = null;
            C1328x c1328x = C1328x.f4998a;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = 60000;
        long j11 = j10 - (currentTimeMillis % j10);
        String format = this.f27860a.format(new Date(currentTimeMillis));
        AbstractC5868k.m23673e(format, "formatDate");
        String substring = format.substring(0, 10);
        AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = format.substring(11, 16);
        AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring3 = format.substring(17);
        AbstractC5868k.m23673e(substring3, "this as java.lang.String).substring(startIndex)");
        a aVar = new a(j11, currentTimeMillis, substring, substring2, substring3);
        synchronized (this.f27861b) {
            this.f27862c = AbstractC7030g.m27130d().schedule(this, j11, TimeUnit.MILLISECONDS);
            C1328x c1328x = C1328x.f4998a;
        }
        C7709c.m29787d().m29801m(new TimeChangedEvent(aVar));
    }
}
