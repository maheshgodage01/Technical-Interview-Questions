import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String:");
        String str=input.nextLine();

        char arr[]=str.toCharArray();
        char temp;

        for(int i=0, j=str.length()-1;i<str.length()-1;i++, j--){
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]);
        }
    }
    
}
