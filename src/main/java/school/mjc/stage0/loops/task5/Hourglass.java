package school.mjc.stage0.loops.task5;

import java.io.PrintStream;

public class Hourglass {



    public  void printHourglassOfGivenSize(int height) {
        if (height <= 0) {
            return;
        }
        int middle = height/2+1;
        for (int i=1; i<=middle; i++) {
            String newLine = "";

            for (int k = 1; k <= height; k++) {
               if (k >= i && k<= height-i+1) {
                    newLine = newLine + "8";
                } else {
                    newLine = newLine + " ";
                }

            }
            if (!newLine.contains("8")){
                continue;
            }
            System.out.println(newLine);
        }

        for (int i=middle-1; i > 0; i--) {
            String newLine = "";

            for (int k = 1; k <= height; k++) {
                if (k >= i && k<= height-i+1) {
                    newLine = newLine + "8";
                } else {
                    newLine = newLine + " ";
                }
            }
            if (!newLine.contains("8"))
                continue;

            System.out.println(newLine);
        }




    }
}
