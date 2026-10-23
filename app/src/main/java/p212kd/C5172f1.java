package p212kd;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1328x;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.widget.recyclerView.LinearLayoutManagerTV;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p225ld.C5547a;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: kd.f1 */
/* loaded from: classes3.dex */
public final class C5172f1 extends AbstractC7527b {

    /* renamed from: e */
    private int f21183e;

    /* renamed from: f */
    private InterfaceC5664p f21184f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.f1$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5547a f21185a;

        /* renamed from: b */
        final /* synthetic */ C5172f1 f21186b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5547a c5547a, C5172f1 c5172f1) {
            super(1);
            this.f21185a = c5547a;
            this.f21186b = c5172f1;
        }

        /* renamed from: a */
        public final void m20896a(int i10) {
            this.f21185a.m22488b().setSelectAudio(i10);
            InterfaceC5664p m20893q = this.f21186b.m20893q();
            if (m20893q != null) {
                m20893q.mo2391h(Integer.valueOf(this.f21185a.m22487a()), this.f21185a.m22488b().getSelectAduio());
            }
            this.f21186b.notifyDataSetChanged();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20896a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    public C5172f1() {
        super(R$layout.item_select_subtitle_audio_audio, null, 2, null);
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, C5547a c5547a) {
        C5168e1 c5168e1;
        C5168e1 c5168e12;
        boolean z10 = false;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(c5547a, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.tvSource);
        RecyclerView recyclerView = (RecyclerView) c7531f.m28863b(R$id.rvAudioList);
        boolean z11 = true;
        if (c5547a.m22489c()) {
            textView.setVisibility(0);
            textView.setText(m28850h().getString(R$string.source, Integer.valueOf(c5547a.m22487a() + 1)));
            if (this.f21183e == c5547a.m22487a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setSelected(z10);
        } else {
            textView.setVisibility(8);
        }
        if (recyclerView.getLayoutManager() == null) {
            LinearLayoutManagerTV linearLayoutManagerTV = new LinearLayoutManagerTV(m28850h());
            linearLayoutManagerTV.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManagerTV);
            c5168e12 = new C5168e1();
            c5168e12.setHasStableIds(true);
            recyclerView.setAdapter(c5168e12);
        } else {
            RecyclerView.AbstractC0789h adapter = recyclerView.getAdapter();
            if (adapter instanceof C5168e1) {
                c5168e1 = (C5168e1) adapter;
            } else {
                c5168e1 = null;
            }
            if (c5168e1 == null) {
                c5168e1 = new C5168e1();
            }
            c5168e12 = c5168e1;
        }
        c5168e12.m20890t(c5547a.m22488b().getSelectAudio());
        if (this.f21183e != c5547a.m22487a()) {
            z11 = false;
        }
        c5168e12.m20891u(z11);
        c5168e12.m20889s(new a(c5547a, this));
        c5168e12.m28854l(c5547a.m22488b().getAudioInfoList());
    }

    /* renamed from: q */
    public final InterfaceC5664p m20893q() {
        return this.f21184f;
    }

    /* renamed from: r */
    public final void m20894r(InterfaceC5664p interfaceC5664p) {
        this.f21184f = interfaceC5664p;
    }

    /* renamed from: s */
    public final void m20895s(int i10) {
        this.f21183e = i10;
    }
}
