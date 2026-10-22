package p169i1;

import android.util.Log;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p109e2.AbstractC4121k;
import p109e2.C4113c;
import p184j1.C4974e;
import p184j1.EnumC4970a;
import p278p1.C6169i;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public class C4841a implements InterfaceC1604d, Callback {

    /* renamed from: a */
    private final Call.Factory f20323a;

    /* renamed from: b */
    private final C6169i f20324b;

    /* renamed from: c */
    private InputStream f20325c;

    /* renamed from: d */
    private ResponseBody f20326d;

    /* renamed from: e */
    private InterfaceC1604d.a f20327e;

    /* renamed from: f */
    private volatile Call f20328f;

    public C4841a(Call.Factory factory, C6169i c6169i) {
        this.f20323a = factory;
        this.f20324b = c6169i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: a */
    public Class mo7418a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: b */
    public void mo7423b() {
        try {
            InputStream inputStream = this.f20325c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f20326d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f20327e = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public void cancel() {
        Call call = this.f20328f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: d */
    public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
        Request.Builder url = new Request.Builder().url(this.f20324b.m24644h());
        for (Map.Entry entry : this.f20324b.m24643e().entrySet()) {
            url.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        Request build = url.build();
        this.f20327e = aVar;
        this.f20328f = this.f20323a.newCall(build);
        this.f20328f.enqueue(this);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public EnumC4970a getDataSource() {
        return EnumC4970a.REMOTE;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f20327e.mo7430c(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f20326d = response.body();
        if (response.isSuccessful()) {
            InputStream m17201b = C4113c.m17201b(this.f20326d.byteStream(), ((ResponseBody) AbstractC4121k.m17226d(this.f20326d)).contentLength());
            this.f20325c = m17201b;
            this.f20327e.mo7431e(m17201b);
            return;
        }
        this.f20327e.mo7430c(new C4974e(response.message(), response.code()));
    }
}
