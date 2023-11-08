var a=10
console.log(10)
function add(){
    var a=20 //if we give var then 20 is for only add and 10 for sub
    var a=30 //if we doesnt give var then add and sub has same value as 20
    console.log(a)
}
var a=40
function sub(){
    console.log(a)
}
add()
sub()

//var - globally or function scoped. we can update and redeclared