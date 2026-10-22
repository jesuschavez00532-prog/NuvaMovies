package com.live.view.player;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.live.R$id;
import com.live.R$layout;
import com.live.view.player.LivePlayerController;
import com.module.R$string;
import com.module.view.notice.NoticeTextView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p430z9.AbstractActivityC7763a;

/* loaded from: classes2.dex */
public final class LivePlayerController extends FrameLayout {

    /* renamed from: a */
    private AbstractActivityC7763a f11044a;

    /* renamed from: b */
    public Map f11045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePlayerController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f11045b = new LinkedHashMap();
        this.f11044a = (AbstractActivityC7763a) context;
        LayoutInflater.from(context).inflate(R$layout.layout_live_player_controller, (ViewGroup) this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSwitchingHide$lambda$0(LivePlayerController livePlayerController) {
        AbstractC5868k.m23674f(livePlayerController, "this$0");
        ((TextView) livePlayerController.m11682b(R$id.mTvPlayStatus)).setVisibility(8);
    }

    /* renamed from: b */
    public View m11682b(int i10) {
        Map map = this.f11045b;
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

    /* renamed from: c */
    public final void m11683c() {
        ((TextView) m11682b(R$id.mTextChannelNo)).setVisibility(8);
    }

    /* renamed from: d */
    public final void m11684d() {
        int i10 = R$id.mTvPlayStatus;
        if (((TextView) m11682b(i10)).getVisibility() == 0) {
            ((TextView) m11682b(i10)).setText(getContext().getString(R$string.vod_menu_switch_player_success));
            ((TextView) m11682b(i10)).postDelayed(new Runnable() { // from class: o8.n
                @Override // java.lang.Runnable
                public final void run() {
                    LivePlayerController.setSwitchingHide$lambda$0(LivePlayerController.this);
                }
            }, 3000L);
            ((LivePlayerBufferView) m11682b(R$id.mBufferView)).m11680e();
        }
    }

    /* renamed from: e */
    public final void m11685e() {
        int i10 = R$id.mTvPlayStatus;
        ((TextView) m11682b(i10)).setText(getContext().getString(R$string.vod_menu_switching_player));
        ((TextView) m11682b(i10)).setVisibility(0);
        ((LivePlayerBufferView) m11682b(R$id.mBufferView)).m11679c();
    }

    /* renamed from: f */
    public final void m11686f(int i10) {
        int i11 = R$id.mTextChannelNo;
        ((TextView) m11682b(i11)).setText(String.valueOf(i10));
        ((TextView) m11682b(i11)).setVisibility(0);
    }

    /* renamed from: g */
    public final void m11687g(boolean z10) {
        int i10;
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i11 = R$id.mBufferView;
        LivePlayerBufferView livePlayerBufferView = (LivePlayerBufferView) m11682b(i11);
        if (livePlayerBufferView != null && i10 == livePlayerBufferView.getVisibility()) {
            z11 = true;
        }
        if (!z11) {
            ((LivePlayerBufferView) m11682b(i11)).setVisibility(i10);
        }
    }

    public final AbstractActivityC7763a getMActivity() {
        return this.f11044a;
    }

    /* renamed from: h */
    public final void m11688h() {
        NoticeTextView noticeTextView = (NoticeTextView) m11682b(R$id.mNoticeView);
        if (noticeTextView != null) {
            noticeTextView.m12349m();
        }
    }

    public final void setChannelName(String str) {
        AbstractC5868k.m23674f(str, "channelName");
        NoticeTextView noticeTextView = (NoticeTextView) m11682b(R$id.mNoticeView);
        if (noticeTextView != null) {
            noticeTextView.setChannelNotice(str);
        }
    }

    public final void setMActivity(AbstractActivityC7763a abstractActivityC7763a) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "<set-?>");
        this.f11044a = abstractActivityC7763a;
    }

    public final void setPlayNotice(String str) {
        AbstractC5868k.m23674f(str, "text");
        if (TextUtils.isEmpty(str)) {
            ((TextView) m11682b(R$id.mTvPlayNotice)).setVisibility(8);
        } else {
            ((TextView) m11682b(R$id.mTvPlayNotice)).setVisibility(0);
        }
        ((TextView) m11682b(R$id.mTvPlayNotice)).setText(str);
    }
}
