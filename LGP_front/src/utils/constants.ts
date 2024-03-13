import exp from 'constants';
import friend1 from '../images/friend1.jpg';
import friend2 from '../images/friend2.jpg';
import friend3 from '../images/friend3.jpg';
import friend4 from '../images/friend4.jpg';
import friend5 from '../images/friend5.jpg';
import friend6 from '../images/friend6.jpg';
import friend7 from '../images/friend7.jpg';
import friend8 from '../images/friend8.jpg';
import friend9 from '../images/friend9.jpg';

export const navItems: {item: string, path: string}[] = [
    { item: "Home", path: "/" },
    { item: "About me", path: "/about" },
    { item: "Level of study", path: "/level" },
    { item: "Star Wars", path: "/starwars" },
  ];
export const friends = [
    friend1, friend2, friend3, friend4, friend5, friend6, friend7, friend8, friend9
];

export const navLevels: {item: string, path: string}[] = [
  { item: "Grammar and exercises A0 - A1", path: "/level/level1" },
  { item: "Grammar and exercises A1 - A2", path: "/level/level2" },
  { item: "Grammar and exercises A2 - B1", path: "/level/level3" },
  { item: "Grammar and exercises B1 - B2", path: "/level/level4" },
  { item: "Grammar and exercises B2 - C1", path: "/level/level5" },
  { item: "Grammar and exercises C1 - C2", path: "/level/level6" },
];

export const month = 1000*60*60*24*30;
