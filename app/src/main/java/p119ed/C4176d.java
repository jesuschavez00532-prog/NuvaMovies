package p119ed;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.titan.ranger.bean.Program;
import gb.AbstractC4422e;
import p104dd.AbstractC4095c;

/* renamed from: ed.d */
/* loaded from: classes3.dex */
public class C4176d extends C4177e {

    /* renamed from: k */
    private String f18273k;

    /* renamed from: l */
    private Long f18274l;

    /* renamed from: m */
    private String f18275m;

    /* renamed from: n */
    private String f18276n;

    /* renamed from: o */
    private TextView f18277o;

    /* renamed from: p */
    private int f18278p;

    /* renamed from: q */
    private int f18279q;

    /* renamed from: r */
    private boolean f18280r;

    public C4176d(Context context) {
        super(context);
        this.f18273k = "TitanVodVideoView";
        this.f18274l = 0L;
        this.f18275m = "";
        this.f18276n = "";
        this.f18277o = null;
        this.f18278p = 11;
        this.f18279q = 14;
        this.f18280r = true;
        m17465F();
    }

    /* renamed from: C */
    private int m17459C() {
        if (getResources().getConfiguration().orientation == 2) {
            return this.f18279q;
        }
        return this.f18278p;
    }

    /* renamed from: D */
    private void m17460D() {
        this.f18277o.setVisibility(8);
        this.f18277o.setText("");
    }

    /* renamed from: G */
    private TextView m17461G() {
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setShadowLayer(1.0f, 1.0f, 3.0f, -16777216);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(2, m17459C());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = getBottomMargin();
        textView.setLayoutParams(layoutParams);
        textView.setText("");
        return textView;
    }

    /* renamed from: H */
    private void m17462H() {
        if (this.f18280r && !TextUtils.isEmpty(this.f18275m) && m17473r()) {
            AbstractC4422e.m18520k(this.f18277o, getCurrentProgress() + 200 + this.f18274l.longValue());
        }
    }

    private int getBottomMargin() {
        if (getResources().getConfiguration().orientation == 2) {
            return AbstractC4095c.m17150a(getContext(), 70.0f);
        }
        return AbstractC4095c.m17150a(getContext(), 25.0f);
    }

    @Override // p119ed.C4177e
    /* renamed from: A */
    public void mo17463A(Program program, String str, String str2) {
        AbstractC4422e.m18519j();
        m17460D();
        super.mo17463A(program, str, str2);
    }

    /* renamed from: E */
    public void m17464E(boolean z10) {
        this.f18280r = z10;
    }

    /* renamed from: F */
    public void m17465F() {
        TextView m17461G = m17461G();
        this.f18277o = m17461G;
        addView(m17461G);
    }

    @Override // p119ed.C4177e, p386wc.InterfaceC7392a
    /* renamed from: e */
    public void mo5946e(int i10, String str, String str2) {
        super.mo5946e(i10, str, str2);
        if (str.equals("media")) {
            m17460D();
        }
    }

    @Override // p119ed.C4177e, p386wc.InterfaceC7392a
    /* renamed from: f */
    public void mo5947f(int i10, long j10, String str) {
        super.mo5947f(i10, j10, str);
        m17462H();
    }

    public String getSubtitlePath() {
        return this.f18275m;
    }

    @Override // p119ed.C4177e, p386wc.InterfaceC7392a
    /* renamed from: l */
    public void mo5953l(int i10, int i11, int i12, String str, String str2) {
        super.mo5953l(i10, i11, i12, str, str2);
        if (str.equals("media")) {
            AbstractC4422e.m18519j();
            m17460D();
            if (this.f18275m != null && getTitanContext() != null && this.f18276n.equals(getTitanContext().mo805b())) {
                AbstractC4422e.m18521l(this.f18275m);
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18277o.setTextSize(2, m17459C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p119ed.C4177e, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AbstractC4422e.m18519j();
        super.onDetachedFromWindow();
    }

    public void setSubtitleBg(int i10) {
        TextView textView = this.f18277o;
        if (textView != null) {
            if (i10 == 1) {
                textView.setBackgroundColor(-16777216);
            } else {
                textView.setBackgroundColor(Color.argb(0, 0, 0, 0));
            }
        }
    }

    public void setSubtitleColor(int i10) {
        TextView textView = this.f18277o;
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(i10));
        }
    }

    public void setSubtitleVisible(boolean z10) {
        m17464E(z10);
        if (z10) {
            TextView textView = this.f18277o;
            if (textView != null) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        m17460D();
    }

    public void setSubtitlestime(long j10) {
        this.f18274l = Long.valueOf(j10);
    }
}
