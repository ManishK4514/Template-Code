public class NextGreaterElementIndex {
    static void helper(int[] arr, int n, int[] prefix){
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.empty()){
                prefix[i] = -1;
            }
            else{
                prefix[i] = stack.peek();
            }
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,4,3,3,5,4,9,6};
        int[] prefix = new int[nums.length];
        helper(nums, nums.length, prefix);  
        System.out.println(Arrays.toString(prefix));
    }
}
