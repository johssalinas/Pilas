public class Pila {
    private Nodo ultimoValorIngresado;
    int tamano = 0;
    String lista = "";
    public Pila(){
        ultimoValorIngresado = null;
        tamano = 0;
    }
    public boolean pilaVacia(){
        return ultimoValorIngresado == null;
    }
    //Metodo para insertar un nodo en la pila
    public void insertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo (nodo);
        nuevo_nodo.siguente = ultimoValorIngresado;
        ultimoValorIngresado = nuevo_nodo;
        tamano++;
    }

    //Metodo para eliminar un nodo de la pila
    public int eliminarNodo(){
        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguente;
        tamano--;
        return auxiliar;
    }
    //Metodo para conocer cual es el ultimo valor ingresado
    public int mostrarUltimoValorIngresado(){
        return ultimoValorIngresado.informacion;
    }
    //Metodo para conocer el tamaño de la pila
    public int tamanoPila(){
        return tamano;
    }
    //Metodo para vaciar Pila
    public void vaciasPila(){
        while (!pilaVacia()){
            eliminarNodo();
        }
    }
    //Metodo para mostrar el contenido de la Pila
    public void mostrarValores(){
        Nodo recorrido = ultimoValorIngresado;
        while (recorrido != null){
            lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguente;
        }
        System.out.println(lista);
        lista = "";
    }
}
