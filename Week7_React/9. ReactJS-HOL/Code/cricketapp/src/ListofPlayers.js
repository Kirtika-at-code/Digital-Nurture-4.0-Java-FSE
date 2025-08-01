import React from "react";
const ListOfPlayers=()=>{
    const players=[
        {name:"Rohit Sharma",score:90},
        {name:"Virat Kohli",score:85},
        {name:"Kl Rahul",score:70},
        {name:"Hardik Pandya",score:75},
        {name:"Rishabh Pant",score:65},
        {name:"Shubman Gill",score:75},
        {name:"Ravindra Jadeja",score:55},
        {name:"Jasprit Bumrah",score:60},
        {name:"M Shami",score:50},
        {name:"Kuldeep Yadav",score:50},
        {name:"MS Dhoni",score:80},
    ];
    const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with score below 70</h3>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;