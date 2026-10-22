package anet.channel.strategy;

/* loaded from: classes.dex */
public class ConnEvent {
    public boolean isSuccess = false;
    public long connTime = Long.MAX_VALUE;
    public boolean isAccs = false;

    public String toString() {
        if (this.isSuccess) {
            return "ConnEvent#Success";
        }
        return "ConnEvent#Fail";
    }
}
