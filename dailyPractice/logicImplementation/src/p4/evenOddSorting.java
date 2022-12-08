package p4;

public class evenOddSorting {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,7,8,11,20};
        checksort(arr);
    }
    public static void checksort(int arr[]){
     int[] a=new int[arr.length];

     int index=0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==0){
                a[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2!=0){
                a[index]=arr[i];
                index++;
            }

        }
        for (int j = 0; j <a.length ; j++) {
            System.out.print(a[j]+" ");
        }

    }
}
