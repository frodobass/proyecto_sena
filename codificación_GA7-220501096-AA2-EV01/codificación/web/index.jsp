<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <title>Registro de Alertas</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow">

        <div class="card-header bg-primary text-white">
            <h2>Registro de Alerta Comunitaria</h2>
        </div>

        <div class="card-body">

            <!-- Formulario -->
            <form action="AlertaServlet" method="post">

                <!-- Nombre -->
                <div class="mb-3">

                    <label class="form-label">
                        Nombre
                    </label>

                    <input type="text"
                           name="nombre"
                           class="form-control"
                           minlength="3"
                           maxlength="40"
                           pattern="[A-Za-z ]+"
                           required>

                </div>

                <!-- Tipo -->
                <div class="mb-3">

                    <label class="form-label">
                        Tipo de alerta
                    </label>

                    <input type="text"
                           name="tipo"
                           class="form-control"
                           minlength="3"
                           maxlength="30"
                           required>

                </div>

                <!-- Descripción -->
                <div class="mb-3">

                    <label class="form-label">
                        Descripción
                    </label>

                    <textarea name="descripcion"
                              class="form-control"
                              maxlength="300"
                              required></textarea>

                </div>

                <!-- Ubicación -->
                <div class="mb-3">

                    <label class="form-label">
                        Ubicación
                    </label>

                    <input type="text"
                           name="ubicacion"
                           class="form-control"
                           minlength="3"
                           maxlength="50"
                           required>

                </div>

                <!-- Botón -->
                <button type="submit"
                        class="btn btn-success">

                    Enviar Alerta

                </button>

            </form>

        </div>

    </div>

</div>

</body>
</html>