package p265oa;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1328x;
import java.util.ArrayList;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p316ra.C6566a;
import pa.InterfaceC6245b;
import qa.AbstractC6358b;

/* renamed from: oa.d */
/* loaded from: classes2.dex */
public final class C5946d extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private ArrayList f23637a;

    /* renamed from: b */
    private Context f23638b;

    /* renamed from: c */
    private InterfaceC5664p f23639c;

    /* renamed from: d */
    private int f23640d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oa.d$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5664p {
        a() {
            super(2);
        }

        /* renamed from: a */
        public final void m24086a(int i10, int i11) {
            InterfaceC5664p interfaceC5664p = C5946d.this.f23639c;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(i10), Integer.valueOf(i11));
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m24086a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C1328x.f4998a;
        }
    }

    public C5946d(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "mDataList");
        this.f23637a = arrayList;
        this.f23640d = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbstractC6358b abstractC6358b, int i10) {
        AbstractC5868k.m23674f(abstractC6358b, "holder");
        Object obj = this.f23637a.get(i10);
        AbstractC5868k.m23673e(obj, "mDataList[position]");
        abstractC6358b.mo25161c((InterfaceC6245b) obj);
        abstractC6358b.mo25162d(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC6358b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC5868k.m23673e(context, "parent.context");
        this.f23638b = context;
        return C6566a.f25180a.m25630a(viewGroup, i10, this.f23640d);
    }

    /* renamed from: d */
    public final void m24084d(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f23639c = interfaceC5664p;
    }

    /* renamed from: e */
    public final void m24085e(int i10) {
        this.f23640d = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f23637a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        return ((InterfaceC6245b) this.f23637a.get(i10)).getType();
    }
}
