import React from 'react'
class Navbar extends React.Component{
    render(){
        return <nav className="navbar navbar-dark bg-dark navbar-expand-lg">
             <a href="#" className="navbar-brand">Example</a>
             <div className="ml-auto">
               <ul className="navbar-nav">
                <li className="nav-list">
                    <a hreaf="#" className="nav-link">Home</a>
                </li>
                <li className="nav-list">
                    <a hreaf="#" className="nav-link">About</a>
                </li>
                <li className="nav-list">
                    <a hreaf="#" className="nav-link">Contact</a>
                </li>
               </ul>
             </div>
        </nav>
        
    }
}
export default Navbar;