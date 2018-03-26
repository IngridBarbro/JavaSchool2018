
package ppweek3;

import java.util.ArrayList;


public class BirdFormatter {
    
    
    public static String format(Bird bird){
        String header = header();
        StringBuilder sb = new StringBuilder();
        sb.append(header).append('\n');
        sb.append(formatWithoutBorder(bird)).append('\n');
        sb.append(footer());
        return sb.toString();
    }    
    public static String format(ArrayList<Bird>birds) {
        String header = header();
        StringBuilder sb = new StringBuilder();
        sb.append(header).append('\n');
        for(Bird bird:birds){
            sb.append(formatWithoutBorder(bird)).append('\n');
            
        }
        sb.append(footer());
        return sb.toString();
        
    }
    public static String formatWithoutBorder(Bird bird){
        return String.format("|%-10s|%-10s|%-10s|%-10s|",bird.name,bird.country, bird.age,bird.priceBase);
    
    }
    public static String footer(){
        return"*************************************************************\n";
        
        
    
    }
    public static String header(){
        return "*************************************************************\n"+
               "!  Name    ! Country   !  Age   ! priceBase!              \n"+
               "*************************************************************";
                    
        
        
    
    }
}
