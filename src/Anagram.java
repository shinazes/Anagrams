public class Anagram {
    String value;
    Anagram(String value) {
        this.value = value;
    }
    public String solve() {
        var letters = new Character[value.length()];
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                letters[i] = value.charAt(i);
                continue;
            }
            letters[letters.length - i - 1] = value.charAt(i);
        }
        String solved = "";
        for (int i = 0; i < value.length(); i++) {
            solved += letters[i];
        }
        return solved;
    }

    private void help() {
        Character.isDigit('1');
    }

}
