package com.umeng.logsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ULogConfigManager {

    /* renamed from: b */
    private Context f15722b;

    /* renamed from: c */
    private EfsReporter f15723c;

    /* renamed from: a */
    private final String f15721a = "ULogConfigManager";

    /* renamed from: d */
    private Vector<C3528b> f15724d = new Vector<>();

    public ULogConfigManager(Context context, EfsReporter efsReporter) {
        this.f15722b = context.getApplicationContext();
        this.f15723c = efsReporter;
        if (efsReporter != null) {
            Log.m7730i("ULogConfigManager", "[log register] begin.");
            this.f15723c.getAllSdkConfig(new String[]{C3527a.f15748d, C3527a.f15747c, C3527a.f15751g}, new IConfigCallback() { // from class: com.umeng.logsdk.ULogConfigManager.1
                @Override // com.efs.sdk.base.observer.IConfigCallback
                public final void onChange(Map<String, Object> map) {
                    SharedPreferences.Editor edit;
                    String str;
                    String str2;
                    StringBuilder sb2;
                    if (map != null) {
                        try {
                            Log.m7730i("ULogConfigManager", "[log register] call back config.");
                            SharedPreferences sharedPreferences = ULogConfigManager.this.f15722b.getSharedPreferences("efs_ulog", 0);
                            if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
                                return;
                            }
                            Object obj = map.get(C3527a.f15748d);
                            String str3 = "";
                            if (obj != null) {
                                str = obj.toString();
                                edit.putString(C3527a.f15748d, str);
                                Log.m7730i("ULogConfigManager", "[log register] save did is ".concat(String.valueOf(str)));
                            } else {
                                str = "";
                            }
                            Object obj2 = map.get(C3527a.f15747c);
                            if (obj2 != null) {
                                String obj3 = obj2.toString();
                                Log.m7730i("ULogConfigManager", "[log register] save uid before base64 is ".concat(String.valueOf(obj3)));
                                str2 = C3529c.m15154a(obj3.getBytes());
                                edit.putString(C3527a.f15747c, str2);
                                Log.m7730i("ULogConfigManager", "[log register] save uid after base64 is ".concat(String.valueOf(str2)));
                            } else {
                                str2 = "";
                            }
                            Object obj4 = map.get(C3527a.f15751g);
                            if (obj4 != null && str2.equals(ULogManager.getUserID()) && str.equals(ULogManager.getDeviceID())) {
                                String obj5 = obj4.toString();
                                if (!TextUtils.isEmpty(obj5)) {
                                    JSONArray jSONArray = new JSONArray(obj5);
                                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                        if (jSONObject != null) {
                                            String optString = jSONObject.optString(C3527a.f15752h, C3527a.f15760p);
                                            if (!TextUtils.isEmpty(optString)) {
                                                if (TextUtils.isEmpty(str3)) {
                                                    sb2 = new StringBuilder();
                                                    sb2.append(str3);
                                                    sb2.append(optString);
                                                } else {
                                                    sb2 = new StringBuilder();
                                                    sb2.append(str3);
                                                    sb2.append("_");
                                                    sb2.append(optString);
                                                }
                                                str3 = sb2.toString();
                                                edit.putString(optString, jSONObject.toString());
                                                Log.m7730i("ULogConfigManager", "[log register] save task id is " + optString + ", task is " + jSONObject.toString());
                                                C3528b c3528b = new C3528b();
                                                int optInt = jSONObject.optInt(C3527a.f15753i, -1);
                                                int optInt2 = jSONObject.optInt(C3527a.f15754j, -1);
                                                if (optInt == 0) {
                                                    String str4 = optInt2 == 0 ? str2 : optInt2 == 1 ? str : null;
                                                    if (!TextUtils.isEmpty(str4)) {
                                                        c3528b.f15762a = optString;
                                                        c3528b.f15763b = optInt;
                                                        c3528b.f15764c = optInt2;
                                                        c3528b.f15765d = str4;
                                                        c3528b.f15766e = jSONObject.optLong(C3527a.f15756l, 0L);
                                                        c3528b.f15767f = jSONObject.optLong(C3527a.f15757m, 0L);
                                                        Log.m7730i("ULogConfigManager", "[log register] add mem task id is ".concat(String.valueOf(optString)));
                                                        ULogConfigManager.this.f15724d.add(c3528b);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                edit.putString(C3527a.f15749e, str3);
                                Log.m7730i("ULogConfigManager", "[log register] save task id set is ".concat(String.valueOf(str3)));
                            }
                            edit.commit();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public List<C3528b> getTaskList() {
        return this.f15724d;
    }

    public void reMoveTaskFroSP(String str) {
        String[] split;
        try {
            Log.m7730i("ULogConfigManager", "[log remove] remove sp. delete task id is ".concat(String.valueOf(str)));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            SharedPreferences sharedPreferences = this.f15722b.getSharedPreferences("efs_ulog", 0);
            if (sharedPreferences == null || sharedPreferences.edit() == null) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String string = sharedPreferences.getString(C3527a.f15748d, "");
            String string2 = sharedPreferences.getString(C3527a.f15747c, "");
            String string3 = sharedPreferences.getString(C3527a.f15749e, "");
            if (!string2.equals(ULogManager.getUserID()) || !string.equals(ULogManager.getDeviceID()) || TextUtils.isEmpty(string3) || (split = string3.split("_")) == null) {
                return;
            }
            for (int i10 = 0; i10 < split.length; i10++) {
                String str2 = split[i10];
                if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                    Log.m7730i("ULogConfigManager", "[log remove] taskId is ".concat(str2));
                    if (string3.equals(str2)) {
                        string3 = "";
                    } else {
                        string3 = string3.replaceFirst(i10 == split.length - 1 ? "_".concat(str2) : str2 + "_", "");
                    }
                    Log.m7730i("ULogConfigManager", "[log remove] put id set is ".concat(String.valueOf(string3)));
                    edit.putString(C3527a.f15749e, string3);
                    edit.remove(str2);
                    edit.commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void removeTask(C3528b c3528b) {
        Vector<C3528b> vector = this.f15724d;
        if (vector == null || !vector.contains(c3528b)) {
            return;
        }
        Log.m7730i("ULogConfigManager", "[log remove] remove mem. task id is " + c3528b.f15762a);
        this.f15724d.remove(c3528b);
    }
}
