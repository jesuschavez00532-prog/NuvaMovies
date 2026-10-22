package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.umeng.analytics.pro.ds */
/* loaded from: classes3.dex */
public class C3378ds extends AbstractC3380du {

    /* renamed from: a */
    protected InputStream f14527a;

    /* renamed from: b */
    protected OutputStream f14528b;

    protected C3378ds() {
        this.f14527a = null;
        this.f14528b = null;
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: a */
    public boolean mo14220a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: b */
    public void mo14221b() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: c */
    public void mo14223c() {
        InputStream inputStream = this.f14527a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            this.f14527a = null;
        }
        OutputStream outputStream = this.f14528b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            this.f14528b = null;
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: d */
    public void mo14224d() {
        OutputStream outputStream = this.f14528b;
        if (outputStream != null) {
            try {
                outputStream.flush();
                return;
            } catch (IOException e10) {
                throw new C3381dv(0, e10);
            }
        }
        throw new C3381dv(1, "Cannot flush null outputStream");
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: a */
    public int mo14219a(byte[] bArr, int i10, int i11) {
        InputStream inputStream = this.f14527a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i10, i11);
                if (read >= 0) {
                    return read;
                }
                throw new C3381dv(4);
            } catch (IOException e10) {
                throw new C3381dv(0, e10);
            }
        }
        throw new C3381dv(1, "Cannot read from null inputStream");
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: b */
    public void mo14222b(byte[] bArr, int i10, int i11) {
        OutputStream outputStream = this.f14528b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i10, i11);
                return;
            } catch (IOException e10) {
                throw new C3381dv(0, e10);
            }
        }
        throw new C3381dv(1, "Cannot write to null outputStream");
    }

    public C3378ds(InputStream inputStream) {
        this.f14528b = null;
        this.f14527a = inputStream;
    }

    public C3378ds(OutputStream outputStream) {
        this.f14527a = null;
        this.f14528b = outputStream;
    }

    public C3378ds(InputStream inputStream, OutputStream outputStream) {
        this.f14527a = inputStream;
        this.f14528b = outputStream;
    }
}
