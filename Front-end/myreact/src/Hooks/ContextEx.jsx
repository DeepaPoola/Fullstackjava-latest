import React,{useContext} from 'react'
 
import LogincontextProvider from './Context/LogincontextProvider'
const ContextEx = () => {
   const login= useContext(LogincontextProvider)
   console.log(login)
  return (
    <div>
        <h1>{login}</h1>
    </div>
  )
}

export default ContextEx