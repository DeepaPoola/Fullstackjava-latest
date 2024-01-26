import React from 'react'
import Navbar from './Navbar/Navbar'
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import Home from './Dummy/Home'
import About from './Dummy/About'
import StateEx from './Hooks/StateEx'
import Effect from './Hooks/Effect'
import ContextEx from './Hooks/ContextEx'
import Login from './Login/Login'
 let App=()=>{
  return (
    <div>
        <Router>
        <Navbar/>
        <Routes>
         
           <Route path="/">
         {/* <Route index element={< Navigate to="/home" replace/>}/> */}
          <Route path="/home" element={<Home/>}/> 
            <Route path="/about" element={<About/>}/>
          
            <Route path="/stateEx" element={<StateEx/>}/>
            <Route path="/effect" element={<Effect/>}/>
            <Route path="/contextex" element={<ContextEx/>}/>
            <Route path="/login" element={<Login/>}/>
            
            </Route>
            
           
           
        </Routes>
        </Router>
       
    </div>
  )
}

export default App
