package p334t2;

import android.text.TextUtils;
import com.p077uc.crashsdk.export.ICrashClient;
import com.umeng.umcrash.UMCrashCallback;
import com.umeng.umcrash.UMCrashUtils;
import java.io.File;

/* renamed from: t2.b */
/* loaded from: classes.dex */
public class C6892b implements ICrashClient {

    /* renamed from: a */
    private final ICrashClient f26201a;

    /* renamed from: b */
    private final UMCrashCallback f26202b;

    public C6892b(ICrashClient iCrashClient, UMCrashCallback uMCrashCallback) {
        this.f26201a = iCrashClient;
        this.f26202b = uMCrashCallback;
    }

    @Override // com.p077uc.crashsdk.export.ICrashClient
    public void onAddCrashStats(String str, int i10, int i11) {
        ICrashClient iCrashClient = this.f26201a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i10, i11);
        }
    }

    @Override // com.p077uc.crashsdk.export.ICrashClient
    public File onBeforeUploadLog(File file) {
        ICrashClient iCrashClient = this.f26201a;
        if (iCrashClient != null) {
            return iCrashClient.onBeforeUploadLog(file);
        }
        return file;
    }

    @Override // com.p077uc.crashsdk.export.ICrashClient
    public void onClientProcessLogGenerated(String str, File file, String str2) {
        ICrashClient iCrashClient = this.f26201a;
        if (iCrashClient != null) {
            iCrashClient.onClientProcessLogGenerated(str, file, str2);
        }
    }

    @Override // com.p077uc.crashsdk.export.ICrashClient
    public void onCrashRestarting(boolean z10) {
        ICrashClient iCrashClient = this.f26201a;
        if (iCrashClient != null) {
            iCrashClient.onCrashRestarting(z10);
        }
    }

    @Override // com.p077uc.crashsdk.export.ICrashClient
    public String onGetCallbackInfo(String str, boolean z10) {
        if (this.f26202b != null && TextUtils.equals("um_user_string", str)) {
            String onCallback = this.f26202b.onCallback();
            if (onCallback == null) {
                return null;
            }
            if (onCallback.trim().getBytes().length > 512) {
                return UMCrashUtils.splitByByte(onCallback, 512);
            }
            return onCallback;
        }
        ICrashClient iCrashClient = this.f26201a;
        if (iCrashClient == null) {
            return null;
        }
        return iCrashClient.onGetCallbackInfo(str, z10);
    }

    @Override // com.p077uc.crashsdk.export.ICrashClient
    public void onLogGenerated(File file, String str) {
        ICrashClient iCrashClient = this.f26201a;
        if (iCrashClient != null) {
            iCrashClient.onLogGenerated(file, str);
        }
    }
}
