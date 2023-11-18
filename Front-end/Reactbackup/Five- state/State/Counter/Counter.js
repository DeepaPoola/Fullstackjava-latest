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
     <div className="container mt-5">
        <div className="row">
            <div className="col-md-6">
                 <div className="card">
                    <div className="card-header">
                       <h2>Qty: {this.state.qty}</h2>
                    </div>
                    <div className="card-body">
                      <button className="btn btn-success mr-5" onClick={this.decrHandler}>Decr</button>
                      <button className="btn btn-success" onClick={this.incrHandler}>Incr</button>
                    </div>
                 </div>
            </div>
        </div>

     </div>
    

    )
  }
}

export default Counter