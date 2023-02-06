package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void main (String[]args){
        printRectangleFrom8s(6,8);
    }
    public static void printRectangleFrom8s(int length, int height){
        if (height <= 0) {
            return;
        }
        for (int i=1; i<=height; i++){
            String newLine = "";
            if (i==1 || i==height) {
                for (int j = 1; j <= length; j++) {
                    newLine = newLine + "8";
                }
            } else {
                for (int k = 1; k <= length; k++)
                    if (k == 1 || k == length) {
                        newLine = newLine + "8";
                    } else {
                        newLine = newLine + " ";
                    }
                }
            System.out.println(newLine);
        }

    }
}
