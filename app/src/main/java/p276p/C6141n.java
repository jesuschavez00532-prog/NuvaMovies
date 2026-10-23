package p276p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p254o.AbstractC5891f;
import p345u.AbstractC7005f;

/* renamed from: p.n */
/* loaded from: classes.dex */
public class C6141n extends C6142o {
    @Override // p276p.C6142o
    /* renamed from: b */
    public Typeface mo24468b(Context context, AbstractC5891f.b bVar, Resources resources, int i10) {
        int i11 = 0;
        try {
            AbstractC5891f.c[] m23775a = bVar.m23775a();
            int length = m23775a.length;
            int i12 = 0;
            FontFamily.Builder builder = null;
            int i13 = 0;
            while (true) {
                int i14 = 1;
                if (i13 >= length) {
                    break;
                }
                AbstractC5891f.c cVar = m23775a[i13];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.m23777b()).setWeight(cVar.m23780e());
                    if (!cVar.m23781f()) {
                        i14 = 0;
                    }
                    Font build = weight.setSlant(i14).setTtcIndex(cVar.m23778c()).setFontVariationSettings(cVar.m23779d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i13++;
            }
            if (builder == null) {
                return null;
            }
            if ((i10 & 1) != 0) {
                i11 = 700;
            } else {
                i11 = 400;
            }
            if ((i10 & 2) != 0) {
                i12 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i11, i12)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p276p.C6142o
    /* renamed from: c */
    public Typeface mo24469c(Context context, CancellationSignal cancellationSignal, AbstractC7005f.b[] bVarArr, int i10) {
        int i11 = 0;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            int i12 = 0;
            FontFamily.Builder builder = null;
            int i13 = 0;
            while (true) {
                int i14 = 1;
                if (i13 < length) {
                    AbstractC7005f.b bVar = bVarArr[i13];
                    try {
                        openFileDescriptor = contentResolver.openFileDescriptor(bVar.m27044d(), "r", cancellationSignal);
                    } catch (IOException unused) {
                    }
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor == null) {
                            i13++;
                        }
                    } else {
                        try {
                            Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.m27045e());
                            if (!bVar.m27046f()) {
                                i14 = 0;
                            }
                            Font build = weight.setSlant(i14).setTtcIndex(bVar.m27043c()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    }
                    openFileDescriptor.close();
                    i13++;
                } else {
                    if (builder == null) {
                        return null;
                    }
                    if ((i10 & 1) != 0) {
                        i11 = 700;
                    } else {
                        i11 = 400;
                    }
                    if ((i10 & 2) != 0) {
                        i12 = 1;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i11, i12)).build();
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276p.C6142o
    /* renamed from: d */
    public Typeface mo24489d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p276p.C6142o
    /* renamed from: e */
    public Typeface mo24481e(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276p.C6142o
    /* renamed from: h */
    public AbstractC7005f.b mo24490h(AbstractC7005f.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
