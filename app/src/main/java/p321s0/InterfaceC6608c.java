package p321s0;

import com.advertlib.bean.AdInfo;
import java.util.List;

/* renamed from: s0.c */
/* loaded from: classes.dex */
public interface InterfaceC6608c {

    /* renamed from: s0.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ List m25822a(InterfaceC6608c interfaceC6608c, String str, List list, String str2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str2 = null;
                }
                return interfaceC6608c.mo25819a(str, list, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRandomAdListInfo");
        }
    }

    /* renamed from: a */
    List mo25819a(String str, List list, String str2);

    /* renamed from: b */
    AdInfo mo25820b(String str, List list, String str2);

    /* renamed from: c */
    void mo25821c(AdInfo adInfo);
}
