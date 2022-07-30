package pt4_for_while;

public class ForLoop {
    /*
    Print elements of an array using a for loop.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        System.out.println("The Classic For loop with index i");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Iterate through values themselves");
        for(int val : arr){
            System.out.println(val);
        }
    }
}
