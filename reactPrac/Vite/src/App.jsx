import React, { useEffect, useState } from 'react';

const App = () => {
  const [data, setData] = useState(null);
  const [trigger, setTrigger] = useState(0); 

  useEffect(() => {
    fetch("https://api.restful-api.dev/objects")
      .then(res => res.json())
      .then(res => setData(res))
      .catch(err => console.error(err));
  }, [trigger]);

  return (
    <div>
      <h1>Hello</h1>
      {data ? (
        <pre>{JSON.stringify(data, null, 2)}</pre>
      ) : (
        <p>Loading...</p>
      )}


      <button onClick={() =>{setTrigger(prev => prev + 1)}}>fetch</button>
    </div>
  );
}

export default App;
