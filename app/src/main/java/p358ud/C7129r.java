package p358ud;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0712e;
import cc.C1466m0;
import com.advertlib.bean.AdInfo;
import com.core.sysopt.mark.home.MovieRooView;
import com.core.sysopt.mark.live.FocusBorderView;
import com.module.event.RecommendGetSucEvent;
import com.request.result.ContentList;
import com.request.result.RecommendList;
import com.request.result.UserInfo;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.view.PosterView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p132fa.C4300d;
import p185j2.C4982a;
import p201k2.C5090g;
import p242n0.C5714a;
import p268od.InterfaceC5967c;
import p268od.InterfaceC5968d;
import p277p0.C6156m;
import p303qd.C6486y;
import p317rb.AbstractC6567a;
import p359ue.AbstractC7166t;
import p415y9.AbstractApplicationC7689d;
import p430z9.AbstractActivityC7763a;
import p430z9.AbstractC7769g;
import ye.InterfaceC7719m;

/* renamed from: ud.r */
/* loaded from: classes.dex */
public final class C7129r extends AbstractC7769g<C6486y> implements InterfaceC5968d {

    /* renamed from: D0 */
    private boolean f26789D0;

    /* renamed from: F0 */
    public Map f26791F0 = new LinkedHashMap();

    /* renamed from: E0 */
    private boolean f26790E0 = true;

    /* renamed from: Q9 */
    private final RecommendList m27616Q9(RecommendList recommendList) {
        String str = null;
        boolean m27723j;
        boolean m27723j2;
        String hasPay = null;
        C6156m c6156m = C6156m.f24180a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m23091d = C5714a.f22937a.m23091d();
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        String str2 = "1";
        if (m6887v == null || (str = m6887v.getUserIdentity()) == null) {
            str = "1";
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 != null && (hasPay = m6887v2.getHasPay()) != null) {
            str2 = hasPay;
        }
        List<AdInfo> m24510B = C6156m.m24510B(c6156m, m3096J6, m23091d, str, false, str2, 8, null);
        ArrayList arrayList = new ArrayList();
        if (AbstractC6567a.m25638h(m24510B)) {
            String str3 = (String) C4982a.f20721a.m20333a(AbstractApplicationC7689d.f28135d.m29494a(), C5090g.f20948a.m20647l(), "");
            if (AbstractC5868k.m23669a(str3, "2")) {
                AbstractC5868k.m23671c(m24510B);
                for (AdInfo adInfo : m24510B) {
                    if (AbstractC5868k.m23669a("no", adInfo.is_dealer()) || AbstractC5868k.m23669a("default", adInfo.is_dealer())) {
                        m27723j2 = AbstractC7166t.m27723j("picture", adInfo.getMedia_type(), true);
                        if (m27723j2) {
                            arrayList.add(PosterView.f17456l.m16619a(adInfo, C5714a.f22937a.m23091d()));
                            if (recommendList.getContentList() != null) {
                                List<ContentList> contentList = recommendList.getContentList();
                                AbstractC5868k.m23671c(contentList);
                                arrayList.addAll(contentList);
                            }
                        }
                    }
                }
            } else if (AbstractC5868k.m23669a(str3, MessageService.MSG_DB_READY_REPORT)) {
                AbstractC5868k.m23671c(m24510B);
                for (AdInfo adInfo2 : m24510B) {
                    if (AbstractC5868k.m23669a("yes", adInfo2.is_dealer()) || AbstractC5868k.m23669a("default", adInfo2.is_dealer())) {
                        m27723j = AbstractC7166t.m27723j("picture", adInfo2.getMedia_type(), true);
                        if (m27723j) {
                            arrayList.add(PosterView.f17456l.m16619a(adInfo2, C5714a.f22937a.m23091d()));
                            if (recommendList.getContentList() != null) {
                                List<ContentList> contentList2 = recommendList.getContentList();
                                AbstractC5868k.m23671c(contentList2);
                                arrayList.addAll(contentList2);
                            }
                        }
                    }
                }
            }
        }
        if (AbstractC6567a.m25635e(arrayList) && recommendList.getContentList() != null) {
            List<ContentList> contentList3 = recommendList.getContentList();
            AbstractC5868k.m23671c(contentList3);
            arrayList.addAll(contentList3);
        }
        return new RecommendList(recommendList.getRecommendCode(), recommendList.getScheduleName(), recommendList.getChangeSeconds(), arrayList);
    }

