package com.taobao.accs;

import android.content.Context;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import java.net.URL;
import java.util.Map;

/* renamed from: com.taobao.accs.b */
/* loaded from: classes.dex */
public interface InterfaceC3118b {
    /* renamed from: a */
    String mo12670a(Context context, ACCSManager.AccsRequest accsRequest);

    /* renamed from: a */
    String mo12671a(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo);

    /* renamed from: a */
    String mo12672a(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z10);

    /* renamed from: a */
    String mo12673a(Context context, String str, String str2, byte[] bArr, String str3);

    /* renamed from: a */
    String mo12674a(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    /* renamed from: a */
    String mo12675a(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    /* renamed from: a */
    void mo12676a(Context context);

    @Deprecated
    /* renamed from: a */
    void mo12677a(Context context, int i10);

    /* renamed from: a */
    void mo12678a(Context context, ILoginInfo iLoginInfo);

    /* renamed from: a */
    void mo12679a(Context context, String str);

    /* renamed from: a */
    void mo12680a(Context context, String str, int i10);

    /* renamed from: a */
    void mo12681a(Context context, String str, AccsAbstractDataListener accsAbstractDataListener);

    /* renamed from: a */
    void mo12682a(Context context, String str, String str2);

    /* renamed from: a */
    void mo12683a(Context context, String str, String str2, IAppReceiver iAppReceiver);

    /* renamed from: a */
    void mo12684a(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver);

    /* renamed from: a */
    void mo12685a(Context context, String str, boolean z10);

    /* renamed from: a */
    void mo12686a(AccsClientConfig accsClientConfig);

    /* renamed from: a */
    void mo12687a(AccsConnectStateListener accsConnectStateListener);

    /* renamed from: a */
    void mo12688a(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map);

    /* renamed from: a */
    boolean mo12689a();

    /* renamed from: a */
    boolean mo12690a(int i10);

    /* renamed from: a */
    boolean mo12691a(String str);

    /* renamed from: b */
    String mo12692b(Context context, ACCSManager.AccsRequest accsRequest);

    /* renamed from: b */
    String mo12693b(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    /* renamed from: b */
    String mo12694b(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    /* renamed from: b */
    Map<String, Boolean> mo12695b();

    /* renamed from: b */
    void mo12696b(Context context, String str);

    /* renamed from: b */
    void mo12697b(AccsConnectStateListener accsConnectStateListener);

    /* renamed from: b */
    boolean mo12698b(Context context);

    /* renamed from: c */
    Map<String, Boolean> mo12699c();

    /* renamed from: c */
    void mo12700c(Context context);

    /* renamed from: c */
    void mo12701c(Context context, String str);

    /* renamed from: d */
    void mo12702d(Context context);

    /* renamed from: d */
    void mo12703d(Context context, String str);

    /* renamed from: e */
    void mo12704e(Context context);

    /* renamed from: e */
    void mo12705e(Context context, String str);
}
