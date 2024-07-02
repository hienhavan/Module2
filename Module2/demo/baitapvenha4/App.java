package demo.baitapvenha4;

import demo.baitapvenha4.StudentManager;

import java.util.Scanner;

public class App implements choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Import students from file:");
            System.out.println("6. Export students to file:");
            System.out.println("7. Exit");
            System.out.println("Nhap lua chon: ");
            try {
                choice = sc.nextInt();
                switch (choice) {
                    case ADD_STUDENT:
                        studentManager.addStudent();
                        break;
                    case UPDATE_STUDENT:
                        studentManager.updateStudent();
                        break;
                    case DELETE_STUDENT:
                        studentManager.deleteStudent();
                        break;
                    case SHOW_STUDENTS:
                        studentManager.showStudents();
                        break;
                    case IMPORT_STUDENTS:
                        studentManager.importStudents();
                        break;
                    case EXPORT_STUDENTS:
                        studentManager.exportStudents();
                        break;
                    case EXIT:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        while (true);
    }
}
