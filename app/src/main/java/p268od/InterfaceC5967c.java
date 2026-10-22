package p268od;

import ca.InterfaceC1439a;
import com.request.result.ContentList;

/* renamed from: od.c */
/* loaded from: classes3.dex */
public interface InterfaceC5967c extends InterfaceC1439a {

    /* renamed from: od.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m24140a(InterfaceC5967c interfaceC5967c, ContentList contentList, String str, String str2, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    z10 = false;
                }
                interfaceC5967c.mo24138M2(contentList, str, str2, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processRecommendClick");
        }

        /* renamed from: b */
        public static /* synthetic */ void m24141b(InterfaceC5967c interfaceC5967c, String str, boolean z10, String str2, String str3, String str4, String str5, boolean z11, int i10, Object obj) {
            String str6;
            boolean z12;
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                if ((i10 & 64) != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                interfaceC5967c.mo24139a1(str, z10, str2, str6, str4, str5, z12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCategoryActivity");
        }
    }

    /* renamed from: M2 */
    void mo24138M2(ContentList contentList, String str, String str2, boolean z10);

    /* renamed from: a1 */
    void mo24139a1(String str, boolean z10, String str2, String str3, String str4, String str5, boolean z11);
}
