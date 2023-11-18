//action types

const GM="GM"
const GN="GN"
let gmAction=()=>{
    console.log("gm action")
    return {type:GM,payload:"Hello"}
}
let gnAction=()=>{
    console.log("gn action")
    return {type:GN}
}

export{gmAction,gnAction,GM,GN}