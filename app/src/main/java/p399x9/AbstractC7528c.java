package p399x9;

import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: x9.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7528c extends AbstractC7527b {
    public /* synthetic */ AbstractC7528c(int i10, List list, int i11, AbstractC5864g abstractC5864g) {
        this(i10, (i11 & 2) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7528c(int i10, List list) {
        super(i10, list);
        AbstractC5868k.m23674f(list, "datas");
        m28857o(false);
    }
}
