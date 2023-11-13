import React from 'react'
import CompB from './CompB'
let CompA=()=>{
    var id=20
    var name="deepa"
    var loc="Hyderabad"

    return <div>
        <h1>Component A</h1>
        <hr/>
        <CompB id={id} Name={name} Loc={loc}/>
    </div>
}

export default CompA