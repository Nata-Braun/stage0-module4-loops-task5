package school.mjc.stage0.loops.task5;

public class Triangle {

    public void printTriangle(int cathetusLength) {
        if (cathetusLength <= 0) {
            return;
        }
        for (int i=1; i<=cathetusLength; i++) {
            String newLine = "";
            for (int k = 1; k <= cathetusLength; k++) {
                if (k <= i) {
                    newLine = newLine + "8";
                } else {
                    newLine = newLine + " ";
                }
            }

            System.out.println(newLine);
        }


    }
}
