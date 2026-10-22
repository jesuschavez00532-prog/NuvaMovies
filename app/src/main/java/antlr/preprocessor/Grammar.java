package antlr.preprocessor;

import antlr.CodeGenerator;
import antlr.collections.impl.IndexedVector;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Grammar {
    protected antlr.Tool antlrTool;
    protected String fileName;
    protected Hierarchy hier;
    protected String memberAction;
    protected String name;
    protected IndexedVector options;
    protected String preambleAction;
    protected IndexedVector rules;
    protected String superGrammar;
    protected String tokenSection;
    protected String type;
    protected boolean predefined = false;
    protected boolean alreadyExpanded = false;
    protected boolean specifiedVocabulary = false;
    protected String superClass = null;
    protected String importVocab = null;
    protected String exportVocab = null;

    public Grammar(antlr.Tool tool, String str, String str2, IndexedVector indexedVector) {
        this.name = str;
        this.superGrammar = str2;
        this.rules = indexedVector;
        this.antlrTool = tool;
    }

    public void addOption(Option option) {
        if (this.options == null) {
            this.options = new IndexedVector();
        }
        this.options.appendElement(option.getName(), option);
    }

    public void addRule(Rule rule) {
        this.rules.appendElement(rule.getName(), rule);
    }

    public void expandInPlace() {
        Grammar superGrammar;
        if (this.alreadyExpanded || (superGrammar = getSuperGrammar()) == null) {
            return;
        }
        if (this.exportVocab == null) {
            this.exportVocab = getName();
        }
        if (superGrammar.isPredefined()) {
            return;
        }
        superGrammar.expandInPlace();
        this.alreadyExpanded = true;
        this.hier.getFile(getFileName()).setExpanded(true);
        Enumeration elements = superGrammar.getRules().elements();
        while (elements.hasMoreElements()) {
            inherit((Rule) elements.nextElement(), superGrammar);
        }
        IndexedVector options = superGrammar.getOptions();
        if (options != null) {
            Enumeration elements2 = options.elements();
            while (elements2.hasMoreElements()) {
                inherit((Option) elements2.nextElement(), superGrammar);
            }
        }
        IndexedVector indexedVector = this.options;
        if ((indexedVector != null && indexedVector.getElement("importVocab") == null) || this.options == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(superGrammar.exportVocab);
            stringBuffer.append(";");
            addOption(new Option("importVocab", stringBuffer.toString(), this));
            String pathToFile = this.antlrTool.pathToFile(superGrammar.getFileName());
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(pathToFile);
            stringBuffer2.append(superGrammar.exportVocab);
            stringBuffer2.append(CodeGenerator.TokenTypesFileSuffix);
            stringBuffer2.append(CodeGenerator.TokenTypesFileExt);
            String stringBuffer3 = stringBuffer2.toString();
            String fileMinusPath = this.antlrTool.fileMinusPath(stringBuffer3);
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(".");
            stringBuffer4.append(System.getProperty("file.separator"));
            if (!pathToFile.equals(stringBuffer4.toString())) {
                try {
                    this.antlrTool.copyFile(stringBuffer3, fileMinusPath);
                } catch (IOException unused) {
                    antlr.Tool tool = this.antlrTool;
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("cannot find/copy importVocab file ");
                    stringBuffer5.append(stringBuffer3);
                    tool.toolError(stringBuffer5.toString());
                    return;
                }
            }
        }
        inherit(superGrammar.memberAction, superGrammar);
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getName() {
        return this.name;
    }

    public IndexedVector getOptions() {
        return this.options;
    }

    public IndexedVector getRules() {
        return this.rules;
    }

    public Grammar getSuperGrammar() {
        String str = this.superGrammar;
        if (str == null) {
            return null;
        }
        return this.hier.getGrammar(str);
    }

    public String getSuperGrammarName() {
        return this.superGrammar;
    }

    public String getType() {
        return this.type;
    }

    public void inherit(Option option, Grammar grammar) {
        if (option.getName().equals("importVocab") || option.getName().equals("exportVocab")) {
            return;
        }
        IndexedVector indexedVector = this.options;
        if ((indexedVector != null ? (Option) indexedVector.getElement(option.getName()) : null) == null) {
            addOption(option);
        }
    }

    public boolean isPredefined() {
        return this.predefined;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setHierarchy(Hierarchy hierarchy) {
        this.hier = hierarchy;
    }

    public void setMemberAction(String str) {
        this.memberAction = str;
    }

    public void setOptions(IndexedVector indexedVector) {
        this.options = indexedVector;
    }

    public void setPreambleAction(String str) {
        this.preambleAction = str;
    }

    public void setPredefined(boolean z10) {
        this.predefined = z10;
    }

    public void setTokenSection(String str) {
        this.tokenSection = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(10000);
        String str = this.preambleAction;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (this.superGrammar == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("class ");
            stringBuffer2.append(this.name);
            stringBuffer2.append(";");
            return stringBuffer2.toString();
        }
        if (this.superClass != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("class ");
            stringBuffer3.append(this.name);
            stringBuffer3.append(" extends ");
            stringBuffer3.append(this.superClass);
            stringBuffer3.append(";");
            stringBuffer.append(stringBuffer3.toString());
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("class ");
            stringBuffer4.append(this.name);
            stringBuffer4.append(" extends ");
            stringBuffer4.append(this.type);
            stringBuffer4.append(";");
            stringBuffer.append(stringBuffer4.toString());
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(System.getProperty("line.separator"));
        stringBuffer5.append(System.getProperty("line.separator"));
        stringBuffer.append(stringBuffer5.toString());
        IndexedVector indexedVector = this.options;
        if (indexedVector != null) {
            stringBuffer.append(Hierarchy.optionsToString(indexedVector));
        }
        if (this.tokenSection != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(this.tokenSection);
            stringBuffer6.append("\n");
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.memberAction != null) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(this.memberAction);
            stringBuffer7.append(System.getProperty("line.separator"));
            stringBuffer.append(stringBuffer7.toString());
        }
        for (int i10 = 0; i10 < this.rules.size(); i10++) {
            Rule rule = (Rule) this.rules.elementAt(i10);
            if (!getName().equals(rule.enclosingGrammar.getName())) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append("// inherited from grammar ");
                stringBuffer8.append(rule.enclosingGrammar.getName());
                stringBuffer8.append(System.getProperty("line.separator"));
                stringBuffer.append(stringBuffer8.toString());
            }
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(rule);
            stringBuffer9.append(System.getProperty("line.separator"));
            stringBuffer9.append(System.getProperty("line.separator"));
            stringBuffer.append(stringBuffer9.toString());
        }
        return stringBuffer.toString();
    }

    public void inherit(Rule rule, Grammar grammar) {
        Rule rule2 = (Rule) this.rules.getElement(rule.getName());
        if (rule2 != null) {
            if (rule2.sameSignature(rule)) {
                return;
            }
            antlr.Tool tool = this.antlrTool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("rule ");
            stringBuffer.append(getName());
            stringBuffer.append(".");
            stringBuffer.append(rule2.getName());
            stringBuffer.append(" has different signature than ");
            stringBuffer.append(grammar.getName());
            stringBuffer.append(".");
            stringBuffer.append(rule2.getName());
            tool.warning(stringBuffer.toString());
            return;
        }
        addRule(rule);
    }

    public void inherit(String str, Grammar grammar) {
        if (this.memberAction == null && str != null) {
            this.memberAction = str;
        }
    }
}
