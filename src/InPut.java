import java.util.Arrays;
import java.util.Scanner;

public class InPut {
    //--------------------------------------
    int par1;
    int par2;
    int impar1;
    int impar2;
    int impar3;
    //--------------------------------------------------------------------------------------------------------
    public void coletaPares() {
        System.out.println("Escolha 2 numeros pares da lista acima:");

        Scanner inPar = new Scanner(System.in);
        System.out.println("Primeiro numero par:");
        par1 = inPar.nextInt();
        //--------------------------------------
        Scanner inPar2 = new Scanner(System.in);
        System.out.println("Segundo numero par:");
        par2 = inPar2.nextInt();
    }
    //--------------------------------------------------------------------------------------------------------
    public void coletaImpares() {
        System.out.println("Escolha 3 numeros impares da lista acima:");
        Scanner inImpares1 = new Scanner(System.in);
        System.out.println("Primeiro numero impar:");
        impar1 = inImpares1.nextInt();
        //--------------------------------------
        Scanner inImpares2 = new Scanner(System.in);
        System.out.println("Segundo numero impar:");
        impar2 = inImpares2.nextInt();
        //--------------------------------------
        Scanner inImpares3 = new Scanner(System.in);
        System.out.println("Terceiro numero impar:");
        impar3 = inImpares3.nextInt();
    }
    //---------------------------------------------------------------------------------------------------------

}
