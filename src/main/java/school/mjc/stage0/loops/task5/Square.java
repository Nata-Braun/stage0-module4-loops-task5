package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength <= 0) {
            return;
        }
        String firstString = "";
        String nextString = "";


        for (int i = 1; i <= sideLength; i++) {
            firstString = firstString + String.valueOf(8);
        }


        for (int i = 1; i <= sideLength; i++) {
            if (i > 1 && i < sideLength) {
                nextString = nextString + " ";
                continue;
            }
            nextString = nextString + String.valueOf(8);
        }


        for (int i = 1; i <= sideLength; i++) {
            if (i == 1 || i == sideLength) {
                System.out.println(firstString);
            } else {
                System.out.println(nextString);
            }
        }
    }
}








