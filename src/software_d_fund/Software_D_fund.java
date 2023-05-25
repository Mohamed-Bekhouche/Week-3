/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software_d_fund;

/**
 *
 * @author medbe
 */
import java.util.Scanner;
public class Software_D_fund {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student[] list = new Student[3] ;
        Scanner in = new Scanner(System.in) ;
        for (int i = 0 ; i <list.length;i++)
        {
            System.out.print("Enter name of the " + (i+1) + " student:  ");
            String n = in.next() ;
            System.out.print("Enter age of the " + (i+1) + " student:  ");
            int a = in.nextInt();
            Student s1 = new Student(n,a) ;
            list[i] = s1 ; 
        }
        for(int i = 0 ; i <list.length ; i++)
        {
            System.out.println(list[i].getName());
            System.out.println(list[i].getAge());
        }
         System.err.println("Hello world");
    }
    
}
