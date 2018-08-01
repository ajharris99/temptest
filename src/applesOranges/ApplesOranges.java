/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applesOranges;

/**
 *
 * @author Andrew
 */
public class ApplesOranges {
   static int applePrice = 60, orangePrice = 25;

    /**
     * @param args the command line arguments.  A list of leading substrings
     * of "apple" and "orange" (case insensitive), so, e.g. Apple, oran, APP would be OK
     */
    public static void main(String[] args) {
        int nApples = 0, nOranges = 0;

        for (String item : args) {
            if (!item.isEmpty()) {
                if ("apple".matches(item.toLowerCase() + ".*")) {
                    nApples++;
                }
                else if ("orange".matches(item.toLowerCase() + ".*")) {
                    nOranges++;
                }
                else {
                    System.err.println("Invalid item" + item);
                }
            }
        }
        
        checkout(nApples, nOranges);
    }
    
    private static void checkout(int nApples, int nOranges) {
        System.out.format("Total cost of %d apple%s and %d orange%s is £%.2f\n",
                nApples, (nApples == 1 ? "" : "s"),
                nOranges, (nOranges == 1 ? "" : "s"),
                (nApples  * applePrice + nOranges * orangePrice)/100.0);
        // Special offer modification
        //        ((nApples - nApples / 2) * applePrice + (nOranges - nOranges / 3) * orangePrice)/100.0);
    }
}
