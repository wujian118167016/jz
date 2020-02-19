import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        //L表示位数，K表示所需素数的长度
        int L = sc.nextInt();
        int k = sc.nextInt();


        //获取输入的字符串
        String s = sc.next();

        for (int i = k; i <= s.length(); i++) {

            String str = s.substring(i - k, i);
            //System.out.println(str);
            int num = Integer.parseInt(str);

            if(isPrime(num)){
                System.out.println(str);
                return;
            }
        }
        System.out.println(404);
    }

    public static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;
        return true;
    }


}