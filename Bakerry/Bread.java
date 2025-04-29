//Jakkrapong Sunsalai
//6709616384
package Bakerry;

public class Bread implements Toastable{
    public static final String BURNT = "Burn" ;
    public static final String CRISP = "Crisp" ;
    public static final String SOFT = "Soft" ;
    private String state;
    
    public Bread(){
        state = SOFT;    
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public String toString(){
        return "Bread is now :" + getState() ; 
    }
    public void toast(){
      if(state.equals(SOFT)){
        state=CRISP;
      }
      else if(state.equals(CRISP)){
        state=BURNT;
      }
    }
    public void getToastState() {
        System.out.println(state);
    }
}