import React, { useRef, useState } from 'react'
import UseRef from './UseRef';

const App = () => {
  // const [count, setCount] = useState(0);    // causes re-render
  // const countRef = useRef(0);               // does NOT cause re-render

  return (
    // <div>
    //   <p>State Count: {count}</p>
    //   <p>Ref Count: {countRef.current}</p>

    //   <button onClick={() => setCount(count + 1)}>Increase State</button>
    //   <button onClick={() => (countRef.current += 1)}>Increase Ref</button>
    //   {
    //     console.log("button clicked")
    //   }
    // </div>
    <UseRef />
  );
}

export default App
