import Lab1.Lab1;

public class Main {
    public static void main(String[] args) {

        Lab1.TaskOne t = new Lab1.TaskOne();
        t.n = 10000;

        Lab1.TaskTwo two = new Lab1.TaskTwo();
        two.n = 1000;

        System.out.println("p1 " + t.Dob());
        System.out.println("p2 " + t.Dobby());

        System.out.println("p1 " + two.Dob());
        System.out.println("p2 " + two.Dobby());

    }
}
