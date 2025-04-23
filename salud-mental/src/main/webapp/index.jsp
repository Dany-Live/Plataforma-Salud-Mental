<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Salud Mental</title>
</head>
<body>
    <h1>Proyecto Salud Mental</h1>
    <button onclick="fetchData()">Obtener datos</button>
    <div id="result"></div>

    <script>
        async function fetchData() 
        {
            const response = await fetch('api/salud');
            const text = await response.text();
            document.getElementById('result').innerHTML = text;
        }
    </script>
</body>
</html>