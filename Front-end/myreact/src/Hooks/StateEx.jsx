import React,{useState} from 'react'

const StateEx = () => {
   
    const [details,setDetails]=useState({ name: "",counter:0 })
    const increaseHandler=()=>{
       setDetails(()=>({
          ...details,
          counter:details.counter+1
       }))
    }
   
  return (
    <div>
       <input type="text" onChange={(e)=>e.target.value}/>
       <h2>name:{details.name}</h2>
       <h1>
        {details.name} has clicked {details.counter} times
       </h1>
   <button onClick={increaseHandler}>Increase</button>
      </div>
  )
}

export default StateEx