package p164hd;

import android.os.Bundle;
import androidx.appcompat.app.AbstractActivityC0302c;
import gd.AbstractC4433c;
import gd.EnumC4431a;
import io.reactivex.subjects.BehaviorSubject;
import p135fd.AbstractC4309d;
import p135fd.C4307b;

/* renamed from: hd.a */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC4816a extends AbstractActivityC0302c {

    /* renamed from: s */
    private final BehaviorSubject f20287s = BehaviorSubject.create();

    /* renamed from: N3 */
    public final C4307b m19900N3() {
        return AbstractC4433c.m18619a(this.f20287s);
    }

    /* renamed from: Q4 */
    public final C4307b m19901Q4(EnumC4431a enumC4431a) {
        return AbstractC4309d.m18084c(this.f20287s, enumC4431a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20287s.onNext(EnumC4431a.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        this.f20287s.onNext(EnumC4431a.DESTROY);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onPause() {
        this.f20287s.onNext(EnumC4431a.PAUSE);
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f20287s.onNext(EnumC4431a.RESUME);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f20287s.onNext(EnumC4431a.START);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onStop() {
        this.f20287s.onNext(EnumC4431a.STOP);
        super.onStop();
    }
}
