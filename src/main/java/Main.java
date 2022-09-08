import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        int opcion = 0, nodo = 0;
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

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        if (!pila.pilaVacia()){
                            pila.vaciasPila();
                            System.out.println("Se vació la pila");
                        }else
                            System.out.println("La pila esta vacia");
                        break;
                    case 7:
                        pila.mostrarValores();
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
