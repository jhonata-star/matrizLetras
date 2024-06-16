public class matrizIntSystem {
    public static void main(String[] args)  {
        int[][] Matriz = {
           
            {12, 34, 67, 98, 55},
            {35, 56, 65, 89, 66},
            {43, 76, 87, 99, 10}

        };

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++){
                System.out.print(Matriz[i][j] + " ");
            }
          System.out.println();
        }
         System.out.println();
         System.out.println("A matriz não possui elementos repetidos");
         System.out.println();
         System.out.println("Abaixo temos um total de 7 números pares da matriz : ");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if ( Matriz[i][j] % 2 == 0) {
                    System.out.print(Matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Abaixo temos um total de 8 números impar na matriz : ");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j <Matriz[i].length; j++) {
                if (Matriz[i][j] % 2 != 0) {
                    System.out.print(Matriz[i][j] + " "); 
                }
            }
        }
   }
}
