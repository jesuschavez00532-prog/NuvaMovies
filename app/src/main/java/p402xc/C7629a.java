package p402xc;

import ae.AbstractC0234a;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import java.util.List;
import ne.AbstractC5868k;
import p418yc.C7705h;

/* renamed from: xc.a */
/* loaded from: classes3.dex */
public final class C7629a extends AbstractC0234a {

    /* renamed from: l */
    private final String f28078l;

    /* renamed from: m */
    private Gson f28079m;

    /* renamed from: n */
    private Gson f28080n;

    public C7629a(int i10) {
        super(i10);
        String simpleName = C7629a.class.getSimpleName();
        AbstractC5868k.m23670b(simpleName, "javaClass.simpleName");
        this.f28078l = simpleName;
        this.f28079m = new Gson();
        this.f28080n = new GsonBuilder().setPrettyPrinting().create();
    }

    /* renamed from: u */
    private final AbstractC0234a.m m29402u(AbstractC0234a.k kVar) {
        AbstractC0234a.l lVar;
        AbstractC0234a.l lVar2 = AbstractC0234a.l.GET;
        String str = null;
        if (kVar != null) {
            lVar = kVar.mo859b();
        } else {
            lVar = null;
        }
        if (lVar2 == lVar && AbstractC5868k.m23669a("/playinfo", kVar.mo860c())) {
            List list = (List) kVar.mo858a().get("instance");
            if (list != null) {
                str = (String) list.get(0);
            }
            int parseInt = Integer.parseInt(String.valueOf(str));
            return m29403v(200, new JsonParser().parse(C7705h.f28256m.m29771a().m29758n(parseInt)), "Request successfully:" + parseInt);
        }
        return m29403v(404, "", "Request not support!");
    }

    /* renamed from: v */
    private final AbstractC0234a.m m29403v(int i10, Object obj, String str) {
        AbstractC0234a.m m835n = AbstractC0234a.m835n(this.f28080n.toJson(new C7630b(i10, obj, str)));
        AbstractC5868k.m23670b(m835n, "newFixedLengthResponse(m…ttyGson.toJson(response))");
        return m835n;
    }

    @Override // ae.AbstractC0234a
    /* renamed from: p */
    public AbstractC0234a.m mo841p(AbstractC0234a.k kVar) {
        return m29402u(kVar);
    }
}
