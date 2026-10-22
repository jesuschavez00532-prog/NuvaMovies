package com.umeng.pagesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Choreographer;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.pagesdk.c */
/* loaded from: classes3.dex */
public final class C3715c {

    /* renamed from: a */
    float f16707a;

    /* renamed from: b */
    long f16708b;

    /* renamed from: c */
    int f16709c;

    /* renamed from: d */
    int f16710d;

    /* renamed from: e */
    int f16711e;

    /* renamed from: g */
    boolean f16713g;

    /* renamed from: h */
    long f16714h;

    /* renamed from: i */
    long f16715i;

    /* renamed from: j */
    String f16716j;

    /* renamed from: k */
    private Context f16717k;

    /* renamed from: f */
    Map<String, Double> f16712f = new HashMap();

    /* renamed from: l */
    private Choreographer.FrameCallback f16718l = new Choreographer.FrameCallback() { // from class: com.umeng.pagesdk.c.1
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            String str = PageManger.TAG;
            C3715c c3715c = C3715c.this;
            if (c3715c.f16713g) {
                if (c3715c.f16714h == 0) {
                    c3715c.f16714h = System.currentTimeMillis();
                }
                long currentTimeMillis = System.currentTimeMillis();
                C3715c c3715c2 = C3715c.this;
                if (currentTimeMillis - c3715c2.f16714h > c3715c2.f16715i) {
                    c3715c2.m15874b();
                    return;
                }
                if (c3715c2.f16708b == 0) {
                    c3715c2.f16708b = j10;
                }
                float f10 = ((float) (j10 - c3715c2.f16708b)) / 1000000.0f;
                if (f10 > c3715c2.f16707a) {
                    double d10 = c3715c2.f16709c * 1000;
                    double d11 = f10;
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    double d12 = d10 / d11;
                    c3715c2.f16709c = 0;
                    c3715c2.f16708b = 0L;
                    if (PageManger.isDebug) {
                        Log.i("PageManger-PageFPSImpl", "doFrame: " + d12 + ", map size is " + C3715c.this.f16712f.size() + ", page is " + C3715c.this.f16716j);
                    }
                    Map<String, Double> map = C3715c.this.f16712f;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(System.currentTimeMillis());
                    map.put(sb2.toString(), Double.valueOf(d12));
                    C3715c c3715c3 = C3715c.this;
                    int i10 = c3715c3.f16710d + 1;
                    c3715c3.f16710d = i10;
                    if (i10 >= c3715c3.f16711e) {
                        c3715c3.m15872c();
                        C3715c c3715c4 = C3715c.this;
                        c3715c4.f16710d = 0;
                        Map<String, Double> map2 = c3715c4.f16712f;
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                } else {
                    c3715c2.f16709c++;
                }
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    };

    public C3715c(Context context) {
        SharedPreferences sharedPreferences;
        this.f16707a = 1000.0f;
        this.f16711e = 6;
        this.f16715i = 300000L;
        this.f16717k = context;
        if (context == null || (sharedPreferences = context.getSharedPreferences("efs_page", 0)) == null) {
            return;
        }
        this.f16707a = sharedPreferences.getFloat(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL, 1000.0f);
        this.f16711e = sharedPreferences.getInt(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, 6);
        this.f16715i = sharedPreferences.getLong(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC, 300000L);
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "init fps. diff is " + this.f16707a + ", count diff is " + this.f16711e + ", dlealt time is " + this.f16715i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m15872c() {
        C3713a m15867a;
        Iterator<Map.Entry<String, Double>> it = this.f16712f.entrySet().iterator();
        if (it != null) {
            JSONArray jSONArray = null;
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<String, Double> next = it.next();
                if (next != null) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (PageManger.getRefreshRate() > 0.0f) {
                            double doubleValue = next.getValue().doubleValue();
                            double refreshRate = PageManger.getRefreshRate();
                            Double.isNaN(refreshRate);
                            if (doubleValue < refreshRate * 1.1d) {
                                jSONObject.put(next.getKey(), next.getValue());
                                if (next.getValue().doubleValue() < 40.0d) {
                                    z10 = true;
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("pN", this.f16716j);
                    jSONObject2.put("pF", jSONArray);
                    if (z10 && (m15867a = C3714b.m15864a(this.f16717k).m15867a()) != null) {
                        jSONObject2.put("te", m15867a.f16697c);
                        jSONObject2.put("le", m15867a.f16695a);
                    }
                    EfsJSONLog efsJSONLog = new EfsJSONLog("fpsperf");
                    efsJSONLog.put("fps", jSONObject2);
                    EfsReporter reporter = PageManger.getReporter();
                    if (reporter != null) {
                        reporter.send(efsJSONLog);
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m15873a() {
        if (this.f16713g) {
            if (PageManger.isDebug) {
                Log.i("PageManger-PageFPSImpl", "state is start!");
                return;
            }
            return;
        }
        this.f16713g = true;
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "start, page is " + this.f16716j);
        }
        Choreographer.getInstance().removeFrameCallback(this.f16718l);
        Choreographer.getInstance().postFrameCallback(this.f16718l);
    }

    /* renamed from: b */
    public final void m15874b() {
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "stop, page is " + this.f16716j);
        }
        m15872c();
        this.f16713g = false;
        this.f16714h = 0L;
        this.f16708b = 0L;
        this.f16709c = 0;
        Map<String, Double> map = this.f16712f;
        if (map != null) {
            map.clear();
        }
        this.f16710d = 0;
    }
}
