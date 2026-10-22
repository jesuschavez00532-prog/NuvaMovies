package sb;

import com.request.bean.SubTitleResult;
import io.reactivex.Observable;
import p240mf.InterfaceC5672a;
import p240mf.InterfaceC5682k;
import p240mf.InterfaceC5686o;
import p240mf.InterfaceC5690s;

/* renamed from: sb.c */
/* loaded from: classes2.dex */
public interface InterfaceC6782c {
    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/subs/terminal/metadata")
    /* renamed from: a */
    Observable<SubTitleResult> m26765a(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);
}
