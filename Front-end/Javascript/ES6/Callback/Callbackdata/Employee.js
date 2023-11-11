let employees=[{id:10,name:"sunny",salary:1000},{id:20,name:"Deepa",salary:2000}]
let createEmployee=(emp)=>{
  //it will execute 3 sec to set thst we use set timeout
  setTimeout(()=>{
    employees.push(emp)
  },3000)
}
let getEmployee=()=>{
    setTimeout(()=>{
        let rows=""
        employees.forEach((employee)=>{
          rows+=`<tr>
                 <td>${employee.id}</td>
                 <td>${employee.name}</td>
                 <td>${employee.salary}</td>
                </tr>`
        })
        document.getElementById('data').innerHTML=rows
    },1000)
}
createEmployee({id:103,name:"Nallapu",salary:3000})
getEmployee()