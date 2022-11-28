package arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author EMERSON
 */
public class Arbol {

    private Nodo raiz;
    int cantidad;
    int altura;
    int contar;
    String[] nivel;

    public Arbol() {
        this.raiz = null;
    }

    public boolean vacio() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void crearNodo(Nodo raiz, Nodo nuevo) {
        if (nuevo.getElemento().getNumero() <= raiz.getElemento().getNumero()) {
            if (raiz.getHijoIzq() == null) {
                raiz.setHijoIzq(nuevo);
            } else {
                crearNodo(raiz.getHijoIzq(), nuevo);
            }
        } else {
            if (raiz.getHijoDer() == null) {
                raiz.setHijoDer(nuevo);
            } else {
                crearNodo(raiz.getHijoDer(), nuevo);
            }
        }
    }

    public void crearRaiz() {
        Dato d = new Dato();
        d.setNumero(Integer.parseInt(
                JOptionPane.showInputDialog("Digite un número: ")));
        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);
        if (vacio()) {
            raiz = nuevo;
        } else {
            crearNodo(raiz, nuevo);
        }
    }

    public void mostrarNodo(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getHijoIzq());
            System.out.print(n.getElemento().getNumero() + " ");
            mostrarNodo(n.getHijoDer());
        }
    }

    public void mostrarRaiz() {
        if (!vacio()) {
            mostrarNodo(raiz);
        } else {
            System.out.println("No se puede mostrar, árbol vacío");
        }
        System.out.println("");
    }

    private void preorden(Nodo n) {
        if (n != null) {
            System.out.print(n.getElemento().getNumero() + " ");
            mostrarNodo(n.getHijoIzq());
            mostrarNodo(n.getHijoDer());
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    private void inorden(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getHijoIzq());
            System.out.print(n.getElemento().getNumero() + " ");
            mostrarNodo(n.getHijoDer());
        }
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    private void postorden(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getHijoIzq());
            mostrarNodo(n.getHijoDer());
            System.out.print(n.getElemento().getNumero() + " ");
        }
    }

    public void postorden() {
        this.postorden(this.raiz);
    }

    public int buscarMenor() {
        int menor = raiz.getElemento().getNumero();
        Nodo nodo = raiz;
        while (nodo.getHijoIzq() != null) {
            nodo = nodo.getHijoIzq();
            menor = nodo.getElemento().getNumero();
        }
        System.out.println("El numero del arbol es: " + menor);
        return menor;

    }

    private void imprimeHojas(Nodo n) {
        if (n != null) {
            if (n.getHijoIzq() == null && n.getHijoDer() == null) {
                cantidad++;
            }
            imprimeHojas(n.getHijoIzq());
            imprimeHojas(n.getHijoDer());

        }

    }

    public int imprimeHojas() {
        cantidad = 0;
        imprimeHojas(raiz);
        System.out.println("La cantidad de nodos sin hijos es de: " + cantidad);
        return cantidad;
    }

    public void imprimeNivel() {
        nivel = new String[altura + 1];

        imprimeNivel(raiz, 0);
        for (int i = 0; i < nivel.length; i++) {
            System.out.println(nivel[i] + " En el nivel: " + i);

        }
    }

    private void imprimeNivel(Nodo n, int nil) {
        if (n != null) {
            nivel[nil] = n.getElemento().getNumero() + " " + ((nivel[nil] != null) ? nivel[nil] : " ");
            imprimeNivel(n.getHijoDer(), nil + 1);
            imprimeNivel(n.getHijoIzq(), nil + 1);
        }
    }

    public int getAltura() {
        altura = 0;
        getAltura(raiz, 1);
        System.out.println("La altura del arbol en niveles es de: " + altura);
        return altura;

    }

    private void getAltura(Nodo n, int nivel) {
        if (n != null) {
            getAltura(n.getHijoIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;

            }
            getAltura(n.getHijoDer(), nivel + 1);
        }

    }

    private int contarNodos(Nodo n) {
        contar = 0;
        if (n != null) {
            contar = contarNodos(n.getHijoIzq()) + contarNodos(n.getHijoDer()) + 1;
        }
        return contar;
    }

    public int contarNodos() {
        contar = 0;
        contarNodos(raiz);
        System.out.println("El arbol tiene la cantidad de: " + contar + " nodos");
        return contar;
    }

    private void imprimeRamaLarga(Nodo n, int nil) {
        if (n != null) {
            nivel[nil] = n.getElemento().getNumero() + " " + ((nivel[nil] != null) ? nivel[nil] : " ");
        }
    }

    public void imprimeRamaLarga() {
        nivel = new String[altura + 1];

        imprimeNivel(raiz, 0);
        System.out.print("La rama mas larga es: ");
        for (int i = 0; i < nivel.length; i++) {
            System.out.print(nivel[i] + ",");
        }
    }

}
