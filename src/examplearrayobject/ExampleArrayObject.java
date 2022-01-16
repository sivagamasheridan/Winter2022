/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplearrayobject;

import java.util.Scanner;

/**
 * Array of objects - Student - encapsulation
 * @author sivagamasrinivasan
 * changes in working tree
 */
public class ExampleArrayObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Student[] list = new Student[2];  //array of object of Student class
        Scanner in = new Scanner(System.in);
       
       for(int i=0;i<list.length;i++)
         {
           String n = in.next();
            int age = in.nextInt();
          Student s3 = new Student(n,age);
          list[i]=s3;
        }
    
for(Student x:list)
{
    System.out.println(x.getName() +" " + x.getAge());
    
}
       
    }
}
