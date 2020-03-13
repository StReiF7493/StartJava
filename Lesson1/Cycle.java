public class Cycle {
    public static void main(String[] args){
      for(int i = 0;i <= 20;i++){
        System.out.println(i);
      }
      int i2 = 2;
      int i3 = 8;
      while(i3 >= -4) {
          i3 = i3 - i2;
        System.out.println(i3);
      }

      int a = 10;
      int sum = 0;

      do {
      a++;
      if (a % 2 > 0){
      sum = sum + a;
      }


     }while(a < 20);

        System.out.println("Сумма чисел 11+13+15+17+19 : " + sum);


      }
    }

