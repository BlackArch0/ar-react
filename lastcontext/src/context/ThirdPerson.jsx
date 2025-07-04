import { useState } from "react";
import MailBox from "./mailbox"
let ThirdPerson = ({children})=>{
 let [candy, setCandy] = useState("Mango Bite")
    return(
     <MailBox.Provider value={{candy, setCandy}}>
        {children}
     </MailBox.Provider>

    )
}
export default ThirdPerson;