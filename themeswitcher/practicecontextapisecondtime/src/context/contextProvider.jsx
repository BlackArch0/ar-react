import { useState } from "react";
import DogContext from "./DogContext";

function DogProvider({ children }) {
  const [dogName, setDogName] = useState("Tommy");

  return (
    <DogContext.Provider value={{ dogName, setDogName }}>
      {children}
    </DogContext.Provider>
  );
}

export default DogProvider;
