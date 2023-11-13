import React from 'react'
import CompB
 from './CompB'
let CompA=()=>{
    var id=10
    var name="Sunny"
    var salary=20000
    return <div>
        <h1>Component A</h1>
        <hr/>
        <CompB id={id} Name={name} salary={salary}/>
    </div>
}
export default CompA