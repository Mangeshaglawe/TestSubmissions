import { AccountCircle, ArrowDropDown, Notifications, Search } from '@material-ui/icons'
import React from 'react'
import "./navbar.css"


const Navbar = () => {
  return (
    <div className='navbar'>
        <div className="container">
            <div className="left">
                <img 
                    src="https://upload.wikimedia.org/wikipedia/commons/0/08/Netflix_2015_logo.svg"
                    alt= "img" 
                    height="25px"
                />
             <span>HomePage</span>
             <span>Series</span>
             <span>Movies</span>
             <span>Popular</span>
             <span>My List</span>    
             </div>
            <div className="right">
                <Search className='icon'/>
                <span>KID</span>
                <Notifications className='icon'/>
                {/* <AccountCircle/> */}
                <img src="https://upload.wikimedia.org/wikipedia/en/4/46/Bulbbul.jpg" alt="profile" className='profileimage' />
                <div className="profile">

                    <ArrowDropDown className='icon'/>
                    <div className="options">
                        <span>Setting</span>
                        <span>Logout</span>
                    </div>
                </div>
                
                {/* <img src="../../../src/utils/img/MV5BMjA0Njg1OTg0Nl5BMl5BanBnXkFtZTgwNzQ2MzkwNzE@._V1_SY250_CR0,0,178,250_AL_.jpg" alt="" /> */}
                
            </div>
            
        </div>
    </div>
  )
}

export default Navbar
