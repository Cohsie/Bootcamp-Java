const usuario = "Pedro";

function loginUsuario(usuario) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(usuario);
        }, 1000);
    });
}

const perfil = {
    nombre: "Ana",
    rol: "admin"
};

function obtenerPerfil(perfil) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(perfil);
        }, 1000);
    });
}

function mostrarDashboard(perfil) {
    return new Promise((resolve, reject) => {
        resolve(`Bienvenida, ${perfil.nombre} (${perfil.rol})`);
    });
}

async function iniciarApp() {
    try {
        const usuarioLogueado = await loginUsuario(usuario);
        console.log("Usuario logueado:", usuarioLogueado);

        const datosPerfil = await obtenerPerfil(perfil);
        const mensaje = await mostrarDashboard(datosPerfil);
        console.log(mensaje);
    } catch (error) {
        console.error("Error:", error);
    }
}

iniciarApp();
