import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

int[] array={-2, 45, -29, 77, 56, 31};
int[] copyarray= new  int[6];
    int[] pelos={1,22,332,434,11212,123242,1231231};
    int[] menosPelos={1,22,332,434};
    int[] mismosPelos={1,22,332,434,11212,123242,1231231};
    int[] pelosMovidos={1231231,1,22,332,11212,123242,434};

   /* ArrayOperations.print(pelos);
        System.out.println(ArrayOperations.max(pelos));
        System.out.println(ArrayOperations.min(pelos));
        System.out.println(ArrayOperations.sum(pelos));
        System.out.println(ArrayOperations.equals(pelos,menosPelos));
        System.out.println(ArrayOperations.equals(pelos,mismosPelos));
        System.out.println(ArrayOperations.equalsWithoutOrder(pelos, pelosMovidos));
        System.out.println("7"+ArrayOperations.equalsWithoutOrder(pelos,menosPelos));
        System.out.println("8"+ArrayOperations.isArrayOn(menosPelos,pelos));
        ArrayOperations.sort(pelosMovidos);
        ArrayOperations.print(pelosMovidos);
        ArrayOperations.removeOddNumbers(pelos);
        ArrayOperations.printRange(pelos,6,7);

        System.out.println(ArrayOperations.max(array));

        ArrayOperations.copy(array,copyarray);
        ArrayOperations.print(copyarray);

        ArrayOperations.print(ArrayOperations.deleteOneDigitNumbers(array));


        ArrayOperations.sum(array);

*/
        MesCollector Enero = new MesCollector(1,2022);
        MesCollector Diciembre = new MesCollector(12,2022);


        ArrayOperations.print(Enero.getCuantosDiasMes());
        System.out.println(Enero.getAnyo());
        Enero.setTemperatura(10,25);
        Enero.setTemperatura(31,25);
        Enero.setTemperatura(1,25);
        Enero.setTemperatura(30,25);
        Enero.setTemperatura(-4,25);
        Enero.setTemperatura(32,25);
        Enero.setTemperatura(11,40);
        Enero.setTemperatura(9,-4);
        System.out.println(Enero.getTemperatura(10));
        ArrayOperations.print(Enero.getCuantosDiasMes());

/*
        Scanner sc = new Scanner( System.in);
        MesCollector enero = new MesCollector( 1, 2021);
        String respuesta = "Y";
        while (respuesta.toUpperCase().charAt(0) == 'Y') {
            System.out.print("Inserta día ");
            int dia = sc.nextInt();
            System.out.print("Inserta temperatura ");
            int temperatura = sc.nextInt();
            if (enero.getTemperatura(dia) == -1){
                System.out.println(" error de entrada ");
            } else {
                enero.setTemperatura(dia, temperatura );
            }
            System.out.print("Continuar (Y/N)? ");
            respuesta = sc.next();
        }
        System.out.println(enero);

*/




    //main
    }

    //class
}
