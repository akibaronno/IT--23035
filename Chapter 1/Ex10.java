import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kilo = sc.nextFloat();
        double mile = kilo / 1.6;
        float min = sc.nextFloat();
        float sec = sc.nextFloat();
        float hour = (min/60)+(sec/3600);
        double averageSpeedinMile = mile / hour;
        System.out.println("Average speed in miles per hour= "+ averageSpeedinMile);

    }
}
