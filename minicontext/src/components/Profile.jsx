import React, { useContext } from 'react'
import UserContext from '../context/UserContext'

function Profile() {
    <h2>hello</h2>
    let {user} = useContext(UserContext)
if(!user) return <div>Please LOG in</div>

return <div>Choasss!! {user.username}</div>
}

export default Profile;