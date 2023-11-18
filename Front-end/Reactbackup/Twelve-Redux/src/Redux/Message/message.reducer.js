import {GM,GN} from '../Message/message.action'

let initialState={
    message:"Hello"
}
let messageReducer=(state=initialState,action)=>{
    console.log(action)
    console.log(action.type)
    switch(action.type){
        case GM:
            //return {message:action}
            return {message:"Good mrng"}
         case GN:
                //return {message:action}
                return {message:"Good nght"}

        default:
            return state
    }
}

export {messageReducer}