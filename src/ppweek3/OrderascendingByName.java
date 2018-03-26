
package ppweek3;

import java.util.Comparator;


public class OrderascendingByName implements Comparator<Bird> {
    
    @Override
    public int compare(Bird o1, Bird o2) {
       return o1.name.compareTo(o2.name);
    }
}
