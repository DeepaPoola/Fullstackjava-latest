import React,{useState} from 'react'
import Axios from 'axios'

let CreateProduct=()=>{
    let [product,setProduct]=useState({
        name:"",
        price:"",
        qty:"",
        info:""
    });
    let updateHandler=(event)=>{
      setProduct({...product,[event.target.name]:event.target.value})
    }
     let productHandler=()=>{
        let url="https://localhost:8080/product"
        Axios.post(url,product).then(()=>{}).catch(()=>{})
     }
    return <div className='container mt-5'>
     <div className="row">
        <div className='col-md-5'>
           <div className='card'>
              <div className='card-header bg-primary text-white'>
                    <h3>Create Product</h3>
              </div>
              <div className='card-body'>
                 <form onSubmit={productHandler}>
                    <div className='form-group'>
                        <input placeholder="Product Name" type="text" className='form-control' name="name" onChange={updateHandler}/>
                    </div>
                    <div className='form-group'>
                        <input placeholder="Price" type="text" className='form-control' name="price" onChange={updateHandler}/>
                    </div>
                    <div className='form-group'>
                        <input placeholder="Qty" type="text" className='form-control' name="qty" onChange={updateHandler}/>
                    </div>
                    <div className='form-group'>
                        <input placeholder="info" type="text" className='form-control' name="info" onChange={updateHandler}/>
                    </div>
                    <div>
                        <input type='submit' value="Create Product" className='btn btn-primary'/>
                    </div>
                 </form>
              </div>
           </div>
        </div>
     </div>
    </div>
}

export default CreateProduct