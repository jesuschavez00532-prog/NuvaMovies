package ua;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.os.Parcelable;
import me.InterfaceC5664p;
import ne.AbstractC5868k;

/* renamed from: ua.b */
/* loaded from: classes2.dex */
public final class C7070b extends BroadcastReceiver {

    /* renamed from: a */
    private final String f26499a = C7070b.class.getSimpleName();

    /* renamed from: b */
    private InterfaceC5664p f26500b;

    /* renamed from: a */
    public final void m27234a(InterfaceC5664p interfaceC5664p) {
        this.f26500b = interfaceC5664p;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        UsbDevice usbDevice = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("device");
            if (parcelableExtra instanceof UsbDevice) {
                usbDevice = (UsbDevice) parcelableExtra;
            }
            InterfaceC5664p interfaceC5664p = this.f26500b;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Boolean.TRUE, usbDevice);
                return;
            }
            return;
        }
        if (intent != null) {
            str2 = intent.getAction();
        } else {
            str2 = null;
        }
        if (AbstractC5868k.m23669a(str2, "android.hardware.usb.action.USB_DEVICE_DETACHED")) {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("device");
            if (parcelableExtra2 instanceof UsbDevice) {
                usbDevice = (UsbDevice) parcelableExtra2;
            }
            InterfaceC5664p interfaceC5664p2 = this.f26500b;
            if (interfaceC5664p2 != null) {
                interfaceC5664p2.mo2391h(Boolean.FALSE, usbDevice);
            }
        }
    }
}
