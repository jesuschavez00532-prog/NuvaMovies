package p200k1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.C1607g;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p184j1.EnumC4970a;

/* renamed from: k1.c */
/* loaded from: classes.dex */
public class C5081c implements InterfaceC1604d {

    /* renamed from: a */
    private final Uri f20927a;

    /* renamed from: b */
    private final C5083e f20928b;

    /* renamed from: c */
    private InputStream f20929c;

    /* renamed from: k1.c$a */
    /* loaded from: classes.dex */
    static class a implements InterfaceC5082d {

        /* renamed from: b */
        private static final String[] f20930b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f20931a;

        a(ContentResolver contentResolver) {
            this.f20931a = contentResolver;
        }

        @Override // p200k1.InterfaceC5082d
        /* renamed from: a */
        public Cursor mo20584a(Uri uri) {
            return this.f20931a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f20930b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: k1.c$b */
    /* loaded from: classes.dex */
    static class b implements InterfaceC5082d {

        /* renamed from: b */
        private static final String[] f20932b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f20933a;

        b(ContentResolver contentResolver) {
            this.f20933a = contentResolver;
        }

        @Override // p200k1.InterfaceC5082d
        /* renamed from: a */
        public Cursor mo20584a(Uri uri) {
            return this.f20933a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f20932b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C5081c(Uri uri, C5083e c5083e) {
        this.f20927a = uri;
        this.f20928b = c5083e;
    }

    /* renamed from: c */
    private static C5081c m20580c(Context context, Uri uri, InterfaceC5082d interfaceC5082d) {
        return new C5081c(uri, new C5083e(ComponentCallbacks2C1586c.m7276d(context).m7292k().m7327g(), interfaceC5082d, ComponentCallbacks2C1586c.m7276d(context).m7287f(), context.getContentResolver()));
    }

    /* renamed from: e */
    public static C5081c m20581e(Context context, Uri uri) {
        return m20580c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: f */
    public static C5081c m20582f(Context context, Uri uri) {
        return m20580c(context, uri, new b(context.getContentResolver()));
    }

    /* renamed from: g */
    private InputStream m20583g() {
        int i10 = 0;
        InputStream m20588d = this.f20928b.m20588d(this.f20927a);
        if (m20588d != null) {
            i10 = this.f20928b.m20587a(this.f20927a);
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            return new C1607g(m20588d, i10);
        }
        return m20588d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: a */
    public Class mo7418a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: b */
    public void mo7423b() {
        InputStream inputStream = this.f20929c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: d */
    public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
        try {
            InputStream m20583g = m20583g();
            this.f20929c = m20583g;
            aVar.mo7431e(m20583g);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.mo7430c(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public EnumC4970a getDataSource() {
        return EnumC4970a.LOCAL;
    }
}
