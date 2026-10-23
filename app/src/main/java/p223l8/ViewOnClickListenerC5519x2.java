package p223l8;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ba.AbstractC1196d;
import be.C1328x;
import com.core.sysopt.mark.live.SearchLiveRootView;
import com.live.R$id;
import com.live.R$layout;
import com.request.result.Channel;
import com.widget.recyclerView.LinearLayoutManagerTV;
import com.widget.recyclerView.RecyclerViewTV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p028b8.C1176o0;
import p040c8.C1407f;
import p130f8.InterfaceC4294u;
import p159h8.C4630k4;
import p201k2.AbstractC5095l;
import p359ue.AbstractC7167u;

/* renamed from: l8.x2 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5519x2 extends AbstractC1196d<C4630k4> implements InterfaceC4294u, View.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: F0 */
    private View f22431F0;

    /* renamed from: G0 */
    private View f22432G0;

    /* renamed from: H0 */
    private View f22433H0;

    /* renamed from: I0 */
    private C1176o0 f22434I0;

    /* renamed from: J0 */
    private InterfaceC5642a f22435J0;

    /* renamed from: z0 */
    private boolean f22440z0;

    /* renamed from: M0 */
    public Map f22438M0 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f22439y0 = "SearchLiveFragment";

    /* renamed from: A0 */
    private final ArrayList f22426A0 = new ArrayList();

    /* renamed from: B0 */
    private final ArrayList f22427B0 = new ArrayList();

    /* renamed from: C0 */
    private final HashMap f22428C0 = new HashMap();

    /* renamed from: D0 */
    private final HashMap f22429D0 = new HashMap();

    /* renamed from: E0 */
    private final ArrayList f22430E0 = new ArrayList();

    /* renamed from: K0 */
    private View.OnKeyListener f22436K0 = new View.OnKeyListener() { // from class: l8.q2
        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean m22376aa;
            m22376aa = ViewOnClickListenerC5519x2.m22376aa(ViewOnClickListenerC5519x2.this, view, i10, keyEvent);
            return m22376aa;
        }
    };

    /* renamed from: L0 */
    private View.OnKeyListener f22437L0 = new View.OnKeyListener() { // from class: l8.r2
        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean m22377ba;
            m22377ba = ViewOnClickListenerC5519x2.m22377ba(ViewOnClickListenerC5519x2.this, view, i10, keyEvent);
            return m22377ba;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.x2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            int dp2px = AutoSizeUtils.dp2px(ViewOnClickListenerC5519x2.this.m3096J6(), 213.0f);
            return AbstractC5095l.m20689c(str, dp2px, dp2px);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.x2$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m22394a(Bitmap bitmap) {
            if (bitmap != null) {
                ((ImageView) ViewOnClickListenerC5519x2.this.m22389N9(R$id.mQrFeedBack)).setImageBitmap(bitmap);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22394a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.x2$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f22443a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m22395a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22395a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.x2$d */
    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CharSequence m27758b0;
            int i10 = 0;
            boolean z10;
            ViewOnClickListenerC5519x2.this.f22431F0 = null;
            String obj = ((EditText) ViewOnClickListenerC5519x2.this.m22389N9(R$id.mEditSearch)).getText().toString();
            int length = obj.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (AbstractC5868k.m23676h(obj.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            if (TextUtils.isEmpty(obj.subSequence(i11, length + 1).toString())) {
                if (!((EditText) ViewOnClickListenerC5519x2.this.m22389N9(R$id.mEditSearch)).hasFocus()) {
                    ((ImageView) ViewOnClickListenerC5519x2.this.m22389N9(R$id.ivSearchHint)).setVisibility(0);
                }
                ViewOnClickListenerC5519x2.this.m22388oa(true);
                ViewOnClickListenerC5519x2.this.m22386ma();
                return;
            }
            ((ImageView) ViewOnClickListenerC5519x2.this.m22389N9(R$id.ivSearchHint)).setVisibility(8);
            ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = ViewOnClickListenerC5519x2.this;
            m27758b0 = AbstractC7167u.m27758b0(((EditText) viewOnClickListenerC5519x2.m22389N9(R$id.mEditSearch)).getText().toString());
            viewOnClickListenerC5519x2.m22378ea(m27758b0.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: l8.x2$e */
    /* loaded from: classes2.dex */
    public static final class e implements C1176o0.a {
        e() {
        }

        @Override // p028b8.C1176o0.a
        /* renamed from: a */
        public void mo5379a(int i10) {
            Integer num = (Integer) ViewOnClickListenerC5519x2.this.f22428C0.get(((Channel) ViewOnClickListenerC5519x2.this.f22426A0.get(i10)).getName());
            ArrayList arrayList = ViewOnClickListenerC5519x2.this.f22427B0;
            AbstractC5868k.m23671c(num);
            String channelCode = ((Channel) arrayList.get(num.intValue())).getChannelCode();
            boolean z10 = false;
            if (ViewOnClickListenerC5519x2.this.f22430E0.size() > 0) {
                int size = ViewOnClickListenerC5519x2.this.f22430E0.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    Object obj = ViewOnClickListenerC5519x2.this.f22430E0.get(i11);
                    AbstractC5868k.m23673e(obj, "mFreeColumnList[i]");
                    if (((Channel) obj).getChannelCode().equals(channelCode)) {
                        num = Integer.valueOf(i11);
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = ViewOnClickListenerC5519x2.this;
            Channel channel = (Channel) (z10 ? viewOnClickListenerC5519x2.f22430E0 : viewOnClickListenerC5519x2.f22427B0).get(num.intValue());
            AbstractC5868k.m23673e(channel, "if (isFree) mFreeColumnL…lse mChannelList[index!!]");
            ((C4630k4) ViewOnClickListenerC5519x2.this.m5478w9()).m19376W(z10, ViewOnClickListenerC5519x2.this.f22430E0, channel);
        }
    }

    /* renamed from: l8.x2$f */
    /* loaded from: classes2.dex */
    public static final class f implements C1176o0.b {
        f() {
        }

        @Override // p028b8.C1176o0.b
        /* renamed from: a */
        public void mo5380a(boolean z10, int i10, View view) {
            AbstractC5868k.m23674f(view, "view");
            if (!z10) {
                ViewOnClickListenerC5519x2.this.f22431F0 = view;
                return;
            }
            ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = ViewOnClickListenerC5519x2.this;
            viewOnClickListenerC5519x2.f22431F0 = viewOnClickListenerC5519x2.f22432G0;
            ViewOnClickListenerC5519x2.this.f22432G0 = view;
        }
    }

    /* renamed from: Y9 */
    private final void m22375Y9() {
        int i10 = R$id.mEditSearch;
        if (((EditText) m22389N9(i10)) != null) {
            ((EditText) m22389N9(i10)).getText().clear();
        }
        if (this.f22431F0 != null) {
            this.f22431F0 = null;
        }
        if (this.f22433H0 != null) {
            this.f22433H0 = null;
        }
        m22388oa(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final boolean m22376aa(ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(viewOnClickListenerC5519x2, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 21) {
            if (viewOnClickListenerC5519x2.m3133W6() instanceof C5442e1) {
                Fragment m3133W6 = viewOnClickListenerC5519x2.m3133W6();
                AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                ((C5442e1) m3133W6).m21964ra();
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final boolean m22377ba(ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(viewOnClickListenerC5519x2, "this$0");
        if (keyEvent.getAction() == 0) {
            if (i10 != 21) {
                if (i10 == 22) {
                    int id2 = view.getId();
                    int i11 = R$id.mRecyclerResult;
                    if (id2 != i11 && ((RelativeLayout) viewOnClickListenerC5519x2.m22389N9(R$id.mLayoutResult)).getVisibility() == 0) {
                        View view2 = viewOnClickListenerC5519x2.f22431F0;
                        if (view2 != null) {
                            if (view2 != null) {
                                view2.requestFocus();
                            }
                        } else {
                            ((RecyclerViewTV) viewOnClickListenerC5519x2.m22389N9(i11)).setFocusable(true);
                            ((RecyclerViewTV) viewOnClickListenerC5519x2.m22389N9(i11)).requestFocus();
                            if (((RecyclerViewTV) viewOnClickListenerC5519x2.m22389N9(i11)).getChildAt(0) != null) {
                                ((RecyclerViewTV) viewOnClickListenerC5519x2.m22389N9(i11)).getChildAt(0).requestFocus();
                            }
                        }
                        viewOnClickListenerC5519x2.f22433H0 = view;
                    }
                    return true;
                }
            } else {
                if (view.getId() == R$id.mEditSearch) {
                    if (viewOnClickListenerC5519x2.m3133W6() instanceof C5442e1) {
                        Fragment m3133W6 = viewOnClickListenerC5519x2.m3133W6();
                        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                        ((C5442e1) m3133W6).m21964ra();
                    }
                    return true;
                }
                if (view.getId() == R$id.mRecyclerResult) {
                    ((Button) viewOnClickListenerC5519x2.m22389N9(R$id.f10642f)).requestFocus();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r4 = p359ue.AbstractC7167u.m27735E(r5, r12, 0, true, 2, null);
     */
    /* renamed from: ea */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22378ea(java.lang.String r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.f22427B0
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto Lb4
            java.util.ArrayList r0 = r11.f22426A0
            r0.clear()
            java.util.HashMap r0 = r11.f22428C0
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = r11.f22427B0
            int r2 = r2.size()
            r3 = 0
        L1f:
            if (r3 >= r2) goto L5b
            java.util.ArrayList r4 = r11.f22427B0
            java.lang.Object r4 = r4.get(r3)
            com.request.result.Channel r4 = (com.request.result.Channel) r4
            java.lang.String r5 = r4.getName()
            int r4 = r12.length()
            int r6 = r5.length()
            if (r4 > r6) goto L58
            r7 = 0
            r8 = 1
            r9 = 2
            r10 = 0
            r6 = r12
            int r4 = p359ue.AbstractC7157k.m27689E(r5, r6, r7, r8, r9, r10)
            r5 = -1
            if (r4 == r5) goto L58
            com.live.bean.SearchBean r5 = new com.live.bean.SearchBean
            java.util.ArrayList r6 = r11.f22427B0
            java.lang.Object r6 = r6.get(r3)
            java.lang.String r7 = "mChannelList[pos]"
            ne.AbstractC5868k.m23673e(r6, r7)
            com.request.result.Channel r6 = (com.request.result.Channel) r6
            r5.<init>(r4, r6, r3)
            r0.add(r5)
        L58:
            int r3 = r3 + 1
            goto L1f
        L5b:
            int r12 = r0.size()
            r2 = 1
            if (r12 <= 0) goto L9a
            int r12 = r0.size()
            if (r12 <= r2) goto L6b
            java.util.Collections.sort(r0)
        L6b:
            java.util.Iterator r12 = r0.iterator()
        L6f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r12.next()
            com.live.bean.SearchBean r0 = (com.live.bean.SearchBean) r0
            java.util.ArrayList r3 = r11.f22426A0
            com.request.result.Channel r4 = r0.getChannel()
            r3.add(r4)
            java.util.HashMap r3 = r11.f22428C0
            com.request.result.Channel r4 = r0.getChannel()
            java.lang.String r4 = r4.getName()
            int r0 = r0.getPos()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r4, r0)
            goto L6f
        L9a:
            b8.o0 r12 = r11.f22434I0
            if (r12 == 0) goto La1
            r12.notifyDataSetChanged()
        La1:
            java.util.ArrayList r12 = r11.f22426A0
            int r12 = r12.size()
            if (r12 <= 0) goto Lad
            r11.m22388oa(r2)
            goto Lba
        Lad:
            r11.m22388oa(r1)
            r11.m22387na()
            goto Lba
        Lb4:
            r11.m22388oa(r1)
            r11.m22387na()
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.ViewOnClickListenerC5519x2.m22378ea(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* renamed from: fa */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m22379fa() {
        /*
            r8 = this;
            cc.m0 r0 = cc.C1466m0.f5627a
            com.request.result.UserInfo r1 = r0.m6887v()
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L26
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L16
            java.lang.String r1 = r1.getEmail()
            goto L17
        L16:
            r1 = r3
        L17:
            if (r1 == 0) goto L26
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L24
            java.lang.String r1 = r1.getEmail()
            goto L27
        L24:
            r1 = r3
            goto L27
        L26:
            r1 = r2
        L27:
            ne.x r4 = ne.C5881x.f23415a
            r4 = 8
            java.lang.Object[] r5 = new java.lang.Object[r4]
            fa.d r6 = p132fa.C4300d.f18678a
            java.lang.String r6 = r6.m18049o()
            r7 = 0
            r5[r7] = r6
            android.content.Context r6 = r8.m3096J6()
            if (r6 == 0) goto L47
            i2.a r7 = p170i2.C4842a.f20329a
            i2.b r7 = r7.m19920a()
            java.lang.String r6 = r7.mo19960i(r6)
            goto L48
        L47:
            r6 = r3
        L48:
            r7 = 1
            r5[r7] = r6
            com.request.result.UserInfo r0 = r0.m6887v()
            if (r0 == 0) goto L55
            java.lang.String r3 = r0.getUserId()
        L55:
            r0 = 2
            r5[r0] = r3
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            r3 = 3
            r5[r3] = r0
            android.content.Context r0 = r8.m3096J6()
            int r0 = p201k2.AbstractC5085b.m20602l(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 4
            r5[r3] = r0
            r0 = 5
            r5[r0] = r1
            vb.a r0 = p371vb.C7252a.f27087a
            com.request.result.GetAuthInfoResult r0 = r0.m28073h()
            if (r0 == 0) goto L8b
            com.request.result.GetAuthInfoResultData r0 = r0.getData()
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.getShowFlag()
            if (r0 != 0) goto L8a
            goto L8b
        L8a:
            r2 = r0
        L8b:
            r0 = 6
            r5[r0] = r2
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 7
            r5[r1] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r1 = "http://%s/#/feedback?appId=%s&userId=%s&lang=%s&appVersion=%s&email=%s&tvType=1&userType=%s&timeStamp=%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "format(format, *args)"
            ne.AbstractC5868k.m23673e(r0, r1)
            io.reactivex.Observable r0 = io.reactivex.Observable.just(r0)
            l8.x2$a r1 = new l8.x2$a
            r1.<init>()
            l8.s2 r2 = new l8.s2
            r2.<init>()
            io.reactivex.Observable r0 = r0.map(r2)
            fd.b r1 = r8.m19902N3()
            io.reactivex.Observable r0 = r0.compose(r1)
            io.reactivex.ObservableTransformer r1 = p348u2.AbstractC7029f.m27120a()
            io.reactivex.Observable r0 = r0.compose(r1)
            l8.x2$b r1 = new l8.x2$b
            r1.<init>()
            l8.t2 r2 = new l8.t2
            r2.<init>()
            l8.x2$c r1 = p223l8.ViewOnClickListenerC5519x2.c.f22443a
            l8.u2 r3 = new l8.u2
            r3.<init>()
            r0.subscribe(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.ViewOnClickListenerC5519x2.m22379fa():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final Bitmap m22380ga(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m22381ha(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final void m22382ia(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: ja */
    private final void m22383ja() {
        int i10 = R$id.mEditSearch;
        ((EditText) m22389N9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.v2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5519x2.m22384ka(ViewOnClickListenerC5519x2.this, view, z10);
            }
        });
        int i11 = R$id.mImageFeedBack;
        ((ImageButton) m22389N9(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.w2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5519x2.m22385la(ViewOnClickListenerC5519x2.this, view, z10);
            }
        });
        ((EditText) m22389N9(i10)).addTextChangedListener(new d());
        C1176o0 c1176o0 = this.f22434I0;
        if (c1176o0 != null) {
            c1176o0.m5377g(new e());
        }
        C1176o0 c1176o02 = this.f22434I0;
        if (c1176o02 != null) {
            c1176o02.m5378h(new f());
        }
        int i12 = R$id.mImageDelete;
        ((ImageButton) m22389N9(i12)).setOnClickListener(this);
        ((ImageButton) m22389N9(R$id.mImageSpace)).setOnClickListener(this);
        int i13 = R$id.mImageClear;
        ((ImageButton) m22389N9(i13)).setOnClickListener(this);
        ((ImageButton) m22389N9(i11)).setOnClickListener(this);
        int i14 = R$id.f10637a;
        ((Button) m22389N9(i14)).setOnClickListener(this);
        int i15 = R$id.f10665;
        ((Button) m22389N9(i15)).setOnClickListener(this);
        int i16 = R$id.f10638b;
        ((Button) m22389N9(i16)).setOnClickListener(this);
        int i17 = R$id.f10639c;
        ((Button) m22389N9(i17)).setOnClickListener(this);
        int i18 = R$id.f10640d;
        ((Button) m22389N9(i18)).setOnClickListener(this);
        int i19 = R$id.f10641e;
        ((Button) m22389N9(i19)).setOnClickListener(this);
        int i20 = R$id.f10666;
        ((Button) m22389N9(i20)).setOnClickListener(this);
        int i21 = R$id.f10642f;
        ((Button) m22389N9(i21)).setOnClickListener(this);
        int i22 = R$id.f10643g;
        ((Button) m22389N9(i22)).setOnClickListener(this);
        int i23 = R$id.f10644h;
        ((Button) m22389N9(i23)).setOnClickListener(this);
        int i24 = R$id.f10645i;
        ((Button) m22389N9(i24)).setOnClickListener(this);
        int i25 = R$id.f10667;
        ((Button) m22389N9(i25)).setOnClickListener(this);
        int i26 = R$id.f10646j;
        ((Button) m22389N9(i26)).setOnClickListener(this);
        int i27 = R$id.f10647k;
        ((Button) m22389N9(i27)).setOnClickListener(this);
        int i28 = R$id.f10648l;
        ((Button) m22389N9(i28)).setOnClickListener(this);
        int i29 = R$id.f10649m;
        ((Button) m22389N9(i29)).setOnClickListener(this);
        int i30 = R$id.f10650n;
        ((Button) m22389N9(i30)).setOnClickListener(this);
        int i31 = R$id.f10668;
        ((Button) m22389N9(i31)).setOnClickListener(this);
        int i32 = R$id.f10651o;
        ((Button) m22389N9(i32)).setOnClickListener(this);
        int i33 = R$id.f10669;
        ((Button) m22389N9(i33)).setOnClickListener(this);
        int i34 = R$id.f10653p;
        ((Button) m22389N9(i34)).setOnClickListener(this);
        int i35 = R$id.f10654q;
        ((Button) m22389N9(i35)).setOnClickListener(this);
        int i36 = R$id.f10655r;
        ((Button) m22389N9(i36)).setOnClickListener(this);
        int i37 = R$id.f10656s;
        ((Button) m22389N9(i37)).setOnClickListener(this);
        int i38 = R$id.f10657t;
        ((Button) m22389N9(i38)).setOnClickListener(this);
        int i39 = R$id.f10658u;
        ((Button) m22389N9(i39)).setOnClickListener(this);
        int i40 = R$id.f10670;
        ((Button) m22389N9(i40)).setOnClickListener(this);
        int i41 = R$id.f10671;
        ((Button) m22389N9(i41)).setOnClickListener(this);
        int i42 = R$id.f10660v;
        ((Button) m22389N9(i42)).setOnClickListener(this);
        int i43 = R$id.f10661w;
        ((Button) m22389N9(i43)).setOnClickListener(this);
        int i44 = R$id.f10662x;
        ((Button) m22389N9(i44)).setOnClickListener(this);
        int i45 = R$id.f10663y;
        ((Button) m22389N9(i45)).setOnClickListener(this);
        int i46 = R$id.f10664z;
        ((Button) m22389N9(i46)).setOnClickListener(this);
        int i47 = R$id.key_0;
        ((Button) m22389N9(i47)).setOnClickListener(this);
        int i48 = R$id.key_1;
        ((Button) m22389N9(i48)).setOnClickListener(this);
        int i49 = R$id.key_2;
        ((Button) m22389N9(i49)).setOnClickListener(this);
        int i50 = R$id.key_3;
        ((Button) m22389N9(i50)).setOnClickListener(this);
        int i51 = R$id.key_4;
        ((Button) m22389N9(i51)).setOnClickListener(this);
        int i52 = R$id.key_5;
        ((Button) m22389N9(i52)).setOnClickListener(this);
        int i53 = R$id.key_6;
        ((Button) m22389N9(i53)).setOnClickListener(this);
        int i54 = R$id.key_7;
        ((Button) m22389N9(i54)).setOnClickListener(this);
        int i55 = R$id.key_8;
        ((Button) m22389N9(i55)).setOnClickListener(this);
        int i56 = R$id.key_9;
        ((Button) m22389N9(i56)).setOnClickListener(this);
        ((Button) m22389N9(i14)).setOnKeyListener(this.f22436K0);
        ((Button) m22389N9(i20)).setOnKeyListener(this.f22436K0);
        ((Button) m22389N9(i26)).setOnKeyListener(this.f22436K0);
        ((Button) m22389N9(i32)).setOnKeyListener(this.f22436K0);
        ((Button) m22389N9(i38)).setOnKeyListener(this.f22436K0);
        ((Button) m22389N9(i44)).setOnKeyListener(this.f22436K0);
        ((Button) m22389N9(i50)).setOnKeyListener(this.f22436K0);
        ((ImageButton) m22389N9(i13)).setOnKeyListener(this.f22436K0);
        ((Button) m22389N9(i56)).setOnKeyListener(this.f22436K0);
        ((EditText) m22389N9(i10)).setOnKeyListener(this.f22437L0);
        ((Button) m22389N9(i19)).setOnKeyListener(this.f22437L0);
        ((Button) m22389N9(i25)).setOnKeyListener(this.f22437L0);
        ((Button) m22389N9(i31)).setOnKeyListener(this.f22437L0);
        ((Button) m22389N9(i37)).setOnKeyListener(this.f22437L0);
        ((Button) m22389N9(i43)).setOnKeyListener(this.f22437L0);
        ((Button) m22389N9(i49)).setOnKeyListener(this.f22437L0);
        ((Button) m22389N9(i55)).setOnKeyListener(this.f22437L0);
        ((ImageButton) m22389N9(i12)).setOnKeyListener(this.f22437L0);
        ((ImageButton) m22389N9(i11)).setOnKeyListener(this.f22437L0);
        ((RecyclerViewTV) m22389N9(R$id.mRecyclerResult)).setOnKeyListener(this.f22437L0);
        ((ImageButton) m22389N9(i12)).setOnFocusChangeListener(this);
        ((ImageButton) m22389N9(i13)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i14)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i15)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i16)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i17)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i18)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i19)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i20)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i21)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i22)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i23)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i24)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i25)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i26)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i27)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i28)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i29)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i30)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i31)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i32)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i33)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i34)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i35)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i36)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i37)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i38)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i39)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i40)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i41)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i42)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i43)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i44)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i45)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i46)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i47)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i48)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i49)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i50)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i51)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i52)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i53)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i54)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i55)).setOnFocusChangeListener(this);
        ((Button) m22389N9(i56)).setOnFocusChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m22384ka(ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2, View view, boolean z10) {
        int i10 = 0;
        boolean z11;
        AbstractC5868k.m23674f(viewOnClickListenerC5519x2, "this$0");
        if (z10) {
            ((EditText) viewOnClickListenerC5519x2.m22389N9(R$id.mEditSearch)).setHint("");
            ((ImageView) viewOnClickListenerC5519x2.m22389N9(R$id.ivSearchHint)).setVisibility(8);
            InterfaceC5642a interfaceC5642a = viewOnClickListenerC5519x2.f22435J0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
                return;
            }
            return;
        }
        String obj = ((EditText) viewOnClickListenerC5519x2.m22389N9(R$id.mEditSearch)).getText().toString();
        int length = obj.length() - 1;
        int i11 = 0;
        boolean z12 = false;
        while (i11 <= length) {
            if (!z12) {
                i10 = i11;
            } else {
                i10 = length;
            }
            if (AbstractC5868k.m23676h(obj.charAt(i10), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i11++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        if (TextUtils.isEmpty(obj.subSequence(i11, length + 1).toString())) {
            ((ImageView) viewOnClickListenerC5519x2.m22389N9(R$id.ivSearchHint)).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: la */
    public static final void m22385la(ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2, View view, boolean z10) {
        AbstractC5868k.m23674f(viewOnClickListenerC5519x2, "this$0");
        if (z10) {
            ((LinearLayout) viewOnClickListenerC5519x2.m22389N9(R$id.mLayoutFeedBack)).setVisibility(0);
            viewOnClickListenerC5519x2.m22379fa();
        } else {
            ((LinearLayout) viewOnClickListenerC5519x2.m22389N9(R$id.mLayoutFeedBack)).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ma */
    public final void m22386ma() {
        this.f22426A0.clear();
        this.f22426A0.addAll(this.f22427B0);
        this.f22428C0.clear();
        this.f22428C0.putAll(this.f22429D0);
        C1176o0 c1176o0 = this.f22434I0;
        if (c1176o0 != null) {
            c1176o0.notifyDataSetChanged();
        }
    }

    /* renamed from: na */
    private final void m22387na() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oa */
    public final void m22388oa(boolean z10) {
        int i10 = 0;
        int i11 = R$id.mLayoutResult;
        if (((RelativeLayout) m22389N9(i11)) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) m22389N9(i11);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            relativeLayout.setVisibility(i10);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_search_live;
    }

    @Override // p130f8.InterfaceC4294u
    /* renamed from: K4 */
    public ArrayList mo17961K4() {
        return this.f22430E0;
    }

    /* renamed from: N9 */
    public View m22389N9(int i10) {
        View findViewById;
        Map map = this.f22438M0;
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

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V7 */
    public void mo3131V7(boolean z10) {
        super.mo3131V7(z10);
        if (z10) {
            m22375Y9();
            return;
        }
        int i10 = R$id.mEditSearch;
        if (((EditText) m22389N9(i10)) != null) {
            ((EditText) m22389N9(i10)).setCursorVisible(true);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: Z9, reason: merged with bridge method [inline-methods] */
    public C4630k4 mo5465y9() {
        return new C4630k4(this, this);
    }

    /* renamed from: ca */
    public final void m22391ca(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        this.f22435J0 = interfaceC5642a;
    }

    /* renamed from: da */
    public final void m22392da() {
        ((Button) m22389N9(R$id.f10637a)).requestFocus();
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22438M0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        ((EditText) m22389N9(R$id.mEditSearch)).setCursorVisible(true);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        this.f22434I0 = new C1176o0(m3096J6, this.f22426A0);
        int i10 = R$id.mRecyclerResult;
        ((RecyclerViewTV) m22389N9(i10)).setHasFixedSize(true);
        ((RecyclerViewTV) m22389N9(i10)).setLayoutManager(new LinearLayoutManagerTV(m3096J6(), 1, false));
        ((RecyclerViewTV) m22389N9(i10)).setAdapter(this.f22434I0);
        m22383ja();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getId() == R$id.mImageDelete) {
                int i10 = R$id.mEditSearch;
                if (((EditText) m22389N9(i10)).length() > 0) {
                    ((EditText) m22389N9(i10)).getText().delete(((EditText) m22389N9(i10)).length() - 1, ((EditText) m22389N9(i10)).length());
                    return;
                }
                return;
            }
            if (imageView.getId() == R$id.mImageClear) {
                ((EditText) m22389N9(R$id.mEditSearch)).getText().clear();
                return;
            }
            if (imageView.getId() == R$id.mImageSpace) {
                ((EditText) m22389N9(R$id.mEditSearch)).getText().append((CharSequence) " ");
                return;
            } else {
                if (imageView.getId() == R$id.mImageFeedBack) {
                    ((LinearLayout) m22389N9(R$id.mLayoutFeedBack)).setVisibility(0);
                    m22379fa();
                    return;
                }
                return;
            }
        }
        if (view instanceof TextView) {
            ((EditText) m22389N9(R$id.mEditSearch)).getText().append((CharSequence) ((TextView) view).getTag().toString());
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        InterfaceC5642a interfaceC5642a;
        if (z10 && (interfaceC5642a = this.f22435J0) != null) {
            interfaceC5642a.invoke();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
        /*
            r2 = this;
            java.lang.String r3 = "event"
            ne.AbstractC5868k.m23674f(r4, r3)
            int r3 = r4.getKeyCode()
            r4 = 1
            r0 = 0
            switch(r3) {
                case 19: goto L85;
                case 20: goto L48;
                case 21: goto L30;
                case 22: goto L10;
                default: goto Le;
            }
        Le:
            goto Laa
        L10:
            int r3 = com.live.R$id.mRecyclerResult
            android.view.View r3 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r3 = (com.widget.recyclerView.RecyclerViewTV) r3
            boolean r3 = r3.hasFocus()
            if (r3 == 0) goto L20
            goto Lab
        L20:
            int r3 = com.live.R$id.mLayoutFeedBack
            android.view.View r3 = r2.m22389N9(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            boolean r3 = r3.hasFocus()
            if (r3 == 0) goto Laa
            goto Lab
        L30:
            int r3 = com.live.R$id.mRecyclerResult
            android.view.View r3 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r3 = (com.widget.recyclerView.RecyclerViewTV) r3
            boolean r3 = r3.hasFocus()
            if (r3 == 0) goto Laa
            android.view.View r3 = r2.f22433H0
            if (r3 == 0) goto Laa
            if (r3 == 0) goto Lab
            r3.requestFocus()
            goto Lab
        L48:
            int r3 = com.live.R$id.mRecyclerResult
            android.view.View r1 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r1 = (com.widget.recyclerView.RecyclerViewTV) r1
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L74
            android.view.View r1 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r1 = (com.widget.recyclerView.RecyclerViewTV) r1
            android.view.View r3 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r3 = (com.widget.recyclerView.RecyclerViewTV) r3
            android.view.View r3 = r3.getFocusedChild()
            int r3 = r1.getChildAdapterPosition(r3)
            java.util.ArrayList r1 = r2.f22426A0
            int r1 = r1.size()
            int r1 = r1 - r4
            if (r3 != r1) goto L74
            r0 = 1
        L74:
            int r3 = com.live.R$id.mImageFeedBack
            android.view.View r3 = r2.m22389N9(r3)
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            boolean r3 = r3.hasFocus()
            if (r3 == 0) goto L83
            goto Lab
        L83:
            r4 = r0
            goto Lab
        L85:
            int r3 = com.live.R$id.mRecyclerResult
            android.view.View r1 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r1 = (com.widget.recyclerView.RecyclerViewTV) r1
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto Laa
            android.view.View r1 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r1 = (com.widget.recyclerView.RecyclerViewTV) r1
            android.view.View r3 = r2.m22389N9(r3)
            com.widget.recyclerView.RecyclerViewTV r3 = (com.widget.recyclerView.RecyclerViewTV) r3
            android.view.View r3 = r3.getFocusedChild()
            int r3 = r1.getChildAdapterPosition(r3)
            if (r3 != 0) goto Laa
            goto Lab
        Laa:
            r4 = 0
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.ViewOnClickListenerC5519x2.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        ((SearchLiveRootView) m22389N9(R$id.mRootView)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4294u
    /* renamed from: s3 */
    public void mo17962s3() {
        ArrayList m6513i = C1407f.f5458a.m6513i();
        this.f22427B0.clear();
        int size = m6513i.size();
        for (int i10 = 0; i10 < size; i10++) {
            String name = ((Channel) m6513i.get(i10)).getName();
            this.f22427B0.add(m6513i.get(i10));
            this.f22429D0.put(name, Integer.valueOf(i10));
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22440z0;
    }
}
