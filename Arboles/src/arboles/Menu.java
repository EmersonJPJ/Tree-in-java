package arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author EMERSON
 */
public class Menu {

    Arbol a = new Arbol();

    public void mostrarMenu() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n"
                + "1-Agregar nodo\n"
                + "2-Mostar nodo\n"
                + "3-PreOrden\n"
                + "4-InOrden\n"
                + "5-PostOrden\n"
                + "6-Numero menor\n"
                + "7-Imprime hojas\n"
                + "8-Imprime nivel\n"
                + "9-Obtener altura\n"
                + "10-Contar nodos\n"
                + "11-Imprimir la rama mas larga\n"
                + "12-Salir\n"));
        switch (op) {
            case 1:
                a.crearRaiz();
                mostrarMenu();
                break;
            case 2:
                a.mostrarRaiz();
                mostrarMenu();
                break;
            case 3:
                a.preorden();
                mostrarMenu();
                break;
            case 4:
                a.inorden();
                mostrarMenu();
                break;
            case 5:
                a.postorden();
                mostrarMenu();
                break;
            case 6:
                a.buscarMenor();
                mostrarMenu();
                break;
            case 7:
                a.imprimeHojas();
                mostrarMenu();
                break;
            case 8:
                a.imprimeNivel();
                mostrarMenu();
                break;
            case 9:
                a.getAltura();
                mostrarMenu();
                break;
            case 10:
                a.contarNodos();
                mostrarMenu();
                break;
            case 11:
                a.imprimeRamaLarga();
                mostrarMenu();
                break;
            case 12:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Error! Opción Invalida");
                mostrarMenu();
        }
    }
}
