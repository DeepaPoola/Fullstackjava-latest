import React,{useState} from 'react'
import Taskcard from './Taskcard'
import { Boxcard } from './Boxcard'

const Data = (props) => {
    const [tasks,setTasks]=useState([
        {id:1, name:"Record", completed:"false"},
        {id:2, name:"Watch", completed:"false"},
        {id:3, name:"view", completed:"true"}
    ])
    const [show,setShow]=useState(true)

    let deleteHandler=(id)=>{
      console.log(id)
      setTasks(tasks.filter(task=>id !==task.id))
    }
  return (
    <>
          <h1>Task List {props.title}</h1>
           
                 <ul>
                  <button  className="toggle" onClick={()=>setShow(!show)}>Toggle</button>
                  {show &&    tasks.map((task)=>(
                    <Taskcard task={task} deleteHandle={deleteHandler} key={task.id}/>
                    
                  ))}
                
                 </ul>
                 <Boxcard result="success">
                        <p>A computer is an electronic device that accepts data</p>
                        <p>A computer is an electronic device that accepts data, performs operations, displays results</p>
                 </Boxcard>
        </>     
        
  )
}

export default Data