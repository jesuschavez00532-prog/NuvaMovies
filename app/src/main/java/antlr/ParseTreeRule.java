package antlr;

import antlr.collections.AST;

/* loaded from: classes.dex */
public class ParseTreeRule extends ParseTree {
    public static final int INVALID_ALT = -1;
    protected int altNumber;
    protected String ruleName;

    public ParseTreeRule(String str) {
        this(str, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.ParseTree
    public int getLeftmostDerivation(StringBuffer stringBuffer, int i10) {
        if (i10 <= 0) {
            stringBuffer.append(' ');
            stringBuffer.append(toString());
            return 0;
        }
        int i11 = 1;
        for (AST firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (i11 < i10 && !(firstChild instanceof ParseTreeToken)) {
                i11 += ((ParseTree) firstChild).getLeftmostDerivation(stringBuffer, i10 - i11);
            } else {
                stringBuffer.append(' ');
                stringBuffer.append(firstChild.toString());
            }
        }
        return i11;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public String toString() {
        if (this.altNumber == -1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('<');
            stringBuffer.append(this.ruleName);
            stringBuffer.append('>');
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append('<');
        stringBuffer2.append(this.ruleName);
        stringBuffer2.append("[");
        stringBuffer2.append(this.altNumber);
        stringBuffer2.append("]>");
        return stringBuffer2.toString();
    }

    public ParseTreeRule(String str, int i10) {
        this.ruleName = str;
        this.altNumber = i10;
    }
}
