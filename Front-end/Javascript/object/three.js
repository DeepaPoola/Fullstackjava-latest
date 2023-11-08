let employees = [{ id: 101, name: "Rahul Gandhi", sal: 45000, loc: "Noida" },
{ id: 102, name: "Sonia Gandhi", sal: 55000 },
{ id: 103, name: "Priyanka Gandhi", sal: 75000 }]
//print employee names
 for (emp of employees) {
    console.log(emp.sal)
    
    
}
for(var i=0;i<=employees.length-1;i++)
{
    console.log(employees[i].name)
}

//object is empty or not
let employee={id: 101, name: "Rahul Gandhi", sal: 45000, loc: "Noida"}
console.log(Object.keys(employee))
if(Object.keys(employee).length-1==0)
{
    console.log("empty object")
}
else{
    console.log(employee)
}

//object is empty or not using ternary
/*let emp = { id: 101, name: "Rahul" }

Object.keys(emp).length == 0 ? console.log("Empty Object") : console.log("Not Empty Object"); */
