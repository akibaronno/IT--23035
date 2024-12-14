import java.util.Scanner;

public class fourTasks {

    public static void sumClass () {
        float sum = 0;
        double i = 1.0;
        do{
           sum += i;
           i = i -0.1;
           //System.out.println("sumClass: "+sum);
        } while(i>=0.1);
        System.out.println("Summing up 1+0.9+....+0.1 = "+sum);
        
    }
    public static void divisorMultipleClass(){
      
        int num1,num2,max,min,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for LCM and GCD: ");
        num1  = sc.nextInt();
        num2 = sc.nextInt();
        if(num1 > num2){
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
      do {
        rem = max % min;
        max = min;
        min = rem;
       }  while(min!=0);

       int GCD = max;
       System.out.println("GCD : "+ GCD);
       int LCM = (num1*num2)/GCD;
       System.out.println("LCM : "+LCM);
    }

    public static void decimalToBinaryOctalHexadecimal(int Decimal){
        

    }
    public static void binaryToDecimalOctalHexadecimal(int Binary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the numbers: ");
        int Base = sc.nextInt();

         int i = 0,sum = 0,rem;
         do{
            rem= Binary %10;
            sum += rem*Math.pow(2,i);
            Binary /= 10;
            i++;
            } while(Binary!=0);
        
            if(Base==10){
                System.out.println("Binary to Decimal conversion: "+sum);
             }
             else if(Base==8){
                 System.out.println("Binary to Octal conversion: "+sum);
              }
             else {
                 System.out.println("Binary to Hexadecimal conversion: "+sum);
              }
    
            
    }
     public static void octalToBinaryDecimalHexadecimal(int Octal) {

    }
    public static void hexadecimalToBinaryOctalDecimal(int Hexadecimal){

    }

    public static void numberConversionCLass(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Type 1 for Decimal to Binary or Hexadecimal or Octal Conversion:  ");
       System.out.println("Type 2 for Binary to Decimal or Hexadecimal or Octal Conversion:  ");
       System.out.println("Type 3 for Octal to Decimal or Hexadecimal or Binary Conversion:  ");
       System.out.println("Type 4 for Hexadecimal to Decimal or Binary or Octal Conversion:  ");
       System.out.println("Enter your choice: ");
       int choice = sc.nextInt();

       switch (choice) {
        case 1:
            System.out.println("Enter a Decimal number : ");
            int Decimal = sc.nextInt();
            decimalToBinaryOctalHexadecimal(Decimal);
            break;

        case 2:
            System.out.println("Enter a Binary number : ");
            int Binary = sc.nextInt();
            binaryToDecimalOctalHexadecimal(Binary);
        break;
        case 3:
            System.out.println("Enter a Octal number : ");
            int Octal = sc.nextInt();
            octalToBinaryDecimalHexadecimal(Octal);
        break;
        case 4:
            System.out.println("Enter a Decimal number : ");
            int Hexadecimal = sc.nextInt();
            hexadecimalToBinaryOctalDecimal(Hexadecimal);
        break;

       
        default:
            System.out.println("Invalid Number: ");
            break;
       }
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        sumClass(); 
        divisorMultipleClass();
        numberConversionCLass();
    }
}
