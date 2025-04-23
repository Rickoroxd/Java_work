package Bakerry;

public class Cookie implements Toastable{
    public static final String BURNT = "Burn" ;
    public static final String CRISP = "Crisp" ;
    public static final String SOFT = "Soft" ;

    private String state;
    
    public Cookie(){
        state = SOFT;    
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public String toString(){
        return "Cookie is now :" + state ; 
    }
    public void toast() {
      
    }
    public void getToastState(){
        
    }

}