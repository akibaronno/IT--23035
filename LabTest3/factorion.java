import java.util.Scanner;

public class factorion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int range1,range2;
        System.out.println("Enter the lower bound of the range: ");
        range1 = sc.nextInt();
        System.out.println("Enter the upper bound of the range: ");
        range2 = sc.nextInt();
        System.out.println("Factorion numbers in the range: ");
        for (int num = range1; num <=range2; num ++){

       //int n = sc.nextInt();
        int currentNum =num;
        int sum = 0;
        int fact = 1;
      while(currentNum> 0){
          int digit = currentNum%10;
          //System.out.println(digit);
          currentNum/=10; 
          for(int i = 2; i <= digit ; i++){
              fact = fact*i; 
              //System.out.println(fact); 
          }
          sum += fact;
          fact = 1;
      }  
     // System.out.println(sum);
      

      if(sum==num){
        System.out.println(num);
      }
}
}
}
