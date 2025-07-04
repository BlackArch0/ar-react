import { useContext } from "react";
import DogContext from "../context/DogContext";

function ChangeDog() {
  const { setDogName } = useContext(DogContext);

  return (
    <button onClick={() => setDogName("Bruno")}>
      Change Dog’s Name to Bruno
    </button>
  );
}

export default ChangeDog;
