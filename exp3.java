import java.util.*;
class calculation{
    void rectangle(double length , double breadth){
        double ans = length*breadth;
        System.out.println("the area of rectangle is:"+ ans);
    }
    
    void square(double side){
        double ans = side*side;
        System.out.println("the area of square is:"+ ans);
    }

}

public class exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length:");
        int length = sc.nextInt();
        System.out.println("enter the breadth:");
        int breadth = sc.nextInt();
        System.out.println("enter the side:");
        int side = sc.nextInt();
        calculation obj = new calculation();
        obj.rectangle(length,breadth);
        obj.square(side);
    }
}
