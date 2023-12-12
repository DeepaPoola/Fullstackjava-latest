import React, { Component } from 'react'
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import AmazonminiTV from './Components/AmazonminiTV'
import BestSellers from './Components/BestSellers'
import Fresh from './Components/Fresh'
import Sell from './Components/Sell'
import logo from './index.css'

 class App extends Component {
  render() {
    return (
      <Router>
       
        <Navbar/> <img src={logo} width={100} height={100}/>
        <Routes>
          <Route path="/amazon" element={<AmazonminiTV/>}/>
          <Route path="/best" element={<BestSellers/>}/>
          <Route path="/fresh" element={<Fresh/>}/>
          <Route path="/sell" element={<Sell/>}/>
        </Routes>
      </Router>
    )
  }
}

export default App