import java.util.Scanner;

public class AppointmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Hospital Appointment Booking System ===");
        

        // 1. Get User Input
        System.out.print("Enter Patient Name: ");
        String patient = scanner.nextLine();
        
        System.out.println("\nAvailable Doctors:\n1. Dr. Smith (Cardiology)\n2. Dr. Jones (Pediatrics)");
        System.out.print("Select Doctor (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear input buffer
        
        System.out.print("Enter Appointment Time (e.g., 10:00 AM): ");
        String time = scanner.nextLine();
        
        // 2. Process and Display Booking
        String doctor = (choice == 1) ? "Dr. Smith" : "Dr. Jones";
        System.out.println("\n✔ Appointment Confirmed Successfully!");
        System.out.println("Patient: " + patient + " | Doctor: " + doctor + " | Time: " + time);
        
        scanner.close();
        gggkgk
    }
}
