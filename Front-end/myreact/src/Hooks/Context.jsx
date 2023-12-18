import React,{createContext} from 'react'
import ContextEx from './ContextEx'

export const LoginContext=createContext()
const Context = () => {
  
  return (
    <LoginContext.Provider value={"deepa"}>
      <div>
        <ContextEx/>
      </div>
    </LoginContext.Provider>
  )
}

export default Context