package java_hw_3.methods;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the program (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine();
        System.out.print("Enter OS (MacOs, Windows, Linux): ");
        String OS = scanner.nextLine();
        String link = DownloadLink(program, OS);
        System.out.println("Download: " + link);
        scanner.close();
    }

    public static String DownloadLink(String program, String OS) {
        switch (program) {
            case "IntelliJ IDEA":
                switch (OS) {
                    case "MacOs":
                        return "https://www.jetbrains.com/idea/download/?section=mac";
                    case "Windows":
                        return "https://www.jetbrains.com/idea/download/?section=windows";
                    case "Linux":
                        return "https://www.jetbrains.com/idea/download/?section=linux";
                    default:
                        return "OS doesn't exist";
                }
            case "Git":
                switch (OS) {
                    case "MacOs":
                        return "https://git-scm.com/install/mac";
                    case "Windows":
                        return "https://git-scm.com/install/windows";
                    case "Linux":
                        return "https://git-scm.com/install/linux";
                    default:

                        return "OS doesn't exist";
                }
            case "Java":
                switch (OS) {
                    case "MacOs":
                        return "https://www.oracle.com/java/technologies/javase-jdk-mac-downloads.html";
                    case "Windows":
                        return "https://www.oracle.com/java/technologies/javase-jdk-windows-downloads.html";
                    case "Linux":
                        return "https://www.oracle.com/java/technologies/javase-jdk-linux-downloads.html";
                    default:
                        return "OS doesn't exist";
                }
            default:
                return "Program doesn't exist";
        }
    }
}





