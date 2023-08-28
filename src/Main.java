public class Main {

    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram(s, t));
    }
}