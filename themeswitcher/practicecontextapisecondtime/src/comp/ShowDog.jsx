import { useContext } from "react";
import DogContext from "../context/DogContext";

function ShowDog() {
  const { dogName } = useContext(DogContext);
  return <h2>My Dog’s Name is: {dogName}</h2>;
}

export default ShowDog;
