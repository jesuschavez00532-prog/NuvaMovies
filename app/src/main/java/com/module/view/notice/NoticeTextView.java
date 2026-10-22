package com.module.view.notice;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import cc.C1466m0;
import com.module.R$styleable;
import com.module.view.AutoFocusedTextView;
import com.module.view.notice.NoticeTextView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import org.model.notice.NoticeManagerNew;
import p201k2.AbstractC5085b;
import p348u2.AbstractC7030g;

/* loaded from: classes2.dex */
public final class NoticeTextView extends AutoFocusedTextView {

    /* renamed from: b */
    private final String f12361b;

    /* renamed from: c */
    private int f12362c;

    /* renamed from: d */
    private boolean f12363d;

    /* renamed from: e */
    public Map f12364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this.f12364e = new LinkedHashMap();
        this.f12361b = "NoticeTextView";
        m12345k(this, context, attributeSet, 0, 4, null);
    }

    /* renamed from: j */
    private final void m12344j(Context context, AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f11931H0, i10, i10);
        AbstractC5868k.m23673e(obtainStyledAttributes, "context.theme.obtainStyl…fStyleAttr, defStyleAttr)");
        int i11 = obtainStyledAttributes.getInt(R$styleable.NoticeTextView_noticeType, 0);
        this.f12363d = obtainStyledAttributes.getBoolean(R$styleable.NoticeTextView_parentDuplicateVisibility, false);
        obtainStyledAttributes.recycle();
        this.f12362c = i11;
        AbstractC7030g.m27129c("notice service", new Runnable() { // from class: fb.a
            @Override // java.lang.Runnable
            public final void run() {
                NoticeTextView.m12346l(NoticeTextView.this);
            }
        }, false);
    }

    /* renamed from: k */
    static /* synthetic */ void m12345k(NoticeTextView noticeTextView, Context context, AttributeSet attributeSet, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            attributeSet = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        noticeTextView.m12344j(context, attributeSet, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m12346l(NoticeTextView noticeTextView) {
        AbstractC5868k.m23674f(noticeTextView, "this$0");
        noticeTextView.m12349m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m12347n(NoticeTextView noticeTextView) {
        AbstractC5868k.m23674f(noticeTextView, "this$0");
        NoticeManagerNew.getInstance().setChannelTextView(noticeTextView, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m12348p(NoticeTextView noticeTextView) {
        AbstractC5868k.m23674f(noticeTextView, "this$0");
        noticeTextView.m12349m();
    }

    public final int getMNoticeType() {
        return this.f12362c;
    }

    public final boolean getMParentDuplicateVisibility() {
        return this.f12363d;
    }

    /* renamed from: m */
    public final void m12349m() {
        int i10 = this.f12362c;
        if (i10 != 0) {
            if (i10 == 1) {
                NoticeManagerNew noticeManagerNew = NoticeManagerNew.getInstance();
                String m20598h = AbstractC5085b.m20598h(getContext());
                int m20602l = AbstractC5085b.m20602l(getContext());
                C1466m0 c1466m0 = C1466m0.f5627a;
                noticeManagerNew.start(m20598h, m20602l, c1466m0.m6885t(), c1466m0.m6878m(), "es");
                post(new Runnable() { // from class: fb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        NoticeTextView.m12347n(NoticeTextView.this);
                    }
                });
                return;
            }
            return;
        }
        NoticeManagerNew sysTextView = NoticeManagerNew.getInstance().setSysTextView(this);
        String m20598h2 = AbstractC5085b.m20598h(getContext());
        int m20602l2 = AbstractC5085b.m20602l(getContext());
        C1466m0 c1466m02 = C1466m0.f5627a;
        sysTextView.start(m20598h2, m20602l2, c1466m02.m6885t(), c1466m02.m6878m(), "es");
    }

    /* renamed from: o */
    public final void m12350o() {
        setText("");
        setVisibility(8);
        NoticeManagerNew.getInstance().closeNotice();
        AbstractC7030g.m27129c("notice service", new Runnable() { // from class: fb.c
            @Override // java.lang.Runnable
            public final void run() {
                NoticeTextView.m12348p(NoticeTextView.this);
            }
        }, false);
    }

    public final void setChannelNotice(String str) {
        if (str != null) {
            NoticeManagerNew.getInstance().setChannelName(str);
        }
    }

    public final void setMNoticeType(int i10) {
        this.f12362c = i10;
    }

    public final void setMParentDuplicateVisibility(boolean z10) {
        this.f12363d = z10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (this.f12363d) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setVisibility(i10);
            }
        }
    }
}
