import React from 'react'
import { GoogleMap, LoadScript } from '@react-google-maps/api';

const containerStyle = {
  width: '400px',
  height: '400px'
};

const center = {
  lat: 53.4710712,
  lng: -2.2408077
};

function Map() {
  return (
    <LoadScript
      googleMapsApiKey="AIzaSyAi7fqe7ou0PmXQOk2eDcYPsXicBctqmrY"
    >
      <GoogleMap
        mapContainerStyle={containerStyle}
        center={center}
        zoom={15}
      >
        { /* Child components, such as markers, info windows, etc. */ }
        <></>
      </GoogleMap>
    </LoadScript>
  )
}

export default React.memo(Map)