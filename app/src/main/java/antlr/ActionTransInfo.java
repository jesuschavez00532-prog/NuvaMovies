package antlr;

/* loaded from: classes.dex */
public class ActionTransInfo {
    public boolean assignToRoot = false;
    public String refRuleRoot = null;
    public String followSetName = null;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("assignToRoot:");
        stringBuffer.append(this.assignToRoot);
        stringBuffer.append(", refRuleRoot:");
        stringBuffer.append(this.refRuleRoot);
        stringBuffer.append(", FOLLOW Set:");
        stringBuffer.append(this.followSetName);
        return stringBuffer.toString();
    }
}
