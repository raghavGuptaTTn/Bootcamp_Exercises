// ans 10 

// method 1
let arr = [[1,2],[3,4,5,[4,5,6,67,[7,8,54]],6],10,77,43,26,100];

const flattenToSingleLevel = arr => 
    arr.reduce((flatArray, presentArray) => 
    flatArray.concat(presentArray));
        
console.log(flattenToSingleLevel(arr));

// method 2
const flattened = arr.flat(1);
console.log(flattened);

export {flattenToSingleLevel};