import React from 'react'
import Navbar from './Navbar/Navbar'
import {BrowserRouter as Router,Routes,Route,Navigate} from 'react-router-dom'
import Home from './Dummy/Home'
import About from './Dummy/About'
import Login from './Test/Login'
import Test from './Test/Test'
import CompA from './classtoclass/CompA'
import UsestateEx from './Hooks/UsestateEx'
 let App=()=>{
  return (
    <div>
        <Router>
        <Navbar/>
        <Routes>
         
           <Route path="/">
          <Route index element={< Navigate to="/home" replace/>}/> 
          <Route path="/home" element={<Home/>}/> 
            <Route path="/about" element={<About/>}/>
            <Route path="/login" element={<Login/>}/>
            <Route path="/test" element={<Test/>}/>
            <Route path="/compa" element={<CompA/>}/>
            <Route path="/usestateex" element={<UsestateEx/>}/>
            
            </Route>
            
           
           
        </Routes>
        </Router>
       
    </div>
  )
}

export default App
