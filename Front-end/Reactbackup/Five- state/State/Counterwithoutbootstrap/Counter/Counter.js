import React, { Component } from 'react'

class Counter extends Component {
    state={
        qty:1
    }
    decrHandler=()=>{
        this.setState({qty:this.state.qty-1})
    }
    incrHandler=()=>{
        this.setState({qty:this.state.qty+1})
    }
  render() {
    return (
      <div>
       <h2>Qty:{this.state.qty}</h2>
       <button onClick={this.decrHandler}>Decr</button>&nbsp;&nbsp;
       <button onClick={this.incrHandler}>Incr</button>
      </div>
    )
  }
}

export default Counter