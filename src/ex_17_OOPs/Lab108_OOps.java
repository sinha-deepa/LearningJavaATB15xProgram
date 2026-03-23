package ex_17_OOPs;

public class Lab108_OOps {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Somya";

        Person p2 = new Person();
        p2.name = "Tomya";

        Person p3 = new Person(); // fixed
        p3.name = "Rahul";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);
    }
}