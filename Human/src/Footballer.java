public class Footballer extends People {

    public Footballer(String name, String profession, int age) {
        super(name, profession, age);
    }

    public void display() {
        System.out.println(" Profession: " + getProfession() + "Age: " + getAge());
    }


}
