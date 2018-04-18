/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whyloop;

/**
 *
 * @author Kao
 */
public class WhyLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i=0; i<10 ; ) {
           // i++ increments first then returns the old value = loop
           // ++i increments first then returns the new value = IT'S FINE
           i = ++i;
  System.out.println("i:" +i);
}
    }
    
}
