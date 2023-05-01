import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Programmer programmer=new Programmer(scanner.nextLine(), scanner.nextLine(),scanner.nextInt());
        programmer.getAge();
        System.out.println(programmer.name+"\n"+programmer.surName+"\n"+programmer.age);

         Scanner scanner1=new Scanner(System.in);
        Programmer programmer1=new Programmer(scanner1.nextLine(), scanner1.nextLine(),scanner1.nextInt());
        programmer1.getAge();
        System.out.println(programmer1.name+"\n"+programmer1.surName+"\n"+programmer1.age);
        programmer1.getAge();



    }
}