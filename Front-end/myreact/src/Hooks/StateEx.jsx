import React,{useState} from 'react'

const StateEx = () => {
   
    const [details,setDetails]=useState({counter:0,name: ""})
    const increaseHandler=()=>{
       setDetails((prev)=>({
          ...prev,
          counter:prev.counter+1
       }))
    }
   
  return (
    <div>
       <input type="text" onChange={(e)=>e.target.value}/>
       <h1>
        {details.name} has clicked {details.counter} times
       </h1>
   <button onClick={increaseHandler}>Increase</button>
      </div>
  )
}

export default StateEx