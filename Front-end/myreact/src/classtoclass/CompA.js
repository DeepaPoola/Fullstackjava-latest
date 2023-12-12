import React,{Component} from 'react'
import CompB from './CompB'
class CompA extends  Component{
  
    id=10
    name="sunny"
    salary=30000
    employee={id:11,loc:"AP",salary:20000}
    user=[{id:101,ename:"Sd",salary:1000},{id:102,ename:"AK",salary:2000}]
    render(){ 
    return <div>
        <h1>Component A</h1>
        <hr/>
        <CompB id={this.id} name={this.name} salary={this.salary} loc={this.employee.loc} ename={this.user[0]} />
    </div>
   }
}

export default CompA