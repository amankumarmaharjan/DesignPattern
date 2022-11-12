package visitor;

public class kuku implements  Bird{

    private String name;

    public kuku(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

}
