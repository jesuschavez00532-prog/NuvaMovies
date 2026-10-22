package p258o3;

import com.lzy.okgo.model.Progress;
import java.io.File;
import ne.AbstractC5868k;
import p142g3.AbstractC4340b;

/* renamed from: o3.f */
/* loaded from: classes.dex */
public final class C5910f extends AbstractC4340b {
    public C5910f() {
        super("LogDownloadListener");
    }

    @Override // p142g3.InterfaceC4344f
    /* renamed from: a */
    public void mo17286a(Progress progress) {
        System.out.println((Object) ("onStart: " + progress));
    }

    @Override // p142g3.InterfaceC4344f
    /* renamed from: b */
    public void mo17287b(Progress progress) {
        System.out.println((Object) ("onError: " + progress));
        AbstractC5868k.m23671c(progress);
        progress.exception.printStackTrace();
    }

    @Override // p142g3.InterfaceC4344f
    /* renamed from: c */
    public void mo17288c(Progress progress) {
        System.out.println((Object) ("onProgress: " + progress));
    }

    @Override // p142g3.InterfaceC4344f
    /* renamed from: e */
    public void mo17290e(Progress progress) {
        System.out.println((Object) ("onRemove: " + progress));
    }

    @Override // p142g3.InterfaceC4344f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo17289d(File file, Progress progress) {
        System.out.println((Object) ("onFinish: " + progress));
    }
}
