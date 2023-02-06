package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
            return;
        }
        int middle = sideLength / 2 + 1;
        String newString = "";

        for (int i = 1; i <= sideLength; i++) {
            newString = "";
            if (i == middle) {
                for (int j = 1; j <= sideLength; j++)
                    newString = newString + "8";
            } else {
                for (int j = 1; j <= sideLength; j++) {
                    if (j == middle) {
                        newString = newString + "8";
                        continue;
                    }
                    newString = newString + " ";
                }
            }
            System.out.println(newString);
        }
    }
}

