public class Soultion {
    public void heapSort(int[] nums) {
        if (nums.length <= 1)
            return;
        for (int i = nums.length / 2 - 1; i >= 0; i--)
            maxHeap(nums, i, nums.length);
        for (int i = nums.length - 1; i >= 1; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            maxHeap(nums, 0, i);
        }
    }

    public void maxHeap(int[] nums, int parent, int heapSize) {
        int leftChild = parent * 2 + 1;
        int rightChild = parent * 2 + 2;
        int max = parent;
        if (parent > heapSize / 2)
            return;
        if (leftChild < heapSize && nums[leftChild] > nums[max])
            max = leftChild;
        if (rightChild < heapSize && nums[rightChild] > nums[max])
            max = rightChild;
        if (max != parent) {
            int temp = nums[parent];
            nums[parent] = nums[max];
            nums[max] = temp;
            maxHeap(nums, max, heapSize);
        }
    }
}