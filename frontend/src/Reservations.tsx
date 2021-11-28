// //reseration page
// // BOOKING:
// // case class Booking(
// //                       date: LocalDateTime,
// //                       arrivalAirport: String,
// //                       destinationAirport: String,
// //                       bookingNumber: String)
// // case class Car(
// //                  carModel: String,
// //                  isAutomatic: Boolean,
// //                  isRightSided: Boolean)
// //
// //
//
// import React from "react"
// // import Box from '@mui/material/Box'
// import TextField from '@mui/material/TextField'
// import AdapterDateFns from '@mui/lab/AdapterDateFns'
// import LocalizationProvider from '@mui/lab/LocalizationProvider'
// import {DateTimePicker} from "@mui/lab";
//
//
// export default function Reservations () {
//     // const date = new Date();
//     // let ISOdate = date.toISOString();
//     //
//     // const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
//     //
//     // }
//     return (
//         <body>
//         <LocalizationProvider dateAdapter={AdapterDateFns}>
//             <DateTimePicker
//                 renderInput={(props) => <TextField {...props} />}
//                 label="DateTimePicker"
//                 value={value}
//                 onChange={(newValue) => {
//                     setValue(newValue);
//                 }}
//             />
//         </LocalizationProvider>
//
//         </body>
//     )
// }

// import * as React from 'react';
// // import TextField from '@mui/material/TextField';
// // import AdapterDateFns from '@mui/lab/AdapterDateFns';
// // import LocalizationProvider from '@mui/lab/LocalizationProvider';
// // import DateTimePicker from '@mui/lab/DateTimePicker';
//
// export default function BasicDateTimePicker() {
//
//
//     return (
//         <body>
//         <label htmlFor="selectDate"><em>Select Date</em></label>
//         <select id="day" name="day">
//             <option value="0">01</option>
//             <option value="1">02</option>
//             <option value="2">03</option>
//             <option value="3">04</option>
//             <option value="4">05</option>
//             <option value="5">06</option>
//             <option value="6">07</option>
//             <option value="7">08</option>
//             <option value="8">09</option>
//             <option value="9">10</option>
//             <option value="10">11</option>
//             <option value="11">12</option>
//             <option value="12">13</option>
//             <option value="13">14</option>
//             <option value="14">15</option>
//             <option value="15">16</option>
//             <option value="16">17</option>
//             <option value="17">18</option>
//             <option value="18">07</option>
//             <option value="19">08</option>
//             <option value="20">09</option>
//             <option value="21">10</option>
//             <option value="22">11</option>
//             <option value="23">12</option>
//             <option value="24">01</option>
//             <option value="25">02</option>
//             <option value="26">03</option>
//             <option value="27">04</option>
//             <option value="28">05</option>
//             <option value="29">06</option>
//             <option value="30">07</option>
//             <option value="31">08</option>
//         </select>
//     <select id="month" name="month">
//         <option value="0">01</option>
//         <option value="1">02</option>
//         <option value="2">03</option>
//         <option value="3">04</option>
//         <option value="4">05</option>
//         <option value="5">06</option>
//         <option value="6">07</option>
//         <option value="7">08</option>
//         <option value="8">09</option>
//         <option value="9">10</option>
//         <option value="10">11</option>
//         <option value="11">12</option>
//     </select>
//     <label htmlFor="year"></label>
//     <select id="year" name="year">
//         <option value="2021">2021</option>
//         <option value="2022">2022</option>
//         <option value="2023">2023</option>
//         <option value="2024">2024</option>
//         <option value="2025">2025</option>
//         <option value="2026">2026</option>
//         <option value="2027">2027</option>
//         <option value="2028">2028</option>
//         <option value="2029">2029</option>
//         <option value="2030">2030</option>
//     </select>
//         </body>
//     )
//
// }

// import * as React from 'react';
// import TextField from '@mui/material/TextField';
// import Stack from '@mui/material/Stack';
// // import isolateModules = jest.isolateModules;
//
// export default function NativePickers() {
//     const date = new Date()
//     return (
//         <Stack component="form" spacing={3}>
//
//             <TextField
//                 id="datetime-local"
//                 label="Booking date"
//                 type="datetime-local"
//                 defaultValue={date.toISOString()}
//                 sx={{ width: 250 }}
//                 InputLabelProps={{
//                     shrink: true,
//                 }}
//             />
//         </Stack>
//     );
// }
import React from 'react';
import TextField from '@mui/material/TextField';
import AdapterDateFns from '@mui/lab/AdapterDateFns';
import LocalizationProvider from '@mui/lab/LocalizationProvider';
import DateTimePicker from '@mui/lab/DateTimePicker';

export default function BasicDateTimePicker() {
    const [value, setValue] = React.useState(new Date());
    const newValue = new Date();
    return (
        <LocalizationProvider dateAdapter={AdapterDateFns}>
            <DateTimePicker
                renderInput={(props) => <TextField {...props} />}
                label="DateTimePicker"
                value={value}
                onChange={(newValue) => {
                    setValue(newValue);
                }}
            />
        </LocalizationProvider>
    );
}
