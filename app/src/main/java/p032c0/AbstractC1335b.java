package p032c0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: c0.b */
/* loaded from: classes.dex */
abstract class AbstractC1335b {

    /* renamed from: c0.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6024a(Object obj, Rect rect);
    }

    /* renamed from: c0.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        Object mo6026a(Object obj, int i10);

        /* renamed from: b */
        int mo6027b(Object obj);
    }

    /* renamed from: c0.b$c */
    /* loaded from: classes.dex */
    private static class c implements Comparator {

        /* renamed from: a */
        private final Rect f5024a = new Rect();

        /* renamed from: b */
        private final Rect f5025b = new Rect();

        /* renamed from: c */
        private final boolean f5026c;

        /* renamed from: d */
        private final a f5027d;

        c(boolean z10, a aVar) {
            this.f5026c = z10;
            this.f5027d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f5024a;
            Rect rect2 = this.f5025b;
            this.f5027d.mo6024a(obj, rect);
            this.f5027d.mo6024a(obj2, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                if (!this.f5026c) {
                    return -1;
                }
                return 1;
            }
            if (i12 > i13) {
                if (this.f5026c) {
                    return -1;
                }
                return 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                if (!this.f5026c) {
                    return -1;
                }
                return 1;
            }
            if (i16 > i17) {
                if (this.f5026c) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m6033a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean m6034b = m6034b(i10, rect, rect2);
        if (m6034b(i10, rect, rect3) || !m6034b) {
            return false;
        }
        if (m6042j(i10, rect, rect3) && i10 != 17 && i10 != 66 && m6043k(i10, rect, rect2) >= m6045m(i10, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m6034b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Object m6035c(Object obj, b bVar, a aVar, Object obj2, Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int mo6027b = bVar.mo6027b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i11 = 0; i11 < mo6027b; i11++) {
            Object mo6026a = bVar.mo6026a(obj, i11);
            if (mo6026a != obj2) {
                aVar.mo6024a(mo6026a, rect3);
                if (m6040h(i10, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = mo6026a;
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    public static Object m6036d(Object obj, b bVar, a aVar, Object obj2, int i10, boolean z10, boolean z11) {
        int mo6027b = bVar.mo6027b(obj);
        ArrayList arrayList = new ArrayList(mo6027b);
        for (int i11 = 0; i11 < mo6027b; i11++) {
            arrayList.add(bVar.mo6026a(obj, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 != 1) {
            if (i10 == 2) {
                return m6037e(obj2, arrayList, z11);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return m6038f(obj2, arrayList, z11);
    }

    /* renamed from: e */
    private static Object m6037e(Object obj, ArrayList arrayList, boolean z10) {
        int lastIndexOf;
        int size = arrayList.size();
        if (obj == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(obj);
        }
        int i10 = lastIndexOf + 1;
        if (i10 < size) {
            return arrayList.get(i10);
        }
        if (z10 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    /* renamed from: f */
    private static Object m6038f(Object obj, ArrayList arrayList, boolean z10) {
        int indexOf;
        int size = arrayList.size();
        if (obj == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(obj);
        }
        int i10 = indexOf - 1;
        if (i10 >= 0) {
            return arrayList.get(i10);
        }
        if (z10 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    /* renamed from: g */
    private static int m6039g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    /* renamed from: h */
    private static boolean m6040h(int i10, Rect rect, Rect rect2, Rect rect3) {
        if (!m6041i(rect, rect2, i10)) {
            return false;
        }
        if (!m6041i(rect, rect3, i10) || m6033a(i10, rect, rect2, rect3)) {
            return true;
        }
        if (m6033a(i10, rect, rect3, rect2) || m6039g(m6043k(i10, rect, rect2), m6047o(i10, rect, rect2)) >= m6039g(m6043k(i10, rect, rect3), m6047o(i10, rect, rect3))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m6041i(Rect rect, Rect rect2, int i10) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        int i11 = rect.top;
                        int i12 = rect2.top;
                        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i13 = rect.left;
                int i14 = rect2.left;
                if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 > i16 || rect.top >= i16) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i17 = rect.right;
        int i18 = rect2.right;
        if ((i17 > i18 || rect.left >= i18) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m6042j(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        if (rect.bottom <= rect2.top) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                if (rect.right <= rect2.left) {
                    return true;
                }
                return false;
            }
            if (rect.top >= rect2.bottom) {
                return true;
            }
            return false;
        }
        if (rect.left >= rect2.right) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static int m6043k(int i10, Rect rect, Rect rect2) {
        return Math.max(0, m6044l(i10, rect, rect2));
    }

    /* renamed from: l */
    private static int m6044l(int i10, Rect rect, Rect rect2) {
        int i11 = 0;
        int i12 = 0;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        i11 = rect2.top;
                        i12 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i11 = rect2.left;
                    i12 = rect.right;
                }
            } else {
                i11 = rect.top;
                i12 = rect2.bottom;
            }
        } else {
            i11 = rect.left;
            i12 = rect2.right;
        }
        return i11 - i12;
    }

    /* renamed from: m */
    private static int m6045m(int i10, Rect rect, Rect rect2) {
        return Math.max(1, m6046n(i10, rect, rect2));
    }

    /* renamed from: n */
    private static int m6046n(int i10, Rect rect, Rect rect2) {
        int i11 = 0;
        int i12 = 0;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        i11 = rect2.bottom;
                        i12 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i11 = rect2.right;
                    i12 = rect.right;
                }
            } else {
                i11 = rect.top;
                i12 = rect2.top;
            }
        } else {
            i11 = rect.left;
            i12 = rect2.left;
        }
        return i11 - i12;
    }

    /* renamed from: o */
    private static int m6047o(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
