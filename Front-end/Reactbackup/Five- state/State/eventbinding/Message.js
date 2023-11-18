import React, { Component } from 'react'

 class Message extends Component {

     state={
        
    message:"Hello"
     }
    updateHandler=(msg)=>{
      this.setState({message:msg})
    }
  render() {
    
    return (
      <div>
        <h1>Message Component</h1>
        <h3>Message:{this.state.message}</h3>
        
        <button onClick={this.updateHandler.bind(this,"GM")}>GM</button>&nbsp;&nbsp;
        <button onClick={this.updateHandler.bind(this,"GA")}>GA</button>&nbsp;&nbsp;
        <button onClick={()=>{
          this.setState({message:"GN"})
        }}>GN</button>
        
      </div>
    )
  }
}

export default Message