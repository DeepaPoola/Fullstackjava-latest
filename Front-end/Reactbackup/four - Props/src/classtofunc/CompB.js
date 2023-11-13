import React from 'react'

let CompB=(props)=>{
    return <div>
        <h1>Component B</h1>
        <pre>{JSON.stringify(props)}</pre>
        <h3>id:{props.id}</h3>
        <h3>name:{props.name}</h3>
    </div>
}

export default CompB