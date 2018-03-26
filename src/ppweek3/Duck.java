
package ppweek3;


public class Duck extends Bird{

    public Duck(String name, String country, int age, double priceBase) {
        super(name, country, age, priceBase);
 //     Prints out constructor is running   
//      System.out.println("The constructor of Duck is running");    
    }
    
    @Override
    public void moves(){
    System.out.println("The Duck is walking");
    }
   
    @Override
    public void eat(){
    System.out.println("The Duck is eating");
    } 

    @Override
    public void sound(){
    System.out.println("The Duck is kwacking");
    
      
    }      
 public int dangerToHumans(){
        int dangerbase = 0;
        int dangercode=0;
        dangercode = dangerbase + 10;
        return dangercode;
    }
   
}