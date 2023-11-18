import React from 'react'
class Login extends React.Component{
    state={
        email:"",
        password:""
    }
    emailHandler=(event)=>{
        this.setState({email:event.target.value})
        console.log(event.target.value)
}
passwordHandler=(event)=>{
    this.setState({password:event.target.value})
    console.log(event.target.value)
}
submitHandler=(event)=>{
    event.preventDefault()
    console.log(this.state)
}
    render(){
        return <div className="container mt-5">
        <pre>{JSON.stringify(this.state)}</pre>
        <div className="row">
            <div className="col-md-5">
                <div className="card">
                    <div className="card-header">
                        <form onSubmit={this.submitHandler}>
                            <div className="form-group">
                                <input type="text" className="form-control" placeholder="Email Id" onChange={this.emailHandler} />
                            </div>
                            <div className="form-group">
                                <input type="text" className="form-control" placeholder="Password" onChange={this.passwordHandler} />
                            </div>
                            <div className="form-group">
                                <input type="submit" className="btn btn-success" />
                            </div>

                        </form>
                    </div>
                </div>

            </div>
        </div>
    </div>
    }
}
export default Login