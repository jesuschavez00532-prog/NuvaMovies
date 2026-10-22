package lc;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lc.e */
/* loaded from: classes.dex */
public class C5546e extends Fragment {

    /* renamed from: o0 */
    private Map f22482o0 = new HashMap();

    /* renamed from: p0 */
    private boolean f22483p0;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3159e9(true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: f8 */
    public void mo3161f8(int i10, String[] strArr, int[] iArr) {
        super.mo3161f8(i10, strArr, iArr);
        if (i10 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            zArr[i11] = m3168h9(strArr[i11]);
        }
        m22484q9(strArr, iArr, zArr);
    }

    /* renamed from: l9 */
    public boolean m22479l9(String str) {
        return this.f22482o0.containsKey(str);
    }

    /* renamed from: m9 */
    public PublishSubject m22480m9(String str) {
        return (PublishSubject) this.f22482o0.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9 */
    public boolean m22481n9(String str) {
        int checkSelfPermission;
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null) {
            checkSelfPermission = m3075C6.checkSelfPermission(str);
            if (checkSelfPermission == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o9 */
    public boolean m22482o9(String str) {
        boolean isPermissionRevokedByPolicy;
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null) {
            isPermissionRevokedByPolicy = m3075C6.getPackageManager().isPermissionRevokedByPolicy(str, m3075C6().getPackageName());
            return isPermissionRevokedByPolicy;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p9 */
    public void m22483p9(String str) {
        if (this.f22483p0) {
            Log.d(C5543b.f22471b, str);
        }
    }

    /* renamed from: q9 */
    void m22484q9(String[] strArr, int[] iArr, boolean[] zArr) {
        boolean z10;
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            m22483p9("onRequestPermissionsResult  " + strArr[i10]);
            PublishSubject publishSubject = (PublishSubject) this.f22482o0.get(strArr[i10]);
            if (publishSubject == null) {
                Log.e(C5543b.f22471b, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f22482o0.remove(strArr[i10]);
            if (iArr[i10] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            publishSubject.onNext(new C5542a(strArr[i10], z10, zArr[i10]));
            publishSubject.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r9 */
    public void m22485r9(String[] strArr) {
        m3101K8(strArr, 42);
    }

    /* renamed from: s9 */
    public void m22486s9(String str, PublishSubject publishSubject) {
        this.f22482o0.put(str, publishSubject);
    }
}
