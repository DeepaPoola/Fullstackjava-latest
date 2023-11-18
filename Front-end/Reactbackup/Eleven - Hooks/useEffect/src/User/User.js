import React,{useEffect, useState} from 'react'
import Axios from 'axios'

let User=()=>{
    let [users,setUsers]=useState()

    useEffect(()=>{
        Axios.get('https://jsonplaceholder.typicode.com/users')
        .then((response)=>{
            setUsers(response.data)
        }).catch((err)=>{
           console.log(err)
        })
    })
    return <div className='container mt-5'>
        <h4>{JSON.stringify(users)}</h4>
        <div className="row">
           <div className="col-md-8">
              <table className="table table hover">
                 <thead className="bg-dark text-white">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                    </tr>
                 </thead>
                 <tbody>
                    {/*
                   {
                     users.map((user)=>{
                       return  <tr>
                            <td>{user.id}</td>
                        </tr>
                     })
                   }*/}
                            
                       
                 </tbody>
              </table>
           </div>
        </div>
    </div>
}

export default User