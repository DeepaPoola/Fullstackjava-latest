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
                    <Link className='nav-link' to="/stateEx">UseState</Link>
                  </li>
                  <li className='nav-list'>
                    <Link className='nav-link' to="/effect">UseEffect</Link>
                  </li>
                  <li className='nav-list'>
                    <Link className='nav-link' to="/context">Usecontext</Link>
                  </li>
                </ul>
            </div>
        </nav>
    }
}

export default Navbar