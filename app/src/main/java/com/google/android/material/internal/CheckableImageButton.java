package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.C0427o;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0551a;
import p020b0.AbstractC1031a;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0427o implements Checkable {

    /* renamed from: f */
    private static final int[] f9732f = {R.attr.state_checked};

    /* renamed from: c */
    private boolean f9733c;

    /* renamed from: d */
    private boolean f9734d;

    /* renamed from: e */
    private boolean f9735e;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes.dex */
    class C2580a extends C0551a {
        C2580a() {
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: f */
        public void mo2381f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2381f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            super.mo2382g(view, c7458h0);
            c7458h0.m28597V(CheckableImageButton.this.m10579a());
            c7458h0.m28598W(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    /* loaded from: classes.dex */
    public static class C2581b extends AbstractC1031a {
        public static final Parcelable.Creator<C2581b> CREATOR = new a();

        /* renamed from: c */
        boolean f9737c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2581b createFromParcel(Parcel parcel) {
                return new C2581b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2581b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2581b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2581b[] newArray(int i10) {
                return new C2581b[i10];
            }
        }

        public C2581b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m10580b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f9737c = z10;
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9737c ? 1 : 0);
        }

        public C2581b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m10580b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    /* renamed from: a */
    public boolean m10579a() {
        return this.f9734d;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9733c;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f9733c) {
            int[] iArr = f9732f;
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2581b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2581b c2581b = (C2581b) parcelable;
        super.onRestoreInstanceState(c2581b.m4828a());
        setChecked(c2581b.f9737c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C2581b c2581b = new C2581b(super.onSaveInstanceState());
        c2581b.f9737c = this.f9733c;
        return c2581b;
    }

    public void setCheckable(boolean z10) {
        if (this.f9734d != z10) {
            this.f9734d = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f9734d && this.f9733c != z10) {
            this.f9733c = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f9735e = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f9735e) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9733c);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9734d = true;
        this.f9735e = true;
        AbstractC0616q0.m2636n0(this, new C2580a());
    }
}
