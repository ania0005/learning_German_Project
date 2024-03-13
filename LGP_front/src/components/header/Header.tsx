import React from "react";
import Navigation from "./Navigation";



interface HeaderProps {
  onPageChange: ( newPage: string) =>  void;
}

const Header: React.FC<HeaderProps> = ({ onPageChange }) => {
  return (
    <header>
      <Navigation onPageChange={onPageChange} />
      <h1 className='text-center'>Luke SkyWalker</h1>
    </header>
  );
};

export default Header;






