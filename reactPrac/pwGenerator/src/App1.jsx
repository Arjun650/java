// import { useState } from "react"

import React, { useState, useCallback } from 'react';

// const App = () => {
//   const[length, setLength] = useState(8); 
//   const[numAllowed, setNumAllowed] = useState(false); 
//   const[charAllo, setCharAllow] = useState(false); 
//   const[password, setPassword] = useState(""); 
  
//   const passwordGenerator = () =>{
      
//   }

//   return (
//     <div className="">
//       pw generator
//     </div>
//   )
// }

// export default App


function App(){
  const [count, setCount] = useState(0); 

  const handleClick = useCallback(() =>{
    console.log("Clicked"); 
  }, []); 

  // const handleClick = () =>{
  //   console.log("clicked")
  // }

  return (
    <>
      <button onClick={() => setCount(count + 1)}>Increment</button>

      <Child onClick={handleClick} />
      <p>Count: {count}</p>
    </>
  )
}

const Child = React.memo(({ onClick }) => {
  console.log("Child rendered");
  return <button onClick={onClick}>Click</button>;
});


export default App; 