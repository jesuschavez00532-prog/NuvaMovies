package p004a3;

import com.dcs.bean.V1Result;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import p240mf.InterfaceC5672a;
import p240mf.InterfaceC5680i;
import p240mf.InterfaceC5682k;
import p240mf.InterfaceC5686o;
import p240mf.InterfaceC5690s;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public interface InterfaceC0016a {
    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("/n1/{fake-value1}/{fake-value2}")
    /* renamed from: a */
    Observable<V1Result> m136a(@InterfaceC5690s("fake-value1") String str, @InterfaceC5690s("fake-value2") String str2, @InterfaceC5680i("ETag") String str3, @InterfaceC5672a RequestBody requestBody);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("/v1/{fake-value1}/{fake-value2}")
    /* renamed from: b */
    Observable<V1Result> m137b(@InterfaceC5690s("fake-value1") String str, @InterfaceC5690s("fake-value2") String str2, @InterfaceC5680i("ETag") String str3, @InterfaceC5672a RequestBody requestBody);
}
