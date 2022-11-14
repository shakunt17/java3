public class exp13 {
    public static void main(String[] args) {
        int i,j;
   
        System.out.println("the prime numbers from 1 to 1000 are:");
        for (i = 1; i <=100; i++) {
            int count=0;
             for(j=i;j>0;j--){
                if(i%j==0){
                   count++;
                }
             }
             if(count==2){
                System.out.println(i);
             }
        }
    }
}
