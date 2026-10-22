package p212kd;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.p089ui.activity.VodCategoryActivity;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p400xa.C7554b;
import p400xa.C7619y;

/* renamed from: kd.i0 */
/* loaded from: classes3.dex */
public final class C5183i0 extends AbstractC5246y {

    /* renamed from: a */
    private final ImageView f21222a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.i0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5249z f21223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5249z c5249z) {
            super(1);
            this.f21223a = c5249z;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_column_id", this.f21223a.m21141f());
            intent.putExtra("extra_column_code", this.f21223a.m21138c());
            intent.putExtra("extra_category_type", this.f21223a.m21140e());
            intent.putExtra("extra_play_entrance", "home_vod" + this.f21223a.m21140e());
            Intent putExtra = intent.putExtra("extra_category_selected_alias", this.f21223a.m21136a());
            AbstractC5868k.m23673e(putExtra, "intent .putExtra(VodCate…ED_ALIAS, adapter.mAlias)");
            return putExtra;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183i0(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mVerticalMore);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mVerticalMore)");
        this.f21222a = (ImageView) findViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m20946f(C5249z c5249z, C5183i0 c5183i0, View view, boolean z10) {
        AbstractC5868k.m23674f(c5249z, "$adapter");
        AbstractC5868k.m23674f(c5183i0, "this$0");
        if (z10) {
            C7554b m21137b = c5249z.m21137b();
            View view2 = c5183i0.itemView;
            AbstractC5868k.m23673e(view2, "itemView");
            C7554b.m28939e(m21137b, view2, 0.0f, 2, null);
            return;
        }
        C7554b m21137b2 = c5249z.m21137b();
        View view3 = c5183i0.itemView;
        AbstractC5868k.m23673e(view3, "itemView");
        C7554b.m28940h(m21137b2, view3, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m20947g(Context context, C5249z c5249z, View view) {
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(c5249z, "$adapter");
        C7619y.m29367d(C7619y.f28056a, context, VodCategoryActivity.class, null, new a(c5249z), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m20948h(C5183i0 c5183i0, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c5183i0, "this$0");
        if (motionEvent.getAction() == 1) {
            c5183i0.f21222a.performClick();
        }
        return true;
    }

    @Override // p212kd.AbstractC5246y
    /* renamed from: b */
    public void mo20884b(final C5249z c5249z, final Context context, List list, int i10) {
        AbstractC5868k.m23674f(c5249z, "adapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(list, "assetList");
        this.f21222a.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.f0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5183i0.m20946f(C5249z.this, this, view, z10);
            }
        });
        this.f21222a.setOnClickListener(new View.OnClickListener() { // from class: kd.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5183i0.m20947g(context, c5249z, view);
            }
        });
        this.f21222a.setOnTouchListener(new View.OnTouchListener() { // from class: kd.h0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m20948h;
                m20948h = C5183i0.m20948h(C5183i0.this, view, motionEvent);
                return m20948h;
            }
        });
    }
}
