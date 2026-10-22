package antlr.build;

import com.raizlabs.android.dbflow.sql.language.Operator;
import com.youth.banner.BannerConfig;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public class ANTLR {
    public static String compiler = "javac";
    public static String jarName = "antlr.jar";
    public static String root = ".";
    public static String[] srcdir = {"antlr", "antlr/actions/cpp", "antlr/actions/java", "antlr/actions/csharp", "antlr/collections", "antlr/collections/impl", "antlr/debug", "antlr/debug/misc", "antlr/preprocessor"};

    public ANTLR() {
        compiler = System.getProperty("antlr.build.compiler", compiler);
        root = System.getProperty("antlr.build.root", root);
    }

    public void build(Tool tool) {
        if (!rootIsValidANTLRDir(tool)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(root);
        stringBuffer.append("/antlr/antlr.g");
        tool.antlr(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(root);
        stringBuffer2.append("/antlr/tokdef.g");
        tool.antlr(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(root);
        stringBuffer3.append("/antlr/preprocessor/preproc.g");
        tool.antlr(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(root);
        stringBuffer4.append("/antlr/actions/java/action.g");
        tool.antlr(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(root);
        stringBuffer5.append("/antlr/actions/cpp/action.g");
        tool.antlr(stringBuffer5.toString());
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append(root);
        stringBuffer6.append("/antlr/actions/csharp/action.g");
        tool.antlr(stringBuffer6.toString());
        for (int i10 = 0; i10 < srcdir.length; i10++) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(compiler);
            stringBuffer7.append(" -d ");
            stringBuffer7.append(root);
            stringBuffer7.append(" ");
            stringBuffer7.append(root);
            stringBuffer7.append(Operator.Operation.DIVISION);
            stringBuffer7.append(srcdir[i10]);
            stringBuffer7.append("/*.java");
            tool.system(stringBuffer7.toString());
        }
    }

    public String getName() {
        return "ANTLR";
    }

    public void jar(Tool tool) {
        if (!rootIsValidANTLRDir(tool)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(BannerConfig.TIME);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("jar cvf ");
        stringBuffer2.append(root);
        stringBuffer2.append(Operator.Operation.DIVISION);
        stringBuffer2.append(jarName);
        stringBuffer.append(stringBuffer2.toString());
        for (int i10 = 0; i10 < srcdir.length; i10++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" ");
            stringBuffer3.append(root);
            stringBuffer3.append(Operator.Operation.DIVISION);
            stringBuffer3.append(srcdir[i10]);
            stringBuffer3.append("/*.class");
            stringBuffer.append(stringBuffer3.toString());
        }
        tool.system(stringBuffer.toString());
    }

    protected boolean rootIsValidANTLRDir(Tool tool) {
        if (root == null) {
            return false;
        }
        File file = new File(root);
        if (!file.exists()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Property antlr.build.root==");
            stringBuffer.append(root);
            stringBuffer.append(" does not exist");
            tool.error(stringBuffer.toString());
            return false;
        }
        if (!file.isDirectory()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Property antlr.build.root==");
            stringBuffer2.append(root);
            stringBuffer2.append(" is not a directory");
            tool.error(stringBuffer2.toString());
            return false;
        }
        String[] list = file.list(new FilenameFilter() { // from class: antlr.build.ANTLR.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                if (file2.isDirectory() && str.equals("antlr")) {
                    return true;
                }
                return false;
            }
        });
        if (list != null && list.length != 0) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(root);
            stringBuffer3.append("/antlr");
            String[] list2 = new File(stringBuffer3.toString()).list();
            if (list2 != null && list2.length != 0) {
                return true;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Property antlr.build.root==");
            stringBuffer4.append(root);
            stringBuffer4.append(" does not appear to be a valid ANTLR project root (no .java files in antlr subdir");
            tool.error(stringBuffer4.toString());
            return false;
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("Property antlr.build.root==");
        stringBuffer5.append(root);
        stringBuffer5.append(" does not appear to be a valid ANTLR project root (no antlr subdir)");
        tool.error(stringBuffer5.toString());
        return false;
    }
}
