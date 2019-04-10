package LabRab.Number8;

import java.io.*;
import java.util.Scanner;

public class FilesApp {
    public static void main(String[] args) throws IOException {


        FileWriter fwrite = new FileWriter("D:\\ci\\INabc.txt", true);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        fwrite.write(str);
        fwrite.append("\n");
        fwrite.close();

        /////////

        FileReader fread = new FileReader("D:\\ci\\OUTabc.txt");
        Scanner sc_f = new Scanner(fread);
        int i=0;
        while (sc_f.hasNextLine())
        {
            System.out.println(i + " : " + sc_f.nextLine());
            i++;
        }
        fread.close();

        /////////


        FileWriter fwrite2 = new FileWriter("D:\\ci\\INabc.txt", false);
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.nextLine();
        fwrite2.write(str2);
        fwrite2.append("\n");
        fwrite2.close();

        /////////

        FileWriter fwrite3 = new FileWriter("D:\\ci\\OUTabc.txt", true);
        Scanner sc3 = new Scanner(System.in);
        String str3 = sc3.nextLine();
        fwrite3.write(str3);
        fwrite3.append("\n");
        fwrite3.close();

    }
}
