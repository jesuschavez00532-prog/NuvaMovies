package p420z;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: z.c */
/* loaded from: classes.dex */
public abstract class AbstractC7726c extends AbstractC7724a {

    /* renamed from: i */
    private int f28418i;

    /* renamed from: j */
    private int f28419j;

    /* renamed from: k */
    private LayoutInflater f28420k;

    public AbstractC7726c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f28419j = i10;
        this.f28418i = i10;
        this.f28420k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p420z.AbstractC7724a
    /* renamed from: g */
    public View mo29840g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28420k.inflate(this.f28419j, viewGroup, false);
    }

    @Override // p420z.AbstractC7724a
    /* renamed from: h */
    public View mo1822h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28420k.inflate(this.f28418i, viewGroup, false);
    }
}
