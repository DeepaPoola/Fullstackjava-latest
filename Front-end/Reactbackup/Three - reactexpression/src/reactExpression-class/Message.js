import React from 'react'
class Message extends React.Component{
     id=10
    name="deepa"
    salary=10000
    render(){
    return <div>
       <h1>Message Coponent</h1>
       <hr/>
       <h2>id:{this.id}</h2>
       <h2>name:{this.name}</h2>
       <h3>salary:{this.salary}</h3>
    </div>
}
}

export default Message