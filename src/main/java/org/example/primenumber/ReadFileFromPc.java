package org.example.primenumber;

import java.io.*;
import java.util.Scanner;

public class ReadFileFromPc {

    public static void fileRead() throws FileNotFoundException {
        File file = new File("C:\\Users\\Venukumar\\Desktop\\Readfilejava.txt");
        Scanner s = new Scanner(file);
        while (s.hasNextLine()){
            System.out.print(s.next());
        }

    }
    public static void writeFile() throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Venukumar\\Desktop\\Readability.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("writing the content from java program");
        System.out.println("finished");
        bw.close();
    }

}
