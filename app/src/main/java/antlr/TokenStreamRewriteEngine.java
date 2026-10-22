package antlr;

import antlr.collections.impl.BitSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class TokenStreamRewriteEngine implements TokenStream {
    public static final String DEFAULT_PROGRAM_NAME = "default";
    public static final int MIN_TOKEN_INDEX = 0;
    public static final int PROGRAM_INIT_SIZE = 100;
    protected BitSet discardMask;
    protected int index;
    protected Map lastRewriteTokenIndexes;
    protected Map programs;
    protected TokenStream stream;
    protected List tokens;

    /* loaded from: classes.dex */
    static class DeleteOp extends ReplaceOp {
        public DeleteOp(int i10, int i11) {
            super(i10, i11, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class InsertBeforeOp extends RewriteOperation {
        public InsertBeforeOp(int i10, String str) {
            super(i10, str);
        }

        @Override // antlr.TokenStreamRewriteEngine.RewriteOperation
        public int execute(StringBuffer stringBuffer) {
            stringBuffer.append(this.text);
            return this.index;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ReplaceOp extends RewriteOperation {
        protected int lastIndex;

        public ReplaceOp(int i10, int i11, String str) {
            super(i10, str);
            this.lastIndex = i11;
        }

        @Override // antlr.TokenStreamRewriteEngine.RewriteOperation
        public int execute(StringBuffer stringBuffer) {
            String str = this.text;
            if (str != null) {
                stringBuffer.append(str);
            }
            return this.lastIndex + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class RewriteOperation {
        protected int index;
        protected String text;

        protected RewriteOperation(int i10, String str) {
            this.index = i10;
            this.text = str;
        }

        public int execute(StringBuffer stringBuffer) {
            return this.index;
        }
    }

    public TokenStreamRewriteEngine(TokenStream tokenStream) {
        this(tokenStream, 1000);
    }

    private List initializeProgram(String str) {
        ArrayList arrayList = new ArrayList(100);
        this.programs.put(str, arrayList);
        return arrayList;
    }

    protected void addToSortedRewriteList(RewriteOperation rewriteOperation) {
        addToSortedRewriteList("default", rewriteOperation);
    }

    public void delete(int i10) {
        delete("default", i10, i10);
    }

    public void deleteProgram() {
        deleteProgram("default");
    }

    public void discard(int i10) {
        this.discardMask.add(i10);
    }

    public int getLastRewriteTokenIndex() {
        return getLastRewriteTokenIndex("default");
    }

    protected List getProgram(String str) {
        List list = (List) this.programs.get(str);
        if (list == null) {
            return initializeProgram(str);
        }
        return list;
    }

    public TokenWithIndex getToken(int i10) {
        return (TokenWithIndex) this.tokens.get(i10);
    }

    public int getTokenStreamSize() {
        return this.tokens.size();
    }

    public void insertAfter(Token token, String str) {
        insertAfter("default", token, str);
    }

    public void insertBefore(Token token, String str) {
        insertBefore("default", token, str);
    }

    @Override // antlr.TokenStream
    public Token nextToken() {
        TokenWithIndex tokenWithIndex;
        do {
            tokenWithIndex = (TokenWithIndex) this.stream.nextToken();
            if (tokenWithIndex != null) {
                tokenWithIndex.setIndex(this.index);
                if (tokenWithIndex.getType() != 1) {
                    this.tokens.add(tokenWithIndex);
                }
                this.index++;
            }
            if (tokenWithIndex == null) {
                break;
            }
        } while (this.discardMask.member(tokenWithIndex.getType()));
        return tokenWithIndex;
    }

    public void replace(int i10, String str) {
        replace("default", i10, i10, str);
    }

    public void rollback(int i10) {
        rollback("default", i10);
    }

    protected void setLastRewriteTokenIndex(String str, int i10) {
        this.lastRewriteTokenIndexes.put(str, new Integer(i10));
    }

    public String toDebugString() {
        return toDebugString(0, getTokenStreamSize());
    }

    public String toOriginalString() {
        return toOriginalString(0, getTokenStreamSize() - 1);
    }

    public String toString() {
        return toString(0, getTokenStreamSize());
    }

    public TokenStreamRewriteEngine(TokenStream tokenStream, int i10) {
        this.programs = null;
        this.lastRewriteTokenIndexes = null;
        this.index = 0;
        this.discardMask = new BitSet();
        this.stream = tokenStream;
        this.tokens = new ArrayList(i10);
        HashMap hashMap = new HashMap();
        this.programs = hashMap;
        hashMap.put("default", new ArrayList(100));
        this.lastRewriteTokenIndexes = new HashMap();
    }

    protected void addToSortedRewriteList(String str, RewriteOperation rewriteOperation) {
        List program = getProgram(str);
        if (rewriteOperation.index >= getLastRewriteTokenIndex(str)) {
            program.add(rewriteOperation);
            setLastRewriteTokenIndex(str, rewriteOperation.index);
        } else {
            if (Collections.binarySearch(program, rewriteOperation, new Comparator() { // from class: antlr.TokenStreamRewriteEngine.1
                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    int i10 = ((RewriteOperation) obj).index;
                    int i11 = ((RewriteOperation) obj2).index;
                    if (i10 < i11) {
                        return -1;
                    }
                    if (i10 > i11) {
                        return 1;
                    }
                    return 0;
                }
            }) < 0) {
                program.add((-r4) - 1, rewriteOperation);
            }
        }
    }

    public void delete(int i10, int i11) {
        delete("default", i10, i11);
    }

    public void deleteProgram(String str) {
        rollback(str, 0);
    }

    protected int getLastRewriteTokenIndex(String str) {
        Integer num = (Integer) this.lastRewriteTokenIndexes.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void insertAfter(int i10, String str) {
        insertAfter("default", i10, str);
    }

    public void insertBefore(int i10, String str) {
        insertBefore("default", i10, str);
    }

    public void replace(int i10, int i11, String str) {
        replace("default", i10, i11, str);
    }

    public void rollback(String str, int i10) {
        List list = (List) this.programs.get(str);
        if (list != null) {
            this.programs.put(str, list.subList(0, i10));
        }
    }

    public String toDebugString(int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        while (i10 >= 0 && i10 <= i11 && i10 < this.tokens.size()) {
            stringBuffer.append(getToken(i10));
            i10++;
        }
        return stringBuffer.toString();
    }

    public String toOriginalString(int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        while (i10 >= 0 && i10 <= i11 && i10 < this.tokens.size()) {
            stringBuffer.append(getToken(i10).getText());
            i10++;
        }
        return stringBuffer.toString();
    }

    public String toString(String str) {
        return toString(str, 0, getTokenStreamSize());
    }

    public void delete(Token token) {
        delete("default", token, token);
    }

    public void insertAfter(String str, Token token, String str2) {
        insertAfter(str, ((TokenWithIndex) token).getIndex(), str2);
    }

    public void insertBefore(String str, Token token, String str2) {
        insertBefore(str, ((TokenWithIndex) token).getIndex(), str2);
    }

    public void replace(Token token, String str) {
        replace("default", token, token, str);
    }

    public String toString(int i10, int i11) {
        return toString("default", i10, i11);
    }

    public void delete(Token token, Token token2) {
        delete("default", token, token2);
    }

    public void insertAfter(String str, int i10, String str2) {
        insertBefore(str, i10 + 1, str2);
    }

    public void insertBefore(String str, int i10, String str2) {
        addToSortedRewriteList(str, new InsertBeforeOp(i10, str2));
    }

    public void replace(Token token, Token token2, String str) {
        replace("default", token, token2, str);
    }

    public String toString(String str, int i10, int i11) {
        List list = (List) this.programs.get(str);
        if (list == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i12 = 0;
        while (i10 >= 0 && i10 <= i11 && i10 < this.tokens.size()) {
            if (i12 < list.size()) {
                RewriteOperation rewriteOperation = (RewriteOperation) list.get(i12);
                while (i10 == rewriteOperation.index && i12 < list.size()) {
                    i10 = rewriteOperation.execute(stringBuffer);
                    i12++;
                    if (i12 < list.size()) {
                        rewriteOperation = (RewriteOperation) list.get(i12);
                    }
                }
            }
            if (i10 < i11) {
                stringBuffer.append(getToken(i10).getText());
                i10++;
            }
        }
        while (i12 < list.size()) {
            ((RewriteOperation) list.get(i12)).execute(stringBuffer);
            i12++;
        }
        return stringBuffer.toString();
    }

    public void delete(String str, int i10, int i11) {
        replace(str, i10, i11, (String) null);
    }

    public void replace(String str, int i10, int i11, String str2) {
        addToSortedRewriteList(new ReplaceOp(i10, i11, str2));
    }

    public void delete(String str, Token token, Token token2) {
        replace(str, token, token2, (String) null);
    }

    public void replace(String str, Token token, Token token2, String str2) {
        replace(str, ((TokenWithIndex) token).getIndex(), ((TokenWithIndex) token2).getIndex(), str2);
    }
}
