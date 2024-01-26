import React,{useState} from 'react'

const Login = ({tasks,setTask}) => {
    const [taskValue,setTaskValue]=useState("")
    const [progress,setProgress]=useState(false)

    const handleChange=(event)=>{
      setTaskValue(event.target.value)
      //console.log(event.target.value)
    }
    const resetHandler=()=>{
      setTaskValue("");
      setProgress(false);
    }
    const submitHandler=(event)=>{
        event.preventDefault();
        const task={
            id:Math.floor(Math.random()*1000),
            name:taskValue,
            completed:Boolean(progress)
        }
        console.log(task);
        setTask([...tasks,task])
        resetHandler();
    }
  return (
    <>
    <div className='container mt-5'>
        <div className='row'>
           <div className='col-md-4'>
               <div className='card'>
                  <div className='card-header'>
                     <h1>Registration</h1>
                  </div>
                  <div className='card-body'>
                    <form onSubmit={submitHandler}>
                       {/* <label htmlFor='task'>UserName</label>*/}
                    <input onChange={handleChange} type="text" id="task" name="task" placeholder="User name" maxLength={13} autoComplete="off" value={taskValue}/>&nbsp;&nbsp;&nbsp;
                    <select onChange={(event)=>setProgress(event.target.value)} value={progress}>
                        <option value="false">Pending</option>
                        <option value={true}>Completed</option>
                    </select>
                    <button onClick={resetHandler}>Reset</button>
                    <button type="submit">Add Task</button>
                    </form>
                    <p>{taskValue}</p>
                  </div>
               </div>
           </div>
        </div>
    </div>
    </>
  )
}

export default Login