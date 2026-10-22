package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.umeng.analytics.pro.C3325bt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
/* loaded from: classes.dex */
public final class C2469v3 {

    /* renamed from: a */
    private final String f9144a;

    /* renamed from: b */
    private final Bundle f9145b;

    /* renamed from: c */
    private Bundle f9146c;

    /* renamed from: d */
    final /* synthetic */ C2238a4 f9147d;

    public C2469v3(C2238a4 c2238a4, String str, Bundle bundle) {
        this.f9147d = c2238a4;
        AbstractC5391n.m21779e("default_event_parameters");
        this.f9144a = "default_event_parameters";
        this.f9145b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m10089a() {
        char c10;
        if (this.f9146c == null) {
            String string = this.f9147d.m9431o().getString(this.f9144a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals(C3325bt.f14190aH)) {
                                        c10 = 0;
                                    }
                                    c10 = 65535;
                                } else {
                                    if (string3.equals("l")) {
                                        c10 = 2;
                                    }
                                    c10 = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            }
                            if (c10 != 0) {
                                if (c10 != 1) {
                                    if (c10 != 2) {
                                        this.f9147d.f8714a.mo9577b().m9800r().m9700b("Unrecognized persisted bundle type. Type", string3);
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString("v"));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f9147d.f8714a.mo9577b().m9800r().m9699a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f9146c = bundle;
                } catch (JSONException unused2) {
                    this.f9147d.f8714a.mo9577b().m9800r().m9699a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f9146c == null) {
                this.f9146c = this.f9145b;
            }
        }
        return this.f9146c;
    }

    /* renamed from: b */
    public final void m10090b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f9147d.m9431o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f9144a);
        } else {
            String str = this.f9144a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", C3325bt.f14190aH);
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f9147d.f8714a.mo9577b().m9800r().m9700b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f9147d.f8714a.mo9577b().m9800r().m9700b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f9146c = bundle;
    }
}
