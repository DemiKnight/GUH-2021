import React from 'react'
import './Nav.css'
import {AppBar, IconButton, Toolbar, Typography} from '@material-ui/core/';
import MenuIcon from '@material-ui/icons/Menu';
import {MapRounded} from "@material-ui/icons";

function Nav() {

    return (
        <div>
        <AppBar position="static">
            <Toolbar>
                <IconButton  aria-label="Menu" color="inherit">
                    <MenuIcon aria-haspopup="true"/>
                    <Drawer
                        open={true}
                        variant='permanent'
                        anchor='bottom'>

                    </Drawer>
                </IconButton>

            </Toolbar>

        </AppBar>
        </div>
    );
}
export default Nav