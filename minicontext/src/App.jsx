import { useState } from 'react'
import './App.css'
import UserProvider from './context/UserProvider'
import LogIn from './components/LogIn'
import Profile from './components/Profile'

function App() {

  return (
     <UserProvider>
      <h1 className='bg-amber-300 text-center text-gray-800'>Aye Aye Captaiiiinnnn!!!!</h1>
     <LogIn/>  
       <Profile/> 
    </UserProvider> 
  )
}

export default App
