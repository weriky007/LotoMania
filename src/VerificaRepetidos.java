public class VerificaRepetidos {
//----------------------------------------------------------------------------------------------------------------------
    Resultados result = new Resultados();
    int contador =0;
    int par =0;
    int impar =0;
//----------------------------------------------------------------------------------------------------------------------
    public void qtdRepeticoes(){
        System.out.print("Dezenas Repetidas: ");
        for(int i = 0; i<result.resultadoAnterior.length; i++){
            for(int j = 0; j<result.resultadoAtual.length; j++){

                if(result.resultadoAnterior[i] == result.resultadoAtual[j]){
                    contador++;

                    System.out.print(result.resultadoAnterior[i]+" ");

                    if(result.resultadoAnterior[i]%2 !=0){
                        impar++;
                    }

                    if(result.resultadoAnterior[i]%2 ==0){
                        par++;
                    }
                }
            }
        }
        System.out.println("\n"+"Quantidade de dezenas Repetidas: "+contador);
        System.out.println("Par: "+par);
        System.out.println("Impar: "+impar);
    }
//----------------------------------------------------------------------------------------------------------------------
}
