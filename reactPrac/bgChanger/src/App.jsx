import React, { useState } from 'react'
import colors from './helper/colors';

const App = () => {
  const [color, setColor] = useState("bg-pink-500");
  console.log(colors)
  return (
    <div className={`w-full h-screen ${color}`}>

      <div className='fixed bottom-4 flex justify-center items-center flex-wrap inset-x-0'>
        {
          colors.map((val, ind) => {
            return <div key={ind} className='px-4'>
              <button onClick={() => setColor(val.bg)}
                className={`${val.bg}  text-white w-32 h-14 rounded-2xl text-2xl font-semibold shadow hover:scale-105 transition transform duration-200 flex items-center justify-center`}
              >
                {val.name}
              </button>

            </div>
          })
        }
      </div>
    </div>
  )
}

export default App
