import logo from './logo.svg';
import './App.css';

import React, { useState } from 'react';
import BookDetails from './Components/BookDetails'
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

function App() {
  const [section, setSection] = useState("none"); 

  const renderIf = () => {
    if (section === "book") {
      return <BookDetails />;
    } else if (section === "blog") {
      return <BlogDetails />;
    } else if (section === "course") {
      return <CourseDetails />;
    } else {
      return <p>Please select a section above</p>;
    }
  };

  const renderSwitch = (sectionName) => {
    switch (sectionName) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <p>Switch: No section selected</p>;
    }
  };

  return (
    <div className="App">
      <h1>Blogger App</h1>

      <button onClick={() => setSection("book")}>Book Details</button>
      <button onClick={() => setSection("blog")}>Blog Details</button>
      <button onClick={() => setSection("course")}>Course Details</button>
      <button onClick={() => setSection("none")}>Clear</button>

      <hr />

      <h2>Rendered using: if statement</h2>
      {renderIf()}

      <hr />

      <h2>Rendered using: ternary</h2>
      {section === "book" ? (
        <BookDetails />
      ) : section === "blog" ? (
        <BlogDetails />
      ) : section === "course" ? (
        <CourseDetails />
      ) : (
        <p>No section selected (ternary)</p>
      )}

      <hr />

      <h2>Rendered using: && operator</h2>
      {section === "book" && <BookDetails />}
      {section === "blog" && <BlogDetails />}
      {section === "course" && <CourseDetails />}
      {section === "none" && <p>No section selected (&&)</p>}

      <hr />

      <h2>Rendered using: switch statement</h2>
      {renderSwitch(section)}
    </div>
  );
}

export default App;
