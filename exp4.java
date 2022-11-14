import java.util.*;
public class exp4 {
        void area(int side){
        double ans = side*side;
        System.out.println("the area of square is:"+ ans);
    }
    void area(int height , int base){
        double ans = 0.5*height*base;
        System.out.println("the area of triangle is:"+ ans);
    }
    
    public static void main(String[] args) {
        int side;
        int height ;
        int base;
        exp4 obj = new exp4();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side:");
        side = sc.nextInt();
        obj.area(side);
        System.out.println("enter the height:");
        height = sc.nextInt();
        System.out.println("enter the base:");
        basee = sc.nextInt();
        obj.area(height,base);
    }
