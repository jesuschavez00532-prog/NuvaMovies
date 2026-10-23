package p172i4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p219l4.AbstractC5391n;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public class ServiceConnectionC4852a implements ServiceConnection {

    /* renamed from: a */
    boolean f20333a = false;

    /* renamed from: b */
    private final BlockingQueue f20334b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m20014a(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        AbstractC5391n.m21782h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f20333a) {
            this.f20333a = true;
            IBinder iBinder = (IBinder) this.f20334b.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20334b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
