import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [USD, setUSD] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();

    const rate = 0.011;
    const result = parseFloat(rupees) * rate;
    setUSD(result.toFixed(2));
  };

  return (
    <div>
      <h2>Currency Converter (INR to USD)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter INR amount"
        />
        <button type="submit">Convert</button>
      </form>

      {USD !== null && <p>USD: ${USD}</p>}
    </div>
  );
}

export default CurrencyConvertor;
