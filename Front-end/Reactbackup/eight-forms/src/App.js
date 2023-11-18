import React from 'react'
import Navbar from './Navbar'
//import Product from './Product/Product'
//import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'

import Login from './Login/Login'

class App extends React.Component{
    render(){
      
        return <div>
          <Navbar/>
          <Login/>
        </div>
    }
    
}

export default App