    /* renamed from: S9 */
    private final void m27617S9() {
        ((C6486y) m5478w9()).m25397c4();
    }

    /* renamed from: T9 */
    private final void m27618T9(View view) {
        int id2 = view.getId();
        if (id2 == R$id.mPosterView01) {
            InterfaceC5967c interfaceC5967c = (InterfaceC5967c) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList = ((PosterView) view).getContentList();
            C4300d c4300d = C4300d.f18678a;
            InterfaceC5967c.a.m24140a(interfaceC5967c, contentList, c4300d.m18067x(), "movies/" + c4300d.m18028d0(), false, 8, null);
            return;
        }
        if (id2 == R$id.mPosterView02) {
            InterfaceC5967c interfaceC5967c2 = (InterfaceC5967c) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList2 = ((PosterView) view).getContentList();
            C4300d c4300d2 = C4300d.f18678a;
            InterfaceC5967c.a.m24140a(interfaceC5967c2, contentList2, c4300d2.m18067x(), "movies/" + c4300d2.m18030e0(), false, 8, null);
            return;
        }
        if (id2 == R$id.mPosterView03) {
            InterfaceC5967c interfaceC5967c3 = (InterfaceC5967c) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList3 = ((PosterView) view).getContentList();
            C4300d c4300d3 = C4300d.f18678a;
            InterfaceC5967c.a.m24140a(interfaceC5967c3, contentList3, c4300d3.m18067x(), "movies/" + c4300d3.m18032f0(), false, 8, null);
            return;
        }
        if (id2 == R$id.mPosterView04) {
            InterfaceC5967c interfaceC5967c4 = (InterfaceC5967c) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList4 = ((PosterView) view).getContentList();
            C4300d c4300d4 = C4300d.f18678a;
            InterfaceC5967c.a.m24140a(interfaceC5967c4, contentList4, c4300d4.m18067x(), "movies/" + c4300d4.m18034g0(), false, 8, null);
            return;
        }
        if (id2 == R$id.mPosterView05) {
            InterfaceC5967c interfaceC5967c5 = (InterfaceC5967c) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList5 = ((PosterView) view).getContentList();
            C4300d c4300d5 = C4300d.f18678a;
            InterfaceC5967c.a.m24140a(interfaceC5967c5, contentList5, c4300d5.m18067x(), "movies/" + c4300d5.m18036h0(), false, 8, null);
            return;
        }
        if (id2 == R$id.mPosterView06) {
            InterfaceC5967c interfaceC5967c6 = (InterfaceC5967c) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList6 = ((PosterView) view).getContentList();
            C4300d c4300d6 = C4300d.f18678a;
            InterfaceC5967c.a.m24140a(interfaceC5967c6, contentList6, c4300d6.m18067x(), "movies/" + c4300d6.m18038i0(), false, 8, null);
            return;
        }
        if (id2 == R$id.mPosterView07) {
            InterfaceC5967c interfaceC5967c7 = (InterfaceC5967c) m5478w9();
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
            ContentList contentList7 = ((PosterView) view).getContentList();
            C4300d c4300d7 = C4300d.f18678a;
            InterfaceC5967c.a.m24140a(interfaceC5967c7, contentList7, c4300d7.m18067x(), "movies/" + c4300d7.m18040j0(), false, 8, null);
            return;
        }
        InterfaceC5967c interfaceC5967c8 = (InterfaceC5967c) m5478w9();
        AbstractC5868k.m23672d(view, "null cannot be cast to non-null type com.vod.view.PosterView");
        InterfaceC5967c.a.m24140a(interfaceC5967c8, ((PosterView) view).getContentList(), C4300d.f18678a.m18067x(), "movies", false, 8, null);
    }

