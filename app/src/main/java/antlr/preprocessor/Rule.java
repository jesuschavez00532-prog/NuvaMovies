package antlr.preprocessor;

import antlr.collections.impl.IndexedVector;
import java.util.Enumeration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Rule {
    protected String args;
    protected boolean bang = false;
    protected String block;
    protected Grammar enclosingGrammar;
    protected String initAction;
    protected String name;
    protected IndexedVector options;
    protected String returnValue;
    protected String throwsSpec;
    protected String visibility;

    public Rule(String str, String str2, IndexedVector indexedVector, Grammar grammar) {
        this.name = str;
        this.block = str2;
        this.options = indexedVector;
        setEnclosingGrammar(grammar);
    }

    public String getArgs() {
        return this.args;
    }

    public boolean getBang() {
        return this.bang;
    }

    public String getName() {
        return this.name;
    }

    public String getReturnValue() {
        return this.returnValue;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public boolean narrowerVisibility(Rule rule) {
        if (this.visibility.equals("public")) {
            if (!rule.equals("public")) {
                return true;
            }
            return false;
        }
        if (this.visibility.equals("protected")) {
            if (rule.equals("private")) {
                return true;
            }
            return false;
        }
        this.visibility.equals("private");
        return false;
    }

    public boolean sameSignature(Rule rule) {
        boolean z10;
        boolean z11;
        boolean equals = this.name.equals(rule.getName());
        String str = this.args;
        if (str != null) {
            z10 = str.equals(rule.getArgs());
        } else {
            z10 = true;
        }
        String str2 = this.returnValue;
        if (str2 != null) {
            z11 = str2.equals(rule.getReturnValue());
        } else {
            z11 = true;
        }
        if (equals && z10 && z11) {
            return true;
        }
        return false;
    }

    public void setArgs(String str) {
        this.args = str;
    }

    public void setBang() {
        this.bang = true;
    }

    public void setEnclosingGrammar(Grammar grammar) {
        this.enclosingGrammar = grammar;
    }

    public void setInitAction(String str) {
        this.initAction = str;
    }

    public void setOptions(IndexedVector indexedVector) {
        this.options = indexedVector;
    }

    public void setReturnValue(String str) {
        this.returnValue = str;
    }

    public void setThrowsSpec(String str) {
        this.throwsSpec = str;
    }

    public void setVisibility(String str) {
        this.visibility = str;
    }

    public String toString() {
        String stringBuffer;
        String str;
        String str2 = "";
        if (this.returnValue == null) {
            stringBuffer = "";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("returns ");
            stringBuffer2.append(this.returnValue);
            stringBuffer = stringBuffer2.toString();
        }
        String str3 = this.args;
        if (str3 == null) {
            str3 = "";
        }
        if (!getBang()) {
            str = "";
        } else {
            str = "!";
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("");
        if (this.visibility != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(this.visibility);
            stringBuffer4.append(" ");
            str2 = stringBuffer4.toString();
        }
        stringBuffer3.append(str2);
        String stringBuffer5 = stringBuffer3.toString();
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append(stringBuffer5);
        stringBuffer6.append(this.name);
        stringBuffer6.append(str);
        stringBuffer6.append(str3);
        stringBuffer6.append(" ");
        stringBuffer6.append(stringBuffer);
        stringBuffer6.append(this.throwsSpec);
        String stringBuffer7 = stringBuffer6.toString();
        if (this.options != null) {
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append(stringBuffer7);
            stringBuffer8.append(System.getProperty("line.separator"));
            stringBuffer8.append("options {");
            stringBuffer8.append(System.getProperty("line.separator"));
            String stringBuffer9 = stringBuffer8.toString();
            Enumeration elements = this.options.elements();
            while (elements.hasMoreElements()) {
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append(stringBuffer9);
                stringBuffer10.append((Option) elements.nextElement());
                stringBuffer10.append(System.getProperty("line.separator"));
                stringBuffer9 = stringBuffer10.toString();
            }
            StringBuffer stringBuffer11 = new StringBuffer();
            stringBuffer11.append(stringBuffer9);
            stringBuffer11.append("}");
            stringBuffer11.append(System.getProperty("line.separator"));
            stringBuffer7 = stringBuffer11.toString();
        }
        if (this.initAction != null) {
            StringBuffer stringBuffer12 = new StringBuffer();
            stringBuffer12.append(stringBuffer7);
            stringBuffer12.append(this.initAction);
            stringBuffer12.append(System.getProperty("line.separator"));
            stringBuffer7 = stringBuffer12.toString();
        }
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append(stringBuffer7);
        stringBuffer13.append(this.block);
        return stringBuffer13.toString();
    }
}
