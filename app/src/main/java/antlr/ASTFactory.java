package antlr;

import antlr.collections.AST;
import antlr.collections.impl.ASTArray;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class ASTFactory {
    static /* synthetic */ Class class$antlr$CommonAST;
    static /* synthetic */ Class class$antlr$Token;
    protected String theASTNodeType = null;
    protected Class theASTNodeTypeClass = null;
    protected Hashtable tokenTypeToASTClassMap = null;

    public ASTFactory() {
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    public void addASTChild(ASTPair aSTPair, AST ast) {
        if (ast != null) {
            AST ast2 = aSTPair.root;
            if (ast2 == null) {
                aSTPair.root = ast;
            } else {
                AST ast3 = aSTPair.child;
                if (ast3 == null) {
                    ast2.setFirstChild(ast);
                } else {
                    ast3.setNextSibling(ast);
                }
            }
            aSTPair.child = ast;
            aSTPair.advanceChildToEnd();
        }
    }

    public AST create() {
        return create(0);
    }

    protected AST createUsingCtor(Token token, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Class<?>[] clsArr = new Class[1];
            Class<?> cls2 = class$antlr$Token;
            if (cls2 == null) {
                cls2 = class$("antlr.Token");
                class$antlr$Token = cls2;
            }
            clsArr[0] = cls2;
            try {
                return (AST) cls.getConstructor(clsArr).newInstance(token);
            } catch (NoSuchMethodException unused) {
                AST create = create(cls);
                if (create != null) {
                    create.initialize(token);
                    return create;
                }
                return create;
            }
        } catch (Exception unused2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid class or can't make instance, ");
            stringBuffer.append(str);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public AST dup(AST ast) {
        if (ast == null) {
            return null;
        }
        AST create = create(ast.getClass());
        create.initialize(ast);
        return create;
    }

    public AST dupList(AST ast) {
        AST dupTree = dupTree(ast);
        AST ast2 = dupTree;
        while (ast != null) {
            ast = ast.getNextSibling();
            ast2.setNextSibling(dupTree(ast));
            ast2 = ast2.getNextSibling();
        }
        return dupTree;
    }

    public AST dupTree(AST ast) {
        AST dup = dup(ast);
        if (ast != null) {
            dup.setFirstChild(dupList(ast.getFirstChild()));
        }
        return dup;
    }

    public void error(String str) {
        System.err.println(str);
    }

    public Class getASTNodeType(int i10) {
        Class cls;
        Hashtable hashtable = this.tokenTypeToASTClassMap;
        if (hashtable != null && (cls = (Class) hashtable.get(new Integer(i10))) != null) {
            return cls;
        }
        Class cls2 = this.theASTNodeTypeClass;
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = class$antlr$CommonAST;
        if (cls3 == null) {
            Class class$ = class$("antlr.CommonAST");
            class$antlr$CommonAST = class$;
            return class$;
        }
        return cls3;
    }

    public Hashtable getTokenTypeToASTClassMap() {
        return this.tokenTypeToASTClassMap;
    }

    public AST make(AST[] astArr) {
        AST ast = null;
        if (astArr == null || astArr.length == 0) {
            return null;
        }
        AST ast2 = astArr[0];
        if (ast2 != null) {
            ast2.setFirstChild(null);
        }
        for (int i10 = 1; i10 < astArr.length; i10++) {
            AST ast3 = astArr[i10];
            if (ast3 != null) {
                if (ast2 == null) {
                    ast2 = ast3;
                } else if (ast == null) {
                    ast2.setFirstChild(ast3);
                    ast3 = ast2.getFirstChild();
                } else {
                    ast.setNextSibling(ast3);
                    ast3 = ast.getNextSibling();
                }
                while (ast3.getNextSibling() != null) {
                    ast3 = ast3.getNextSibling();
                }
                ast = ast3;
            }
        }
        return ast2;
    }

    public void makeASTRoot(ASTPair aSTPair, AST ast) {
        if (ast != null) {
            ast.addChild(aSTPair.root);
            aSTPair.child = aSTPair.root;
            aSTPair.advanceChildToEnd();
            aSTPair.root = ast;
        }
    }

    public void setASTNodeClass(String str) {
        this.theASTNodeType = str;
        try {
            this.theASTNodeTypeClass = Class.forName(str);
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't find/access AST Node type");
            stringBuffer.append(str);
            error(stringBuffer.toString());
        }
    }

    public void setASTNodeType(String str) {
        setASTNodeClass(str);
    }

    public void setTokenTypeASTNodeType(int i10, String str) {
        if (this.tokenTypeToASTClassMap == null) {
            this.tokenTypeToASTClassMap = new Hashtable();
        }
        if (str == null) {
            this.tokenTypeToASTClassMap.remove(new Integer(i10));
            return;
        }
        try {
            this.tokenTypeToASTClassMap.put(new Integer(i10), Class.forName(str));
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid class, ");
            stringBuffer.append(str);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public void setTokenTypeToASTClassMap(Hashtable hashtable) {
        this.tokenTypeToASTClassMap = hashtable;
    }

    public AST create(int i10) {
        AST create = create(getASTNodeType(i10));
        if (create != null) {
            create.initialize(i10, "");
        }
        return create;
    }

    public ASTFactory(Hashtable hashtable) {
        setTokenTypeToASTClassMap(hashtable);
    }

    public AST create(int i10, String str) {
        AST create = create(i10);
        if (create != null) {
            create.initialize(i10, str);
        }
        return create;
    }

    public AST create(int i10, String str, String str2) {
        AST create = create(str2);
        if (create != null) {
            create.initialize(i10, str);
        }
        return create;
    }

    public AST create(AST ast) {
        if (ast == null) {
            return null;
        }
        AST create = create(ast.getType());
        if (create != null) {
            create.initialize(ast);
        }
        return create;
    }

    public AST create(Token token) {
        AST create = create(token.getType());
        if (create != null) {
            create.initialize(token);
        }
        return create;
    }

    public AST make(ASTArray aSTArray) {
        return make(aSTArray.array);
    }

    public AST create(Token token, String str) {
        return createUsingCtor(token, str);
    }

    public AST create(String str) {
        try {
            return create(Class.forName(str));
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid class, ");
            stringBuffer.append(str);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    protected AST create(Class cls) {
        try {
            return (AST) cls.newInstance();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't create AST Node ");
            stringBuffer.append(cls.getName());
            error(stringBuffer.toString());
            return null;
        }
    }
}
