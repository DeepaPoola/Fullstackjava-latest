import React, { Component } from 'react'

 class Message extends Component {
    message="Hello"
    gmHandler=()=>{
        console.log("Test case")
        this.message="Gd mrng"
        console.log(this.message)
        this.forceUpdate()
    }
  render() {
    return (
      <div>
        <h1>Message Component</h1>
        <h3>Message:{this.message}</h3>
        <button onClick={this.gmHandler}>GM</button>&nbsp;&nbsp;
        <button>GN</button>
      </div>
    )
  }
}

export default Message