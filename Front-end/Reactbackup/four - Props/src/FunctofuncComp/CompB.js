import React from 'react'

let CompB =(props)=>{
    return <div>
        <h1>Component B</h1>
        <pre>{JSON.stringify(props)}</pre>
        <h2>id:{props.id}</h2>
        <h2>Name:{props.Name}</h2>
        <h2>salary:{props.salary}</h2>
    </div>
}

export default CompB