import React, { Component } from 'react'

 class Message extends Component {

     state={
        
    message:"Hello"
     }
    gmHandler=()=>{
        this.setState({message:"Gd mrng"})
     
        
    }
    gnHandler=()=>{
      this.setState({message:"Gd nght"})
    }
  render() {
    //console.log(this.state.message)
    return (
      <div>
        <h1>Message Component</h1>
        <h3>Message:{this.state.message}</h3>
        
        <button onClick={this.gmHandler}>GM</button>&nbsp;&nbsp;
        <button onClick={this.gnHandler}>GN</button>
        
      </div>
    )
  }
}

export default Message