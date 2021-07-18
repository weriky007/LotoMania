public class ParImpar {

    //-------------------------------------------------------------------------------------------------------------
    //COLUNA 1
    public void converteParColuna1() {
        String numeros = "";
        String[] coluna1 = {"01", "06", "11", "16", "21"};
        int[] intColuna1 = new int[coluna1.length];

        for (int i = 0; i < coluna1.length;i++){
            intColuna1[i] = Integer.parseInt(coluna1[i]);
            if(intColuna1[i]%2 ==0){
                numeros += intColuna1[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-----------------------------------------------
       public void convertImparColuna1(){
           String numeros = "";
           String[] coluna1 = {"01", "06", "11", "16", "21"};
           int[] intColuna1 = new int[coluna1.length];

           for (int i = 0; i < coluna1.length;i++){
               intColuna1[i] = Integer.parseInt(coluna1[i]);
               if(intColuna1[i]%2 !=0){
                   numeros += intColuna1[i]+",";
               }
           }
           System.out.println(numeros);
    }
    //-------------------------------------------------------------------------------------------------------------
    //COLUNA 2
    public void converteParColuna2() {
        String numeros = "";
        String[] coluna2 = {"02", "07", "12", "17", "22"};
        int[] intColuna2 = new int[coluna2.length];

        for (int i = 0; i < coluna2.length;i++){
            intColuna2[i] = Integer.parseInt(coluna2[i]);
            if(intColuna2[i]%2 ==0){
                numeros += intColuna2[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-----------------------------------------------
    public void convertImparColuna2(){
        String numeros = "";
        String[] coluna2 = {"02", "07", "12", "17", "22"};
        int[] intColuna2 = new int[coluna2.length];

        for (int i = 0; i < coluna2.length;i++){
            intColuna2[i] = Integer.parseInt(coluna2[i]);
            if(intColuna2[i]%2 !=0){
                numeros += intColuna2[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-------------------------------------------------------------------------------------------------------------
    //COLUNA 3
    public void converteParColuna3() {
        String numeros = "";
        String[] coluna3 = {"03", "08", "13", "18", "23"};
        int[] intColuna3 = new int[coluna3.length];

        for (int i = 0; i < coluna3.length;i++){
            intColuna3[i] = Integer.parseInt(coluna3[i]);
            if(intColuna3[i]%2 ==0){
                numeros += intColuna3[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-----------------------------------------------
    public void convertImparColuna3(){
        String numeros = "";
        String[] coluna3 = {"03", "08", "13", "18", "23"};
        int[] intColuna3 = new int[coluna3.length];

        for (int i = 0; i < coluna3.length;i++){
            intColuna3[i] = Integer.parseInt(coluna3[i]);
            if(intColuna3[i]%2 !=0){
                numeros += intColuna3[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-------------------------------------------------------------------------------------------------------------
    //COLUNA 4
    public void converteParColuna4() {
        String numeros = "";
        String[] coluna4 = {"04", "09", "14", "19", "24"};
        int[] intColuna4 = new int[coluna4.length];

        for (int i = 0; i < coluna4.length;i++){
            intColuna4[i] = Integer.parseInt(coluna4[i]);
            if(intColuna4[i]%2 ==0){
                numeros += intColuna4[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-----------------------------------------------
    public void convertImparColuna4(){
        String numeros = "";
        String[] coluna4 = {"04", "09", "14", "19", "24"};
        int[] intColuna4 = new int[coluna4.length];

        for (int i = 0; i < coluna4.length;i++){
            intColuna4[i] = Integer.parseInt(coluna4[i]);
            if(intColuna4[i]%2 !=0){
                numeros += intColuna4[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-------------------------------------------------------------------------------------------------------------
    //COLUNA 5
    public void converteParColuna5() {
        String numeros = "";
        String[] coluna5 = {"05", "10", "15", "20", "25"};
        int[] intColuna5 = new int[coluna5.length];

        for (int i = 0; i < coluna5.length;i++){
            intColuna5[i] = Integer.parseInt(coluna5[i]);
            if(intColuna5[i]%2 ==0){
                numeros += intColuna5[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-----------------------------------------------
    public void convertImparColuna5(){
        String numeros = "";
        String[] coluna5 = {"05", "10", "15", "20", "25"};
        int[] intColuna5 = new int[coluna5.length];

        for (int i = 0; i < coluna5.length;i++){
            intColuna5[i] = Integer.parseInt(coluna5[i]);
            if(intColuna5[i]%2 !=0){
                numeros += intColuna5[i]+",";
            }
        }
        System.out.println(numeros);
    }
    //-------------------------------------------------------------------------------------------------------------
}


