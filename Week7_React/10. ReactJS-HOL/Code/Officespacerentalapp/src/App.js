import logo from './logo.svg';
import './App.css';
import office1 from './office1.jpg';
import office2 from './office2.jpg';
import office3 from './office3.jpg';

function App() {
  const officeList = [
    {
      id: 1,
      name: "Regus Office Space",
      rent: 55000,
      address: "Sector 62, Noida",
      image: office1
    },
    {
      id: 2,
      name: "WeWork Space",
      rent: 75000,
      address: "Koramangala, Bangalore",
      image: office2
    },
    {
      id: 3,
      name: "Awfis Space",
      rent: 60000,
      address: "Connaught Place, Delhi",
      image: office3
    }
  ];

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>
      <div className="office-container">
        {officeList.map((office) => (
          <div key={office.id} className="office-card">
            <img src={office.image} alt={office.name} />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p className={office.rent > 60000 ? 'rent-green' : 'rent-red'}>
              <strong>Rent:</strong> ₹{office.rent}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
