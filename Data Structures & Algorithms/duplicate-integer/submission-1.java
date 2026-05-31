class Solution {
    public boolean hasDuplicate(int[] nums) {



     // brute force approache 


    // for(int i = 0 ; i < nums.length ; i++){
    //    for(int j = 0 ; j < nums.length && j !=i ; j++){
    //        if(nums[i] == nums[j]) {
    //            return true ;
    //        }
    //    }
    // }

    // return false ;

    // Analysis : Time complixity O(n)
    //          : Space Complixity O(1) some variables !



    Set<Integer> set = new HashSet<>();
    for(int i = 0 ;  i < nums.length ; i++) {
          if(!set.add(nums[i])) {
             return true ;  
          }
    }

    return false;

   

 
    }
}
