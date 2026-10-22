package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;

@Monitor(module = "networkPrefer", monitorPoint = "strategy_stat")
/* loaded from: classes.dex */
public class StrategyStatObject extends StatObject {

    @Dimension
    public StringBuilder errorTrace;

    @Dimension
    public int isFileExists;

    @Dimension
    public int isReadObjectSucceed;

    @Dimension
    public int isRenameSucceed;

    @Dimension
    public int isSucceed;

    @Dimension
    public int isTempWriteSucceed;

    @Measure
    public long readCostTime;

    @Dimension
    public String readStrategyFileId;

    @Dimension
    public String readStrategyFilePath;

    @Dimension
    public int type;

    @Measure
    public long writeCostTime;

    @Dimension
    public String writeStrategyFileId;

    @Dimension
    public String writeStrategyFilePath;

    @Dimension
    public String writeTempFilePath;

    public StrategyStatObject(int i10) {
        this.type = i10;
    }

    public void appendErrorTrace(String str, Throwable th) {
        String message = th.getMessage();
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        StringBuilder sb2 = this.errorTrace;
        sb2.append('[');
        sb2.append(str);
        sb2.append(']');
        sb2.append(str);
        sb2.append(' ');
        sb2.append(message);
        sb2.append('\n');
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        return GlobalAppRuntimeInfo.isTargetProcess();
    }
}
