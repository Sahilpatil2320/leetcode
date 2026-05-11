public class SeparateDigitsInArraySolution {
    public int[] separateDigits(int[] nums) {
        int count = 0;
        for(int num : nums){
            count += String.valueOf(num).length();
        }

        int [] ans =  new int[count];
        int index = 0;

        for(int num : nums){
            String s = String.valueOf(num);

            for(char ch : s.toCharArray()){
                ans[index++] = ch - '0';
            }
        }
        return ans;
    }
}