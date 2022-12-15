import java.lang.reflect.Array;

public class RevertirArray {
    public static void main(String[] args) {
        int[] prueba = {5,4,3,2,1};
        reverse(prueba);
        //main
    }
public static void reverse(int[] array){
        int[] girado = new int[array.length];
        for (int i=0;i< array.length;i++){
            girado[i]=array[array.length-i-1];
        }
        imprimirArray(girado);
}
    public static void imprimirArray(int[] aImprimir){
        for (int i = 0; i < aImprimir.length; i++) {
            System.out.println("Elemento en posición " + i + " valor " + aImprimir[i]);
        }
    }





    //class
}
