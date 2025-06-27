import java.io.*;
import java.util.Scanner;

public class NotesManager {
    static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("===== Text-Based Notes Manager =====");

        do {
            System.out.println("\n1. Write New Note");
            System.out.println("2. View Notes");
            System.out.println("3. Append to Notes");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    writeNewNote(scanner);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    appendNote(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Option 1: Write a new note (overwrites file)
    public static void writeNewNote(Scanner scanner) {
        System.out.println("Enter your note (type 'END' to finish):");
        try (FileWriter fw = new FileWriter(FILE_NAME, false)) {
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
                fw.write(line + "\n");
            }
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing note: " + e.getMessage());
        }
    }

    // Option 2: View notes
    public static void viewNotes() {
        System.out.println("Your Notes:");
        try (FileReader fr = new FileReader(FILE_NAME);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found.");
        } catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }

    // Option 3: Append a note
    public static void appendNote(Scanner scanner) {
        System.out.println("Enter text to append (type 'END' to finish):");
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
                fw.write(line + "\n");
            }
            System.out.println("Note appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending note: " + e.getMessage());
        }
    }
}
