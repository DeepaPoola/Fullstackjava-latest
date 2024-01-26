import React from 'react'

const TaskCard = ({task,handleDelete}) => {
  return (
    <div>
         <li className={task.completed ? "complete":"incomplete"}>
        {task.id} - {task.name} 
         <button className='delete' onClick={()=>handleDelete(task.id)}>Delete</button>
         </li> 
    </div>
  )
}

export default TaskCard