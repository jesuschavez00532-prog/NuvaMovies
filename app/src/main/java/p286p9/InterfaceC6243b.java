package p286p9;

import com.mobile.bean.UpdateBean;
import io.reactivex.Observable;
import p240mf.InterfaceC5677f;
import p240mf.InterfaceC5691t;

/* renamed from: p9.b */
/* loaded from: classes2.dex */
public interface InterfaceC6243b {
    @InterfaceC5677f("/MarketServer/update")
    /* renamed from: a */
    Observable<UpdateBean> m24867a(@InterfaceC5691t("action") String str, @InterfaceC5691t("packagenamesAndVersioncodes") String str2, @InterfaceC5691t("language") String str3, @InterfaceC5691t("sn") String str4, @InterfaceC5691t("userId") String str5);
}
