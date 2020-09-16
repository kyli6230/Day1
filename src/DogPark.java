
import java.util.Scanner;


public class DogPark {

    public static void main(String[] args) {
        Dog roger = new Dog(); //roger is an instance of the dog class
        if (roger instanceof Dog)    
            System.out.println("Roger is a dog");
        
        //assign properties to roger
        roger.age = 5;
        roger.breed = "Collie";
        roger.color = "tan";
        roger.weight = 28;
        roger.name = "Roger";
        
        //lets get roger to do things
        roger.sayHello();
        roger.bark();
        roger.eat();
        roger.eat();
        roger.eat();
        roger.bark();
        
        //lets make dakota
        Scanner s = new Scanner(System.in);
        Dog Dakota = new Dog("Lab","Dakota","brown",30,10);
        Dakota.sayHello();
        Dakota.bark();
        Dakota.eat();
    }
    
}
