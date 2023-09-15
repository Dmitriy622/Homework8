import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] box1 = new int[3];
        box1[0] = 1;
        box1[1] = 2;
        box1[2] = 3;

        double[] box2 = {1.57, 7.654, 9.986};

        int[] box3 = {17, 28, 37, 96, 185};

        System.out.println("Задание 2");

        for (int a = 0; a <= box1.length; a++) {
            if (a == box1.length - 1) {
                System.out.println(box1[a]);
                break;
            }
            System.out.print(box1[a] + ", ");
        }

        for (int b = 0; b <= box2.length; b++) {
            if (b == box2.length - 1) {
                System.out.println(box2[b]);
                break;
            }
            System.out.print(box2[b] + ", ");
        }

        for (int x = 0; x <= box3.length; x++) {
            if (x == box3.length - 1) {
                System.out.println(box3[x]);
                break;
            }
            System.out.print(box3[x] + ", ");
        }

        System.out.println("Задание 3");
        for (int a = box1.length - 1; a >= 0; a--) {
            if (a == 0) {
                System.out.println(box1[a]);
                break;
            }
            System.out.print(box1[a] + ", ");
        }

        for (int b = box2.length - 1; b >= 0; b--) {
            if (b == 0) {
                System.out.println(box2[b]);
                break;
            }
            System.out.print(box2[b] + ", ");
        }

        for (int x = box3.length - 1; x >= 0; x--) {
            if (x == 0) {
                System.out.println(box3[x]);
                break;
            }
            System.out.print(box3[x] + ", ");
        }

        System.out.println("Задание 4");
        for (int i = 0; i < box1.length; i++) {
            if (box1[i] % 2 == 1) {
                box1[i] = box1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(box1));
    }
}