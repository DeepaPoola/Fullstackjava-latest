import React from 'react'
import Counter from './Components/Counter'
import Data from './Components/Data';
import Header from './Components/Header';
import './App.css';

const App = () => {

  return (
    <div>
      <Header/>
      <Counter/>
      <Data title="Random"/>
      
    </div>
  )
}

export default App
