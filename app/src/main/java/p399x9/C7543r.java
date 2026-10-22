package p399x9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.module.view.DownloadStatusView;
import com.module.view.SelectionView;
import com.request.result.SimpleProgramList;
import java.util.Iterator;
import me.InterfaceC5665q;
import ne.AbstractC5868k;

/* renamed from: x9.r */
/* loaded from: classes2.dex */
public final class C7543r extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5665q f27721e;

    /* renamed from: f */
    private int f27722f;

    /* renamed from: g */
    private int f27723g;

    /* renamed from: h */
    private boolean f27724h;

    public C7543r() {
        super(R$layout.layout_item_selection, null, 2, null);
        this.f27722f = SelectionView.f12294t.m12278a();
        this.f27723g = -1;
    }

    /* renamed from: q */
    private final void m28904q(C7531f c7531f, SimpleProgramList simpleProgramList) {
        if (simpleProgramList.isDownloaded()) {
            int i10 = R$id.mIvDownload;
            ((DownloadStatusView) c7531f.m28863b(i10)).setVisibility(0);
            ((DownloadStatusView) c7531f.m28863b(i10)).setFraction(simpleProgramList.getFraction());
        } else if (simpleProgramList.isDownloading()) {
            int i11 = R$id.mIvDownload;
            ((DownloadStatusView) c7531f.m28863b(i11)).setVisibility(0);
            ((DownloadStatusView) c7531f.m28863b(i11)).setFraction(simpleProgramList.getFraction());
        } else {
            ((DownloadStatusView) c7531f.m28863b(R$id.mIvDownload)).setVisibility(8);
        }
        if (simpleProgramList.isSelected()) {
            ((ImageView) c7531f.m28863b(R$id.mIvSelect)).setVisibility(0);
        } else {
            ((ImageView) c7531f.m28863b(R$id.mIvSelect)).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m28905s(C7543r c7543r, int i10, SimpleProgramList simpleProgramList, View view) {
        AbstractC5868k.m23674f(c7543r, "this$0");
        AbstractC5868k.m23674f(simpleProgramList, "$bean");
        InterfaceC5665q interfaceC5665q = c7543r.f27721e;
        if (interfaceC5665q != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5665q.mo12281b(view, Integer.valueOf(i10), simpleProgramList);
        }
        if (c7543r.f27724h) {
            Iterator it = c7543r.m28849g().iterator();
            while (it.hasNext()) {
                ((SimpleProgramList) it.next()).setSelected(false);
            }
            ((SimpleProgramList) c7543r.m28849g().get(i10)).setSelected(true);
            c7543r.notifyDataSetChanged();
        }
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, final SimpleProgramList simpleProgramList) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(simpleProgramList, "bean");
        final int adapterPosition = c7531f.getAdapterPosition();
        TextView textView = (TextView) c7531f.m28863b(R$id.mTextTitle);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mImgPlaying);
        textView.setText(String.valueOf(simpleProgramList.getSeriesNumber()));
        if (!this.f27724h && ((this.f27723g == -1 && this.f27722f + 1 == simpleProgramList.getSeriesNumber()) || simpleProgramList.getSeriesNumber() == this.f27723g)) {
            textView.setVisibility(4);
            imageView.setVisibility(0);
        } else {
            textView.setVisibility(0);
            imageView.setVisibility(4);
        }
        if (this.f27724h) {
            m28904q(c7531f, simpleProgramList);
        }
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: x9.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7543r.m28905s(C7543r.this, adapterPosition, simpleProgramList, view);
            }
        });
    }

    /* renamed from: t */
    public final void m28907t(boolean z10) {
        this.f27724h = z10;
    }

    /* renamed from: u */
    public final void m28908u(InterfaceC5665q interfaceC5665q) {
        AbstractC5868k.m23674f(interfaceC5665q, "listener");
        this.f27721e = interfaceC5665q;
    }

    /* renamed from: v */
    public final void m28909v(int i10, int i11) {
        this.f27722f = i10;
        this.f27723g = i11;
        notifyDataSetChanged();
    }
}
