import React, { Component } from 'react'
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import AmazonminiTV from './Components/AmazonminiTV'
import BestSellers from './Components/BestSellers'
import Fresh from './Components/Fresh'
import { Header } from './Components/Header'

 class App extends Component {
  render() {
    return (
      <Router>
       
        <Navbar/>
         <Header/>
        <Routes>
          <Route path="/amazon" element={<AmazonminiTV/>}/>
          <Route path="/best" element={<BestSellers/>}/>
          <Route path="/fresh" element={<Fresh/>}/>
          
        </Routes>
      </Router>
    )
  }
}

export default App