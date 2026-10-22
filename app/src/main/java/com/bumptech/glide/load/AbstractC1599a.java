package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p109e2.AbstractC4111a;
import p230m1.InterfaceC5569b;
import p322s1.C6621e0;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes.dex */
public abstract class AbstractC1599a {

    /* renamed from: com.bumptech.glide.load.a$a */
    /* loaded from: classes.dex */
    class a implements h {

        /* renamed from: a */
        final /* synthetic */ InputStream f6380a;

        a(InputStream inputStream) {
            this.f6380a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC1599a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7409a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7398c(this.f6380a);
            } finally {
                this.f6380a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    /* loaded from: classes.dex */
    class b implements h {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f6381a;

        b(ByteBuffer byteBuffer) {
            this.f6381a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC1599a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7409a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7396a(this.f6381a);
            } finally {
                AbstractC4111a.m17193d(this.f6381a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    /* loaded from: classes.dex */
    class c implements h {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f6382a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5569b f6383b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5569b interfaceC5569b) {
            this.f6382a = parcelFileDescriptorRewinder;
            this.f6383b = interfaceC5569b;
        }

        @Override // com.bumptech.glide.load.AbstractC1599a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7409a(ImageHeaderParser imageHeaderParser) {
            C6621e0 c6621e0 = null;
            try {
                C6621e0 c6621e02 = new C6621e0(new FileInputStream(this.f6382a.mo7412a().getFileDescriptor()), this.f6383b);
                try {
                    ImageHeaderParser.ImageType mo7398c = imageHeaderParser.mo7398c(c6621e02);
                    c6621e02.m25846c();
                    this.f6382a.mo7412a();
                    return mo7398c;
                } catch (Throwable th) {
                    th = th;
                    c6621e0 = c6621e02;
                    if (c6621e0 != null) {
                        c6621e0.m25846c();
                    }
                    this.f6382a.mo7412a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    /* loaded from: classes.dex */
    class d implements g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f6384a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5569b f6385b;

        d(ByteBuffer byteBuffer, InterfaceC5569b interfaceC5569b) {
            this.f6384a = byteBuffer;
            this.f6385b = interfaceC5569b;
        }

        @Override // com.bumptech.glide.load.AbstractC1599a.g
        /* renamed from: a */
        public int mo7410a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7399d(this.f6384a, this.f6385b);
            } finally {
                AbstractC4111a.m17193d(this.f6384a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    /* loaded from: classes.dex */
    class e implements g {

        /* renamed from: a */
        final /* synthetic */ InputStream f6386a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5569b f6387b;

        e(InputStream inputStream, InterfaceC5569b interfaceC5569b) {
            this.f6386a = inputStream;
            this.f6387b = interfaceC5569b;
        }

        @Override // com.bumptech.glide.load.AbstractC1599a.g
        /* renamed from: a */
        public int mo7410a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7397b(this.f6386a, this.f6387b);
            } finally {
                this.f6386a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    /* loaded from: classes.dex */
    class f implements g {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f6388a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5569b f6389b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5569b interfaceC5569b) {
            this.f6388a = parcelFileDescriptorRewinder;
            this.f6389b = interfaceC5569b;
        }

        @Override // com.bumptech.glide.load.AbstractC1599a.g
        /* renamed from: a */
        public int mo7410a(ImageHeaderParser imageHeaderParser) {
            C6621e0 c6621e0 = null;
            try {
                C6621e0 c6621e02 = new C6621e0(new FileInputStream(this.f6388a.mo7412a().getFileDescriptor()), this.f6389b);
                try {
                    int mo7397b = imageHeaderParser.mo7397b(c6621e02, this.f6389b);
                    c6621e02.m25846c();
                    this.f6388a.mo7412a();
                    return mo7397b;
                } catch (Throwable th) {
                    th = th;
                    c6621e0 = c6621e02;
                    if (c6621e0 != null) {
                        c6621e0.m25846c();
                    }
                    this.f6388a.mo7412a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.a$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        int mo7410a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.a$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo7409a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m7401a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5569b interfaceC5569b) {
        return m7404d(list, new f(parcelFileDescriptorRewinder, interfaceC5569b));
    }

    /* renamed from: b */
    public static int m7402b(List list, InputStream inputStream, InterfaceC5569b interfaceC5569b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C6621e0(inputStream, interfaceC5569b);
        }
        inputStream.mark(5242880);
        return m7404d(list, new e(inputStream, interfaceC5569b));
    }

    /* renamed from: c */
    public static int m7403c(List list, ByteBuffer byteBuffer, InterfaceC5569b interfaceC5569b) {
        if (byteBuffer == null) {
            return -1;
        }
        return m7404d(list, new d(byteBuffer, interfaceC5569b));
    }

    /* renamed from: d */
    private static int m7404d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int mo7410a = gVar.mo7410a((ImageHeaderParser) list.get(i10));
            if (mo7410a != -1) {
                return mo7410a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m7405e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5569b interfaceC5569b) {
        return m7408h(list, new c(parcelFileDescriptorRewinder, interfaceC5569b));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m7406f(List list, InputStream inputStream, InterfaceC5569b interfaceC5569b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C6621e0(inputStream, interfaceC5569b);
        }
        inputStream.mark(5242880);
        return m7408h(list, new a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m7407g(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m7408h(list, new b(byteBuffer));
    }

    /* renamed from: h */
    private static ImageHeaderParser.ImageType m7408h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType mo7409a = hVar.mo7409a((ImageHeaderParser) list.get(i10));
            if (mo7409a != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo7409a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
