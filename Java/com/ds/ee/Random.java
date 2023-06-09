
class Random{

    public static void main(String[] args) {
        int[] arr = {31,41,59,26,41,58};
        insertSort(arr, arr.length);
        
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);


    }

    // TODO: Incorrect Algo - write correct algo
    public static void insertSort(int[] arr, int n){

        for(int i = 1; i < n; i++){
            int key = arr[i];
            // Insert key into sorted position in arr[0:i-1]
            int j = i-1;

            while (j >= 0 && arr[j] > key){
                j = j-1;
            }
            if(j >= 0){
                arr[i] = arr[j];
                arr[j] = key;
            }
        }
    }
}