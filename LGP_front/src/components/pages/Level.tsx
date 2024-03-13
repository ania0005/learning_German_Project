import React, { useEffect, useState } from "react";

const Levels = () => {
  const [levels, setLevels] = useState([]);

  useEffect(() => {
    fetch("https://sw-info-api.herokuapp.com/v1/planets")
      .then((response) => response.json())
      .then((data) => {
        const namesOfLevel = data.map((e: { name: string }) => e.name);
        setLevels(namesOfLevel);
      });
  }, []);
  return (
    <div>
      <form
        style={{ display: "flex", flexDirection: "column" }}
        onSubmit={(e) => e.preventDefault()}
      >
        <label>
          First Name
          <input type="text" placeholder="Your name..." />
        </label>
        <label>
          Level
          <select required>
            <option value="">Choose level: </option>
            {levels.map((item, index) => (
              <option value={item} key={index}>
                {item}
              </option>
            ))}            
          </select>
        </label>
        <label>
          Subject
          <textarea name="" id="" cols={30} rows={10}></textarea>
          <button type="submit">Submit</button>
        </label>
      </form>
    </div>
  );
};

export default Levels;