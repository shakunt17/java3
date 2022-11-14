import java.util.*;
class calculation{
    void triangle(int height , int base){
        double ans = 0.5*height*base;
        System.out.println("the area of triangle is:"+ ans);
    }
    
    void circle(int radius){
        double ans = 3.14*radius*radius;
        System.out.println("the area of circle is:"+ ans);
    }

}

public class exp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height:");
        int height = sc.nextInt();
        System.out.println("enter the base:");
        int base = sc.nextInt();
        System.out.println("enter the radius:");
        int radius = sc.nextInt();
        calculation obj = new calculation();
        obj.triangle(height,base);
        obj.circle(radius);
    }
}
