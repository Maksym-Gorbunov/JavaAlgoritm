import java.util.Arrays;

public class Algoritm {
    public static void main(String[] args) {
        System.out.println(divide(17, 4));
        int[] arr = {6,3,7,2,14};
        bubbleSort(arr);
    }

    // Eucaliptov, obschij delitel
    public static int divide(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return divide(b, c);
    }

    // {6,3,7,2,14} => [2, 3, 6, 7, 14]
    public static void bubbleSort(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int max = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = max;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}