import React from 'react'
import './Nav.css'
import {AppBar, IconButton, Toolbar, Typography} from '@material-ui/core/';
// import { Nav,  NavItem } from "react-bootstrap"
// import { IndexLinkContainer } from "react-router-bootstrap"
// import { Link } from 'react-router-dom';
import MenuIcon from '@material-ui/icons/Menu';
import {Map, MapRounded, MapTwoTone} from "@material-ui/icons";

// import * as React from 'react';

// function Aba() {
//     return (
//
//         <div>
//             <h1 className="nav-title">Information on Cars</h1>
//             <nav className="nav-list">
//
//                 <li>Home</li>
//                 <li>About</li>
//                 <li>Contact</li>
//             </nav>
//
//         </div>
//
//     )
// }
//
// export default Aba
function Nav() {

    return (
        <div>
        <AppBar position="static">
            <Toolbar>
                <IconButton  aria-label="Menu" color="inherit">
                    <MenuIcon aria-haspopup="true"/>
                    <MapRounded> </MapRounded>
                </IconButton>

            </Toolbar>

        </AppBar>
        </div>
    );
}
export default Nav

/*
                <Typography  color="inherit">
                    <Link style={{color: "white"}} to="/">test</Link>
                    <Link to="/FirstComponent"> Page 1 </Link>
                    <Link to="/SecondComponent"> Page 2 </Link>
                </Typography>
 */