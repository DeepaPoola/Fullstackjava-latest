import React from 'react'

class CompB extends React.Component{
    render(){
        return <div>
            <h1>Component B</h1>
            <pre>{JSON.stringify(this.props)}</pre>
            <h1>id:{this.props.id}</h1>
            <h1>name:{this.props.Name}</h1>
            <h1>loc:{this.props.Loc}</h1>
        </div>
    }
}

export default CompB