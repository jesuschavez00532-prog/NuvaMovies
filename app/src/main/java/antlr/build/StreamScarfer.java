package antlr.build;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StreamScarfer extends Thread {

    /* renamed from: is */
    InputStream f4247is;
    Tool tool;
    String type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamScarfer(InputStream inputStream, String str, Tool tool) {
        this.f4247is = inputStream;
        this.type = str;
        this.tool = tool;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f4247is));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String str = this.type;
                    if (str != null && !str.equals("stdout")) {
                        this.tool.stderr(readLine);
                    }
                    this.tool.stdout(readLine);
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
