/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexample;

/**
 *
 * @author St.Bizzle
 */
public class Student {
    private String name;
    private int age;
    private double GPA;
    
    public Student(){}
    
    public Student(String a, int b, double c){
        this.name = a;
        this.age = b;
        this.GPA = c;
    }
    
    public void setName(String a){
        this.name = a;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    
    public int getAge(){
        return this.age;
    }
    
    public void setGPA(double a){
        this.GPA = a;        
    }
    
    public double getGPA(){
        return this.GPA;
    }
    
    public int getYearOfBirth(){
        return 2016 - this.age;
    }
    
    public void ToString(){
        System.out.println("This student names '" + this.getName() + "', was born in '" + this.getYearOfBirth() + "', ages '" + this.getAge() + "', and got GPA: '" + this.getGPA() + "'.");
        
    }
    
    
    
    
}
