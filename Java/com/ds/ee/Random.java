
class Random{

    public static void main(String[] args) {
        int[] arr = {3,5,1,2};
        insertSort(arr, 4);
        
        for(int i = 0; i < 4; i++)
            System.out.println(arr[i]);


    }

    public static void insertSort(int[] arr, int n){

        for(int i = 0; i < n; i++){
            arr[i] = 0;
        }
    }
}