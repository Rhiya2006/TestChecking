/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_and_perimeter;

/**
 *
 * @author lab_services_student
 */
public class Area_and_Perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* constant in java are always in capital letters*/
        
      //  double PI = 3.14;
        double radius = 6.6;
        int diameter = 13;
        
        double area = Math.PI * Math.pow(radius, 2)  ;
        double perimeter = 2 * Math.PI * radius ;
        
        System.out.println("the area is "+ Math.round(area));
        System.out.println("the perimeter is "+ Math.round(perimeter));
    }
    
}
