import React from 'react'
import Profile from './components/profile'
import UserContextProvider from './context/UserContextProvider'
import Login from './components/login'

function App() {
  return (
    <UserContextProvider>
      <Login/>
      <Profile/>
    </UserContextProvider>
  )
}

export default App
