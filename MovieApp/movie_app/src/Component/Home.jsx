import { AcUnit } from '@material-ui/icons'
import React from 'react'
import './Home.css'
import Navbar from './navbar/Navbar'
import Featured from "../Component/featured/Featured"

const Home = () => {
  return (
    <div className='home'>
      <Navbar/>
      {/* <img src="https://upload.wikimedia.org/wikipedia/en/4/46/Bulbbul.jpg" alt="profile"  width="100%" />   */}
      <Featured type="Series"/>
      
    </div>
  )
}

export default Home
