
package org.example;

public class App {
    public static void main(String[] args) {
         GroceryCounter counter = new GroceryCounter();
 
System.out.println(counter.total()); // This would print out $0.00
 
counter.tens();
counter.tens();
counter.hundredths();
 
System.out.println(counter.total()); // This would print out $20.01
System.out.println(counter.overflows()); // This would print out 0
 
for(int i = 0; i < 35; i++) {
  counter.ones();
}
 
System.out.println(counter.total()); // This would print out $55.01
System.out.println(counter.overflows()); // This would print out 0
 
for(int i = 0; i < 100; i++) {
  counter.ones();
}
 
System.out.println(counter.total()); // This would print out $55.02
System.out.println(counter.overflows()); // This would print out 1
 
counter.clear();
 
System.out.println(counter.total()); // This would print out $0.00
System.out.println(counter.overflows()); // This would print out 0
    }
}