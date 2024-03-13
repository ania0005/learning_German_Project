import React from "react";
import { Route, Router, Routes } from "react-router-dom";
import Home from "../pages/Home";
import About from "../pages/About";
import Levels from "../pages/Level";
import Registration from "../pages/Registration";


interface MainProps {
  page: string;
}

const Main: React.FC<MainProps> = ({ page }) => {
  return(
    <Routes>
    <Route path='/' element={<Home />} />
    <Route path='/about' element={<About/>} />
    <Route path='/level' element={<Levels/>} />
    <Route path='/registration' element={<Registration/>} />
</Routes>
  )
 
};

export default Main;
