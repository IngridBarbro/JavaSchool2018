
package ppweek3;


public class Vulcher extends Bird implements Predator{
    public Vulcher(String name, String country, int age, double priceBase) {
        super(name, country, age, priceBase);
 //     Prints out the constructor is running       
//      System.out.println("The constructor of Eagle is running");    
    }
        
    @Override
    public void moves(){
    System.out.println("The Eagle is resting");
    }
    
    @Override
    public void eat(){
    System.out.println("The Eagle is eating");
    }
    
    @Override
    public void sound(){
    System.out.println("The Eagle is roaring");  
    }
    public int dangerToHumans(){
        int dangerbase = 10;
        int dangercode=0;
        dangercode = dangerbase + 30;
        return dangercode;
    }
   

 


    @Override
    public double calculatesalesPrice() {
        return age*priceBase/5+PRICEBONUS;
    }
}

    

