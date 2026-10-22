package com.lzy.okgo.cookie;

import android.content.ContentValues;
import android.database.Cursor;
import com.lzy.okgo.utils.OkLogger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import okhttp3.Cookie;

/* loaded from: classes2.dex */
public class SerializableCookie implements Serializable {
    public static final String COOKIE = "cookie";
    public static final String DOMAIN = "domain";
    public static final String HOST = "host";
    public static final String NAME = "name";
    private static final long serialVersionUID = 6374381323722046732L;
    private transient Cookie clientCookie;
    private transient Cookie cookie;
    public String domain;
    public String host;
    public String name;

    public SerializableCookie(String str, Cookie cookie) {
        this.cookie = cookie;
        this.host = str;
        this.name = cookie.name();
        this.domain = cookie.domain();
    }

    private static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 < 16) {
                sb2.append('0');
            }
            sb2.append(Integer.toHexString(i10));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    public static Cookie bytesToCookie(byte[] bArr) {
        try {
            return ((SerializableCookie) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject()).getCookie();
        } catch (Exception e10) {
            OkLogger.printStackTrace(e10);
            return null;
        }
    }

    public static byte[] cookieToBytes(String str, Cookie cookie) {
        SerializableCookie serializableCookie = new SerializableCookie(str, cookie);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializableCookie);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            OkLogger.printStackTrace(e10);
            return null;
        }
    }

    public static Cookie decodeCookie(String str) {
        return bytesToCookie(hexStringToByteArray(str));
    }

    public static String encodeCookie(String str, Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return byteArrayToHexString(cookieToBytes(str, cookie));
    }

    public static ContentValues getContentValues(SerializableCookie serializableCookie) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host", serializableCookie.host);
        contentValues.put(NAME, serializableCookie.name);
        contentValues.put("domain", serializableCookie.domain);
        contentValues.put(COOKIE, cookieToBytes(serializableCookie.host, serializableCookie.getCookie()));
        return contentValues;
    }

    private static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public static SerializableCookie parseCursorToBean(Cursor cursor) {
        return new SerializableCookie(cursor.getString(cursor.getColumnIndex("host")), bytesToCookie(cursor.getBlob(cursor.getColumnIndex(COOKIE))));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Cookie.Builder domain;
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long readLong = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean readBoolean = objectInputStream.readBoolean();
        boolean readBoolean2 = objectInputStream.readBoolean();
        boolean readBoolean3 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        Cookie.Builder expiresAt = new Cookie.Builder().name(str).value(str2).expiresAt(readLong);
        if (readBoolean3) {
            domain = expiresAt.hostOnlyDomain(str3);
        } else {
            domain = expiresAt.domain(str3);
        }
        Cookie.Builder path = domain.path(str4);
        if (readBoolean) {
            path = path.secure();
        }
        if (readBoolean2) {
            path = path.httpOnly();
        }
        this.clientCookie = path.build();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.cookie.name());
        objectOutputStream.writeObject(this.cookie.value());
        objectOutputStream.writeLong(this.cookie.expiresAt());
        objectOutputStream.writeObject(this.cookie.domain());
        objectOutputStream.writeObject(this.cookie.path());
        objectOutputStream.writeBoolean(this.cookie.secure());
        objectOutputStream.writeBoolean(this.cookie.httpOnly());
        objectOutputStream.writeBoolean(this.cookie.hostOnly());
        objectOutputStream.writeBoolean(this.cookie.persistent());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SerializableCookie serializableCookie = (SerializableCookie) obj;
        String str = this.host;
        if (str == null ? serializableCookie.host != null : !str.equals(serializableCookie.host)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null ? serializableCookie.name != null : !str2.equals(serializableCookie.name)) {
            return false;
        }
        String str3 = this.domain;
        String str4 = serializableCookie.domain;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public Cookie getCookie() {
        Cookie cookie = this.cookie;
        Cookie cookie2 = this.clientCookie;
        if (cookie2 != null) {
            return cookie2;
        }
        return cookie;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.host;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        String str2 = this.name;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.domain;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }
}
