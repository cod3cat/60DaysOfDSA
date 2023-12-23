public class LinearSearchString {
    public static void main(String[] args) {
        String str = "My Name is";
        char toFind = 'n';

        System.out.println(linearSearch(str, toFind));
    }

    static boolean linearSearch(String lStrings, char toFind) {

        if (lStrings.length() == 0) {
            return false;
        }

        for (char lStr : lStrings.toCharArray()) {
            if (lStr == toFind) {
                return true;
            }
        }

        return false;
    }
}
