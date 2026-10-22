package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.C1009d;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.a */
/* loaded from: classes.dex */
public class C0985a {

    /* renamed from: a */
    final ConcurrentHashMap<String, List<IPConnStrategy>> f4109a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private void m4732b(String str) {
        new RunnableC0986b(this, str).run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List m4733a(String str) {
        if (!TextUtils.isEmpty(str) && C1009d.m4781c(str) && !DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.LocalDnsStrategy", "try resolve ip with local dns", null, "host", str);
            }
            List<IPConnStrategy> list = Collections.EMPTY_LIST;
            List<IPConnStrategy> list2 = this.f4109a.get(str);
            if (list2 == null || list2.isEmpty()) {
                m4732b(str);
            }
            List<IPConnStrategy> list3 = this.f4109a.get(str);
            if (list3 != null && list3 != list) {
                list = new ArrayList<>(list3);
            }
            ALog.m4788i("awcn.LocalDnsStrategy", "get local strategy", null, "strategyList", list3);
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4736a(String str, ConnProtocol connProtocol) {
        List<IPConnStrategy> list = this.f4109a.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<IPConnStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getProtocol().equals(connProtocol)) {
                return;
            }
        }
        list.add(IPConnStrategy.m4701a(list.get(0).getIp(), !m4737a(connProtocol) ? 80 : Constants.PORT, connProtocol, 0, 0, 1, 45000));
        ALog.m4788i("awcn.LocalDnsStrategy", "setProtocolForHost", null, "strategyList", list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4734a() {
        this.f4109a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4735a(String str, ConnEvent connEvent) {
        if (connEvent.isSuccess || TextUtils.isEmpty(str) || connEvent.isAccs) {
            return;
        }
        this.f4109a.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m4737a(ConnProtocol connProtocol) {
        return connProtocol.protocol.equalsIgnoreCase(HttpConstant.HTTPS) || connProtocol.protocol.equalsIgnoreCase(ConnType.H2S) || !TextUtils.isEmpty(connProtocol.publicKey);
    }
}
