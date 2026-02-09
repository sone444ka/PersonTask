public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("John", 30, "Engineer");
        Person person2 = new Person("Mary", 25, "Teacher");
        Person person3 = new Person("Bob", 35, "Doctor");


        person1.printInfo();
        person2.printInfo();
        person3.printInfo();

        System.out.println();


        Person person4 = new Person("Alice", 28, "Architect");
        person4.printInfo();


        System.out.println("(After updating profession)");
        person4.setProfession("Designer");
        person4.printInfo();
    }
}
