import java.util.Arrays;

public class ArrayOperations {

    //Vamos a unir varios metodo que trabajan con arrays en una sola clase.


    //Metodo para imprimir el Array en formato [1,2,3,4,5....]
    public static void print(int[] aImprimir) {
        System.out.print("[");
        for (int i = 0; i < aImprimir.length; i++) {
            if (i < aImprimir.length - 1) {
                System.out.print(aImprimir[i] + ",");
            } else {
                System.out.print(aImprimir[i]);
            }
        }
        System.out.println("]");
    }

    //Metodo para imprimir en pantalla un Array girado. Hay que cambiar el metodo de impresión o la salida con al array interior
    public static void reverse(int[] array) {
        int[] girado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            girado[i] = array[array.length - i - 1];
        }
        // imprimirArray(girado);
    }

    //Metodo para sacar el número mas alto o MAX de un Array
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Metodo para devolver el numero mas bajo o MIN.
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Metodo para la suma de todos los campos del Array Int
    public static int sum(int[] array) {
        int suma = 0;
        for (double i : array) {
            suma += i;
        }
        return suma;
    }

    //Metodo para que compare si dos arrays tiene los mismos valores.
    public static boolean equals(int[] array, int[] array2){
    boolean compare = false;
    if(array.length==array2.length) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array2[i]) {
                compare = true;
            } else {
                compare = false;
                break;
            }
        }
    }
        return compare;
}

// Metodo para comparar si dos arrays tienen los mismos valores pero en distribución diferente.
                public static boolean equalsWithoutOrder(int[] array, int[] array2) {
                    int comparador;
                    boolean comparaFinal = true;

                    boolean[] arrayCompara = new boolean[array.length + array2.length];

                    // Este compara el primer array con el segundo array
                    for (int i = 0; i < array.length; i++) {
                        comparador = array[i];
                        for (int j = 0; j < array2.length; j++) {
                            if (comparador == array2[j]) {
                                arrayCompara[i] = true;
                                break;
                            }
                        }
                    }
                    //Este compara el segundo array con el primero.
                    for (int i = 0; i < array2.length; i++) {
                        comparador = array2[i];
                        for (int j = 0; j < array.length; j++) {
                            if (comparador == array[j]) {arrayCompara[i + array.length] = true;
                                break;
                            }
                        }
                    }

                    //Esto ya es la comparativa final del arrayCompara para ver si hay algun campo falso.
                    for (boolean c : arrayCompara) {
                        if (c == false) {
                            comparaFinal = false;
                            break;
                        }

                    }
                    return comparaFinal;
                }

// Metodo para confirmar si los valores de un array, independientemente de su tamaño, estan dentro de los valores de otro array

    public static boolean isArrayOn(int[] src, int [] dst) {
        boolean[] arrayCompara=new boolean[src.length];
        int comparador=0;
        boolean comparaFinal=true;

        for (int i=0; i< src.length;i++){
            comparador=src[i];
            for (int j=0; j< dst.length;j++){
                if (comparador==dst[j]){
                    arrayCompara[i]=true;
                }
            }
        }
        for (boolean c : arrayCompara) {
            if (c==false){
                comparaFinal=false;
                break;
            }
        }
        return comparaFinal;
    }

    //Metodo para devolver un Array ordenado...
    public static void sort(int[] array){
        Arrays.sort(array);
    }

    //Metodo para que copie un Array en otro

    public static void copy(int[] src, int[]dst){
        for (int i=0; i< src.length;i++){
            dst[i]=src[i];
        }
        reverse(dst);
    }

// Metodo para quitar los numeros impares y dar valor 0 en su posicion

    public static void removeOddNumbers(int[] array){
        int[] cambiado = new int[array.length];
        for (int i=0; i< array.length;i++){
            if (array[i]%2==0){
                cambiado[i]=array[i];
            }else{
                cambiado[i]=0;        }
        }
        print(cambiado);
    }

    // Metodo para imprimir un rango de campos dentro de un Array

    public static void printRange(int[] array, int start, int end){
int[] interno=new int[end-start+1];
        int j=0;
        for (int i=start-1 ; i<= end-1;i++){
            interno[j]=array[i];
            j++;
        }
        print(interno);
    }

    //Metodo para borrar los valores de un solo digito.

    public static int[] deleteOneDigitNumbers(int[] array) {
        int contados = 0;
        int coordenada = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] / 10 == 0) {
                contados++;
            }
        }
        int[] nuevoArray = new int[array.length - contados];


        for (int i = 0; i < array.length; i++) {
            if (array[i] / 10 != 0) {
                nuevoArray[coordenada] = array[i];
                coordenada++;
            }
        }
        return nuevoArray;
    }


    //class
}