    /* renamed from: V9 */
    private final void m27619V9() {
        ArrayList<PosterView> m6984c;
        m6984c = AbstractC1500l.m6984c((PosterView) m27622P9(R$id.mPosterView01), (PosterView) m27622P9(R$id.mPosterView02), (PosterView) m27622P9(R$id.mPosterView03), (PosterView) m27622P9(R$id.mPosterView04), (PosterView) m27622P9(R$id.mPosterView05), (PosterView) m27622P9(R$id.mPosterView06), (PosterView) m27622P9(R$id.mPosterView07));
        for (PosterView posterView : m6984c) {
            posterView.setOnClickListener(new View.OnClickListener() { // from class: ud.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7129r.m27620W9(C7129r.this, view);
                }
            });
            posterView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ud.q
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    C7129r.m27621X9(C7129r.this, view, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public static final void m27620W9(C7129r c7129r, View view) {
        AbstractC5868k.m23674f(c7129r, "this$0");
        AbstractC5868k.m23673e(view, "view");
        c7129r.m27618T9(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public static final void m27621X9(C7129r c7129r, View view, boolean z10) {
        AbstractC5868k.m23674f(c7129r, "this$0");
        AbstractC5868k.m23673e(view, "v");
        FocusBorderView focusBorderView = (FocusBorderView) c7129r.m27622P9(R$id.mFocusBorderView);
        AbstractC5868k.m23673e(focusBorderView, "mFocusBorderView");
        c7129r.m30067H9(view, z10, focusBorderView);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_movies;
    }

    @Override // p430z9.AbstractC7769g
    /* renamed from: J9 */
    public void mo27300J9() {
        super.mo27300J9();
        if (!((C6486y) m5478w9()).m25395Y3()) {
            m27617S9();
        }
        int i10 = R$id.mPosterView01;
        if (!((PosterView) m27622P9(i10)).hasFocus()) {
            ((PosterView) m27622P9(i10)).m16617g(true);
        }
    }

    @Override // p430z9.AbstractC7769g
    /* renamed from: M9 */
    public void mo27301M9() {
        super.mo27301M9();
        ((PosterView) m27622P9(R$id.mPosterView01)).m16617g(false);
    }

    /* renamed from: P9 */
    public View m27622P9(int i10) {
        View findViewById;
        Map map = this.f26791F0;
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
        return ((MovieRooView) m27622P9(R$id.mLayoutPoster)).requestFocus();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: R9, reason: merged with bridge method [inline-methods] */
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

    /* renamed from: U9 */
    public boolean m27624U9() {
        if (!m30070I9()) {
            return false;
        }
        if (!((PosterView) m27622P9(R$id.mPosterView01)).hasFocus() && !((PosterView) m27622P9(R$id.mPosterView06)).hasFocus() && !((PosterView) m27622P9(R$id.mPosterView07)).hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // p011aa.InterfaceC0124b
    /* renamed from: b5 */
    public boolean mo494b5() {
        View view;
        if (!m30070I9()) {
            return false;
        }
        MovieRooView movieRooView = (MovieRooView) m27622P9(R$id.mLayoutPoster);
        if (movieRooView != null) {
            view = movieRooView.getFocusedChild();
        } else {
            view = null;
        }
        if (view == null) {
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
        this.f26791F0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m27619V9();
    }

    @Override // p011aa.InterfaceC0124b
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 != 4 && (i10 != 19 || !m27624U9())) {
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
            m27617S9();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p430z9.AbstractC7769g, p430z9.AbstractC7765c
    /* renamed from: q9 */
    public void mo5463q9() {
        super.mo5463q9();
        m27617S9();
        int i10 = R$id.mPosterView01;
        if (!((PosterView) m27622P9(i10)).hasFocus()) {
            ((PosterView) m27622P9(i10)).m16617g(true);
        }
    }

    @Override // p268od.InterfaceC5968d
    /* renamed from: t5 */
    public void mo24143t5(ArrayList arrayList, boolean z10) {
        if (m3096J6() != null && !m3192t7() && arrayList != null) {
            this.f26789D0 = z10;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RecommendList recommendList = (RecommendList) it.next();
                String recommendCode = recommendList.getRecommendCode();
                C4300d c4300d = C4300d.f18678a;
                if (AbstractC5868k.m23669a(recommendCode, c4300d.m18028d0())) {
                    ((PosterView) m27622P9(R$id.mPosterView01)).setRcmbData(m27616Q9(recommendList));
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18030e0())) {
                    ((PosterView) m27622P9(R$id.mPosterView02)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18032f0())) {
                    ((PosterView) m27622P9(R$id.mPosterView03)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18034g0())) {
                    ((PosterView) m27622P9(R$id.mPosterView04)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18036h0())) {
                    ((PosterView) m27622P9(R$id.mPosterView05)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18038i0())) {
                    ((PosterView) m27622P9(R$id.mPosterView06)).setRcmbData(recommendList);
                } else if (AbstractC5868k.m23669a(recommendCode, c4300d.m18040j0())) {
                    ((PosterView) m27622P9(R$id.mPosterView07)).setRcmbData(recommendList);
                }
            }
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f26790E0;
    }
}
