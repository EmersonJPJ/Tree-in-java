package arboles;

/**
 *
 * @author EMERSON
 */
public class Nodo {

    private Dato elemento;
    private Nodo hijoIzq;
    private Nodo hijoDer;

    public Nodo() {
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    /**
     * @return the elemento
     */
    public Dato getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the hijoIzq
     */
    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    /**
     * @param hijoIzq the hijoIzq to set
     */
    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    /**
     * @return the hijoDer
     */
    public Nodo getHijoDer() {
        return hijoDer;
    }

    /**
     * @param hijoDer the hijoDer to set
     */
    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }

}
