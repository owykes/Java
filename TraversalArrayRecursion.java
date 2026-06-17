public class TraversalArrayRecursion {
    public static int maxInRange(int arr[], int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        }

        int mid = (lowIndex + highIndex) / 2;
        int left = maxInRange(arr, lowIndex, mid);
        int right = maxInRange(arr, mid + 1, highIndex);
    
        return Math.max(left, right);   
    }
}
