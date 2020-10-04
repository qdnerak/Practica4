/*Diseñar el algoritmo correspondiente a un programa, que:
        Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
        Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que
        delimitan la tabla, es decir, las más externas, mientras que el resto de los elementos contendrán el valor
        0.
        111111111111111
        100000000000001
        100000000000001
        100000000000001
        111111111111111
        Visualiza el contenido de la matriz en pantalla.*/
public class Ejercio12 {
    //definimos matriz
    int[][] marco;

    //metodo constructor
    public Ejercio12() {
        marco = new int[5][15];
    }

    //metodo ejecutar
    public void ejecutar() {
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0) {
                    marco[i][j] = 1;
                }
            }
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 4) {
                    marco[i][j] = 1;
                }
            }
            for (int j = 0; j < marco[i].length; j++) {
                if (j == 0) {
                    marco[i][j] = 1;
                }
            }
            for (int j = 0; j < marco[i].length; j++) {
                if (j == 14) {
                    marco[i][j] = 1;
                }
            }

        }
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}
