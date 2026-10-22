package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$drawable;
import androidx.appcompat.widget.C0382c2;
import p106e.AbstractC4105b;
import p276p.AbstractC6128a;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
public final class C0415l {

    /* renamed from: b */
    private static final PorterDuff.Mode f1786b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0415l f1787c;

    /* renamed from: a */
    private C0382c2 f1788a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.l$a */
    /* loaded from: classes.dex */
    public class a implements C0382c2.f {

        /* renamed from: a */
        private final int[] f1789a = {R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1790b = {R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1791c = {R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl, R$drawable.abc_text_select_handle_middle_mtrl, R$drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        private final int[] f1792d = {R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1793e = {R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1794f = {R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material, R$drawable.abc_btn_check_material_anim, R$drawable.abc_btn_radio_material_anim};

        a() {
        }

        /* renamed from: f */
        private boolean m1771f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1772g(Context context) {
            return m1773h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1773h(Context context, int i10) {
            int m1834c = AbstractC0422m2.m1834c(context, R$attr.colorControlHighlight);
            return new ColorStateList(new int[][]{AbstractC0422m2.f1825b, AbstractC0422m2.f1828e, AbstractC0422m2.f1826c, AbstractC0422m2.f1832i}, new int[]{AbstractC0422m2.m1833b(context, R$attr.colorButtonNormal), AbstractC6128a.m24424c(m1834c, i10), AbstractC6128a.m24424c(m1834c, i10), i10});
        }

        /* renamed from: i */
        private ColorStateList m1774i(Context context) {
            return m1773h(context, AbstractC0422m2.m1834c(context, R$attr.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m1775j(Context context) {
            return m1773h(context, AbstractC0422m2.m1834c(context, R$attr.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m1776k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = R$attr.colorSwitchThumbNormal;
            ColorStateList m1836e = AbstractC0422m2.m1836e(context, i10);
            if (m1836e != null && m1836e.isStateful()) {
                int[] iArr3 = AbstractC0422m2.f1825b;
                iArr[0] = iArr3;
                iArr2[0] = m1836e.getColorForState(iArr3, 0);
                iArr[1] = AbstractC0422m2.f1829f;
                iArr2[1] = AbstractC0422m2.m1834c(context, R$attr.colorControlActivated);
                iArr[2] = AbstractC0422m2.f1832i;
                iArr2[2] = m1836e.getDefaultColor();
            } else {
                iArr[0] = AbstractC0422m2.f1825b;
                iArr2[0] = AbstractC0422m2.m1833b(context, i10);
                iArr[1] = AbstractC0422m2.f1829f;
                iArr2[1] = AbstractC0422m2.m1834c(context, R$attr.colorControlActivated);
                iArr[2] = AbstractC0422m2.f1832i;
                iArr2[2] = AbstractC0422m2.m1834c(context, i10);
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m1777l(C0382c2 c0382c2, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable m1649j = c0382c2.m1649j(context, R$drawable.abc_star_black_48dp);
            Drawable m1649j2 = c0382c2.m1649j(context, R$drawable.abc_star_half_black_48dp);
            if ((m1649j instanceof BitmapDrawable) && m1649j.getIntrinsicWidth() == dimensionPixelSize && m1649j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m1649j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m1649j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m1649j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m1649j2 instanceof BitmapDrawable) && m1649j2.getIntrinsicWidth() == dimensionPixelSize && m1649j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m1649j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m1649j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m1649j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m1778m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (AbstractC0421m1.m1828a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0415l.f1786b;
            }
            drawable.setColorFilter(C0415l.m1764e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
        @Override // androidx.appcompat.widget.C0382c2.f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo1661a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0415l.m1762a()
                int[] r1 = r6.f1789a
                boolean r1 = r6.m1771f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = androidx.appcompat.R$attr.colorControlNormal
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.f1791c
                boolean r1 = r6.m1771f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = androidx.appcompat.R$attr.colorControlActivated
                goto L11
            L20:
                int[] r1 = r6.f1792d
                boolean r1 = r6.m1771f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = androidx.appcompat.R$drawable.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = androidx.appcompat.R$drawable.abc_dialog_material_background
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L6d
                boolean r3 = androidx.appcompat.widget.AbstractC0421m1.m1828a(r9)
                if (r3 == 0) goto L5c
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5c:
                int r7 = androidx.appcompat.widget.AbstractC0422m2.m1834c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0415l.m1764e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6c
                r9.setAlpha(r0)
            L6c:
                return r2
            L6d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0415l.a.mo1661a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0382c2.f
        /* renamed from: b */
        public PorterDuff.Mode mo1662b(int i10) {
            if (i10 == R$drawable.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0382c2.f
        /* renamed from: c */
        public Drawable mo1663c(C0382c2 c0382c2, Context context, int i10) {
            if (i10 == R$drawable.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{c0382c2.m1649j(context, R$drawable.abc_cab_background_internal_bg), c0382c2.m1649j(context, R$drawable.abc_cab_background_top_mtrl_alpha)});
            }
            if (i10 == R$drawable.abc_ratingbar_material) {
                return m1777l(c0382c2, context, R$dimen.abc_star_big);
            }
            if (i10 == R$drawable.abc_ratingbar_indicator_material) {
                return m1777l(c0382c2, context, R$dimen.abc_star_medium);
            }
            if (i10 == R$drawable.abc_ratingbar_small_material) {
                return m1777l(c0382c2, context, R$dimen.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0382c2.f
        /* renamed from: d */
        public ColorStateList mo1664d(Context context, int i10) {
            if (i10 == R$drawable.abc_edit_text_material) {
                return AbstractC4105b.m17169c(context, R$color.abc_tint_edittext);
            }
            if (i10 == R$drawable.abc_switch_track_mtrl_alpha) {
                return AbstractC4105b.m17169c(context, R$color.abc_tint_switch_track);
            }
            if (i10 == R$drawable.abc_switch_thumb_material) {
                return m1776k(context);
            }
            if (i10 == R$drawable.abc_btn_default_mtrl_shape) {
                return m1775j(context);
            }
            if (i10 == R$drawable.abc_btn_borderless_material) {
                return m1772g(context);
            }
            if (i10 == R$drawable.abc_btn_colored_material) {
                return m1774i(context);
            }
            if (i10 != R$drawable.abc_spinner_mtrl_am_alpha && i10 != R$drawable.abc_spinner_textfield_background_material) {
                if (m1771f(this.f1790b, i10)) {
                    return AbstractC0422m2.m1836e(context, R$attr.colorControlNormal);
                }
                if (m1771f(this.f1793e, i10)) {
                    return AbstractC4105b.m17169c(context, R$color.abc_tint_default);
                }
                if (m1771f(this.f1794f, i10)) {
                    return AbstractC4105b.m17169c(context, R$color.abc_tint_btn_checkable);
                }
                if (i10 == R$drawable.abc_seekbar_thumb_material) {
                    return AbstractC4105b.m17169c(context, R$color.abc_tint_seek_thumb);
                }
                return null;
            }
            return AbstractC4105b.m17169c(context, R$color.abc_tint_spinner);
        }

        @Override // androidx.appcompat.widget.C0382c2.f
        /* renamed from: e */
        public boolean mo1665e(Context context, int i10, Drawable drawable) {
            if (i10 == R$drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = R$attr.colorControlNormal;
                m1778m(findDrawableByLayerId, AbstractC0422m2.m1834c(context, i11), C0415l.f1786b);
                m1778m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0422m2.m1834c(context, i11), C0415l.f1786b);
                m1778m(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC0422m2.m1834c(context, R$attr.colorControlActivated), C0415l.f1786b);
                return true;
            }
            if (i10 != R$drawable.abc_ratingbar_material && i10 != R$drawable.abc_ratingbar_indicator_material && i10 != R$drawable.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m1778m(layerDrawable2.findDrawableByLayerId(R.id.background), AbstractC0422m2.m1833b(context, R$attr.colorControlNormal), C0415l.f1786b);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = R$attr.colorControlActivated;
            m1778m(findDrawableByLayerId2, AbstractC0422m2.m1834c(context, i12), C0415l.f1786b);
            m1778m(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC0422m2.m1834c(context, i12), C0415l.f1786b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0415l m1763b() {
        C0415l c0415l;
        synchronized (C0415l.class) {
            if (f1787c == null) {
                m1765h();
            }
            c0415l = f1787c;
        }
        return c0415l;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1764e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1642l;
        synchronized (C0415l.class) {
            m1642l = C0382c2.m1642l(i10, mode);
        }
        return m1642l;
    }

    /* renamed from: h */
    public static synchronized void m1765h() {
        synchronized (C0415l.class) {
            if (f1787c == null) {
                C0415l c0415l = new C0415l();
                f1787c = c0415l;
                c0415l.f1788a = C0382c2.m1640h();
                f1787c.f1788a.m1655u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m1766i(Drawable drawable, C0430o2 c0430o2, int[] iArr) {
        C0382c2.m1648w(drawable, c0430o2, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m1767c(Context context, int i10) {
        return this.f1788a.m1649j(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable m1768d(Context context, int i10, boolean z10) {
        return this.f1788a.m1650k(context, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList m1769f(Context context, int i10) {
        return this.f1788a.m1651m(context, i10);
    }

    /* renamed from: g */
    public synchronized void m1770g(Context context) {
        this.f1788a.m1653s(context);
    }
}
