import React from 'react'
import {Link} from 'react-router-dom'

class Navbar extends React.Component{
    render(){
        return <nav className='navbar navbar-dark bg-dark navbar-expand-lg'>
          <Link to="/home" className="navbar-brand">Axios</Link>
            <div className='ml-auto'>
            <ul className='navbar-nav'>
                <li className="nav-list">
                    <Link to="/home" className="nav-link">Home</Link>
                </li>
                <li className="nav-list">
                    <Link to="/about" className="nav-link">About</Link>
                </li>
                <li className="nav-list">
                    <Link to="/user" className="nav-link">User</Link>
                </li>
               
             </ul>
            </div>
        </nav>
    }
}

export default Navbar