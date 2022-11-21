import { InfoOutlined, PlayArrow } from '@material-ui/icons'
import React from 'react'
import './featured.css'

const featured = ({type}) => {
  return (
    <div className='featured'>
        {type && (
            <div className="category">
                <span className='categorySpan'>{type === "Movie" ?  "Movies" : "Series"}</span>
                <select name="genre" id="genre">
                <option >Genre</option>
                <option value="adventure">Adventure</option>
                <option value="comedy">Comedy</option>
                <option value="crime">Crime</option>
                <option value="fantasy">Fantasy</option>
                <option value="historical">Historical</option>
                <option value="horror">Horror</option>
                <option value="romance">Romance</option>
                <option value="sci-fi">Sci-fi</option>
                <option value="triller">Thriller</option>
                <option value="animation">Animation</option>
                <option value="drama">Drama</option>
                <option value="documentry">Documentry</option>
                </select>
            </div>
        )
 
        }
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxOHRBOMbet-5C_aDXMMna0jtexXZgb2639Q&usqp=CAU" alt="profile" width="100%" />
        
        <div className="info">
        
        <img src="https://cdn.europosters.eu/image/hp/69061.jpg" alt="" width="400px" /> 

        <span className='desc'>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. 
            Tempora ut voluptatibus doloremque cumque debitis assumenda facilis, consequatur 
            reprehenderit natus eius sunt eligendi laudantium necessitatibus praesentium. 
            Et illum suscipit asperiores quas.
        </span>
        
        <div className="buttons">
         <button className='play'>
            <PlayArrow/>
            <span>Play</span>    
        </button>   
         <button className='more'>
            <InfoOutlined/>
            <span>Info</span>        
        </button>   
        </div>
        </div>

    </div>
  )
}

export default featured
