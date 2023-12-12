let size=[10,20,30,40,50]

let new_size=size;
size[0]=5;
console.log(size)
console.log(new_size)

let size1=[10,20,30,40,50]
let new_size1=[]

/*for(s of size1)
{
    new_size1.push(s);
}*/

size.map((s)=>{
  new_size1.push(s);
})
size1[0]=15
console.log(size1)
console.log(new_size1)


