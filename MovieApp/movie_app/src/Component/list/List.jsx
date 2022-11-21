import { ArrowBackIosOutlined, ArrowForwardIosOutlined } from '@material-ui/icons'
import React from 'react'
import "./list.css"

const List = () => {
  return (
    <div className='list'>
      <span className="listTitle">Continue to Watch ...</span>
      <div className="wrapper">
        <ArrowBackIosOutlined/>
           <div className="container">
            
           </div> 
        <ArrowForwardIosOutlined/>
      </div>
    </div>
  )
}

export default List
