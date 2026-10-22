package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class GlobalEnvStruct {

    /* renamed from: a */
    private String f7086a;

    /* renamed from: b */
    private String f7087b;

    /* renamed from: i */
    private String f7094i;
    public Context mAppContext;

    /* renamed from: q */
    private ILogEncryptAction f7102q;

    /* renamed from: c */
    private boolean f7088c = true;

    /* renamed from: d */
    private boolean f7089d = false;

    /* renamed from: e */
    private boolean f7090e = true;

    /* renamed from: f */
    private boolean f7091f = false;

    /* renamed from: g */
    private Boolean f7092g = null;

    /* renamed from: h */
    private boolean f7093h = false;

    /* renamed from: j */
    private String f7095j = "";

    /* renamed from: k */
    private String f7096k = "";

    /* renamed from: l */
    private boolean f7097l = false;

    /* renamed from: m */
    private boolean f7098m = false;
    public long configRefreshDelayMills = 5000;

    /* renamed from: n */
    private long f7099n = 10000;

    /* renamed from: o */
    private long f7100o = 10000;

    /* renamed from: p */
    private Map<String, String> f7101p = new HashMap(5);

    /* renamed from: r */
    private ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f7103r = new ConcurrentHashMap<>();

    /* renamed from: s */
    private List<IEfsReporterObserver> f7104s = new ArrayList(5);

    public void addConfigObserver(IEfsReporterObserver iEfsReporterObserver) {
        if (!this.f7104s.contains(iEfsReporterObserver)) {
            this.f7104s.add(iEfsReporterObserver);
        }
    }

    public void addPublicParams(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            HashMap hashMap = new HashMap(this.f7101p);
            hashMap.putAll(map);
            this.f7101p = hashMap;
        }
    }

    public String getAppid() {
        return this.f7086a;
    }

    public List<ValueCallback<Pair<Message, Message>>> getCallback(int i10) {
        if (this.f7103r.containsKey(Integer.valueOf(i10)) && this.f7103r.get(Integer.valueOf(i10)) != null) {
            return this.f7103r.get(Integer.valueOf(i10));
        }
        return Collections.emptyList();
    }

    public List<IEfsReporterObserver> getEfsReporterObservers() {
        return this.f7104s;
    }

    public String getLogDid() {
        return this.f7096k;
    }

    public ILogEncryptAction getLogEncryptAction() {
        return this.f7102q;
    }

    public long getLogSendDelayMills() {
        return this.f7099n;
    }

    public long getLogSendIntervalMills() {
        return this.f7100o;
    }

    public String getLogUid() {
        return this.f7095j;
    }

    public Map<String, String> getPublicParamMap() {
        Map<String, String> map = this.f7101p;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    public String getSecret() {
        return this.f7087b;
    }

    public String getUid() {
        return this.f7094i;
    }

    public boolean isDebug() {
        return this.f7091f;
    }

    public boolean isEnablePaBackup() {
        return this.f7089d;
    }

    public boolean isEnableSendLog() {
        return this.f7090e;
    }

    public boolean isEnableWaStat() {
        return this.f7088c;
    }

    public boolean isIntl() {
        return this.f7098m;
    }

    public boolean isOpenCodeLog() {
        return this.f7097l;
    }

    public boolean isPrintLogDetail() {
        return this.f7093h;
    }

    public void registerCallback(int i10, ValueCallback<Pair<Message, Message>> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        List<ValueCallback<Pair<Message, Message>>> list = this.f7103r.get(Integer.valueOf(i10));
        if (list == null) {
            list = new LinkedList<>();
            this.f7103r.putIfAbsent(Integer.valueOf(i10), list);
        }
        list.add(valueCallback);
    }

    public void setAppid(String str) {
        this.f7086a = str;
    }

    public void setDebug(boolean z10) {
        this.f7091f = z10;
    }

    public void setEnablePaBackup(boolean z10) {
        this.f7089d = z10;
    }

    public void setEnableSendLog(boolean z10) {
        this.f7090e = z10;
    }

    public void setEnableWaStat(boolean z10) {
        this.f7088c = z10;
    }

    public void setIsIntl(boolean z10) {
        this.f7098m = z10;
    }

    public void setLogDid(String str) {
        this.f7096k = str;
    }

    public void setLogEncryptAction(ILogEncryptAction iLogEncryptAction) {
        this.f7102q = iLogEncryptAction;
    }

    public void setLogUid(String str) {
        this.f7095j = str;
    }

    public void setOpenCodeLog(boolean z10) {
        this.f7097l = z10;
    }

    public void setPrintLogDetail(boolean z10) {
        this.f7093h = z10;
    }

    public void setSecret(String str) {
        this.f7087b = str;
    }

    public void setUid(String str) {
        this.f7094i = str;
    }
}
