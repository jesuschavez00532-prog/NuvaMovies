package p347u1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.AbstractC1599a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p109e2.AbstractC4111a;
import p109e2.AbstractC4122l;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5569b;
import p307r1.C6508n;

/* renamed from: u1.h */
/* loaded from: classes.dex */
public final class C7018h {

    /* renamed from: a */
    private final List f26389a;

    /* renamed from: b */
    private final InterfaceC5569b f26390b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5335v {

        /* renamed from: a */
        private final AnimatedImageDrawable f26391a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f26391a = animatedImageDrawable;
        }

        @Override // p216l1.InterfaceC5335v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f26391a;
        }

        @Override // p216l1.InterfaceC5335v
        /* renamed from: b */
        public void mo21576b() {
            this.f26391a.stop();
            this.f26391a.clearAnimationCallbacks();
        }

        @Override // p216l1.InterfaceC5335v
        /* renamed from: c */
        public Class mo21577c() {
            return Drawable.class;
        }

        @Override // p216l1.InterfaceC5335v
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f26391a.getIntrinsicWidth();
            intrinsicHeight = this.f26391a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * AbstractC4122l.m17237j(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1.h$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4979j {

        /* renamed from: a */
        private final C7018h f26392a;

        b(C7018h c7018h) {
            this.f26392a = c7018h;
        }

        @Override // p184j1.InterfaceC4979j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5335v mo20329a(ByteBuffer byteBuffer, int i10, int i11, C4977h c4977h) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f26392a.m27085b(createSource, i10, i11, c4977h);
        }

        @Override // p184j1.InterfaceC4979j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo20330b(ByteBuffer byteBuffer, C4977h c4977h) {
            return this.f26392a.m27087d(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1.h$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC4979j {

        /* renamed from: a */
        private final C7018h f26393a;

        c(C7018h c7018h) {
            this.f26393a = c7018h;
        }

        @Override // p184j1.InterfaceC4979j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5335v mo20329a(InputStream inputStream, int i10, int i11, C4977h c4977h) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(AbstractC4111a.m17191b(inputStream));
            return this.f26393a.m27085b(createSource, i10, i11, c4977h);
        }

        @Override // p184j1.InterfaceC4979j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo20330b(InputStream inputStream, C4977h c4977h) {
            return this.f26393a.m27086c(inputStream);
        }
    }

    private C7018h(List list, InterfaceC5569b interfaceC5569b) {
        this.f26389a = list;
        this.f26390b = interfaceC5569b;
    }

    /* renamed from: a */
    public static InterfaceC4979j m27082a(List list, InterfaceC5569b interfaceC5569b) {
        return new b(new C7018h(list, interfaceC5569b));
    }

    /* renamed from: e */
    private boolean m27083e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || imageType != ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static InterfaceC4979j m27084f(List list, InterfaceC5569b interfaceC5569b) {
        return new c(new C7018h(list, interfaceC5569b));
    }

    /* renamed from: b */
    InterfaceC5335v m27085b(ImageDecoder.Source source, int i10, int i11, C4977h c4977h) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new C6508n(i10, i11, c4977h));
        if (AbstractC7012b.m27076a(decodeDrawable)) {
            return new a(AbstractC7013c.m27077a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    /* renamed from: c */
    boolean m27086c(InputStream inputStream) {
        return m27083e(AbstractC1599a.m7406f(this.f26389a, inputStream, this.f26390b));
    }

    /* renamed from: d */
    boolean m27087d(ByteBuffer byteBuffer) {
        return m27083e(AbstractC1599a.m7407g(this.f26389a, byteBuffer));
    }
}
