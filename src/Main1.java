import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int k = sc.nextInt();
        if (L <= 0 || k <= 0 || L < k) {
            return;
        }
        String s = sc.next();
        if (s.length() < L){
            return;
        }else{
            s=s.substring(0,L);
            //System.out.println(s);
        }


        for (int i = k; i <= s.length(); i++) {

        String str = s.substring(i - k, i);
        System.out.println(str);
        int num = Integer.parseInt(str);
        if(num<=0){
            return;
        }
        int j;
        for (j = 2; j < Math.sqrt(num); j++) {
            if (num % j == 0) {
                break;
            }
        }
        if (j > Math.sqrt(num)) {
            System.out.println(str);
            return;
        }
    }
        System.out.println(404);
}

}