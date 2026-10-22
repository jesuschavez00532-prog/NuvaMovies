package p212kd;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.module.bean.SeriesSeasonBean;
import com.request.result.AssetList;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$string;
import com.vod.p089ui.activity.VodDetailsActivity;
import com.vod.view.RadiusImageView;
import java.util.Arrays;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p153h2.AbstractC4509b;
import p317rb.AbstractC6567a;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7607s1;
import p400xa.C7619y;

/* renamed from: kd.e0 */
/* loaded from: classes3.dex */
public final class C5167e0 extends AbstractC5246y {

    /* renamed from: a */
    private final LinearLayout f21166a;

    /* renamed from: b */
    private final RadiusImageView f21167b;

    /* renamed from: c */
    private final TextView f21168c;

    /* renamed from: d */
    private final TextView f21169d;

    /* renamed from: e */
    private String f21170e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.e0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f21171a;

        /* renamed from: b */
        final /* synthetic */ C5249z f21172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AssetList assetList, C5249z c5249z) {
            super(1);
            this.f21171a = assetList;
            this.f21172b = c5249z;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21171a.getContentId());
            intent.putExtra("extra_type", this.f21171a.getType());
            intent.putExtra("extra_column_id", this.f21172b.m21139d());
            intent.putExtra("extra_play_type", MessageService.MSG_DB_READY_REPORT);
            intent.putExtra("extra_free", false);
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29164b());
            intent.putExtra("extra_umeng_event_category", this.f21172b.m21140e());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f21171a.getContentType(), "1"));
            intent.putExtra("extra_play_entrance", "home_vod");
            Intent putExtra = intent.putExtra("extra_restrict", false);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…ty.EXTRA_RESTRICT, false)");
            return putExtra;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5167e0(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mVerticalItem);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mVerticalItem)");
        this.f21166a = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R$id.mIvPoster);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mIvPoster)");
        this.f21167b = (RadiusImageView) findViewById2;
        View findViewById3 = view.findViewById(R$id.mTvName);
        AbstractC5868k.m23673e(findViewById3, "itemView.findViewById(R.id.mTvName)");
        this.f21168c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R$id.mTextSeries);
        AbstractC5868k.m23673e(findViewById4, "itemView.findViewById(R.id.mTextSeries)");
        this.f21169d = (TextView) findViewById4;
        this.f21170e = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m20879g(C5249z c5249z, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5249z, "$adapter");
        if (keyEvent.getAction() == 0 && i10 == 19) {
            InterfaceC5660l m21142g = c5249z.m21142g();
            AbstractC5868k.m23673e(keyEvent, "event");
            if (((Boolean) m21142g.mo542f(keyEvent)).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m20880h(C5249z c5249z, C5167e0 c5167e0, View view, boolean z10) {
        AbstractC5868k.m23674f(c5249z, "$adapter");
        AbstractC5868k.m23674f(c5167e0, "this$0");
        if (z10) {
            C7554b m21137b = c5249z.m21137b();
            View view2 = c5167e0.itemView;
            AbstractC5868k.m23673e(view2, "itemView");
            C7554b.m28939e(m21137b, view2, 0.0f, 2, null);
            return;
        }
        C7554b m21137b2 = c5249z.m21137b();
        View view3 = c5167e0.itemView;
        AbstractC5868k.m23673e(view3, "itemView");
        C7554b.m28940h(m21137b2, view3, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m20881i(C5249z c5249z, Context context, AssetList assetList, View view) {
        AbstractC5868k.m23674f(c5249z, "$adapter");
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(assetList, "$data");
        if (c5249z.m21143h()) {
            return;
        }
        C7619y.m29367d(C7619y.f28056a, context, VodDetailsActivity.class, null, new a(assetList, c5249z), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final boolean m20882j(C5167e0 c5167e0, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c5167e0, "this$0");
        if (motionEvent.getAction() == 1) {
            c5167e0.f21166a.callOnClick();
        }
        return true;
    }

    /* renamed from: k */
    private final void m20883k(Context context, TextView textView, AssetList assetList) {
        if (AbstractC5868k.m23669a(assetList.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView.setVisibility(0);
            textView.setGravity(81);
            if (assetList.getUpdateCount() != assetList.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f21170e)) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = context.getString(R$string.program_update_to);
                    AbstractC5868k.m23673e(string, "context.getString(R.string.program_update_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f21170e, Integer.valueOf(assetList.getUpdateCount())}, 2));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    textView.setText(format);
                    return;
                }
                C5881x c5881x2 = C5881x.f23415a;
                String string2 = context.getString(R$string.detail_temp_set);
                AbstractC5868k.m23673e(string2, "context.getString(R.string.detail_temp_set)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(assetList.getUpdateCount())}, 1));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                textView.setText(format2);
                return;
            }
            C5881x c5881x3 = C5881x.f23415a;
            String string3 = context.getString(R$string.detail_season_over);
            AbstractC5868k.m23673e(string3, "context.getString(R.string.detail_season_over)");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f21170e}, 1));
            AbstractC5868k.m23673e(format3, "format(format, *args)");
            textView.setText(format3);
            return;
        }
        textView.setVisibility(8);
    }

    @Override // p212kd.AbstractC5246y
    /* renamed from: b */
    public void mo20884b(final C5249z c5249z, final Context context, List list, int i10) {
        AbstractC5868k.m23674f(c5249z, "adapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(list, "assetList");
        this.f21166a.setOnKeyListener(new View.OnKeyListener() { // from class: kd.a0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m20879g;
                m20879g = C5167e0.m20879g(C5249z.this, view, i11, keyEvent);
                return m20879g;
            }
        });
        this.f21166a.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.b0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5167e0.m20880h(C5249z.this, this, view, z10);
            }
        });
        if (c5249z.m21143h()) {
            this.f21168c.setText(" ");
            this.f21167b.setBackgroundResource(R$drawable.bg_placehoder);
            return;
        }
        final AssetList assetList = (AssetList) list.get(i10);
        this.f21168c.setText(assetList.getMShowName());
        String name = assetList.getName();
        if (AbstractC6567a.m25637g(name)) {
            AbstractC4509b.m18869b("ColumnVerticalAdapter", "name:" + name + ";mShowName:" + assetList.getMShowName(), new Object[0]);
            SeriesSeasonBean m29251a = new C7607s1().m29251a(name);
            m29251a.getName();
            this.f21170e = m29251a.getSeason();
        }
        m20883k(context, this.f21169d, assetList);
        this.f21167b.setBackgroundResource(0);
        C7594o0.m29203l(C7594o0.f27942a, assetList.getMIconPosterUrl(), this.f21167b, context, R$drawable.bg_placehoder, 0, 16, null);
        this.f21166a.setOnClickListener(new View.OnClickListener() { // from class: kd.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5167e0.m20881i(C5249z.this, context, assetList, view);
            }
        });
        this.f21166a.setOnTouchListener(new View.OnTouchListener() { // from class: kd.d0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m20882j;
                m20882j = C5167e0.m20882j(C5167e0.this, view, motionEvent);
                return m20882j;
            }
        });
    }
}
