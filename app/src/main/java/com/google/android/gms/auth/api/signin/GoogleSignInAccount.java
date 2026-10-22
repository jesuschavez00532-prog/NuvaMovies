package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;
import p281p4.C6203g;
import p281p4.InterfaceC6200d;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC5593a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1787a();

    /* renamed from: n */
    public static InterfaceC6200d f7499n = C6203g.m24754d();

    /* renamed from: a */
    final int f7500a;

    /* renamed from: b */
    private String f7501b;

    /* renamed from: c */
    private String f7502c;

    /* renamed from: d */
    private String f7503d;

    /* renamed from: e */
    private String f7504e;

    /* renamed from: f */
    private Uri f7505f;

    /* renamed from: g */
    private String f7506g;

    /* renamed from: h */
    private long f7507h;

    /* renamed from: i */
    private String f7508i;

    /* renamed from: j */
    List f7509j;

    /* renamed from: k */
    private String f7510k;

    /* renamed from: l */
    private String f7511l;

    /* renamed from: m */
    private Set f7512m = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f7500a = i10;
        this.f7501b = str;
        this.f7502c = str2;
        this.f7503d = str3;
        this.f7504e = str4;
        this.f7505f = uri;
        this.f7506g = str5;
        this.f7507h = j10;
        this.f7508i = str6;
        this.f7509j = list;
        this.f7510k = str7;
        this.f7511l = str8;
    }

    /* renamed from: u */
    public static GoogleSignInAccount m7898u(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), AbstractC5391n.m21779e(str7), new ArrayList((Collection) AbstractC5391n.m21783i(set)), str5, str6);
    }

    /* renamed from: v */
    public static GoogleSignInAccount m7899v(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount m7898u = m7898u(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        m7898u.f7506g = str7;
        return m7898u;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f7508i.equals(this.f7508i) || !googleSignInAccount.m7907q().equals(m7907q())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public String m7900g() {
        return this.f7504e;
    }

    public int hashCode() {
        return ((this.f7508i.hashCode() + 527) * 31) + m7907q().hashCode();
    }

    /* renamed from: i */
    public String m7901i() {
        return this.f7503d;
    }

    /* renamed from: j */
    public String m7902j() {
        return this.f7511l;
    }

    /* renamed from: k */
    public String m7903k() {
        return this.f7510k;
    }

    /* renamed from: n */
    public String m7904n() {
        return this.f7501b;
    }

    /* renamed from: o */
    public String m7905o() {
        return this.f7502c;
    }

    /* renamed from: p */
    public Uri m7906p() {
        return this.f7505f;
    }

    /* renamed from: q */
    public Set m7907q() {
        HashSet hashSet = new HashSet(this.f7509j);
        hashSet.addAll(this.f7512m);
        return hashSet;
    }

    /* renamed from: t */
    public String m7908t() {
        return this.f7506g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f7500a);
        AbstractC5595c.m22746n(parcel, 2, m7904n(), false);
        AbstractC5595c.m22746n(parcel, 3, m7905o(), false);
        AbstractC5595c.m22746n(parcel, 4, m7901i(), false);
        AbstractC5595c.m22746n(parcel, 5, m7900g(), false);
        AbstractC5595c.m22745m(parcel, 6, m7906p(), i10, false);
        AbstractC5595c.m22746n(parcel, 7, m7908t(), false);
        AbstractC5595c.m22743k(parcel, 8, this.f7507h);
        AbstractC5595c.m22746n(parcel, 9, this.f7508i, false);
        AbstractC5595c.m22749q(parcel, 10, this.f7509j, false);
        AbstractC5595c.m22746n(parcel, 11, m7903k(), false);
        AbstractC5595c.m22746n(parcel, 12, m7902j(), false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
