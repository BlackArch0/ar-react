import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Child1 from './child/child1'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Child1/>
    </>
  )
}

export default App
