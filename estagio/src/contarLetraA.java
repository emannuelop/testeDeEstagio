public class contarLetraA {
    public static void main(String[] args) {
        String string = "Esta é uma string de exemplo para contar letras A."; // String a ser verificado (pode ser alterado)
        System.out.println(countLetterA(string));
    }

    public static String countLetterA(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        if (count > 0) {
            return "A letra 'a' aparece " + count + " vezes na string.";
        } else {
            return "A letra 'a' não aparece na string.";
        }
    }
}
