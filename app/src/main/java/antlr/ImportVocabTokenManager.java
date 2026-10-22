package antlr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ImportVocabTokenManager extends SimpleTokenManager {
    private String filename;
    protected Grammar grammar;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImportVocabTokenManager(Grammar grammar, String str, String str2, Tool tool) {
        super(str2, tool);
        this.grammar = grammar;
        this.filename = str;
        File file = new File(this.filename);
        if (!file.exists()) {
            file = new File(this.antlrTool.getOutputDirectory(), this.filename);
            if (!file.exists()) {
                Tool tool2 = this.antlrTool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Cannot find importVocab file '");
                stringBuffer.append(this.filename);
                stringBuffer.append("'");
                tool2.panic(stringBuffer.toString());
            }
        }
        setReadOnly(true);
        try {
            ANTLRTokdefParser aNTLRTokdefParser = new ANTLRTokdefParser(new ANTLRTokdefLexer(new BufferedReader(new FileReader(file))));
            aNTLRTokdefParser.setTool(this.antlrTool);
            aNTLRTokdefParser.setFilename(this.filename);
            aNTLRTokdefParser.file(this);
        } catch (RecognitionException e10) {
            Tool tool3 = this.antlrTool;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Error parsing importVocab file '");
            stringBuffer2.append(this.filename);
            stringBuffer2.append("': ");
            stringBuffer2.append(e10.toString());
            tool3.panic(stringBuffer2.toString());
        } catch (TokenStreamException unused) {
            Tool tool4 = this.antlrTool;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Error reading importVocab file '");
            stringBuffer3.append(this.filename);
            stringBuffer3.append("'");
            tool4.panic(stringBuffer3.toString());
        } catch (FileNotFoundException unused2) {
            Tool tool5 = this.antlrTool;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Cannot find importVocab file '");
            stringBuffer4.append(this.filename);
            stringBuffer4.append("'");
            tool5.panic(stringBuffer4.toString());
        }
    }

    @Override // antlr.SimpleTokenManager, antlr.TokenManager
    public Object clone() {
        ImportVocabTokenManager importVocabTokenManager = (ImportVocabTokenManager) super.clone();
        importVocabTokenManager.filename = this.filename;
        importVocabTokenManager.grammar = this.grammar;
        return importVocabTokenManager;
    }

    @Override // antlr.SimpleTokenManager, antlr.TokenManager
    public void define(TokenSymbol tokenSymbol) {
        super.define(tokenSymbol);
    }

    @Override // antlr.SimpleTokenManager, antlr.TokenManager
    public boolean isReadOnly() {
        return this.readOnly;
    }

    @Override // antlr.SimpleTokenManager, antlr.TokenManager
    public int nextTokenType() {
        return super.nextTokenType();
    }

    public void define(String str, int i10) {
        TokenSymbol tokenSymbol;
        if (str.startsWith("\"")) {
            tokenSymbol = new StringLiteralSymbol(str);
        } else {
            tokenSymbol = new TokenSymbol(str);
        }
        tokenSymbol.setTokenType(i10);
        super.define(tokenSymbol);
        int i11 = i10 + 1;
        int i12 = this.maxToken;
        if (i11 <= i12) {
            i11 = i12;
        }
        this.maxToken = i11;
    }
}
