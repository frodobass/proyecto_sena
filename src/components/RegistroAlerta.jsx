import { useNavigate } from "react-router-dom";

// Formulario para registrar alertas comunitarias
function RegistroAlerta() {

  const navigate = useNavigate();

  const enviarFormulario = (e) => {

    e.preventDefault();

    alert("Alerta registrada correctamente");

    navigate("/confirmacion");
  };

  return (
    <div className="container mt-5">

      <div className="card shadow">

        <div className="card-header bg-primary text-white">
          <h2>Registro de Alerta</h2>
        </div>

        <div className="card-body">

          <form onSubmit={enviarFormulario}>

            <div className="mb-3">
              <label>Nombre</label>

              <input
                type="text"
                className="form-control"
                required
              />
            </div>

            <div className="mb-3">
              <label>Tipo de alerta</label>

              <input
                type="text"
                className="form-control"
                required
              />
            </div>

            <div className="mb-3">
              <label>Descripción</label>

              <textarea
                className="form-control"
                required
              ></textarea>
            </div>

            <div className="mb-3">
              <label>Ubicación</label>

              <input
                type="text"
                className="form-control"
                required
              />
            </div>

            <button
              type="submit"
              className="btn btn-success"
            >
              Registrar Alerta
            </button>

          </form>

        </div>

      </div>

    </div>
  );
}

export default RegistroAlerta;