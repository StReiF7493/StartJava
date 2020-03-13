public class ConditionalStatement {
    public static void main(String[] args) {
        int MyAge = 21;
        if(MyAge>20){
          System.out.println("мне больше 20 лет");
        }

        boolean gender = true;
        if(gender==true){
          System.out.println("я мужского пола");
        } else if(gender==false){
          System.out.println("я не мужского пола");
        }

        float MyHeight = 1.78f;
        if(MyHeight<1.80){
          System.out.println("мой рост меньше 1.80м");
        } else {
          System.out.println("мой рост больше 1.80м");
        }

        char MyName = 'E';
        if(MyName == 'M'){
          System.out.println("мое имя начинается с буквы M");
        } else if(MyName == 'N'){
          System.out.println("моё имя начинается с буквы N");
        } else {
          System.out.println("моё имя начинается с другой буквы");
        }
    }
}





