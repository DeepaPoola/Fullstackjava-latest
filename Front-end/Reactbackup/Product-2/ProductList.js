import React,{useState,useEffect} from 'react'
import Axios from 'axios'
let ProductList=()=>{
    let [products,setProducts]=useState([])
    useEffect(()=>{
        let url="https://localhost:8080/products"
        Axios.get(url).then((response)=>{
           setProducts(response.daat)
        }).catch()
    },[])
    return (
        <div className='container'>
            <h1>Display Product</h1>
            <div className='row'>
               {
                 products.length >0?<>
                   {
                     products.map((product)=>{
                        return <div className='col-md-3'>
                           <div className='card'>
                               <div className='card-body'>
                                 <ul className='list-group'>
                                    <li className='list-group-item'>{product.name}</li>
                                    <li className="list-group-item">{product.price}</li>
                                                <li className="list-group-item">{product.qty}</li>
                                                <li className="list-group-item">{product.info}</li>
                                 </ul>
                               </div>
                           </div>
                        </div>
                     })
                   }
                 </>:null
               }
            </div>
        </div>
    )
}

export default ProductList