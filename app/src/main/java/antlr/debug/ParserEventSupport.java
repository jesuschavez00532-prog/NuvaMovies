package antlr.debug;

import antlr.collections.impl.BitSet;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class ParserEventSupport {
    protected static final int CONSUME = 0;
    protected static final int DONE_PARSING = 15;
    protected static final int ENTER_RULE = 1;
    protected static final int EXIT_RULE = 2;

    /* renamed from: LA */
    protected static final int f4255LA = 3;
    protected static final int MATCH = 4;
    protected static final int MATCH_NOT = 5;
    protected static final int MISMATCH = 6;
    protected static final int MISMATCH_NOT = 7;
    protected static final int NEW_LINE = 14;
    protected static final int REPORT_ERROR = 8;
    protected static final int REPORT_WARNING = 9;
    protected static final int SEMPRED = 10;
    protected static final int SYNPRED_FAILED = 11;
    protected static final int SYNPRED_STARTED = 12;
    protected static final int SYNPRED_SUCCEEDED = 13;
    private ParserController controller;
    private Hashtable doneListeners;
    private ParserMatchEvent matchEvent;
    private Vector matchListeners;
    private MessageEvent messageEvent;
    private Vector messageListeners;
    private NewLineEvent newLineEvent;
    private Vector newLineListeners;
    private int ruleDepth = 0;
    private SemanticPredicateEvent semPredEvent;
    private Vector semPredListeners;
    private Object source;
    private SyntacticPredicateEvent synPredEvent;
    private Vector synPredListeners;
    private ParserTokenEvent tokenEvent;
    private Vector tokenListeners;
    private TraceEvent traceEvent;
    private Vector traceListeners;

    public ParserEventSupport(Object obj) {
        this.matchEvent = new ParserMatchEvent(obj);
        this.messageEvent = new MessageEvent(obj);
        this.tokenEvent = new ParserTokenEvent(obj);
        this.traceEvent = new TraceEvent(obj);
        this.semPredEvent = new SemanticPredicateEvent(obj);
        this.synPredEvent = new SyntacticPredicateEvent(obj);
        this.newLineEvent = new NewLineEvent(obj);
        this.source = obj;
    }

    public void addDoneListener(ListenerBase listenerBase) {
        if (this.doneListeners == null) {
            this.doneListeners = new Hashtable();
        }
        Integer num = (Integer) this.doneListeners.get(listenerBase);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        this.doneListeners.put(listenerBase, new Integer(i10));
    }

    public void addMessageListener(MessageListener messageListener) {
        if (this.messageListeners == null) {
            this.messageListeners = new Vector();
        }
        this.messageListeners.addElement(messageListener);
        addDoneListener(messageListener);
    }

    public void addNewLineListener(NewLineListener newLineListener) {
        if (this.newLineListeners == null) {
            this.newLineListeners = new Vector();
        }
        this.newLineListeners.addElement(newLineListener);
        addDoneListener(newLineListener);
    }

    public void addParserListener(ParserListener parserListener) {
        if (parserListener instanceof ParserController) {
            ParserController parserController = (ParserController) parserListener;
            parserController.setParserEventSupport(this);
            this.controller = parserController;
        }
        addParserMatchListener(parserListener);
        addParserTokenListener(parserListener);
        addMessageListener(parserListener);
        addTraceListener(parserListener);
        addSemanticPredicateListener(parserListener);
        addSyntacticPredicateListener(parserListener);
    }

    public void addParserMatchListener(ParserMatchListener parserMatchListener) {
        if (this.matchListeners == null) {
            this.matchListeners = new Vector();
        }
        this.matchListeners.addElement(parserMatchListener);
        addDoneListener(parserMatchListener);
    }

    public void addParserTokenListener(ParserTokenListener parserTokenListener) {
        if (this.tokenListeners == null) {
            this.tokenListeners = new Vector();
        }
        this.tokenListeners.addElement(parserTokenListener);
        addDoneListener(parserTokenListener);
    }

    public void addSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        if (this.semPredListeners == null) {
            this.semPredListeners = new Vector();
        }
        this.semPredListeners.addElement(semanticPredicateListener);
        addDoneListener(semanticPredicateListener);
    }

    public void addSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        if (this.synPredListeners == null) {
            this.synPredListeners = new Vector();
        }
        this.synPredListeners.addElement(syntacticPredicateListener);
        addDoneListener(syntacticPredicateListener);
    }

    public void addTraceListener(TraceListener traceListener) {
        if (this.traceListeners == null) {
            this.traceListeners = new Vector();
        }
        this.traceListeners.addElement(traceListener);
        addDoneListener(traceListener);
    }

    public void fireConsume(int i10) {
        this.tokenEvent.setValues(ParserTokenEvent.CONSUME, 1, i10);
        fireEvents(0, this.tokenListeners);
    }

    public void fireDoneParsing() {
        this.traceEvent.setValues(TraceEvent.DONE_PARSING, 0, 0, 0);
        synchronized (this) {
            Hashtable hashtable = this.doneListeners;
            if (hashtable == null) {
                return;
            }
            Hashtable hashtable2 = (Hashtable) hashtable.clone();
            if (hashtable2 != null) {
                Enumeration keys = hashtable2.keys();
                while (keys.hasMoreElements()) {
                    fireEvent(15, (ListenerBase) keys.nextElement());
                }
            }
            ParserController parserController = this.controller;
            if (parserController != null) {
                parserController.checkBreak();
            }
        }
    }

    public void fireEnterRule(int i10, int i11, int i12) {
        this.ruleDepth++;
        this.traceEvent.setValues(TraceEvent.ENTER, i10, i11, i12);
        fireEvents(1, this.traceListeners);
    }

    public void fireEvent(int i10, ListenerBase listenerBase) {
        switch (i10) {
            case 0:
                ((ParserTokenListener) listenerBase).parserConsume(this.tokenEvent);
                return;
            case 1:
                ((TraceListener) listenerBase).enterRule(this.traceEvent);
                return;
            case 2:
                ((TraceListener) listenerBase).exitRule(this.traceEvent);
                return;
            case 3:
                ((ParserTokenListener) listenerBase).parserLA(this.tokenEvent);
                return;
            case 4:
                ((ParserMatchListener) listenerBase).parserMatch(this.matchEvent);
                return;
            case 5:
                ((ParserMatchListener) listenerBase).parserMatchNot(this.matchEvent);
                return;
            case 6:
                ((ParserMatchListener) listenerBase).parserMismatch(this.matchEvent);
                return;
            case 7:
                ((ParserMatchListener) listenerBase).parserMismatchNot(this.matchEvent);
                return;
            case 8:
                ((MessageListener) listenerBase).reportError(this.messageEvent);
                return;
            case 9:
                ((MessageListener) listenerBase).reportWarning(this.messageEvent);
                return;
            case 10:
                ((SemanticPredicateListener) listenerBase).semanticPredicateEvaluated(this.semPredEvent);
                return;
            case 11:
                ((SyntacticPredicateListener) listenerBase).syntacticPredicateFailed(this.synPredEvent);
                return;
            case 12:
                ((SyntacticPredicateListener) listenerBase).syntacticPredicateStarted(this.synPredEvent);
                return;
            case 13:
                ((SyntacticPredicateListener) listenerBase).syntacticPredicateSucceeded(this.synPredEvent);
                return;
            case 14:
                ((NewLineListener) listenerBase).hitNewLine(this.newLineEvent);
                return;
            case 15:
                listenerBase.doneParsing(this.traceEvent);
                return;
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("bad type ");
                stringBuffer.append(i10);
                stringBuffer.append(" for fireEvent()");
                throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public void fireEvents(int i10, Vector vector) {
        if (vector != null) {
            for (int i11 = 0; i11 < vector.size(); i11++) {
                fireEvent(i10, (ListenerBase) vector.elementAt(i11));
            }
        }
        ParserController parserController = this.controller;
        if (parserController != null) {
            parserController.checkBreak();
        }
    }

    public void fireExitRule(int i10, int i11, int i12) {
        this.traceEvent.setValues(TraceEvent.EXIT, i10, i11, i12);
        fireEvents(2, this.traceListeners);
        int i13 = this.ruleDepth - 1;
        this.ruleDepth = i13;
        if (i13 == 0) {
            fireDoneParsing();
        }
    }

    public void fireLA(int i10, int i11) {
        this.tokenEvent.setValues(ParserTokenEvent.f4256LA, i10, i11);
        fireEvents(3, this.tokenListeners);
    }

    public void fireMatch(char c10, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR, c10, new Character(c10), null, i10, false, true);
        fireEvents(4, this.matchListeners);
    }

    public void fireMatchNot(char c10, char c11, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR, c10, new Character(c11), null, i10, true, true);
        fireEvents(5, this.matchListeners);
    }

    public void fireMismatch(char c10, char c11, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR, c10, new Character(c11), null, i10, false, false);
        fireEvents(6, this.matchListeners);
    }

    public void fireMismatchNot(char c10, char c11, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR, c10, new Character(c11), null, i10, true, true);
        fireEvents(7, this.matchListeners);
    }

    public void fireNewLine(int i10) {
        this.newLineEvent.setValues(i10);
        fireEvents(14, this.newLineListeners);
    }

    public void fireReportError(Exception exc) {
        this.messageEvent.setValues(MessageEvent.ERROR, exc.toString());
        fireEvents(8, this.messageListeners);
    }

    public void fireReportWarning(String str) {
        this.messageEvent.setValues(MessageEvent.WARNING, str);
        fireEvents(9, this.messageListeners);
    }

    public boolean fireSemanticPredicateEvaluated(int i10, int i11, boolean z10, int i12) {
        this.semPredEvent.setValues(i10, i11, z10, i12);
        fireEvents(10, this.semPredListeners);
        return z10;
    }

    public void fireSyntacticPredicateFailed(int i10) {
        this.synPredEvent.setValues(0, i10);
        fireEvents(11, this.synPredListeners);
    }

    public void fireSyntacticPredicateStarted(int i10) {
        this.synPredEvent.setValues(0, i10);
        fireEvents(12, this.synPredListeners);
    }

    public void fireSyntacticPredicateSucceeded(int i10) {
        this.synPredEvent.setValues(0, i10);
        fireEvents(13, this.synPredListeners);
    }

    protected void refresh(Vector vector) {
        Vector vector2;
        synchronized (vector) {
            vector2 = (Vector) vector.clone();
        }
        if (vector2 != null) {
            for (int i10 = 0; i10 < vector2.size(); i10++) {
                ((ListenerBase) vector2.elementAt(i10)).refresh();
            }
        }
    }

    public void refreshListeners() {
        refresh(this.matchListeners);
        refresh(this.messageListeners);
        refresh(this.tokenListeners);
        refresh(this.traceListeners);
        refresh(this.semPredListeners);
        refresh(this.synPredListeners);
    }

    public void removeDoneListener(ListenerBase listenerBase) {
        int i10;
        Hashtable hashtable = this.doneListeners;
        if (hashtable == null) {
            return;
        }
        Integer num = (Integer) hashtable.get(listenerBase);
        if (num != null) {
            i10 = num.intValue() - 1;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.doneListeners.remove(listenerBase);
        } else {
            this.doneListeners.put(listenerBase, new Integer(i10));
        }
    }

    public void removeMessageListener(MessageListener messageListener) {
        Vector vector = this.messageListeners;
        if (vector != null) {
            vector.removeElement(messageListener);
        }
        removeDoneListener(messageListener);
    }

    public void removeNewLineListener(NewLineListener newLineListener) {
        Vector vector = this.newLineListeners;
        if (vector != null) {
            vector.removeElement(newLineListener);
        }
        removeDoneListener(newLineListener);
    }

    public void removeParserListener(ParserListener parserListener) {
        removeParserMatchListener(parserListener);
        removeMessageListener(parserListener);
        removeParserTokenListener(parserListener);
        removeTraceListener(parserListener);
        removeSemanticPredicateListener(parserListener);
        removeSyntacticPredicateListener(parserListener);
    }

    public void removeParserMatchListener(ParserMatchListener parserMatchListener) {
        Vector vector = this.matchListeners;
        if (vector != null) {
            vector.removeElement(parserMatchListener);
        }
        removeDoneListener(parserMatchListener);
    }

    public void removeParserTokenListener(ParserTokenListener parserTokenListener) {
        Vector vector = this.tokenListeners;
        if (vector != null) {
            vector.removeElement(parserTokenListener);
        }
        removeDoneListener(parserTokenListener);
    }

    public void removeSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        Vector vector = this.semPredListeners;
        if (vector != null) {
            vector.removeElement(semanticPredicateListener);
        }
        removeDoneListener(semanticPredicateListener);
    }

    public void removeSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        Vector vector = this.synPredListeners;
        if (vector != null) {
            vector.removeElement(syntacticPredicateListener);
        }
        removeDoneListener(syntacticPredicateListener);
    }

    public void removeTraceListener(TraceListener traceListener) {
        Vector vector = this.traceListeners;
        if (vector != null) {
            vector.removeElement(traceListener);
        }
        removeDoneListener(traceListener);
    }

    public void fireMatch(char c10, BitSet bitSet, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR_BITSET, c10, bitSet, null, i10, false, true);
        fireEvents(4, this.matchListeners);
    }

    public void fireMatchNot(int i10, int i11, String str, int i12) {
        this.matchEvent.setValues(ParserMatchEvent.TOKEN, i10, new Integer(i11), str, i12, true, true);
        fireEvents(5, this.matchListeners);
    }

    public void fireMismatch(char c10, BitSet bitSet, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR_BITSET, c10, bitSet, null, i10, false, true);
        fireEvents(6, this.matchListeners);
    }

    public void fireMismatchNot(int i10, int i11, String str, int i12) {
        this.matchEvent.setValues(ParserMatchEvent.TOKEN, i10, new Integer(i11), str, i12, true, true);
        fireEvents(7, this.matchListeners);
    }

    public void fireReportError(String str) {
        this.messageEvent.setValues(MessageEvent.ERROR, str);
        fireEvents(8, this.messageListeners);
    }

    public void fireMatch(char c10, String str, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR_RANGE, c10, str, null, i10, false, true);
        fireEvents(4, this.matchListeners);
    }

    public void fireMismatch(char c10, String str, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.CHAR_RANGE, c10, str, null, i10, false, true);
        fireEvents(6, this.matchListeners);
    }

    public void fireMatch(int i10, BitSet bitSet, String str, int i11) {
        this.matchEvent.setValues(ParserMatchEvent.BITSET, i10, bitSet, str, i11, false, true);
        fireEvents(4, this.matchListeners);
    }

    public void fireMismatch(int i10, int i11, String str, int i12) {
        this.matchEvent.setValues(ParserMatchEvent.TOKEN, i10, new Integer(i11), str, i12, false, false);
        fireEvents(6, this.matchListeners);
    }

    public void fireMatch(int i10, String str, int i11) {
        this.matchEvent.setValues(ParserMatchEvent.TOKEN, i10, new Integer(i10), str, i11, false, true);
        fireEvents(4, this.matchListeners);
    }

    public void fireMismatch(int i10, BitSet bitSet, String str, int i11) {
        this.matchEvent.setValues(ParserMatchEvent.BITSET, i10, bitSet, str, i11, false, true);
        fireEvents(6, this.matchListeners);
    }

    public void fireMatch(String str, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.STRING, 0, str, null, i10, false, true);
        fireEvents(4, this.matchListeners);
    }

    public void fireMismatch(String str, String str2, int i10) {
        this.matchEvent.setValues(ParserMatchEvent.STRING, 0, str2, str, i10, false, true);
        fireEvents(6, this.matchListeners);
    }
}
