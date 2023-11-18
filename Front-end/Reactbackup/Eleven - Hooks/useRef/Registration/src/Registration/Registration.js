import {useState,useRef} from 'react'

let Registration=()=>{
    let buttonRef=useRef(null)
    let passwordRef=useRef(null)
    let acceptTermsHandler=(event)=>{
    //writing us logic
    console.log(event.target.checked)
    /*if (event.target.checked == true) {
        buttonRef.current.disabled = false
    }
    else {
        buttonRef.current.disabled = true
    }*/
   // setTerms(event.target.checked)
    buttonRef.current.disabled=!event.target.checked
    }

    let passwordHandler=()=>{
        passwordRef.current.type="text"
    }
    return (
        <div className='container mt-5'>
          <div className='row'>
              <div className='col-md-5'>
                <div className='card'>
                    <div className='card-header'>
                        <h1>Registration</h1>
                    </div>
                    <div className='card-body'>
                       <form>
                         <div className='form-group'>
                           <input placeholder="User Name" type="text" className="form-control"/>
                         </div>
                         <div className='form-group'>
                           <input placeholder="Email" type="text" className="form-control"/>
                         </div>
                         <div className='form-group'>
                           <input placeholder="Mobile" type="text" className="form-control"/>
                         </div>
                         <div className='form-group'>
                           <input ref={passwordRef} placeholder="Password" type="password" className="form-control"/>
                           <i className="fa fa-eye" onClick={passwordHandler}></i>
                         </div>
                         <div className='form-check'>
                           <input type="checkbox" onChange={acceptTermsHandler} className='form-check-input'/>
                         <label className='form-check-label'>Accept Terms & Conditions</label>
                         </div>

                         <input type="submit" value="Register" className='btn btn-success' disabled ref={buttonRef}/>
                       </form>
                    </div>
                </div>
              </div>
          </div>
        </div>
    )
}

export default Registration