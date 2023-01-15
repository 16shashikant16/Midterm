public class Exercise10 
{
    public static void main(String[] args) 
    {
        Cat c = new Cat();
        Dog d = new Dog();
        c.walk();
        c.sound();
        d.walk();
        d.sound();
        }
    }
   
    interface Animal
    {
        void sound();
   
        default void walk(){
        System.out.println("walking...");
        }
    }
   
    class Cat implements Animal
    {
        public void sound()
        {
        System.out.println("cat does mew mew mew...");
        }
    }
    class Dog implements Animal 
    {
        public void sound()
        {
        System.out.println("dog dose bhow bhow...");
        }
}