import logo from './logo.svg';
import './App.css';

import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const incrementCount = () => {
    setCount(prev => prev + 1);
  };

  const sayHello = () => {
    alert("Hello! Have a great day 😊");
  };

  const handleIncrease = () => {
    incrementCount();
    sayHello();
  };

  const handleDecrease = () => {
    setCount(prev => prev - 1);
  };

  const sayMessage = (msg) => {
    alert(msg);
  };

  const handlePress = (e) => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>Event Handling Examples</h1>

      <h2>Counter: {count}</h2>
      <button onClick={handleIncrease}>Increase</button>
      <button onClick={handleDecrease}>Decrease</button>

      <br /><br />

      <button onClick={() => sayMessage("Welcome to React Events!")}>Say Welcome</button>

      <br /><br />

      <button onClick={handlePress}>OnPress</button>

      <br /><br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
