import React,{Component} from 'react'

class CompB extends Component{
    render(){
        return <div>
            <h1>Component B</h1>
            <pre>{JSON.stringify(this.props)}</pre>
            <h3>id:{this.props.id}</h3>
            <h3>name:{this.props.name}</h3>
            <h3>salary:{this.props.salary}</h3>
            <h3>loc:{this.props.loc}</h3>
            <h3>ename:{this.props.ename}</h3>
        </div>
    }
}

export default CompB