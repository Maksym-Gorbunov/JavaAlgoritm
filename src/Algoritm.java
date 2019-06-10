import java.util.Arrays;

public class Algoritm {

    public static int[] array = {6,3,7,2,164};

    public static void main(String[] args) {
        System.out.println(divide(17, 4));
        int[] arr = {6,3,7,2,14};
        bubbleSort(arr);
//        quickSort();
        int [] b = Arrays.copyOf(array, array.length);
        Arrays.sort(array);
        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.sort(array));
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

    // Quick sort
    public static void quickSort(){
        int start = 0;
        int end = array.length-1;
        doSort(start, end);
    }
    private static void doSort(int start, int end){
        if(start >= end) return;
        int i = start, j = end;
        int cur = i - (i-j)/2;
        while(i<j){
            while((i < cur) && (array[i] <= array[cur])){
                i++;
            }
            while((cur < j) && (array[cur] <= array[j])){
                j--;
            }
            if(i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if(i == cur){
                    cur = j;
                } else if(j == cur){
                    cur = i;
                }
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    // New algoritm here
    //ttoDo...
    //ttoDo...
    //ttoDo...
}