
package ppweek3;


public class Swan extends Bird{
    
     public Swan(String name, String country, int age, double priceBase) {
         super(name, country, age, priceBase);
 //      Prints out the constructor is running        
//       System.out.println("The constructor of Swan is running");     
    }
     
    @Override
    public void moves(){
    System.out.println("The Swan is walking");
    }
    
    @Override
    public void eat(){
    System.out.println("The Swan is eating gras");
    }

    @Override
    public void sound(){
    System.out.println("The Swan is singing");
    }
     public int dangerToHumans(){
        int dangerbase = 5;
        int dangercode=0;
        dangercode = (dangerbase + 10)*2;
        return dangercode;
    }
   
}
