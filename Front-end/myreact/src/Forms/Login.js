import React, { Component } from 'react'

class Login extends Component {
    state={
        username: '',
        email: "",
        password: "",
        mobile: "",
        termsconditions:false

    }
    formHandler=(event)=>{
       this.setState({ [event.target.name] : event.target.value})
    }
    submitHandler=(event)=>{
        //event.preventDefault();
        console.log(this.state)
    }
  render() {
    return (
      <div className='container mt-5'>
        <pre>{JSON.stringify(this.state)}</pre>
        <div className='row'>
            <div className='col-md-4'>
              <div className='card'>
                 <div className='card-header'>
                     <form onSubmit={this.submitHandler}>
                     <div className='form-group'>
                            <input type="text" name="username" placeholder='User name' className='form-control' onChange={this.formHandler}/>
                        </div>
                        <div className='form-group'>
                            <input type="text" name="email" placeholder='Email' className='form-control' onChange={this.formHandler}/>
                        </div>
                        <div className='form-group'>
                            <input type="password" name="password" placeholder='Password' className='form-control' onChange={this.formHandler}/>
                        </div>
                        <div className='form-group'>
                            <input type="number" name="mobile" placeholder='Mobile' className='form-control'onChange={this.formHandler}/>
                        </div>
                        <div>
                            <input type="checkbox"/>Please accept Terms & Conditions
                        </div>
                        <div className='form-group'>
                            <input type="submit" className='btn btn-success'/>
                        </div>
                     </form>
                 </div>
              </div>
            </div>
        </div>

      </div>
    )
  }
}

export default Login