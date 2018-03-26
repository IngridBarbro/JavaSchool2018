//
package ppweek3;

import java.util.Comparator;


public class OrderdescendingByName implements Comparator<Bird>{

    @Override
    public int compare(Bird o1, Bird o2) {
       return o2.name.compareTo(o1.name);
    }
    
}
