import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Filetask {

    public static void main(String[] args) {
        int line = 0;
        int words = 0;

        try {

            FileWriter writer = new FileWriter("Internship.txt");

            Scanner Scan = new Scanner(new File("Codveda.txt"));

            System.out.println("------------ data  present in reader file----");

            while (Scan.hasNextLine()) {

                String lines = Scan.nextLine();

                System.out.println(lines);

                writer.append(lines).append("\n");

                if (lines.trim().length() > 0) {

                    String[] Wordsplit = lines.trim().split("\\s+");

                    words += Wordsplit.length;

                    line++;
                }
            }
            writer.append("Total number of words are :" + words);

            System.out.println("-----------------------");
            System.out.println("NO of lines in the file : " + line);

            writer.close();
            Scan.close();

        } catch (IOException e1) {

            System.out.println("Sorry file is not found");

        }

    }

}
