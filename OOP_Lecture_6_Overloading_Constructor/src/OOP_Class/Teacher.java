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
public class Teacher {
    
    String name, gender;
    int phone;
    
    /*
    Constructor Overloading
    */
    
    
    //Default Constructor Method

    public Teacher() {
        System.out.println("No Information");
    }
    
    
    //2 Parameterised Constructor Method 
    public Teacher(String n_me, String g_nder) {
        name = n_me;
        gender = g_nder;
    }
    
    
    //3 Parameterised Constructor Method
    
    public Teacher(String n_me, String g_nder, int p_one) {
        name = n_me;
        gender = g_nder;
        phone = p_one;
    }
    
    
     
    void display_information(){
       
        System.out.println("");
        System.out.println("Name : "+ name);
        System.out.println("Gender : "+ gender);
        System.out.println("Phone : "+ phone);
        System.out.println("\n\n");
 
    }
    
 
    
}