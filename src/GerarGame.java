import java.util.Arrays;

public class GerarGame {
//----------------------------------------------------------------------------------------------------------------------
    BdApostas bdApostas = new BdApostas();
    BdColunasLinhas colunas = new BdColunasLinhas();
    InPut inPut = new InPut();
    ParImpar parImpar = new ParImpar();
    Resultados resultado = new Resultados();
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame1() {
        //COMBINACOES COLUNA 1
        parImpar.converteParColuna3();
        parImpar.converteParColuna4();
        parImpar.converteParColuna5();
        inPut.coletaPares();

        parImpar.convertImparColuna3();
        parImpar.convertImparColuna4();
        parImpar.convertImparColuna5();
        inPut.coletaImpares();

        bdApostas.aposta1[0] = inPut.par1;
        bdApostas.aposta1[1] = inPut.par2;

        bdApostas.aposta1[2] = inPut.impar1;
        bdApostas.aposta1[3] = inPut.impar2;
        bdApostas.aposta1[4] = inPut.impar3;

        bdApostas.aposta1[5] = colunas.coluna1[0];
        bdApostas.aposta1[6] = colunas.coluna1[1];
        bdApostas.aposta1[7] = colunas.coluna1[2];
        bdApostas.aposta1[8] = colunas.coluna1[3];
        bdApostas.aposta1[9] = colunas.coluna1[4];

        bdApostas.aposta1[10] = colunas.coluna2[0];
        bdApostas.aposta1[11] = colunas.coluna2[1];
        bdApostas.aposta1[12] = colunas.coluna2[2];
        bdApostas.aposta1[13] = colunas.coluna2[3];
        bdApostas.aposta1[14] = colunas.coluna2[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame2() {
        parImpar.converteParColuna2();
        parImpar.converteParColuna4();
        parImpar.converteParColuna5();
        inPut.coletaPares();

        parImpar.convertImparColuna2();
        parImpar.convertImparColuna4();
        parImpar.convertImparColuna5();
        inPut.coletaImpares();

        bdApostas.aposta2[0] = inPut.par1;
        bdApostas.aposta2[1] = inPut.par2;

        bdApostas.aposta2[2] = inPut.impar1;
        bdApostas.aposta2[3] = inPut.impar2;
        bdApostas.aposta2[4] = inPut.impar3;

        bdApostas.aposta2[5] = colunas.coluna1[0];
        bdApostas.aposta2[6] = colunas.coluna1[1];
        bdApostas.aposta2[7] = colunas.coluna1[2];
        bdApostas.aposta2[8] = colunas.coluna1[3];
        bdApostas.aposta2[9] = colunas.coluna1[4];

        bdApostas.aposta2[10] = colunas.coluna3[0];
        bdApostas.aposta2[11] = colunas.coluna3[1];
        bdApostas.aposta2[12] = colunas.coluna3[2];
        bdApostas.aposta2[13] = colunas.coluna3[3];
        bdApostas.aposta2[14] = colunas.coluna3[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame3() {
        parImpar.converteParColuna2();
        parImpar.converteParColuna3();
        parImpar.converteParColuna5();
        inPut.coletaPares();

        parImpar.convertImparColuna2();
        parImpar.convertImparColuna3();
        parImpar.convertImparColuna5();
        inPut.coletaImpares();

        bdApostas.aposta3[0] = inPut.par1;
        bdApostas.aposta3[1] = inPut.par2;

        bdApostas.aposta3[2] = inPut.impar1;
        bdApostas.aposta3[3] = inPut.impar2;
        bdApostas.aposta3[4] = inPut.impar3;

        bdApostas.aposta3[5] = colunas.coluna1[0];
        bdApostas.aposta3[6] = colunas.coluna1[1];
        bdApostas.aposta3[7] = colunas.coluna1[2];
        bdApostas.aposta3[8] = colunas.coluna1[3];
        bdApostas.aposta3[9] = colunas.coluna1[4];

        bdApostas.aposta3[10] = colunas.coluna4[0];
        bdApostas.aposta3[11] = colunas.coluna4[1];
        bdApostas.aposta3[12] = colunas.coluna4[2];
        bdApostas.aposta3[13] = colunas.coluna4[3];
        bdApostas.aposta3[14] = colunas.coluna4[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame4() {
        parImpar.converteParColuna2();
        parImpar.converteParColuna3();
        parImpar.converteParColuna4();
        inPut.coletaPares();

        parImpar.convertImparColuna2();
        parImpar.convertImparColuna3();
        parImpar.convertImparColuna4();
        inPut.coletaImpares();

        bdApostas.aposta4[0] = inPut.par1;
        bdApostas.aposta4[1] = inPut.par2;

        bdApostas.aposta4[2] = inPut.impar1;
        bdApostas.aposta4[3] = inPut.impar2;
        bdApostas.aposta4[4] = inPut.impar3;

        bdApostas.aposta4[5] = colunas.coluna1[0];
        bdApostas.aposta4[6] = colunas.coluna1[1];
        bdApostas.aposta4[7] = colunas.coluna1[2];
        bdApostas.aposta4[8] = colunas.coluna1[3];
        bdApostas.aposta4[9] = colunas.coluna1[4];

        bdApostas.aposta4[10] = colunas.coluna5[0];
        bdApostas.aposta4[11] = colunas.coluna5[1];
        bdApostas.aposta4[12] = colunas.coluna5[2];
        bdApostas.aposta4[13] = colunas.coluna5[3];
        bdApostas.aposta4[14] = colunas.coluna5[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame5() {

        //COMBINACOES COLUNA 2
        parImpar.converteParColuna1();
        parImpar.converteParColuna4();
        parImpar.converteParColuna5();
        inPut.coletaPares();

        parImpar.convertImparColuna1();
        parImpar.convertImparColuna4();
        parImpar.convertImparColuna5();
        inPut.coletaImpares();

        bdApostas.aposta5[0] = inPut.par1;
        bdApostas.aposta5[1] = inPut.par2;

        bdApostas.aposta5[2] = inPut.impar1;
        bdApostas.aposta5[3] = inPut.impar2;
        bdApostas.aposta5[4] = inPut.impar3;

        bdApostas.aposta5[5] = colunas.coluna2[0];
        bdApostas.aposta5[6] = colunas.coluna2[1];
        bdApostas.aposta5[7] = colunas.coluna2[2];
        bdApostas.aposta5[8] = colunas.coluna2[3];
        bdApostas.aposta5[9] = colunas.coluna2[4];

        bdApostas.aposta5[10] = colunas.coluna3[0];
        bdApostas.aposta5[11] = colunas.coluna3[1];
        bdApostas.aposta5[12] = colunas.coluna3[2];
        bdApostas.aposta5[13] = colunas.coluna3[3];
        bdApostas.aposta5[14] = colunas.coluna3[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame6() {
        parImpar.converteParColuna1();
        parImpar.converteParColuna3();
        parImpar.converteParColuna5();
        inPut.coletaPares();

        parImpar.convertImparColuna1();
        parImpar.convertImparColuna3();
        parImpar.convertImparColuna5();
        inPut.coletaImpares();

        bdApostas.aposta6[0] = inPut.par1;
        bdApostas.aposta6[1] = inPut.par2;

        bdApostas.aposta6[2] = inPut.impar1;
        bdApostas.aposta6[3] = inPut.impar2;
        bdApostas.aposta6[4] = inPut.impar3;

        bdApostas.aposta6[5] = colunas.coluna2[0];
        bdApostas.aposta6[6] = colunas.coluna2[1];
        bdApostas.aposta6[7] = colunas.coluna2[2];
        bdApostas.aposta6[8] = colunas.coluna2[3];
        bdApostas.aposta6[9] = colunas.coluna2[4];

        bdApostas.aposta6[10] = colunas.coluna4[0];
        bdApostas.aposta6[11] = colunas.coluna4[1];
        bdApostas.aposta6[12] = colunas.coluna4[2];
        bdApostas.aposta6[13] = colunas.coluna4[3];
        bdApostas.aposta6[14] = colunas.coluna4[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame7() {
        parImpar.converteParColuna1();
        parImpar.converteParColuna3();
        parImpar.converteParColuna4();
        inPut.coletaPares();

        parImpar.convertImparColuna1();
        parImpar.convertImparColuna3();
        parImpar.convertImparColuna4();
        inPut.coletaImpares();

        bdApostas.aposta7[0] = inPut.par1;
        bdApostas.aposta7[1] = inPut.par2;

        bdApostas.aposta7[2] = inPut.impar1;
        bdApostas.aposta7[3] = inPut.impar2;
        bdApostas.aposta7[4] = inPut.impar3;

        bdApostas.aposta7[5] = colunas.coluna2[0];
        bdApostas.aposta7[6] = colunas.coluna2[1];
        bdApostas.aposta7[7] = colunas.coluna2[2];
        bdApostas.aposta7[8] = colunas.coluna2[3];
        bdApostas.aposta7[9] = colunas.coluna2[4];

        bdApostas.aposta7[10] = colunas.coluna5[0];
        bdApostas.aposta7[11] = colunas.coluna5[1];
        bdApostas.aposta7[12] = colunas.coluna5[2];
        bdApostas.aposta7[13] = colunas.coluna5[3];
        bdApostas.aposta7[14] = colunas.coluna5[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame8() {

        //COMBINACOES COLUNA 3
        parImpar.converteParColuna1();
        parImpar.converteParColuna2();
        parImpar.converteParColuna5();
        inPut.coletaPares();

        parImpar.convertImparColuna1();
        parImpar.convertImparColuna2();
        parImpar.convertImparColuna5();
        inPut.coletaImpares();

        bdApostas.aposta8[0] = inPut.par1;
        bdApostas.aposta8[1] = inPut.par2;

        bdApostas.aposta8[2] = inPut.impar1;
        bdApostas.aposta8[3] = inPut.impar2;
        bdApostas.aposta8[4] = inPut.impar3;

        bdApostas.aposta8[5] = colunas.coluna3[0];
        bdApostas.aposta8[6] = colunas.coluna3[1];
        bdApostas.aposta8[7] = colunas.coluna3[2];
        bdApostas.aposta8[8] = colunas.coluna3[3];
        bdApostas.aposta8[9] = colunas.coluna3[4];

        bdApostas.aposta8[10] = colunas.coluna4[0];
        bdApostas.aposta8[11] = colunas.coluna4[1];
        bdApostas.aposta8[12] = colunas.coluna4[2];
        bdApostas.aposta8[13] = colunas.coluna4[3];
        bdApostas.aposta8[14] = colunas.coluna4[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void gerarGame9() {
        parImpar.converteParColuna1();
        parImpar.converteParColuna2();
        parImpar.converteParColuna4();
        inPut.coletaPares();

        parImpar.convertImparColuna1();
        parImpar.convertImparColuna2();
        parImpar.convertImparColuna4();
        inPut.coletaImpares();

        bdApostas.aposta9[0] = inPut.par1;
        bdApostas.aposta9[1] = inPut.par2;

        bdApostas.aposta9[2] = inPut.impar1;
        bdApostas.aposta9[3] = inPut.impar2;
        bdApostas.aposta9[4] = inPut.impar3;

        bdApostas.aposta9[5] = colunas.coluna3[0];
        bdApostas.aposta9[6] = colunas.coluna3[1];
        bdApostas.aposta9[7] = colunas.coluna3[2];
        bdApostas.aposta9[8] = colunas.coluna3[3];
        bdApostas.aposta9[9] = colunas.coluna3[4];

        bdApostas.aposta9[10] = colunas.coluna5[0];
        bdApostas.aposta9[11] = colunas.coluna5[1];
        bdApostas.aposta9[12] = colunas.coluna5[2];
        bdApostas.aposta9[13] = colunas.coluna5[3];
        bdApostas.aposta9[14] = colunas.coluna5[4];
    }
//-------------------------------------------------------------------------------------------------------------
    public void gerarGame10() {

        //COMBINACOES COLUNA 4
        parImpar.converteParColuna1();
        parImpar.converteParColuna2();
        parImpar.converteParColuna3();
        inPut.coletaPares();

        parImpar.convertImparColuna1();
        parImpar.convertImparColuna2();
        parImpar.convertImparColuna3();
        inPut.coletaImpares();

        bdApostas.aposta10[0] = inPut.par1;
        bdApostas.aposta10[1] = inPut.par2;

        bdApostas.aposta10[2] = inPut.impar1;
        bdApostas.aposta10[3] = inPut.impar2;
        bdApostas.aposta10[4] = inPut.impar3;

        bdApostas.aposta10[5] = colunas.coluna4[0];
        bdApostas.aposta10[6] = colunas.coluna4[1];
        bdApostas.aposta10[7] = colunas.coluna4[2];
        bdApostas.aposta10[8] = colunas.coluna4[3];
        bdApostas.aposta10[9] = colunas.coluna4[4];

        bdApostas.aposta10[10] = colunas.coluna5[0];
        bdApostas.aposta10[11] = colunas.coluna5[1];
        bdApostas.aposta10[12] = colunas.coluna5[2];
        bdApostas.aposta10[13] = colunas.coluna5[3];
        bdApostas.aposta10[14] = colunas.coluna5[4];
    }
//----------------------------------------------------------------------------------------------------------------------
    public void printGame1() {
        Arrays.sort(bdApostas.aposta1);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta1[i] + ",";
        }
        System.out.println("01: " + ap);
    //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta1[j]) {
                    dezenasAcertos += bdApostas.aposta1[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }
    //-------------------------------------------
    public void printGame2() {
        Arrays.sort(bdApostas.aposta2);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta2[i] + ",";
        }
        System.out.println("02: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta2[j]) {
                    dezenasAcertos += bdApostas.aposta2[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }
    //-------------------------------------------
    public void printGame3() {
        Arrays.sort(bdApostas.aposta3);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta3[i] + ",";
        }
        System.out.println("03: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta3[j]) {
                    dezenasAcertos += bdApostas.aposta3[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }
    //-------------------------------------------
    public void printGame4() {
        Arrays.sort(bdApostas.aposta4);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta4[i] + ",";
        }
        System.out.println("04: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta4[j]) {
                    dezenasAcertos += bdApostas.aposta4[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }

    //-------------------------------------------
    public void printGame5() {
        Arrays.sort(bdApostas.aposta5);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta5[i] + ",";
        }
        System.out.println("05: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta5[j]) {
                    dezenasAcertos += bdApostas.aposta5[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }

    //-------------------------------------------
    public void printGame6() {
        Arrays.sort(bdApostas.aposta6);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta6[i] + ",";
        }
        System.out.println("06: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta6[j]) {
                    dezenasAcertos += bdApostas.aposta6[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }
    //-------------------------------------------
    public void printGame7() {
        Arrays.sort(bdApostas.aposta7);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta7[i] + ",";
        }
        System.out.println("07: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta7[j]) {
                    dezenasAcertos += bdApostas.aposta7[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }

    //-------------------------------------------
    public void printGame8() {
        Arrays.sort(bdApostas.aposta8);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta8[i] + ",";
        }
        System.out.println("08: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta8[j]) {
                    dezenasAcertos += bdApostas.aposta8[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }

    //-------------------------------------------
    public void printGame9() {
        Arrays.sort(bdApostas.aposta9);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta9[i] + ",";
        }
        System.out.println("09: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta9[j]) {
                    dezenasAcertos += bdApostas.aposta9[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }

    //-------------------------------------------
    public void printGame10() {
        Arrays.sort(bdApostas.aposta10);
        String ap = "";
        for (int i = 0; i < 15; i++) {
            ap += bdApostas.aposta10[i] + ",";
        }
        System.out.println("10: " + ap);
        //-------------------------------------------
        //Verifica Resultados
        String dezenasAcertos = "";
        int contador =0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (resultado.resultadoAnterior[i]==bdApostas.aposta10[j]) {
                    dezenasAcertos += bdApostas.aposta10[j] + ",";
                    contador++;
                }
            }
        }
        System.out.println("Dezenas Acertos: " + dezenasAcertos+"| Acertos: "+contador);
    }
    //-------------------------------------------------------------------------------------------------------------
}
