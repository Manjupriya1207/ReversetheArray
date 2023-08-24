public class Main {
    public static void reverseInRange(int[] A, int B, int C) {
        if (A == null || B < 0 || C >= A.length || B > C) {
            return; // Invalid input
        }

        while (B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;

            B++;
            C--;
        }
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int B1 = 2;
        int C1 = 3;
        reverseInRange(A1, B1, C1);
        for (int num : A1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 1 2 4 3

        int[] A2 = {2, 5, 6};
        int B2 = 0;
        int C2 = 2;
        reverseInRange(A2, B2, C2);
        for (int num : A2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 6 5 2
    }
}
