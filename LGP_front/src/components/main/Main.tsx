import React from "react";
import { Route, Router, Routes } from "react-router-dom";
import Hero from "./Hero";
import DreamTeam from "./DreamTeam";
import FarGalaxy from "./FarGalaxy";
import { navItems } from "../../utils/constants";
import Home from "../pages/Home";
import AboutMe from "../pages/AboutMe";
import StarWars from "../pages/StarWars";
import Contacts from "../pages/Contacts";


interface MainProps {
  page: string;
}

const Main: React.FC<MainProps> = ({ page }) => {
  return(
    <Routes>
    <Route path='/' element={<Home />} />
    <Route path='/about' element={<AboutMe/>} />
    <Route path='/contacts' element={<Contacts/>} />
    <Route path='/starwars' element={<StarWars/>} />
</Routes>
  )
  // switch (page) {
  //   case navItems[0]:
  //     return <Home />;
  //   case navItems[1]:
  //     return <AboutMe />;
  //   case navItems[2]:
  //     return <StarWars />;
  //   default:
  //     return <Contacts />;
  // }
};

export default Main;
