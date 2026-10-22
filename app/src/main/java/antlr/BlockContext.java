package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BlockContext {
    int altNum;
    AlternativeBlock block;
    BlockEndElement blockEnd;

    public void addAlternativeElement(AlternativeElement alternativeElement) {
        currentAlt().addElement(alternativeElement);
    }

    public Alternative currentAlt() {
        return (Alternative) this.block.alternatives.elementAt(this.altNum);
    }

    public AlternativeElement currentElement() {
        return currentAlt().tail;
    }
}
