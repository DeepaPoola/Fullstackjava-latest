import React,{useState} from 'react'

let Message=()=>{
    let [variable,setVariable]=useState("Hello")
  let gmHandler=()=>{
        setVariable("Gd mrng")
    }
    return <div>
        <h2>Message:{variable}</h2>
        <button onClick={gmHandler}>GM</button>
        <button onClick={()=>{
            setVariable("GN")
        }}>GN</button>
    </div>

}

export default Message