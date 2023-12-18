import React,{useContext} from 'react'
 import { LoginContext } from './Context'
const ContextEx = () => {
   const login= useContext(LoginContext)
   console.log(login)
  return (
    <div>
        <h1>{login}</h1>
    </div>
  )
}

export default ContextEx