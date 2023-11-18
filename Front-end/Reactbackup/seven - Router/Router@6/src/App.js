import React from 'react'
import Navbar from './Navbar'
//import Product from './Product/Product'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Home from './Dummy/Home'
import About from './Dummy/About'
import Contact from './Dummy/Contact'

class App extends React.Component{
    render(){
      
        return <>
      
      <Router>
      <Navbar/>
      <Routes>
        <Route exact path="/home" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
        <Route path="/contact" element={<Contact/>}/>
      </Routes>
      </Router>
       
       
      
    </>
    }
    
}

export default App
