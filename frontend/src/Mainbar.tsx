import React from 'react'
import './Mainbar.css'

class MainBar extends React.Component {
    returnsFalse() { return false }

    render() {
        return (
            <div className="div-bg">
                <h2 className="bar-title">Cars</h2>
                <div className="search-bar" role="search">
                    <form id="searchCar" className="search-form" onSubmit={this.returnsFalse}>
                        <input className="search-input" type="text"></input>
                    </form>
                </div>
                <p></p>
                
            </div>
        )
    }
}

export default MainBar

//<img src="https://a.png"></img>