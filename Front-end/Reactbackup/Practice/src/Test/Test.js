import { useState } from "react";


 let Test=()=>{
    let [details,setDetails]=useState({
        empname:"",
        empnumber:""
    })
   let updateFormHandler = (event) => {
        setDetails({ [event.target.name]: event.target.value })
    }
    let submitHandler = (event) => {
        event.preventDefault();
        console.log(event.details)
    }
    
        return (
            <div className="container mt-5">
                <pre>{JSON.stringify(details)}</pre>
                <div className="row">
                    <div className="col-md-4">
                        <div className="card">
                            <div className="card-header">
                                <form onSubmit={submitHandler}>
                                    <div className="form-group">
                                        <input type="text" name="empname" className="form-control" placeholder="Emp Name" onChange={updateFormHandler} />
                                    </div>
                                    <div className="form-group">
                                        <input type="number" name="empnumber" className="form-control" placeholder="Emp number" onChange={updateFormHandler} />
                                    </div>
                                   
                                    <div className="form-group">
                                        <input type="submit" className="btn btn-primary" />
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
 

export default Test