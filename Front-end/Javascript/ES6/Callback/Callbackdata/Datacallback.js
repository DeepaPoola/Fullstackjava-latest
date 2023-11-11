let employees=[{id:10,name:"deepa",salary:10000},{id:11,name:"sunny",salary:20000}]

let createEmployee=(emp,callback)=>{
   setTimeout(() => {
      employees.push(emp)
      callback()
   }, 3000);
}

let getEmployee=()=>{
   setTimeout(() => {
    
    let rows=""
    employees.forEach((employee)=>{
      rows+= `<tr>
      <td>${employee.id}</td>   
      <td>${employee.name}</td>   
      <td>${employee.salary}</td>   
    </tr>`
    })
document.getElementById('data').innerHTML=rows;
   }, 1000);
}

createEmployee({id:12,name:"nallapu",salary:30000},getEmployee)

// while invoking a function, passing a function as argument to another function - callback