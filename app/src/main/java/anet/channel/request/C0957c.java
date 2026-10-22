package anet.channel.request;

import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;

/* renamed from: anet.channel.request.c */
/* loaded from: classes.dex */
public class C0957c implements Cancelable {
    public static final C0957c NULL = new C0957c(null, 0, null);

    /* renamed from: a */
    private final int f3994a;

    /* renamed from: b */
    private final SpdySession f3995b;

    /* renamed from: c */
    private final String f3996c;

    public C0957c(SpdySession spdySession, int i10, String str) {
        this.f3995b = spdySession;
        this.f3994a = i10;
        this.f3996c = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        int i10;
        try {
            if (this.f3995b != null && (i10 = this.f3994a) != 0) {
                ALog.m4788i("awcn.TnetCancelable", "cancel tnet request", this.f3996c, "streamId", Integer.valueOf(i10));
                this.f3995b.streamReset(this.f3994a, 5);
            }
        } catch (SpdyErrorException e10) {
            ALog.m4786e("awcn.TnetCancelable", "request cancel failed.", this.f3996c, e10, Constants.KEY_ERROR_CODE, Integer.valueOf(e10.SpdyErrorGetCode()));
        }
    }
}
