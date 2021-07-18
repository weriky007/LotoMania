import java.math.BigInteger;

public class CalculoCombinacaoSimples {
//----------------------------------------------------------------------------------------------------------------------
    private static int possibities(int n, int p) {
        if (n == p)
            return 1;
        BigInteger nFat = factorial(n);
        BigInteger pFat = factorial(p);
        BigInteger nMinusPFat = factorial(n - p);
        BigInteger result = nFat.divide(pFat.multiply(nMinusPFat));
        return result.intValue();
    }
//----------------------------------------------------------------------------------------------------------------------
    private static BigInteger factorial(final int n) {
        BigInteger result = BigInteger.valueOf(n);
        for (int i = n - 1; i > 0; i--)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
//----------------------------------------------------------------------------------------------------------------------
    private static int[][] geraCombinacao(int n, int p) {
        int c = possibities(n, p);
        int[][] m = new int[c][p];
        int[] vN = new int[p];

        for (int i = 0; i < p; i++) {
            vN[i] = i;
            m[0][i] = i;
        }

        for (int i = 1; i < c; i++)
            for (int j = p - 1; j >= 0; j--)
                if (vN[j] < (n - p + j)) {
                    vN[j]++;
                    for (int k = j + 1; k < p; k++) {
                        vN[k] = vN[j] + k - j;
                    }
                    for (int l = 0; l < p; l++) {
                        m[i][l] = vN[l];
                    }

                    break;
                }

        return m;
    }
//----------------------------------------------------------------------------------------------------------------------
    public void verTotalDeCombinacoes(){
        int[][] m = geraCombinacao(15, 9); // coloque aqui (total de dezenas,dezenas por grupo)
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
            }
        }
        System.out.println("Calculo para combinacoes de 9 dezenas de 15");
        System.out.println("Total de " + m.length + " combinações");
    }
//----------------------------------------------------------------------------------------------------------------------
}
