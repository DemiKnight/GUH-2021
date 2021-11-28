import React from 'react'

class CarImages extends React.Component {
    render() {
        return (
            <div className="image-container">
                <img className="car-image" src="https://a.png"></img>
                <img className="car-image" src="https://a.png"></img>
                <img className="car-image" src="https://a.png"></img>
            </div>
        )
    }
}

export default CarImages

//src will link to image fetched from backend