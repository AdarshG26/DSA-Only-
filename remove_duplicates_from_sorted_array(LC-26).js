let arr1 = [1,1,2]
let arr2 = [0,0,1,1,1,2,2,3,3,4]

var removeDuplicates = function(nums) {
    let i=0, j=1
    while(i < nums.length-1){
        if(nums[i] != nums[i+1]){
            nums[j] = nums[i+1]
            j++
        }
        i++
    }
    return j
};

console.log(removeDuplicates(arr1));
console.log(removeDuplicates(arr2));
