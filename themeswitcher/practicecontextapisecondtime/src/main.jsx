import ReactDOM from "react-dom/client";
import App from "./App";
import DogProvider from "./context/contextProvider";

ReactDOM.createRoot(document.getElementById("root")).render(
  <DogProvider>
    <App />
  </DogProvider>
);
