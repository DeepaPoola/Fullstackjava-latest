import React, { Component } from 'react'
import Axios from 'axios'

 class User extends Component {
  constructor(props){
    super(props)
    this.state={
      users:[]
    }
  }
  componentDidMount(){
    Axios.get('https://jsonplaceholder.typicode.com/users')
    .then((response)=>{
      this.setState({users:response.data})
    })
    .catch((error)=>{
      console.log(error)
    })
  }
  render() {
    return (
      <div className='container mt-5'>
          <div className='row'>
            {
              this.state.users.length>0 ? <React.Fragment>
                <div className='col-md-8'>
                  <table className='table table-hove'>
                    <thead className='bg-dark text-white'>
                        <tr>
                          <th>ID</th>
                          <th>Name</th>
                          <th>City</th>
                        </tr>
                    </thead>
                    <tbody>
                      {
                        this.state.users.map((user)=>{
                         return <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.name}</td>
                            <td>{user.address.city}</td>
                          </tr>
                        })
                      }
                    </tbody>
                  </table>
                </div>
              </React.Fragment>:null
            }
          </div>

      </div>
    )
  }
}

export default User