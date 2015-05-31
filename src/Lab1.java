import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab1 {

    final int MAXSIZE = 100;
    public final int MAXLENGTH = 31;
    final int MAXGRADE = 100;
    final int LOWGRADE = 0;
    final int GROUP = 10;
    final int HISTOGRAMSIZE = (MAXGRADE - LOWGRADE)/GROUP + 1; // grouped by group
    String fileName = "";

    FileReader fileReader;

    public Lab1(String fileName) {
        fileName = this.fileName;

        try {
            fileReader = new FileReader(fileName);

        }
        catch (FileNotFoundException ex) {
            System.out.print("File not found.");
        }

    }

    public boolean readFileToTempArray() {


        return true;
    }


    final class StudentType {
        int grade;
        char[] last = new char[MAXLENGTH];
        char[] first = new char[MAXLENGTH];
    };

    //functions --
        // read from file
        // insertion sort the student data
        // generate histogram
        // calculate average
        // print histogram and average

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
