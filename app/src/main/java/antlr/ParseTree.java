package antlr;

import antlr.collections.AST;
import com.youth.banner.BannerConfig;

/* loaded from: classes.dex */
public abstract class ParseTree extends BaseAST {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int getLeftmostDerivation(StringBuffer stringBuffer, int i10);

    public String getLeftmostDerivation(int i10) {
        StringBuffer stringBuffer = new StringBuffer(BannerConfig.TIME);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("    ");
        stringBuffer2.append(toString());
        stringBuffer.append(stringBuffer2.toString());
        stringBuffer.append("\n");
        for (int i11 = 1; i11 < i10; i11++) {
            stringBuffer.append(" =>");
            stringBuffer.append(getLeftmostDerivationStep(i11));
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public String getLeftmostDerivationStep(int i10) {
        if (i10 <= 0) {
            return toString();
        }
        StringBuffer stringBuffer = new StringBuffer(BannerConfig.TIME);
        getLeftmostDerivation(stringBuffer, i10);
        return stringBuffer.toString();
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void initialize(int i10, String str) {
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void initialize(Token token) {
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void initialize(AST ast) {
    }
}
