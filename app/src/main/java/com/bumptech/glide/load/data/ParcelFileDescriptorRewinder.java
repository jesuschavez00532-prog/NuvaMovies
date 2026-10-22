package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.InterfaceC1605e;
import java.io.FileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC1605e {

    /* renamed from: a */
    private final InternalRewinder f6390a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class InternalRewinder {

        /* renamed from: a */
        private final ParcelFileDescriptor f6391a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6391a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() {
            int i10;
            try {
                FileDescriptor fileDescriptor = this.f6391a.getFileDescriptor();
                i10 = OsConstants.SEEK_SET;
                Os.lseek(fileDescriptor, 0L, i10);
                return this.f6391a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    /* loaded from: classes.dex */
    public static final class C1600a implements InterfaceC1605e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: a */
        public Class mo7415a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1605e mo7416b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6390a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m7411c() {
        if (Build.VERSION.SDK_INT >= 21 && !"robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1605e
    /* renamed from: b */
    public void mo7413b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1605e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo7412a() {
        return this.f6390a.rewind();
    }
}
