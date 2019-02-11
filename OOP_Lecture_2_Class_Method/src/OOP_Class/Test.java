/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Class;

/**
 *
 * @author DCL
 */
public class Test {
    public static void main(String[] args) {
        
        Teacher teacher; //object declare
        
        teacher = new Teacher();  //object create
        teacher.name = "Imtiazur Rahman";
        teacher.gender ="male";
        teacher.phone =  1726791880;
        teacher.display_information();
        
        Teacher teacher2 = new Teacher(); //object declare & object create
        teacher2.name = "Abdur Rahman";
        teacher2.gender ="male";
        teacher2.phone =  1826791889;
        teacher2.display_information();
    }

    
}
