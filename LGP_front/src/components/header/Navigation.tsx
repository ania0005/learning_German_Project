import React from "react";
import NavItem from "./NavItem";
import { navItems } from "../../utils/constants";



interface NavigationProps {
  onPageChange: (newPage: string) => void;
}

const Navigation: React.FC<NavigationProps> = ({ onPageChange }) => {
  return (
    <nav className='fixed-top mt-2 ms-4'>
      <ul className='nav'>
        {navItems.map((e, index) => (
          <NavItem
            key={index}
            item={e.item}
            path={e.path}  
            onClick={() => onPageChange(e.path)}
          />
        ))}
      </ul>
    </nav>
  );
};

export default Navigation;





