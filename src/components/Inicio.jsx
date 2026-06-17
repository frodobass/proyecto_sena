import { Link } from "react-router-dom";

// Componente de inicio del sistema
function Inicio() {
  return (
    <div className="container mt-5 text-center">

      <h1>Sistema de Seguridad Vecinal</h1>

      <p>Bienvenido al sistema de alertas comunitarias.</p>

      <Link
        to="/alerta"
        className="btn btn-primary"
      >
        Registrar Alerta
      </Link>

    </div>
  );
}

export default Inicio;