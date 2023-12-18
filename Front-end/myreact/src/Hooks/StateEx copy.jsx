import React,{useState} from 'react'

const StateEx = () => {
    const [counter,setCounter]=useState(0)
    const [name,setName]=useState("")
    const increaseHandler=()=>{
       setCounter(counter+1)
    }
    const nameHandler=(e)=>{
         setName(e.target.value)
    }
  return (
    <div>
       {/*<input type="text" onChange={e=>setName(e.target.value)}/>*/}
       <input type="text" onChange={nameHandler}/>
      <h1>count:{counter}</h1>
      <h1>{name} has clicked {counter} times</h1>
      <button onClick={increaseHandler}>Increase</button>
    </div>
  )
}

export default StateEx