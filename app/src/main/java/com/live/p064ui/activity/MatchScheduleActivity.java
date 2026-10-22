package com.live.p064ui.activity;

import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.bean.MatchDate;
import com.lzy.okgo.model.Progress;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.widget.custom.MemoryListView;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p028b8.C1150b0;
import p028b8.C1179q;
import p115e8.InterfaceC4155n;
import p147g8.C4402x0;
import p201k2.AbstractC5086c;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MatchScheduleActivity extends AbstractActivityC2972a implements InterfaceC4155n, View.OnKeyListener {

    /* renamed from: N */
    public static final C2868a f10889N = new C2868a(null);

    /* renamed from: O */
    private static HashMap f10890O = new HashMap();

    /* renamed from: F */
    private boolean f10892F;

    /* renamed from: G */
    private C1179q f10893G;

    /* renamed from: H */
    private C1150b0 f10894H;

    /* renamed from: J */
    private MatchDate f10896J;

    /* renamed from: K */
    private boolean f10897K;

    /* renamed from: L */
    private final InterfaceC1312h f10898L;

    /* renamed from: M */
    public Map f10899M = new LinkedHashMap();

    /* renamed from: E */
    private final String f10891E = "MatchScheduleActivity";

    /* renamed from: I */
    private String f10895I = "all";

    /* renamed from: com.live.ui.activity.MatchScheduleActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2868a {
        private C2868a() {
        }

        public /* synthetic */ C2868a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final HashMap m11573a() {
            return MatchScheduleActivity.f10890O;
        }
    }

    /* renamed from: com.live.ui.activity.MatchScheduleActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2869b implements AdapterView.OnItemSelectedListener {
        C2869b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            MatchScheduleActivity.this.m11565a();
            MatchScheduleActivity.this.m11570t6();
            C1179q c1179q = MatchScheduleActivity.this.f10893G;
            AbstractC5868k.m23671c(c1179q);
            Object obj = c1179q.m5408b().get(i10);
            AbstractC5868k.m23673e(obj, "mDateAdapter!!.getMatchDate()[position]");
            MatchDate matchDate = (MatchDate) obj;
            MatchScheduleActivity.this.f10896J = matchDate;
            ((C4402x0) MatchScheduleActivity.this.m11977r5()).m18417b5(matchDate, MatchScheduleActivity.this.f10895I);
            if (AbstractC5086c.m20622o(matchDate.getYearInfo(), "yyyy-MM-dd")) {
                TextView textView = (TextView) MatchScheduleActivity.this.m11567e6(R$id.mTvMatchDate);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(MatchScheduleActivity.this.m11976o5().getResources().getString(R$string.today));
                sb2.append(' ');
                String substring = matchDate.getMonthInfo().substring(3);
                AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                sb2.append('/');
                String substring2 = matchDate.getMonthInfo().substring(0, 2);
                AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring2);
                textView.setText(sb2.toString());
                return;
            }
            TextView textView2 = (TextView) MatchScheduleActivity.this.m11567e6(R$id.mTvMatchDate);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(AbstractC5086c.m20613f(matchDate.getYearInfo(), MatchScheduleActivity.this.m11556r6()));
            sb3.append(' ');
            String substring3 = matchDate.getMonthInfo().substring(3);
            AbstractC5868k.m23673e(substring3, "this as java.lang.String).substring(startIndex)");
            sb3.append(substring3);
            sb3.append('/');
            String substring4 = matchDate.getMonthInfo().substring(0, 2);
            AbstractC5868k.m23673e(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            sb3.append(substring4);
            textView2.setText(sb3.toString());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: com.live.ui.activity.MatchScheduleActivity$c */
    /* loaded from: classes2.dex */
    public static final class C2870c implements AdapterView.OnItemSelectedListener {
        C2870c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            MatchScheduleActivity matchScheduleActivity = MatchScheduleActivity.this;
            int i11 = R$id.mMlvMatchSchedule;
            if (((MemoryListView) matchScheduleActivity.m11567e6(i11)).hasFocus()) {
                MatchScheduleActivity matchScheduleActivity2 = MatchScheduleActivity.this;
                int i12 = R$id.mTvSize;
                ((TextView) matchScheduleActivity2.m11567e6(i12)).setVisibility(0);
                TextView textView = (TextView) MatchScheduleActivity.this.m11567e6(i12);
                StringBuilder sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(i10 + 1);
                sb2.append('/');
                sb2.append(((MemoryListView) MatchScheduleActivity.this.m11567e6(i11)).getCount());
                sb2.append(')');
                textView.setText(sb2.toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: com.live.ui.activity.MatchScheduleActivity$d */
    /* loaded from: classes2.dex */
    static final class C2871d extends AbstractC5869l implements InterfaceC5642a {
        C2871d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            return new String[]{MatchScheduleActivity.this.getResources().getString(R$string.sun), MatchScheduleActivity.this.getResources().getString(R$string.mon), MatchScheduleActivity.this.getResources().getString(R$string.tue), MatchScheduleActivity.this.getResources().getString(R$string.wed), MatchScheduleActivity.this.getResources().getString(R$string.thu), MatchScheduleActivity.this.getResources().getString(R$string.fri), MatchScheduleActivity.this.getResources().getString(R$string.sat)};
        }
    }

    public MatchScheduleActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new C2871d());
        this.f10898L = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public final String[] m11556r6() {
        return (String[]) this.f10898L.getValue();
    }

    /* renamed from: s6 */
    private final void m11557s6(boolean z10) {
        int selectedItemPosition;
        if (z10) {
            selectedItemPosition = ((MemoryListView) m11567e6(R$id.mMlvDate)).getSelectedItemPosition() - 1;
        } else {
            selectedItemPosition = ((MemoryListView) m11567e6(R$id.mMlvDate)).getSelectedItemPosition() + 1;
        }
        if (selectedItemPosition >= 0) {
            int i10 = R$id.mMlvDate;
            if (selectedItemPosition <= ((MemoryListView) m11567e6(i10)).getCount() - 1) {
                this.f10897K = true;
                C1179q c1179q = this.f10893G;
                if (c1179q != null) {
                    c1179q.m5410d(-1);
                }
                ((MemoryListView) m11567e6(i10)).setSelectionTriggerItemSelect(selectedItemPosition);
                C1179q c1179q2 = this.f10893G;
                if (c1179q2 != null) {
                    c1179q2.m5410d(selectedItemPosition);
                }
                int i11 = R$id.mVEmpty;
                m11567e6(i11).setFocusable(true);
                m11567e6(i11).requestFocus();
            }
        }
    }

    /* renamed from: x6 */
    private final boolean m11558x6(String str) {
        String str2;
        String m27728o;
        CharSequence m27758b0;
        ArrayList m5408b;
        MatchDate matchDate;
        int i10 = R$id.mMlvDate;
        if (((MemoryListView) m11567e6(i10)).getSelectedItemPosition() == -1) {
            return false;
        }
        C1179q c1179q = this.f10893G;
        if (c1179q != null && (m5408b = c1179q.m5408b()) != null && (matchDate = (MatchDate) m5408b.get(((MemoryListView) m11567e6(i10)).getSelectedItemPosition())) != null) {
            str2 = matchDate.getYearInfo();
        } else {
            str2 = null;
        }
        String str3 = str2;
        if (str3 != null) {
            m27728o = AbstractC7166t.m27728o(str3, Operator.Operation.MINUS, "", false, 4, null);
            m27758b0 = AbstractC7167u.m27758b0(m27728o);
            if (AbstractC5868k.m23669a(m27758b0.toString(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y6 */
    private final boolean m11559y6(String str) {
        if (AbstractC5868k.m23669a(str, this.f10895I)) {
            return true;
        }
        return false;
    }

    /* renamed from: z6 */
    private final void m11560z6() {
        boolean m27763v;
        boolean m27763v2;
        CharSequence text = ((TextView) m11567e6(R$id.mTvMatchDate)).getText();
        AbstractC5868k.m23673e(text, "mTvMatchDate.text");
        String string = m11976o5().getResources().getString(R$string.today);
        AbstractC5868k.m23673e(string, "mContext.resources.getString(R.string.today)");
        m27763v = AbstractC7167u.m27763v(text, string, false, 2, null);
        if (m27763v) {
            C4402x0 c4402x0 = (C4402x0) m11977r5();
            C1150b0 c1150b0 = this.f10894H;
            AbstractC5868k.m23671c(c1150b0);
            c4402x0.m18418e5(c1150b0.m5248g(), ((MemoryListView) m11567e6(R$id.mMlvMatchSchedule)).getSelectedItemPosition());
            return;
        }
        int i10 = R$id.mMlvMatchSchedule;
        ((MemoryListView) m11567e6(i10)).requestFocus();
        if (((MemoryListView) m11567e6(i10)).getSelectedItemPosition() == 0) {
            int i11 = R$id.mTvSize;
            CharSequence text2 = ((TextView) m11567e6(i11)).getText();
            AbstractC5868k.m23673e(text2, "mTvSize.text");
            m27763v2 = AbstractC7167u.m27763v(text2, "(0/", false, 2, null);
            if (m27763v2) {
                ((TextView) m11567e6(i11)).setVisibility(0);
                ((TextView) m11567e6(i11)).setText("(1/" + ((MemoryListView) m11567e6(i10)).getCount() + ')');
            }
        }
    }

    @Override // p115e8.InterfaceC4155n
    /* renamed from: H2 */
    public void mo11561H2(ArrayList arrayList, String str, String str2) {
        AbstractC5868k.m23674f(arrayList, "matchList");
        AbstractC5868k.m23674f(str, Progress.DATE);
        AbstractC5868k.m23674f(str2, "matchId");
        if (m11558x6(str) && m11559y6(str2)) {
            C1150b0 c1150b0 = this.f10894H;
            if (c1150b0 != null) {
                c1150b0.m5249o(arrayList);
            }
            if (this.f10892F) {
                ((MemoryListView) m11567e6(R$id.mMlvMatchSchedule)).setSelectionTriggerItemSelect(arrayList.size() - 1);
            } else {
                ((MemoryListView) m11567e6(R$id.mMlvMatchSchedule)).setSelectionTriggerItemSelect(0);
            }
            int i10 = R$id.mTvSize;
            ((TextView) m11567e6(i10)).setVisibility(0);
            ((TextView) m11567e6(i10)).setText("(0/" + arrayList.size() + ')');
            ((AutoLinearLayout) m11567e6(R$id.mLlNoSchedule)).setVisibility(8);
            int i11 = R$id.mMlvMatchSchedule;
            ((MemoryListView) m11567e6(i11)).setVisibility(0);
            ((AutoLinearLayout) m11567e6(R$id.mLlNoInternet)).setVisibility(8);
            m11566b();
            if (this.f10897K) {
                this.f10897K = false;
                m11567e6(R$id.mVEmpty).setFocusable(false);
                ((MemoryListView) m11567e6(i11)).requestFocus();
                ((TextView) m11567e6(i10)).setText("(1/" + arrayList.size() + ')');
            }
        }
    }

    @Override // p115e8.InterfaceC4155n
    /* renamed from: K0 */
    public void mo11562K0(String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.DATE);
        AbstractC5868k.m23674f(str2, "matchId");
        if (m11558x6(str) && m11559y6(str2)) {
            this.f10892F = false;
            ((MemoryListView) m11567e6(R$id.mMlvMatchSchedule)).setVisibility(8);
            ((AutoLinearLayout) m11567e6(R$id.mLlNoSchedule)).setVisibility(8);
            ((AutoLinearLayout) m11567e6(R$id.mLlNoInternet)).setVisibility(0);
            ((TextView) m11567e6(R$id.mTvSize)).setVisibility(8);
            m11566b();
            if (this.f10897K) {
                this.f10897K = false;
                m11567e6(R$id.mVEmpty).setFocusable(false);
                C1179q c1179q = this.f10893G;
                if (c1179q != null) {
                    c1179q.m5410d(-1);
                }
                ((MemoryListView) m11567e6(R$id.mMlvDate)).requestFocus();
            }
        }
    }

    @Override // p115e8.InterfaceC4155n
    /* renamed from: P1 */
    public void mo11563P1(String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.DATE);
        AbstractC5868k.m23674f(str2, "matchId");
        if (m11558x6(str) && m11559y6(str2)) {
            this.f10892F = false;
            ((MemoryListView) m11567e6(R$id.mMlvMatchSchedule)).setVisibility(8);
            ((AutoLinearLayout) m11567e6(R$id.mLlNoSchedule)).setVisibility(0);
            ((AutoLinearLayout) m11567e6(R$id.mLlNoInternet)).setVisibility(8);
            ((TextView) m11567e6(R$id.mTvSize)).setVisibility(8);
            m11566b();
            if (this.f10897K) {
                this.f10897K = false;
                m11567e6(R$id.mVEmpty).setFocusable(false);
                C1179q c1179q = this.f10893G;
                if (c1179q != null) {
                    c1179q.m5410d(-1);
                }
                ((MemoryListView) m11567e6(R$id.mMlvDate)).requestFocus();
            }
        }
    }

    @Override // p115e8.InterfaceC4155n
    /* renamed from: Y1 */
    public void mo11564Y1(int i10) {
        boolean m27763v;
        int i11 = R$id.mMlvMatchSchedule;
        ((MemoryListView) m11567e6(i11)).setSelection(i10);
        ((MemoryListView) m11567e6(i11)).requestFocus();
        if (((MemoryListView) m11567e6(i11)).getSelectedItemPosition() == 0) {
            int i12 = R$id.mTvSize;
            CharSequence text = ((TextView) m11567e6(i12)).getText();
            AbstractC5868k.m23673e(text, "mTvSize.text");
            m27763v = AbstractC7167u.m27763v(text, "(0/", false, 2, null);
            if (m27763v) {
                ((TextView) m11567e6(i12)).setVisibility(0);
                ((TextView) m11567e6(i12)).setText("(1/" + ((MemoryListView) m11567e6(i11)).getCount() + ')');
            }
        }
    }

    /* renamed from: a */
    public final void m11565a() {
        int i10 = R$id.mLoadingView;
        if (((LoadingView) m11567e6(i10)).getVisibility() == 8) {
            ((LoadingView) m11567e6(i10)).setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void m11566b() {
        ((LoadingView) m11567e6(R$id.mLoadingView)).setVisibility(8);
    }

    /* renamed from: e6 */
    public View m11567e6(int i10) {
        Map map = this.f10899M;
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

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((TextView) m11567e6(R$id.mTvMatchScheduleHint)).setText(Html.fromHtml(getResources().getString(R$string.match_schedule_hint)));
        int i10 = R$id.mMlvDate;
        MemoryListView memoryListView = (MemoryListView) m11567e6(i10);
        AbstractC5868k.m23673e(memoryListView, "mMlvDate");
        this.f10893G = new C1179q(this, memoryListView);
        ((MemoryListView) m11567e6(i10)).setAdapter((ListAdapter) this.f10893G);
        C1150b0 c1150b0 = new C1150b0(this);
        this.f10894H = c1150b0;
        c1150b0.m5250p(this);
        int i11 = R$id.mMlvMatchSchedule;
        ((MemoryListView) m11567e6(i11)).setAdapter((ListAdapter) this.f10894H);
        ((MemoryListView) m11567e6(i11)).setItemsCanFocus(true);
        m11572w6();
    }

    @Override // p115e8.InterfaceC4155n
    /* renamed from: l3 */
    public void mo11568l3() {
        C1150b0 c1150b0 = this.f10894H;
        if (c1150b0 != null) {
            c1150b0.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC5868k.m23674f(view, "v");
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getAction() == 0) {
            int id2 = view.getId();
            int i11 = R$id.mMlvDate;
            if (id2 == i11) {
                if (i10 == 22) {
                    int i12 = R$id.mMlvMatchSchedule;
                    if (((MemoryListView) m11567e6(i12)).getVisibility() == 0 && ((MemoryListView) m11567e6(i12)).getCount() > 0) {
                        C1179q c1179q = this.f10893G;
                        if (c1179q != null) {
                            c1179q.m5410d(((MemoryListView) m11567e6(i11)).getSelectedItemPosition());
                        }
                        m11560z6();
                    }
                    return true;
                }
            } else {
                int i13 = R$id.mMlvMatchSchedule;
                if (id2 == i13 || id2 == R$id.mLayoutMatchHome) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    switch (i10) {
                        case 19:
                            C1150b0 c1150b0 = this.f10894H;
                            if (c1150b0 != null && c1150b0.getCount() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && ((MemoryListView) m11567e6(i13)).getSelectedItemPosition() == 0) {
                                this.f10892F = true;
                                if (keyEvent.getRepeatCount() == 0) {
                                    m11557s6(true);
                                }
                                return true;
                            }
                            this.f10892F = false;
                            break;
                            break;
                        case 20:
                            this.f10892F = false;
                            C1150b0 c1150b02 = this.f10894H;
                            if (c1150b02 != null && c1150b02.getCount() == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12 && ((MemoryListView) m11567e6(i13)).getSelectedItemPosition() == ((MemoryListView) m11567e6(i13)).getCount() - 1) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    m11557s6(false);
                                }
                                return true;
                            }
                            break;
                        case 21:
                            C1179q c1179q2 = this.f10893G;
                            if (c1179q2 != null) {
                                c1179q2.m5410d(-1);
                            }
                            ((MemoryListView) m11567e6(i11)).requestFocus();
                            return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        ArrayList arrayList;
        super.onResume();
        C4402x0 c4402x0 = (C4402x0) m11977r5();
        C1150b0 c1150b0 = this.f10894H;
        if (c1150b0 != null) {
            arrayList = c1150b0.m5248g();
        } else {
            arrayList = null;
        }
        c4402x0.m18420s5(arrayList);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: q6, reason: merged with bridge method [inline-methods] */
    public C4402x0 mo7516s5() {
        return new C4402x0(this, this);
    }

    /* renamed from: t6 */
    public final void m11570t6() {
        ((MemoryListView) m11567e6(R$id.mMlvMatchSchedule)).setVisibility(8);
        ((AutoLinearLayout) m11567e6(R$id.mLlNoSchedule)).setVisibility(8);
        ((AutoLinearLayout) m11567e6(R$id.mLlNoInternet)).setVisibility(8);
    }

    @Override // p115e8.InterfaceC4155n
    /* renamed from: v3 */
    public void mo11571v3(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "dateList");
        C1179q c1179q = this.f10893G;
        if (c1179q != null) {
            c1179q.m5409c(arrayList);
        }
        int i10 = R$id.mMlvDate;
        ((MemoryListView) m11567e6(i10)).requestFocus();
        ((MemoryListView) m11567e6(i10)).setSelectionFromTop(14, AbstractC7786b.m30163g(390));
    }

    /* renamed from: w6 */
    public final void m11572w6() {
        int i10 = R$id.mMlvDate;
        ((MemoryListView) m11567e6(i10)).setOnItemSelectedListener(new C2869b());
        ((MemoryListView) m11567e6(R$id.mMlvMatchSchedule)).setOnItemSelectedListener(new C2870c());
        ((MemoryListView) m11567e6(i10)).setOnKeyListener(this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_match_schedule;
    }
}
