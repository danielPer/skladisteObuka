package hr.iii.skladiste.model.am;

import oracle.jbo.Session;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 20 10:12:39 BST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleAMImpl() {
    }

    /**
     * Container's getter for TIzdatniceZag1.
     * @return TIzdatniceZag1
     */
    public ViewObjectImpl getTIzdatniceZag1() {
        return (ViewObjectImpl) findViewObject("TIzdatniceZag1");
    }

    /**
     * Container's getter for TIzdatniceSta1.
     * @return TIzdatniceSta1
     */
    public ViewObjectImpl getTIzdatniceSta1() {
        return (ViewObjectImpl) findViewObject("TIzdatniceSta1");
    }

    /**
     * Container's getter for TPrimkeZag1.
     * @return TPrimkeZag1
     */
    public ViewObjectImpl getTPrimkeZag1() {
        return (ViewObjectImpl) findViewObject("TPrimkeZag1");
    }

    /**
     * Container's getter for TPrimkeSta1.
     * @return TPrimkeSta1
     */
    public ViewObjectImpl getTPrimkeSta1() {
        return (ViewObjectImpl) findViewObject("TPrimkeSta1");
    }

    /**
     * Container's getter for IzdstaIzdzagfkLink1.
     * @return IzdstaIzdzagfkLink1
     */
    public ViewLinkImpl getIzdstaIzdzagfkLink1() {
        return (ViewLinkImpl) findViewLink("IzdstaIzdzagfkLink1");
    }

    /**
     * Container's getter for PristaPrizagfkLink1.
     * @return PristaPrizagfkLink1
     */
    public ViewLinkImpl getPristaPrizagfkLink1() {
        return (ViewLinkImpl) findViewLink("PristaPrizagfkLink1");
    }

    @Override
    protected void create() {
        // TODO Implement this method
        super.create();
        
        if(isRoot()){
            System.out.println("--------------------");
            System.out.println("-- main AM je kreiran kao root-------- ");
            System.out.println("---- ------- ---------- -");
        } else {
            System.out.println("--------------------");
            System.out.println("-- main AM je kreiran kao nested-------- ");
            System.out.println("---- ------- ---------- -");
        }
    }

    @Override
    protected void prepareSession(Session session) {
        // TODO Implement this method
        super.prepareSession(session);
        if (isRoot()){
            System.out.println("##################");
            System.out.println("## main AM sesija je pozvana kao root ######");
            System.out.println("########## ########## ########");
        } else {
            System.out.println("##################");
            System.out.println("## main AM sesija je pozvana kao nested ######");
            System.out.println("########## ########## ########");
        }
    }
}

