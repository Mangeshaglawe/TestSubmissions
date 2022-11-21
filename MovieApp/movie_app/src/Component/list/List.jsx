import { ArrowBackIosOutlined, ArrowForwardIosOutlined } from '@material-ui/icons'
import React from 'react'
import ListItem from '../listitem/ListItem'
import "./list.css"

const List = () => {
  return (
    <div className='list'>
      <span className="listTitle">Continue to Watch ...</span>
      <div className="wrapper">
        <ArrowBackIosOutlined/>
           <div className="container">
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
            <ListItem/>
           </div> 
        <ArrowForwardIosOutlined/>
      </div>
    </div>
  )
}

export default List
