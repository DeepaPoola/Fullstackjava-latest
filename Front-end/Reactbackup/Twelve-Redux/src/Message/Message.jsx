import React from 'react'
import {useDispatch,useSelector} from 'react-redux'
import {gmAction,gnAction} from '../Redux/Message/message.action'

let Message=()=>{
    let dispatch=useDispatch()
    let message=useSelector((state)=>{
      return state.message
    })
    let gmHandler=()=>{
        //dispatch an action
        dispatch(gmAction())
    }
    let gnHandler=()=>{
        //dispatch an action
        dispatch(gnAction())
    }
    return <div>
        <h2>Message:{message.message}</h2>
        <button onClick={gmHandler}>GM</button>
        <button onClick={gnHandler}>GN</button>
    </div>
}

export default Message