package com.yybd;

public class x {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int z=0;
        for (x = 0; x <10 ; x++) {
            for (y = 0; y <10 ; y++) {
                for (z = 0; z <10 ; z++) {
                    if (x * 100 + y * 10 + z + y * 100 + z * 10 + z == 532) {
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("z = " + z);
                    }
                }
            }
        }
    }
}
