<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <title>Resultado</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="alert alert-success">

        <h2>Alerta registrada correctamente</h2>

        <hr>

        <p><strong>Nombre:</strong> ${nombre}</p>

        <p><strong>Tipo:</strong> ${tipo}</p>

        <p><strong>Descripción:</strong> ${descripcion}</p>

        <p><strong>Ubicación:</strong> ${ubicacion}</p>

    </div>

</div>

</body>
</html>