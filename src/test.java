import java.util.ArrayList;

public class test {
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      for (int num = 2; num < 50;num++){
          int j;
          for (j = 2; j < Math.sqrt(num); j++) {
              if (num % j == 0) {
                  break;
              }
          }
          if (j > Math.sqrt(num)) {
              System.out.println(num);
          }
      }

    }
}
