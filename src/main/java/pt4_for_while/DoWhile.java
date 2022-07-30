package pt4_for_while;

public class DoWhile {
    /*
    Print array values using a do while loop.
     */
    public static void main(String[] args) {
        int[] arr = {1,7, 88};
        int idx = 0;
        do{
            System.out.println(arr[idx]);
            idx=idx+1;
        } while(idx < arr.length);
    }
}
