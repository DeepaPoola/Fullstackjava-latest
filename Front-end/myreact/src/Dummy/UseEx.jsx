import React,{useState} from 'react'

const UseEx = () => {
  let [count,setCount]=useState(0)
  let [name,setName]=useState("")
  let increaseHandler=()=>{
    setCount(
         count+1
         );
  }
  return (
    <div>
      <input type="text" onChange={e=>setName(e.target.value)}/>
      <h1>{name} has clicked {count} times</h1>
      <button onClick={increaseHandler}>Increase</button>
    </div>
  )
}

export default UseEx