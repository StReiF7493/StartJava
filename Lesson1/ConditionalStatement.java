public class ConditionalStatement {
    public static void main(String[] args) {
        int myAge = 21;
        if(myAge > 20) {
            System.out.println("мне больше 20 лет");
        }
        boolean gender = true;
        if(gender == true) {
            System.out.println("я мужского пола");
        }
        else if(gender == false) {
            System.out.println("я не мужского пола");
        }
        float myHeight = 1.78f;
        if(myHeight < 1.80) {
            System.out.println("мой рост меньше 1.80м");
        }
        else {
            System.out.println("мой рост больше 1.80м");
        }
        char myName = 'E';
        if(myName == 'M') {
            System.out.println("мое имя начинается с буквы M");
        }
        else if(myName == 'N') {
            System.out.println("моё имя начинается с буквы N");
        }
        else {
            System.out.println("моё имя начинается с другой буквы");
        }
    }
}