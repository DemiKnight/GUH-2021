import React from 'react';
import './App.css';
import CarImages from './CarImages';
import MainBar from './Mainbar';
import Map from './Map';
import Nav from './Nav';

class App extends React.Component {
  render() {
    return (
      <div>
        <Nav/>
        <MainBar/>
        <CarImages/>
        <Map/>
      </div>
    )
  }
}

export default App
