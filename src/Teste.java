import java.util.ArrayList;
import java.util.List;

public class Teste {

    public void teste(){
        List<int[]> list = new ArrayList<int[]>();
        int[] arr = {1,2,3,4};
        combinations9(arr,list);
        listToString(list);
    }

    static void combinations9(int[] arr, List<int[]> list){
        for(int a = 0; a<arr.length; a++)
            for(int b = a+1; b<arr.length; b++)


                        list.add(new int[]{arr[a],arr[b]});
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
