import React from 'react'
import CompB from './CompB'
class CompA extends React.Component{
    id=30
    name="Deepa"
    render(){
       return <div>
        <h1>Component A</h1>
        <hr/>
        <CompB id={this.id} name={this.name}/>
       </div>
    }
}

export default CompA