package antlr;

import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

/* loaded from: classes.dex */
public class NameSpace {
    private String _name;
    private Vector names = new Vector();

    public NameSpace(String str) {
        this._name = new String(str);
        parse(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void emitClosures(PrintWriter printWriter) {
        for (int i10 = 0; i10 < this.names.size(); i10++) {
            printWriter.println("ANTLR_END_NAMESPACE");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void emitDeclarations(PrintWriter printWriter) {
        Enumeration elements = this.names.elements();
        while (elements.hasMoreElements()) {
            String str = (String) elements.nextElement();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ANTLR_BEGIN_NAMESPACE(");
            stringBuffer.append(str);
            stringBuffer.append(")");
            printWriter.println(stringBuffer.toString());
        }
    }

    public String getName() {
        return this._name;
    }

    protected void parse(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "::");
        while (stringTokenizer.hasMoreTokens()) {
            this.names.addElement(stringTokenizer.nextToken());
        }
    }
}
