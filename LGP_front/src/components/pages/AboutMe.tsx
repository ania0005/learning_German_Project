import React, { useEffect, useState } from "react";
import { month } from "../../utils/constants";

interface IHero {
  id: number;
  edited: string;
  name: string;
  created: string;
  gender: string;
  skin_color: string;
  hair_color: string;
  height: string;
  eye_color: string;
  mass: string;
  homeworld: number;
  birth_year: string;
  image: string;
}

const AboutMe = () => {
  const [isLoading, setIsloading] = useState(true);
  const [hero, setHero] = useState<undefined | IHero>();

  useEffect(() => {
    const heroFromlocalStorage = JSON.parse(localStorage.getItem("Luke")!);
    if (
      heroFromlocalStorage &&
      Date.now() - heroFromlocalStorage.time < month
    ) {
      setIsloading(false);
      setHero(heroFromlocalStorage);
    } else {
      fetch("https://sw-info-api.herokuapp.com/v1/peoples/1")
        .then((response) => response.json())
        .then((data) => {
          setHero(data);
          setIsloading(false);
          const infa = {
            payload: data,
            time: Date.now(),
          };
          localStorage.setItem("Luke", JSON.stringify(data));
        });
    }
  }, []);

  return isLoading ? (
    <div className="spinner-border text-primary" role="status">
      <span className="visually-hidden">Loading...</span>
    </div>
  ) : (
    <>
      {hero && (
        <div>
          <img
            src={`https://sw-info-api.herokuapp.com/${hero.image}`}
            alt={hero.name}
          />
          <p>
            Name: {hero.name}
            <br />
            Edited: {hero.edited}
            <br />
            Created: {hero.created}
            <br />
            Gender: {hero.gender}
            <br />
            Skin_color: {hero.skin_color}
            <br />
            Hair_color: {hero.hair_color}
            <br />
            Height: {hero.height}
            <br />
            Eye_color: {hero.eye_color}
            <br />
            Mass: {hero.mass}
            <br />
            Homeworld: {hero.homeworld}
            <br />
            Birth_year: {hero.birth_year}
            <br />
          </p>
        </div>
      )}
    </>
  );
};

export default AboutMe;
