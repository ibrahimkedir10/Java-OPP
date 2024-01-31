package OPP;

public  class Car {

    public static void main(String[] args) {
        // define the object[car]
        Car car1 = new Car("Ford","F150",200,5);
        System.out.println("Brand: "+car1.getBrand() + " Model: "+ car1.getModel() + " Age: "+ car1.getAge()+ " Miles: "+ car1.getMiles() + " Condition: "+ car1.start());
    }
    // define class attributes: making them private for Abstraction 
    private String brand;
    private String model;
    private int miles;
    private int age;
    // create constructor:
    public Car(String brand, String model, int miles, int age){
        this.brand = brand;
        this.model= model;
        this.miles = miles;
        this.age = age;
    }
    
    // definfing public getters / setters: Encapsulation: help close of class, make it open for inharatance but clossed to modification

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return model;
    }
    public int getMiles(){
        return this.miles;
    }

    public int getAge(){
        return this.age;
    }

    // --setter---


    public String setBrand(String brand){
        return  this.brand = brand;
    }

    public String setModel(String model){
        return this.model = model;
    }
    public int setMiles(int miles){
        return this.miles = miles;
    }
    public int setAge(int age){
        return this.age = age;
    }

    // method overloading [same parameters ]

   // method overriding? 

   public String start(){

    int condition = this.miles/ this.age;
    String quality ;
    if(condition >= 20){
        quality = "good";
    }
    else{
        quality = "bad";
    }

    return quality;
   }    


    
}




