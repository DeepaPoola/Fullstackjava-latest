import React,{useState} from 'react'

const BoxCard = ({result,children}) => {
    const [show,setShow]=useState(true);
  return (
    <>
   <div className={`box ${result}`}>
     {children}
   </div>
    <div className={show ?" ":"Hidden"}>
    <div className='box-alert'>
         <p className='title'>A computer is an electronic device that accepts data</p>
     <p className='description'>A computer is an electronic device that accepts data, performs operations, displays results</p>
    
     
    </div>
    </div>
     <button className="hide" onClick={()=>{setShow(!show)}}>Hidden</button>
     </>
  )
}

export default BoxCard