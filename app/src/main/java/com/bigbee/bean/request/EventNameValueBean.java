package com.bigbee.bean.request;

import com.lzy.okgo.cookie.SerializableCookie;
import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class EventNameValueBean implements Serializable {
    private String name;
    private Object value;

    public EventNameValueBean(String str, Object obj) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(obj, "value");
        this.name = str;
        this.value = obj;
    }

    public static /* synthetic */ EventNameValueBean copy$default(EventNameValueBean eventNameValueBean, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = eventNameValueBean.name;
        }
        if ((i10 & 2) != 0) {
            obj = eventNameValueBean.value;
        }
        return eventNameValueBean.copy(str, obj);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final EventNameValueBean copy(String str, Object obj) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(obj, "value");
        return new EventNameValueBean(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventNameValueBean)) {
            return false;
        }
        EventNameValueBean eventNameValueBean = (EventNameValueBean) obj;
        return AbstractC5868k.m23669a(this.name, eventNameValueBean.name) && AbstractC5868k.m23669a(this.value, eventNameValueBean.value);
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setValue(Object obj) {
        AbstractC5868k.m23674f(obj, "<set-?>");
        this.value = obj;
    }

    public String toString() {
        return "EventNameValueBean(name=" + this.name + ", value=" + this.value + ')';
    }
}
