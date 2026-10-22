package antlr.debug.misc;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;

/* loaded from: classes.dex */
public class JTreeASTPanel extends JPanel {
    JTree tree;

    public JTreeASTPanel(TreeModel treeModel, TreeSelectionListener treeSelectionListener) {
        setLayout(new BorderLayout());
        JTree jTree = new JTree(treeModel);
        this.tree = jTree;
        jTree.putClientProperty("JTree.lineStyle", "Angled");
        if (treeSelectionListener != null) {
            this.tree.addTreeSelectionListener(treeSelectionListener);
        }
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.getViewport().add(this.tree);
        add(jScrollPane, "Center");
    }
}
