public class InsertionSort  {
    public static void main(String[] args){
        int[] arr = {7,8,4,5,2,3};

        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j = i-1; //sorted array
            while(j >=0 && curr < arr[j]){ //looping in sorted array jb tk unsorted wala in smaller --- we keep making space
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr; //once found the correct space --- we place it in sorted
        }
    }
}
