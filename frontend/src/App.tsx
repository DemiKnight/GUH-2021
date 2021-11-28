import React from 'react';
import './App.css';
// import Nav from './Nav';
// import SignIn from './home'
// import Reservations from "./Reservations";
import ResponsiveDateTimePickers from "./Reservations";


class App extends React.Component {
  render() {
    return (
        <div>
          {/*<Nav/>*/}
          {/*<SignIn/>*/}
          <ResponsiveDateTimePickers/>
        </div>
    )
  }
}

export default App
