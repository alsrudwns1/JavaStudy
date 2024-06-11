package quiz;

public class QuUpgradeGuGu {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int count = 1; count <= 9; count++) {
                int result = 1;
                for (int j = 1; j <= count; j++) {
                    result *= i;
                    System.out.print(i);
                    if (j < count) {
                        System.out.print(" X ");
                    } else if (j==1) {
                    	System.out.print(" X " + 1);
                    }
                }
                System.out.println(" = " + result);
            }
        }
    }
}


