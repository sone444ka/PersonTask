public class Person {

    String name;
    int age;
    String profession;


    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    public void setProfession(String newProfession) {
        profession = newProfession;
    }

    
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession);
    }
}

