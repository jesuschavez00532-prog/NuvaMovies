package sb;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import p240mf.InterfaceC5677f;
import p240mf.InterfaceC5682k;
import p240mf.InterfaceC5694w;
import p240mf.InterfaceC5696y;
import retrofit2.Response;

/* renamed from: sb.a */
/* loaded from: classes2.dex */
public interface InterfaceC6780a {
    @InterfaceC5677f
    @InterfaceC5682k({"Connection:keep-alive", "Content-Type:application/octet-stream"})
    @InterfaceC5694w
    /* renamed from: a */
    Observable<Response<ResponseBody>> m26673a(@InterfaceC5696y String str);
}
