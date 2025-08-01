import React from "react";

const IndianPlayers = () => {
  const players = ["Rohit Sharma", "Shubman Gill", "Virat Kohli", "Ravindra Jadeja", "KL Rahul", "Hardik Pandya", "Rishabh Pant", "M Shami", "Jasprit Bumrah", "Kuldeep Yadav", "MS Dhoni"];

  
  const oddTeam = players.filter((_, index) => index % 2 === 0);
  const evenTeam = players.filter((_, index) => index % 2 !== 0);

  const T20players = ["Surya", "Ishan", "Samson"];
  const RanjiTrophyPlayers = ["Pujara", "Rahane", "Shaw"];
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Indian Team - Odd and Even Teams</h2>
      <h4>Odd Team:</h4>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h4>Even Team:</h4>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>All Players (T20 + Ranji Trophy)</h3>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
