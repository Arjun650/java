import React, { useContext } from "react";
import "./App.css";
import themeContext from "./context/themeContext";

function App() {
  const { theme, setTheme } = useContext(themeContext);

  const handleSubmit = () => {
    setTheme(theme === "dark" ? "light" : "dark");
  };

  return (
    <div className={`h-[899px] ${theme === "dark" ? "bg-black text-white" : "bg-white text-black"}`}>
      <div className="w-full">
        <div className="w-full max-w-sm mx-auto mb-4">
          test
        </div>

        <button
          onClick={handleSubmit}
          className="px-4 py-2 rounded bg-gray-300 dark:bg-gray-700"
        >
          Toggle to {theme === "dark" ? "light" : "dark"}
        </button>
      </div>
    </div>
  );
}

export default App;
