
package ppweek3;


public abstract  class  Bird implements Comparable<Bird>{
    
    public String name;
    public String country;
    public int age;
    public double priceBase;
    
    public Bird(String name, String country, int age, double priceBase) {
//      Prints out constructor is running          
//      System.out.println("The constructor of Bird is running");
        this.name = name;
        this.country = country;
        this.age = age;
        this.priceBase = priceBase;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(double price) {
        this.priceBase = priceBase;
    }
      
    public void moves(){
    
        System.out.println("The bird is resting");
    }
    public void eat(){
        System.out.println("The bird is eating");
    }    
    public void sound(){
        System.out.println("The bird is singing");
    
      
    }

    @Override
    public String toString() {
        return "Bird{" + "name=" + name + ", country=" + country + ", age=" + age + ", priceBase=" + priceBase + '}';
    }
   abstract public int dangerToHumans();
      
    
    @Override
    public int compareTo(Bird bird){
        return(bird.name.compareTo(this.name));
    }
}
   
    
   

