var employee={id:10,name:"Sunny",sal:50000}
console.log(employee)
employee.id=20//updating
employee.loc="hyderabad"
console.log(employee)
console.log(employee.id)
for(var k in employee)
{
    console.log(k)//print all keys means id,name,sal,loc
    
}
console.log(Object.keys(employee))//print keys
console.log(Object.values(employee))//print values
console.log(Object.entries(employee))
for(var k in employee)
{
    
    console.log(employee[k])//print all values
}