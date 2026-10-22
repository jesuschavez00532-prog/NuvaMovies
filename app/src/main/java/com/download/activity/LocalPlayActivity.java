package com.download.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.AbstractC0729o;
import bb.C1203g;
import be.AbstractC1314j;
import be.AbstractC1324t;
import be.C1328x;
import be.InterfaceC1312h;
import com.download.R$color;
import com.download.R$id;
import com.download.R$layout;
import com.download.R$string;
import com.download.activity.LocalPlayActivity;
import com.download.bean.DownloadModel;
import com.lzy.okgo.model.Progress;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.bean.AudioInfoBean;
import com.module.bean.AudioInfoUtil;
import com.module.bean.DefinitionBean;
import com.module.bean.RecordSubtitleInfoBean;
import com.module.playsetting.view.PlaySettingView;
import com.module.view.MFInfoBar;
import com.request.bean.SubTitleItemData;
import com.request.bean.SubTitleResult;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1508t;
import p161ha.ViewOnClickListenerC4758c0;
import p171i3.InterfaceC4850e;
import p171i3.InterfaceC4851f;
import p202k3.C5101e;
import p217l2.InterfaceC5349j;
import p258o3.C5909e;
import p258o3.C5911g;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p400xa.AbstractC7598p1;
import p400xa.C7577i1;
import p400xa.C7586l1;
import p433zd.AbstractC7786b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.widget.IjkVideoView;

/* loaded from: classes.dex */
public final class LocalPlayActivity extends AbstractActivityC2972a implements InterfaceC4851f, PlaySettingView.InterfaceC2975b {

    /* renamed from: X */
    public static final C1646a f6955X = new C1646a(null);

    /* renamed from: E */
    private Disposable f6956E;

    /* renamed from: F */
    private final InterfaceC1312h f6957F;

    /* renamed from: G */
    private Progress f6958G;

    /* renamed from: H */
    private DownloadModel f6959H;

    /* renamed from: I */
    private Uri f6960I;

    /* renamed from: J */
    private List f6961J;

    /* renamed from: K */
    private int f6962K;

    /* renamed from: L */
    private int f6963L;

    /* renamed from: M */
    private Disposable f6964M;

    /* renamed from: N */
    private boolean f6965N;

    /* renamed from: O */
    private DefinitionBean f6966O;

    /* renamed from: V */
    private final C1649d f6967V;

    /* renamed from: W */
    public Map f6968W = new LinkedHashMap();

    /* renamed from: com.download.activity.LocalPlayActivity$a */
    /* loaded from: classes.dex */
    public static final class C1646a {
        private C1646a() {
        }

        public /* synthetic */ C1646a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.download.activity.LocalPlayActivity$b */
    /* loaded from: classes.dex */
    static final class C1647b extends AbstractC5869l implements InterfaceC5642a {
        C1647b() {
            super(0);
        }

