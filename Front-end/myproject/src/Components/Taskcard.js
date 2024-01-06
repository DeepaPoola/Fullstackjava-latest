import React from 'react'

const Taskcard = ({task,deleteHandle}) => {
  return (
    <li className={task.completed ? "completed" : "incomplete"}>
    <span>{task.id} - {task.name}</span>
    <button onClick={()=>deleteHandle(task.id)}>Delete</button>
  </li>
  )
}

export default Taskcard