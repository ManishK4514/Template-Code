// LeetCode Problem that uses Segment Tree: https://leetcode.com/problems/range-sum-query-mutable/description/

class NumArray {
    int n;
    int[] seg;
    // Build Segment Tree
    public int build(int[] nums, int left, int right, int node){
        if(left == right) return seg[node] = nums[left];

        int mid = (left + right) / 2;
        int leftSum = build(nums, left, mid, 2 * node + 1);
        int rightSum = build(nums, mid + 1, right, 2 * node + 2);
        return seg[node] = leftSum + rightSum;
    }
    
    // Method to get the sum Between the Range Left & Right
    public int sumRange(int left, int right, int s, int e, int node){
        if(right < s || left > e) return 0;
        if(left <= s && e <= right) return seg[node];

        int mid = (s + e)/2;
        int leftSum = sumRange(left, right, s, mid, 2 * node + 1);
        int rightSum = sumRange(left, right, mid + 1, e, 2 * node + 2);
        return leftSum + rightSum;
    }
    
    // Method to update any value at particular index in Segement Tree
    public int update(int index, int newValue, int s, int e, int node){
        if(index < s || index > e) return seg[node];
        if(s == e) return seg[node] = newValue;

        int mid = (s + e) / 2;
        int leftSum = update(index, newValue, s, mid, 2 * node + 1);
        int rightSum = update(index, newValue, mid + 1, e, 2 * node + 2);
        return seg[node] = leftSum + rightSum;
    }

    public NumArray(int[] nums) {
        this.n = nums.length;
        seg = new int[4 * n];
        build(nums, 0, n - 1, 0);
    }
    
    public void update(int index, int val) {
        update(index, val, 0, n - 1, 0);
    }
    
    public int sumRange(int left, int right) {
        return sumRange(left, right, 0, n-1, 0);
    }
}
