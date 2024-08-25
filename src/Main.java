public class Main {
    public static void main(String[] args) {
        int array1[] = new int[]{1, 2, 3};
        double array2[] = new double[]{1.57, 7.654, 9.986};
        int array3[] = new int[6];
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) System.out.print(",");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) System.out.print(",");
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) System.out.print(",");
        }
        System.out.println();
        //task3
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) System.out.print(",");
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) System.out.print(",");
        }
        System.out.println();

        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0) System.out.print(",");
        }
        System.out.println();
//        task4
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i]++;
            }
            System.out.print(array1[i]);
            if (i != array1.length - 1) System.out.print(",");
        }
    }
}