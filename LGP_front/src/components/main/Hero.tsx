import React from "react";
import hero from '../../images/main.jpg'

const Hero = () => {
  return (    
      <section className="float-start me-3 w-25">
        <img className="w-100" src={hero} alt={"hero"} />
      </section>
    
  );
};

export default Hero;
