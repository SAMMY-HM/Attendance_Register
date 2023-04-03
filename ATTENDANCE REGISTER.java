import java.util.Scanner;
public class Attenndance_Reg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Variable to store the lenght of the register array
        System.out.println("Enter the number of members in the attendance register: ");
        int x = input.nextInt();

        // Initiaise array and display prompt to enter the names
        String names[] = new String[x];
        System.out.println("Enter the names: ");

        
        // It gets the names from the console and input into the array
        for(int i = 0; i < names.length; i++){
        Scanner input2 = new Scanner(System.in);
        names[i] = input2.nextLine();
        }
        /*  prints the names of the array 
        System.out.println("The following are the names in the register: ");
