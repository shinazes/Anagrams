public class Main {
    public static void main(String[] args) {
        var task1 = "hsif";
        var task2 = "asdfol1hf";
        var correctResult2 = "fhlofd1sa";
//        var solution1 = new Anagram(task1).solve();
//        System.out.println(task1 + " -> " + solution1);
        var solution2 = new Anagram(task2).solve();
        System.out.println(task2 + " -> " + solution2);
        System.out.println("             " + correctResult2);
    }
}
