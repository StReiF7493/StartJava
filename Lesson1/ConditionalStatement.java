public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("мне больше 20 лет");
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("я мужского пола");
        } else if(!isMale) {
            System.out.println("я не мужского пола");
        }

        float height = 1.78f;
        if(height < 1.80) {
            System.out.println("мой рост меньше 1.80м");
        } else {
            System.out.println("мой рост больше 1.80м");
        }

        char firstNameLetter = 'E';
        if(firstNameLetter == 'M') {
            System.out.println("мое имя начинается с буквы M");
        } else if(firstNameLetter == 'N') {
            System.out.println("моё имя начинается с буквы N");
        } else {
            System.out.println("моё имя начинается с другой буквы");
        }
    }
}