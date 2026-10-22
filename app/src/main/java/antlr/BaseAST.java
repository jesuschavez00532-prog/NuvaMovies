package antlr;

import anet.channel.strategy.dispatch.DispatchConstants;
import antlr.collections.AST;
import antlr.collections.ASTEnumeration;
import antlr.collections.impl.ASTEnumerator;
import antlr.collections.impl.Vector;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.Serializable;
import java.io.Writer;

/* loaded from: classes.dex */
public abstract class BaseAST implements AST, Serializable {
    private static String[] tokenNames;
    private static boolean verboseStringConversion;
    protected BaseAST down;
    protected BaseAST right;

    public static String decode(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt == '&') {
                char charAt2 = str.charAt(i10 + 1);
                char charAt3 = str.charAt(i10 + 2);
                char charAt4 = str.charAt(i10 + 3);
                int i11 = i10 + 4;
                char charAt5 = str.charAt(i11);
                int i12 = i10 + 5;
                char charAt6 = str.charAt(i12);
                if (charAt2 == 'a' && charAt3 == 'm' && charAt4 == 'p' && charAt5 == ';') {
                    stringBuffer.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                    i10 = i12;
                } else {
                    if (charAt2 == 'l' && charAt3 == 't' && charAt4 == ';') {
                        stringBuffer.append(Operator.Operation.LESS_THAN);
                    } else if (charAt2 == 'g' && charAt3 == 't' && charAt4 == ';') {
                        stringBuffer.append(Operator.Operation.GREATER_THAN);
                    } else {
                        if (charAt2 == 'q' && charAt3 == 'u' && charAt4 == 'o' && charAt5 == 't' && charAt6 == ';') {
                            stringBuffer.append("\"");
                        } else if (charAt2 == 'a' && charAt3 == 'p' && charAt4 == 'o' && charAt5 == 's' && charAt6 == ';') {
                            stringBuffer.append("'");
                        } else {
                            stringBuffer.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                        }
                        i10 += 6;
                    }
                    i10 = i11;
                }
            } else {
                stringBuffer.append(charAt);
            }
            i10++;
        }
        return new String(stringBuffer);
    }

    private void doWorkForFindAll(Vector vector, AST ast, boolean z10) {
        for (AST ast2 = this; ast2 != null; ast2 = ast2.getNextSibling()) {
            if ((z10 && ast2.equalsTreePartial(ast)) || (!z10 && ast2.equalsTree(ast))) {
                vector.appendElement(ast2);
            }
            if (ast2.getFirstChild() != null) {
                ((BaseAST) ast2.getFirstChild()).doWorkForFindAll(vector, ast, z10);
            }
        }
    }

    public static String encode(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\"') {
                if (charAt != '<') {
                    if (charAt != '>') {
                        if (charAt != '&') {
                            if (charAt != '\'') {
                                stringBuffer.append(charAt);
                            } else {
                                stringBuffer.append("&apos;");
                            }
                        } else {
                            stringBuffer.append("&amp;");
                        }
                    } else {
                        stringBuffer.append("&gt;");
                    }
                } else {
                    stringBuffer.append("&lt;");
                }
            } else {
                stringBuffer.append("&quot;");
            }
        }
        return new String(stringBuffer);
    }

    public static String[] getTokenNames() {
        return tokenNames;
    }

    public static void setVerboseStringConversion(boolean z10, String[] strArr) {
        verboseStringConversion = z10;
        tokenNames = strArr;
    }

    @Override // antlr.collections.AST
    public void addChild(AST ast) {
        if (ast == null) {
            return;
        }
        BaseAST baseAST = this.down;
        if (baseAST == null) {
            this.down = (BaseAST) ast;
            return;
        }
        while (true) {
            BaseAST baseAST2 = baseAST.right;
            if (baseAST2 != null) {
                baseAST = baseAST2;
            } else {
                baseAST.right = (BaseAST) ast;
                return;
            }
        }
    }

    @Override // antlr.collections.AST
    public boolean equals(AST ast) {
        if (ast == null || !getText().equals(ast.getText()) || getType() != ast.getType()) {
            return false;
        }
        return true;
    }

    @Override // antlr.collections.AST
    public boolean equalsList(AST ast) {
        if (ast == null) {
            return false;
        }
        AST ast2 = this;
        while (ast2 != null && ast != null) {
            if (!ast2.equals(ast)) {
                return false;
            }
            if (ast2.getFirstChild() != null) {
                if (!ast2.getFirstChild().equalsList(ast.getFirstChild())) {
                    return false;
                }
            } else if (ast.getFirstChild() != null) {
                return false;
            }
            ast2 = ast2.getNextSibling();
            ast = ast.getNextSibling();
        }
        if (ast2 != null || ast != null) {
            return false;
        }
        return true;
    }

    @Override // antlr.collections.AST
    public boolean equalsListPartial(AST ast) {
        if (ast == null) {
            return true;
        }
        AST ast2 = this;
        while (ast2 != null && ast != null) {
            if (!ast2.equals(ast)) {
                return false;
            }
            if (ast2.getFirstChild() != null && !ast2.getFirstChild().equalsListPartial(ast.getFirstChild())) {
                return false;
            }
            ast2 = ast2.getNextSibling();
            ast = ast.getNextSibling();
        }
        if (ast2 != null || ast == null) {
            return true;
        }
        return false;
    }

    @Override // antlr.collections.AST
    public boolean equalsTree(AST ast) {
        if (!equals(ast)) {
            return false;
        }
        if (getFirstChild() != null) {
            if (!getFirstChild().equalsList(ast.getFirstChild())) {
                return false;
            }
            return true;
        }
        if (ast.getFirstChild() != null) {
            return false;
        }
        return true;
    }

    @Override // antlr.collections.AST
    public boolean equalsTreePartial(AST ast) {
        if (ast == null) {
            return true;
        }
        if (!equals(ast)) {
            return false;
        }
        if (getFirstChild() == null || getFirstChild().equalsListPartial(ast.getFirstChild())) {
            return true;
        }
        return false;
    }

    @Override // antlr.collections.AST
    public ASTEnumeration findAll(AST ast) {
        Vector vector = new Vector(10);
        if (ast == null) {
            return null;
        }
        doWorkForFindAll(vector, ast, false);
        return new ASTEnumerator(vector);
    }

    @Override // antlr.collections.AST
    public ASTEnumeration findAllPartial(AST ast) {
        Vector vector = new Vector(10);
        if (ast == null) {
            return null;
        }
        doWorkForFindAll(vector, ast, true);
        return new ASTEnumerator(vector);
    }

    @Override // antlr.collections.AST
    public int getColumn() {
        return 0;
    }

    @Override // antlr.collections.AST
    public AST getFirstChild() {
        return this.down;
    }

    @Override // antlr.collections.AST
    public int getLine() {
        return 0;
    }

    @Override // antlr.collections.AST
    public AST getNextSibling() {
        return this.right;
    }

    @Override // antlr.collections.AST
    public int getNumberOfChildren() {
        BaseAST baseAST = this.down;
        if (baseAST != null) {
            int i10 = 1;
            while (true) {
                baseAST = baseAST.right;
                if (baseAST != null) {
                    i10++;
                } else {
                    return i10;
                }
            }
        } else {
            return 0;
        }
    }

    @Override // antlr.collections.AST
    public String getText() {
        return "";
    }

    @Override // antlr.collections.AST
    public int getType() {
        return 0;
    }

    @Override // antlr.collections.AST
    public abstract void initialize(int i10, String str);

    @Override // antlr.collections.AST
    public abstract void initialize(Token token);

    @Override // antlr.collections.AST
    public abstract void initialize(AST ast);

    public void removeChildren() {
        this.down = null;
    }

    @Override // antlr.collections.AST
    public void setFirstChild(AST ast) {
        this.down = (BaseAST) ast;
    }

    @Override // antlr.collections.AST
    public void setNextSibling(AST ast) {
        this.right = (BaseAST) ast;
    }

    @Override // antlr.collections.AST
    public void setText(String str) {
    }

    @Override // antlr.collections.AST
    public void setType(int i10) {
    }

    @Override // antlr.collections.AST
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (verboseStringConversion && !getText().equalsIgnoreCase(tokenNames[getType()]) && !getText().equalsIgnoreCase(StringUtils.stripFrontBack(tokenNames[getType()], "\"", "\""))) {
            stringBuffer.append('[');
            stringBuffer.append(getText());
            stringBuffer.append(",<");
            stringBuffer.append(tokenNames[getType()]);
            stringBuffer.append(">]");
            return stringBuffer.toString();
        }
        return getText();
    }

    @Override // antlr.collections.AST
    public String toStringList() {
        String str = "";
        if (getFirstChild() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("");
            stringBuffer.append(" (");
            str = stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        stringBuffer2.append(" ");
        stringBuffer2.append(toString());
        String stringBuffer3 = stringBuffer2.toString();
        if (getFirstChild() != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(stringBuffer3);
            stringBuffer4.append(((BaseAST) getFirstChild()).toStringList());
            stringBuffer3 = stringBuffer4.toString();
        }
        if (getFirstChild() != null) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(stringBuffer3);
            stringBuffer5.append(" )");
            stringBuffer3 = stringBuffer5.toString();
        }
        if (getNextSibling() != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(stringBuffer3);
            stringBuffer6.append(((BaseAST) getNextSibling()).toStringList());
            return stringBuffer6.toString();
        }
        return stringBuffer3;
    }

    @Override // antlr.collections.AST
    public String toStringTree() {
        String str = "";
        if (getFirstChild() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("");
            stringBuffer.append(" (");
            str = stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        stringBuffer2.append(" ");
        stringBuffer2.append(toString());
        String stringBuffer3 = stringBuffer2.toString();
        if (getFirstChild() != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(stringBuffer3);
            stringBuffer4.append(((BaseAST) getFirstChild()).toStringList());
            stringBuffer3 = stringBuffer4.toString();
        }
        if (getFirstChild() != null) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(stringBuffer3);
            stringBuffer5.append(" )");
            return stringBuffer5.toString();
        }
        return stringBuffer3;
    }

    public void xmlSerialize(Writer writer) {
        for (AST ast = this; ast != null; ast = ast.getNextSibling()) {
            if (ast.getFirstChild() == null) {
                ((BaseAST) ast).xmlSerializeNode(writer);
            } else {
                BaseAST baseAST = (BaseAST) ast;
                baseAST.xmlSerializeRootOpen(writer);
                ((BaseAST) ast.getFirstChild()).xmlSerialize(writer);
                baseAST.xmlSerializeRootClose(writer);
            }
        }
    }

    public void xmlSerializeNode(Writer writer) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(Operator.Operation.LESS_THAN);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(getClass().getName());
        stringBuffer2.append(" ");
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("text=\"");
        stringBuffer3.append(encode(getText()));
        stringBuffer3.append("\" type=\"");
        stringBuffer3.append(getType());
        stringBuffer3.append("\"/>");
        stringBuffer.append(stringBuffer3.toString());
        writer.write(stringBuffer.toString());
    }

    public void xmlSerializeRootClose(Writer writer) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("</");
        stringBuffer.append(getClass().getName());
        stringBuffer.append(">\n");
        writer.write(stringBuffer.toString());
    }

    public void xmlSerializeRootOpen(Writer writer) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(Operator.Operation.LESS_THAN);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(getClass().getName());
        stringBuffer2.append(" ");
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("text=\"");
        stringBuffer3.append(encode(getText()));
        stringBuffer3.append("\" type=\"");
        stringBuffer3.append(getType());
        stringBuffer3.append("\">\n");
        stringBuffer.append(stringBuffer3.toString());
        writer.write(stringBuffer.toString());
    }
}
