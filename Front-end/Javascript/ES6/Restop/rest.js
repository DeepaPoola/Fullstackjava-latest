function add(a,...b)
{
    console.log(a,b)
}
add(10)
add(10,20)
add(10,20,30)
add(10,20,30,40)

/*function add(...b)
{
    console.log(b)
}
add(10)
add(10,20)
add(10,20,30)
add(10,20,30,40)*/

// (...) it is also treated as rest operator - it will print remaining values
// it is applicable for function