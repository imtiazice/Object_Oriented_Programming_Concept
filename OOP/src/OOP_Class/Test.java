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
        
        Teacher teacher1; //object declare
        teacher1 = new Teacher();  //object create
        teacher1.name = "Imtiazur Rahman";
        teacher1.gender ="male";
        teacher1.phone =  1726791880;
        
        System.out.println("Name : "+ teacher1.name);
        System.out.println("Gender : "+ teacher1.gender);
        System.out.println("Phone : "+ teacher1.phone);
        
        Teacher teacher2 = new Teacher(); //object declare & object create
        teacher2.name = "Abdur Rahman";
        teacher2.gender ="male";
        teacher2.phone =  1826791889;
        
        System.out.println("");
        System.out.println("Name : "+ teacher2.name);
        System.out.println("Gender : "+ teacher2.gender);
        System.out.println("Phone : "+ teacher2.phone);
    }
    
}
