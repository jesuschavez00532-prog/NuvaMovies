package p000a;

import android.content.Context;
import com.mine.p068ui.activity.UserCenterActivity__TheRouter__Autowired;
import com.mine.p068ui.fragment.CouponFragment__TheRouter__Autowired;
import com.module.basemvp.BaseMVPActivity__TheRouter__Autowired;
import com.vod.p089ui.activity.TopicActivity__TheRouter__Autowired;
import com.vod.p089ui.activity.VodCategoryActivity__TheRouter__Autowired;
import com.vod.p089ui.activity.VodDetailsActivity__TheRouter__Autowired;
import mc.C5634i;
import nc.Digraph;

/* loaded from: classes.dex */
public final class TheRouterServiceProvideInjecter {
    public static final void addFlowTask(Context context, Digraph digraph) {
        try {
            ServiceProvider__TheRouter__1114748646.addFlowTask(context, digraph);
        } catch (Throwable unused) {
        }
        try {
            ServiceProvider__TheRouter__1167911866.addFlowTask(context, digraph);
        } catch (Throwable unused2) {
        }
        try {
            ServiceProvider__TheRouter__1432029340.addFlowTask(context, digraph);
        } catch (Throwable unused3) {
        }
        try {
            ServiceProvider__TheRouter__1482330061.addFlowTask(context, digraph);
        } catch (Throwable unused4) {
        }
        try {
            ServiceProvider__TheRouter__162947252.addFlowTask(context, digraph);
        } catch (Throwable unused5) {
        }
        try {
            ServiceProvider__TheRouter__1841958591.addFlowTask(context, digraph);
        } catch (Throwable unused6) {
        }
        try {
            ServiceProvider__TheRouter__1980888422.addFlowTask(context, digraph);
        } catch (Throwable unused7) {
        }
        try {
            ServiceProvider__TheRouter__2068599248.addFlowTask(context, digraph);
        } catch (Throwable unused8) {
        }
        try {
            ServiceProvider__TheRouter__243470720.addFlowTask(context, digraph);
        } catch (Throwable unused9) {
        }
        try {
            ServiceProvider__TheRouter__977822830.addFlowTask(context, digraph);
        } catch (Throwable unused10) {
        }
    }

    public static final void autowiredInject(Object obj) {
        try {
            UserCenterActivity__TheRouter__Autowired.autowiredInject(obj);
        } catch (Throwable unused) {
        }
        try {
            CouponFragment__TheRouter__Autowired.autowiredInject(obj);
        } catch (Throwable unused2) {
        }
        try {
            BaseMVPActivity__TheRouter__Autowired.autowiredInject(obj);
        } catch (Throwable unused3) {
        }
        try {
            TopicActivity__TheRouter__Autowired.autowiredInject(obj);
        } catch (Throwable unused4) {
        }
        try {
            VodCategoryActivity__TheRouter__Autowired.autowiredInject(obj);
        } catch (Throwable unused5) {
        }
        try {
            VodDetailsActivity__TheRouter__Autowired.autowiredInject(obj);
        } catch (Throwable unused6) {
        }
    }

    public static final void initDefaultRouteMap() {
        try {
            RouterMap__TheRouter__1269903875.addRoute();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            RouterMap__TheRouter__1285614815.addRoute();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            RouterMap__TheRouter__140605361.addRoute();
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            RouterMap__TheRouter__1449922097.addRoute();
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            RouterMap__TheRouter__2129147315.addRoute();
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            RouterMap__TheRouter__419360077.addRoute();
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            RouterMap__TheRouter__531996569.addRoute();
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        try {
            RouterMap__TheRouter__582089875.addRoute();
        } catch (Throwable th8) {
            th8.printStackTrace();
        }
        try {
            RouterMap__TheRouter__79068163.addRoute();
        } catch (Throwable th9) {
            th9.printStackTrace();
        }
        try {
            RouterMap__TheRouter__989412327.addRoute();
        } catch (Throwable th10) {
            th10.printStackTrace();
        }
    }

    public static final void trojan() {
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__1114748646());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__1167911866());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__1432029340());
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__1482330061());
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__162947252());
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__1841958591());
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__1980888422());
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__2068599248());
        } catch (Throwable th8) {
            th8.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__243470720());
        } catch (Throwable th9) {
            th9.printStackTrace();
        }
        try {
            C5634i.m22847i().privateAddInterceptor(new ServiceProvider__TheRouter__977822830());
        } catch (Throwable th10) {
            th10.printStackTrace();
        }
    }
}
