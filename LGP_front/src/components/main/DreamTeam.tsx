import React from "react";
import { friends } from "../../utils/constants";
import Friend from "./Friend";

const DreamTeam = () => {
  return (
    <div>
      <section className="float-end w-50 mx-1 row  border  border-2 border-warning ">
        <h2 className="text-center col-12">Dream Team</h2>
        {friends.map((friend, index) => (
          <Friend key={index} friendSrc={friend} number={index + 1}/>
        ))}
        {/* <img src="./images/friend1.jpg" alt="friend1" />
    <img src="./images/friend2.jpg" alt="friend2" />
    <img src="./images/friend3.jpg" alt="friend3" />
    <img src="./images/friend4.jpg" alt="friend4" />
    <img src="./images/friend5.jpg" alt="friend5" />
    <img src="./images/friend6.jpg" alt="friend6" />
    <img className="img7"
     src="./images/friend7.jpg" alt="friend7" />
    <img src="./images/friend8.jpg" alt="friend8" />
    <img className="img9"
     src="./images/friend9.jpg" alt="friend9" /> */}
      </section>
    </div>
  );
};

export default DreamTeam;
