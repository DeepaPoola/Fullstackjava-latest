var a=[10,20,30,40,50]
for(i=0;i<=a.length-1;i++){
    if(i==a.length-1)
    {
        console.log(i)
        console.log(`${i}`)
        console.log(a[i])
        console.log(`${a[i]}`)
    }
}
console.log(a.lastIndexOf(a[a.length-1]))
console.log(a.indexOf(50))
console.log(a[a.length-1])