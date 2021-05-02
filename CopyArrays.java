import java.util.Arrays;

public class CopyArrays {

    static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        int[] srcIntArr = { 10, 20, 564 };

        // Copy by reference
        int[] destIntArr1 = srcIntArr;
        srcIntArr[0] = 25;
        printArr(destIntArr1);

        int[] destIntArr2 = new int[srcIntArr.length];
        // Copy using loop
        for (int i = 0; i < srcIntArr.length; i++)
            destIntArr2[i] = srcIntArr[i];
        printArr(destIntArr2);

        int[] destIntArr3 = new int[srcIntArr.length];
        // Copy using System.arraycopy
        System.arraycopy(srcIntArr, 0, destIntArr3, 0, srcIntArr.length);
        printArr(destIntArr3);

        // Copy using Arrays.copyOfRange
        int[] destIntArr4 = Arrays.copyOfRange(srcIntArr, 0, srcIntArr.length);
        printArr(destIntArr4);

    }

}
