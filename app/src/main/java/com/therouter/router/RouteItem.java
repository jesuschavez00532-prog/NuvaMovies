package com.therouter.router;

import android.os.Bundle;
import androidx.annotation.Keep;
import be.C1328x;
import com.lzy.okgo.cache.CacheEntity;
import com.umeng.ccg.C3417a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import ne.AbstractC5868k;

@Keep
/* loaded from: classes3.dex */
public final class RouteItem implements Serializable {
    private String action;
    private String className;
    private String description;
    private final Bundle extras;
    private final HashMap<String, String> params;
    private String path;

    public RouteItem() {
        this.path = "";
        this.className = "";
        this.action = "";
        this.description = "";
        this.params = new HashMap<>();
        this.extras = new Bundle();
    }

    public final C1328x addAll$router_release(Bundle bundle) {
        if (bundle != null) {
            this.extras.putAll(bundle);
            return C1328x.f4998a;
        }
        return null;
    }

    public final void addParams(String str, String str2) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(str2, "value");
        this.extras.putString(str, str2);
    }

    public final RouteItem copy() {
        RouteItem routeItem = new RouteItem();
        routeItem.extras.putAll(this.extras);
        routeItem.params.putAll(this.params);
        routeItem.description = this.description;
        routeItem.action = this.action;
        routeItem.className = this.className;
        routeItem.path = this.path;
        return routeItem;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Bundle getExtras() {
        for (Map.Entry<String, String> entry : this.params.entrySet()) {
            if (!this.extras.keySet().contains(entry.getKey())) {
                this.extras.putString(entry.getKey(), entry.getValue());
            }
        }
        return this.extras;
    }

    public final HashMap<String, String> getParams() {
        return this.params;
    }

    public final String getPath() {
        return this.path;
    }

    public final void setAction(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.action = str;
    }

    public final void setClassName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.className = str;
    }

    public final void setDescription(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.description = str;
    }

    public final void setPath(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.path = str;
    }

    public String toString() {
        return "RouteItem(path='" + this.path + "', className='" + this.className + "', action='" + this.action + "', description='" + this.description + "', extras=" + this.extras + ')';
    }

    public RouteItem(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "path");
        AbstractC5868k.m23674f(str2, "className");
        AbstractC5868k.m23674f(str3, C3417a.f15001w);
        AbstractC5868k.m23674f(str4, "description");
        this.path = "";
        this.className = "";
        this.action = "";
        this.description = "";
        this.params = new HashMap<>();
        this.extras = new Bundle();
        this.path = str;
        this.className = str2;
        this.action = str3;
        this.description = str4;
    }
}
