package p354u8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.main.R$id;
import com.open.leanback.widget.AbstractC3050a;
import ne.AbstractC5868k;

/* renamed from: u8.i */
/* loaded from: classes2.dex */
public final class C7060i extends RecyclerView.AbstractC0787f0 {

    /* renamed from: a */
    private ImageView f26486a;

    /* renamed from: b */
    private TextView f26487b;

    /* renamed from: c */
    private AbstractC3050a f26488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7060i(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mImageIcon);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f26486a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R$id.mTitleText);
        AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f26487b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R$id.mRvFreeList);
        AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type com.open.leanback.widget.BaseGridView");
        this.f26488c = (AbstractC3050a) findViewById3;
    }

    /* renamed from: b */
    public final ImageView m27209b() {
        return this.f26486a;
    }

    /* renamed from: c */
    public final AbstractC3050a m27210c() {
        return this.f26488c;
    }

    /* renamed from: d */
    public final TextView m27211d() {
        return this.f26487b;
    }
}
