import React,{useState} from 'react'
import TaskCard from './TaskCard'
import BoxCard from './BoxCard'

const Data = (props) => {
    const [tasks,setTask]=useState([
        {id:10,name:"Record",completed:true},
        {id:11,name:"Watch",completed:false},
        {id:12,name:"view",completed:true}
    ])
    const [show,setShow]=useState(true)

    const deleteHandler=(id)=>{
        console.log(id)
        setTask(tasks.filter(task=>id !==task.id)
          
          )
    }
  return (
    <>
    <h1>Task List {props.title}</h1>
    <ul>
    <button className='toggle' onClick={() => setShow(!show)}>{ show ? "Hide" : "Show"}</button>
   
    {show&&
      tasks.map((task)=>(
      <TaskCard task={task} handleDelete={deleteHandler} key={task.id}/>
      
      ))
     
      
    }
   
    </ul>
    <BoxCard result="success">
                        <p>A computer is an electronic device that accepts data</p>
                        <p>A computer is an electronic device that accepts data, performs operations, displays results</p>
                 </BoxCard>
    </>
  )
}


export default Data