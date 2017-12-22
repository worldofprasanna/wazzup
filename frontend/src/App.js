import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

class App extends Component {

    constructor(props) {
        super(props);
        this.state = {
            serverData: 'waiting for response from server'
        };
        this.fetchServerData();
    }

    fetchServerData() {
        axios.get('/events').then(res => {
            this.setState({'serverData': res.data});
        })
    }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Wazzup !!!</h1>
        </header>
          <p>{this.state.serverData}</p>
        <p className="App-intro">
            Get to know the list of events happening around you ...
            Work In Progress !!!
        </p>
      </div>
    );
  }
}

export default App;
