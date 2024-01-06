import React from 'react'
import Counter from './Components/Counter';
import Data from './Components/Data'
import { Header } from './Components/Header';
import { Boxcard } from './Components/Boxcard';
import './App.css';

const App = () => {
  
  return (
   <div>
    <Header/>
    <Data title="Random"/>
    
    <Counter/>
   </div>
  )
}

export default App;
