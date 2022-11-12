package visitor;

public class Cock implements Bird{
    private String name;
    String lastname;

    public Cock(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastname;
    }
    public void accept(BirdVisitor c) {
        c.makeSound(this);
    }
}
