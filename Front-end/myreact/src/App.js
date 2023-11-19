import React from 'react'
import Navbar from './Navbar/Navbar'
import {BrowserRouter as Router,Route,Routes, RouterProvider} from 'react-router-dom'
//import Home from './Dummy/Home'
//import About from './Dummy/About'
import CreateProduct from './Product/CreateProduct'
import Admin from './Product/Admin'
import Product from './Product/Product'
import UpdateProduct from './Product/UpdateProduct'
//import {Provider} from 'react-redux'
//import {store} from './Redux/store'


const App = () => {
    return (
        <div>
            <Router>
                <Navbar />
                <Routes>
                <Route path="/create" element={<CreateProduct />} />
                    <Route path="/admin" element={<Admin />} />
                    <Route path="/products" element={<Product />} />
                    
                    <Route path="/update" element={<UpdateProduct />} />
                </Routes>
            </Router>


        </div>
    )
}

export default App