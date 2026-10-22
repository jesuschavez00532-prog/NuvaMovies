package p360v;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import p373w.AbstractC7338c;

/* renamed from: v.o */
/* loaded from: classes.dex */
public abstract class AbstractC7184o implements Spannable {

    /* renamed from: v.o$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f26875a;

        /* renamed from: b */
        private final TextDirectionHeuristic f26876b;

        /* renamed from: c */
        private final int f26877c;

        /* renamed from: d */
        private final int f26878d;

        /* renamed from: e */
        final PrecomputedText.Params f26879e;

        /* renamed from: v.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C7863a {

            /* renamed from: a */
            private final TextPaint f26880a;

            /* renamed from: b */
            private TextDirectionHeuristic f26881b;

            /* renamed from: c */
            private int f26882c;

            /* renamed from: d */
            private int f26883d;

            public C7863a(TextPaint textPaint) {
                this.f26880a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f26882c = 1;
                    this.f26883d = 1;
                } else {
                    this.f26883d = 0;
                    this.f26882c = 0;
                }
                this.f26881b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: a */
            public a m27808a() {
                return new a(this.f26880a, this.f26881b, this.f26882c, this.f26883d);
            }

            /* renamed from: b */
            public C7863a m27809b(int i10) {
                this.f26882c = i10;
                return this;
            }

            /* renamed from: c */
            public C7863a m27810c(int i10) {
                this.f26883d = i10;
                return this;
            }

            /* renamed from: d */
            public C7863a m27811d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f26881b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f26879e = build;
            } else {
                this.f26879e = null;
            }
            this.f26875a = textPaint;
            this.f26876b = textDirectionHeuristic;
            this.f26877c = i10;
            this.f26878d = i11;
        }

        /* renamed from: a */
        public boolean m27803a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            float letterSpacing;
            float letterSpacing2;
            String fontFeatureSettings;
            String fontFeatureSettings2;
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f26877c != aVar.m27804b() || this.f26878d != aVar.m27805c())) || this.f26875a.getTextSize() != aVar.m27807e().getTextSize() || this.f26875a.getTextScaleX() != aVar.m27807e().getTextScaleX() || this.f26875a.getTextSkewX() != aVar.m27807e().getTextSkewX()) {
                return false;
            }
            if (i10 >= 21) {
                letterSpacing = this.f26875a.getLetterSpacing();
                letterSpacing2 = aVar.m27807e().getLetterSpacing();
                if (letterSpacing == letterSpacing2) {
                    fontFeatureSettings = this.f26875a.getFontFeatureSettings();
                    fontFeatureSettings2 = aVar.m27807e().getFontFeatureSettings();
                    if (!TextUtils.equals(fontFeatureSettings, fontFeatureSettings2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (this.f26875a.getFlags() != aVar.m27807e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                textLocales = this.f26875a.getTextLocales();
                textLocales2 = aVar.m27807e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f26875a.getTextLocale().equals(aVar.m27807e().getTextLocale())) {
                return false;
            }
            if (this.f26875a.getTypeface() == null) {
                if (aVar.m27807e().getTypeface() != null) {
                    return false;
                }
                return true;
            }
            if (!this.f26875a.getTypeface().equals(aVar.m27807e().getTypeface())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public int m27804b() {
            return this.f26877c;
        }

        /* renamed from: c */
        public int m27805c() {
            return this.f26878d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m27806d() {
            return this.f26876b;
        }

        /* renamed from: e */
        public TextPaint m27807e() {
            return this.f26875a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (m27803a(aVar) && this.f26876b == aVar.m27806d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            float letterSpacing;
            boolean isElegantTextHeight;
            float letterSpacing2;
            LocaleList textLocales;
            boolean isElegantTextHeight2;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                letterSpacing2 = this.f26875a.getLetterSpacing();
                textLocales = this.f26875a.getTextLocales();
                isElegantTextHeight2 = this.f26875a.isElegantTextHeight();
                return AbstractC7338c.m28318b(Float.valueOf(this.f26875a.getTextSize()), Float.valueOf(this.f26875a.getTextScaleX()), Float.valueOf(this.f26875a.getTextSkewX()), Float.valueOf(letterSpacing2), Integer.valueOf(this.f26875a.getFlags()), textLocales, this.f26875a.getTypeface(), Boolean.valueOf(isElegantTextHeight2), this.f26876b, Integer.valueOf(this.f26877c), Integer.valueOf(this.f26878d));
            }
            if (i10 >= 21) {
                letterSpacing = this.f26875a.getLetterSpacing();
                isElegantTextHeight = this.f26875a.isElegantTextHeight();
                return AbstractC7338c.m28318b(Float.valueOf(this.f26875a.getTextSize()), Float.valueOf(this.f26875a.getTextScaleX()), Float.valueOf(this.f26875a.getTextSkewX()), Float.valueOf(letterSpacing), Integer.valueOf(this.f26875a.getFlags()), this.f26875a.getTextLocale(), this.f26875a.getTypeface(), Boolean.valueOf(isElegantTextHeight), this.f26876b, Integer.valueOf(this.f26877c), Integer.valueOf(this.f26878d));
            }
            return AbstractC7338c.m28318b(Float.valueOf(this.f26875a.getTextSize()), Float.valueOf(this.f26875a.getTextScaleX()), Float.valueOf(this.f26875a.getTextSkewX()), Integer.valueOf(this.f26875a.getFlags()), this.f26875a.getTextLocale(), this.f26875a.getTypeface(), this.f26876b, Integer.valueOf(this.f26877c), Integer.valueOf(this.f26878d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            float letterSpacing;
            boolean isElegantTextHeight;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f26875a.getTextSize());
            sb2.append(", textScaleX=" + this.f26875a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f26875a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", letterSpacing=");
                letterSpacing = this.f26875a.getLetterSpacing();
                sb3.append(letterSpacing);
                sb2.append(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(", elegantTextHeight=");
                isElegantTextHeight = this.f26875a.isElegantTextHeight();
                sb4.append(isElegantTextHeight);
                sb2.append(sb4.toString());
            }
            if (i10 >= 24) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(", textLocale=");
                textLocales = this.f26875a.getTextLocales();
                sb5.append(textLocales);
                sb2.append(sb5.toString());
            } else {
                sb2.append(", textLocale=" + this.f26875a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f26875a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(", variationSettings=");
                fontVariationSettings = this.f26875a.getFontVariationSettings();
                sb6.append(fontVariationSettings);
                sb2.append(sb6.toString());
            }
            sb2.append(", textDir=" + this.f26876b);
            sb2.append(", breakStrategy=" + this.f26877c);
            sb2.append(", hyphenationFrequency=" + this.f26878d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f26875a = textPaint;
            textDirection = params.getTextDirection();
            this.f26876b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f26877c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f26878d = hyphenationFrequency;
            this.f26879e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
