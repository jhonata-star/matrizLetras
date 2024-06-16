public class matrizabc {
    public static void main(String[] args)  {
        
        char[] alfabeto = {

           'a', 'b', 'c', 'd', 'e',
           'f', 'g', 'h', 'i', 'j',
           'l', 'm', 'n', 'o', 'p',
           'q', 'r', 's', 't', 'u'

        };

         int linhas = 4;
         int colunas = 5;
        for (int i =0;i < linhas; i++) {
           for (int j = 0; j < colunas; j++) {
            System.out.print(alfabeto[i * colunas + j] + " ");
           }
           System.out.println();
        }
    }
}
