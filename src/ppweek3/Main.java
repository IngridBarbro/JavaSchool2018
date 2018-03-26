package ppweek3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
 static ArrayList<Bird> birds = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Testing");
        System.out.println("Actions");

       

        Eagle eagle1 = new Eagle("Mio", "Canada", 3, 5000);
        Duck duck1 = new Duck("Sussie", "France", 1, 2000);
        Swan swan1 = new Swan("Leda", "Island", 10, 4000);
        Dowe dowe1 = new Dowe("Psyke", "China", 3, 1000);
        Eagle eagle2 = new Eagle("Mio", "Italy", 2, 8000);
        Duck duck2 = new Duck("Sessan", "Norway", 4, 2000);
        Swan swan2 = new Swan("Gisell", "France", 8, 4000);
        Dowe dowe2 = new Dowe("Bob", "Japan", 4, 1000);
        Eagle eagle3 = new Eagle("Peter", "Usa", 7, 5000);
        Duck duck3 = new Duck("Missy", "France", 1, 1500);
        Swan swan3 = new Swan("Amor", "Sweden", 12, 3000);
        Dowe dowe3 = new Dowe("Puck", "Sweden", 3, 1500);
        Eagle eagle4 = new Eagle("Bamse", "Russia", 3, 6000);
        Duck duck4 = new Duck("David", "France", 6, 1000);
        Swan swan4 = new Swan("Philip", "Island", 10, 2000);
        Dowe dowe4 = new Dowe("Carro", "Denmark", 2, 15000);
        Vulcher vulcher1 = new Vulcher("Pjotr", "Russia", 3, 3000);
        Vulcher vulcher2 = new Vulcher("Lily", "France", 6, 3000);
        Vulcher vulcher3 = new Vulcher("Boris", "Island", 10, 2500);
        Vulcher vulcher4 = new Vulcher("Carro", "Denmark", 2, 2500);

//  Print actions for birds
//  eagle1.moves();
//  eagle1.eat();
//  eagle1.sound();
//  duck1.eat();
//  duck1.moves();
//  duck1.sound();
//  swan1.moves();
//  swan1.sound();
//  swan1.eat();
//  dowe1.eat();
//  dowe1.moves();
//  dowe1.sound();
//  Adding birds to ArrayList birds
        birds.add(dowe1);
        birds.add(duck1);
        birds.add(swan1);
        birds.add(eagle1);
        birds.add(eagle2);
        birds.add(dowe2);
        birds.add(duck2);
        birds.add(swan2);
        birds.add(eagle3);
        birds.add(dowe3);
        birds.add(duck3);
        birds.add(swan3);
        birds.add(eagle4);
        birds.add(dowe4);
        birds.add(duck4);
        birds.add(swan4);
        birds.add(vulcher1);
        birds.add(vulcher2);
        birds.add(vulcher3);
        birds.add(vulcher4);

        System.out.println("Print out list of birds");
        for (Bird bird : birds) {

            System.out.println("***********************************");
            System.out.println(bird);

        }
        for (Bird bird : birds) {

            System.out.println("***********************************");
            System.out.println("Danger to humans for bird " + bird.getName() + " is " + bird.dangerToHumans());

        }
        System.out.println("List of birds");
        System.out.println("Predators");
        for (Bird bird : birds) {
            if (bird instanceof Predator) {
                System.out.println(bird + " Sales Price " + ((Predator) bird).calculatesalesPrice());
            }
        }
        System.out.println("Eagles");
        for (Bird bird : birds) {
            if (bird instanceof Eagle) {
                System.out.println(bird);
            }
        }
        System.out.println("Dowes");
        for (Bird bird : birds) {
            if (bird instanceof Dowe) {
                System.out.println(bird);
            }
        }
        System.out.println("Swans");
        for (Bird bird : birds) {
            if (bird instanceof Swan) {
                System.out.println(bird);
            }
        }
        System.out.println("Vulchers");
        for (Bird bird : birds) {
            if (bird instanceof Vulcher) {
                System.out.println(bird);
            }
        }
//    Collections.sort(birds,new OrderdescendingByName());
//        System.out.println("List of birds in descending names");
//        for (Bird bird:birds){
//        System.out.println(bird);
//        }
//    Collections.sort(birds,new OrderascendingByName());
//        System.out.println("List of birds in ascending names");
//        for (Bird bird:birds){
//        System.out.println(bird);
//        }     
//     }
        birds.sort(null);
        System.out.println(BirdFormatter.header());
        System.out.println("Print birds by descending nameorder");
        for (Bird bird : birds) {

            System.out.println(bird);

        }

        System.out.println(BirdFormatter.footer());
        System.out.println("Table of birds in descending order by name");
        System.out.println(BirdFormatter.format(birds));
        System.out.println("Print out total priceBase "+calculatetotalpriceBase());


    }
    static double calculatetotalpriceBase() {
        double totalpriceBase = 0;
        for (Bird bird : birds) {
            totalpriceBase = totalpriceBase + bird.priceBase;

        }
        return totalpriceBase;
          
    
}
}