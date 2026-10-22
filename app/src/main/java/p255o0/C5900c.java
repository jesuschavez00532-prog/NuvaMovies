package p255o0;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.adimage.R$drawable;
import com.adimage.R$id;
import com.adimage.R$layout;
import com.adimage.view.TraceAdImageView;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public final class C5900c extends AutoLinearLayout {

    /* renamed from: a */
    public Map f23476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5900c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f23476a = new LinkedHashMap();
        setBackgroundResource(R$drawable.bg_pause_qr_code);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R$layout.view_pause_qr_code, (ViewGroup) this, true);
    }

    /* renamed from: a */
    public View m23836a(int i10) {
        Map map = this.f23476a;
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

    public final void setQrCode(Bitmap bitmap) {
        AbstractC5868k.m23674f(bitmap, "bitmap");
        if (!bitmap.isRecycled()) {
            ((TraceAdImageView) m23836a(R$id.mIvQrCode)).setImageBitmap(bitmap);
        }
    }

    public /* synthetic */ C5900c(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
