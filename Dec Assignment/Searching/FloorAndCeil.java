public static void floorAndCeil(int a[], int N, int x){
    System.out.println(getFloor(a, x) + " " + getCeil(a, x));
}
public static int getCeil(int[] nums, int x) {
    int left = 0, right = nums.length - 1;
    int ceil = -1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == x) return nums[mid];
        else if (x < nums[mid]) {
            ceil = nums[mid];
            right = mid - 1;
        }
        else left = mid + 1;
    }
    return ceil;
}
public static int getFloor(int[] nums, int x)
{
    int left = 0, right = nums.length - 1;
    int floor = -1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == x) return nums[mid];
        else if (x < nums[mid]) right = mid - 1;
        else {
            floor = nums[mid];
            left = mid + 1;
        }
    }
    return floor;
}