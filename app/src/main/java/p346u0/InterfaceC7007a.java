package p346u0;

import com.advertlib.bean.AdvertResult;
import com.advertlib.bean.ReportResult;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p240mf.InterfaceC5672a;
import p240mf.InterfaceC5677f;
import p240mf.InterfaceC5682k;
import p240mf.InterfaceC5686o;
import p240mf.InterfaceC5690s;
import p240mf.InterfaceC5694w;
import p240mf.InterfaceC5696y;
import retrofit2.Call;

/* renamed from: u0.a */
/* loaded from: classes.dex */
public interface InterfaceC7007a {
    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/adserver/report")
    /* renamed from: a */
    Observable<ReportResult> m27050a(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a RequestBody requestBody);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/adserver/v2/get_content")
    /* renamed from: b */
    Observable<AdvertResult> m27051b(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a RequestBody requestBody);

    @InterfaceC5677f
    @InterfaceC5694w
    /* renamed from: c */
    Call<ResponseBody> m27052c(@InterfaceC5696y String str);
}
