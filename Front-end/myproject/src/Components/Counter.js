import React ,{useState} from 'react'

const Counter = () => {
    let [count,setCount]=useState(0);

    let incrHandler=()=>{
        setCount(count+1)
        /*setCount(count=>count+1)
        setCount(count=>count+1)
        setCount(count=>count+1)*/
     }
     let decrHandler=()=>{
       setCount(count-1)
    }
    let resetHandler=()=>{
       setCount(0)
    }
     return (
       <>
       <div className='box'>
         <p>count:{count}</p>
          <button className='incr' onClick={incrHandler}>INCR</button>
          <button className='decr' onClick={decrHandler}>DECR</button>
          <button className='reset' onClick={resetHandler}>Reset</button>
       </div>
       </>
     )
}

export default Counter