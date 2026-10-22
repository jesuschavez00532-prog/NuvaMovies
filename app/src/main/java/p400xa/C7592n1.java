package p400xa;

import org.android.agoo.message.MessageService;
import p315r9.InterfaceC6564b;

/* renamed from: xa.n1 */
/* loaded from: classes2.dex */
public class C7592n1 implements InterfaceC6564b {
    @Override // p315r9.InterfaceC6564b
    /* renamed from: a */
    public void mo25625a(String str, String str2) {
        C7575i.f27835a.m29067c(str2, "download_read_md5_fail", str, 0L, 0, null, null, null);
    }

    @Override // p315r9.InterfaceC6564b
    /* renamed from: b */
    public void mo25626b(String str, long j10, String str2) {
        C7575i.f27835a.m29067c(MessageService.MSG_DB_READY_REPORT, "install", "", 0L, 0, str, Long.valueOf(j10), str2);
    }

    @Override // p315r9.InterfaceC6564b
    /* renamed from: c */
    public void mo25627c(String str, long j10, int i10, String str2, long j11, String str3) {
        C7575i.f27835a.m29067c(MessageService.MSG_DB_READY_REPORT, "download", str, j10, i10, str2, Long.valueOf(j11), str3);
    }

    @Override // p315r9.InterfaceC6564b
    /* renamed from: d */
    public void mo25628d(String str, String str2) {
        C7575i.f27835a.m29067c(str2, "download", str, 0L, 0, null, null, null);
    }

    @Override // p315r9.InterfaceC6564b
    /* renamed from: e */
    public void mo25629e(String str, String str2) {
        C7575i.f27835a.m29067c(str2, "MarketServer/update", str, 0L, 0, null, null, null);
    }
}
