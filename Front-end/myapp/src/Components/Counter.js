import React,{useState} from 'react'

const Counter = () => {
    let [count,setCount]=useState(0)
    let incrHandler=()=>{
        setCount(count+1)
    }
    let decrHandler=()=>{
        setCount(count-1)
    }
    let resetHandler=()=>{
      setCount(0)
  }
  return (
    <>
             <div className="box">
             <h3>Count:{count}</h3>
             <button onClick={incrHandler} className='incr'>INCR</button>
             <button onClick={decrHandler} className='decr'>DECR</button>
             <button onClick={resetHandler} className='reset'>Reset</button>
             </div>  
    </>
  )
}

export default Counter