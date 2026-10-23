package p110e3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1320p;
import be.C1328x;
import com.download.R$id;
import com.download.R$layout;
import com.download.R$string;
import com.download.bean.DownloadModel;
import com.download.bean.LocalPlayBean;
import com.lzy.okgo.exception.StorageException;
import com.lzy.okgo.model.Progress;
import ee.InterfaceC4181d;
import ge.AbstractC4445l;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p110e3.C4128f;
import p136fe.AbstractC4313d;
import p142g3.AbstractC4340b;
import p142g3.C4343e;
import p142g3.RunnableC4341c;
import p154h3.C4515d;
import p258o3.AbstractC5907c;
import p258o3.C5910f;
import p258o3.C5913i;
import p280p3.DialogC6196h;
import p400xa.C7586l1;
import p433zd.AbstractC7786b;
import ve.AbstractC7269d;
import ve.AbstractC7272e;
import ve.AbstractC7329x;
import ve.C7297m0;
import ve.C7327w0;
import ve.InterfaceC7261a0;

/* renamed from: e3.f */
/* loaded from: classes.dex */
public final class C4128f extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private final C4515d f18118a;

    /* renamed from: b */
    private ArrayList f18119b;

    /* renamed from: c */
    private InterfaceC5642a f18120c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e3.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4340b {

        /* renamed from: b */
        private final b f18121b;

        /* renamed from: e3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C7842a extends AbstractC5869l implements InterfaceC5664p {

            /* renamed from: a */
            public static final C7842a f18122a = new C7842a();

            C7842a() {
                super(2);
            }

            /* renamed from: a */
            public final void m17292a(RunnableC4341c runnableC4341c, LocalPlayBean localPlayBean) {
            }

            @Override // me.InterfaceC5664p
            /* renamed from: h */
            public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
                m17292a((RunnableC4341c) obj, (LocalPlayBean) obj2);
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, b bVar) {
            super(obj);
            AbstractC5868k.m23674f(bVar, "holder");
            this.f18121b = bVar;
        }

        @Override // p142g3.InterfaceC4344f
        /* renamed from: a */
        public void mo17286a(Progress progress) {
            AbstractC5868k.m23674f(progress, "progress");
        }

        @Override // p142g3.InterfaceC4344f
        /* renamed from: b */
        public void mo17287b(Progress progress) {
            AbstractC5868k.m23674f(progress, "progress");
            if (AbstractC5868k.m23669a(this.f18885a, this.f18121b.m17302j())) {
                Throwable th = progress.exception;
                if (th != null) {
                    th.printStackTrace();
                }
                if (th instanceof StorageException) {
                    Context context = this.f18121b.itemView.getContext();
                    AbstractC5868k.m23673e(context, "holder.itemView.context");
                    new DialogC6196h(context, 3, C7842a.f18122a, null, null, null, 56, null).show();
                    return;
                }
                Integer m17301i = this.f18121b.m17301i();
                if (m17301i != null && m17301i.intValue() == 4) {
                    C7586l1 c7586l1 = C7586l1.f27877a;
                    Context m17300h = this.f18121b.m17300h();
                    String string = this.f18121b.m17300h().getResources().getString(R$string.download_retry_tips);
                    AbstractC5868k.m23673e(string, "holder.context.resources…ring.download_retry_tips)");
                    C7586l1.m29112f(c7586l1, m17300h, string, 0, 0, 12, null);
                    return;
                }
                this.f18121b.m17303k(progress);
            }
        }

        @Override // p142g3.InterfaceC4344f
        /* renamed from: c */
        public void mo17288c(Progress progress) {
            AbstractC5868k.m23674f(progress, "progress");
            if (AbstractC5868k.m23669a(this.f18885a, this.f18121b.m17302j())) {
                this.f18121b.m17303k(progress);
            }
        }

        @Override // p142g3.InterfaceC4344f
        /* renamed from: e */
        public void mo17290e(Progress progress) {
            AbstractC5868k.m23674f(progress, "progress");
        }

        @Override // p142g3.InterfaceC4344f
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo17289d(File file, Progress progress) {
            AbstractC5868k.m23674f(file, "file");
            AbstractC5868k.m23674f(progress, "progress");
            this.f18121b.m17306n();
        }
    }

    /* renamed from: e3.f$b */
    /* loaded from: classes.dex */
    public static final class b extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private final C4128f f18123a;

        /* renamed from: b */
        private final C4515d f18124b;

        /* renamed from: c */
        private final TextView f18125c;

        /* renamed from: d */
        private final TextView f18126d;

        /* renamed from: e */
        private final Button f18127e;

        /* renamed from: f */
        private final Button f18128f;

        /* renamed from: g */
        private final ProgressBar f18129g;

        /* renamed from: h */
        private final TextView f18130h;

        /* renamed from: i */
        private final Context f18131i;

        /* renamed from: j */
        private Integer f18132j;

        /* renamed from: k */
        private RunnableC4341c f18133k;

        /* renamed from: l */
        private String f18134l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e3.f$b$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC4445l implements InterfaceC5664p {

            /* renamed from: e */
            int f18135e;

            a(InterfaceC4181d interfaceC4181d) {
                super(2, interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: a */
            public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                return new a(interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: l */
            public final Object mo2392l(Object obj) {
                AbstractC4313d.m18094c();
                if (this.f18135e == 0) {
                    AbstractC1320p.m5976b(obj);
                    C4343e.m18227a().m18233e();
                    RunnableC4341c runnableC4341c = b.this.f18133k;
                    AbstractC5868k.m23671c(runnableC4341c);
                    runnableC4341c.m18223o();
                    C4343e.m18227a().m18235i();
                    return C1328x.f4998a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // me.InterfaceC5664p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e3.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C7843b extends AbstractC5869l implements InterfaceC5660l {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: e3.f$b$b$a */
            /* loaded from: classes.dex */
            public static final class a extends AbstractC5869l implements InterfaceC5664p {

                /* renamed from: a */
                final /* synthetic */ b f18138a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: e3.f$b$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C7844a extends AbstractC4445l implements InterfaceC5664p {

                    /* renamed from: e */
                    int f18139e;

                    /* renamed from: f */
                    final /* synthetic */ RunnableC4341c f18140f;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: e3.f$b$b$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes.dex */
                    public static final class C7845a extends AbstractC4445l implements InterfaceC5664p {

                        /* renamed from: e */
                        int f18141e;

                        /* renamed from: f */
                        final /* synthetic */ RunnableC4341c f18142f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C7845a(RunnableC4341c runnableC4341c, InterfaceC4181d interfaceC4181d) {
                            super(2, interfaceC4181d);
                            this.f18142f = runnableC4341c;
                        }

                        @Override // ge.AbstractC4434a
                        /* renamed from: a */
                        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                            return new C7845a(this.f18142f, interfaceC4181d);
                        }

                        @Override // ge.AbstractC4434a
                        /* renamed from: l */
                        public final Object mo2392l(Object obj) {
                            AbstractC4313d.m18094c();
                            if (this.f18141e == 0) {
                                AbstractC1320p.m5976b(obj);
                                RunnableC4341c runnableC4341c = this.f18142f;
                                if (runnableC4341c != null) {
                                    runnableC4341c.m18222m(true);
                                }
                                return C1328x.f4998a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        @Override // me.InterfaceC5664p
                        /* renamed from: o, reason: merged with bridge method [inline-methods] */
                        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                            return ((C7845a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C7844a(RunnableC4341c runnableC4341c, InterfaceC4181d interfaceC4181d) {
                        super(2, interfaceC4181d);
                        this.f18140f = runnableC4341c;
                    }

                    @Override // ge.AbstractC4434a
                    /* renamed from: a */
                    public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                        return new C7844a(this.f18140f, interfaceC4181d);
                    }

                    @Override // ge.AbstractC4434a
                    /* renamed from: l */
                    public final Object mo2392l(Object obj) {
                        Object m18094c = null;
                        m18094c = AbstractC4313d.m18094c();
                        int i10 = this.f18139e;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                AbstractC1320p.m5976b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1320p.m5976b(obj);
                            AbstractC7329x m28252b = C7297m0.m28252b();
                            C7845a c7845a = new C7845a(this.f18140f, null);
                            this.f18139e = 1;
                            if (AbstractC7269d.m28113c(m28252b, c7845a, this) == m18094c) {
                                return m18094c;
                            }
                        }
                        return C1328x.f4998a;
                    }

                    @Override // me.InterfaceC5664p
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                        return ((C7844a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(b bVar) {
                    super(2);
                    this.f18138a = bVar;
                }

                /* renamed from: a */
                public final void m17309a(RunnableC4341c runnableC4341c, LocalPlayBean localPlayBean) {
                    AbstractC7272e.m28125b(C7327w0.f27234a, C7297m0.m28253c(), null, new C7844a(runnableC4341c, null), 2, null);
                    int adapterPosition = this.f18138a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        boolean z10 = true;
                        if (adapterPosition <= this.f18138a.f18123a.getItemCount() - 1) {
                            this.f18138a.f18123a.m17279b().remove(adapterPosition);
                            this.f18138a.f18123a.notifyItemRemoved(adapterPosition);
                            ArrayList m17279b = this.f18138a.f18123a.m17279b();
                            if (m17279b != null && !m17279b.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                this.f18138a.f18124b.mo18901X();
                            }
                        }
                    }
                }

                @Override // me.InterfaceC5664p
                /* renamed from: h */
                public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
                    m17309a((RunnableC4341c) obj, (LocalPlayBean) obj2);
                    return C1328x.f4998a;
                }
            }

            C7843b() {
                super(1);
            }

            /* renamed from: a */
            public final void m17308a(View view) {
                Progress progress;
                AbstractC5868k.m23674f(view, "it");
                Context context = b.this.itemView.getContext();
                AbstractC5868k.m23673e(context, "itemView.context");
                a aVar = new a(b.this);
                RunnableC4341c runnableC4341c = b.this.f18133k;
                if (runnableC4341c != null) {
                    progress = runnableC4341c.f18886a;
                } else {
                    progress = null;
                }
                new DialogC6196h(context, 1, aVar, progress, b.this.f18133k, null, 32, null).show();
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m17308a((View) obj);
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, C4128f c4128f, C4515d c4515d) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC5868k.m23674f(c4128f, "adapter");
            AbstractC5868k.m23674f(c4515d, "frag");
            this.f18123a = c4128f;
            this.f18124b = c4515d;
            this.f18125c = (TextView) view.findViewById(R$id.mTvName);
            this.f18126d = (TextView) view.findViewById(R$id.mTvSize);
            Button button = (Button) view.findViewById(R$id.mBtDownload);
            this.f18127e = button;
            this.f18128f = (Button) view.findViewById(R$id.mBtDelete);
            this.f18129g = (ProgressBar) view.findViewById(R$id.mPbProgress);
            this.f18130h = (TextView) view.findViewById(R$id.mTvSpeed);
            AbstractC7786b.m30157a(view);
            Context context = view.getContext();
            AbstractC5868k.m23673e(context, "itemView.context");
            this.f18131i = context;
            button.setOnClickListener(new View.OnClickListener() { // from class: e3.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4128f.b.m17294c(C4128f.b.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
        
            if (r3 != 4) goto L29;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void m17294c(p110e3.C4128f.b r17, android.view.View r18) {
            /*
                r0 = r17
                java.lang.String r1 = "this$0"
                ne.AbstractC5868k.m23674f(r0, r1)
                g3.c r1 = r0.f18133k
                if (r1 == 0) goto L7d
                com.lzy.okgo.model.Progress r2 = r1.f18886a
                if (r2 == 0) goto L7d
                int r3 = r2.status
                r4 = 4
                if (r3 == 0) goto L27
                r5 = 1
                if (r3 == r5) goto L27
                r5 = 2
                if (r3 == r5) goto L20
                r1 = 3
                if (r3 == r1) goto L27
                if (r3 == r4) goto L27
                goto L7a
            L20:
                ne.AbstractC5868k.m23671c(r1)
                r1.m18220d()
                goto L7a
            L27:
                cc.m0 r1 = cc.C1466m0.f5627a
                boolean r1 = r1.m6835H()
                if (r1 == 0) goto L35
                e3.f r0 = r0.f18123a
                p110e3.C4128f.m17277a(r0)
                goto L7d
            L35:
                int r1 = r2.status
                if (r1 != r4) goto L6a
                java.lang.Throwable r1 = r2.exception
                boolean r3 = r1 instanceof p142g3.C4339a
                if (r3 == 0) goto L6a
                java.lang.String r3 = "null cannot be cast to non-null type com.download.download.DownLoadException"
                ne.AbstractC5868k.m23672d(r1, r3)
                g3.a r1 = (p142g3.C4339a) r1
                int r1 = r1.m18206a()
                r3 = 404(0x194, float:5.66E-43)
                if (r1 != r3) goto L6a
                xa.l1 r4 = p400xa.C7586l1.f27877a
                android.content.Context r5 = r0.f18131i
                android.content.res.Resources r0 = r5.getResources()
                int r1 = com.download.R$string.download_failed_tips
                java.lang.String r6 = r0.getString(r1)
                java.lang.String r0 = "context.resources.getStr…ing.download_failed_tips)"
                ne.AbstractC5868k.m23673e(r6, r0)
                r7 = 0
                r8 = 0
                r9 = 12
                r10 = 0
                p400xa.C7586l1.m29112f(r4, r5, r6, r7, r8, r9, r10)
                return
            L6a:
                ve.w0 r11 = ve.C7327w0.f27234a
                r12 = 0
                r13 = 0
                e3.f$b$a r14 = new e3.f$b$a
                r1 = 0
                r14.<init>(r1)
                r15 = 3
                r16 = 0
                ve.AbstractC7269d.m28112b(r11, r12, r13, r14, r15, r16)
            L7a:
                r0.m17303k(r2)
            L7d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p110e3.C4128f.b.m17294c(e3.f$b, android.view.View):void");
        }

        /* renamed from: o */
        private final void m17298o(Progress progress) {
            String m23913b = null;
            TextView textView = this.f18126d;
            long j10 = progress.totalSize;
            if (j10 < 0) {
                m23913b = "0 B";
            } else {
                m23913b = C5913i.m23913b(j10);
            }
            textView.setText(m23913b);
        }

        /* renamed from: g */
        public final void m17299g() {
            Progress progress;
            Button button = this.f18128f;
            AbstractC5868k.m23673e(button, "mBtDelete");
            AbstractC5907c.m23859c(button, new C7843b(), 0L, 2, null);
            RunnableC4341c runnableC4341c = this.f18133k;
            if (runnableC4341c != null && (progress = runnableC4341c.f18886a) != null) {
                Serializable serializable = progress.extra1;
                if (serializable instanceof DownloadModel) {
                    AbstractC5868k.m23672d(serializable, "null cannot be cast to non-null type com.download.bean.DownloadModel");
                    this.f18125c.setText(((DownloadModel) serializable).getName());
                } else {
                    this.f18125c.setText(progress.fileName);
                }
                m17298o(progress);
                this.f18125c.setActivated(false);
                this.f18125c.setSelected(true);
            }
        }

        /* renamed from: h */
        public final Context m17300h() {
            return this.f18131i;
        }

        /* renamed from: i */
        public final Integer m17301i() {
            return this.f18132j;
        }

        /* renamed from: j */
        public final String m17302j() {
            return this.f18134l;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            if (r0 != 5) goto L24;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m17303k(com.lzy.okgo.model.Progress r7) {
            /*
                r6 = this;
                java.lang.String r0 = "progress"
                ne.AbstractC5868k.m23674f(r7, r0)
                int r0 = r7.status
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6.f18132j = r0
                android.widget.TextView r0 = r6.f18125c
                r1 = 0
                r0.setActivated(r1)
                android.widget.Button r0 = r6.f18127e
                r0.setActivated(r1)
                int r0 = r7.status
                java.lang.String r2 = ""
                if (r0 == 0) goto Lb6
                r3 = 1
                if (r0 == r3) goto Lb6
                r4 = 2
                if (r0 == r4) goto L84
                r1 = 3
                if (r0 == r1) goto Lb6
                r1 = 4
                if (r0 == r1) goto L2f
                r1 = 5
                if (r0 == r1) goto Lb6
                goto Lcc
            L2f:
                android.widget.TextView r0 = r6.f18125c
                r0.setActivated(r3)
                android.widget.Button r0 = r6.f18127e
                r0.setActivated(r3)
                android.widget.TextView r0 = r6.f18130h
                r0.setText(r2)
                java.lang.Throwable r0 = r7.exception
                boolean r1 = r0 instanceof p142g3.C4339a
                if (r1 == 0) goto L72
                g3.a r0 = (p142g3.C4339a) r0
                int r0 = r0.m18206a()
                r1 = 404(0x194, float:5.66E-43)
                if (r0 != r1) goto L60
                android.widget.Button r0 = r6.f18127e
                android.view.View r1 = r6.itemView
                android.content.Context r1 = r1.getContext()
                int r2 = com.download.R$string.download_bnt_failed
                java.lang.String r1 = r1.getString(r2)
                r0.setText(r1)
                goto Lcc
            L60:
                android.widget.Button r0 = r6.f18127e
                android.view.View r1 = r6.itemView
                android.content.Context r1 = r1.getContext()
                int r2 = com.download.R$string.download_retry
                java.lang.String r1 = r1.getString(r2)
                r0.setText(r1)
                goto Lcc
            L72:
                android.widget.Button r0 = r6.f18127e
                android.view.View r1 = r6.itemView
                android.content.Context r1 = r1.getContext()
                int r2 = com.download.R$string.download_retry
                java.lang.String r1 = r1.getString(r2)
                r0.setText(r1)
                goto Lcc
            L84:
                long r4 = r7.speed
                java.lang.String r0 = p258o3.C5913i.m23913b(r4)
                android.widget.TextView r2 = r6.f18130h
                ne.x r4 = ne.C5881x.f23415a
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r4[r1] = r0
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r3)
                java.lang.String r1 = "%s/s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                java.lang.String r1 = "format(format, *args)"
                ne.AbstractC5868k.m23673e(r0, r1)
                r2.setText(r0)
                android.widget.Button r0 = r6.f18127e
                android.view.View r1 = r6.itemView
                android.content.Context r1 = r1.getContext()
                int r2 = com.download.R$string.download_pause
                java.lang.String r1 = r1.getString(r2)
                r0.setText(r1)
                goto Lcc
            Lb6:
                android.widget.TextView r0 = r6.f18130h
                r0.setText(r2)
                android.widget.Button r0 = r6.f18127e
                android.view.View r1 = r6.itemView
                android.content.Context r1 = r1.getContext()
                int r2 = com.download.R$string.download_download
                java.lang.String r1 = r1.getString(r2)
                r0.setText(r1)
            Lcc:
                r6.m17298o(r7)
                android.widget.ProgressBar r0 = r6.f18129g
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setMax(r1)
                android.widget.ProgressBar r0 = r6.f18129g
                float r7 = r7.fraction
                float r1 = (float) r1
                float r7 = r7 * r1
                int r7 = (int) r7
                r0.setProgress(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p110e3.C4128f.b.m17303k(com.lzy.okgo.model.Progress):void");
        }

        /* renamed from: l */
        public final void m17304l(String str) {
            AbstractC5868k.m23674f(str, Progress.TAG);
            this.f18134l = str;
        }

        /* renamed from: m */
        public final void m17305m(RunnableC4341c runnableC4341c) {
            AbstractC5868k.m23674f(runnableC4341c, "task");
            this.f18133k = runnableC4341c;
            this.f18132j = Integer.valueOf(runnableC4341c.f18886a.status);
        }

        /* renamed from: n */
        public final void m17306n() {
            this.f18123a.m17284h();
        }
    }

    public C4128f(C4515d c4515d) {
        AbstractC5868k.m23674f(c4515d, "frag");
        this.f18118a = c4515d;
        this.f18119b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m17278g() {
        C7586l1 c7586l1 = C7586l1.f27877a;
        Context m3096J6 = this.f18118a.m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m3172j7 = this.f18118a.m3172j7(R$string.auth_tip_not_vip);
        AbstractC5868k.m23673e(m3172j7, "frag.getString(R.string.auth_tip_not_vip)");
        C7586l1.m29112f(c7586l1, m3096J6, m3172j7, 0, 0, 12, null);
    }

    /* renamed from: b */
    public final ArrayList m17279b() {
        return this.f18119b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        AbstractC5868k.m23674f(bVar, "holder");
        Object obj = this.f18119b.get(i10);
        AbstractC5868k.m23673e(obj, "tasks[position]");
        RunnableC4341c runnableC4341c = (RunnableC4341c) obj;
        String str = runnableC4341c.f18886a.tag;
        runnableC4341c.m18221l(new a(str, bVar)).m18221l(new C5910f());
        AbstractC5868k.m23673e(str, Progress.TAG);
        bVar.m17304l(str);
        bVar.m17305m(runnableC4341c);
        bVar.m17299g();
        Progress progress = runnableC4341c.f18886a;
        AbstractC5868k.m23673e(progress, "task.progress");
        bVar.m17303k(progress);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_downloading, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "view");
        return new b(inflate, this, this.f18118a);
    }

    /* renamed from: e */
    public final void m17282e() {
        Iterator it = this.f18119b.iterator();
        while (it.hasNext()) {
            RunnableC4341c runnableC4341c = (RunnableC4341c) it.next();
            runnableC4341c.m18224p(runnableC4341c.f18886a.tag);
        }
    }

    /* renamed from: f */
    public final void m17283f(InterfaceC5642a interfaceC5642a) {
        this.f18120c = interfaceC5642a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f18119b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* renamed from: h */
    public final void m17284h() {
        InterfaceC5642a interfaceC5642a = this.f18120c;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
    }

    /* renamed from: i */
    public final void m17285i(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "task");
        this.f18119b = arrayList;
        notifyDataSetChanged();
    }
}
