import React from 'react'
import { useState } from 'react';
import { useEffect } from 'react'
import { useLoaderData } from 'react-router-dom';
function Github() {
    let data = useLoaderData()
    // let [data, setData] = useState([])
    // useEffect(()=>{
    //   fetch('https://api.github.com/users/BlackArch0')
    //   .then(res=> res.json())
    //   .then(data => {console.log(data); setData(data)})
    // }, [])
  return (
    <div className='text-center m-4 bg-gray-400 text-white text-3xl'>Github Followers: {data.followers}
    <img src={data.avatar_url} alt="image" className='w-30 mx-auto'/>
    </div>
  )
}

export default Github

export let GithubLoad = async () => {
    let res = await fetch('https://api.github.com/users/BlackArch0')
    let data = await res.json()
    return data
}