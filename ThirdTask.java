//Access Specifier
class Book{
    protected void print()
    {
        System.out.println("I am Reading");
    }
}
class Note extends Book{
    protected void print()
    {
        System.out.println("I am Writing");
    }
}
class test{
    public static void main(String[] args){
        Book b1 = new Book();
        Note n1 =new Note();
        b1.print();
        n1.print();
    }
}

//Method Overriding
class Animal{
    public void print(){
        System.out.println("I am a Animal");
    }
}
 class Dog extends Animal{
    public void print(){
       super.print();
        System.out.println("I am a Dog");
    }
}
class Cat extends Animal{
    public void print(){
        System.out.println("I am a Cat");
    }
}
public class test{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.print();
        c1.print();
    }
}