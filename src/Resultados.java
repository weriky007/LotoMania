public class Resultados {
//----------------------------------------------------------------------------------------------------------------------
     int[] resultadoAtual = {2, 3, 5, 6, 7, 9, 10, 11, 14, 15, 16, 17, 18, 20, 21};
     int[] resultadoAnterior = {1, 2, 4, 5, 6, 10, 11, 12, 13, 14, 18, 20, 21, 23, 24};
//----------------------------------------------------------------------------------------------------------------------
     private String menor;

     private int par =0;
     private int impar=0;

     private int[] deUmANove;
     private int[] dezAcima;

     public void qtdParImpar (){
          for(int i=0;i<resultadoAtual.length;i++){

               if(resultadoAtual[i]%2!=0){
                    impar++;
               }

               if(resultadoAtual[i]%2==0){
                    par++;
               }
          }
          System.out.print("\nImpar: "+impar);
          System.out.println("\nPar: "+par);
     }
//----------------------------------------------------------------------------------------------------------------------
     public void concatenaZero() {
          for (int i = 0; i < resultadoAtual.length; i++) {

               if (resultadoAtual[i] < 10) {

                    deUmANove = new int[15];
                    deUmANove[i] = resultadoAtual[i];

                    menor=("0"+deUmANove[i]+" ");
                    System.out.print(menor);
               }


          }
     }

     public void sepraMaioresQueDez(){
          for (int i = 0; i < resultadoAtual.length; i++) {

               if(resultadoAtual[i] > 9){
                    dezAcima = new int[15];
                    dezAcima[i] = resultadoAtual[i];

                    System.out.print(dezAcima[i]+ " ");
               }
          }
     }
//----------------------------------------------------------------------------------------------------------------------
}
