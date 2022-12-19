import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrayClase {

    /*
    Crea un programa que declare un array de 10 elementos.
    Vamos a leer por teclado 9 enteros
    Despues de le pide al usuario un nuevo entero y
    la posicion donde se almacenará en el array,
    desplazar los que están detras.
    [1,2,3,4,5,6,7,8,9,0]
    10 en posicion 1
    [10,1,2,3,4,5,6,7,8,9]
     */



    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        int contador9;
        int ultimoValor;
        int posicion;
        int cambiaEntrada;
        int cambiaSalida;

        System.out.println("Introduce nueve valores enteros:");

        for (int i=0;i<array.length-1;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Dime un valor entero y en que posición de Array lo quieres:");
        System.out.println("Valor:");
        ultimoValor= sc.nextInt();
        System.out.println("Posición:");
        posicion= sc.nextInt();

        for (int i=array.length-1;i>posicion-1;i--){
            array[i] = array[i-1];

        }
        array[posicion-1]=ultimoValor;

// INTERESANTE OPCION PARA IMPRIMIR EL ARRAY!!!

        System.out.println(Arrays.toString(array));
    }






    //class
}
