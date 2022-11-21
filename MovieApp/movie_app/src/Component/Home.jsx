import { AcUnit } from '@material-ui/icons'
import React from 'react'
import './Home.css'
import Navbar from './navbar/Navbar'
import Featured from "../Component/featured/Featured"
import List from "../Component/list/List"
const Home = () => {
  return (
    <div className='home'>
      <Navbar/>
      {/* <img src="https://upload.wikimedia.org/wikipedia/en/4/46/Bulbbul.jpg" alt="profile"  width="100%" />   */}
      <Featured/>
      <List/>
      <List/>
      <List/>
      <List/>
    </div>
  )
}

export default Home
