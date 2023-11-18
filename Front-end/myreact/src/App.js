import React from 'react'
import Navbar from './Navbar/Navbar'
import {BrowserRouter as Router,Route,Routes, RouterProvider} from 'react-router-dom'
import Home from './Dummy/Home'
import About from './Dummy/About'

import {Provider} from 'react-redux'
import {store} from './store'
import User from './User/User'

class App extends React.Component{
    render(){
        return <div>
            <Provider store={store}>
           <Router>
            <Navbar/>
            <Routes>
                <Route path="/home" element={<Home/>} />
                <Route path="/about" element={<About/>} />
               
                <Route path="/user" element={<User/>}/>
                
            </Routes>
           </Router>
           </Provider>
        </div>
    }
}
export default App