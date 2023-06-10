
class Random{

    public static void main(String[] args) {
        int[] arr = {777,330,320,757,31,41,59,26,41,58};
        insertSort(arr, arr.length);
        
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");


    }

    // TODO: Is this insertion sort or bubble sort?
    public static void insertSort(int[] arr, int n){

        for(int i = 1; i < n; i++){
            
            int ki = i;
            int key = arr[ki];
            // Insert key into sorted position in arr[0:i-1]
            int j = ki-1;

            while (j >= 0){
                if(arr[j] > key){
                    arr[ki] = arr[j];
                    arr[j] = key;
                    ki = j; 
                    key = arr[ki];
                    j = ki-1;
                }
                else
                    j = j-1;
            }
        }
    }

    
    public static void selectionSort(int[] arr, int n){

        // implement this
    }
}