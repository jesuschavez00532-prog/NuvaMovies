package antlr;

import antlr.collections.Stack;
import antlr.collections.impl.LList;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class TokenStreamSelector implements TokenStream {
    protected TokenStream input;
    protected Stack streamStack = new LList();
    protected Hashtable inputStreamNames = new Hashtable();

    public void addInputStream(TokenStream tokenStream, String str) {
        this.inputStreamNames.put(str, tokenStream);
    }

    public TokenStream getCurrentStream() {
        return this.input;
    }

    public TokenStream getStream(String str) {
        TokenStream tokenStream = (TokenStream) this.inputStreamNames.get(str);
        if (tokenStream != null) {
            return tokenStream;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TokenStream ");
        stringBuffer.append(str);
        stringBuffer.append(" not found");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    @Override // antlr.TokenStream
    public Token nextToken() {
        while (true) {
            try {
                return this.input.nextToken();
            } catch (TokenStreamRetryException unused) {
            }
        }
    }

    public TokenStream pop() {
        TokenStream tokenStream = (TokenStream) this.streamStack.pop();
        select(tokenStream);
        return tokenStream;
    }

    public void push(TokenStream tokenStream) {
        this.streamStack.push(this.input);
        select(tokenStream);
    }

    public void retry() {
        throw new TokenStreamRetryException();
    }

    public void select(TokenStream tokenStream) {
        this.input = tokenStream;
    }

    public void select(String str) {
        this.input = getStream(str);
    }

    public void push(String str) {
        this.streamStack.push(this.input);
        select(str);
    }
}
