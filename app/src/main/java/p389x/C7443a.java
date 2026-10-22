package p389x;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: x.a */
/* loaded from: classes.dex */
public final class C7443a extends ClickableSpan {

    /* renamed from: a */
    private final int f27486a;

    /* renamed from: b */
    private final C7458h0 f27487b;

    /* renamed from: c */
    private final int f27488c;

    public C7443a(int i10, C7458h0 c7458h0, int i11) {
        this.f27486a = i10;
        this.f27487b = c7458h0;
        this.f27488c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f27486a);
        this.f27487b.m28591N(this.f27488c, bundle);
    }
}
