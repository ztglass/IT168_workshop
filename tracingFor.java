package edu.ilstu;

public class tracingFor {
    public static void main(String[] args) {
        int y =6;
        int x =13;
        int z =7;
        for (int i = 0; i<y; i++){
            x+=i;
            y--;
            z-=y;
        }
        System.out.println(z+" "+y+" "+x);
    }
}
