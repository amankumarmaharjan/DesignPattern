import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //array
        int [] a= {1,2,3};
        List<Integer>arrayList=new ArrayList<>(){{add(1);add(2);}};
        ArrayToListAdaper arrayToListAdaper= new ArrayToListAdaper(a);
        displayListSize(arrayToListAdaper);
    }

    public static void displayListSize(List l){
        System.out.println(l.size());
    }
}