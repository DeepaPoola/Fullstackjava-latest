import React,{useRef} from 'react'
import Images from '../Images/tcs.png'

let Picture=()=>{
    let image1=useRef(null)
    let clickHandler=()=>{
        console.log(image1.current)
    }
    return <div>
        
        {/*<h1 ref={image1}>Hello</h1>*/}
        <img src={Images} alt="" ref={image1} />
        <button onClick={clickHandler}>click</button>
    </div>
}
export default Picture
