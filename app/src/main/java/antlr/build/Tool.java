package antlr.build;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class Tool {
    static /* synthetic */ Class class$antlr$build$Tool;

    /* renamed from: os */
    public String f4248os;

    public Tool() {
        this.f4248os = null;
        this.f4248os = System.getProperty("os.name");
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    public static void main(String[] strArr) {
        if (strArr.length != 1) {
            System.err.println("usage: java antlr.build.Tool action");
        } else {
            new Tool().perform("antlr.build.ANTLR", strArr[0]);
        }
    }

    public void antlr(String str) {
        String str2 = null;
        try {
            str2 = new File(str).getParent();
            if (str2 != null) {
                str2 = new File(str2).getCanonicalPath();
            }
        } catch (IOException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid grammar file: ");
            stringBuffer.append(str);
            error(stringBuffer.toString());
        }
        if (str2 != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("java antlr.Tool -o ");
            stringBuffer2.append(str2);
            stringBuffer2.append(" ");
            stringBuffer2.append(str);
            log(stringBuffer2.toString());
            new antlr.Tool().doEverything(new String[]{"-o", str2, str});
        }
    }

    public void error(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("antlr.build.Tool: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void log(String str) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("executing: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void perform(String str, String str2) {
        Class<?> cls;
        if (str != null && str2 != null) {
            Object obj = null;
            try {
                cls = Class.forName(str);
            } catch (Exception e10) {
                e = e10;
                cls = null;
            }
            try {
                obj = cls.newInstance();
            } catch (Exception e11) {
                e = e11;
                try {
                    if (!str.startsWith("antlr.build.")) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("antlr.build.");
                        stringBuffer.append(str);
                        cls = Class.forName(stringBuffer.toString());
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("no such application ");
                    stringBuffer2.append(str);
                    error(stringBuffer2.toString(), e);
                } catch (Exception e12) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("no such application ");
                    stringBuffer3.append(str);
                    error(stringBuffer3.toString(), e12);
                }
                if (cls == null) {
                    return;
                } else {
                    return;
                }
            }
            if (cls == null && obj != null) {
                try {
                    Class<?>[] clsArr = new Class[1];
                    Class<?> cls2 = class$antlr$build$Tool;
                    if (cls2 == null) {
                        cls2 = class$("antlr.build.Tool");
                        class$antlr$build$Tool = cls2;
                    }
                    clsArr[0] = cls2;
                    cls.getMethod(str2, clsArr).invoke(obj, this);
                    return;
                } catch (Exception e13) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("no such action for application ");
                    stringBuffer4.append(str);
                    error(stringBuffer4.toString(), e13);
                    return;
                }
            }
            return;
        }
        error("missing app or action");
    }

    public void stderr(String str) {
        System.err.println(str);
    }

    public void stdout(String str) {
        System.out.println(str);
    }

    public void system(String str) {
        Process exec;
        Runtime runtime = Runtime.getRuntime();
        try {
            log(str);
            if (!this.f4248os.startsWith("Windows")) {
                exec = runtime.exec(new String[]{"sh", "-c", str});
            } else {
                exec = runtime.exec(str);
            }
            StreamScarfer streamScarfer = new StreamScarfer(exec.getErrorStream(), "stderr", this);
            StreamScarfer streamScarfer2 = new StreamScarfer(exec.getInputStream(), "stdout", this);
            streamScarfer.start();
            streamScarfer2.start();
            exec.waitFor();
        } catch (Exception e10) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("cannot exec ");
            stringBuffer.append(str);
            error(stringBuffer.toString(), e10);
        }
    }

    public void error(String str, Exception exc) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("antlr.build.Tool: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
        exc.printStackTrace(System.err);
    }
}