        /* renamed from: a */
        public final void m7575a() {
            LocalPlayActivity.this.m7529G6();
            IjkVideoView ijkVideoView = (IjkVideoView) LocalPlayActivity.this.m7571s6(R$id.mIvvPlayer);
            if (ijkVideoView != null) {
                ijkVideoView.release(true);
            }
            LocalPlayActivity.this.finish();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7575a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.LocalPlayActivity$c */
    /* loaded from: classes.dex */
    public static final class C1648c extends AbstractC5869l implements InterfaceC5660l {
        C1648c() {
            super(1);
        }

        /* renamed from: a */
        public final void m7576a(String str) {
            LocalPlayActivity.this.f6965N = true;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m7576a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.download.activity.LocalPlayActivity$d */
    /* loaded from: classes.dex */
    public static final class C1649d implements MFInfoBar.InterfaceC3005c {
        C1649d() {
        }

        @Override // com.module.view.MFInfoBar.InterfaceC3005c
        /* renamed from: a */
        public void mo7577a() {
            LocalPlayActivity.this.m7530H6().m5497g();
            ((MFInfoBar) LocalPlayActivity.this.m7571s6(R$id.mInfoBar)).setStatus(6);
        }

        @Override // com.module.view.MFInfoBar.InterfaceC3005c
        /* renamed from: b */
        public void mo7578b() {
            LocalPlayActivity.this.m7530H6().m5497g();
            ((MFInfoBar) LocalPlayActivity.this.m7571s6(R$id.mInfoBar)).setStatus(7);
        }

        @Override // com.module.view.MFInfoBar.InterfaceC3005c
        /* renamed from: c */
        public void mo7579c(int i10) {
            LocalPlayActivity localPlayActivity = LocalPlayActivity.this;
            int i11 = R$id.mIvvPlayer;
            if (!((IjkVideoView) localPlayActivity.m7571s6(i11)).isPlaying()) {
                ((MFInfoBar) LocalPlayActivity.this.m7571s6(R$id.mInfoBar)).setStatus(2);
            } else {
                ((MFInfoBar) LocalPlayActivity.this.m7571s6(R$id.mInfoBar)).setStatus(3);
            }
            IjkVideoView ijkVideoView = (IjkVideoView) LocalPlayActivity.this.m7571s6(i11);
            if (i10 >= ((IjkVideoView) LocalPlayActivity.this.m7571s6(i11)).getDuration()) {
                i10 -= 1000;
            }
            ijkVideoView.seekTo(i10);
            LocalPlayActivity.this.m7548a7();
        }
    }

    /* renamed from: com.download.activity.LocalPlayActivity$e */
    /* loaded from: classes.dex */
    static final class C1650e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C1650e f6972a = new C1650e();

        C1650e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1203g invoke() {
            return new C1203g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.LocalPlayActivity$f */
    /* loaded from: classes.dex */
    public static final class C1651f extends AbstractC5869l implements InterfaceC5660l {
        C1651f() {
            super(1);
        }

        /* renamed from: a */
        public final void m7581a(Object obj) {
            int i10;
            if (obj != null && (obj instanceof AudioInfoBean)) {
                AudioInfoBean audioInfoBean = (AudioInfoBean) obj;
                if (audioInfoBean.getAudioPlayIndex() != null) {
                    IjkVideoView ijkVideoView = (IjkVideoView) LocalPlayActivity.this.m7571s6(R$id.mIvvPlayer);
                    Integer audioPlayIndex = audioInfoBean.getAudioPlayIndex();
                    if (audioPlayIndex != null) {
                        i10 = audioPlayIndex.intValue();
                    } else {
                        i10 = 0;
                    }
                    ijkVideoView.selectTrack(i10);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m7581a(obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.LocalPlayActivity$g */
    /* loaded from: classes.dex */
    public static final class C1652g extends AbstractC5869l implements InterfaceC5642a {
        C1652g() {
            super(0);
        }

        /* renamed from: a */
        public final void m7582a() {
            String str;
            int i10;
            AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
            DownloadModel downloadModel = LocalPlayActivity.this.f6959H;
            if (downloadModel == null || (str = downloadModel.getContentId()) == null) {
                str = "";
            }
            RecordSubtitleInfoBean selectSubtitle = audioInfoUtil.getSelectSubtitle(str);
            LocalPlayActivity localPlayActivity = LocalPlayActivity.this;
            if (selectSubtitle == null) {
                i10 = localPlayActivity.f6962K;
            } else {
                i10 = selectSubtitle.getSubtitleIndex();
            }
            localPlayActivity.f6962K = i10;
            Log.d("LocalPlayActivity", "showSelectSubtitleAndAudio: " + selectSubtitle);
            LocalPlayActivity.this.m7543V6();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7582a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.LocalPlayActivity$h */
    /* loaded from: classes.dex */
    public static final class C1653h extends AbstractC5869l implements InterfaceC5642a {
        C1653h() {
            super(0);
        }

        /* renamed from: a */
        public final void m7583a() {
            LocalPlayActivity.this.m7546Y6();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7583a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.LocalPlayActivity$i */
    /* loaded from: classes.dex */
    public static final class C1654i extends AbstractC5869l implements InterfaceC5642a {
        C1654i() {
            super(0);
        }

        /* renamed from: a */
        public final void m7584a() {
            LocalPlayActivity.this.m7545X6();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7584a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.LocalPlayActivity$j */
    /* loaded from: classes.dex */
    public static final class C1655j extends AbstractC5869l implements InterfaceC5642a {
        C1655j() {
            super(0);
        }

        /* renamed from: a */
        public final void m7585a() {
            LocalPlayActivity.this.m7545X6();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7585a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.download.activity.LocalPlayActivity$k */
    /* loaded from: classes.dex */
    public static final class RunnableC1656k implements Runnable {
        RunnableC1656k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((MFInfoBar) LocalPlayActivity.this.m7571s6(R$id.mInfoBar)) != null) {
                C1203g m7530H6 = LocalPlayActivity.this.m7530H6();
                TextView textView = (TextView) LocalPlayActivity.this.m7571s6(R$id.mTvSubtitle);
                AbstractC5868k.m23673e(textView, "mTvSubtitle");
                long m5504t = m7530H6.m5504t(textView, ((IjkVideoView) LocalPlayActivity.this.m7571s6(R$id.mIvvPlayer)).getCurrentPosition());
                boolean z10 = false;
                if (0 <= m5504t && m5504t < 20) {
                    z10 = true;
                }
                if (z10) {
                    m5504t = 20;
                }
                if (m5504t >= 0) {
                    LocalPlayActivity.this.m7530H6().m5501o(m5504t, this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.LocalPlayActivity$l */
    /* loaded from: classes.dex */
    public static final class C1657l extends AbstractC5869l implements InterfaceC5660l {
        C1657l() {
            super(1);
        }

        /* renamed from: a */
        public final void m7586a(Long l10) {
            LocalPlayActivity.this.m7551d7();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m7586a((Long) obj);
            return C1328x.f4998a;
        }
    }

    public LocalPlayActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C1650e.f6972a);
        this.f6957F = m5965b;
        this.f6967V = new C1649d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G6 */
    public final void m7529G6() {
        Disposable disposable;
        Disposable disposable2 = this.f6964M;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f6964M) != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H6 */
    public final C1203g m7530H6() {
        return (C1203g) this.f6957F.getValue();
    }

    /* renamed from: J6 */
    private final void m7531J6() {
        Observable compose = Observable.fromCallable(new Callable() { // from class: d3.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m7533L6;
                m7533L6 = LocalPlayActivity.m7533L6(LocalPlayActivity.this);
                return m7533L6;
            }
        }).compose(AbstractC7029f.m27121b());
        final C1648c c1648c = new C1648c();
        this.f6964M = compose.subscribe(new Consumer() { // from class: d3.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LocalPlayActivity.m7532K6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6 */
    public static final void m7532K6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:3:0x0009, B:5:0x0029, B:8:0x002f, B:10:0x0032, B:12:0x0037, B:14:0x003b, B:18:0x0046, B:21:0x0060, B:23:0x0065, B:29:0x0069, B:31:0x006f, B:33:0x0078, B:37:0x0082), top: B:2:0x0009 }] */
    /* renamed from: L6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m7533L6(com.download.activity.LocalPlayActivity r19) {
        /*
            r0 = r19
            java.lang.String r1 = ""
            java.lang.String r2 = "this$0"
            ne.AbstractC5868k.m23674f(r0, r2)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> La4
            r6.<init>()     // Catch: java.lang.Exception -> La4
            int r2 = com.download.R$id.mIvvPlayer     // Catch: java.lang.Exception -> La4
            android.view.View r3 = r0.m7571s6(r2)     // Catch: java.lang.Exception -> La4
            tv.danmaku.ijk.media.player.widget.IjkVideoView r3 = (tv.danmaku.ijk.media.player.widget.IjkVideoView) r3     // Catch: java.lang.Exception -> La4
            tv.danmaku.ijk.media.player.misc.ITrackInfo[] r3 = r3.getTrackInfo()     // Catch: java.lang.Exception -> La4
            android.view.View r2 = r0.m7571s6(r2)     // Catch: java.lang.Exception -> La4
            tv.danmaku.ijk.media.player.widget.IjkVideoView r2 = (tv.danmaku.ijk.media.player.widget.IjkVideoView) r2     // Catch: java.lang.Exception -> La4
            r4 = 2
            int r2 = r2.getSelectedTrack(r4)     // Catch: java.lang.Exception -> La4
            r11 = 1
            r12 = 0
            if (r3 == 0) goto L68
            int r5 = r3.length     // Catch: java.lang.Exception -> La4
            if (r5 != 0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            r5 = r5 ^ r11
            if (r5 == 0) goto L68
            int r5 = r3.length     // Catch: java.lang.Exception -> La4
            r7 = 0
            r8 = 0
        L35:
            if (r7 >= r5) goto L69
            r9 = r3[r7]     // Catch: java.lang.Exception -> La4
            if (r9 == 0) goto L43
            int r10 = r9.getTrackType()     // Catch: java.lang.Exception -> La4
            if (r10 != r4) goto L43
            r10 = 1
            goto L44
        L43:
            r10 = 0
        L44:
            if (r10 == 0) goto L65
            com.module.bean.AudioInfoBean r10 = new com.module.bean.AudioInfoBean     // Catch: java.lang.Exception -> La4
            java.lang.String r9 = r9.getLanguage()     // Catch: java.lang.Exception -> La4
            java.lang.String r13 = "info.language"
            ne.AbstractC5868k.m23673e(r9, r13)     // Catch: java.lang.Exception -> La4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> La4
            r10.<init>(r1, r1, r9, r13)     // Catch: java.lang.Exception -> La4
            r6.add(r10)     // Catch: java.lang.Exception -> La4
            r9 = -1
            if (r2 == r9) goto L65
            if (r2 != r7) goto L65
            int r8 = r6.size()     // Catch: java.lang.Exception -> La4
            int r8 = r8 - r11
        L65:
            int r7 = r7 + 1
            goto L35
        L68:
            r8 = 0
        L69:
            int r2 = r6.size()     // Catch: java.lang.Exception -> La4
            if (r2 <= 0) goto La4
            java.util.Collections.sort(r6)     // Catch: java.lang.Exception -> La4
            com.module.bean.SourceBean r2 = new com.module.bean.SourceBean     // Catch: java.lang.Exception -> La4
            com.download.bean.DownloadModel r3 = r0.f6959H     // Catch: java.lang.Exception -> La4
            if (r3 == 0) goto L81
            java.lang.String r3 = r3.getContentId()     // Catch: java.lang.Exception -> La4
            if (r3 != 0) goto L7f
            goto L81
        L7f:
            r4 = r3
            goto L82
        L81:
            r4 = r1
        L82:
            java.lang.String r5 = "11"
            r7 = 0
            r9 = 8
            r10 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La4
            com.module.bean.DefinitionBean r3 = new com.module.bean.DefinitionBean     // Catch: java.lang.Exception -> La4
            java.lang.String r14 = "480"
            com.module.bean.SourceBean[] r4 = new com.module.bean.SourceBean[r11]     // Catch: java.lang.Exception -> La4
            r4[r12] = r2     // Catch: java.lang.Exception -> La4
            java.util.List r15 = p043ce.AbstractC1498j.m6970h(r4)     // Catch: java.lang.Exception -> La4
            r16 = 0
            r17 = 4
            r18 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> La4
            r0.f6966O = r3     // Catch: java.lang.Exception -> La4
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.download.activity.LocalPlayActivity.m7533L6(com.download.activity.LocalPlayActivity):java.lang.String");
    }

    /* renamed from: M6 */
    private final void m7534M6() {
        Progress progress;
        DownloadModel downloadModel;
        SubTitleResult subTitleResult;
        String str;
        String str2;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("extra_progress");
            List<SubTitleItemData> list = null;
            if (serializable instanceof Progress) {
                progress = (Progress) serializable;
            } else {
                progress = null;
            }
            this.f6958G = progress;
            if (progress != null) {
                Serializable serializable2 = progress.extra1;
                if (serializable2 instanceof DownloadModel) {
                    downloadModel = (DownloadModel) serializable2;
                } else {
                    downloadModel = null;
                }
                this.f6959H = downloadModel;
                Serializable serializable3 = progress.extra2;
                if (serializable3 instanceof SubTitleResult) {
                    subTitleResult = (SubTitleResult) serializable3;
                } else {
                    subTitleResult = null;
                }
                if (subTitleResult != null) {
                    list = subTitleResult.getData();
                }
                this.f6961J = list;
                String str3 = "";
                if (list != null) {
                    this.f6962K = 0;
                    AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
                    DownloadModel downloadModel2 = this.f6959H;
                    if (downloadModel2 == null || (str2 = downloadModel2.getContentId()) == null) {
                        str2 = "";
                    }
                    String language = list.get(0).getLanguage();
                    if (language != null) {
                        str3 = language;
                    }
                    audioInfoUtil.putSelectSubtitle(str2, 0, str3);
                    return;
                }
                AudioInfoUtil audioInfoUtil2 = AudioInfoUtil.INSTANCE;
                DownloadModel downloadModel3 = this.f6959H;
                if (downloadModel3 == null || (str = downloadModel3.getContentId()) == null) {
                    str = "";
                }
                audioInfoUtil2.putSelectSubtitle(str, -1, "");
                C1328x c1328x = C1328x.f4998a;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        r1 = r0;
     */
    /* renamed from: N6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m7535N6() {
        /*
            r8 = this;
            com.download.bean.DownloadModel r0 = r8.f6959H
            java.lang.String r1 = ""
            if (r0 == 0) goto L11
            if (r0 == 0) goto L37
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto Lf
            goto L37
        Lf:
            r1 = r0
            goto L37
        L11:
            android.net.Uri r0 = r8.f6960I
            if (r0 == 0) goto L37
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L37
            java.lang.String r3 = "/"
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            int r2 = p359ue.AbstractC7157k.m27691J(r2, r3, r4, r5, r6, r7)
            int r2 = r2 + 1
            int r3 = r0.length()
            java.lang.String r0 = r0.substring(r2, r3)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            ne.AbstractC5868k.m23673e(r0, r2)
            if (r0 != 0) goto Lf
        L37:
            int r0 = com.download.R$id.mInfoBar
            android.view.View r2 = r8.m7571s6(r0)
            com.module.view.MFInfoBar r2 = (com.module.view.MFInfoBar) r2
            r2.setLocalMode(r1)
            android.view.View r1 = r8.m7571s6(r0)
            com.module.view.MFInfoBar r1 = (com.module.view.MFInfoBar) r1
            com.download.activity.LocalPlayActivity$d r2 = r8.f6967V
            r1.setOnSeekBarSeekListener(r2)
            android.view.View r0 = r8.m7571s6(r0)
            com.module.view.MFInfoBar r0 = (com.module.view.MFInfoBar) r0
            r0.setSettingFunctionListener(r8)
            r8.m7545X6()
            r8.m7546Y6()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.download.activity.LocalPlayActivity.m7535N6():void");
    }

    /* renamed from: O6 */
    private final void m7536O6() {
        Uri data = getIntent().getData();
        this.f6960I = data;
        if (data != null) {
            ((AppCompatTextView) m7571s6(R$id.mTvPlayer)).setVisibility(8);
            int i10 = R$id.mIvvPlayer;
            ((IjkVideoView) m7571s6(i10)).setPlayMode(true);
            IjkVideoView ijkVideoView = (IjkVideoView) m7571s6(i10);
            Uri uri = this.f6960I;
            AbstractC5868k.m23671c(uri);
            ijkVideoView.setVideoPath(uri.getPath());
            ((IjkVideoView) m7571s6(i10)).start();
            ((MFInfoBar) m7571s6(R$id.mInfoBar)).setStatus(0);
        } else {
            ((AppCompatTextView) m7571s6(R$id.mTvPlayer)).setVisibility(0);
        }
        int i11 = R$id.mIvvPlayer;
        ((IjkVideoView) m7571s6(i11)).setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: d3.d
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                LocalPlayActivity.m7537P6(LocalPlayActivity.this, iMediaPlayer);
            }
        });
        ((IjkVideoView) m7571s6(i11)).setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: d3.e
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i12, int i13) {
                boolean m7538Q6;
                m7538Q6 = LocalPlayActivity.m7538Q6(LocalPlayActivity.this, iMediaPlayer, i12, i13);
                return m7538Q6;
            }
        });
        ((IjkVideoView) m7571s6(i11)).setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() { // from class: d3.f
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(IMediaPlayer iMediaPlayer) {
                LocalPlayActivity.m7539R6(LocalPlayActivity.this, iMediaPlayer);
            }
        });
        ((IjkVideoView) m7571s6(i11)).setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: d3.g
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                LocalPlayActivity.m7540S6(LocalPlayActivity.this, iMediaPlayer);
            }
        });
        ((IjkVideoView) m7571s6(i11)).setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: d3.h
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i12, int i13) {
                boolean m7541T6;
                m7541T6 = LocalPlayActivity.m7541T6(LocalPlayActivity.this, iMediaPlayer, i12, i13);
                return m7541T6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P6 */
    public static final void m7537P6(LocalPlayActivity localPlayActivity, IMediaPlayer iMediaPlayer) {
        AbstractC5868k.m23674f(localPlayActivity, "this$0");
        int i10 = R$id.mInfoBar;
        ((MFInfoBar) localPlayActivity.m7571s6(i10)).setStatus(4);
        ((MFInfoBar) localPlayActivity.m7571s6(i10)).setStatus(3);
        ((MFInfoBar) localPlayActivity.m7571s6(i10)).setTotalTime(((IjkVideoView) localPlayActivity.m7571s6(R$id.mIvvPlayer)).getDuration());
        localPlayActivity.m7549b7();
        localPlayActivity.m7543V6();
        localPlayActivity.m7531J6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q6 */
    public static final boolean m7538Q6(LocalPlayActivity localPlayActivity, IMediaPlayer iMediaPlayer, int i10, int i11) {
        AbstractC5868k.m23674f(localPlayActivity, "this$0");
        if (i10 != 701) {
            if (i10 == 702) {
                ((MFInfoBar) localPlayActivity.m7571s6(R$id.mInfoBar)).setStatus(3);
                return false;
            }
            return false;
        }
        ((MFInfoBar) localPlayActivity.m7571s6(R$id.mInfoBar)).setStatus(1);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R6 */
    public static final void m7539R6(LocalPlayActivity localPlayActivity, IMediaPlayer iMediaPlayer) {
        AbstractC5868k.m23674f(localPlayActivity, "this$0");
        ((MFInfoBar) localPlayActivity.m7571s6(R$id.mInfoBar)).setStatus(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S6 */
    public static final void m7540S6(LocalPlayActivity localPlayActivity, IMediaPlayer iMediaPlayer) {
        AbstractC5868k.m23674f(localPlayActivity, "this$0");
        ((MFInfoBar) localPlayActivity.m7571s6(R$id.mInfoBar)).setStatus(2);
        Disposable disposable = localPlayActivity.f6956E;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T6 */
    public static final boolean m7541T6(LocalPlayActivity localPlayActivity, IMediaPlayer iMediaPlayer, int i10, int i11) {
        AbstractC5868k.m23674f(localPlayActivity, "this$0");
        C7586l1 c7586l1 = C7586l1.f27877a;
        String string = localPlayActivity.getString(R$string.download_play_failed);
        AbstractC5868k.m23673e(string, "getString(R.string.download_play_failed)");
        C7586l1.m29112f(c7586l1, localPlayActivity, string, 1, 0, 8, null);
        return false;
    }

    /* renamed from: U6 */
    private final boolean m7542U6(int i10) {
        this.f6962K = i10;
        m7543V6();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V6 */
    public final void m7543V6() {
        Object m7008t;
        if (isFinishing()) {
            return;
        }
        TextView textView = (TextView) m7571s6(R$id.mTvSubtitle);
        if (textView != null) {
            textView.setText("");
        }
        m7530H6().m5503q();
        List list = this.f6961J;
        if (list != null) {
            m7008t = AbstractC1508t.m7008t(list, this.f6962K);
            final SubTitleItemData subTitleItemData = (SubTitleItemData) m7008t;
            if (subTitleItemData != null) {
                m7530H6().m5501o(0L, new Runnable() { // from class: d3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalPlayActivity.m7544W6(LocalPlayActivity.this, subTitleItemData);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W6 */
    public static final void m7544W6(LocalPlayActivity localPlayActivity, SubTitleItemData subTitleItemData) {
        String str;
        String str2;
        AbstractC5868k.m23674f(localPlayActivity, "this$0");
        AbstractC5868k.m23674f(subTitleItemData, "$it");
        C1203g m7530H6 = localPlayActivity.m7530H6();
        Context m30049S4 = localPlayActivity.m30049S4();
        DownloadModel downloadModel = localPlayActivity.f6959H;
        String str3 = "";
        if (downloadModel == null || (str = downloadModel.getContentId()) == null) {
            str = "";
        }
        Boolean bool = Boolean.TRUE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5911g.f23514h.m23905a().m23897l());
        sb2.append(File.separator);
        DownloadModel downloadModel2 = localPlayActivity.f6959H;
        if (downloadModel2 != null) {
            str2 = downloadModel2.getFilePath();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        String sb3 = sb2.toString();
        if (sb3 != null) {
            str3 = sb3;
        }
        m7530H6.m5500m(m30049S4, str, subTitleItemData, AbstractC1324t.m5980a(bool, str3));
        localPlayActivity.m7548a7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X6 */
    public final void m7545X6() {
        String str;
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        DownloadModel downloadModel = this.f6959H;
        if (downloadModel == null || (str = downloadModel.getContentId()) == null) {
            str = "";
        }
        Integer subtitleColor = audioInfoUtil.getSubtitleColor(str);
        int i10 = R$id.mTvSubtitle;
        TextView textView = (TextView) m7571s6(i10);
        if (textView != null) {
            textView.setShadowLayer(1.0f, 2.0f, 2.0f, -16777216);
        }
        if (subtitleColor != null && subtitleColor.intValue() == 1) {
            TextView textView2 = (TextView) m7571s6(i10);
            if (textView2 != null) {
                textView2.setTextColor(m30049S4().getResources().getColor(R$color.color_ffaa00));
                return;
            }
            return;
        }
        TextView textView3 = (TextView) m7571s6(i10);
        if (textView3 != null) {
            textView3.setTextColor(m30049S4().getResources().getColor(R$color.color_ffffff));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y6 */
    public final void m7546Y6() {
        String str;
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        DownloadModel downloadModel = this.f6959H;
        if (downloadModel == null || (str = downloadModel.getContentId()) == null) {
            str = "";
        }
        Integer subtitleSize = audioInfoUtil.getSubtitleSize(str);
        if (subtitleSize != null && subtitleSize.intValue() == 2) {
            TextView textView = (TextView) m7571s6(R$id.mTvSubtitle);
            if (textView != null) {
                textView.setTextSize(0, AbstractC7786b.m30163g(60));
                return;
            }
            return;
        }
        if (subtitleSize != null && subtitleSize.intValue() == 3) {
            TextView textView2 = (TextView) m7571s6(R$id.mTvSubtitle);
            if (textView2 != null) {
                textView2.setTextSize(0, AbstractC7786b.m30163g(28));
                return;
            }
            return;
        }
        TextView textView3 = (TextView) m7571s6(R$id.mTvSubtitle);
        if (textView3 != null) {
            textView3.setTextSize(0, AbstractC7786b.m30163g(45));
        }
    }

    /* renamed from: Z6 */
    private final void m7547Z6() {
        String str;
        if (this.f6965N) {
            InterfaceC5349j interfaceC5349j = (InterfaceC5349j) C5634i.m22844e(InterfaceC5349j.class, new Object[0]);
            if (interfaceC5349j != null) {
                AbstractC0729o m3294d4 = m3294d4();
                AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
                DownloadModel downloadModel = this.f6959H;
                if (downloadModel == null || (str = downloadModel.getContentId()) == null) {
                    str = "";
                }
                interfaceC5349j.mo21635a(m3294d4, str, this.f6966O, this.f6961J, new C1651f(), new C1652g(), new C1653h(), new C1654i(), new C1655j());
                return;
            }
            return;
        }
        AbstractC7598p1.m29245i(this, getString(R$string.load_audio_tip), new int[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7 */
    public final void m7548a7() {
        int i10;
        m7530H6().m5497g();
        List list = this.f6961J;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 <= 0) {
            return;
        }
        m7530H6().m5501o(0L, new RunnableC1656k());
    }

    /* renamed from: b7 */
    private final void m7549b7() {
        Disposable disposable;
        Disposable disposable2 = this.f6956E;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f6956E) != null) {
            disposable.dispose();
        }
        Flowable<Long> observeOn = Flowable.interval(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final C1657l c1657l = new C1657l();
        this.f6956E = observeOn.subscribe(new Consumer() { // from class: d3.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LocalPlayActivity.m7550c7(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7 */
    public static final void m7550c7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d7 */
    public final void m7551d7() {
        if (((IjkVideoView) m7571s6(R$id.mIvvPlayer)).isPlaying()) {
            ((MFInfoBar) m7571s6(R$id.mInfoBar)).m12194O0(((IjkVideoView) m7571s6(r0)).getCurrentPosition(), ((IjkVideoView) m7571s6(r0)).getDuration());
        }
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: A3 */
    public void mo7566A3(int i10) {
        m7547Z6();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: I6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4850e mo7516s5() {
        return new C5101e(this, this);
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: Z */
    public void mo7568Z(int i10) {
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        i11 = 5;
                    }
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 2;
            }
        }
        ((IjkVideoView) m7571s6(R$id.mIvvPlayer)).setAspectRatio(i11);
        C7577i1.f27838b.m29085d().m29076h("play_ratio", Integer.valueOf(i10));
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        m7534M6();
        m7536O6();
        m7535N6();
        C5911g.f23514h.m23905a().m23903v(new C1647b());
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: k0 */
    public void mo7569k0(int i10) {
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: k6 */
    public void mo7570k6(int i10) {
        m7542U6(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.f6956E;
        if (disposable != null) {
            disposable.dispose();
        }
        m7530H6().m5502p();
        m7529G6();
        C5911g.f23514h.m23905a().m23903v(null);
        ((IjkVideoView) m7571s6(R$id.mIvvPlayer)).release(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        int i11 = R$id.mInfoBar;
        if (((MFInfoBar) m7571s6(i11)).m12202m0() || ((MFInfoBar) m7571s6(i11)).m12201l0()) {
            ((MFInfoBar) m7571s6(i11)).m12204s0();
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4) {
            if (keyCode != 7) {
                switch (keyCode) {
                    case 19:
                        if (((MFInfoBar) m7571s6(i11)).m12202m0()) {
                            ((MFInfoBar) m7571s6(i11)).m12206w0();
                            break;
                        } else {
                            if (((MFInfoBar) m7571s6(i11)).m12201l0()) {
                                ((MFInfoBar) m7571s6(i11)).m12196U();
                                return true;
                            }
                            ((MFInfoBar) m7571s6(i11)).m12189A0();
                            return true;
                        }
                    case 20:
                        if (!((IjkVideoView) m7571s6(R$id.mIvvPlayer)).isPlaying() && ((MFInfoBar) m7571s6(i11)).m12200k0()) {
                            ((MFInfoBar) m7571s6(i11)).setAdVisible(false);
                            return true;
                        }
                        if (((MFInfoBar) m7571s6(i11)).m12202m0()) {
                            ((MFInfoBar) m7571s6(i11)).m12206w0();
                            break;
                        } else if (!((MFInfoBar) m7571s6(i11)).m12202m0()) {
                            ((MFInfoBar) m7571s6(i11)).setSettingVisibility(true);
                            return true;
                        }
                        break;
                    case 21:
                    case 22:
                        if (!((MFInfoBar) m7571s6(i11)).m12202m0() && !((MFInfoBar) m7571s6(i11)).m12201l0()) {
                            ((MFInfoBar) m7571s6(i11)).m12189A0();
                            return true;
                        }
                        break;
                    case 23:
                        if (keyEvent.getRepeatCount() == 0 && !((MFInfoBar) m7571s6(i11)).m12202m0()) {
                            if (((MFInfoBar) m7571s6(i11)).getState() == 7 || ((MFInfoBar) m7571s6(i11)).getState() == 6 || ((MFInfoBar) m7571s6(i11)).getState() == 4 || ((MFInfoBar) m7571s6(i11)).getState() == 0 || ((MFInfoBar) m7571s6(i11)).getState() == 9 || ((MFInfoBar) m7571s6(i11)).getState() == -1 || ((MFInfoBar) m7571s6(i11)).getState() == -3 || ((MFInfoBar) m7571s6(i11)).getState() == -2 || ((MFInfoBar) m7571s6(i11)).getState() == 10) {
                                return true;
                            }
                            if (((MFInfoBar) m7571s6(i11)).getState() != 1) {
                                int i12 = R$id.mIvvPlayer;
                                if (((IjkVideoView) m7571s6(i12)).isPlaying()) {
                                    ((IjkVideoView) m7571s6(i12)).pause();
                                    ((MFInfoBar) m7571s6(i11)).setStatus(2);
                                    Disposable disposable = this.f6956E;
                                    if (disposable != null) {
                                        disposable.dispose();
                                    }
                                    m7530H6().m5497g();
                                    return true;
                                }
                            }
                            ((IjkVideoView) m7571s6(R$id.mIvvPlayer)).start();
                            ((MFInfoBar) m7571s6(i11)).setStatus(3);
                            m7549b7();
                            m7548a7();
                            return true;
                        }
                        break;
                }
            } else if (!((IjkVideoView) m7571s6(R$id.mIvvPlayer)).isPlaying() && ((MFInfoBar) m7571s6(i11)).m12200k0()) {
                ((MFInfoBar) m7571s6(i11)).m12193N();
                return true;
            }
            return false;
        }
        if (((MFInfoBar) m7571s6(i11)).m12201l0()) {
            ((MFInfoBar) m7571s6(i11)).m12196U();
            return true;
        }
        if (((MFInfoBar) m7571s6(i11)).m12202m0()) {
            ((MFInfoBar) m7571s6(i11)).setSettingVisibility(false);
            return true;
        }
        Disposable disposable2 = this.f6956E;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onPause() {
        super.onPause();
        int i10 = R$id.mIvvPlayer;
        ((IjkVideoView) m7571s6(i10)).pause();
        this.f6963L = ((IjkVideoView) m7571s6(i10)).getCurrentPosition();
        C5909e.f23504f.m23878a(this).m23874i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        super.onResume();
        int i10 = R$id.mIvvPlayer;
        ((IjkVideoView) m7571s6(i10)).start();
        if (this.f6963L > 0) {
            ((IjkVideoView) m7571s6(i10)).seekTo(this.f6963L);
        }
        C5909e.f23504f.m23878a(this).m23872g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onStop() {
        super.onStop();
        ((IjkVideoView) m7571s6(R$id.mIvvPlayer)).stopPlayback();
    }

    /* renamed from: s6 */
    public View m7571s6(int i10) {
        Map map = this.f6968W;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: w0 */
    public void mo7572w0(int i10) {
        if (i10 == 0) {
            String programTitle = ((MFInfoBar) m7571s6(R$id.mInfoBar)).getProgramTitle();
            if (AbstractC6567a.m25637g(programTitle)) {
                ViewOnClickListenerC4758c0 m19681b = ViewOnClickListenerC4758c0.f20101M0.m19681b("vod", programTitle);
                AbstractC0729o m3294d4 = m3294d4();
                AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
                m19681b.mo3277E9(m3294d4, "FeedbackDialog");
            }
        }
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: w5 */
    public void mo7573w5(int i10) {
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: x4 */
    public void mo7574x4(int i10) {
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_local_play;
    }
}
