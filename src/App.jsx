import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Card from './components/card'
function App() {
  let [color, changeColor] = useState("bg-red-400")
   
  return (
    <>
        <h1 >Hello This Is AR</h1>

    <h1 className={color} style={(color == "bg-black") ? {color: "white"} : { color: "black" }}>Hello This Is AR</h1>
    <div className='m-50'>
       <button onClick={()=>changeColor("bg-green-300")} className='m-5 bg-green-400'>Green</button>
       <button onClick={()=>changeColor("bg-yellow-300")} className='m-5 bg-yellow-400'>Yellow</button>
       <button onClick={()=>changeColor("bg-blue-300")} className='m-5 bg-blue-400'>Blue</button>
       <button onClick={()=>changeColor("bg-orange-300")} className='m-5 bg-orange-400'>Orange</button>
      <button onClick={()=>changeColor("bg-gray-300")} className='m-5 bg-gray-400'>Gray</button>
       <button onClick={()=>changeColor("bg-pink-300")} className='m-5 bg-pink-400'>Pink</button>
       <button onClick={()=>changeColor("bg-purple-300")} className='m-5 bg-purple-400'>Purple</button>
       <button onClick={()=>changeColor("bg-black")} className='m-5 bg-black text-white'>Black</button>
    </div>
    </>
  )
}

export default App
