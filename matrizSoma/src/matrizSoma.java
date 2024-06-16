public class matrizSoma {
    public static void main(String[] args)  {
       
        int[][] somarMatriz = {
           {12, 56, 57, 235, 456},
           {45, 567, 55, 98, 87},
           {78, 1, 21, 33, 546},
           {31, 40, 43, 59, 91},
           {79, 88, 432, 54, 80}
        };

        for (int i = 0; i < somarMatriz.length; i++) {
            for (int j = 0; j < somarMatriz[i].length; j++) {
                System.out.print(somarMatriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int impares = 57 + 235 + 45 + 567 + 79 + 55 + 87 + 1 + 21 + 33 + 31 + 43 + 59 + 91 + 79; 
        System.out.println("Soma dos numeros impares da matriz : " + impares);
    
        int coluna1 = 12 + 45 + 78 + 31 + 79;
        int coluna2 = 56 + 567 + 1 + 40 + 88;
        int coluna3 = 57 + 55 + 21 + 43 + 432;
        int coluna4 = 235 + 98 + 33 + 59 + 54;
        int coluna5 = 456 + 87 + 546 + 91 + 80;
        System.out.println();
        System.out.println("logo abaixo a soma de cada uma das colunas da matriz : " );
        System.out.println();
        System.out.print("primeira coluna : " + coluna1 + ", segunda coluna : " + coluna2 + ", terceira coluna : " + coluna3 + ", quarta coluna : " + coluna4 + ", quinta coluna : " + coluna5 );
        System.out.println();
        int linha1 = 12 + 56 + 57 + 235 + 456;
        int linha2 = 45 + 567 + 55 + 98 + 87;
        int linha3 = 78 + 1 + 21 + 33 + 546;
        int linha4 = 31 + 40 + 43 + 59 + 91;
        int linha5 = 79 + 88 + 432 + 54 + 80;
        System.out.println();
        System.out.println("logo abaixo a soma de cada uma das linhas da matriz : " );
        System.out.println();
        System.out.print("primeira linha : " + linha1 + ", segunda linha : " + linha2 + ", terceira linha : " + linha3 + ", quarta linha : " + linha4 + ", quinta linha : " + linha5 );
    }
}
