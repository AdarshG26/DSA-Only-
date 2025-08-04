let arr1 = [2,5,7]
let arr2 = [1,3,4,8,9,12]

let mergeArr = new Array(arr1.length + arr2.length)

let i = 0, j=0, k=0
while( i<arr1.length && j<arr2.length ){
    if( arr1[i] < arr2[j]){
        mergeArr[k] = arr1[i]
        i++
        k++
    }else{
        mergeArr[k] = arr2[j]
        k++
        j++
    }
}

while(i<arr1.length){
    mergeArr[k] = arr1[i]
    i++
    k++
}
while(j<arr2.length){
    mergeArr[k] = arr2[j]
    j++
    k++
}

console.log(mergeArr);
