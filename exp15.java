import java.util.*;
public class exp15 {
        void area(int radius){
        double ans = 3.14*radius*radius;
        System.out.println("the area of circle is:"+ ans);
    }
    void area(int length , int breadth){
        double ans = length*breadth;
        System.out.println("the area of rectangle is:"+ ans);
    }
    
    public static void main(String[] args) {
        int radius;
        int length;
        int breadth;
        exp15 obj = new exp15();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius:");
        radius = sc.nextInt();
        obj.area(radius);
        System.out.println("enter the length:");
        length = sc.nextInt();
        System.out.println("enter the breadth:");
        breadth = sc.nextInt();
        obj.area(length,breadth);
    }
}
