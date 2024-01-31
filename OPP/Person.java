package OPP;

public class Person{

    public static void main(String[] args) {
        Person person1 = new Person("ibrahim", 23, null);
        person1.gender = "male";
        
        System.out.println("name: " + person1.getName()+" age: "+ person1.getAge() + " gender: " + person1.getGender() );
    }

    private String name;
    private int age;
    private String gender;
    
  public Person(String name, int age, String gender){
        this.name = name ;
        this.age = age;
       
  }

  // getter methods;

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String getGender(){
    return this.gender;
  }

  public String setGender(String gender){
    return this.gender = gender;
  }


  
    
}

