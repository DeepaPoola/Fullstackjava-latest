var a=10;
var b
++a;
console.log(a)//11
a++
console.log(a)//12
--a
console.log(a)//11
a--
console.log(a)//10
b=++a
console.log(a)//11
console.log(b)//11
b=a++
console.log(b)//11
console.log(a)//12
b=--a
console.log(a)//11
console.log(b)//11
b==a--
console.log(a)//10
console.log(b)//11

/*pre increment:- ++a = first increment and then assign
  post increment:- a++ = first assign then increment
  */