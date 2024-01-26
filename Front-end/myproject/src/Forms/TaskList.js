import React,{useState} from "react"
const TaskList = ({tasks,setTask}) => {
   
    const [show,setShow]=useState(true)

    const deleteHandler=(id)=>{
        console.log(id)
        setTask(tasks.filter(task=>id !==task.id)
          
          )
    }
  return (
    <>
    <h1>Task List</h1>
    <ul>
    <button onClick={()=>{setShow(!show)}} className='toggle'>Toggle</button>
    {show&&
      tasks.map((task)=>(
       <li key={task.id} className={task.completed ? "complete":"incomplete"}>
        {task.id} - {task.name} 
         <button className='delete' onClick={()=>deleteHandler(task.id)}>Delete</button>
         </li> 
      
      ))
     
      
    }
   
    </ul>
    </>
  )
}

export default TaskList