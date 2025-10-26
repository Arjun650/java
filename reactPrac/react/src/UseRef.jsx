import React, { useRef } from 'react';

function UseRef() {
  const inputRef = useRef(null); // Create a ref

  const handleClick = () => {
    inputRef.current.focus(); // Access DOM directly to focus input
  };

  return (
    <div>
      <input ref={inputRef} type="text" placeholder="Type here..." />
      <button onClick={handleClick}>Focus Input</button>
    </div>
  );
}

export default UseRef;
