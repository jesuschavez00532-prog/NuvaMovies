package antlr;

import antlr.collections.AST;
import antlr.collections.impl.BitSet;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* loaded from: classes.dex */
public class MismatchedTokenException extends RecognitionException {
    public static final int NOT_RANGE = 4;
    public static final int NOT_SET = 6;
    public static final int NOT_TOKEN = 2;
    public static final int RANGE = 3;
    public static final int SET = 5;
    public static final int TOKEN = 1;
    public int expecting;
    public int mismatchType;
    public AST node;
    public BitSet set;
    public Token token;
    String[] tokenNames;
    String tokenText;
    public int upper;

    public MismatchedTokenException() {
        super("Mismatched Token: expecting any AST node", "<AST>", -1, -1);
        this.tokenText = null;
    }

    private String tokenName(int i10) {
        if (i10 == 0) {
            return "<Set of tokens>";
        }
        if (i10 >= 0) {
            String[] strArr = this.tokenNames;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Operator.Operation.LESS_THAN);
        stringBuffer.append(String.valueOf(i10));
        stringBuffer.append(Operator.Operation.GREATER_THAN);
        return stringBuffer.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.mismatchType) {
            case 1:
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("expecting ");
                stringBuffer2.append(tokenName(this.expecting));
                stringBuffer2.append(", found '");
                stringBuffer2.append(this.tokenText);
                stringBuffer2.append("'");
                stringBuffer.append(stringBuffer2.toString());
                break;
            case 2:
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("expecting anything but ");
                stringBuffer3.append(tokenName(this.expecting));
                stringBuffer3.append("; got it anyway");
                stringBuffer.append(stringBuffer3.toString());
                break;
            case 3:
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("expecting token in range: ");
                stringBuffer4.append(tokenName(this.expecting));
                stringBuffer4.append("..");
                stringBuffer4.append(tokenName(this.upper));
                stringBuffer4.append(", found '");
                stringBuffer4.append(this.tokenText);
                stringBuffer4.append("'");
                stringBuffer.append(stringBuffer4.toString());
                break;
            case 4:
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("expecting token NOT in range: ");
                stringBuffer5.append(tokenName(this.expecting));
                stringBuffer5.append("..");
                stringBuffer5.append(tokenName(this.upper));
                stringBuffer5.append(", found '");
                stringBuffer5.append(this.tokenText);
                stringBuffer5.append("'");
                stringBuffer.append(stringBuffer5.toString());
                break;
            case 5:
            case 6:
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("expecting ");
                if (this.mismatchType == 6) {
                    str = "NOT ";
                } else {
                    str = "";
                }
                stringBuffer6.append(str);
                stringBuffer6.append("one of (");
                stringBuffer.append(stringBuffer6.toString());
                for (int i10 : this.set.toArray()) {
                    stringBuffer.append(" ");
                    stringBuffer.append(tokenName(i10));
                }
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("), found '");
                stringBuffer7.append(this.tokenText);
                stringBuffer7.append("'");
                stringBuffer.append(stringBuffer7.toString());
                break;
            default:
                stringBuffer.append(super.getMessage());
                break;
        }
        return stringBuffer.toString();
    }

    public MismatchedTokenException(String[] strArr, AST ast, int i10, int i11, boolean z10) {
        super("Mismatched Token", "<AST>", ast == null ? -1 : ast.getLine(), ast != null ? ast.getColumn() : -1);
        this.tokenText = null;
        this.tokenNames = strArr;
        this.node = ast;
        if (ast == null) {
            this.tokenText = "<empty tree>";
        } else {
            this.tokenText = ast.toString();
        }
        this.mismatchType = z10 ? 4 : 3;
        this.expecting = i10;
        this.upper = i11;
    }

    public MismatchedTokenException(String[] strArr, AST ast, int i10, boolean z10) {
        super("Mismatched Token", "<AST>", ast == null ? -1 : ast.getLine(), ast != null ? ast.getColumn() : -1);
        this.tokenText = null;
        this.tokenNames = strArr;
        this.node = ast;
        if (ast == null) {
            this.tokenText = "<empty tree>";
        } else {
            this.tokenText = ast.toString();
        }
        this.mismatchType = z10 ? 2 : 1;
        this.expecting = i10;
    }

    public MismatchedTokenException(String[] strArr, AST ast, BitSet bitSet, boolean z10) {
        super("Mismatched Token", "<AST>", ast == null ? -1 : ast.getLine(), ast != null ? ast.getColumn() : -1);
        this.tokenText = null;
        this.tokenNames = strArr;
        this.node = ast;
        if (ast == null) {
            this.tokenText = "<empty tree>";
        } else {
            this.tokenText = ast.toString();
        }
        this.mismatchType = z10 ? 6 : 5;
        this.set = bitSet;
    }

    public MismatchedTokenException(String[] strArr, Token token, int i10, int i11, boolean z10, String str) {
        super("Mismatched Token", str, token.getLine(), token.getColumn());
        this.tokenText = null;
        this.tokenNames = strArr;
        this.token = token;
        this.tokenText = token.getText();
        this.mismatchType = z10 ? 4 : 3;
        this.expecting = i10;
        this.upper = i11;
    }

    public MismatchedTokenException(String[] strArr, Token token, int i10, boolean z10, String str) {
        super("Mismatched Token", str, token.getLine(), token.getColumn());
        this.tokenText = null;
        this.tokenNames = strArr;
        this.token = token;
        this.tokenText = token.getText();
        this.mismatchType = z10 ? 2 : 1;
        this.expecting = i10;
    }

    public MismatchedTokenException(String[] strArr, Token token, BitSet bitSet, boolean z10, String str) {
        super("Mismatched Token", str, token.getLine(), token.getColumn());
        this.tokenText = null;
        this.tokenNames = strArr;
        this.token = token;
        this.tokenText = token.getText();
        this.mismatchType = z10 ? 6 : 5;
        this.set = bitSet;
    }
}
