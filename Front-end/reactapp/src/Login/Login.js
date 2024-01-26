import React from 'react'
import './Login.css'
import {FaUser,FaLock} from "react-icons/fa";

const Login = () => {
  return (
    <div className='wrapper'>
       
         <form>
        
            <h1>Login</h1>
            <div className='input-box'>
                <input type="text" placeholder='User Name' required/>
                <FaUser className='icon'/>
            </div>
            <div className='input-box'>
                <input type="password" placeholder='Password' required/>
                <FaLock className='icon'/>
            </div>
            <div className='remember-forgot'>
                <label><input type="checkbox"/>Remember me</label>
                <a href="#">Forgot password</a>
            </div>
            <button type="submit">Login</button>
            <div className='register-link'>
                <p>Dont't have an account?<a href="#">Register</a></p>
            </div>
            
            
         </form>
         </div>
    
  )
}

export default Login