public class LinearSearchIntArray {
    public static void main(String[] args) {
        int[] myArray = {};
        int toFind = 23;
        int index = linearSearch(myArray, toFind);
        
        if (index != -1) {
            System.out.printf("Number found at index %d", index);
        } else {
            System.out.println("Number not found");
        }
    }

    // search for an element, if found, return the index of the element
    // if element is not found in the array, return -1

    static int linearSearch(int[] lArray, int lookFor) {

        if (lArray.length == 0) {
            return -1;
        }
        for (int i = 0; i < lArray.length; i++) {
            if (lArray[i] == lookFor) {
                return i;
            }
        }

        return -1;
    }
}
