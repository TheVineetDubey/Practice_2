package CoreJava;

public class Sorting {
    public static void main(String[] args) {

        int []arr ={ 20,43,12,67,0,98,69,54};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
