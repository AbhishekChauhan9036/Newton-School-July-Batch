function findMissingNumber(arrayOfIntegers, upperBound, lowerBound) {
// write code here
// use console.log for output
let x=new Set();
for(let i=0;i<arrayOfIntegers.length;i++)
    x.add(arrayOfIntegers[i]);
    for(let i=lowerBound;i<=upperBound;i++){
        if(!x.has(i)){
            console.log(i);
            return;
        }
    }
}