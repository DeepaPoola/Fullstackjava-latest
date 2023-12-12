import React from 'react'
import {Link} from 'react-router-dom'

class Navbar extends React.Component{
    render(){
        return <nav className='navbar navbar-dark bg-dark navbar-expand-lg'>
            <Link to="/home" className='navbar-brand'>Contact</Link>
            <div className='ml-auto'>
                <ul className='navbar-nav'>
                  <li className='nav-list'>
                    <Link className='nav-link' to="/home">Home</Link>
                  </li>
                  <li className='nav-list'>
                    <Link className='nav-link' to="/about">About</Link>
                  </li>
                  <li className='nav-list'>
                    <Link className='nav-link' to="/login">Login</Link>
                  </li>
                  <li className='nav-list'>
                    <Link className='nav-link' to="/test">Test</Link>
                  </li>
                  <li className='nav-list'>
                    <Link className='nav-link' to="/props">Props</Link>
                  </li>
                </ul>
            </div>
        </nav>
    }
}

export default Navbar