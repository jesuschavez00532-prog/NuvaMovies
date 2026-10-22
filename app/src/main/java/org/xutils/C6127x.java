package org.xutils;

import android.app.Application;
import android.content.Context;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.xutils.DbManager;
import org.xutils.common.TaskController;
import org.xutils.common.task.TaskControllerImpl;
import org.xutils.http.HttpManagerImpl;
import org.xutils.image.ImageManagerImpl;
import org.xutils.p274db.DbManagerImpl;
import org.xutils.view.ViewInjectorImpl;

/* renamed from: org.xutils.x */
/* loaded from: classes3.dex */
public final class C6127x {

    /* renamed from: org.xutils.x$Ext */
    /* loaded from: classes.dex */
    public static class Ext {
        private static Application app;
        private static boolean debug;
        private static HttpManager httpManager;
        private static ImageManager imageManager;
        private static TaskController taskController;
        private static ViewInjector viewInjector;

        private Ext() {
        }

        public static void init(Application application) {
            TaskControllerImpl.registerInstance();
            if (app == null) {
                app = application;
            }
        }

        public static void setDebug(boolean z10) {
            debug = z10;
        }

        public static void setDefaultHostnameVerifier(HostnameVerifier hostnameVerifier) {
            HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
        }

        public static void setHttpManager(HttpManager httpManager2) {
            httpManager = httpManager2;
        }

        public static void setImageManager(ImageManager imageManager2) {
            imageManager = imageManager2;
        }

        public static void setTaskController(TaskController taskController2) {
            if (taskController == null) {
                taskController = taskController2;
            }
        }

        public static void setViewInjector(ViewInjector viewInjector2) {
            viewInjector = viewInjector2;
        }
    }

    /* renamed from: org.xutils.x$a */
    /* loaded from: classes3.dex */
    private static class a extends Application {
        public a(Context context) {
            attachBaseContext(context);
        }
    }

    private C6127x() {
    }

    public static Application app() {
        if (Ext.app == null) {
            Application unused = Ext.app = new a((Context) Class.forName("com.android.layoutlib.bridge.impl.RenderAction").getDeclaredMethod("getCurrentContext", new Class[0]).invoke(null, new Object[0]));
        }
        return Ext.app;
    }

    public static DbManager getDb(DbManager.DaoConfig daoConfig) {
        return DbManagerImpl.getInstance(daoConfig);
    }

    public static HttpManager http() {
        if (Ext.httpManager == null) {
            HttpManagerImpl.registerInstance();
        }
        return Ext.httpManager;
    }

    public static ImageManager image() {
        if (Ext.imageManager == null) {
            ImageManagerImpl.registerInstance();
        }
        return Ext.imageManager;
    }

    public static boolean isDebug() {
        return Ext.debug;
    }

    public static TaskController task() {
        return Ext.taskController;
    }

    public static ViewInjector view() {
        if (Ext.viewInjector == null) {
            ViewInjectorImpl.registerInstance();
        }
        return Ext.viewInjector;
    }
}
