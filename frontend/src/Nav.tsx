import React from 'react'
import './Nav.css'

function Nav() {
    return (
        <div>
            <h1 className="nav-title">Information on Cars</h1>
            <nav className="nav-list">
                <li>Home</li>
                <li>About</li>
                <li>Contact</li>
            </nav>
        </div>
    )
}

export default Nav