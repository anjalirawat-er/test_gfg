class Solution {
    public void sort012(int[] arr) {
        // code here
        int zero = 0;
        int one = 0;
        int two = arr.length - 1;

        while (one <= two) {

            if (arr[one] == 0) {
                int temp = arr[zero];
                arr[zero] = arr[one];
                arr[one] = temp;

                zero++;
                one++;
            }

            else if (arr[one] == 1) {
                one++;
            }

            else { 
                int temp = arr[one];
                arr[one] = arr[two];
                arr[two] = temp;

                two--;
            }
        }
    }
}