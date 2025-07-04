import React from 'react'
import { useContext } from 'react'
import MailBox from '../context/mailbox'
function Child1() {
  let {candy, setCandy} = useContext(MailBox)
  return (
       <div>
      <h2>My Candy is: {candy}</h2>
      <button onClick={() => setCandy("Kacha Mango")}>
        Change Candy
      </button>
    </div>
  )
}

export default Child1