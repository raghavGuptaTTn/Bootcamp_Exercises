public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,1,4,5};

        // its a technique that xor of 2 same numbers is always 0
        // and xor of a number with 0 is always the number itself
        /// so, if we xor all the elements in the array, we get the unique element, IN THIS CASE
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
}
