package p149gc;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.swlauthnew.R$id;
import com.swlauthnew.R$layout;
import com.swlauthnew.R$string;

/* renamed from: gc.b */
/* loaded from: classes.dex */
public class DialogC4425b extends Dialog {

    /* renamed from: a */
    private final String f19160a;

    /* renamed from: b */
    private Context f19161b;

    /* renamed from: c */
    private String f19162c;

    /* renamed from: d */
    private String f19163d;

    /* renamed from: e */
    private String f19164e;

    /* renamed from: f */
    private TextView f19165f;

    /* renamed from: g */
    private TextView f19166g;

    /* renamed from: h */
    private TextView f19167h;

    public DialogC4425b(Context context, int i10, String str, String str2, String str3) {
        super(context, i10);
        this.f19160a = "BottomInfoDialog";
        this.f19161b = context;
        this.f19162c = str;
        this.f19163d = str2;
        this.f19164e = str3;
    }

    /* renamed from: a */
    public void m18556a() {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 11;
            attributes.y = 20;
            window.setAttributes(attributes);
            window.setGravity(85);
        }
    }

    /* renamed from: b */
    public String m18557b() {
        return this.f19162c;
    }

    /* renamed from: c */
    public String m18558c() {
        return this.f19163d;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        String string = null;
        super.onCreate(bundle);
        setContentView(R$layout.dialog_bottom_info_brasiliptv);
        getWindow().setFlags(8, 8);
        this.f19165f = (TextView) findViewById(R$id.mTextAuthTime);
        this.f19166g = (TextView) findViewById(R$id.mTextTips);
        this.f19167h = (TextView) findViewById(R$id.mTextPressMenu);
        this.f19165f.setText(this.f19162c);
        this.f19166g.setText(this.f19163d);
        if (!TextUtils.isEmpty(this.f19164e)) {
            if (this.f19164e.equals(this.f19161b.getString(R$string.authmanager_purchase))) {
                string = this.f19161b.getString(R$string.press_menu_to_purchase);
            } else {
                string = this.f19161b.getString(R$string.press_menu_new);
            }
            this.f19167h.setText(string);
            return;
        }
        this.f19167h.setText(R$string.press_menu_to_purchase);
    }
}
