package hr.iii.skladiste.Am;

import oracle.jbo.Session;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 20 10:24:26 BST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SharedLovsAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public SharedLovsAMImpl() {
    }

    /**
     * Container's getter for MArtikli1.
     * @return MArtikli1
     */
    public ViewObjectImpl getMArtikli1() {
        return (ViewObjectImpl) findViewObject("MArtikli1");
    }

    /**
     * Container's getter for MDobavljaci1.
     * @return MDobavljaci1
     */
    public ViewObjectImpl getMDobavljaci1() {
        return (ViewObjectImpl) findViewObject("MDobavljaci1");
    }

    /**
     * Container's getter for MMt1.
     * @return MMt1
     */
    public ViewObjectImpl getMMt1() {
        return (ViewObjectImpl) findViewObject("MMt1");
    }

    /**
     * Container's getter for MSkladista1.
     * @return MSkladista1
     */
    public ViewObjectImpl getMSkladista1() {
        return (ViewObjectImpl) findViewObject("MSkladista1");
    }

    /**
     * Container's getter for Potvrdeno1.
     * @return Potvrdeno1
     */
    public ViewObjectImpl getPotvrdeno1() {
        return (ViewObjectImpl) findViewObject("Potvrdeno1");
    }

    @Override
    protected void create() {
        // TODO Implement this method
        super.create();
        if(isRoot()){
            System.out.println("--------------------");
            System.out.println("-- shared AM je kreiran kao root-------- ");
            System.out.println("---- ------- ---------- -");
        } else {
            System.out.println("--------------------");
            System.out.println("-- shared AM je kreiran kao nested-------- ");
            System.out.println("---- ------- ---------- -");
        }
    }

    @Override
    protected void prepareSession(Session session) {
        // TODO Implement this method
        super.prepareSession(session);
        if (isRoot()){
            System.out.println("##################");
            System.out.println("## shared AM sesija je pozvana kao root ######");
            System.out.println("########## ########## ########");
        } else {
            System.out.println("##################");
            System.out.println("## shared AM sesija je pozvana kao nested ######");
            System.out.println("########## ########## ########");
        }
    }
}

