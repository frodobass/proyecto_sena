import { BrowserRouter, Routes, Route } from "react-router-dom";

// Configuración de rutas de la aplicación
import Inicio from "./components/Inicio.jsx";
import RegistroAlerta from "./components/RegistroAlerta.jsx";
import Confirmacion from "./components/Confirmacion.jsx";

function App() {
  return (
    <BrowserRouter>

      <Routes>

        <Route
          path="/"
          element={<Inicio />}
        />

        <Route
          path="/alerta"
          element={<RegistroAlerta />}
        />

        <Route
          path="/confirmacion"
          element={<Confirmacion />}
        />

      </Routes>

    </BrowserRouter>
  );
}

export default App;