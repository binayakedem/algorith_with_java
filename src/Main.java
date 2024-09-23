public class Main {
    public static void main(String[] args) {
        /*
        * the first one is bubble sort , main working mechanism of this bubble sort is pushing highest value to end
        *
        * */

        Inputs obj=new Inputs();
        int [] arr= obj.array();
// this is bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The sorted bubble array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();


//        insertion sort

        int[] arr1=obj.array();
        for(int i=1;i<arr1.length;i++){
            int temp=arr1[i];
            int j=i-1;
            while(j>=0 && arr1[j]>temp){
                arr1[j+1]=arr1[j];
                j--;
            }
            arr1[j+1]=temp;

        }

        System.out.println("The sorted array using insertion sort:");
        for (int j : arr1) {
            System.out.print(" " + j);
        }
        System.out.println();
    }
}