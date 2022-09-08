import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        do{
            try {
                System.out.println("\tMenú de opciones \n\n" +
                        "1) Insertar un nodo\n"
                        + "2) Eliminar un nodo\n"
                        + "3) ¿La pila está vacía?\n"
                        + "4) Ultimo valor\n"
                        + "5) Tamaño\n"
                        + "6) Vaciar\n"
                        + "7) Mostrar contenido de la Pila\n"
                        + "0) Salir\n");
                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Inserta el valor a guardar: ");
                        pila.insertarNodo(sc.nextInt());
                        break;
                    case 2:
                        if (!pila.pilaVacia()){
                            System.out.println("Se ha eliminado un nodo con el valor: " + pila.eliminarNodo());
                        }else
                            System.out.println("La pila esta vacia");
                        break;
                    case 3:
                        if (!pila.pilaVacia()){
                            System.out.println("La pila SÏ esta vacia");
                        }else
                            System.out.println("La pila NO esta vacia");
                        break;
                    case 4:
                        if (!pila.pilaVacia()){
                            System.out.println("El ultimo valor ingresado en la pila es: " + pila.mostrarUltimoValorIngresado());
                        }else
                            System.out.println("La pila esta vacia");
                        break;
                    case 5:
                        if (!pila.pilaVacia()) {
                            if (pila.tamanoPila() != 1)
                                System.out.println("La pila contiene " + pila.tamanoPila() + " nodos");
                            else
                                System.out.println("La pila contiene " + pila.tamanoPila() + " nodo");
                        }else
                            System.out.println("La pila esta vacia");
                        break;
                    case 6:
                        if (!pila.pilaVacia()){
                            pila.vaciasPila();
                            System.out.println("Se vació la pila");
                        }else
                            System.out.println("La pila esta vacia");
                        break;
                    case 7:
                        if (!pila.pilaVacia())
                            pila.mostrarValores();
                        else
                            System.out.println("La pila esta vacia");
                        break;
                    case 0:
                        System.out.println("Gracias por usar el programa");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }catch (NumberFormatException e){

            }
        }while (opcion != 0);
    }
}
