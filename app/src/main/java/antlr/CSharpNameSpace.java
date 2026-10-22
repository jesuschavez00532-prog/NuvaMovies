package antlr;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public class CSharpNameSpace extends NameSpace {
    public CSharpNameSpace(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // antlr.NameSpace
    public void emitClosures(PrintWriter printWriter) {
        printWriter.println("}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // antlr.NameSpace
    public void emitDeclarations(PrintWriter printWriter) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("namespace ");
        stringBuffer.append(getName());
        printWriter.println(stringBuffer.toString());
        printWriter.println("{");
    }
}
