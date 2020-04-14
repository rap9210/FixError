import java.util.Scanner;
public class FixError {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int Age = input.nextInt();
        System.out.println("Enter your DOB year:");
        int dob = input.nextInt();
        System.out.println("Summary: "+ "\nYour name is: "+name+"\n" +
                "Your age is: "+Age+"\n"+"Your birth year is: "+dob);

    }


}
