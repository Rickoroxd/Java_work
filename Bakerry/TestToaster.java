//Jakkrapong Sunsalai
//6709616384
package Bakerry;

public class TestToaster {
    public static void main(String[] args){
        Toaster t = new Toaster();
        Bread b = new Bread();
        Cookie c = new Cookie();
        t.add(b);
        t.add(c);
        t.print();
        b.toast();
        c.toast();
        t.print();
    }
}
