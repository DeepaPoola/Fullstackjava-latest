let size=[10,20,30,40,50];
let new_Size = [...size]

console.log(size)
console.log(new_Size)

size[0]=5
size.push(60)
size.unshift(15)
new_Size[0]=15
console.log(size)
console.log(new_Size)

//(...)spread operator - extract and copy means copy array and paste into an new array
//it is applicable for array and objects