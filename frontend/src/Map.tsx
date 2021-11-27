import React from 'react'
import { GoogleMap, LoadScript } from '@react-google-maps/api';

function getDimensions() {
  const { innerWidth, innerHeight } = window
  return { innerWidth, innerHeight }
}

const containerStyle = {
  width: getDimensions().innerWidth,
  height: getDimensions().innerHeight / 1.25
};

const center = {
  lat: 53.4710712,
  lng: -2.2408077
};

class Map extends React.Component {
  render() {
    return (
      <LoadScript
        googleMapsApiKey="AIzaSyAi7fqe7ou0PmXQOk2eDcYPsXicBctqmrY"
      >
        <GoogleMap
          id='map-container'
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
}

export default React.memo(Map)