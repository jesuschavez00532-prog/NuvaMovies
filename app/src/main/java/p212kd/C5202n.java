package p212kd;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.request.result.AssetList;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.p089ui.activity.VodDetailsActivity;
import com.vod.view.RadiusImageView;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7619y;

/* renamed from: kd.n */
/* loaded from: classes3.dex */
public final class C5202n extends AbstractC5178h {

    /* renamed from: a */
    private final LinearLayout f21290a;

    /* renamed from: b */
    private final RadiusImageView f21291b;

    /* renamed from: c */
    private final TextView f21292c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.n$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f21293a;

        /* renamed from: b */
        final /* synthetic */ C5182i f21294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AssetList assetList, C5182i c5182i) {
            super(1);
            this.f21293a = assetList;
            this.f21294b = c5182i;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21293a.getContentId());
            intent.putExtra("extra_type", this.f21293a.getType());
            intent.putExtra("extra_column_id", this.f21294b.m20929d());
            intent.putExtra("extra_play_type", MessageService.MSG_DB_READY_REPORT);
            intent.putExtra("extra_free", false);
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29164b());
            intent.putExtra("extra_umeng_event_category", this.f21294b.m20930e());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f21293a.getContentType(), "1"));
            intent.putExtra("extra_play_entrance", "home_vod");
            Intent putExtra = intent.putExtra("extra_restrict", false);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…ty.EXTRA_RESTRICT, false)");
            return putExtra;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5202n(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mColumnHorizonItem);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mColumnHorizonItem)");
        this.f21290a = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R$id.mIvPoster);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mIvPoster)");
        this.f21291b = (RadiusImageView) findViewById2;
        View findViewById3 = view.findViewById(R$id.mTvName);
        AbstractC5868k.m23673e(findViewById3, "itemView.findViewById(R.id.mTvName)");
        this.f21292c = (TextView) findViewById3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m21017g(C5182i c5182i, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5182i, "$adapter");
        if (keyEvent.getAction() == 0 && i10 == 19) {
            InterfaceC5660l m20932g = c5182i.m20932g();
            AbstractC5868k.m23673e(keyEvent, "event");
            if (((Boolean) m20932g.mo542f(keyEvent)).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m21018h(C5202n c5202n, C5182i c5182i, View view, boolean z10) {
        AbstractC5868k.m23674f(c5202n, "this$0");
        AbstractC5868k.m23674f(c5182i, "$adapter");
        if (z10) {
            c5202n.f21291b.setForceFocus(true);
            C7554b m20927b = c5182i.m20927b();
            View view2 = c5202n.itemView;
            AbstractC5868k.m23673e(view2, "itemView");
            C7554b.m28939e(m20927b, view2, 0.0f, 2, null);
            return;
        }
        c5202n.f21291b.setForceFocus(false);
        C7554b m20927b2 = c5182i.m20927b();
        View view3 = c5202n.itemView;
        AbstractC5868k.m23673e(view3, "itemView");
        C7554b.m28940h(m20927b2, view3, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m21019i(C5182i c5182i, Context context, AssetList assetList, View view) {
        AbstractC5868k.m23674f(c5182i, "$adapter");
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(assetList, "$data");
        if (c5182i.m20933h()) {
            return;
        }
        C7619y.m29367d(C7619y.f28056a, context, VodDetailsActivity.class, null, new a(assetList, c5182i), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final boolean m21020j(C5202n c5202n, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c5202n, "this$0");
        if (motionEvent.getAction() == 1) {
            c5202n.f21292c.callOnClick();
        }
        return true;
    }

    @Override // p212kd.AbstractC5178h
    /* renamed from: b */
    public void mo20903b(final C5182i c5182i, final Context context, List list, int i10) {
        AbstractC5868k.m23674f(c5182i, "adapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(list, "assetList");
        this.f21292c.setOnKeyListener(new View.OnKeyListener() { // from class: kd.j
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m21017g;
                m21017g = C5202n.m21017g(C5182i.this, view, i11, keyEvent);
                return m21017g;
            }
        });
        this.f21292c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5202n.m21018h(C5202n.this, c5182i, view, z10);
            }
        });
        if (c5182i.m20933h()) {
            this.f21292c.setText("");
            this.f21291b.setBackgroundResource(R$drawable.bg_placehoder_vertical);
            return;
        }
        final AssetList assetList = (AssetList) list.get(i10);
        this.f21292c.setText(assetList.getMShowName());
        this.f21291b.setBackgroundResource(0);
        C7594o0.m29203l(C7594o0.f27942a, assetList.getMIconPosterUrl(), this.f21291b, context, R$drawable.bg_placehoder_vertical, 0, 16, null);
        this.f21292c.setOnClickListener(new View.OnClickListener() { // from class: kd.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5202n.m21019i(C5182i.this, context, assetList, view);
            }
        });
        this.f21290a.setOnTouchListener(new View.OnTouchListener() { // from class: kd.m
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m21020j;
                m21020j = C5202n.m21020j(C5202n.this, view, motionEvent);
                return m21020j;
            }
        });
    }
}
