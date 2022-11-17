package GymnasieArbete;

public class Siffror {
    public static void main(String[] args) {
        for (int i=0 ; i<9 ; i++) {
            double siffror = Math.random();
            int helt = (int) (siffror * 53);
            System.out.println(helt);
        }

    }
}
