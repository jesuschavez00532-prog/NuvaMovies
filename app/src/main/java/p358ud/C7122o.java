package p358ud;

import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0712e;
import com.core.sysopt.mark.home.KidsRooView;
import com.core.sysopt.mark.live.FocusBorderView;
import com.module.event.RecommendGetSucEvent;
import com.request.result.ContentList;
import com.request.result.RecommendList;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.view.PosterView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p132fa.C4300d;
import p268od.InterfaceC5967c;
import p268od.InterfaceC5968d;
import p303qd.C6486y;
import p430z9.AbstractActivityC7763a;
import p430z9.AbstractC7769g;
import ye.InterfaceC7719m;

/* renamed from: ud.o */
/* loaded from: classes.dex */
public final class C7122o extends AbstractC7769g<C6486y> implements InterfaceC5968d {

    /* renamed from: D0 */
    private boolean f26767D0;

    /* renamed from: F0 */
    public Map f26769F0 = new LinkedHashMap();

    /* renamed from: E0 */
    private boolean f26768E0 = true;

    /* renamed from: R9 */
    private final void m27595R9() {
        ((C6486y) m5478w9()).m25397c4();
    }

    /* renamed from: S9 */
    private final void m27596S9(View view) {
        int id2 = view.getId();
        if (id2 == R$id.mPosterView01) {
            C6486y c6486y = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList = ((PosterView) view).getContentList();
            C4300d c4300d = C4300d.f18678a;
            c6486y.mo24138M2(contentList, c4300d.m18063v(), "kids/" + c4300d.m18016V(), true);
            return;
        }
        if (id2 == R$id.mPosterView02) {
            C6486y c6486y2 = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList2 = ((PosterView) view).getContentList();
            C4300d c4300d2 = C4300d.f18678a;
            c6486y2.mo24138M2(contentList2, c4300d2.m18063v(), "kids/" + c4300d2.m18017W(), true);
            return;
        }
        if (id2 == R$id.mPosterView03) {
            C6486y c6486y3 = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList3 = ((PosterView) view).getContentList();
            C4300d c4300d3 = C4300d.f18678a;
            c6486y3.mo24138M2(contentList3, c4300d3.m18063v(), "kids/" + c4300d3.m18018X(), true);
            return;
        }
        if (id2 == R$id.mPosterView04) {
            C6486y c6486y4 = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList4 = ((PosterView) view).getContentList();
            C4300d c4300d4 = C4300d.f18678a;
            c6486y4.mo24138M2(contentList4, c4300d4.m18063v(), "kids/" + c4300d4.m18019Y(), true);
            return;
        }
        if (id2 == R$id.mPosterView05) {
            C6486y c6486y5 = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList5 = ((PosterView) view).getContentList();
            C4300d c4300d5 = C4300d.f18678a;
            c6486y5.mo24138M2(contentList5, c4300d5.m18063v(), "kids/" + c4300d5.m18020Z(), true);
            return;
        }
        if (id2 == R$id.mPosterView06) {
            C6486y c6486y6 = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList6 = ((PosterView) view).getContentList();
            C4300d c4300d6 = C4300d.f18678a;
            c6486y6.mo24138M2(contentList6, c4300d6.m18063v(), "kids/" + c4300d6.m18022a0(), true);
            return;
        }
        if (id2 == R$id.mPosterView07) {
            C6486y c6486y7 = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList7 = ((PosterView) view).getContentList();
            C4300d c4300d7 = C4300d.f18678a;
            c6486y7.mo24138M2(contentList7, c4300d7.m18063v(), "kids/" + c4300d7.m18024b0(), true);
            return;
        }
        if (id2 == R$id.mPosterView08) {
            C6486y c6486y8 = (C6486y) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList8 = ((PosterView) view).getContentList();
            C4300d c4300d8 = C4300d.f18678a;
            c6486y8.mo24138M2(contentList8, c4300d8.m18063v(), "kids/" + c4300d8.m18026c0(), true);
            return;
        }
        InterfaceC5967c interfaceC5967c = (InterfaceC5967c) m5478w9();
        AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
        InterfaceC5967c.a.m24140a(interfaceC5967c, ((PosterView) view).getContentList(), C4300d.f18678a.m18063v(), "kids", false, 8, null);
    }

