import React from 'react'
import Navbar from './Navbar/Navbar'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Home from './Dummy/Home'
import About from './Dummy/About'
import ContactApp from './ContactApp/ContactApp'


class App extends React.Component{
    render(){
        return <div>
           <Router>
            <Navbar/>
            <Routes>
                <Route path="/home" element={<Home/>} />
                <Route path="/about" element={<About/>} />
                <Route path="/contactapp" element={<ContactApp/>} />
                
            </Routes>
           </Router>
        </div>
    }
}
export default App