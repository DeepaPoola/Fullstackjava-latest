import React, { Component } from 'react'
import { Link } from 'react-router-dom'


 class Navbar extends Component {
  render() {
    return (
      <div className='navbar navbar-dark bg-dark navbar-expand-lg'>
        <Link to="/" className='navbar-brand'></Link>
         <div className='mr-auto'>
            <ul className='navbar-nav'>
                 <li className='nav-list'>
                    <Link to="/amazon" className='nav-link'>Amazon MiniTV</Link>
                 </li>
                 <li className='nav-list'>
                    <Link to="/best" className='nav-link'>Best Sellers</Link>
                 </li>
                 <li className='nav-list'>
                    <Link to="/fresh" className='nav-link'>Fresh</Link>
                 </li>
                 <li className='nav-list'>
                    <Link to="/sell" className='nav-link'>Sell</Link>
                 </li>
            </ul>
         </div>
      </div>
    )
  }
}

export default Navbar