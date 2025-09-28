/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmetric_operations;

/**
 *
 * @author lab_services_student
 */
public class Arithmetric_operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         operations used in java:
Addition: +
subtraction: -
multiplication: *
Dvision: /
*/
        
        //Declarations
        int valOne;
        int valTwo;
        int addResult;
        int subResult;
        int multiply;
        int divide;
        
        //assign values to variables
        valOne=10;
        valTwo=20;
        
        
        //addition operation
        addResult = valOne + valTwo;
        //30 = 10 + 20
        
        //subtraction operation
        subResult= valTwo;
                // -10= 10-20
        
          //multiplication
          multiply= valTwo * valOne;
          
           //Division operation
           divide = valTwo / valOne;
                   
                   //display 
                   System.out.println("****results****\naddition: " +addResult+
                           "\nsubtraction: " + subResult+ "\nmultiplication: " +
                           multiply + "\ndivision: " + divide);
    }
    
}
