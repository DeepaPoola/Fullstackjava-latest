import React ,{useState,useEffect} from 'react'

const Effect = () => {
    const [count,setCount]=useState(0)
    useEffect(()=>{
      document.title=`${count} has new messages`
    })
  return (
    <div>
     <h1>clicked {count} times</h1>
     <button onClick={()=>setCount(count+1)}>Increase</button>
    </div>
  )
}

export default Effect