// import React from 'react';
// import './App.css';
// // import Nav from './Nav';
// // import SignIn from './home'
// // import Reservations from "./Reservations";
// import ResponsiveDateTimePickers from "./Reservations";
//
//
// class App extends React.Component {
//   render() {
//     return (
//         <div>
//           {/*<Nav/>*/}
//           {/*<SignIn/>*/}
//           <ResponsiveDateTimePickers/>
//         </div>
//     )
//   }
// }
//
// export default App
import React, { Component } from 'react';
import DatePicker from 'react-datepicker';
import addDays from 'date-fns/addDays'
import "react-datepicker/dist/react-datepicker.css";
import 'bootstrap/dist/css/bootstrap.min.css';


class App extends Component {

    constructor (props) {
        super(props)
        this.state = {
            startDate: new Date()
        };
        this.handleChange = this.handleChange.bind(this);
        this.onFormSubmit = this.onFormSubmit.bind(this);
    }

    handleChange(date) {
        this.setState({
            startDate: date
        })
    }

    onFormSubmit(e) {
        e.preventDefault();
        console.log(this.state.startDate)
    }

    render() {
        return (
            <form onSubmit={ this.onFormSubmit }>
                <div className="form-group">
                    <DatePicker
                        selected={ this.state.startDate }
                        onChange={ this.handleChange }
                        showTimeSelect
                        timeFormat="HH:mm"
                        timeIntervals={20}
                        timeCaption="time"
                        dateFormat="MMMM d, yyyy h:mm aa"
                        minDate={new Date()}
                        maxDate={addDays(new Date(), 7)}
                    />
                    <button className="btn btn-primary">Show Date</button>
                </div>
            </form>
        );
    }

}

export default App;