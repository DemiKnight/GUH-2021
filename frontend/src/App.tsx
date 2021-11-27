import React from 'react';
import './App.css';
import CarImages from './CarImages';
import MainBar from './Mainbar';
import Nav from './Nav';

class App extends React.Component {
  render() {
    return (
      <div>
        <Nav/>
        <MainBar/>
        <CarImages/>
      </div>
    )
  }
}

export default App
