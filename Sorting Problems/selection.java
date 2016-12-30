class Selection{
    public static void main(String[] args){
        int[] arr = new int[] {1,5,2,8,0,4,2,6,9,7};
         
        selectionSort(arr,arr.length);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void selectionSort(int[] arr,int size){ //Does the sorting
        for(int i = 0;i<size-1;i++){
            int iMin = i;
            for(int j = i+1;j<size;j++){
                if(arr[j] < arr[iMin])
                    iMin = j;
            }
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
        }
    }
}