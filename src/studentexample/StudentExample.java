/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentexample;

/**
 *
 * @author Owner
 */
public class StudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student[] list = new Student[3];
        Student s1 = new Student();
        s1.setName("Arpan");
        s1.setAge(19);
        Student s2 = new Student();
        s2.setName("Ruchit");
        s2.setAge(26);
        Student s3= new Student();
        s3.setName("Garv");
        s3.setAge(19);
        list[0] = s1;
        list[1]=s2;
        list[2]=s3;
        for( int i=0; i<list.length;i++){
            System.out.println(list[i].getName()+ " " + list[i].getAge());
        }
    }
    
}
