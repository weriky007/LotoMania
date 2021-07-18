/**
 * https://www.ti-enxame.com/pt/java/algoritmo-para-obter-todas-combinacoes-de-tamanho-n-de-uma-matriz-java/1052058948/
 */

import java.util.ArrayList;
import java.util.List;

public class Combina9 {

    public void executaCombina9(){
        List<int[]> list = new ArrayList<int[]>();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        combinations3(arr,list);
        listToString(list);
    }

    static void combinations3(int[] arr, List<int[]> list){
      for(int a = 0; a<arr.length; a++)
         for(int b = a+1; b<arr.length; b++)
            for(int c = b+1; c<arr.length; c++)
               for(int d = c+1; d<arr.length; d++)
                  for(int e = d+1; e<arr.length; e++)
                     for(int f = e+1; f<arr.length; f++)
                        for(int g = f+1; g<arr.length-2; g++)
                           for(int h = g+1; h<arr.length-1; h++)
                               for(int i = h+1; i<arr.length; i++)

                    list.add(new int[]{arr[a],arr[b],arr[c],arr[d],arr[e],arr[f],arr[g],arr[h],arr[i]});
    }

    private static void listToString(List<int[]> list){
        int contador= 0;
        for(int i = 0; i<list.size(); i++){ //iterate through list
            for(int j : list.get(i)){ //iterate through array
                System.out.printf("%d ",j);
            }
            contador++;
            System.out.printf("Combinacao: "+contador);
            System.out.print("\n");
        }
    }
}
