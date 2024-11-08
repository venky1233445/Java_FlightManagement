package librarianManagement;

import java.util.Scanner;

public class methodsImplementation implements Admin {

    // Counters to track added books
    private int historyCount = 0;
    private int geographyCount = 0;
    private int polityCount = 0;
    private int entertainmentCount = 0;

    @Override
    public void addbooks() {
        String bookid;
        String booknames;
        int count = 0;
        System.out.println("welcome to admin add books");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Do you need to add a book (yes/no)?");
            String respond = sc.next();
            if (respond.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Enter new book id:");
            bookid = sc.next();
            System.out.println("Enter new book name:");
            booknames = sc.next();
            count++;
            System.out.println("Book Added Successfully: " + count + " | Book ID: " + bookid + " | Book Name: " + booknames);
        }
    }

    @Override
    public void students() {
        String studentDetails;
        String studentName;
        String studentRollNo;
        String studentAddress;
        System.out.println("welcome admin students");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        studentName = sc.next();
        System.out.println("Enter student roll number:");
        studentRollNo = sc.next();
        System.out.println("Enter student address:");
        studentAddress = sc.next();

        studentDetails = studentName + "  " + studentRollNo + "  " + studentAddress;
        System.out.println("Details of student: " + studentDetails);
    }

    @Override
    public void returnbooksdta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome return books for admin");
        System.out.println("Confirm to return book (yes/no):");
        String response = sc.next();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter Book ID:");
            String bookID = sc.next();
            System.out.println("Enter student name:");
            String studentName = sc.next();
            System.out.println("Enter roll number:");
            String studentRollNo = sc.next();
            System.out.println("Enter phone number:");
            String phone = sc.next();

            String returnBooks = bookID + " | " + studentName + " | " + studentRollNo + " | " + phone;
            System.out.println("Book returned successfully: " + returnBooks);
        } else {
            System.out.println("You cannot return the book.");
        }
    }

    @Override
    public void Borrow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Confirm to borrow book (yes/no):");
        String response = sc.next();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter Book ID:");
            String bookID = sc.next();
            System.out.println("Enter student name:");
            String studentName = sc.next();
            System.out.println("Enter roll number:");
            String studentRollNo = sc.next();
            System.out.println("Enter phone number:");
            String phone = sc.next();

            String borrowBook = bookID + " | " + studentName + " | " + studentRollNo + " | " + phone;
            System.out.println("Book borrowed successfully: " + borrowBook);
        } else {
            System.out.println("You cannot borrow the book.");
        }
    }

    @Override
    public void returns() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID:");
        String studentID = sc.next();
        System.out.println("Enter student name:");
        String studentName = sc.next();
        System.out.println("Enter book name:");
        String bookName = sc.next();

        String returnDetails = studentID + " | " + studentName + " | " + bookName;
        System.out.println("Book returned successfully: " + returnDetails);
    }

    @Override
    public void indianHistory() {
        System.out.println("Available Books on Indian History:");
        if (historyCount == 0) {
            System.out.println("1. 'India After Gandhi' by Ramachandra Guha (Available)");
            System.out.println("2. 'The Discovery of India' by Jawaharlal Nehru (Available)");
            System.out.println("3. 'The Wonder That Was India' by A.L. Basham (Available)");
            System.out.println("4. 'The Argumentative Indian' by Amartya Sen (Available)");
        } else {
            System.out.println("No books available in this category.");
        }
    }

    @Override
    public void indianGeography() {
        System.out.println("Available Books on Indian Geography:");
        if (geographyCount == 0) {
            System.out.println("1. 'Geography of India' by Majid Husain (Available)");
            System.out.println("2. 'Oxford School Atlas' by Oxford University Press (Available)");
            System.out.println("3. 'India: A Comprehensive Geography' by D.R. Khullar (Available)");
            System.out.println("4. 'Indian Geography: For Civil Services' by K. Siddhartha (Available)");
        } else {
            System.out.println("No books available in this category.");
        }
    }

    @Override
    public void indianPolity() {
        System.out.println("Available Books on Indian Polity:");
        if (polityCount == 0) {
            System.out.println("1. 'Indian Polity' by M. Laxmikanth (Available)");
            System.out.println("2. 'Introduction to the Constitution of India' by Durga Das Basu (Available)");
            System.out.println("3. 'Our Parliament' by Subhash Kashyap (Available)");
            System.out.println("4. 'The Indian Constitution: Cornerstone of A Nation' by Granville Austin (Available)");
        } else {
            System.out.println("No books available in this category.");
        }
    }

    @Override
    public void entertainment() {
        System.out.println("Available Books on Entertainment:");
        if (entertainmentCount == 0) {
            System.out.println("1. 'Bollywood: A History' by Mihir Bose (Available)");
            System.out.println("2. 'Enlightening the Listener: Contemporary North Indian Classical Music' by Matthew Rahaim (Available)");
            System.out.println("3. 'The Music Room' by Namita Devidayal (Available)");
            System.out.println("4. 'The Art of Watching Films' by Dennis Petrie and Joe Boggs (Available)");
        } else {
            System.out.println("No books available in this category.");
        }
    }
}





