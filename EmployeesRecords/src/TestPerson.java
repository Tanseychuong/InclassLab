/*
 * CS 213: Object Oriented Programming
 * Lab Exercise 3 - Exercise 3
 * Author: Chuong T. N. Mayian
 * Description:
 *   A Person class that stores a person's name, age, and gender.
 *   Includes validation to prevent invalid input.
 */
public class TestPerson {
    public static void main(String[] args){
        Person person1 = new Person("Chuong",24,"male");

        // printing the initial information
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());

        // updating the person1 information
        person1.setName("Chuong");
        person1.setAge(-1);
        person1.setGender("robot");

        // printing the updated information
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}
