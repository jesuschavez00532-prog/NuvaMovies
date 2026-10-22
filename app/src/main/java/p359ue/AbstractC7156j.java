package p359ue;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import re.AbstractC6578f;
import re.C6575c;

/* renamed from: ue.j */
/* loaded from: classes3.dex */
public abstract class AbstractC7156j {
    /* renamed from: a */
    public static final /* synthetic */ InterfaceC7153g m27682a(Matcher matcher, int i10, CharSequence charSequence) {
        return m27685d(matcher, i10, charSequence);
    }

    /* renamed from: d */
    public static final InterfaceC7153g m27685d(Matcher matcher, int i10, CharSequence charSequence) {
        if (!matcher.find(i10)) {
            return null;
        }
        return new C7154h(matcher, charSequence);
    }

    /* renamed from: e */
    public static final C6575c m27686e(MatchResult matchResult) {
        C6575c m25679g;
        m25679g = AbstractC6578f.m25679g(matchResult.start(), matchResult.end());
        return m25679g;
    }

    /* renamed from: f */
    public static final C6575c m27687f(MatchResult matchResult, int i10) {
        C6575c m25679g;
        m25679g = AbstractC6578f.m25679g(matchResult.start(i10), matchResult.end(i10));
        return m25679g;
    }
}
