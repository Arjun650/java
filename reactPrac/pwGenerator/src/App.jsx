import { useCallback, useEffect, useRef, useState } from "react";

const App = () => {
  const [length, setLength] = useState(8);
  const [numAllowed, setNumAllowed] = useState(false);
  const [charAllo, setCharAllow] = useState(false);
  const [password, setPassword] = useState("");

  //refhook
  const passwordRef = useRef(null)

  const copyPasswordToClipboard = useCallback(() =>{
    passwordRef.current?.select()
    window.navigator.clipboard.writeText(password)}, [password])

  const passwordGenerator = useCallback((() => {
    let pass = ""
    let str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    if (numAllowed) {
      str += "0123456789"
    }
    if (charAllo) {
      str += "@#$%"
    }

    for (let i = 1; i <= length; i++) {
      let char = Math.floor(Math.random() * str.length + 1)
      pass += str.charAt(char)
    }

    setPassword(pass)

  }), [length, numAllowed, charAllo, setPassword])

  useEffect(() =>{passwordGenerator()}, [length, numAllowed, charAllo, passwordGenerator])


  return (
    <div className="w-full max-w-lg mx-auto shadow-md rounded-lg p-4 my-8 text-orange-900 bg-amber-600">
      <p className="text-white text-center text-2xl mb-2.5">Password Generator</p>
      <div className="flex shadow rounded-lg overflow-hidden mb-4">
        <input type="text" value={password} className="outline-none bg-amber-200 w-full py-1 px-3 text-xl" placeholder="password" readOnly ref={passwordRef} />
        <button className="outline-none bg-blue-700 text-white px-3  py-0.5 shrink-0" onClick={copyPasswordToClipboard}>Copy</button>
      </div>

      <div className="flex text-sm gap-x-2">
        <div className="flex items-center gap-x-1">
          <input type="range" min={8} max={100} value = {length} className="cursor-pointer" onChange={(e) => setLength(e.target.value)} />
          <label className="text-white text-md">Length: {length}</label>
        </div>
        <div className="flex items-center gap-x-1">
          <input type="checkbox" defaultChecked={numAllowed} id="numberInput" onChange={() =>{setNumAllowed((p) => !p)}} />
          <label className="text-white text-md">Number</label>
        </div>
        <div className="flex items-center gap-x-1">
          <input type="checkbox" defaultChecked={charAllo} id="charInput" onChange={() =>{setCharAllow((p) => !p)}} />
          <label className="text-white text-md">Character</label>
        </div>
      </div>
    </div>
  )
}

export default App
