package org.android.spdy;

import com.raizlabs.android.dbflow.sql.language.Operator;

/* loaded from: classes3.dex */
public class SessionInfo {
    private static int INVALID_PUBLIC_SEQNUM = -1;
    private String domain;
    private String host;
    private int mode;
    private int port;
    private String proxyHost;
    private int proxyPort;
    private SessionCb sessionCb;
    private Object sessionUserData;
    private String certHost = null;
    private int pubkey_seqnum = INVALID_PUBLIC_SEQNUM;
    private int connTimeoutMs = -1;

    public SessionInfo(String str, int i10, String str2, String str3, int i11, Object obj, SessionCb sessionCb, int i12) {
        this.host = str;
        this.port = i10;
        this.domain = str2;
        this.proxyHost = str3;
        this.proxyPort = i11;
        this.sessionUserData = obj;
        this.sessionCb = sessionCb;
        this.mode = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getAuthority() {
        if (this.proxyHost != null && this.proxyPort != 0) {
            return this.host + ":" + this.port + Operator.Operation.DIVISION + this.proxyHost + ":" + this.proxyPort;
        }
        return this.host + ":" + this.port;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getCertHost() {
        if (this.pubkey_seqnum != INVALID_PUBLIC_SEQNUM) {
            return null;
        }
        return this.certHost;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getConnectionTimeoutMs() {
        return this.connTimeoutMs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getDomain() {
        return this.domain;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMode() {
        return this.mode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPubKeySeqNum() {
        return this.pubkey_seqnum;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionCb getSessionCb() {
        return this.sessionCb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object getSessonUserData() {
        return this.sessionUserData;
    }

    public void setCertHost(String str) {
        this.certHost = str;
    }

    public void setConnectionTimeoutMs(int i10) {
        this.connTimeoutMs = i10;
    }

    public void setPubKeySeqNum(int i10) {
        this.pubkey_seqnum = i10;
    }
}
