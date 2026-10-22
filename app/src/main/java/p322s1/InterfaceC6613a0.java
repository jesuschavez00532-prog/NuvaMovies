package p322s1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC1599a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1611k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p109e2.AbstractC4111a;
import p109e2.AbstractC4121k;
import p230m1.InterfaceC5569b;

/* renamed from: s1.a0 */
/* loaded from: classes.dex */
interface InterfaceC6613a0 {

    /* renamed from: s1.a0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6613a0 {

        /* renamed from: a */
        private final ByteBuffer f25407a;

        /* renamed from: b */
        private final List f25408b;

        /* renamed from: c */
        private final InterfaceC5569b f25409c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ByteBuffer byteBuffer, List list, InterfaceC5569b interfaceC5569b) {
            this.f25407a = byteBuffer;
            this.f25408b = list;
            this.f25409c = interfaceC5569b;
        }

        /* renamed from: e */
        private InputStream m25830e() {
            return AbstractC4111a.m17196g(AbstractC4111a.m17193d(this.f25407a));
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: a */
        public int mo25826a() {
            return AbstractC1599a.m7403c(this.f25408b, AbstractC4111a.m17193d(this.f25407a), this.f25409c);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: b */
        public Bitmap mo25827b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m25830e(), null, options);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: c */
        public void mo25828c() {
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo25829d() {
            return AbstractC1599a.m7407g(this.f25408b, AbstractC4111a.m17193d(this.f25407a));
        }
    }

    /* renamed from: s1.a0$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC6613a0 {

        /* renamed from: a */
        private final C1611k f25410a;

        /* renamed from: b */
        private final InterfaceC5569b f25411b;

        /* renamed from: c */
        private final List f25412c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(InputStream inputStream, List list, InterfaceC5569b interfaceC5569b) {
            this.f25411b = (InterfaceC5569b) AbstractC4121k.m17226d(interfaceC5569b);
            this.f25412c = (List) AbstractC4121k.m17226d(list);
            this.f25410a = new C1611k(inputStream, interfaceC5569b);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: a */
        public int mo25826a() {
            return AbstractC1599a.m7402b(this.f25412c, this.f25410a.mo7412a(), this.f25411b);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: b */
        public Bitmap mo25827b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f25410a.mo7412a(), null, options);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: c */
        public void mo25828c() {
            this.f25410a.m7445c();
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo25829d() {
            return AbstractC1599a.m7406f(this.f25412c, this.f25410a.mo7412a(), this.f25411b);
        }
    }

    /* renamed from: s1.a0$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC6613a0 {

        /* renamed from: a */
        private final InterfaceC5569b f25413a;

        /* renamed from: b */
        private final List f25414b;

        /* renamed from: c */
        private final ParcelFileDescriptorRewinder f25415c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC5569b interfaceC5569b) {
            this.f25413a = (InterfaceC5569b) AbstractC4121k.m17226d(interfaceC5569b);
            this.f25414b = (List) AbstractC4121k.m17226d(list);
            this.f25415c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: a */
        public int mo25826a() {
            return AbstractC1599a.m7401a(this.f25414b, this.f25415c, this.f25413a);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: b */
        public Bitmap mo25827b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f25415c.mo7412a().getFileDescriptor(), null, options);
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: c */
        public void mo25828c() {
        }

        @Override // p322s1.InterfaceC6613a0
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo25829d() {
            return AbstractC1599a.m7405e(this.f25414b, this.f25415c, this.f25413a);
        }
    }

    /* renamed from: a */
    int mo25826a();

    /* renamed from: b */
    Bitmap mo25827b(BitmapFactory.Options options);

    /* renamed from: c */
    void mo25828c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo25829d();
}
