let employees=[{id:10,name:"deepa",salary:10000},{id:11,name:"sunny",salary:20000},{id:12,name:"nallapu",salary:30000}]

let createEmployee=(emp)=>{
  return new Promise((resolve,reject)=>{
    let flag=true
    setTimeout(() => {
        employees.push(emp)
        flag ? resolve("succesfull"):reject("not successfull")
    }, 3000);
  })
}

let getEmployee=()=>{
    setTimeout(() => {
        let rows = ""
        employees.forEach((emp) => {
            rows = rows + `<tr>
                           <td>${emp.id}</td>
                           <td>${emp.name}</td>
                           <td>${emp.salary}</td>
                           </tr>`
        })
        document.getElementById("tbody-data").innerHTML = rows;
    }, 1000)
}

createEmployee({id:13,name:"poola",salary:40000})
.then((msg)=>{
   console.log(msg)
   getEmployee()
})
.catch((err)=>{
    console.log(err)
})

//promise function expects fat arrow function