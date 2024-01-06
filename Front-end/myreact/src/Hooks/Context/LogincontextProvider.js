import React, { createContext,useState } from 'react'
import ContextEx from '../ContextEx'

export const LoginContext=createContext()
const LogincontextProvider = ({ContextEx}) => {
    const [userDetails,setUserDetails]=useState("Hello world")
  return (
    <LogincontextProvider.Provider value={userDetails}>
       {ContextEx}
    </LogincontextProvider.Provider>
  )
}

export default LogincontextProvider