import React from 'react'
import Navbar from './Navbar/Navbar'
import {BrowserRouter as Router,Route,Routes, RouterProvider} from 'react-router-dom'
import Home from './Dummy/Home'
import About from './Dummy/About'
import Message from './Message/Message'
import {Provider} from 'react-redux'
import {store} from './store'
import Product from './Product/Product'

class App extends React.Component{
    render(){
        return <div>
            <Provider store={store}>
           <Router>
            <Navbar/>
            <Routes>
                <Route path="/home" element={<Home/>} />
                <Route path="/about" element={<About/>} />
                <Route path="/message" element={<Message/>} />
                <Route path="/product" element={<Product/>}/>
                
            </Routes>
           </Router>
           </Provider>
        </div>
    }
}
export default App