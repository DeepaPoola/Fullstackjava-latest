let demo=(success,failure)=>{
    //insert data into database and get the result is boolean value
let flag=true
if(flag==true)
{
console.log("Inserted successfully")
}
else{
console.log("Not successfull")
}
}

demo((msg)=>{
console.log(msg)
},(error)=>{
console.log(error)
}
)