import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import ThirdPerson from './context/ThirdPerson.jsx'

createRoot(document.getElementById('root')).render(
  <ThirdPerson>
      <App />

    </ThirdPerson>
)
