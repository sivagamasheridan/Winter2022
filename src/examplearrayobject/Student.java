/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplearrayobject;

/** define Student , Name and Age = Model - rw data and method 
 *
 * @author sivagamasrinivasan
 */
public class Student 
{
    private String name; //variables private - encapsulation principle
    private int age;

    /**
     * @return the name
     */
    public Student(String s,int a)
    {
        this.name = s;
        this.age=a;
    }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
