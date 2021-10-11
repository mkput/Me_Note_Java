package Labs;
import java.util.Arrays;

public class Operasi_array {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};

        //merubah Array menjadi String
        System.out.println("\nMerubah Array menjadi String\n=============");
        printArray(arrayAngka1);
        
        //mengkopi Array
        System.out.println("\nMengcopy Array\n=============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("mengcopy dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("mengcopy dengan CopyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("mengcopy dengan CopyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        //fill Array
        System.out.println("\nMengcopy Array\n=============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);

    }

    private static void printArray(int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }

}
