var employees=[{id:10,name:"Deepa",email:"abc@gmail.com",loc:"Hyderabad"},
{id:11,name:"john",email:"john@gmail.com",loc:"Chennai"},
{id:12,name:"peter",email:"peter@gmail.com",loc:"AP"}]

function display(){
    let row=""
    for(emp of employees)
    {
        row = row +`<tr> 
                 <td>${emp.id}</td>
                 <td>${emp.name}</td>
                 <td>${emp.email}</td>
                 <td>${emp.loc}</td>
        </tr>`
    }
    document.getElementById('data').innerHTML=row;
}