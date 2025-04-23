import java.util.ArrayList;

public class Toaster{
    
    private ArrayList<Toastable> items = new ArrayList<>();

    public Toaster(){
        items = new ArrayList<>();
    }
    
    public void add(Toastable item){
        items.add(item);
    }
    public void print(){
        System.out.println();
        for(Toastable i:items){
            System.out.println(i);
        }
    }
}
