
package ppweek3;


public class Dowe extends Bird{
   
    
    public Dowe(String name, String country, int age, double priceBase) {
        super(name, country, age, priceBase);
//      Prints out constructor is running        
//      System.out.println("The constructor of Dowe is running");
    }
    
    @Override
    public void moves(){
    System.out.println("The Dowe is sleeping");
    }
    
    @Override
    public void eat(){
    System.out.println("The Dove is humming");
    } 
    
    @Override
    public void sound(){
    System.out.println("The Dowe is crying");
    
      
    }
    public int dangerToHumans(){
        int dangerbase = 0;
        int dangercode=0;
        dangercode = dangerbase + 5;
        return dangercode;
    }
 

}

