package p212kd;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vod.R$id;
import com.vod.view.RadiusImageView;
import ne.AbstractC5868k;

/* renamed from: kd.s */
/* loaded from: classes3.dex */
public final class C5222s extends RecyclerView.AbstractC0787f0 {

    /* renamed from: a */
    private final RadiusImageView f21342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5222s(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mPersonImg);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mPersonImg)");
        this.f21342a = (RadiusImageView) findViewById;
    }

    /* renamed from: b */
    public final RadiusImageView m21063b() {
        return this.f21342a;
    }
}
