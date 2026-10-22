package com.bytedance.boost_multidex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
class Locker {
    private FileLock cacheLock;
    private FileChannel lockChannel;
    private File lockFile;
    private RandomAccessFile lockRaf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locker(File file) {
        this.lockFile = file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void close() {
        FileLock fileLock = this.cacheLock;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
        Monitor.get().logInfo("Released lock " + this.lockFile.getPath());
        Utility.closeQuietly(this.lockChannel);
        Utility.closeQuietly(this.lockRaf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void lock() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.lockFile, "rw");
        this.lockRaf = randomAccessFile;
        try {
            this.lockChannel = randomAccessFile.getChannel();
            try {
                Monitor.get().logInfo("Blocking on lock " + this.lockFile.getPath());
                this.cacheLock = this.lockChannel.lock();
                Monitor.get().logInfo("Acquired on lock " + this.lockFile.getPath());
            } catch (IOException e10) {
                Utility.closeQuietly(this.lockChannel);
                throw e10;
            }
        } catch (IOException e11) {
            Utility.closeQuietly(this.lockRaf);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean test() {
        Monitor monitor;
        StringBuilder sb2;
        String str = "Acquired on lock ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.lockFile, "rw");
        this.lockRaf = randomAccessFile;
        this.lockChannel = randomAccessFile.getChannel();
        try {
            try {
                Monitor.get().logInfo("Blocking on lock " + this.lockFile.getPath());
                FileLock tryLock = this.lockChannel.tryLock();
                this.cacheLock = tryLock;
                r1 = tryLock != null;
                monitor = Monitor.get();
                sb2 = new StringBuilder();
            } catch (IOException unused) {
                Monitor.get().logInfo("Aborting on lock " + this.lockFile.getPath());
                monitor = Monitor.get();
                sb2 = new StringBuilder();
            }
            sb2.append("Acquired on lock ");
            sb2.append(this.lockFile.getPath());
            str = sb2.toString();
            monitor.logInfo(str);
            return r1;
        } catch (Throwable th) {
            Monitor.get().logInfo(str + this.lockFile.getPath());
            throw th;
        }
    }
}
