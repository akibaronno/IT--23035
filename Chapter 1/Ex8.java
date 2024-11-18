public class Ex8 {
   public static void main(String[] args) {
    double radius = 5.5;
    double perimeter, area;
    area = radius * radius * Math.PI;
    perimeter = 2* radius* Math.PI;
    System.out.printf("Perimeter = ");
    System.out.printf("%.4f%n",perimeter);
    System.out.printf("Area = ");
    System.out.printf("%.4f",area);
   } 
}