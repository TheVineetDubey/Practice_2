package Array;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int [] a={1,3,2,4,5,6,8,7,6,5};
        int temp=0;
        for(int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length-1;j++){
                
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
            
        }
            System.out.println(Arrays.toString(a));
        }
        
    }


        
