package p347u1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.List;
import p109e2.AbstractC4121k;
import p184j1.C4976g;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;

/* renamed from: u1.l */
/* loaded from: classes.dex */
public class C7022l implements InterfaceC4979j {

    /* renamed from: b */
    public static final C4976g f26396b = C4976g.m20319e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    private final Context f26397a;

    public C7022l(Context context) {
        this.f26397a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m27100d(Uri uri, String str) {
        if (str.equals(this.f26397a.getPackageName())) {
            return this.f26397a;
        }
        try {
            return this.f26397a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f26397a.getPackageName())) {
                return this.f26397a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    /* renamed from: e */
    private int m27101e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    /* renamed from: f */
    private int m27102f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, DispatchConstants.ANDROID);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    private int m27103g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m27102f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m27101e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(Uri uri, int i10, int i11, C4977h c4977h) {
        Resources.Theme theme;
        Drawable m27093a;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context m27100d = m27100d(uri, authority);
            int m27103g = m27103g(m27100d, uri);
            if (((String) AbstractC4121k.m17226d(authority)).equals(this.f26397a.getPackageName())) {
                theme = (Resources.Theme) c4977h.m20325c(f26396b);
            } else {
                theme = null;
            }
            if (theme == null) {
                m27093a = AbstractC7019i.m27094b(this.f26397a, m27100d, m27103g);
            } else {
                m27093a = AbstractC7019i.m27093a(this.f26397a, m27103g, theme);
            }
            return C7021k.m27099e(m27093a);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(Uri uri, C4977h c4977h) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }
}
