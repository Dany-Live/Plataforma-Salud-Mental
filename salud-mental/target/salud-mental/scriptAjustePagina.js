/*
    * Script para ajustar el tamaño de la pagina HTML
*/

function mostrarTamaño() 
{
    let width = window.innerWidth, height = window.innerHeight;
    document.getElementById("size").textContent = `Ancho: ${width}px, Alto: ${height}px`;

    document.body.style.backgroundSize = `${width}px ${height}px`
}
mostrarTamaño();
window.addEventListener("resize", mostrarTamaño);