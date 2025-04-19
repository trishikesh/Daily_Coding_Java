public class BubbleSort {
    public static void main(String[] args){
        int[] arr1 = {8,9,2,3,5};

        for(int i=0;i<=arr1.length-1;i++){ //n-1
            for(int j=0;j<arr1.length-i-1;j++){  //leave the last sorted element out of the loop
                if(arr1[j]>arr1[j+1]){
                    int a = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = a;
                }
            }
        }


        System.out.print("Bubble sorted array: ");
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
