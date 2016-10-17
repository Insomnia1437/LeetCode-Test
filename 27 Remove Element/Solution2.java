public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length ==0) return 0;
        int endPtr = nums.length-1;
//Quit when both pointers cross each other
        for(int i=0; i <= endPtr; i++) {
            if(nums[i] == val) {
              //Move end pointer towards the start pointer (i) until a valid replacement is found
                while(endPtr > i && nums[endPtr] == val) {
                    endPtr--;
                }
                //Once valid replacement is found, overwrite the current element with the valid one
                nums[i] = nums[endPtr--];
            }
        }
        //since endPtr is pointing to an index, increment by 1 to find the size
        return endPtr+1; 
    }
