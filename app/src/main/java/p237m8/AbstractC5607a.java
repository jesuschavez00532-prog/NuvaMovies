package p237m8;

import com.request.result.Channel;
import com.request.result.ChildColumn;
import ne.AbstractC5868k;
import p201k2.AbstractC5091h;

/* renamed from: m8.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5607a {
    /* renamed from: a */
    public static final String m22776a(Channel channel) {
        AbstractC5868k.m23674f(channel, "<this>");
        String m20660c = AbstractC5091h.m20660c(channel.getName(), channel.getAlias());
        AbstractC5868k.m23673e(m20660c, "getTitleByLang(name, alias)");
        return m20660c;
    }

    /* renamed from: b */
    public static final String m22777b(ChildColumn childColumn) {
        AbstractC5868k.m23674f(childColumn, "<this>");
        String m20660c = AbstractC5091h.m20660c(childColumn.getName(), childColumn.getAlias());
        AbstractC5868k.m23673e(m20660c, "getTitleByLang(name, alias)");
        return m20660c;
    }
}
