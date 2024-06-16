public class matrizNumerosInteiros {
    public static void main(String[] args) {
        
        int[][] inteiros ={

            {19, 25, 100, 99},
            {10, 7 ,25, 14},
            {35, 2, 47, 74}
            
        };

        for (int i = 0; i < inteiros.length; i++ ) {
            for (int j = 0; j < inteiros[i].length; j++) {
                System.out.print(inteiros[i][j] +  " ");
            }
            System.out.println();
        }
         
    }
}
