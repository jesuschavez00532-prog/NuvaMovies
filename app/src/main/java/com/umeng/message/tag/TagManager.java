package com.umeng.message.tag;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushTagCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.proguard.C3581b;
import com.umeng.message.proguard.C3587be;
import com.umeng.message.proguard.C3591bi;
import com.umeng.message.proguard.C3637d;
import com.umeng.message.proguard.C3665e;
import com.umeng.message.proguard.C3678f;
import com.umeng.message.proguard.C3680g;
import com.umeng.message.proguard.C3706y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TagManager {

    /* renamed from: b */
    private static volatile TagManager f16671b;

    /* renamed from: a */
    private final C3587be f16672a = new C3587be();

    @Deprecated
    /* loaded from: classes3.dex */
    public interface TCallBack extends UPushTagCallback<ITagManager.Result> {
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface TagListCallBack extends UPushTagCallback<List<String>> {
    }

    private TagManager() {
    }

    /* renamed from: b */
    static /* synthetic */ boolean m15858b() {
        boolean z10;
        if (MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15399b("tag_send_policy", -1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            UPLog.m15198i("TagManager", "tag server disable!");
        }
        return z10;
    }

    /* renamed from: c */
    static /* synthetic */ ITagManager.Result m15859c() {
        return m15861e();
    }

    /* renamed from: d */
    static /* synthetic */ JSONObject m15860d() {
        Application m15840a = C3706y.m15840a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", C3665e.m15718a());
        jSONObject.put("utdid", C3637d.m15623o(m15840a));
        jSONObject.put("device_token", MessageSharedPrefs.getInstance(m15840a).m15179l());
        jSONObject.put("ts", System.currentTimeMillis());
        return jSONObject;
    }

    /* renamed from: e */
    private static ITagManager.Result m15861e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC3215b.JSON_SUCCESS, ITagManager.SUCCESS);
            jSONObject.put("remain", MessageSharedPrefs.getInstance(C3706y.m15840a()).m15171d());
        } catch (Exception e10) {
            UPLog.m15196e("TagManager", e10);
        }
        return new ITagManager.Result(jSONObject);
    }

    public static TagManager getInstance() {
        if (f16671b == null) {
            synchronized (TagManager.class) {
                if (f16671b == null) {
                    f16671b = new TagManager();
                }
            }
        }
        return f16671b;
    }

    public void addTags(final UPushTagCallback<ITagManager.Result> uPushTagCallback, final String... strArr) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.tag.TagManager.1
            @Override // java.lang.Runnable
            public final void run() {
                ITagManager.Result result;
                boolean z10;
                ITagManager.Result result2 = new ITagManager.Result();
                try {
                    String[] strArr2 = strArr;
                    if (strArr2 != null && strArr2.length != 0) {
                        if (TagManager.m15857a()) {
                            UPLog.m15197e("TagManager", "No utdid or device_token");
                            result2.setErrors("No utdid or device_token");
                            try {
                                uPushTagCallback.onMessage(false, result2);
                                return;
                            } catch (Throwable th) {
                                UPLog.m15196e("TagManager", th);
                                return;
                            }
                        }
                        if (TagManager.m15858b()) {
                            UPLog.m15197e("TagManager", "Tag api is disabled by the server");
                            result2.setErrors("Tag api is disabled by the server");
                            try {
                                uPushTagCallback.onMessage(false, result2);
                                return;
                            } catch (Throwable th2) {
                                UPLog.m15196e("TagManager", th2);
                                return;
                            }
                        }
                        Application m15840a = C3706y.m15840a();
                        ArrayList arrayList = new ArrayList();
                        Set<String> m15402b = MessageSharedPrefs.getInstance(m15840a).f15770b.m15402b("tags", new HashSet());
                        for (String str : strArr) {
                            if (!m15402b.contains(str) && !arrayList.contains(str)) {
                                byte[] bytes = str.getBytes();
                                if (bytes != null && bytes.length <= 128 && bytes.length > 0) {
                                    arrayList.add(str);
                                } else {
                                    UPLog.m15197e("TagManager", "tag length must be 1~128 byte");
                                    result2.setErrors("tag length must be 1~128 byte");
                                    try {
                                        uPushTagCallback.onMessage(false, result2);
                                        return;
                                    } catch (Throwable th3) {
                                        UPLog.m15196e("TagManager", th3);
                                        return;
                                    }
                                }
                            }
                        }
                        if (arrayList.size() > MessageSharedPrefs.getInstance(m15840a).m15171d()) {
                            UPLog.m15197e("TagManager", "tag count limit");
                            result2.setErrors("tag count limit");
                            try {
                                uPushTagCallback.onMessage(false, result2);
                                return;
                            } catch (Throwable th4) {
                                UPLog.m15196e("TagManager", th4);
                                return;
                            }
                        }
                        if (!MessageSharedPrefs.getInstance(m15840a).m15164a("tag_add_")) {
                            UPLog.m15197e("TagManager", "interval limit");
                            result2.setErrors("interval limit");
                            try {
                                uPushTagCallback.onMessage(false, result2);
                                return;
                            } catch (Throwable th5) {
                                UPLog.m15196e("TagManager", th5);
                                return;
                            }
                        }
                        if (arrayList.size() == 0) {
                            try {
                                uPushTagCallback.onMessage(true, TagManager.m15859c());
                                return;
                            } catch (Throwable th6) {
                                UPLog.m15196e("TagManager", th6);
                                return;
                            }
                        }
                        try {
                            JSONObject m15860d = TagManager.m15860d();
                            m15860d.put("tags", C3591bi.m15418a(arrayList));
                            C3587be unused = TagManager.this.f16672a;
                            String[] strArr3 = strArr;
                            Application m15840a2 = C3706y.m15840a();
                            result = new ITagManager.Result(C3680g.m15762a(m15860d, "https://msg.umengcloud.com/v3/tag/add", UMUtils.getAppkey(m15840a2)));
                            if (TextUtils.equals(result.status, ITagManager.SUCCESS)) {
                                MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a2);
                                messageSharedPrefs.m15161a(strArr3);
                                messageSharedPrefs.m15157a(result.remain);
                                messageSharedPrefs.m15159a("tag_add_", result.interval);
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                        try {
                            try {
                                z10 = result.status.equals(ITagManager.SUCCESS);
                            } catch (Exception e11) {
                                e = e11;
                                result2 = result;
                                UPLog.m15196e("TagManager", e);
                                result = result2;
                                z10 = false;
                                uPushTagCallback.onMessage(z10, result);
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                result2 = result;
                                try {
                                    UPLog.m15196e("TagManager", th);
                                    try {
                                        uPushTagCallback.onMessage(false, result2);
                                        return;
                                    } catch (Throwable th8) {
                                        UPLog.m15196e("TagManager", th8);
                                        return;
                                    }
                                } finally {
                                }
                            }
                            uPushTagCallback.onMessage(z10, result);
                            return;
                        } catch (Throwable th9) {
                            UPLog.m15196e("TagManager", th9);
                            return;
                        }
                    }
                    UPLog.m15197e("TagManager", "No tags");
                    result2.setErrors("No tags");
                    try {
                        uPushTagCallback.onMessage(false, result2);
                    } catch (Throwable th10) {
                        UPLog.m15196e("TagManager", th10);
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            }
        });
    }

    public void deleteTags(final UPushTagCallback<ITagManager.Result> uPushTagCallback, final String... strArr) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.tag.TagManager.2
            @Override // java.lang.Runnable
            public final void run() {
                ITagManager.Result result;
                String m15418a;
                ITagManager.Result result2 = new ITagManager.Result();
                boolean z10 = false;
                try {
                    Application m15840a = C3706y.m15840a();
                    String[] strArr2 = strArr;
                    if (strArr2 != null && strArr2.length > 0) {
                        for (String str : strArr2) {
                            byte[] bytes = str.getBytes();
                            if (bytes != null && bytes.length <= 128 && bytes.length > 0) {
                            }
                            result2.setErrors("tag length must be 1~128 byte.");
                            try {
                                return;
                            } catch (Throwable th) {
                                return;
                            }
                        }
                    }
                    if (!MessageSharedPrefs.getInstance(m15840a).m15164a("tag_del_")) {
                        UPLog.m15197e("TagManager", "interval limit");
                        result2.setErrors("interval limit");
                        try {
                            uPushTagCallback.onMessage(false, result2);
                            return;
                        } catch (Throwable th2) {
                            UPLog.m15196e("TagManager", th2);
                            return;
                        }
                    }
                    if (TagManager.m15858b()) {
                        result2.setErrors("tag server disable.");
                        try {
                            uPushTagCallback.onMessage(false, result2);
                            return;
                        } catch (Throwable th3) {
                            UPLog.m15196e("TagManager", th3);
                            return;
                        }
                    }
                    if (TagManager.m15857a()) {
                        result2.setErrors("check request failed.");
                        try {
                            uPushTagCallback.onMessage(false, result2);
                            return;
                        } catch (Throwable th4) {
                            UPLog.m15196e("TagManager", th4);
                            return;
                        }
                    }
                    String[] strArr3 = strArr;
                    if (strArr3 != null && strArr3.length != 0) {
                        try {
                            JSONObject m15860d = TagManager.m15860d();
                            String[] strArr4 = strArr;
                            if (strArr4 == null) {
                                m15418a = "";
                            } else {
                                m15418a = C3591bi.m15418a(Arrays.asList(strArr4));
                            }
                            m15860d.put("tags", m15418a);
                            C3587be unused = TagManager.this.f16672a;
                            String[] strArr5 = strArr;
                            Application m15840a2 = C3706y.m15840a();
                            result = new ITagManager.Result(C3680g.m15762a(m15860d, "https://msg.umengcloud.com/v3/tag/delete", UMUtils.getAppkey(m15840a2)));
                            if (TextUtils.equals(result.status, ITagManager.SUCCESS)) {
                                MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a2);
                                if (strArr5 != null && strArr5.length != 0) {
                                    Set<String> m15402b = messageSharedPrefs.f15770b.m15402b("tags", new HashSet());
                                    for (String str2 : strArr5) {
                                        m15402b.remove(str2);
                                    }
                                    messageSharedPrefs.f15770b.m15397a("tags", m15402b);
                                }
                                messageSharedPrefs.m15157a(result.remain);
                                messageSharedPrefs.m15159a("tag_del_", result.interval);
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                        try {
                            try {
                                z10 = result.status.equals(ITagManager.SUCCESS);
                            } catch (Exception e11) {
                                e = e11;
                                result2 = result;
                                UPLog.m15196e("TagManager", e);
                                result = result2;
                                uPushTagCallback.onMessage(z10, result);
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                result2 = result;
                                try {
                                    UPLog.m15196e("TagManager", th);
                                    try {
                                        uPushTagCallback.onMessage(false, result2);
                                        return;
                                    } catch (Throwable th6) {
                                        UPLog.m15196e("TagManager", th6);
                                        return;
                                    }
                                } finally {
                                    try {
                                        uPushTagCallback.onMessage(false, result2);
                                    } catch (Throwable th7) {
                                        UPLog.m15196e("TagManager", th7);
                                    }
                                }
                            }
                            uPushTagCallback.onMessage(z10, result);
                            return;
                        } catch (Throwable th8) {
                            UPLog.m15196e("TagManager", th8);
                            return;
                        }
                    }
                    UPLog.m15197e("TagManager", "No tags.");
                    result2.setErrors("No tags.");
                    try {
                        uPushTagCallback.onMessage(true, result2);
                    } catch (Throwable th9) {
                        UPLog.m15196e("TagManager", th9);
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            }
        });
    }

    public void getTags(final UPushTagCallback<List<String>> uPushTagCallback) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.tag.TagManager.3
            @Override // java.lang.Runnable
            public final void run() {
                Pair pair;
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                try {
                    if (!MessageSharedPrefs.getInstance(C3706y.m15840a()).m15164a("tag_add_")) {
                        UPLog.m15197e("TagManager", "interval limit");
                        try {
                            return;
                        } catch (Throwable th) {
                            return;
                        }
                    }
                    if (TagManager.m15858b()) {
                        try {
                            uPushTagCallback.onMessage(false, arrayList);
                            return;
                        } catch (Throwable th2) {
                            UPLog.m15196e("TagManager", th2);
                            return;
                        }
                    }
                    boolean m15857a = TagManager.m15857a();
                    try {
                        if (!m15857a) {
                            try {
                                C3587be unused = TagManager.this.f16672a;
                                JSONObject m15860d = TagManager.m15860d();
                                Application m15840a = C3706y.m15840a();
                                JSONObject m15762a = C3680g.m15762a(m15860d, "https://msg.umengcloud.com/v3/tag/get", UMUtils.getAppkey(m15840a));
                                if (m15762a == null) {
                                    pair = new Pair(Boolean.FALSE, null);
                                } else {
                                    ITagManager.Result result = new ITagManager.Result(m15762a);
                                    boolean equals = TextUtils.equals(result.status, ITagManager.SUCCESS);
                                    if (equals) {
                                        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a);
                                        messageSharedPrefs.m15157a(result.remain);
                                        messageSharedPrefs.m15159a("tag_get_", result.interval);
                                        String optString = m15762a.optString("tags");
                                        if (optString.length() > 0) {
                                            String[] split = optString.split(",");
                                            List asList = Arrays.asList(split);
                                            messageSharedPrefs.f15770b.m15393a("tags");
                                            messageSharedPrefs.m15161a(split);
                                            pair = new Pair(Boolean.TRUE, asList);
                                        }
                                    }
                                    pair = new Pair(Boolean.valueOf(equals), null);
                                }
                                m15857a = ((Boolean) pair.first).booleanValue();
                            } catch (Exception e10) {
                                e = e10;
                                m15857a = false;
                            }
                            try {
                                List list = (List) pair.second;
                                if (list != null && !list.isEmpty()) {
                                    arrayList.addAll(list);
                                }
                            } catch (Exception e11) {
                                e = e11;
                                UPLog.m15197e("TagManager", "getTags error:", e);
                                uPushTagCallback.onMessage(m15857a, arrayList);
                                return;
                            }
                            try {
                                uPushTagCallback.onMessage(m15857a, arrayList);
                                return;
                            } catch (Throwable th3) {
                                UPLog.m15196e("TagManager", th3);
                                return;
                            }
                        }
                        try {
                            uPushTagCallback.onMessage(false, arrayList);
                        } catch (Throwable th4) {
                            UPLog.m15196e("TagManager", th4);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z10 = m15857a;
                        try {
                            UPLog.m15196e("TagManager", th);
                            try {
                                uPushTagCallback.onMessage(z10, arrayList);
                            } catch (Throwable th6) {
                                UPLog.m15196e("TagManager", th6);
                            }
                        } finally {
                            try {
                                uPushTagCallback.onMessage(z10, arrayList);
                            } catch (Throwable th7) {
                                UPLog.m15196e("TagManager", th7);
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ boolean m15857a() {
        if (TextUtils.isEmpty(C3637d.m15623o(C3706y.m15840a()))) {
            UPLog.m15197e("TagManager", "utdid empty.");
            return true;
        }
        if (C3678f.m15752b()) {
            UPLog.m15198i("TagManager", "check tag failed, silent mode!");
            return true;
        }
        if (!TextUtils.isEmpty(PushAgent.getInstance(C3706y.m15840a()).getRegistrationId())) {
            return false;
        }
        UPLog.m15197e("TagManager", "deviceToken empty.");
        return true;
    }
}
