package ac;

import com.request.result.GetLiveDataResult;
import com.request.result.GetLiveDataResultData;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p185j2.C4982a;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6396j0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.r0 */
/* loaded from: classes2.dex */
public final class C0199r0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f555b;

    /* renamed from: ac.r0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ int f557c;

        a(int i10) {
            this.f557c = i10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetLiveDataResult getLiveDataResult) {
            boolean z10;
            String str;
            AbstractC5868k.m23674f(getLiveDataResult, "t");
            super.onNext(getLiveDataResult);
            if (AbstractC5868k.m23669a(getLiveDataResult.getReturnCode(), "304")) {
                ((InterfaceC6396j0) C0199r0.this.m618a()).mo19519O1(getLiveDataResult, this.f557c);
                return;
            }
            if (getLiveDataResult.getData() != null) {
                GetLiveDataResultData data = getLiveDataResult.getData();
                AbstractC5868k.m23671c(data);
                if (!AbstractC6567a.m25635e(data.getChannelList())) {
                    GetLiveDataResultData data2 = getLiveDataResult.getData();
                    AbstractC5868k.m23671c(data2);
                    String dataVersion = data2.getDataVersion();
                    if (dataVersion != null && dataVersion.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        GetLiveDataResultData data3 = getLiveDataResult.getData();
                        AbstractC5868k.m23671c(data3);
                        String dataVersion2 = data3.getDataVersion();
                        AbstractC5868k.m23671c(dataVersion2);
                        GetLiveDataResultData data4 = getLiveDataResult.getData();
                        String str2 = null;
                        if (data4 != null) {
                            str = data4.getExpireTimeStr();
                        } else {
                            str = null;
                        }
                        if (AbstractC6567a.m25637g(str)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(dataVersion2);
                            sb2.append(';');
                            GetLiveDataResultData data5 = getLiveDataResult.getData();
                            if (data5 != null) {
                                str2 = data5.getExpireTimeStr();
                            }
                            sb2.append(str2);
                            dataVersion2 = sb2.toString();
                        }
                        C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), String.valueOf(this.f557c), dataVersion2);
                    }
                    ((InterfaceC6396j0) C0199r0.this.m618a()).mo19519O1(getLiveDataResult, this.f557c);
                    return;
                }
            }
            if (AbstractC5868k.m23669a(getLiveDataResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                GetLiveDataResultData data6 = getLiveDataResult.getData();
                AbstractC5868k.m23671c(data6);
                if (AbstractC6567a.m25635e(data6.getChannelList())) {
                    ((InterfaceC6396j0) C0199r0.this.m618a()).mo19518E4("portal100023", this.f557c);
                    return;
                }
            }
            String returnCode = getLiveDataResult.getReturnCode();
            if (returnCode != null) {
                ((InterfaceC6396j0) C0199r0.this.m618a()).mo19518E4(returnCode, this.f557c);
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6396j0) C0199r0.this.m618a()).mo19518E4(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f557c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199r0(InterfaceC6396j0 interfaceC6396j0) {
        super(interfaceC6396j0);
        AbstractC5868k.m23674f(interfaceC6396j0, "view");
        this.f555b = C0199r0.class.getSimpleName();
    }

    /* renamed from: c */
    public static /* synthetic */ void m717c(C0199r0 c0199r0, int i10, String str, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        c0199r0.m718b(i10, str, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m718b(int r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = "dataVersion"
            ne.AbstractC5868k.m23674f(r11, r0)
            java.lang.String r0 = ";"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r11
            java.util.List r1 = p359ue.AbstractC7157k.m27692R(r1, r2, r3, r4, r5, r6)
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L55
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r11
            java.util.List r1 = p359ue.AbstractC7157k.m27692R(r3, r4, r5, r6, r7, r8)
            int r1 = r1.size()
            if (r1 <= r2) goto L55
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r11
            java.util.List r1 = p359ue.AbstractC7157k.m27692R(r3, r4, r5, r6, r7, r8)
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r3 = r11
            java.util.List r11 = p359ue.AbstractC7157k.m27692R(r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            r0 = r11
            r11 = r1
            goto L57
        L55:
            java.lang.String r0 = ""
        L57:
            bc.f$b r1 = p030bc.C1224f.f4816e
            bc.f r1 = r1.m5631a()
            io.reactivex.Observable r11 = r1.m5564M(r10, r11, r0)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.m20294io()
            io.reactivex.Observable r11 = r11.subscribeOn(r0)
            java.lang.String r0 = "PortalHelper.get().getLi…scribeOn(Schedulers.io())"
            ne.AbstractC5868k.m23673e(r11, r0)
            if (r12 == 0) goto L7b
            java.lang.Object r12 = r9.m618a()
            qb.j0 r12 = (p301qb.InterfaceC6396j0) r12
            fd.b r12 = r12.mo523N3()
            goto L7c
        L7b:
            r12 = 0
        L7c:
            io.reactivex.Observable r11 = p317rb.AbstractC6567a.m25631a(r11, r12)
            ac.r0$a r12 = new ac.r0$a
            r12.<init>(r10)
            r11.subscribe(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0199r0.m718b(int, java.lang.String, boolean):void");
    }
}
