package com.module.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.previewseekbar.InterfaceC2985e;
import com.module.previewseekbar.PreviewSeekBar;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;
import p342ta.C6928a;
import sa.InterfaceC6778b;

/* loaded from: classes2.dex */
public final class ThumbnailSeekBar extends AutoRelativeLayout implements InterfaceC2985e, InterfaceC6778b {

    /* renamed from: a */
    private boolean f12321a;

    /* renamed from: b */
    public Map f12322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f12322b = new LinkedHashMap();
        m12286g();
    }

    /* renamed from: f */
    private final void m12285f() {
        setPreviewLoader(this);
    }

    /* renamed from: g */
    private final void m12286g() {
        LayoutInflater.from(getContext()).inflate(R$layout.layout_thumbnail_seekbar, (ViewGroup) this, true);
        m12285f();
    }

    @Override // sa.InterfaceC6778b
    /* renamed from: a */
    public void mo12287a(long j10) {
        TextView textView = (TextView) m12289d(R$id.mTvPreviewTime);
        C6928a c6928a = C6928a.f26265a;
        textView.setText(c6928a.m26918a(j10));
        ((TextView) m12289d(R$id.mTvCurrentTime)).setText(c6928a.m26918a(j10));
    }

    @Override // com.module.previewseekbar.InterfaceC2985e
    /* renamed from: b */
    public void mo12002b(InterfaceC2985e.a aVar) {
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).mo12002b(aVar);
    }

    @Override // sa.InterfaceC6778b
    /* renamed from: c */
    public void mo12288c(long j10) {
        if (((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).m12004f()) {
            C6928a c6928a = C6928a.f26265a;
            ImageView imageView = (ImageView) m12289d(R$id.mIvSeekPreview);
            AbstractC5868k.m23673e(imageView, "mIvSeekPreview");
            c6928a.m26919b(imageView, j10);
        }
        TextView textView = (TextView) m12289d(R$id.mTvPreviewTime);
        C6928a c6928a2 = C6928a.f26265a;
        textView.setText(c6928a2.m26918a(j10));
        ((TextView) m12289d(R$id.mTvCurrentTime)).setText(c6928a2.m26918a(j10));
    }

    /* renamed from: d */
    public View m12289d(int i10) {
        Map map = this.f12322b;
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

    /* renamed from: e */
    public void m12290e() {
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).m12003d();
    }

    public int getDefaultColor() {
        return ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).getDefaultColor();
    }

    @Override // com.module.previewseekbar.InterfaceC2985e
    public int getMax() {
        return ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).getMax();
    }

    @Override // com.module.previewseekbar.InterfaceC2985e
    public int getProgress() {
        return ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).getProgress();
    }

    @Override // com.module.previewseekbar.InterfaceC2985e
    public int getThumbOffset() {
        return ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).getThumbOffset();
    }

    /* renamed from: h */
    public final void m12291h() {
        if (this.f12321a) {
            int i10 = R$id.mPreviewSeekBar;
            if (((PreviewSeekBar) m12289d(i10)).m12004f()) {
                ((PreviewSeekBar) m12289d(i10)).m12003d();
                return;
            }
            ((PreviewSeekBar) m12289d(i10)).m12005g();
            C6928a c6928a = C6928a.f26265a;
            ImageView imageView = (ImageView) m12289d(R$id.mIvSeekPreview);
            AbstractC5868k.m23673e(imageView, "mIvSeekPreview");
            c6928a.m26919b(imageView, ((PreviewSeekBar) m12289d(i10)).getProgress());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).setEnabled(z10);
    }

    public void setHasPreview(boolean z10) {
        this.f12321a = z10;
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).setHasPreview(z10);
        if (z10) {
            ((AutoFrameLayout) m12289d(R$id.mPreviewThumbnail)).setBackground(getResources().getDrawable(R$drawable.video_frame));
        } else {
            ((AutoFrameLayout) m12289d(R$id.mPreviewThumbnail)).setBackgroundColor(0);
        }
    }

    public final void setMax(long j10) {
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).setMax((int) j10);
        TextView textView = (TextView) m12289d(R$id.mTvCurrentTime);
        C6928a c6928a = C6928a.f26265a;
        textView.setText(c6928a.m26918a(0L));
        ((TextView) m12289d(R$id.mTvMaxTime)).setText(c6928a.m26918a(j10));
    }

    @SuppressLint({"ResourceAsColor"})
    public void setPreviewColorResourceTint(int i10) {
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).setPreviewColorTint(i10);
    }

    public void setPreviewColorTint(int i10) {
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).setPreviewColorTint(i10);
    }

    public void setPreviewLoader(InterfaceC6778b interfaceC6778b) {
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).setPreviewLoader(interfaceC6778b);
    }

    public final void setProgress(long j10) {
        ((PreviewSeekBar) m12289d(R$id.mPreviewSeekBar)).setProgress((int) j10);
        ((TextView) m12289d(R$id.mTvCurrentTime)).setText(C6928a.f26265a.m26918a(j10));
    }

    public final void setSecondProgress(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(" - ");
        int i11 = R$id.mPreviewSeekBar;
        sb2.append(((PreviewSeekBar) m12289d(i11)).getProgress());
        sb2.append(" - ");
        sb2.append(((PreviewSeekBar) m12289d(i11)).getMax());
        AbstractC4509b.m18869b("ThumbnailSeekBar", sb2.toString(), new Object[0]);
        ((PreviewSeekBar) m12289d(i11)).setSecondaryProgress(i10);
    }
}
