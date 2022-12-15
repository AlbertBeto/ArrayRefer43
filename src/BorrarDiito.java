public class BorrarDiito {

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

}
