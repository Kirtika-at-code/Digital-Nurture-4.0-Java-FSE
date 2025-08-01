import logo from './logo.svg';
import './App.css';
import ListOfPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = false; 

  return (
    <div className="App">
      <h1>🏏 Welcome to Cricket App</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}
export default App;