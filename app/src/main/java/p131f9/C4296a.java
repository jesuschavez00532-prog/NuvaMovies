package p131f9;

import android.util.Log;
import com.module.bean.Album;
import com.module.bean.Link;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.xutils.BuildConfig;
import org.xutils.C6127x;
import org.xutils.DbManager;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p275ex.DbException;
import p153h2.AbstractC4509b;

/* renamed from: f9.a */
/* loaded from: classes2.dex */
public class C4296a {

    /* renamed from: b */
    int f18618b = 200;

    /* renamed from: a */
    private DbManager f18617a = C6127x.getDb(new DbManager.DaoConfig().setDbName("user_vod.db").setDbVersion(3).setDbUpgradeListener(new a()));

    /* renamed from: f9.a$a */
    /* loaded from: classes2.dex */
    class a implements DbManager.DbUpgradeListener {
        a() {
        }

        @Override // org.xutils.DbManager.DbUpgradeListener
        public void onUpgrade(DbManager dbManager, int i10, int i11) {
            if (BuildConfig.DEBUG) {
                AbstractC4509b.m18868a("VodDao", "dbUpgrade,old:" + i10 + ";" + i11);
            }
            if (i10 < 2) {
                try {
                    dbManager.addColumn(Album.class, "contentType");
                } catch (DbException e10) {
                    e10.printStackTrace();
                }
            }
            if (i10 < 3) {
                try {
                    dbManager.addColumn(Album.class, "subLanguageSwitch");
                    dbManager.addColumn(Album.class, "subLanguage");
                    dbManager.addColumn(Album.class, "subIndex");
                    dbManager.addColumn(Album.class, "subSize");
                    dbManager.addColumn(Album.class, "subStyle");
                    dbManager.addColumn(Album.class, "realAudio");
                } catch (DbException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void m17970a(Album album) {
        try {
            this.f18617a.saveOrUpdate(album);
            long count = this.f18617a.selector(Album.class).count();
            if (count > this.f18618b) {
                Iterator it = this.f18617a.selector(Album.class).orderBy("createTime", true).limit((int) (count - this.f18618b)).findAll().iterator();
                while (it.hasNext()) {
                    this.f18617a.delete((Album) it.next());
                }
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m17971b(Link link) {
        try {
            this.f18617a.saveOrUpdate(link);
            long count = this.f18617a.selector(Link.class).count();
            if (count > this.f18618b) {
                Iterator it = this.f18617a.selector(Link.class).orderBy("createTime", true).limit((int) (count - this.f18618b)).findAll().iterator();
                while (it.hasNext()) {
                    this.f18617a.delete((Link) it.next());
                }
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m17972c(String str, String str2) {
        try {
            if (new File(str).exists()) {
                FileInputStream fileInputStream = new FileInputStream(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                byte[] bArr = new byte[1444];
                int i10 = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        i10 += read;
                        fileOutputStream.write(bArr, 0, read);
                        if (BuildConfig.DEBUG) {
                            Log.d("VodDao", str + i10);
                        }
                        Log.d("VodDao", "copy file successful");
                    } else {
                        fileInputStream.close();
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            if (BuildConfig.DEBUG) {
                Log.d("VodDao", "copy file error");
            }
            e10.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m17973d(String str) {
        try {
            File file = new File(str);
            if (file.delete()) {
                if (BuildConfig.DEBUG) {
                    Log.d("VodDao", file.getName() + " 文件已被删除！");
                }
            } else if (BuildConfig.DEBUG) {
                Log.d("VodDao", "文件删除失败！");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m17974e() {
        try {
            try {
                this.f18617a.delete(Album.class);
            } catch (DbException e10) {
                e10.printStackTrace();
            }
        } finally {
            m17976g();
        }
    }

    /* renamed from: f */
    public void m17975f(int i10) {
        try {
            this.f18617a.delete(Album.class, WhereBuilder.m24391b("typeId", Operator.Operation.EQUALS, Integer.valueOf(i10)));
            if (i10 == 2) {
                m17976g();
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m17976g() {
        try {
            this.f18617a.delete(Link.class);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m17977h(int i10, String str) {
        try {
            this.f18617a.delete(Album.class, WhereBuilder.m24391b("typeId", Operator.Operation.EQUALS, Integer.valueOf(i10)).and("contentId", Operator.Operation.EQUALS, str));
            if (i10 == 2) {
                m17979j(str);
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m17978i(int i10, List list) {
        try {
            WhereBuilder m24391b = WhereBuilder.m24391b("typeId", Operator.Operation.EQUALS, Integer.valueOf(i10));
            WhereBuilder m24390b = WhereBuilder.m24390b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m24390b.m24392or("contentId", Operator.Operation.EQUALS, (String) it.next());
            }
            m24391b.and(m24390b);
            this.f18617a.delete(Album.class, m24391b);
            if (i10 == 2) {
                m17980k(list);
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m17979j(String str) {
        try {
            this.f18617a.delete(Link.class, WhereBuilder.m24391b("albumId", Operator.Operation.EQUALS, str));
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m17980k(List list) {
        try {
            WhereBuilder m24390b = WhereBuilder.m24390b();
            WhereBuilder m24390b2 = WhereBuilder.m24390b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m24390b2.m24392or("albumId", Operator.Operation.EQUALS, (String) it.next());
            }
            m24390b.and(m24390b2);
            this.f18617a.delete(Link.class, m24390b);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: l */
    public List m17981l(int i10) {
        try {
            return this.f18617a.selector(Album.class).where("typeId", "in", new String[]{i10 + ""}).orderBy(AgooConstants.MESSAGE_TIME, true).findAll();
        } catch (DbException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public Album m17982m(String str, int i10) {
        try {
            return (Album) this.f18617a.selector(Album.class).where("typeId", "in", new String[]{i10 + ""}).and("contentId", "in", new String[]{str}).findFirst();
        } catch (DbException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public Link m17983n(String str) {
        try {
            return (Link) this.f18617a.selector(Link.class).where("contentId", "in", new String[]{str}).findFirst();
        } catch (DbException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
