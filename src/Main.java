import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lop2d lop2d = new Lop2d(2,4);
        System.out.println(lop2d);
        Lop3d lop3d = new Lop3d(lop2d.getX(), lop2d.getY(), 6);
        System.out.println(lop3d);
        System.out.println(Arrays.toString(lop3d.getXYZ()));

    }



}