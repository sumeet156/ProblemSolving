import java.util.*;
/*
1. Check all pairs in array using nested loops
2. Return indices when nums[i] + nums[j] == target
3. Avoid using the same element twice (j starts from i+1)
4. Return new int[] {} is just an empty array, not null

Topic: Array,Loops
*/

public class twoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        array ka size
        System.out.println("Enter no. of elements:");
        int num = in.nextInt();

//        array create
        int [] nums = new int[num];
        System.out.println("Enter "+ num + " numbers:");
        for (int i =0;i<num;i++){
            nums[i] = in.nextInt();
        }

//        target input
        System.out.println("Enter Target(Sum):");
        int  target = in.nextInt();

//        function call
        int[] result = twoSum(nums, target);

//        result
        if (result.length ==2){
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }else {
            System.out.println("No Result Found");
        }
        in.close();
    }

    public static int[] twoSum(int [] nums, int target){
        for(int i=0;i<nums.length;i++){
            for (int j= i+1;j<nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    return new int[] {i,j};     //ans
                }
            }
        }
        return new int[] {};    //return empty arr (it's not null)
    }
}
