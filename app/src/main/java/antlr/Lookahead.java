package antlr;

import antlr.collections.impl.BitSet;
import antlr.collections.impl.Vector;

/* loaded from: classes.dex */
public class Lookahead implements Cloneable {
    String cycle;
    BitSet epsilonDepth;
    BitSet fset;
    boolean hasEpsilon;

    public Lookahead() {
        this.hasEpsilon = false;
        this.fset = new BitSet();
    }

    /* renamed from: of */
    public static Lookahead m4818of(int i10) {
        Lookahead lookahead = new Lookahead();
        lookahead.fset.add(i10);
        return lookahead;
    }

    public Object clone() {
        try {
            Lookahead lookahead = (Lookahead) super.clone();
            lookahead.fset = (BitSet) this.fset.clone();
            lookahead.cycle = this.cycle;
            BitSet bitSet = this.epsilonDepth;
            if (bitSet != null) {
                lookahead.epsilonDepth = (BitSet) bitSet.clone();
            }
            return lookahead;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public void combineWith(Lookahead lookahead) {
        if (this.cycle == null) {
            this.cycle = lookahead.cycle;
        }
        if (lookahead.containsEpsilon()) {
            this.hasEpsilon = true;
        }
        BitSet bitSet = this.epsilonDepth;
        if (bitSet != null) {
            BitSet bitSet2 = lookahead.epsilonDepth;
            if (bitSet2 != null) {
                bitSet.orInPlace(bitSet2);
            }
        } else {
            BitSet bitSet3 = lookahead.epsilonDepth;
            if (bitSet3 != null) {
                this.epsilonDepth = (BitSet) bitSet3.clone();
            }
        }
        this.fset.orInPlace(lookahead.fset);
    }

    public boolean containsEpsilon() {
        return this.hasEpsilon;
    }

    public Lookahead intersection(Lookahead lookahead) {
        Lookahead lookahead2 = new Lookahead(this.fset.and(lookahead.fset));
        if (this.hasEpsilon && lookahead.hasEpsilon) {
            lookahead2.setEpsilon();
        }
        return lookahead2;
    }

    public boolean nil() {
        if (this.fset.nil() && !this.hasEpsilon) {
            return true;
        }
        return false;
    }

    public void resetEpsilon() {
        this.hasEpsilon = false;
    }

    public void setEpsilon() {
        this.hasEpsilon = true;
    }

    public String toString() {
        String str;
        String bitSet = this.fset.toString(",");
        String str2 = "";
        String str3 = containsEpsilon() ? "+<epsilon>" : "";
        if (this.cycle != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("; FOLLOW(");
            stringBuffer.append(this.cycle);
            stringBuffer.append(")");
            str = stringBuffer.toString();
        } else {
            str = "";
        }
        if (this.epsilonDepth != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("; depths=");
            stringBuffer2.append(this.epsilonDepth.toString(","));
            str2 = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(bitSet);
        stringBuffer3.append(str3);
        stringBuffer3.append(str);
        stringBuffer3.append(str2);
        return stringBuffer3.toString();
    }

    public Lookahead(BitSet bitSet) {
        this.hasEpsilon = false;
        this.fset = bitSet;
    }

    public Lookahead(String str) {
        this();
        this.cycle = str;
    }

    public String toString(String str, CharFormatter charFormatter) {
        String str2;
        String bitSet = this.fset.toString(str, charFormatter);
        String str3 = "";
        String str4 = containsEpsilon() ? "+<epsilon>" : "";
        if (this.cycle != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("; FOLLOW(");
            stringBuffer.append(this.cycle);
            stringBuffer.append(")");
            str2 = stringBuffer.toString();
        } else {
            str2 = "";
        }
        if (this.epsilonDepth != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("; depths=");
            stringBuffer2.append(this.epsilonDepth.toString(","));
            str3 = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(bitSet);
        stringBuffer3.append(str4);
        stringBuffer3.append(str2);
        stringBuffer3.append(str3);
        return stringBuffer3.toString();
    }

    public String toString(String str, CharFormatter charFormatter, Grammar grammar) {
        if (grammar instanceof LexerGrammar) {
            return toString(str, charFormatter);
        }
        return toString(str, grammar.tokenManager.getVocabulary());
    }

    public String toString(String str, Vector vector) {
        String str2;
        String bitSet = this.fset.toString(str, vector);
        String str3 = "";
        if (this.cycle != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("; FOLLOW(");
            stringBuffer.append(this.cycle);
            stringBuffer.append(")");
            str2 = stringBuffer.toString();
        } else {
            str2 = "";
        }
        if (this.epsilonDepth != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("; depths=");
            stringBuffer2.append(this.epsilonDepth.toString(","));
            str3 = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(bitSet);
        stringBuffer3.append(str2);
        stringBuffer3.append(str3);
        return stringBuffer3.toString();
    }
}
