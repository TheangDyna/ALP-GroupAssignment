class Exercise17 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7};

        removeDuplicate(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }

    public static void removeDuplicate(int[] arr) {
        int len = arr.length;
        int index = 0;

        // loop all element
        for (int i = 0; i < len; i++) {
            boolean isDuplicate = false;

            // loop to check with elememt before
            for (int j = 0; j < i; j++) {

                // check duplicate
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                arr[index++] = arr[i];
            }
        }
        // Fill the remaining elements with 0
        while (index < len) {
            arr[index++] = 0;
        }
    }
}
