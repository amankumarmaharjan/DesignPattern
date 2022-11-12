package visitor;

public class BirsVisitorImpl implements  BirdVisitor{
    public void makeSound(Cock cock) {
        System.out.println("cocaaak");
    }
    public void makeSound(kuku kuku) {
        System.out.println("kuku");
    }

}