    /* renamed from: U9 */
    private final void m27597U9() {
        ArrayList<PosterView> m6984c;
        m6984c = AbstractC1500l.m6984c((PosterView) m27600P9(R$id.mPosterView01), (PosterView) m27600P9(R$id.mPosterView02), (PosterView) m27600P9(R$id.mPosterView03), (PosterView) m27600P9(R$id.mPosterView04), (PosterView) m27600P9(R$id.mPosterView05), (PosterView) m27600P9(R$id.mPosterView06), (PosterView) m27600P9(R$id.mPosterView07), (PosterView) m27600P9(R$id.mPosterView08));
        for (PosterView posterView : m6984c) {
            posterView.setOnClickListener(new View.OnClickListener() { // from class: ud.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7122o.m27598V9(C7122o.this, view);
                }
            });
            posterView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ud.n
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    C7122o.m27599W9(C7122o.this, view, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V9 */
    public static final void m27598V9(C7122o c7122o, View view) {
        AbstractC5868k.m23674f(c7122o, "this$0");
        AbstractC5868k.m23673e(view, "view");
        c7122o.m27596S9(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public static final void m27599W9(C7122o c7122o, View view, boolean z10) {
        AbstractC5868k.m23674f(c7122o, "this$0");
        AbstractC5868k.m23673e(view, "v");
        FocusBorderView focusBorderView = (FocusBorderView) c7122o.m27600P9(R$id.mFocusBorderView);
        AbstractC5868k.m23673e(focusBorderView, "mFocusBorderView");
        c7122o.m30067H9(view, z10, focusBorderView);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_kids;
    }

    @Override // p430z9.AbstractC7769g
    /* renamed from: J9 */
    public void mo27300J9() {
        super.mo27300J9();
        if (!((C6486y) m5478w9()).m25395Y3()) {
            m27595R9();
        }
        int i10 = R$id.mPosterView01;
        if (!((PosterView) m27600P9(i10)).hasFocus()) {
            ((PosterView) m27600P9(i10)).m16617g(true);
        }
    }

    @Override // p430z9.AbstractC7769g
    /* renamed from: M9 */
    public void mo27301M9() {
        super.mo27301M9();
        ((PosterView) m27600P9(R$id.mPosterView01)).m16617g(false);
    }

    /* renamed from: P9 */
    public View m27600P9(int i10) {
        View findViewById;
        Map map = this.f26769F0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // p011aa.InterfaceC0124b
    /* renamed from: Q2 */
    public boolean mo493Q2() {
        if (!m30070I9()) {
            return false;
        }
        return ((KidsRooView) m27600P9(R$id.mLayoutPoster)).requestFocus();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: Q9, reason: merged with bridge method [inline-methods] */
    public C6486y mo5465y9() {
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.base.BaseActivity");
        return new C6486y((AbstractActivityC7763a) m3075C6, this);
    }

    @Override // p430z9.AbstractC7769g, p430z9.AbstractC7768f, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: T9 */
    public boolean m27602T9() {
        if (!m30070I9()) {
            return false;
        }
        if (!((PosterView) m27600P9(R$id.mPosterView01)).hasFocus() && !((PosterView) m27600P9(R$id.mPosterView02)).hasFocus() && !((PosterView) m27600P9(R$id.mPosterView07)).hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // p011aa.InterfaceC0124b
    /* renamed from: b5 */
    public boolean mo494b5() {
        if (!m30070I9() || ((KidsRooView) m27600P9(R$id.mLayoutPoster)).getFocusedChild() == null) {
            return false;
        }
        return true;
    }

    @Override // p268od.InterfaceC5968d
    /* renamed from: h */
    public void mo24142h() {
    }

    @Override // p430z9.AbstractC7769g, p430z9.AbstractC7768f, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f26769F0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m27597U9();
    }

    @Override // p011aa.InterfaceC0124b
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 != 4 && (i10 != 19 || !m27602T9())) {
            return false;
        }
        InterfaceC5642a m30066G9 = m30066G9();
        if (m30066G9 != null) {
            m30066G9.invoke();
            return true;
        }
        return true;
    }

    @InterfaceC7719m
    public final void onRecommendGetSucMessage(RecommendGetSucEvent recommendGetSucEvent) {
        AbstractC5868k.m23674f(recommendGetSucEvent, "event");
        if (m30070I9()) {
            m27595R9();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p430z9.AbstractC7769g, p430z9.AbstractC7765c
    /* renamed from: q9 */
    public void mo5463q9() {
        super.mo5463q9();
        m27595R9();
        int i10 = R$id.mPosterView01;
        if (!((PosterView) m27600P9(i10)).hasFocus()) {
            ((PosterView) m27600P9(i10)).m16617g(true);
        }
    }

    @Override // p268od.InterfaceC5968d
    /* renamed from: t5 */
    public void mo24143t5(ArrayList arrayList, boolean z10) {
        if (m3096J6() != null && !m3192t7() && arrayList != null) {
            this.f26767D0 = z10;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RecommendList recommendList = (RecommendList) it.next();
                String recommendCode = recommendList.getRecommendCode();
                C4300d c4300d = C4300d.f18678a;
                if (AbstractC5868k.m23669a(recommendCode, c4300d.m18016V())) {
                    ((PosterView) m27600P9(R$id.mPosterView01)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18017W())) {
                    ((PosterView) m27600P9(R$id.mPosterView02)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18018X())) {
                    ((PosterView) m27600P9(R$id.mPosterView03)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18019Y())) {
                    ((PosterView) m27600P9(R$id.mPosterView04)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18020Z())) {
                    ((PosterView) m27600P9(R$id.mPosterView05)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18022a0())) {
                    ((PosterView) m27600P9(R$id.mPosterView06)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18024b0())) {
                    ((PosterView) m27600P9(R$id.mPosterView07)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18026c0())) {
                    ((PosterView) m27600P9(R$id.mPosterView08)).setRcmbData(recommendList);
                }
            }
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f26768E0;
    }
}
