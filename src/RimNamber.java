public class RimNamber {
    public static void main(String[] args) {

        String rimNamber = "XLIX";
        char[] namber = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int[] namber2={1000,500,100,50,10,5,1};
        int summa = 0;
        int[] arrayComparison =new int[rimNamber.length()];


        summa = getSumma(rimNamber, namber, namber2, summa, arrayComparison);

        System.out.println("Будет в арабских цифрах = "+summa);

    }

    private static int getSumma(String rimNamber, char[] namber, int[] namber2, int summa, int[] arrayComparison) {
        for (int k = rimNamber.length() - 1; k > -1; k--) {

            if (rimNamber.charAt(k) == namber[6]) {
                arrayComparison[k]=namber2[6];
                if (k<(rimNamber.length()-1)&& arrayComparison[k]< arrayComparison[k+1]) {
                    namber2[6] = -namber2[6];
                }
                summa += namber2[6];
            }
            if (rimNamber.charAt(k) == namber[5]) {
                arrayComparison[k]=namber2[5];
                if (k<(rimNamber.length()-1)&& arrayComparison[k]< arrayComparison[k+1]) {
                    namber2[5] = -namber2[5];
                }
                summa += namber2[6];
            }
            if (rimNamber.charAt(k) == namber[4]) {
                arrayComparison[k]=namber2[4];
                if (k<(rimNamber.length()-1)&& arrayComparison[k]< arrayComparison[k+1]) {
                    namber2[4] = -namber2[4];
                }
                summa += namber2[4];
            }
            if (rimNamber.charAt(k) == namber[3]) {
                arrayComparison[k]=namber2[3];
                if (k<(rimNamber.length()-1)&& arrayComparison[k]< arrayComparison[k+1]) {
                    namber2[3] = -namber2[3];
                }
                summa += namber2[3];
            }
            if (rimNamber.charAt(k) == namber[2]) {
                arrayComparison[k]=namber2[2];
                if (k<(rimNamber.length()-1)&& arrayComparison[k]< arrayComparison[k+1]) {
                    namber2[2] = -namber2[2];
                }
                summa += namber2[2];
            }
            if (rimNamber.charAt(k) == namber[1]) {
                arrayComparison[k]=namber2[1];
                if (k<(rimNamber.length()-1)&& arrayComparison[k]< arrayComparison[k+1]) {
                    namber2[1] = -namber[1];
                }
                summa += namber2[1];
            }
            if (rimNamber.charAt(k) == namber[0]) {
                summa +=namber2[0];
            }

        }
        return summa;
    }
}
