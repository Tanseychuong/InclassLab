
public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setName(String name){ // setter for name variable
        this.name = name;
    }
    public String getName(){ // getter for name variable
        return name;
    }
    public void setAge(int age){ // setter for age variable
        if(age<=0){
            System.out.println("Error! You must enter valid age");
        }else{this.age = age;}
    }
    public int getAge(){ // getter for age variable
        return age;
    }
    public void setGender( String gender){ // setter for gender variable
        if(gender.equalsIgnoreCase( "male") || (gender.equalsIgnoreCase("female"))){
            this.gender = gender; }
        System.out.println("Error, gender must either be male or female");

    }
    public String getGender(){ // getter for gender variable
        return gender;
    }

}