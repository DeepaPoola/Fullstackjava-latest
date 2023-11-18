import React from 'react'
import Navbar from './Navbar'
//import Product from './Product/Product'
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom'
import Home from './Dummy/Home'
import About from './Dummy/About'
import Contact from './Dummy/Contact'

class App extends React.Component{
    render(){
      
        return <>
      
      <Router>
      <Navbar/>
      <Switch>
        <Route path="/home" component={Home}/>
        <Route path="/about" component={About}/>
        <Route path="/contact" component={Contact}/>
      </Switch>
      </Router>
       
       
      
    </>
    }
    
}

export default App
