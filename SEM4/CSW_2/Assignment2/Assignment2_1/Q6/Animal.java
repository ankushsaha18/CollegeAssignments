package Assignment2.Assignment2_1.Q6;

public class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int hashCode(){
        return name.hashCode() + color.hashCode() + type.hashCode();
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Dog","White","Pet");
        Animal a2 = new Animal("Lion","Golden","Wild");
        Animal a3 = new Animal("Cat","Black","Pet");
        Animal a4 = new Animal("Elephant","Grey","Wild");
        System.out.println("Hash code of " + a1.getName() + " is = " + a1.hashCode());
        System.out.println("Hash code of " + a2.getName() + " is = " + a2.hashCode());
        System.out.println("Hash code of " + a3.getName() + " is = " + a3.hashCode());
        System.out.println("Hash code of " + a4.getName() + " is = " + a4.hashCode());
    }
}
