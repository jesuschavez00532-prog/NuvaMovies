package antlr;

import antlr.collections.impl.Vector;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
class SimpleTokenManager implements TokenManager, Cloneable {
    protected Tool antlrTool;
    protected String name;
    protected int maxToken = 4;
    protected boolean readOnly = false;
    protected Vector vocabulary = new Vector(1);
    private Hashtable table = new Hashtable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleTokenManager(String str, Tool tool) {
        this.antlrTool = tool;
        this.name = str;
        TokenSymbol tokenSymbol = new TokenSymbol("EOF");
        tokenSymbol.setTokenType(1);
        define(tokenSymbol);
        this.vocabulary.ensureCapacity(3);
        this.vocabulary.setElementAt("NULL_TREE_LOOKAHEAD", 3);
    }

    @Override // antlr.TokenManager
    public Object clone() {
        try {
            SimpleTokenManager simpleTokenManager = (SimpleTokenManager) super.clone();
            simpleTokenManager.vocabulary = (Vector) this.vocabulary.clone();
            simpleTokenManager.table = (Hashtable) this.table.clone();
            simpleTokenManager.maxToken = this.maxToken;
            simpleTokenManager.antlrTool = this.antlrTool;
            simpleTokenManager.name = this.name;
            return simpleTokenManager;
        } catch (CloneNotSupportedException unused) {
            this.antlrTool.panic("cannot clone token manager");
            return null;
        }
    }

    @Override // antlr.TokenManager
    public void define(TokenSymbol tokenSymbol) {
        this.vocabulary.ensureCapacity(tokenSymbol.getTokenType());
        this.vocabulary.setElementAt(tokenSymbol.getId(), tokenSymbol.getTokenType());
        mapToTokenSymbol(tokenSymbol.getId(), tokenSymbol);
    }

    @Override // antlr.TokenManager
    public String getName() {
        return this.name;
    }

    @Override // antlr.TokenManager
    public String getTokenStringAt(int i10) {
        return (String) this.vocabulary.elementAt(i10);
    }

    @Override // antlr.TokenManager
    public TokenSymbol getTokenSymbol(String str) {
        return (TokenSymbol) this.table.get(str);
    }

    @Override // antlr.TokenManager
    public TokenSymbol getTokenSymbolAt(int i10) {
        return getTokenSymbol(getTokenStringAt(i10));
    }

    @Override // antlr.TokenManager
    public Enumeration getTokenSymbolElements() {
        return this.table.elements();
    }

    @Override // antlr.TokenManager
    public Enumeration getTokenSymbolKeys() {
        return this.table.keys();
    }

    @Override // antlr.TokenManager
    public Vector getVocabulary() {
        return this.vocabulary;
    }

    @Override // antlr.TokenManager
    public boolean isReadOnly() {
        return false;
    }

    @Override // antlr.TokenManager
    public void mapToTokenSymbol(String str, TokenSymbol tokenSymbol) {
        this.table.put(str, tokenSymbol);
    }

    @Override // antlr.TokenManager
    public int maxTokenType() {
        return this.maxToken - 1;
    }

    @Override // antlr.TokenManager
    public int nextTokenType() {
        int i10 = this.maxToken;
        this.maxToken = i10 + 1;
        return i10;
    }

    @Override // antlr.TokenManager
    public void setName(String str) {
        this.name = str;
    }

    @Override // antlr.TokenManager
    public void setReadOnly(boolean z10) {
        this.readOnly = z10;
    }

    @Override // antlr.TokenManager
    public boolean tokenDefined(String str) {
        return this.table.containsKey(str);
    }
}
