public class GeraTodasApostas {
    public void gerando(){
        int idCombinacaoLotofacil = 0;
        for (int p1 = 1; p1 <= 11; p1++) {
            for (int p2 = p1 + 1; p2 <= 12; p2++) {
                for (int p3 = p2 + 1; p3 <= 13; p3++) {
                    for (int p4 = p3 + 1; p4 <= 14; p4++) {
                        for (int p5 = p4 + 1; p5 <= 15; p5++) {
                            for (int p6 = p5 + 1; p6 <= 16; p6++) {
                                for (int p7 = p6 + 1; p7 <= 17; p7++) {
                                    for (int p8 = p7 + 1; p8 <= 18; p8++) {
                                        for (int p9 = p8 + 1; p9 <= 19; p9++) {
                                            for (int p10 = p9 + 1; p10 <= 20; p10++) {
                                                for (int p11 = p10 + 1; p11 <= 21; p11++) {
                                                    for (int p12 = p11 + 1; p12 <= 22; p12++) {
                                                        for (int p13 = p12 + 1; p13 <= 23; p13++) {
                                                            for (int p14 = p13 + 1; p14 <= 24; p14++) {
                                                                for (int p15 = p14 + 1; p15 <= 25; p15++) {

                                                                    idCombinacaoLotofacil++;

                                                                    String pesquisa = String.format("%02d ", p1) +
                                                                            String.format("%02d ", p2) +
                                                                            String.format("%02d ", p3) +
                                                                            String.format("%02d ", p4) +
                                                                            String.format("%02d ", p5) +
                                                                            String.format("%02d ", p6) +
                                                                            String.format("%02d ", p7) +
                                                                            String.format("%02d ", p8) +
                                                                            String.format("%02d ", p9) +
                                                                            p10 + " " +
                                                                            p11 + " " +
                                                                            p12 + " " +
                                                                            p13 + " " +
                                                                            p14 + " " +
                                                                            p15;

                                                                    // Para acompanhar processo
                                                                    System.out.println(idCombinacaoLotofacil +
                                                                            " > " + pesquisa);



                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
