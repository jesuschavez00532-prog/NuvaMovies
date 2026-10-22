package p212kd;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.p089ui.activity.VodCategoryActivity;
import com.vod.view.RadiusImageView;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p400xa.C7554b;
import p400xa.C7619y;

/* renamed from: kd.r */
/* loaded from: classes3.dex */
public final class C5218r extends AbstractC5178h {

    /* renamed from: a */
    private final RadiusImageView f21330a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.r$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5182i f21331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5182i c5182i) {
            super(1);
            this.f21331a = c5182i;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_column_id", this.f21331a.m20931f());
            intent.putExtra("extra_column_code", this.f21331a.m20928c());
            intent.putExtra("extra_category_type", this.f21331a.m20930e());
            intent.putExtra("extra_play_entrance", "home_vod" + this.f21331a.m20930e());
            Intent putExtra = intent.putExtra("extra_category_selected_alias", this.f21331a.m20926a());
            AbstractC5868k.m23673e(putExtra, "intent .putExtra(VodCate…ED_ALIAS, adapter.mAlias)");
            return putExtra;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5218r(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mHorizonMore);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mHorizonMore)");
        this.f21330a = (RadiusImageView) findViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m21052f(C5182i c5182i, C5218r c5218r, View view, boolean z10) {
        AbstractC5868k.m23674f(c5182i, "$adapter");
        AbstractC5868k.m23674f(c5218r, "this$0");
        if (z10) {
            C7554b m20927b = c5182i.m20927b();
            View view2 = c5218r.itemView;
            AbstractC5868k.m23673e(view2, "itemView");
            C7554b.m28939e(m20927b, view2, 0.0f, 2, null);
            return;
        }
        C7554b m20927b2 = c5182i.m20927b();
        View view3 = c5218r.itemView;
        AbstractC5868k.m23673e(view3, "itemView");
        C7554b.m28940h(m20927b2, view3, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m21053g(Context context, C5182i c5182i, View view) {
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(c5182i, "$adapter");
        C7619y.m29367d(C7619y.f28056a, context, VodCategoryActivity.class, null, new a(c5182i), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m21054h(C5218r c5218r, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c5218r, "this$0");
        if (motionEvent.getAction() == 1) {
            c5218r.f21330a.performClick();
        }
        return true;
    }

    @Override // p212kd.AbstractC5178h
    /* renamed from: b */
    public void mo20903b(final C5182i c5182i, final Context context, List list, int i10) {
        AbstractC5868k.m23674f(c5182i, "adapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(list, "assetList");
        this.f21330a.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5218r.m21052f(C5182i.this, this, view, z10);
            }
        });
        this.f21330a.setOnClickListener(new View.OnClickListener() { // from class: kd.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5218r.m21053g(context, c5182i, view);
            }
        });
        this.f21330a.setOnTouchListener(new View.OnTouchListener() { // from class: kd.q
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m21054h;
                m21054h = C5218r.m21054h(C5218r.this, view, motionEvent);
                return m21054h;
            }
        });
    }
}
