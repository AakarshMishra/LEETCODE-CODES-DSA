class Solution {
    public void sortColors(int[] arr) {
       int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                int temp1=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp1;
                high--;
                break;
            }
        } 
    }
}