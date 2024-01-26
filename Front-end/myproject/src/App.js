import React,{useState} from 'react'
import Login from './Forms/Login';
import TaskList from './Forms/TaskList';
import Footer from './Forms/Footer';
import './App.css';

const App = () => {
  const [tasks,setTask]=useState([
    {id:10,name:"Record",completed:true},
    {id:11,name:"Watch",completed:false},
    {id:12,name:"view",completed:true}
])
  return (
   <div>
    
    <Login tasks={tasks} setTask={setTask}/>
    <TaskList tasks={tasks} setTask={setTask}/>
    
    <Footer/>
   </div>
  )
}

export default App;
