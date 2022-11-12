package visitor;

public class Main {
    public static void main(String[] args) {
        Cock cock = new Cock("Syakehni cock");
        System.out.println(cock.getName());

        BirsVisitorImpl visitorImpl = new BirsVisitorImpl();
        cock.accept(visitorImpl);

        Bird kuku = new kuku("KUku cock");
//        kuku.accept(visitorImpl);

    }
}








