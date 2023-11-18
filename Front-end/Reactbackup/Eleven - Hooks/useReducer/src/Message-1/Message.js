import React,{useReducer} from 'react'

let initialState={
    message:"Hello"
}
let reducer=(state=initialState,action)=>{
  switch(action.type){
    case 'GM':
        return {
            message:"Gd mrng"
        }
    case 'GN':
        return{
            message:"gd nght"
        }
    default:
        return state
  }
}
const Message=()=>{
    let [state,dispatch]=useReducer(reducer,initialState)
    return (
        <div className="container mt-5">
            <div className='row'>
               <div className='col-md-6'>
                  <div className='card'>
                     <div className='card-header'>
                      <h3>UseReducer hook</h3>
                     </div>
                     <div className='card-body'>
                     <p className='h4'>{state.message}</p>
                     <button onClick={()=>{
                        dispatch({type:"GM"})
                     }}>GM</button>
                     <button onClick={()=>{
                        dispatch({type:"GN"})
                     }}>GN</button>
                     </div>
                  </div>
               </div>
            </div>
        </div>
    )
}

export default Message