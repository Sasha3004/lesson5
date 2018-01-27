public class Palindrom {
    public static void main(String[] args) {

        String line = "ежу хуже";
        line = line.replace(" ", "");
        char[] line2 = new char[line.length()];
        char[] line3 = new char[line.length()];
        int size = line.length() - 1;
        boolean answer = true;

        answer = getAnswer(line, line2, line3, size, answer);
        System.out.println("Являются ли они полиндромами?  - " + answer);

    }

    private static boolean getAnswer(String line, char[] line2, char[] line3, int a, boolean answer) {
        for (int i = 0; i < line.length(); i++) {
            line3[i] = line.charAt(a);
            line2[i] = line.charAt(i);
            a = a - 1;
            if (line2[i] != line3[i]) {
                answer = false;
            }

        }
        return answer;
    }
}
