import java.util.Scanner;
public class BinaryCalculator {
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter a Denary number");
        int userNum=scnr.nextInt();

        int i=0;

        int binary[]=new int[100];
        while(userNum!=0){
            binary[i]=userNum%2;
            userNum/=2;
            i++;
        }
        System.out.println("The binary value of your number is: ");

        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}
