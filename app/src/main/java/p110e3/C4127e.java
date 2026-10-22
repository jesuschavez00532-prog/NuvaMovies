package p110e3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1320p;
import be.C1328x;
import com.download.R$id;
import com.download.R$layout;
import com.download.activity.LocalPlayActivity;
import com.download.bean.LocalPlayBean;
import ee.InterfaceC4181d;
import ge.AbstractC4445l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p110e3.C4127e;
import p136fe.AbstractC4313d;
import p142g3.RunnableC4341c;
import p154h3.C4513b;
import p258o3.AbstractC5907c;
import p280p3.DialogC6196h;
import p400xa.C7619y;
import p433zd.AbstractC7786b;
import ve.AbstractC7269d;
import ve.AbstractC7272e;
import ve.AbstractC7329x;
import ve.C7297m0;
import ve.C7327w0;
import ve.InterfaceC7261a0;

/* renamed from: e3.e */
/* loaded from: classes.dex */
public final class C4127e extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private final C4513b f18101a;

    /* renamed from: b */
    private List f18102b;

    /* renamed from: c */
    private InterfaceC5642a f18103c;

    /* renamed from: e3.e$a */
    /* loaded from: classes.dex */
    public static final class a extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private final C4127e f18104a;

        /* renamed from: b */
        private final C4513b f18105b;

        /* renamed from: c */
        private final TextView f18106c;

        /* renamed from: d */
        private final TextView f18107d;

        /* renamed from: e */
        private final Button f18108e;

        /* renamed from: f */
        private final Button f18109f;

        /* renamed from: g */
        private LocalPlayBean f18110g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e3.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C7838a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ Intent f18111a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7838a(Intent intent) {
                super(1);
                this.f18111a = intent;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "it");
                return this.f18111a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e3.e$a$b */
        /* loaded from: classes.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: e3.e$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C7839a extends AbstractC5869l implements InterfaceC5664p {

                /* renamed from: a */
                final /* synthetic */ a f18113a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: e3.e$a$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C7840a extends AbstractC4445l implements InterfaceC5664p {

                    /* renamed from: e */
                    int f18114e;

                    /* renamed from: f */
                    final /* synthetic */ LocalPlayBean f18115f;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: e3.e$a$b$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes.dex */
                    public static final class C7841a extends AbstractC4445l implements InterfaceC5664p {

                        /* renamed from: e */
                        int f18116e;

                        /* renamed from: f */
                        final /* synthetic */ LocalPlayBean f18117f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C7841a(LocalPlayBean localPlayBean, InterfaceC4181d interfaceC4181d) {
                            super(2, interfaceC4181d);
                            this.f18117f = localPlayBean;
                        }

                        @Override // ge.AbstractC4434a
                        /* renamed from: a */
                        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                            return new C7841a(this.f18117f, interfaceC4181d);
                        }

                        @Override // ge.AbstractC4434a
                        /* renamed from: l */
                        public final Object mo2392l(Object obj) {
                            RunnableC4341c runnableC4341c;
                            String str;
                            RunnableC4341c downloadTask;
                            AbstractC4313d.m18094c();
                            if (this.f18116e == 0) {
                                AbstractC1320p.m5976b(obj);
                                LocalPlayBean localPlayBean = this.f18117f;
                                if (localPlayBean != null && (downloadTask = localPlayBean.getDownloadTask()) != null) {
                                    downloadTask.m18222m(true);
                                }
                                LocalPlayBean localPlayBean2 = this.f18117f;
                                if (localPlayBean2 != null) {
                                    runnableC4341c = localPlayBean2.getDownloadTask();
                                } else {
                                    runnableC4341c = null;
                                }
                                if (runnableC4341c == null) {
                                    LocalPlayBean localPlayBean3 = this.f18117f;
                                    if (localPlayBean3 == null || (str = localPlayBean3.getPath()) == null) {
                                        str = "";
                                    }
                                    File file = new File(str);
                                    if (file.exists() && !file.isDirectory()) {
                                        file.delete();
                                    }
                                }
                                return C1328x.f4998a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        @Override // me.InterfaceC5664p
                        /* renamed from: o, reason: merged with bridge method [inline-methods] */
                        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                            return ((C7841a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C7840a(LocalPlayBean localPlayBean, InterfaceC4181d interfaceC4181d) {
                        super(2, interfaceC4181d);
                        this.f18115f = localPlayBean;
                    }

                    @Override // ge.AbstractC4434a
                    /* renamed from: a */
                    public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                        return new C7840a(this.f18115f, interfaceC4181d);
                    }

                    @Override // ge.AbstractC4434a
                    /* renamed from: l */
                    public final Object mo2392l(Object obj) {
                        Object m18094c;
                        m18094c = AbstractC4313d.m18094c();
                        int i10 = this.f18114e;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                AbstractC1320p.m5976b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1320p.m5976b(obj);
                            AbstractC7329x m28252b = C7297m0.m28252b();
                            C7841a c7841a = new C7841a(this.f18115f, null);
                            this.f18114e = 1;
                            if (AbstractC7269d.m28113c(m28252b, c7841a, this) == m18094c) {
                                return m18094c;
                            }
                        }
                        return C1328x.f4998a;
                    }

                    @Override // me.InterfaceC5664p
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                        return ((C7840a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C7839a(a aVar) {
                    super(2);
                    this.f18113a = aVar;
                }

                /* renamed from: a */
                public final void m17274a(RunnableC4341c runnableC4341c, LocalPlayBean localPlayBean) {
                    AbstractC7272e.m28125b(C7327w0.f27234a, C7297m0.m28253c(), null, new C7840a(localPlayBean, null), 2, null);
                    int adapterPosition = this.f18113a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        boolean z10 = true;
                        if (adapterPosition <= this.f18113a.f18104a.getItemCount() - 1) {
                            this.f18113a.f18104a.m17260a().remove(adapterPosition);
                            this.f18113a.f18104a.notifyItemRemoved(adapterPosition);
                            List m17260a = this.f18113a.f18104a.m17260a();
                            if (m17260a != null && !m17260a.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                this.f18113a.f18105b.mo18886X();
                            }
                        }
                    }
                }

                @Override // me.InterfaceC5664p
                /* renamed from: h */
                public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
                    m17274a((RunnableC4341c) obj, (LocalPlayBean) obj2);
                    return C1328x.f4998a;
                }
            }

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m17273a(View view) {
                AbstractC5868k.m23674f(view, "it");
                Context context = a.this.itemView.getContext();
                AbstractC5868k.m23673e(context, "itemView.context");
                new DialogC6196h(context, 0, new C7839a(a.this), null, null, a.this.f18110g, 24, null).show();
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m17273a((View) obj);
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final View view, C4127e c4127e, C4513b c4513b) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC5868k.m23674f(c4127e, "adapter");
            AbstractC5868k.m23674f(c4513b, "frag");
            this.f18104a = c4127e;
            this.f18105b = c4513b;
            this.f18106c = (TextView) view.findViewById(R$id.mTvName);
            this.f18107d = (TextView) view.findViewById(R$id.mTvSize);
            Button button = (Button) view.findViewById(R$id.mBtPlay);
            this.f18108e = button;
            this.f18109f = (Button) view.findViewById(R$id.mBtDelete);
            AbstractC7786b.m30157a(view);
            button.setOnClickListener(new View.OnClickListener() { // from class: e3.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4127e.a.m17266c(view, this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m17266c(View view, a aVar, View view2) {
            RunnableC4341c runnableC4341c;
            AbstractC5868k.m23674f(view, "$itemView");
            AbstractC5868k.m23674f(aVar, "this$0");
            Intent intent = new Intent(view.getContext(), (Class<?>) LocalPlayActivity.class);
            intent.setFlags(262144);
            LocalPlayBean localPlayBean = aVar.f18110g;
            AbstractC5868k.m23671c(localPlayBean);
            intent.setData(Uri.parse(localPlayBean.getPath()));
            LocalPlayBean localPlayBean2 = aVar.f18110g;
            if (localPlayBean2 != null) {
                runnableC4341c = localPlayBean2.getDownloadTask();
            } else {
                runnableC4341c = null;
            }
            if (runnableC4341c != null) {
                LocalPlayBean localPlayBean3 = aVar.f18110g;
                AbstractC5868k.m23671c(localPlayBean3);
                RunnableC4341c downloadTask = localPlayBean3.getDownloadTask();
                AbstractC5868k.m23671c(downloadTask);
                intent.putExtra("extra_progress", downloadTask.f18886a);
            }
            C7619y c7619y = C7619y.f28056a;
            Context context = view.getContext();
            AbstractC5868k.m23673e(context, "itemView.context");
            C7619y.m29367d(c7619y, context, LocalPlayActivity.class, null, new C7838a(intent), 2, null);
        }

        /* renamed from: g */
        public final void m17270g() {
            Button button = this.f18109f;
            AbstractC5868k.m23673e(button, "mBtDelete");
            AbstractC5907c.m23859c(button, new b(), 0L, 2, null);
            LocalPlayBean localPlayBean = this.f18110g;
            if (localPlayBean != null) {
                this.f18106c.setText(localPlayBean.getName());
                this.f18107d.setText(localPlayBean.getSize());
                this.f18106c.setSelected(true);
            }
        }

        /* renamed from: h */
        public final void m17271h(LocalPlayBean localPlayBean) {
            AbstractC5868k.m23674f(localPlayBean, "task");
            this.f18110g = localPlayBean;
        }
    }

    public C4127e(C4513b c4513b) {
        AbstractC5868k.m23674f(c4513b, "frag");
        this.f18101a = c4513b;
        this.f18102b = new ArrayList();
    }

    /* renamed from: a */
    public final List m17260a() {
        return this.f18102b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        AbstractC5868k.m23674f(aVar, "holder");
        aVar.m17271h((LocalPlayBean) this.f18102b.get(i10));
        aVar.m17270g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_download_finish, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "view");
        return new a(inflate, this, this.f18101a);
    }

    /* renamed from: d */
    public final void m17263d(InterfaceC5642a interfaceC5642a) {
        this.f18103c = interfaceC5642a;
    }

    /* renamed from: e */
    public final void m17264e(List list) {
        AbstractC5868k.m23674f(list, "task");
        this.f18102b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f18102b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }
}
