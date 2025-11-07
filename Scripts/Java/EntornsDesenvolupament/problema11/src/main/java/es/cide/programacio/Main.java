package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int p = 0;
        int q = 0;
        int bestp=0;
        int bestq=0;
        int minimo;
        boolean active = true;
        while (active) {
            String input = sc.next();
            if (input.equals(".")) {
                active = false;
            } else {
                n = Integer.parseInt(input);
                minimo = n;
                for (p = 0; p <= n/7 ; p++) {
                    int resto = n - (7 * p);
                    if (resto % 4 == 0) {
                        q = resto/4;
                        if(p+q<minimo){
                            bestp = p;
                            bestq = q;
                            minimo=p+q;
                        }
                    }

                }
                System.out.println(bestp + " " + bestq);

            }
        }

        sc.close();
    }
}