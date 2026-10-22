package com.umeng.message.proguard;

import android.text.TextUtils;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.message.entity.UMessage;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.ap */
/* loaded from: classes3.dex */
public final class C3570ap implements Externalizable {
    private static final long serialVersionUID = -1;

    /* renamed from: a */
    public UMessage f15961a;

    /* renamed from: b */
    long f15962b;

    /* renamed from: c */
    public int f15963c;

    public C3570ap(UMessage uMessage) {
        this.f15961a = uMessage;
        this.f15962b = System.currentTimeMillis();
        m15339a();
    }

    /* renamed from: a */
    private void m15339a() {
        JSONObject optJSONObject = this.f15961a.getRaw().optJSONObject(C3325bt.f14196aN);
        if (optJSONObject != null) {
            this.f15963c = optJSONObject.optInt("ia");
        }
    }

    public final boolean equals(Object obj) {
        UMessage uMessage;
        UMessage uMessage2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3570ap)) {
            return false;
        }
        C3570ap c3570ap = (C3570ap) obj;
        if (hashCode() != c3570ap.hashCode() || (uMessage = this.f15961a) == null || (uMessage2 = c3570ap.f15961a) == null) {
            return false;
        }
        if (uMessage == uMessage2) {
            return true;
        }
        return TextUtils.equals(uMessage.getRaw().toString(), c3570ap.f15961a.getRaw().toString());
    }

    public final int hashCode() {
        UMessage uMessage = this.f15961a;
        if (uMessage == null) {
            return super.hashCode();
        }
        if (uMessage.getRaw() == null) {
            return super.hashCode();
        }
        return this.f15961a.getRaw().hashCode();
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f15962b = objectInput.readLong();
        try {
            this.f15961a = new UMessage(new JSONObject((String) objectInput.readObject()));
            m15339a();
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    public final String toString() {
        UMessage uMessage = this.f15961a;
        if (uMessage == null) {
            return "";
        }
        return uMessage.getMsgId();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.f15962b);
        objectOutput.writeObject(this.f15961a.getRaw().toString());
        objectOutput.writeObject(null);
    }

    public C3570ap() {
    }
}
