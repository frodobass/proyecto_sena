import { Link } from "react-router-dom";

// Pantalla de confirmación
function Confirmacion() {
  return (
    <div className="container mt-5 text-center">

      <h1>✅ Alerta registrada correctamente</h1>

      <Link
        to="/"
        className="btn btn-success mt-3"
      >
        Volver al inicio
      </Link>

    </div>
  );
}

export default Confirmacion;