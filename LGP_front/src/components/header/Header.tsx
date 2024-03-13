import React from "react";
import Navigation from "./Navigation";



interface HeaderProps {
  onPageChange: ( newPage: string) =>  void;
}

const Header: React.FC<HeaderProps> = ({ onPageChange }) => {
  return (
    <header>
      <Navigation onPageChange={onPageChange} />
      <h2 className='text-center'>Learn German grammar with us!!!!!<br/>Learning German grammar with exercises.</h2>
     </header>
  );
};

export default Header;






