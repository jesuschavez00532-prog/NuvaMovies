package antlr.collections.impl;

/* loaded from: classes.dex */
public class IntRange {
    int begin;
    int end;

    public IntRange(int i10, int i11) {
        this.begin = i10;
        this.end = i11;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.begin);
        stringBuffer.append("..");
        stringBuffer.append(this.end);
        return stringBuffer.toString();
    }
}
