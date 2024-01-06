import React,{useState} from 'react'

export const Boxcard = ({result,children}) => {
    let [show,setShow]=useState(true)
  return (
    <>
    
    <div className={`box ${result}`}>
    {children}
    </div>

   <div className={show ?" ":"hidden"}>
     <div className='box alert'>
     <p className='title'>A computer is an electronic device that accepts data</p>
     <p className='description'>A computer is an electronic device that accepts data, performs operations, displays results</p>
     <button  className="toggle" onClick={()=>setShow(!show)}>Hide</button>
 </div>
 </div>

  <div className='box warning'>
  <p>A computer is an electronic device that accepts data</p>
  <p>A computer is an electronic device that accepts data, performs operations, displays results</p>

</div>
    </>
  )
}
