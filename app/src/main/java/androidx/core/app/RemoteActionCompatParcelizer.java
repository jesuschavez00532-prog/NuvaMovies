package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0855a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0855a abstractC0855a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2181a = (IconCompat) abstractC0855a.m4431v(remoteActionCompat.f2181a, 1);
        remoteActionCompat.f2182b = abstractC0855a.m4421l(remoteActionCompat.f2182b, 2);
        remoteActionCompat.f2183c = abstractC0855a.m4421l(remoteActionCompat.f2183c, 3);
        remoteActionCompat.f2184d = (PendingIntent) abstractC0855a.m4427r(remoteActionCompat.f2184d, 4);
        remoteActionCompat.f2185e = abstractC0855a.m4417h(remoteActionCompat.f2185e, 5);
        remoteActionCompat.f2186f = abstractC0855a.m4417h(remoteActionCompat.f2186f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0855a abstractC0855a) {
        abstractC0855a.m4433x(false, false);
        abstractC0855a.m4412M(remoteActionCompat.f2181a, 1);
        abstractC0855a.m4403D(remoteActionCompat.f2182b, 2);
        abstractC0855a.m4403D(remoteActionCompat.f2183c, 3);
        abstractC0855a.m4407H(remoteActionCompat.f2184d, 4);
        abstractC0855a.m4435z(remoteActionCompat.f2185e, 5);
        abstractC0855a.m4435z(remoteActionCompat.f2186f, 6);
    }
}
