import java.util.Scanner;

public class Sum_min_Max {
    public static int sort(int[] arr, int len){
        int temp;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr[0]+arr[len-1];
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N= input.nextInt();
        int len= input.nextInt();
        int[] arr=new int[N];
        int[] tempArray = new int[len];
        int sum=0;

        for(int i=0;i<N;i++){
            arr[i]=input.nextInt();
        }

        for(int i=0;i<N-len+1;i++){
            for(int j=0;j<len;j++){
                tempArray[j]=arr[i+j];
            }
            sum+=sort(tempArray,len);
        }
        System.out.println(sum);
    }
}
